package org.jfree.chart.plot;

import org.junit.Test;
import org.jfree.chart.util.ObjectList;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.io.ObjectOutputStream;
import java.awt.Paint;
import org.jfree.data.general.CombinedDataset;
import org.jfree.data.general.DatasetGroup;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.data.Range;
import java.awt.Font;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.renderer.xy.XYAreaRenderer2;
import org.jfree.chart.axis.AxisSpace;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.HashMap;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.data.RangeType;
import org.jfree.chart.axis.NumberTickUnit;
import java.text.NumberFormat;
import org.jfree.chart.axis.MarkerAxisBand;
import java.awt.Shape;
import org.jfree.chart.axis.TickUnitSource;
import java.awt.Stroke;
import javax.swing.event.EventListenerList;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.chart.renderer.xy.YIntervalRenderer;
import org.jfree.chart.util.Layer;
import java.util.LinkedHashMap;
import java.awt.geom.Point2D;
import org.jfree.chart.annotations.XYImageAnnotation;
import org.jfree.experimental.chart.annotations.XYTitleAnnotation;
import org.jfree.data.general.DatasetChangeEvent;
import java.util.Collection;
import java.awt.Rectangle;
import org.jfree.chart.LegendItemCollection;
import org.jfree.data.time.Year;
import java.awt.geom.Rectangle2D;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_jfree_chart_plot_XYPlotTest {
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.equals(xYPlot);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYPlot)): False}
 * @utbot.executesCondition {@code (this.weight != that.weight): True}
 *  */
    @Test
    public void testEquals_ThisWeightNotEqualsThatWeight() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setWeight(-255);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        boolean actual = xYPlot.equals(combinedDomainXYPlot);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYPlot)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfXYPlot() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYPlot)): False}
 * @utbot.executesCondition {@code (this.weight != that.weight): False}
 * @utbot.executesCondition {@code (this.orientation != that.orientation): True}
 *  */
    @Test
    public void testEquals_ThisOrientationNotEqualsThatOrientation() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        xYPlot.setOrientation(orientation);
        xYPlot.setWeight(1);
        CombinedRangeXYPlot combinedRangeXYPlot = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        combinedRangeXYPlot.setWeight(1);
        
        boolean actual = xYPlot.equals(combinedRangeXYPlot);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYPlot)): False}
 * @utbot.executesCondition {@code (this.weight != that.weight): False}
 * @utbot.executesCondition {@code (this.orientation != that.orientation): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.domainAxes.equals(that.domainAxes)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setWeight(-255);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        combinedDomainXYPlot.setWeight(-255);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.equals(XYPlot.java:4721) */
        xYPlot.equals(combinedDomainXYPlot);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clone()}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYPlot clone = (XYPlot) super.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#indexOf(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testIndexOf_IterateForLoop() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.indexOf(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#indexOf(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testIndexOf_DatasetEqualsThisDatasetsGet() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.indexOf(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#indexOf(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.indexOf] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.indexOf(XYPlot.java:1335) */
        xYPlot.indexOf(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testIndexOf1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Object overwriteDataSet = createInstance("org.jfree.chart.renderer.xy.CyclicXYItemRenderer$OverwriteDataSet");
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class overwriteDataSetType = Class.forName("org.jfree.data.xy.XYDataset");
        Method indexOfMethod = xYPlotClazz.getDeclaredMethod("indexOf", overwriteDataSetType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = overwriteDataSet;
        int actual = ((Integer) indexOfMethod.invoke(xYPlot, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testIndexOf2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.indexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.indexOf(XYPlot.java:1336) */
        xYPlot.indexOf(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getAnnotations
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAnnotations()
    
    @Test
    public void testGetAnnotations1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList annotations = new ArrayList();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "annotations", annotations);
        
        ArrayList actual = ((ArrayList) xYPlot.getAnnotations());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.readObject(XYPlot.java:5006) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = xYPlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(xYPlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = xYPlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(xYPlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = xYPlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(xYPlot, readObjectMethodArguments);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.writeObject(XYPlot.java:4974) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = xYPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(xYPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = xYPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(xYPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    @Test(expected = NotActiveException.class)
    public void testWriteObject1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = xYPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(xYPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.render
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#render(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState)}
 * @utbot.executesCondition {@code (!DatasetUtilities.isEmptyOrNull(dataset)): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return foundData;}
 *  */
    @Test
    public void testRender_DatasetUtilitiesIsEmptyOrNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        boolean actual = xYPlot.render(null, null, -255, null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)
    
    @Test
    public void testRender1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        boolean actual = xYPlot.render(null, null, Integer.MIN_VALUE, null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for render
    
    public void testRender_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeTickBandPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeTickBandPaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeTickBandPaint()}
 * @utbot.returnsFrom {@code return this.rangeTickBandPaint;}
 *  */
    @Test
    public void testGetRangeTickBandPaint_ReturnThisRangeTickBandPaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getRangeTickBandPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainTickBandPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainTickBandPaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainTickBandPaint()}
 * @utbot.returnsFrom {@code return this.domainTickBandPaint;}
 *  */
    @Test
    public void testGetDomainTickBandPaint_ReturnThisDomainTickBandPaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getDomainTickBandPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeZeroBaselineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeZeroBaselineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeZeroBaselineStroke(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke
    
    ///region Errors report for getRangeZeroBaselineStroke
    
    public void testGetRangeZeroBaselineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeZeroBaselinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeZeroBaselinePaint()}
 * @utbot.returnsFrom {@code return this.rangeZeroBaselinePaint;}
 *  */
    @Test
    public void testGetRangeZeroBaselinePaint_ReturnThisRangeZeroBaselinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getRangeZeroBaselinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeZeroBaselinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeZeroBaselinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeZeroBaselinePaint(null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method setRangeZeroBaselinePaint(java.awt.Paint)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.XYPlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeZeroBaselinePaint(java.awt.Paint)}
     */
    @Test(timeout = 1000L)
    public void testSetRangeZeroBaselinePaint() {
        CombinedDataset combinedDataset = new CombinedDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        combinedDataset.setGroup(datasetGroup);
        PeriodAxis periodAxis = new PeriodAxis("Null 'paint' argument.");
        periodAxis.setLowerMargin(java.lang.Double.NaN);
        periodAxis.setRightArrow(null);
        periodAxis.setUpperMargin(1.0);
        periodAxis.setTickMarkInsideLength(java.lang.Float.POSITIVE_INFINITY);
        periodAxis.setTickMarkOutsideLength(java.lang.Float.POSITIVE_INFINITY);
        org.jfree.chart.axis.PeriodAxisLabelInfo[] periodAxisLabelInfoArray = {null, null, null, null, null};
        periodAxis.setLabelInfo(periodAxisLabelInfoArray);
        Range range = new Range(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        periodAxis.setRange(range);
        Font font = new Font("", -1, 1);
        periodAxis.setLabelFont(font);
        periodAxis.setLeftArrow(null);
        periodAxis.setLabelPaint(null);
        DateAxis dateAxis = new DateAxis("XZ");
        dateAxis.setLowerMargin(java.lang.Double.NaN);
        dateAxis.setTickMarkOutsideLength(java.lang.Float.POSITIVE_INFINITY);
        dateAxis.setTimeZone(null);
        dateAxis.setLabelToolTip("XZ");
        dateAxis.setStandardTickUnits(null);
        dateAxis.setTickMarkStroke(null);
        dateAxis.setLeftArrow(null);
        Font font1 = new Font("", -1, -1);
        dateAxis.setLabelFont(font1);
        Range range1 = new Range(-1.0, java.lang.Double.NaN);
        dateAxis.setRange(range1);
        dateAxis.setLabelURL("XZ");
        XYAreaRenderer2 xYAreaRenderer2 = new XYAreaRenderer2(null, null);
        xYAreaRenderer2.setBaseSeriesVisibleInLegend(false);
        xYAreaRenderer2.setLegendItemURLGenerator(null);
        xYAreaRenderer2.setBaseToolTipGenerator(null);
        xYAreaRenderer2.setLegendItemToolTipGenerator(null);
        xYAreaRenderer2.setAutoPopulateSeriesFillPaint(true);
        xYAreaRenderer2.setAutoPopulateSeriesShape(true);
        xYAreaRenderer2.setLegendItemLabelGenerator(null);
        xYAreaRenderer2.setDefaultEntityRadius(0);
        xYAreaRenderer2.setBaseOutlinePaint(null);
        xYAreaRenderer2.setBaseURLGenerator(null);
        XYPlot xYPlot = new XYPlot(combinedDataset, periodAxis, dateAxis, xYAreaRenderer2);
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN);
        xYPlot.setBackgroundAlpha(java.lang.Float.NEGATIVE_INFINITY);
        AxisSpace axisSpace = new AxisSpace();
        axisSpace.setTop(-1.0);
        axisSpace.setBottom(java.lang.Double.NEGATIVE_INFINITY);
        axisSpace.setLeft(java.lang.Double.NaN);
        axisSpace.setRight(java.lang.Double.POSITIVE_INFINITY);
        xYPlot.setFixedDomainAxisSpace(axisSpace);
        xYPlot.setNoDataMessage("Null 'paint' argument.");
        Color color = new Color(-1.0f, java.lang.Float.NaN, 0.0f);
        xYPlot.setNoDataMessagePaint(color);
        float[] floatArray = {java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY, 1.0f};
        BasicStroke basicStroke = new BasicStroke(java.lang.Float.NaN, -1, Integer.MIN_VALUE, 1.0f, floatArray, 0.25f);
        xYPlot.setRangeCrosshairStroke(basicStroke);
        xYPlot.setBackgroundImageAlignment(-1);
        HashMap hashMap = new HashMap();
        Font font2 = new Font(hashMap);
        xYPlot.setNoDataMessageFont(font2);
        MeterPlot meterPlot = new MeterPlot(null);
        meterPlot.setTickLabelsVisible(true);
        meterPlot.setUnits("XZ");
        meterPlot.setForegroundAlpha(0.0f);
        meterPlot.setNeedlePaint(null);
        Font font3 = new Font("10", Integer.MIN_VALUE, 0);
        meterPlot.setTickLabelFont(font3);
        meterPlot.setValuePaint(null);
        meterPlot.setBackgroundPaint(null);
        meterPlot.setOutlineStroke(null);
        meterPlot.setDialBackgroundPaint(null);
        meterPlot.setDialOutlinePaint(null);
        xYPlot.setParent(meterPlot);
        BasicStroke basicStroke1 = new BasicStroke(-1.0f, -1, 0);
        xYPlot.setDomainZeroBaselineStroke(basicStroke1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        xYPlot.setRangeZeroBaselinePaint(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearDomainAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testClearDomainAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.clearDomainAxes(XYPlot.java:846) */
        xYPlot.clearDomainAxes();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearDomainAxes()
    
    @Test
    public void testClearDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainAxes(XYPlot.java:853) */
        xYPlot.clearDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getAxisOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAxisOffset()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getAxisOffset()}
 * @utbot.returnsFrom {@code return this.axisOffset;}
 *  */
    @Test
    public void testGetAxisOffset_ReturnThisAxisOffset() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        RectangleInsets actual = xYPlot.getAxisOffset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis()}
 * @utbot.returnsFrom {@code return getRangeAxis(0);}
 *  */
    @Test
    public void testGetRangeAxis_ReturnGetRangeAxis() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis()}
 * @utbot.returnsFrom {@code return getRangeAxis(0);}
 *  */
    @Test
    public void testGetRangeAxis_ReturnGetRangeAxis_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        objects[0] = ((Object) numberAxis3D);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        NumberAxis3D actual = ((NumberAxis3D) xYPlot.getRangeAxis());
        
        RangeType actualRangeType = actual.getRangeType();
        assertNull(actualRangeType);
        
        boolean actualAutoRangeIncludesZero = actual.getAutoRangeIncludesZero();
        assertFalse(actualAutoRangeIncludesZero);
        
        boolean actualAutoRangeStickyZero = actual.getAutoRangeStickyZero();
        assertFalse(actualAutoRangeStickyZero);
        
        NumberTickUnit actualTickUnit = actual.getTickUnit();
        assertNull(actualTickUnit);
        
        NumberFormat actualNumberFormatOverride = actual.getNumberFormatOverride();
        assertNull(actualNumberFormatOverride);
        
        MarkerAxisBand actualMarkerBand = actual.getMarkerBand();
        assertNull(actualMarkerBand);
        
        boolean actualPositiveArrowVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "positiveArrowVisible"));
        assertFalse(actualPositiveArrowVisible);
        
        boolean actualNegativeArrowVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "negativeArrowVisible"));
        assertFalse(actualNegativeArrowVisible);
        
        Shape actualUpArrow = actual.getUpArrow();
        assertNull(actualUpArrow);
        
        Shape actualDownArrow = actual.getDownArrow();
        assertNull(actualDownArrow);
        
        Shape actualLeftArrow = actual.getLeftArrow();
        assertNull(actualLeftArrow);
        
        Shape actualRightArrow = actual.getRightArrow();
        assertNull(actualRightArrow);
        
        boolean actualInverted = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "inverted"));
        assertFalse(actualInverted);
        
        Range actualRange = actual.getRange();
        assertNull(actualRange);
        
        boolean actualAutoRange = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoRange"));
        assertFalse(actualAutoRange);
        
        double numberAxis3DAutoRangeMinimumSize = numberAxis3D.getAutoRangeMinimumSize();
        double actualAutoRangeMinimumSize = actual.getAutoRangeMinimumSize();
        org.junit.Assert.assertEquals(numberAxis3DAutoRangeMinimumSize, actualAutoRangeMinimumSize, 1.0E-6);
        
        Range actualDefaultAutoRange = actual.getDefaultAutoRange();
        assertNull(actualDefaultAutoRange);
        
        double numberAxis3DUpperMargin = numberAxis3D.getUpperMargin();
        double actualUpperMargin = actual.getUpperMargin();
        org.junit.Assert.assertEquals(numberAxis3DUpperMargin, actualUpperMargin, 1.0E-6);
        
        double numberAxis3DLowerMargin = numberAxis3D.getLowerMargin();
        double actualLowerMargin = actual.getLowerMargin();
        org.junit.Assert.assertEquals(numberAxis3DLowerMargin, actualLowerMargin, 1.0E-6);
        
        double numberAxis3DFixedAutoRange = numberAxis3D.getFixedAutoRange();
        double actualFixedAutoRange = actual.getFixedAutoRange();
        org.junit.Assert.assertEquals(numberAxis3DFixedAutoRange, actualFixedAutoRange, 1.0E-6);
        
        boolean actualAutoTickUnitSelection = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoTickUnitSelection"));
        assertFalse(actualAutoTickUnitSelection);
        
        TickUnitSource actualStandardTickUnits = actual.getStandardTickUnits();
        assertNull(actualStandardTickUnits);
        
        int numberAxis3DAutoTickIndex = ((Integer) getFieldValue(numberAxis3D, "org.jfree.chart.axis.ValueAxis", "autoTickIndex"));
        int actualAutoTickIndex = ((Integer) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoTickIndex"));
        assertEquals(numberAxis3DAutoTickIndex, actualAutoTickIndex);
        
        boolean actualVerticalTickLabels = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "verticalTickLabels"));
        assertFalse(actualVerticalTickLabels);
        
        boolean actualVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "visible"));
        assertFalse(actualVisible);
        
        String actualLabel = actual.getLabel();
        assertNull(actualLabel);
        
        Font actualLabelFont = actual.getLabelFont();
        assertNull(actualLabelFont);
        
        Paint actualLabelPaint = actual.getLabelPaint();
        assertNull(actualLabelPaint);
        
        RectangleInsets actualLabelInsets = actual.getLabelInsets();
        assertNull(actualLabelInsets);
        
        double numberAxis3DLabelAngle = numberAxis3D.getLabelAngle();
        double actualLabelAngle = actual.getLabelAngle();
        org.junit.Assert.assertEquals(numberAxis3DLabelAngle, actualLabelAngle, 1.0E-6);
        
        String actualLabelToolTip = actual.getLabelToolTip();
        assertNull(actualLabelToolTip);
        
        String actualLabelURL = actual.getLabelURL();
        assertNull(actualLabelURL);
        
        boolean actualAxisLineVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "axisLineVisible"));
        assertFalse(actualAxisLineVisible);
        
        Stroke actualAxisLineStroke = actual.getAxisLineStroke();
        assertNull(actualAxisLineStroke);
        
        Paint actualAxisLinePaint = actual.getAxisLinePaint();
        assertNull(actualAxisLinePaint);
        
        boolean actualTickLabelsVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
        assertFalse(actualTickLabelsVisible);
        
        Font actualTickLabelFont = actual.getTickLabelFont();
        assertNull(actualTickLabelFont);
        
        Paint actualTickLabelPaint = actual.getTickLabelPaint();
        assertNull(actualTickLabelPaint);
        
        RectangleInsets actualTickLabelInsets = actual.getTickLabelInsets();
        assertNull(actualTickLabelInsets);
        
        boolean actualTickMarksVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
        assertFalse(actualTickMarksVisible);
        
        float numberAxis3DTickMarkInsideLength = numberAxis3D.getTickMarkInsideLength();
        float actualTickMarkInsideLength = actual.getTickMarkInsideLength();
        org.junit.Assert.assertEquals(numberAxis3DTickMarkInsideLength, actualTickMarkInsideLength, 1.0E-6f);
        
        float numberAxis3DTickMarkOutsideLength = numberAxis3D.getTickMarkOutsideLength();
        float actualTickMarkOutsideLength = actual.getTickMarkOutsideLength();
        org.junit.Assert.assertEquals(numberAxis3DTickMarkOutsideLength, actualTickMarkOutsideLength, 1.0E-6f);
        
        Stroke actualTickMarkStroke = actual.getTickMarkStroke();
        assertNull(actualTickMarkStroke);
        
        Paint actualTickMarkPaint = actual.getTickMarkPaint();
        assertNull(actualTickMarkPaint);
        
        double numberAxis3DFixedDimension = numberAxis3D.getFixedDimension();
        double actualFixedDimension = actual.getFixedDimension();
        org.junit.Assert.assertEquals(numberAxis3DFixedDimension, actualFixedDimension, 1.0E-6);
        
        Plot actualPlot = actual.getPlot();
        assertNull(actualPlot);
        
        EventListenerList actualListenerList = ((EventListenerList) getFieldValue(actual, "org.jfree.chart.axis.Axis", "listenerList"));
        assertNull(actualListenerList);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getRangeAxis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getRangeAxis(0);
 *  */
    @Test
    public void testGetRangeAxis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1058)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962) */
        xYPlot.getRangeAxis();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    @Test
    public void testGetRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis()
    
    @Test
    public void testGetRangeAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1058)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962) */
        xYPlot.getRangeAxis();
    }
    
    @Test
    public void testGetRangeAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962) */
        xYPlot.getRangeAxis();
    }
    
    @Test
    public void testGetRangeAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962) */
        xYPlot.getRangeAxis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_IndexGreaterOrEqualThisRangeAxesSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_IndexLessThanThisRangeAxesSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1058) */
        xYPlot.getRangeAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxes.size()
 *  */
    @Test
    public void testGetRangeAxis_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057) */
        xYPlot.getRangeAxis(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis(int)
    
    @Test
    public void testGetRangeAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064) */
        xYPlot.getRangeAxis(0);
    }
    
    @Test
    public void testGetRangeAxis6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064) */
        xYPlot.getRangeAxis(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1058)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, null);
    }
    
    @Test
    public void testSetRangeAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, logAxis);
    }
    
    @Test
    public void testSetRangeAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, null);
    }
    
    @Test
    public void testSetRangeAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1104)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, logAxis);
    }
    
    @Test
    public void testSetRangeAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, cyclicNumberAxis);
    }
    
    @Test
    public void testSetRangeAxis6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1080) */
        xYPlot.setRangeAxis(0, periodAxis);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.setRangeAxis(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetRangeAxis8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094) */
        xYPlot.setRangeAxis(Integer.MIN_VALUE, logAxis, false);
    }
    
    @Test
    public void testSetRangeAxis9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094) */
        xYPlot.setRangeAxis(0, logAxis, false);
    }
    
    @Test
    public void testSetRangeAxis10() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101) */
        xYPlot.setRangeAxis(0, numberAxis, false);
    }
    
    @Test
    public void testSetRangeAxis11() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101) */
        xYPlot.setRangeAxis(0, periodAxis, false);
    }
    
    @Test
    public void testSetRangeAxis12() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101) */
        xYPlot.setRangeAxis(0, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis13() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.setRangeAxis(Integer.MIN_VALUE, null, false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis14() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        xYPlot.setRangeAxis(Integer.MIN_VALUE, periodAxis, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis15() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3931)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3979)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:429)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:412)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:899)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:977) */
        xYPlot.setRangeAxis(numberAxis);
    }
    
    @Test
    public void testSetRangeAxis16() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:981) */
        xYPlot.setRangeAxis(periodAxis);
    }
    
    @Test
    public void testSetRangeAxis17() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:962)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:981) */
        xYPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis18() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:986) */
        xYPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis19() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:986) */
        xYPlot.setRangeAxis(numberAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisEdge
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge(1073741824);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisEdge(int)
    
    @Test
    public void testGetRangeAxisEdge5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1182)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1242) */
        xYPlot.getRangeAxisEdge(0);
    }
    
    @Test
    public void testGetRangeAxisEdge6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1003)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1185)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1242) */
        xYPlot.getRangeAxisEdge(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for getRangeAxisEdge
    
    public void testGetRangeAxisEdge_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisEdge()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisEdge()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1003)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1042) */
        xYPlot.getRangeAxisEdge();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisEdge()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Plot.resolveRangeAxisLocation(getRangeAxisLocation(), this.orientation);
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1003)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1042) */
        xYPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) rangeAxisLocations);
        objects[2] = ((Object) rangeAxisLocations);
        objects[3] = ((Object) rangeAxisLocations);
        objects[4] = ((Object) rangeAxisLocations);
        objects[5] = ((Object) rangeAxisLocations);
        objects[6] = ((Object) rangeAxisLocations);
        objects[7] = ((Object) rangeAxisLocations);
        objects[8] = ((Object) rangeAxisLocations);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region Errors report for getRangeAxisEdge
    
    public void testGetRangeAxisEdge_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisEdge
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisEdge(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisEdge(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisEdge(1073741824);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisEdge(int)
    
    @Test
    public void testGetDomainAxisEdge5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:882)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:942) */
        xYPlot.getDomainAxisEdge(0);
    }
    
    @Test
    public void testGetDomainAxisEdge6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:885)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:942) */
        xYPlot.getDomainAxisEdge(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for getDomainAxisEdge
    
    public void testGetDomainAxisEdge_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisEdge()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisEdge()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:824) */
        xYPlot.getDomainAxisEdge();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisEdge()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Plot.resolveDomainAxisLocation(getDomainAxisLocation(), this.orientation);
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:824) */
        xYPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///region Errors report for getDomainAxisEdge
    
    public void testGetDomainAxisEdge_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeAxes(org.jfree.chart.axis.ValueAxis[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < axes.length; i++)
 *  */
    @Test
    public void testSetRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1120) */
        xYPlot.setRangeAxes(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1058)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1121) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1123) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        xYPlot.setParent(parent);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = new org.jfree.chart.axis.ValueAxis[32];
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1064)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1094)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1121) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1121) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
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
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1101)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1121) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    ///endregion
    
    ///region Errors report for setRangeAxes
    
    public void testSetRangeAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.rangeAxes.size();}
 *  */
    @Test
    public void testGetRangeAxisCount_ObjectListSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        int actual = xYPlot.getRangeAxisCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rangeAxes.size();
 *  */
    @Test
    public void testGetRangeAxisCount_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisCount(XYPlot.java:1134) */
        xYPlot.getRangeAxisCount();
    }
    ///endregion
    
    ///region Errors report for getRangeAxisCount
    
    public void testGetRangeAxisCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setOrientation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): False}
 * @utbot.executesCondition {@code (orientation != this.orientation): False}
 *  */
    @Test
    public void testSetOrientation_OrientationEqualsThisOrientation() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        xYPlot.setOrientation(orientation);
        
        xYPlot.setOrientation(orientation);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: orientation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setOrientation(null);
    }
    ///endregion
    
    ///region Errors report for setOrientation
    
    public void testSetOrientation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.domainAxes.size();}
 *  */
    @Test
    public void testGetDomainAxisCount_ObjectListSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        int actual = xYPlot.getDomainAxisCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.domainAxes.size();
 *  */
    @Test
    public void testGetDomainAxisCount_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisCount(XYPlot.java:836) */
        xYPlot.getDomainAxisCount();
    }
    ///endregion
    
    ///region Errors report for getDomainAxisCount
    
    public void testGetDomainAxisCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearRangeAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ValueAxis axis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testClearRangeAxes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeAxes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1145) */
        xYPlot.clearRangeAxes();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testClearRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1144) */
        xYPlot.clearRangeAxes();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearRangeAxes()
    
    @Test
    public void testClearRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1151) */
        xYPlot.clearRangeAxes();
    }
    
    @Test
    public void testClearRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1151) */
        xYPlot.clearRangeAxes();
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
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
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(null);
    }
    
    @Test
    public void testSetDomainAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(periodAxis);
    }
    
    @Test
    public void testSetDomainAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(logAxis);
    }
    
    @Test
    public void testSetDomainAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(null);
    }
    
    @Test
    public void testSetDomainAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(null);
    }
    
    @Test
    public void testSetDomainAxis6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:754)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:716) */
        xYPlot.setDomainAxis(logAxis);
    }
    ///endregion
    
    ///region Errors report for setDomainAxis
    
    public void testSetDomainAxis_errors()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.setDomainAxis(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetDomainAxis8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, null);
    }
    
    @Test
    public void testSetDomainAxis9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, logAxis);
    }
    
    @Test
    public void testSetDomainAxis10() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, null);
    }
    
    @Test
    public void testSetDomainAxis11() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:754)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, logAxis);
    }
    
    @Test
    public void testSetDomainAxis12() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, cyclicNumberAxis);
    }
    
    @Test
    public void testSetDomainAxis13() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:730) */
        xYPlot.setDomainAxis(0, periodAxis);
    }
    ///endregion
    
    ///region Errors report for setDomainAxis
    
    public void testSetDomainAxis_errors1()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis14() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.setDomainAxis(Integer.MIN_VALUE, null, false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis15() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        xYPlot.setDomainAxis(Integer.MIN_VALUE, periodAxis, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetDomainAxis16() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744) */
        xYPlot.setDomainAxis(Integer.MIN_VALUE, logAxis, false);
    }
    
    @Test
    public void testSetDomainAxis17() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744) */
        xYPlot.setDomainAxis(0, logAxis, false);
    }
    
    @Test
    public void testSetDomainAxis18() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751) */
        xYPlot.setDomainAxis(0, null, false);
    }
    
    @Test
    public void testSetDomainAxis19() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751) */
        xYPlot.setDomainAxis(0, numberAxis, false);
    }
    
    @Test
    public void testSetDomainAxis20() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751) */
        xYPlot.setDomainAxis(0, periodAxis, false);
    }
    ///endregion
    
    ///region Errors report for setDomainAxis
    
    public void testSetDomainAxis_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setAxisOffset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAxisOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (offset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: offset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setAxisOffset(null);
    }
    ///endregion
    
    ///region Errors report for setAxisOffset
    
    public void testSetAxisOffset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainAxes(org.jfree.chart.axis.ValueAxis[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < axes.length; i++)
 *  */
    @Test
    public void testSetDomainAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:770) */
        xYPlot.setDomainAxes(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:771) */
        xYPlot.setDomainAxes(valueAxisArray);
    }
    
    @Test
    public void testSetDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:771) */
        xYPlot.setDomainAxes(valueAxisArray);
    }
    
    @Test
    public void testSetDomainAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = new org.jfree.chart.axis.ValueAxis[32];
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:744)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:771) */
        xYPlot.setDomainAxes(valueAxisArray);
    }
    
    @Test
    public void testSetDomainAxes4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
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
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:771) */
        xYPlot.setDomainAxes(valueAxisArray);
    }
    
    @Test
    public void testSetDomainAxes5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:751)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:771) */
        xYPlot.setDomainAxes(valueAxisArray);
    }
    ///endregion
    
    ///region Errors report for setDomainAxes
    
    public void testSetDomainAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getOrientation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOrientation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getOrientation()}
 * @utbot.returnsFrom {@code return this.orientation;}
 *  */
    @Test
    public void testGetOrientation_ReturnThisOrientation() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        PlotOrientation actual = xYPlot.getOrientation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getOrientation
    
    public void testGetOrientation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxis_IndexGreaterOrEqualThisDomainAxesSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        ValueAxis actual = xYPlot.getDomainAxis(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxis_IndexLessThanThisDomainAxesSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        ValueAxis actual = xYPlot.getDomainAxis(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (ValueAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testGetDomainAxis_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694) */
        xYPlot.getDomainAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxes.size()
 *  */
    @Test
    public void testGetDomainAxis_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693) */
        xYPlot.getDomainAxis(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxis(int)
    
    @Test
    public void testGetDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700) */
        xYPlot.getDomainAxis(0);
    }
    
    @Test
    public void testGetDomainAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700) */
        xYPlot.getDomainAxis(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for getDomainAxis
    
    public void testGetDomainAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxis()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.returnsFrom {@code return getDomainAxis(0);}
 *  */
    @Test
    public void testGetDomainAxis_XYPlotGetDomainAxis() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        ValueAxis actual = xYPlot.getDomainAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxis()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDomainAxis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getDomainAxis(0);
 *  */
    @Test
    public void testGetDomainAxis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679) */
        xYPlot.getDomainAxis();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxis()
    
    @Test
    public void testGetDomainAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        ValueAxis actual = xYPlot.getDomainAxis();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDomainAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        SymbolAxis symbolAxis = ((SymbolAxis) createInstance("org.jfree.chart.axis.SymbolAxis"));
        objects[0] = ((Object) symbolAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        SymbolAxis actual = ((SymbolAxis) xYPlot.getDomainAxis());
        
        // org.jfree.chart.axis.SymbolAxis has overridden equals method
        assertEquals(symbolAxis, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxis()
    
    @Test
    public void testGetDomainAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679) */
        xYPlot.getDomainAxis();
    }
    
    @Test
    public void testGetDomainAxis6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679) */
        xYPlot.getDomainAxis();
    }
    
    @Test
    public void testGetDomainAxis7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:700)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679) */
        xYPlot.getDomainAxis();
    }
    ///endregion
    
    ///region Errors report for getDomainAxis
    
    public void testGetDomainAxis_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setWeight
    
    ///region Errors report for setWeight
    
    public void testSetWeight_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getWeight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeight()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getWeight()}
 * @utbot.returnsFrom {@code return this.weight;}
 *  */
    @Test
    public void testGetWeight_ReturnThisWeight() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setWeight(-255);
        
        int actual = xYPlot.getWeight();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region Errors report for getWeight
    
    public void testGetWeight_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(int, org.jfree.data.xy.XYDataset)
    
    @Test
    public void testSetDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -2147483638);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1306) */
        xYPlot.setDataset(9, null);
    }
    
    @Test
    public void testSetDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1313) */
        xYPlot.setDataset(0, null);
    }
    
    @Test
    public void testSetDataset3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1313) */
        xYPlot.setDataset(0, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDataset(int, org.jfree.data.xy.XYDataset)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataset4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        xYPlot.setDataset(Integer.MIN_VALUE, null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testSetDataset5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1275)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1302)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1290) */
        xYPlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1275)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1302)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1290) */
        xYPlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1313)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1290) */
        xYPlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        DefaultXYDataset defaultXYDataset = new DefaultXYDataset();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1313)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1290) */
        xYPlot.setDataset(defaultXYDataset);
    }
    
    @Test
    public void testSetDataset9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1313)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1290) */
        xYPlot.setDataset(null);
    }
    ///endregion
    
    ///region Errors report for setDataset
    
    public void testSetDataset_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRenderer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenderer(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeLessOrEqualIndex() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeGreaterThanIndex() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenderer(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (XYItemRenderer) this.renderers.get(index);
 *  */
    @Test
    public void testGetRenderer_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399) */
        xYPlot.getRenderer(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.renderers.size() > index
 *  */
    @Test
    public void testGetRenderer_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1398) */
        xYPlot.getRenderer(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRenderer(int)
    
    @Test
    public void testGetRenderer1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getRenderer
    
    public void testGetRenderer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRenderer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenderer()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer()}
 * @utbot.returnsFrom {@code return getRenderer(0);}
 *  */
    @Test
    public void testGetRenderer_ReturnGetRenderer() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer()}
 * @utbot.returnsFrom {@code return getRenderer(0);}
 *  */
    @Test
    public void testGetRenderer_ReturnGetRenderer_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenderer()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRenderer(0);
 *  */
    @Test
    public void testGetRenderer_ThrowClassCastException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384) */
        xYPlot.getRenderer();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRenderer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRenderer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384) */
        xYPlot.getRenderer();
    }
    ///endregion
    
    ///region Errors report for getRenderer
    
    public void testGetRenderer_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testSetRenderer1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1443)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1428) */
        xYPlot.setRenderer(1073741824, null);
    }
    
    @Test
    public void testSetRenderer2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1452)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1428) */
        xYPlot.setRenderer(0, null);
    }
    ///endregion
    
    ///region Errors report for setRenderer
    
    public void testSetRenderer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testSetRenderer3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1443)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1428)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1415) */
        xYPlot.setRenderer(null);
    }
    
    @Test
    public void testSetRenderer4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1452)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1428)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1415) */
        xYPlot.setRenderer(null);
    }
    
    @Test
    public void testSetRenderer5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1452)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1428)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1415) */
        xYPlot.setRenderer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)
    
    @Test
    public void testSetRenderer6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1443) */
        xYPlot.setRenderer(0, null, false);
    }
    
    @Test
    public void testSetRenderer7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        XYStepRenderer xYStepRenderer = ((XYStepRenderer) createInstance("org.jfree.chart.renderer.xy.XYStepRenderer"));
        objects[0] = ((Object) xYStepRenderer);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        XYDotRenderer xYDotRenderer = ((XYDotRenderer) createInstance("org.jfree.chart.renderer.xy.XYDotRenderer"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.removeChangeListener(AbstractRenderer.java:2402)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1445) */
        xYPlot.setRenderer(0, xYDotRenderer, false);
    }
    
    @Test
    public void testSetRenderer8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        XYDotRenderer xYDotRenderer = ((XYDotRenderer) createInstance("org.jfree.chart.renderer.xy.XYDotRenderer"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.addChangeListener(AbstractRenderer.java:2387)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1450) */
        xYPlot.setRenderer(0, xYDotRenderer, false);
    }
    ///endregion
    
    ///region Errors report for setRenderer
    
    public void testSetRenderer_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.configureRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureRangeAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testConfigureRangeAxes_IterateForLoop() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.configureRangeAxes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method configureRangeAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis axis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureRangeAxes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1161) */
        xYPlot.configureRangeAxes();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1160) */
        xYPlot.configureRangeAxes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method configureRangeAxes()
    
    @Test
    public void testConfigureRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.configureRangeAxes();
    }
    
    @Test
    public void testConfigureRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.configureRangeAxes();
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeLessOrEqualIndex() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeGreaterThanIndex() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.datasets.size() > index
 *  */
    @Test
    public void testGetDataset_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1274) */
        xYPlot.getDataset(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    @Test
    public void testGetDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset(Integer.MIN_VALUE);
        
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset()}
 * @utbot.returnsFrom {@code return getDataset(0);}
 *  */
    @Test
    public void testGetDataset_ReturnGetDataset() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset()}
 * @utbot.returnsFrom {@code return getDataset(0);}
 *  */
    @Test
    public void testGetDataset_ReturnGetDataset_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataset()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataset(0);
 *  */
    @Test
    public void testGetDataset_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataset] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1275)
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1260) */
        xYPlot.getDataset();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDataset()
    
    @Test
    public void testGetDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1275)
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1260) */
        xYPlot.getDataset();
    }
    ///endregion
    
    ///region Errors report for getDataset
    
    public void testGetDataset_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.datasets.size();}
 *  */
    @Test
    public void testGetDatasetCount_ObjectListSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.getDatasetCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDatasetCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.datasets.size();
 *  */
    @Test
    public void testGetDatasetCount_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetCount(XYPlot.java:1322) */
        xYPlot.getDatasetCount();
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        int actual = xYPlot.getIndexOf(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf_2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        XYStepRenderer xYStepRenderer = ((XYStepRenderer) createInstance("org.jfree.chart.renderer.xy.XYStepRenderer"));
        
        int actual = xYPlot.getIndexOf(xYStepRenderer);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        int actual = xYPlot.getIndexOf(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.XYPlot.getIndexOf(XYPlot.java:1539) */
        xYPlot.getIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getIndexOf] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getIndexOf(XYPlot.java:1539) */
        xYPlot.getIndexOf(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testGetIndexOf1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        YIntervalRenderer yIntervalRenderer = ((YIntervalRenderer) createInstance("org.jfree.chart.renderer.xy.YIntervalRenderer"));
        
        int actual = xYPlot.getIndexOf(yIntervalRenderer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.xy.XYItemRenderer;)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < renderers.length; i++)
 *  */
    @Test
    public void testSetRenderers_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1466) */
        xYPlot.setRenderers(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.xy.XYItemRenderer;)
    
    @Test
    public void testSetRenderers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray = {};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1469) */
        xYPlot.setRenderers(xYItemRendererArray);
    }
    
    @Test
    public void testSetRenderers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1452)
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1467) */
        xYPlot.setRenderers(xYItemRendererArray);
    }
    
    @Test
    public void testSetRenderers3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1452)
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1467) */
        xYPlot.setRenderers(xYItemRendererArray);
    }
    ///endregion
    
    ///region Errors report for setRenderers
    
    public void testSetRenderers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.Marker)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(org.jfree.chart.plot.Marker)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#addDomainMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.addDomainMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testAddDomainMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Marker.addChangeListener(Marker.java:534)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2214)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2085)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2069) */
            xYPlot.addDomainMarker(intervalMarker);
        } finally {
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
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): False}
 * @utbot.executesCondition {@code (layer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: layer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        xYPlot.addDomainMarker(-255, intervalMarker, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: marker == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addDomainMarker(-255, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testAddDomainMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2197) */
            xYPlot.addDomainMarker(0, intervalMarker, foreground, false);
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2206) */
            xYPlot.addDomainMarker(0, intervalMarker, background, false);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
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
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_11() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        xYPlot.addDomainMarker(-255, intervalMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addDomainMarker(-255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddDomainMarker4() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Marker.addChangeListener(Marker.java:534)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2214)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169) */
            xYPlot.addDomainMarker(0, intervalMarker, layer);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddDomainMarker5() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2197)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169) */
            xYPlot.addDomainMarker(0, intervalMarker, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddDomainMarker6() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2206)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169) */
            xYPlot.addDomainMarker(0, intervalMarker, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addDomainMarker
    
    public void testAddDomainMarker_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        xYPlot.addDomainMarker(intervalMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_12() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addDomainMarker(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddDomainMarker7() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2197)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2085) */
            xYPlot.addDomainMarker(intervalMarker, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddDomainMarker8() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2206)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2169)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2085) */
            xYPlot.addDomainMarker(intervalMarker, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addDomainMarker
    
    public void testAddDomainMarker_errors3()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setQuadrantOrigin
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setQuadrantOrigin(java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setQuadrantOrigin(java.awt.geom.Point2D)}
 * @utbot.executesCondition {@code (origin == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: origin == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantOrigin_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setQuadrantOrigin(null);
    }
    ///endregion
    
    ///region Errors report for setQuadrantOrigin
    
    public void testSetQuadrantOrigin_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getQuadrantOrigin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuadrantOrigin()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantOrigin()}
 * @utbot.returnsFrom {@code return this.quadrantOrigin;}
 *  */
    @Test
    public void testGetQuadrantOrigin_ReturnThisQuadrantOrigin() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Point2D actual = xYPlot.getQuadrantOrigin();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getQuadrantOrigin
    
    public void testGetQuadrantOrigin_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2286) */
            xYPlot.removeDomainMarker(-255, null, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testRemoveDomainMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2293) */
            xYPlot.removeDomainMarker(0, valueMarker, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveDomainMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2290) */
            xYPlot.removeDomainMarker(0, null, null, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeDomainMarker
    
    public void testRemoveDomainMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2293)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2265)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2248) */
            xYPlot.removeDomainMarker(intervalMarker, layer);
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2286)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2265)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2248) */
            xYPlot.removeDomainMarker(null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeDomainMarker
    
    public void testRemoveDomainMarker_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker5() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2293)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2265) */
            xYPlot.removeDomainMarker(0, valueMarker, layer);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveDomainMarker6() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2286)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2265) */
            xYPlot.removeDomainMarker(0, null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeDomainMarker
    
    public void testRemoveDomainMarker_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2293)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2265)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2248)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2232) */
            xYPlot.removeDomainMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeDomainMarker
    
    public void testRemoveDomainMarker_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testAddRangeMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2412)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2374)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2328)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2312) */
            xYPlot.addRangeMarker(null);
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
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddRangeMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2395)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2374) */
            xYPlot.addRangeMarker(0, null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddRangeMarker3() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2404)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2374) */
            xYPlot.addRangeMarker(0, null, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
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
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testAddRangeMarker4() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2412) */
            xYPlot.addRangeMarker(0, null, null, false);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddRangeMarker5() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2395) */
            xYPlot.addRangeMarker(0, null, foreground, false);
        } finally {
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
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddRangeMarker6() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2395)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2374)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2328) */
            xYPlot.addRangeMarker(null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddRangeMarker7() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2404)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2374)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2328) */
            xYPlot.addRangeMarker(null, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addRangeMarker
    
    public void testAddRangeMarker_errors3()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeRangeMarker
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testRemoveRangeMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2522)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2498)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2481)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2465) */
            xYPlot.removeRangeMarker(valueMarker);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeRangeMarker
    
    public void testRemoveRangeMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return removeRangeMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeRangeMarker(-255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveRangeMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2522)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2498) */
            xYPlot.removeRangeMarker(0, categoryMarker, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeRangeMarker
    
    public void testRemoveRangeMarker_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: marker == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeRangeMarker(-255, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testRemoveRangeMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2526) */
            xYPlot.removeRangeMarker(0, intervalMarker, null, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveRangeMarker4() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2522) */
            xYPlot.removeRangeMarker(0, intervalMarker, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for removeRangeMarker
    
    public void testRemoveRangeMarker_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeRangeMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return removeRangeMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeRangeMarker(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveRangeMarker5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2526)
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2498)
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2481) */
        xYPlot.removeRangeMarker(categoryMarker, null);
    }
    ///endregion
    
    ///region Errors report for removeRangeMarker
    
    public void testRemoveRangeMarker_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearDomainMarkers
    
    ///region OTHER: ERROR SUITE for method clearDomainMarkers()
    
    @Test
    public void testClearDomainMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2113) */
        xYPlot.clearDomainMarkers();
    }
    
    @Test
    public void testClearDomainMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2113) */
        xYPlot.clearDomainMarkers();
    }
    ///endregion
    
    ///region Errors report for clearDomainMarkers
    
    public void testClearDomainMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearDomainMarkers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearDomainMarkers(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearDomainMarkers(int)}
 * @utbot.executesCondition {@code (this.backgroundDomainMarkers != null): False}
 * @utbot.executesCondition {@code (this.foregroundRangeMarkers != null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Collection) this.foregroundDomainMarkers.get(key)
 *  */
    @Test
    public void testClearDomainMarkers_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2140) */
        xYPlot.clearDomainMarkers(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearDomainMarkers(int)
    
    @Test
    public void testClearDomainMarkers3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2150) */
        xYPlot.clearDomainMarkers(0);
    }
    
    @Test
    public void testClearDomainMarkers4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2150) */
        xYPlot.clearDomainMarkers(0);
    }
    
    @Test
    public void testClearDomainMarkers5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2150) */
        xYPlot.clearDomainMarkers(0);
    }
    ///endregion
    
    ///region Errors report for clearDomainMarkers
    
    public void testClearDomainMarkers_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getQuadrantPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuadrantPaint(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantPaint(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index > 3): False}
 * @utbot.returnsFrom {@code return this.quadrantPaint[index];}
 *  */
    @Test
    public void testGetQuadrantPaint_IndexLessOrEqual3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        java.awt.Paint[] quadrantPaint = {null};
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantPaint", quadrantPaint);
        
        Paint actual = xYPlot.getQuadrantPaint(0);
        
        assertNull(actual);
        
        java.awt.Paint[] xYPlotQuadrantPaint = ((java.awt.Paint[]) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantPaint"));
        Paint finalXYPlotQuadrantPaint0 = ((Paint) get(xYPlotQuadrantPaint, 0));
        
        assertNull(finalXYPlotQuadrantPaint0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQuadrantPaint(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantPaint(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.quadrantPaint[index];
 *  */
    @Test
    public void testGetQuadrantPaint_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        java.awt.Paint[] quadrantPaint = {null, null};
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantPaint", quadrantPaint);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getQuadrantPaint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jfree.chart.plot.XYPlot.getQuadrantPaint(XYPlot.java:2034) */
        xYPlot.getQuadrantPaint(2);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantPaint(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.quadrantPaint[index];
 *  */
    @Test
    public void testGetQuadrantPaint_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getQuadrantPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getQuadrantPaint(XYPlot.java:2034) */
        xYPlot.getQuadrantPaint(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQuadrantPaint(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantPaint(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index > 3
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.getQuadrantPaint(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getQuadrantPaint(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index > 3): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index > 3
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaint_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.getQuadrantPaint(5);
    }
    ///endregion
    
    ///region Errors report for getQuadrantPaint
    
    public void testGetQuadrantPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setQuadrantPaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setQuadrantPaint(int, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setQuadrantPaint(int,java.awt.Paint)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index > 3
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setQuadrantPaint(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setQuadrantPaint(int,java.awt.Paint)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index > 3): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index > 3
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaint_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setQuadrantPaint(5, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setQuadrantPaint(int, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setQuadrantPaint(int,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.quadrantPaint[index] = paint;
 *  */
    @Test
    public void testSetQuadrantPaint_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        java.awt.Paint[] quadrantPaint = {null};
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantPaint", quadrantPaint);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setQuadrantPaint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.jfree.chart.plot.XYPlot.setQuadrantPaint(XYPlot.java:2051) */
        xYPlot.setQuadrantPaint(2, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setQuadrantPaint(int,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.quadrantPaint[index] = paint;
 *  */
    @Test
    public void testSetQuadrantPaint_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setQuadrantPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setQuadrantPaint(XYPlot.java:2051) */
        xYPlot.setQuadrantPaint(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addAnnotation(org.jfree.chart.annotations.XYAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addAnnotation(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addAnnotation(org.jfree.chart.annotations.XYAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.annotations.add(annotation);
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        XYImageAnnotation xYImageAnnotation = ((XYImageAnnotation) createInstance("org.jfree.chart.annotations.XYImageAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.addAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.addAnnotation(XYPlot.java:2562) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYImageAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method addAnnotationMethod = xYPlotClazz.getDeclaredMethod("addAnnotation", xYImageAnnotationType, booleanType);
        addAnnotationMethod.setAccessible(true);
        java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
        addAnnotationMethodArguments[0] = xYImageAnnotation;
        addAnnotationMethodArguments[1] = false;
        try {
            addAnnotationMethod.invoke(xYPlot, addAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for addAnnotation
    
    public void testAddAnnotation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addAnnotation
    
    ///region Errors report for addAnnotation
    
    public void testAddAnnotation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeMarkers
    
    ///region OTHER: ERROR SUITE for method clearRangeMarkers()
    
    @Test
    public void testClearRangeMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeMarkers(XYPlot.java:2356) */
        xYPlot.clearRangeMarkers();
    }
    
    @Test
    public void testClearRangeMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeMarkers(XYPlot.java:2356) */
        xYPlot.clearRangeMarkers();
    }
    ///endregion
    
    ///region Errors report for clearRangeMarkers
    
    public void testClearRangeMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeMarkers
    
    ///region OTHER: ERROR SUITE for method clearRangeMarkers(int)
    
    @Test
    public void testClearRangeMarkers3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeMarkers(XYPlot.java:2450) */
        xYPlot.clearRangeMarkers(0);
    }
    
    @Test
    public void testClearRangeMarkers4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.clearRangeMarkers(XYPlot.java:2450) */
        xYPlot.clearRangeMarkers(0);
    }
    ///endregion
    
    ///region Errors report for clearRangeMarkers
    
    public void testClearRangeMarkers_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeAnnotation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAnnotation(org.jfree.chart.annotations.XYAnnotation)
    
    @Test
    public void testRemoveAnnotation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList annotations = new ArrayList();
        annotations.add(null);
        annotations.add(null);
        annotations.add(null);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "annotations", annotations);
        XYTitleAnnotation xYTitleAnnotation = ((XYTitleAnnotation) createInstance("org.jfree.experimental.chart.annotations.XYTitleAnnotation"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYTitleAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Method removeAnnotationMethod = xYPlotClazz.getDeclaredMethod("removeAnnotation", xYTitleAnnotationType);
        removeAnnotationMethod.setAccessible(true);
        java.lang.Object[] removeAnnotationMethodArguments = new java.lang.Object[1];
        removeAnnotationMethodArguments[0] = xYTitleAnnotation;
        boolean actual = ((Boolean) removeAnnotationMethod.invoke(xYPlot, removeAnnotationMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for removeAnnotation
    
    public void testRemoveAnnotation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeAnnotation(org.jfree.chart.annotations.XYAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeAnnotation(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#removeAnnotation(org.jfree.chart.annotations.XYAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean removed = this.annotations.remove(annotation);
 *  */
    @Test
    public void testRemoveAnnotation_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        XYImageAnnotation xYImageAnnotation = ((XYImageAnnotation) createInstance("org.jfree.chart.annotations.XYImageAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeAnnotation(XYPlot.java:2598) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYImageAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method removeAnnotationMethod = xYPlotClazz.getDeclaredMethod("removeAnnotation", xYImageAnnotationType, booleanType);
        removeAnnotationMethod.setAccessible(true);
        java.lang.Object[] removeAnnotationMethodArguments = new java.lang.Object[2];
        removeAnnotationMethodArguments[0] = xYImageAnnotation;
        removeAnnotationMethodArguments[1] = false;
        try {
            removeAnnotationMethod.invoke(xYPlot, removeAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for removeAnnotation
    
    public void testRemoveAnnotation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearAnnotations()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearAnnotations()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.annotations.clear();
 *  */
    @Test
    public void testClearAnnotations_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.clearAnnotations(XYPlot.java:2625) */
        xYPlot.clearAnnotations();
    }
    ///endregion
    
    ///region Errors report for clearAnnotations
    
    public void testClearAnnotations_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.calculateAxisSpace
    
    ///region OTHER: ERROR SUITE for method calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testCalculateAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        fixedDomainAxisSpace.setTop(0.0);
        fixedDomainAxisSpace.setBottom(0.0);
        fixedDomainAxisSpace.setLeft(0.0);
        fixedDomainAxisSpace.setRight(0.0);
        xYPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:2726)
            org.jfree.chart.plot.XYPlot.calculateAxisSpace(XYPlot.java:2641) */
        xYPlot.calculateAxisSpace(null, null);
    }
    
    @Test
    public void testCalculateAxisSpace2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:2726)
            org.jfree.chart.plot.XYPlot.calculateAxisSpace(XYPlot.java:2641) */
        xYPlot.calculateAxisSpace(null, null);
    }
    ///endregion
    
    ///region Errors report for calculateAxisSpace
    
    public void testCalculateAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.draw
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#draw(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean b1 = (area.getWidth() <= MINIMUM_WIDTH_TO_DRAW);
 *  */
    @Test
    public void testDraw_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.draw] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.draw(XYPlot.java:2757) */
        xYPlot.draw(null, null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for draw
    
    public void testDraw_errors()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawBackground
    
    ///region Errors report for drawBackground
    
    public void testDrawBackground_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeTickBands
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeTickBands(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (bandPaint != null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getRangeTickBandPaint()}
 *  */
    @Test
    public void testDrawRangeTickBands_BandPaintEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.drawRangeTickBands(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeTickBands
    
    public void testDrawRangeTickBands_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawAxes
    
    ///region Errors report for drawAxes
    
    public void testDrawAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawQuadrants
    
    ///region OTHER: ERROR SUITE for method drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawQuadrants1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawQuadrants] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679)
            org.jfree.chart.plot.XYPlot.drawQuadrants(XYPlot.java:3035) */
        xYPlot.drawQuadrants(null, null);
    }
    
    @Test
    public void testDrawQuadrants2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawQuadrants] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawQuadrants(XYPlot.java:3036) */
        xYPlot.drawQuadrants(null, null);
    }
    ///endregion
    
    ///region Errors report for drawQuadrants
    
    public void testDrawQuadrants_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.datasetChanged
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method datasetChanged(org.jfree.data.general.DatasetChangeEvent)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#datasetChanged(org.jfree.data.general.DatasetChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#configureDomainAxes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: configureDomainAxes();
 *  */
    @Test
    public void testDatasetChanged_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.datasetChanged] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:861)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4033) */
        xYPlot.datasetChanged(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method datasetChanged(org.jfree.data.general.DatasetChangeEvent)
    
    @Test
    public void testDatasetChanged1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4041) */
        xYPlot.datasetChanged(null);
    }
    
    @Test
    public void testDatasetChanged2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
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
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        DatasetChangeEvent datasetChangeEvent = ((DatasetChangeEvent) createInstance("org.jfree.data.general.DatasetChangeEvent"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1160)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4034) */
        xYPlot.datasetChanged(datasetChangeEvent);
    }
    
    @Test
    public void testDatasetChanged3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1160)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4034) */
        xYPlot.datasetChanged(null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataRange
    
    ///region OTHER: ERROR SUITE for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDataRange1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
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
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 8193);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3931)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3979) */
        xYPlot.getDataRange(periodAxis);
    }
    
    @Test
    public void testGetDataRange2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3931)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3979) */
        xYPlot.getDataRange(null);
    }
    
    @Test
    public void testGetDataRange3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisIndex(XYPlot.java:3953)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3987) */
        xYPlot.getDataRange(logAxis);
    }
    
    @Test
    public void testGetDataRange4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
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
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisIndex(XYPlot.java:3953)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3987) */
        xYPlot.getDataRange(periodAxis);
    }
    
    @Test
    public void testGetDataRange5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
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
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(XYPlot.java:3874)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:3982) */
        xYPlot.getDataRange(null);
    }
    ///endregion
    
    ///region Errors report for getDataRange
    
    public void testGetDataRange_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeMarkers_Return() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeMarkers(null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeMarkers_Return_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeMarkers(null, null, -1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    @Test
    public void testDrawRangeMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawRangeMarkers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.drawRangeMarkers(XYPlot.java:3601) */
        xYPlot.drawRangeMarkers(null, null, 1073741824, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeMarkers
    
    public void testDrawRangeMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisIndex_ResultGreaterOrEqualZero() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        int actual = xYPlot.getRangeAxisIndex(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetRangeAxisIndex_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisIndex(XYPlot.java:3953) */
        xYPlot.getRangeAxisIndex(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetRangeAxisIndex1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        int actual = xYPlot.getRangeAxisIndex(periodAxis);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testGetRangeAxisIndex2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        int actual = xYPlot.getRangeAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region Errors report for getRangeAxisIndex
    
    public void testGetRangeAxisIndex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawVerticalLine
    
    ///region OTHER: ERROR SUITE for method drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)
    
    @Test
    public void testDrawVerticalLine1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawVerticalLine] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawVerticalLine(XYPlot.java:3782) */
        xYPlot.drawVerticalLine(null, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region Errors report for drawVerticalLine
    
    public void testDrawVerticalLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetRangeMarkers1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            Collection actual = xYPlot.getRangeMarkers(foreground);
            
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            Collection actual = xYPlot.getRangeMarkers(null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for getRangeMarkers
    
    public void testGetRangeMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            Collection actual = xYPlot.getRangeMarkers(-255, null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.getRangeMarkers(XYPlot.java:3688) */
            xYPlot.getRangeMarkers(-255, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.getRangeMarkers(XYPlot.java:3691) */
            xYPlot.getRangeMarkers(-255, background);
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            Collection actual = xYPlot.getRangeMarkers(0, foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for getRangeMarkers
    
    public void testGetRangeMarkers_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeGridlines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeGridlines_Return() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeGridlines_Return_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeGridlines(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    @Test
    public void testDrawRangeGridlines1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawRangeGridlines] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawRangeGridlines(XYPlot.java:3478) */
        xYPlot.drawRangeGridlines(null, null, null);
    }
    
    @Test
    public void testDrawRangeGridlines2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawRangeGridlines] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawRangeGridlines(XYPlot.java:3478) */
        xYPlot.drawRangeGridlines(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeGridlines
    
    public void testDrawRangeGridlines_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = this.annotations.iterator();
 *  */
    @Test
    public void testDrawAnnotations_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawAnnotations(XYPlot.java:3546) */
        xYPlot.drawAnnotations(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawAnnotations
    
    public void testDrawAnnotations_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeCrosshair
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawRangeCrosshair(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.axis.ValueAxis#getRange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: axis.getRange().contains(value)
 *  */
    @Test
    public void testDrawRangeCrosshair_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawRangeCrosshair] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawRangeCrosshair(XYPlot.java:3811) */
        xYPlot.drawRangeCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisIndex_ResultGreaterOrEqualZero() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        int actual = xYPlot.getDomainAxisIndex(null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): True}
 * @utbot.executesCondition {@code (parent instanceof XYPlot): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getParent()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisIndex_NotParentNotInstanceOfXYPlot() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        int actual = xYPlot.getDomainAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDomainAxisIndex_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3931) */
        xYPlot.getDomainAxisIndex(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDomainAxisIndex1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        int actual = xYPlot.getDomainAxisIndex(periodAxis);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDomainAxisIndex2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        xYPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3931)
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:3937) */
        xYPlot.getDomainAxisIndex(null);
    }
    ///endregion
    
    ///region Errors report for getDomainAxisIndex
    
    public void testGetDomainAxisIndex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            Collection actual = xYPlot.getDomainMarkers(-255, null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.getDomainMarkers(XYPlot.java:3662) */
            xYPlot.getDomainMarkers(-255, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            Collection actual = xYPlot.getDomainMarkers(0, foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers2() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.getDomainMarkers(XYPlot.java:3665) */
            xYPlot.getDomainMarkers(0, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for getDomainMarkers
    
    public void testGetDomainMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers3() throws Exception  {
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            Collection actual = xYPlot.getDomainMarkers(null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
            
            Collection actual = xYPlot.getDomainMarkers(background);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for getDomainMarkers
    
    public void testGetDomainMarkers_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.handleClick
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (dataArea.contains(x, y)): False}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#contains(double,double)}
 *  */
    @Test
    public void testHandleClick_NotDataAreaContains() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        Rectangle rectangle = new Rectangle(169607168, 0, 0, 0);
        plotRenderingInfo.setDataArea(rectangle);
        
        xYPlot.handleClick(0, -255, plotRenderingInfo);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Rectangle2D dataArea = info.getDataArea();
 *  */
    @Test
    public void testHandleClick_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.handleClick] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.handleClick(XYPlot.java:3841) */
        xYPlot.handleClick(-255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#contains(double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dataArea.contains(x, y)
 *  */
    @Test
    public void testHandleClick_ThrowNullPointerException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        plotRenderingInfo.setDataArea(null);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.handleClick] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.handleClick(XYPlot.java:3842) */
        xYPlot.handleClick(-255, -255, plotRenderingInfo);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainMarkers
    
    ///region Errors report for drawDomainMarkers
    
    public void testDrawDomainMarkers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.rendererChanged
    
    ///region Errors report for rendererChanged
    
    public void testRendererChanged_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 *  */
    @Test
    public void testZoomRangeAxes_XYPlotZoomRangeAxes() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region Errors report for zoomRangeAxes
    
    public void testZoomRangeAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomRangeAxes_IterateForLoop() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:4588) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
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
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region Errors report for zoomRangeAxes
    
    public void testZoomRangeAxes_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomRangeAxes_IterateForLoop1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:4555) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region Errors report for zoomRangeAxes
    
    public void testZoomRangeAxes_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainZoomable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainZoomable()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainZoomable()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsDomainZoomable_ReturnTrue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainZoomable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isDomainZoomable
    
    public void testIsDomainZoomable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeZoomable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeZoomable()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeZoomable()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsRangeZoomable_ReturnTrue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeZoomable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isRangeZoomable
    
    public void testIsRangeZoomable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getSeriesCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getSeriesCount()}
 * @utbot.executesCondition {@code (dataset != null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDataset()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesCount_DatasetEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.getSeriesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSeriesCount()
    
    @Test
    public void testGetSeriesCount1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.getSeriesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region Errors report for getSeriesCount
    
    public void testGetSeriesCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 *  */
    @Test
    public void testZoomDomainAxes_XYPlotZoomDomainAxes() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region Errors report for zoomDomainAxes
    
    public void testZoomDomainAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomDomainAxes_IterateForLoop() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testZoomDomainAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:4515) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region Errors report for zoomDomainAxes
    
    public void testZoomDomainAxes_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomDomainAxes_IterateForLoop1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis domainAxis = (ValueAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testZoomDomainAxes_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomDomainAxes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:4479) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testZoomDomainAxes_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:4478) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region Errors report for zoomDomainAxes
    
    public void testZoomDomainAxes_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.fixedLegendItems != null): True}
 * @utbot.returnsFrom {@code return this.fixedLegendItems;}
 *  */
    @Test
    public void testGetLegendItems_ThisFixedLegendItemsNotEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LegendItemCollection fixedLegendItems = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        xYPlot.setFixedLegendItems(fixedLegendItems);
        
        LegendItemCollection actual = xYPlot.getLegendItems();
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(fixedLegendItems, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.fixedLegendItems != null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLegendItems_ThisFixedLegendItemsEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        LegendItemCollection actual = xYPlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.fixedLegendItems != null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.datasets.size();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getLegendItems(XYPlot.java:4672) */
        xYPlot.getLegendItems();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    @Test
    public void testGetLegendItems1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        LegendItemCollection actual = xYPlot.getLegendItems();
        
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainCrosshair
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawDomainCrosshair(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.axis.ValueAxis#getRange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: axis.getRange().contains(value)
 *  */
    @Test
    public void testDrawDomainCrosshair_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawDomainCrosshair] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawDomainCrosshair(XYPlot.java:3745) */
        xYPlot.drawDomainCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)
    
    @Test
    public void testDrawDomainCrosshair1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        Year first = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(first, "org.jfree.data.time.Year", "year", (short) 0);
        periodAxis.setFirst(first);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(periodAxis, "org.jfree.chart.axis.PeriodAxis", "calendar", calendar);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawDomainCrosshair] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/java.util.Calendar.set(Calendar.java:1982)
            org.jfree.data.time.Year.getFirstMillisecond(Year.java:233)
            org.jfree.chart.axis.PeriodAxis.getRange(PeriodAxis.java:503)
            org.jfree.chart.plot.XYPlot.drawDomainCrosshair(XYPlot.java:3745) */
        xYPlot.drawDomainCrosshair(null, null, null, java.lang.Double.NaN, periodAxis, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainCrosshairValue(double)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairValue(double,boolean)}
 *  */
    @Test
    public void testSetDomainCrosshairValue_XYPlotSetDomainCrosshairValue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN);
        
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairValue
    
    public void testSetDomainCrosshairValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainCrosshairValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isDomainCrosshairVisible() && notify): False}
 *  */
    @Test
    public void testSetDomainCrosshairValue_IsDomainCrosshairVisibleAndNotify() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN);
        
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isDomainCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isDomainCrosshairVisible() && notify) {
 *     fireChangeEvent();
 * }): False}
 *  */
    @Test
    public void testSetDomainCrosshairValue_IsDomainCrosshairVisibleAndNotify_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairVisible(true);
        xYPlot.setDomainCrosshairValue(0.0);
        
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN, false);
        
        double finalXYPlotDomainCrosshairValue = ((Double) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalXYPlotDomainCrosshairValue, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairValue
    
    public void testSetDomainCrosshairValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawZeroRangeBaseline(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#isRangeZeroBaselineVisible()}
 *  */
    @Test
    public void testDrawZeroRangeBaseline_XYPlotIsRangeZeroBaselineVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.drawZeroRangeBaseline(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawZeroRangeBaseline1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setRangeZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3530) */
        xYPlot.drawZeroRangeBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroRangeBaseline2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setRangeZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3530) */
        xYPlot.drawZeroRangeBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroRangeBaseline3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", rangeAxes);
        xYPlot.setRangeZeroBaselineVisible(true);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3530) */
        xYPlot.drawZeroRangeBaseline(null, float1);
    }
    
    @Test
    public void testDrawZeroRangeBaseline4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", rangeAxes);
        xYPlot.setRangeZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3530) */
        xYPlot.drawZeroRangeBaseline(null, null);
    }
    ///endregion
    
    ///region Errors report for drawZeroRangeBaseline
    
    public void testDrawZeroRangeBaseline_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainCrosshairStroke()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainCrosshairStroke()}
 * @utbot.returnsFrom {@code return this.domainCrosshairStroke;}
 *  */
    @Test
    public void testGetDomainCrosshairStroke_ReturnThisDomainCrosshairStroke() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Stroke actual = xYPlot.getDomainCrosshairStroke();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDomainCrosshairStroke
    
    public void testGetDomainCrosshairStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainCrosshairPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainCrosshairPaint(null);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairPaint
    
    public void testSetDomainCrosshairPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeCrosshairVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeCrosshairVisible()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairVisible;}
 *  */
    @Test
    public void testIsRangeCrosshairVisible_ReturnThisRangeCrosshairVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeCrosshairVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isRangeCrosshairVisible
    
    public void testIsRangeCrosshairVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairLockedOnData(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairLockedOnData != flag): False}
 *  */
    @Test
    public void testSetRangeCrosshairLockedOnData_ThisRangeCrosshairLockedOnDataEqualsFlag() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeCrosshairLockedOnData(false);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairLockedOnData
    
    public void testSetRangeCrosshairLockedOnData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeCrosshairPaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeCrosshairPaint()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairPaint;}
 *  */
    @Test
    public void testGetRangeCrosshairPaint_ReturnThisRangeCrosshairPaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getRangeCrosshairPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getRangeCrosshairPaint
    
    public void testGetRangeCrosshairPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedDomainAxisSpace()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getFixedDomainAxisSpace()}
 * @utbot.returnsFrom {@code return this.fixedDomainAxisSpace;}
 *  */
    @Test
    public void testGetFixedDomainAxisSpace_ReturnThisFixedDomainAxisSpace() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        AxisSpace actual = xYPlot.getFixedDomainAxisSpace();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getFixedDomainAxisSpace
    
    public void testGetFixedDomainAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace
    
    ///region Errors report for setFixedDomainAxisSpace
    
    public void testSetFixedDomainAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetFixedDomainAxisSpace_NotNotify() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setFixedDomainAxisSpace(null, false);
    }
    ///endregion
    
    ///region Errors report for setFixedDomainAxisSpace
    
    public void testSetFixedDomainAxisSpace_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetFixedRangeAxisSpace_NotNotify() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setFixedRangeAxisSpace(null, false);
    }
    ///endregion
    
    ///region Errors report for setFixedRangeAxisSpace
    
    public void testSetFixedRangeAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace
    
    ///region Errors report for setFixedRangeAxisSpace
    
    public void testSetFixedRangeAxisSpace_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainCrosshairLockedOnData()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainCrosshairLockedOnData()}
 * @utbot.returnsFrom {@code return this.domainCrosshairLockedOnData;}
 *  */
    @Test
    public void testIsDomainCrosshairLockedOnData_ReturnThisDomainCrosshairLockedOnData() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainCrosshairLockedOnData();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isDomainCrosshairLockedOnData
    
    public void testIsDomainCrosshairLockedOnData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateDomainAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedDomainAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.returnsFrom {@code return space;}
 *  */
    @Test
    public void testCalculateDomainAxisSpace_ThisFixedDomainAxisSpaceEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = xYPlot.calculateDomainAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateDomainAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Axis axis = (Axis) this.domainAxes.get(i);
 *  */
    @Test
    public void testCalculateDomainAxisSpace_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.Axis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.Axis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(XYPlot.java:2680) */
        xYPlot.calculateDomainAxisSpace(null, null, axisSpace);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateDomainAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testCalculateDomainAxisSpace_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(XYPlot.java:2679) */
        xYPlot.calculateDomainAxisSpace(null, null, axisSpace);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateDomainAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(XYPlot.java:2679) */
        xYPlot.calculateDomainAxisSpace(null, null, null);
    }
    ///endregion
    
    ///region Errors report for calculateDomainAxisSpace
    
    public void testCalculateDomainAxisSpace_errors()
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainTickBands
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawDomainTickBands(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (bandPaint != null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDomainTickBandPaint()}
 *  */
    @Test
    public void testDrawDomainTickBands_BandPaintEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.drawDomainTickBands(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawDomainTickBands
    
    public void testDrawDomainTickBands_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainCrosshairVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainCrosshairVisible()}
 * @utbot.returnsFrom {@code return this.domainCrosshairVisible;}
 *  */
    @Test
    public void testIsDomainCrosshairVisible_ReturnThisDomainCrosshairVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainCrosshairVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isDomainCrosshairVisible
    
    public void testIsDomainCrosshairVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainCrosshairLockedOnData(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.domainCrosshairLockedOnData != flag): False}
 *  */
    @Test
    public void testSetDomainCrosshairLockedOnData_ThisDomainCrosshairLockedOnDataEqualsFlag() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainCrosshairLockedOnData(false);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairLockedOnData
    
    public void testSetDomainCrosshairLockedOnData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairValue(double,boolean)}
 *  */
    @Test
    public void testSetRangeCrosshairValue_XYPlotSetRangeCrosshairValue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairValue
    
    public void testSetRangeCrosshairValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): False}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isRangeCrosshairVisible() && notify) {
 *     fireChangeEvent();
 * }): False}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairVisible(true);
        xYPlot.setRangeCrosshairValue(0.0);
        
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN, false);
        
        double finalXYPlotRangeCrosshairValue = ((Double) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalXYPlotRangeCrosshairValue, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairValue
    
    public void testSetRangeCrosshairValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeCrosshairStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeCrosshairStroke(null);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairStroke
    
    public void testSetRangeCrosshairStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getFixedLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedLegendItems()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getFixedLegendItems()}
 * @utbot.returnsFrom {@code return this.fixedLegendItems;}
 *  */
    @Test
    public void testGetFixedLegendItems_ReturnThisFixedLegendItems() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        LegendItemCollection actual = xYPlot.getFixedLegendItems();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getFixedLegendItems
    
    public void testGetFixedLegendItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainGridlines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawDomainGridlines_Return() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawDomainGridlines_Return_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainGridlines(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getRenderer()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: getRenderer() == null
 *  */
    @Test
    public void testDrawDomainGridlines_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawDomainGridlines] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawDomainGridlines(XYPlot.java:3447) */
        xYPlot.drawDomainGridlines(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    @Test
    public void testDrawDomainGridlines1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        StackedXYAreaRenderer stackedXYAreaRenderer = ((StackedXYAreaRenderer) createInstance("org.jfree.chart.renderer.xy.StackedXYAreaRenderer"));
        objects[0] = ((Object) stackedXYAreaRenderer);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainGridlines(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    @Test
    public void testDrawDomainGridlines2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawDomainGridlines] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawDomainGridlines(XYPlot.java:3447) */
        xYPlot.drawDomainGridlines(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawDomainGridlines
    
    public void testDrawDomainGridlines_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairVisible != flag): False}
 *  */
    @Test
    public void testSetRangeCrosshairVisible_ThisRangeCrosshairVisibleEqualsFlag() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeCrosshairVisible(false);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairVisible
    
    public void testSetRangeCrosshairVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeCrosshairPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeCrosshairPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeCrosshairPaint(null);
    }
    ///endregion
    
    ///region Errors report for setRangeCrosshairPaint
    
    public void testSetRangeCrosshairPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeCrosshairLockedOnData()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeCrosshairLockedOnData()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairLockedOnData;}
 *  */
    @Test
    public void testIsRangeCrosshairLockedOnData_ReturnThisRangeCrosshairLockedOnData() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeCrosshairLockedOnData();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isRangeCrosshairLockedOnData
    
    public void testIsRangeCrosshairLockedOnData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedLegendItems
    
    ///region Errors report for setFixedLegendItems
    
    public void testSetFixedLegendItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainCrosshairVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainCrosshairVisible != flag): False}
 *  */
    @Test
    public void testSetDomainCrosshairVisible_ThisDomainCrosshairVisibleEqualsFlag() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainCrosshairVisible(false);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairVisible
    
    public void testSetDomainCrosshairVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedRangeAxisSpace()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getFixedRangeAxisSpace()}
 * @utbot.returnsFrom {@code return this.fixedRangeAxisSpace;}
 *  */
    @Test
    public void testGetFixedRangeAxisSpace_ReturnThisFixedRangeAxisSpace() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        AxisSpace actual = xYPlot.getFixedRangeAxisSpace();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getFixedRangeAxisSpace
    
    public void testGetFixedRangeAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedRangeAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.returnsFrom {@code return space;}
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThisFixedRangeAxisSpaceEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Axis axis = (Axis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.Axis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.Axis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:2727) */
        xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:2726) */
        xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateRangeAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:2726) */
        xYPlot.calculateRangeAxisSpace(null, null, null);
    }
    ///endregion
    
    ///region Errors report for calculateRangeAxisSpace
    
    public void testCalculateRangeAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainCrosshairValue()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainCrosshairValue()}
 * @utbot.returnsFrom {@code return this.domainCrosshairValue;}
 *  */
    @Test
    public void testGetDomainCrosshairValue_ReturnThisDomainCrosshairValue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairValue(0.0);
        
        double actual = xYPlot.getDomainCrosshairValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getDomainCrosshairValue
    
    public void testGetDomainCrosshairValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainCrosshairPaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainCrosshairPaint()}
 * @utbot.returnsFrom {@code return this.domainCrosshairPaint;}
 *  */
    @Test
    public void testGetDomainCrosshairPaint_ReturnThisDomainCrosshairPaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getDomainCrosshairPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDomainCrosshairPaint
    
    public void testGetDomainCrosshairPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeCrosshairValue()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeCrosshairValue()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairValue;}
 *  */
    @Test
    public void testGetRangeCrosshairValue_ReturnThisRangeCrosshairValue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairValue(0.0);
        
        double actual = xYPlot.getRangeCrosshairValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getRangeCrosshairValue
    
    public void testGetRangeCrosshairValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisForDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= getDatasetCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDataset_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.getDomainAxisForDataset(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= getDatasetCount()): True}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= getDatasetCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDataset_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        xYPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= getDatasetCount()): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToDomainAxisMap.get(new Integer(index));
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(XYPlot.java:3395) */
        xYPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisForDataset(int)
    
    @Test
    public void testGetDomainAxisForDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        LinkedHashMap datasetToDomainAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:693)
            org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(XYPlot.java:3401) */
        xYPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///region Errors report for getDomainAxisForDataset
    
    public void testGetDomainAxisForDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainCrosshairStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainCrosshairStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainCrosshairStroke(null);
    }
    ///endregion
    
    ///region Errors report for setDomainCrosshairStroke
    
    public void testSetDomainCrosshairStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke
    
    ///region Errors report for getRangeCrosshairStroke
    
    public void testGetRangeCrosshairStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeTickBandPaint
    
    ///region Errors report for setRangeTickBandPaint
    
    public void testSetRangeTickBandPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisForDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= getDatasetCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDataset_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.getRangeAxisForDataset(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= getDatasetCount()): True}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= getDatasetCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDataset_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        xYPlot.getRangeAxisForDataset(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= getDatasetCount()): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Integer) this.datasetToRangeAxisMap.get(new Integer(index))
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(XYPlot.java:3423) */
        xYPlot.getRangeAxisForDataset(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisForDataset(int)
    
    @Test
    public void testGetRangeAxisForDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        LinkedHashMap datasetToRangeAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1057)
            org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(XYPlot.java:3428) */
        xYPlot.getRangeAxisForDataset(0);
    }
    ///endregion
    
    ///region Errors report for getRangeAxisForDataset
    
    public void testGetRangeAxisForDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetsMappedToRangeAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToRangeAxis(java.lang.Integer)}
 * @utbot.executesCondition {@code (axisIndex == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDatasetsMappedToRangeAxis_AxisIndexNotEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Integer integer = 0;
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToRangeAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToRangeAxis", integerType);
        getDatasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToRangeAxisMethodArguments[0] = integer;
        ArrayList actual = ((ArrayList) getDatasetsMappedToRangeAxisMethod.invoke(xYPlot, getDatasetsMappedToRangeAxisMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDatasetsMappedToRangeAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToRangeAxis(java.lang.Integer)}
 * @utbot.executesCondition {@code (axisIndex == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: axisIndex == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDatasetsMappedToRangeAxis_ThrowIllegalArgumentException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToRangeAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToRangeAxis", integerType);
        getDatasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToRangeAxisMethodArguments[0] = ((Object) null);
        try {
            getDatasetsMappedToRangeAxisMethod.invoke(xYPlot, getDatasetsMappedToRangeAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDatasetsMappedToRangeAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToRangeAxis(java.lang.Integer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetDatasetsMappedToRangeAxis_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(XYPlot.java:3904) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToRangeAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToRangeAxis", integerType);
        getDatasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToRangeAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToRangeAxisMethod.invoke(xYPlot, getDatasetsMappedToRangeAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToRangeAxis(java.lang.Integer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer mappedAxis = (Integer) this.datasetToRangeAxisMap.get(new Integer(i));
 *  */
    @Test
    public void testGetDatasetsMappedToRangeAxis_ThrowNullPointerException_1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(XYPlot.java:3905) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToRangeAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToRangeAxis", integerType);
        getDatasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToRangeAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToRangeAxisMethod.invoke(xYPlot, getDatasetsMappedToRangeAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDatasetsMappedToRangeAxis(java.lang.Integer)
    
    @Test
    public void testGetDatasetsMappedToRangeAxis1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        LinkedHashMap datasetToRangeAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(XYPlot.java:3909) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToRangeAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToRangeAxis", integerType);
        getDatasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToRangeAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToRangeAxisMethod.invoke(xYPlot, getDatasetsMappedToRangeAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getDatasetsMappedToRangeAxis
    
    public void testGetDatasetsMappedToRangeAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawZeroDomainBaseline(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#isDomainZeroBaselineVisible()}
 *  */
    @Test
    public void testDrawZeroDomainBaseline_XYPlotIsDomainZeroBaselineVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawZeroDomainBaseline1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setDomainZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.xy.XYItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.xy.XYItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3513) */
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroDomainBaseline2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setDomainZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1399)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1384)
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3513) */
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroDomainBaseline3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setDomainZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:694)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:679)
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3514) */
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroDomainBaseline4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", domainAxes);
        xYPlot.setDomainZeroBaselineVisible(true);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3514) */
        xYPlot.drawZeroDomainBaseline(null, float1);
    }
    
    @Test
    public void testDrawZeroDomainBaseline5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", domainAxes);
        xYPlot.setDomainZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3514) */
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    ///endregion
    
    ///region Errors report for drawZeroDomainBaseline
    
    public void testDrawZeroDomainBaseline_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetsMappedToDomainAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToDomainAxis(java.lang.Integer)}
 * @utbot.executesCondition {@code (axisIndex == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDatasetsMappedToDomainAxis_AxisIndexNotEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Integer integer = 0;
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToDomainAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToDomainAxis", integerType);
        getDatasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToDomainAxisMethodArguments[0] = integer;
        ArrayList actual = ((ArrayList) getDatasetsMappedToDomainAxisMethod.invoke(xYPlot, getDatasetsMappedToDomainAxisMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDatasetsMappedToDomainAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToDomainAxis(java.lang.Integer)}
 * @utbot.executesCondition {@code (axisIndex == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: axisIndex == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDatasetsMappedToDomainAxis_ThrowIllegalArgumentException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToDomainAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToDomainAxis", integerType);
        getDatasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToDomainAxisMethodArguments[0] = ((Object) null);
        try {
            getDatasetsMappedToDomainAxisMethod.invoke(xYPlot, getDatasetsMappedToDomainAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDatasetsMappedToDomainAxis(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToDomainAxis(java.lang.Integer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetDatasetsMappedToDomainAxis_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(XYPlot.java:3874) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToDomainAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToDomainAxis", integerType);
        getDatasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToDomainAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToDomainAxisMethod.invoke(xYPlot, getDatasetsMappedToDomainAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetsMappedToDomainAxis(java.lang.Integer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer mappedAxis = (Integer) this.datasetToDomainAxisMap.get(new Integer(i));
 *  */
    @Test
    public void testGetDatasetsMappedToDomainAxis_ThrowNullPointerException_1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(XYPlot.java:3875) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToDomainAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToDomainAxis", integerType);
        getDatasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToDomainAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToDomainAxisMethod.invoke(xYPlot, getDatasetsMappedToDomainAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDatasetsMappedToDomainAxis(java.lang.Integer)
    
    @Test
    public void testGetDatasetsMappedToDomainAxis1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        LinkedHashMap datasetToDomainAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(XYPlot.java:3879) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class integerType = Class.forName("java.lang.Integer");
        Method getDatasetsMappedToDomainAxisMethod = xYPlotClazz.getDeclaredMethod("getDatasetsMappedToDomainAxis", integerType);
        getDatasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] getDatasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        getDatasetsMappedToDomainAxisMethodArguments[0] = integer;
        try {
            getDatasetsMappedToDomainAxisMethod.invoke(xYPlot, getDatasetsMappedToDomainAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getDatasetsMappedToDomainAxis
    
    public void testGetDatasetsMappedToDomainAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.configureDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureDomainAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 *  */
    @Test
    public void testConfigureDomainAxes_IterateForLoop() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.configureDomainAxes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method configureDomainAxes()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis axis = (ValueAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureDomainAxes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:861) */
        xYPlot.configureDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ValueAxis axis = (ValueAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureDomainAxes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:861) */
        xYPlot.configureDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:860) */
        xYPlot.configureDomainAxes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method configureDomainAxes()
    
    @Test
    public void testConfigureDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.configureDomainAxes();
    }
    
    @Test
    public void testConfigureDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.configureDomainAxes();
    }
    
    @Test
    public void testConfigureDomainAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.configureDomainAxes();
    }
    ///endregion
    
    ///region Errors report for configureDomainAxes
    
    public void testConfigureDomainAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDatasetToRangeAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToRangeAxis(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.datasetToRangeAxisMap.put(new Integer(index), new Integer(axisIndex));
 *  */
    @Test
    public void testMapDatasetToRangeAxis_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(XYPlot.java:1370) */
        xYPlot.mapDatasetToRangeAxis(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToRangeAxis(int, int)
    
    @Test
    public void testMapDatasetToRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap datasetToRangeAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1274)
            org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(XYPlot.java:1373) */
        xYPlot.mapDatasetToRangeAxis(0, 0);
    }
    ///endregion
    
    ///region Errors report for mapDatasetToRangeAxis
    
    public void testMapDatasetToRangeAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDatasetRenderingOrder(null);
    }
    ///endregion
    
    ///region Errors report for setDatasetRenderingOrder
    
    public void testSetDatasetRenderingOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesRenderingOrder()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getSeriesRenderingOrder()}
 * @utbot.returnsFrom {@code return this.seriesRenderingOrder;}
 *  */
    @Test
    public void testGetSeriesRenderingOrder_ReturnThisSeriesRenderingOrder() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        SeriesRenderingOrder actual = xYPlot.getSeriesRenderingOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getSeriesRenderingOrder
    
    public void testGetSeriesRenderingOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrder_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setSeriesRenderingOrder(null);
    }
    ///endregion
    
    ///region Errors report for setSeriesRenderingOrder
    
    public void testSetSeriesRenderingOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRendererForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRendererForDataset(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererForDataset(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRendererForDataset_ReturnResult() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYItemRenderer actual = xYPlot.getRendererForDataset(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRendererForDataset(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererForDataset(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this.datasets.get(i) == dataset
 *  */
    @Test
    public void testGetRendererForDataset_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRendererForDataset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRendererForDataset(XYPlot.java:1554) */
        xYPlot.getRendererForDataset(null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererForDataset(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRendererForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRendererForDataset(XYPlot.java:1553) */
        xYPlot.getRendererForDataset(null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererForDataset(org.jfree.data.xy.XYDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (XYItemRenderer) this.renderers.get(i);
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRendererForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRendererForDataset(XYPlot.java:1555) */
        xYPlot.getRendererForDataset(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRendererForDataset(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testGetRendererForDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        Object overwriteDataSet = createInstance("org.jfree.chart.renderer.xy.CyclicXYItemRenderer$OverwriteDataSet");
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class overwriteDataSetType = Class.forName("org.jfree.data.xy.XYDataset");
        Method getRendererForDatasetMethod = xYPlotClazz.getDeclaredMethod("getRendererForDataset", overwriteDataSetType);
        getRendererForDatasetMethod.setAccessible(true);
        java.lang.Object[] getRendererForDatasetMethodArguments = new java.lang.Object[1];
        getRendererForDatasetMethodArguments[0] = overwriteDataSet;
        XYItemRenderer actual = ((XYItemRenderer) getRendererForDatasetMethod.invoke(xYPlot, getRendererForDatasetMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRendererForDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRendererForDataset(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getRendererForDataset
    
    public void testGetRendererForDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetDomainAxisLocation_ThrowNullPointerException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:926) */
        xYPlot.setDomainAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:926) */
        xYPlot.setDomainAxisLocation(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index == 0 && location == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainAxisLocation(0, null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotDomainAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] xYPlotDomainAxisLocationsDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialXYPlotDomainAxisLocationsObjects0 = get(xYPlotDomainAxisLocationsDomainAxisLocationsObjects, 0);
        
        xYPlot.setDomainAxisLocation(0, axisLocation, false);
        
        ObjectList xYPlotDomainAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] xYPlotDomainAxisLocations1DomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalXYPlotDomainAxisLocationsObjects0 = get(xYPlotDomainAxisLocations1DomainAxisLocationsObjects, 0);
        
        assertFalse(initialXYPlotDomainAxisLocationsObjects0 == finalXYPlotDomainAxisLocationsObjects0);
    }
    
    @Test
    public void testSetDomainAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.setDomainAxisLocation(8, null, false);
        
        ObjectList xYPlotDomainAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        int finalXYPlotDomainAxisLocationsSize = ((Integer) getFieldValue(xYPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertEquals(9, finalXYPlotDomainAxisLocationsSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:926) */
        xYPlot.setDomainAxisLocation(9, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.setDomainAxisLocation(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///region Errors report for setDomainAxisLocation
    
    public void testSetDomainAxisLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotDomainAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] initialXYPlotDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        xYPlot.setDomainAxisLocation(axisLocation, false);
        
        ObjectList xYPlotDomainAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] finalXYPlotDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        assertFalse(initialXYPlotDomainAxisLocationsObjects == finalXYPlotDomainAxisLocationsObjects);
    }
    
    @Test
    public void testSetDomainAxisLocation6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotDomainAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] xYPlotDomainAxisLocationsDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialXYPlotDomainAxisLocationsObjects0 = get(xYPlotDomainAxisLocationsDomainAxisLocationsObjects, 0);
        
        xYPlot.setDomainAxisLocation(axisLocation, false);
        
        ObjectList xYPlotDomainAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        java.lang.Object[] xYPlotDomainAxisLocations1DomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotDomainAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalXYPlotDomainAxisLocationsObjects0 = get(xYPlotDomainAxisLocations1DomainAxisLocationsObjects, 0);
        ObjectList xYPlotDomainAxisLocations2 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations"));
        int finalXYPlotDomainAxisLocationsSize = ((Integer) getFieldValue(xYPlotDomainAxisLocations2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialXYPlotDomainAxisLocationsObjects0 == finalXYPlotDomainAxisLocationsObjects0);
        
        assertEquals(1, finalXYPlotDomainAxisLocationsSize);
    }
    ///endregion
    
    ///region Errors report for setDomainAxisLocation
    
    public void testSetDomainAxisLocation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetDomainAxisLocation7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:926)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:902) */
        xYPlot.setDomainAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetDomainAxisLocation8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:928)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:902) */
        xYPlot.setDomainAxisLocation(0, axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:928)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:902) */
        xYPlot.setDomainAxisLocation(0, axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation10() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:928)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:902) */
        xYPlot.setDomainAxisLocation(8, ((AxisLocation) null));
    }
    ///endregion
    
    ///region Errors report for setDomainAxisLocation
    
    public void testSetDomainAxisLocation_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetDomainAxisLocation11() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", Integer.MIN_VALUE);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:926)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:797) */
        xYPlot.setDomainAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation12() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:928)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:797) */
        xYPlot.setDomainAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation13() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:928)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:797) */
        xYPlot.setDomainAxisLocation(axisLocation);
    }
    ///endregion
    
    ///region Errors report for setDomainAxisLocation
    
    public void testSetDomainAxisLocation_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetRenderingOrder()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDatasetRenderingOrder()}
 * @utbot.returnsFrom {@code return this.datasetRenderingOrder;}
 *  */
    @Test
    public void testGetDatasetRenderingOrder_ReturnThisDatasetRenderingOrder() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        DatasetRenderingOrder actual = xYPlot.getDatasetRenderingOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDatasetRenderingOrder
    
    public void testGetDatasetRenderingOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.domainGridlinesVisible;}
 *  */
    @Test
    public void testIsDomainGridlinesVisible_ReturnThisDomainGridlinesVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainGridlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isDomainGridlinesVisible
    
    public void testIsDomainGridlinesVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetDomainGridlinesVisible_ThisDomainGridlinesVisibleEqualsVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainGridlinesVisible(false);
    }
    ///endregion
    
    ///region Errors report for setDomainGridlinesVisible
    
    public void testSetDomainGridlinesVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisLocation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisLocation()}
 * @utbot.returnsFrom {@code return (AxisLocation) this.rangeAxisLocations.get(0);}
 *  */
    @Test
    public void testGetRangeAxisLocation_ReturnThisRangeAxisLocationsGet0() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = xYPlot.getRangeAxisLocation();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisLocation()}
 * @utbot.returnsFrom {@code return (AxisLocation) this.rangeAxisLocations.get(0);}
 *  */
    @Test
    public void testGetRangeAxisLocation_ReturnThisRangeAxisLocationsGet0_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = xYPlot.getRangeAxisLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisLocation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (AxisLocation) this.rangeAxisLocations.get(0);
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1003) */
        xYPlot.getRangeAxisLocation();
    }
    ///endregion
    
    ///region Errors report for getRangeAxisLocation
    
    public void testGetRangeAxisLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisLocation(int)}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisLocation_ResultNotEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = xYPlot.getRangeAxisLocation(0);
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxisLocations.size()
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1181) */
        xYPlot.getRangeAxisLocation(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisLocation(int)
    
    @Test
    public void testGetRangeAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1003)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1185) */
        xYPlot.getRangeAxisLocation(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisLocation(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisLocation(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisLocation(1073741824);
    }
    ///endregion
    
    ///region Errors report for getRangeAxisLocation
    
    public void testGetRangeAxisLocation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetRangeAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1201) */
        xYPlot.setRangeAxisLocation(0, axisLocation);
    }
    
    @Test
    public void testSetRangeAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1201) */
        xYPlot.setRangeAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetRangeAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1227)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1201) */
        xYPlot.setRangeAxisLocation(8, ((AxisLocation) null));
    }
    ///endregion
    
    ///region Errors report for setRangeAxisLocation
    
    public void testSetRangeAxisLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotRangeAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] xYPlotRangeAxisLocationsRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialXYPlotRangeAxisLocationsObjects0 = get(xYPlotRangeAxisLocationsRangeAxisLocationsObjects, 0);
        
        xYPlot.setRangeAxisLocation(axisLocation, false);
        
        ObjectList xYPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] xYPlotRangeAxisLocations1RangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalXYPlotRangeAxisLocationsObjects0 = get(xYPlotRangeAxisLocations1RangeAxisLocationsObjects, 0);
        ObjectList xYPlotRangeAxisLocations2 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        int finalXYPlotRangeAxisLocationsSize = ((Integer) getFieldValue(xYPlotRangeAxisLocations2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialXYPlotRangeAxisLocationsObjects0 == finalXYPlotRangeAxisLocationsObjects0);
        
        assertEquals(1, finalXYPlotRangeAxisLocationsSize);
    }
    
    @Test
    public void testSetRangeAxisLocation5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotRangeAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] initialXYPlotRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        xYPlot.setRangeAxisLocation(axisLocation, false);
        
        ObjectList xYPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] finalXYPlotRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        assertFalse(initialXYPlotRangeAxisLocationsObjects == finalXYPlotRangeAxisLocationsObjects);
    }
    ///endregion
    
    ///region Errors report for setRangeAxisLocation
    
    public void testSetRangeAxisLocation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetRangeAxisLocation6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1227)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1016) */
        xYPlot.setRangeAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetRangeAxisLocation7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1227)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1016) */
        xYPlot.setRangeAxisLocation(axisLocation);
    }
    ///endregion
    
    ///region Errors report for setRangeAxisLocation
    
    public void testSetRangeAxisLocation_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetRangeAxisLocation_ThrowNullPointerException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225) */
        xYPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225) */
        xYPlot.setRangeAxisLocation(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index == 0 && location == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeAxisLocation(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225) */
        xYPlot.setRangeAxisLocation(9, null, false);
    }
    
    @Test
    public void testSetRangeAxisLocation9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1225) */
        xYPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    ///endregion
    
    ///region Errors report for setRangeAxisLocation
    
    public void testSetRangeAxisLocation_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation()}
 * @utbot.returnsFrom {@code return (AxisLocation) this.domainAxisLocations.get(0);}
 *  */
    @Test
    public void testGetDomainAxisLocation_ReturnThisDomainAxisLocationsGet0() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = xYPlot.getDomainAxisLocation();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation()}
 * @utbot.returnsFrom {@code return (AxisLocation) this.domainAxisLocations.get(0);}
 *  */
    @Test
    public void testGetDomainAxisLocation_ReturnThisDomainAxisLocationsGet0_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = xYPlot.getDomainAxisLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (AxisLocation) this.domainAxisLocations.get(0);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowClassCastException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784) */
        xYPlot.getDomainAxisLocation();
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (AxisLocation) this.domainAxisLocations.get(0);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784) */
        xYPlot.getDomainAxisLocation();
    }
    ///endregion
    
    ///region Errors report for getDomainAxisLocation
    
    public void testGetDomainAxisLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation(int)}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisLocation_ResultNotEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = xYPlot.getDomainAxisLocation(0);
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxisLocations.size()
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:881) */
        xYPlot.getDomainAxisLocation(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisLocation(int)
    
    @Test
    public void testGetDomainAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:784)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:885) */
        xYPlot.getDomainAxisLocation(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisLocation(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisLocation(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisLocation(1073741824);
    }
    ///endregion
    
    ///region Errors report for getDomainAxisLocation
    
    public void testGetDomainAxisLocation_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToDomainAxis(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.datasetToDomainAxisMap.put(new Integer(index), new Integer(axisIndex));
 *  */
    @Test
    public void testMapDatasetToDomainAxis_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(XYPlot.java:1354) */
        xYPlot.mapDatasetToDomainAxis(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    @Test
    public void testMapDatasetToDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap datasetToDomainAxisMap = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1274)
            org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(XYPlot.java:1357) */
        xYPlot.mapDatasetToDomainAxis(0, 0);
    }
    ///endregion
    
    ///region Errors report for mapDatasetToDomainAxis
    
    public void testMapDatasetToDomainAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThisRangeGridlinesVisibleEqualsVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeGridlinesVisible(false);
    }
    ///endregion
    
    ///region Errors report for setRangeGridlinesVisible
    
    public void testSetRangeGridlinesVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeGridlinePaint()}
 * @utbot.returnsFrom {@code return this.rangeGridlinePaint;}
 *  */
    @Test
    public void testGetRangeGridlinePaint_ReturnThisRangeGridlinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getRangeGridlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getRangeGridlinePaint
    
    public void testGetRangeGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeGridlinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setRangeGridlinePaint
    
    public void testSetRangeGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke
    
    ///region Errors report for getDomainZeroBaselineStroke
    
    public void testGetDomainZeroBaselineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainZeroBaselineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainZeroBaselineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainZeroBaselineStroke(null);
    }
    ///endregion
    
    ///region Errors report for setDomainZeroBaselineStroke
    
    public void testSetDomainZeroBaselineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainZeroBaselinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainZeroBaselinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainZeroBaselinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setDomainZeroBaselinePaint
    
    public void testSetDomainZeroBaselinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.rangeGridlinesVisible;}
 *  */
    @Test
    public void testIsRangeGridlinesVisible_ReturnThisRangeGridlinesVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeGridlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isRangeGridlinesVisible
    
    public void testIsRangeGridlinesVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeGridlineStroke(null);
    }
    ///endregion
    
    ///region Errors report for setRangeGridlineStroke
    
    public void testSetRangeGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible
    
    ///region Errors report for setDomainZeroBaselineVisible
    
    public void testSetDomainZeroBaselineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeZeroBaselineVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeZeroBaselineVisible()}
 * @utbot.returnsFrom {@code return this.rangeZeroBaselineVisible;}
 *  */
    @Test
    public void testIsRangeZeroBaselineVisible_ReturnThisRangeZeroBaselineVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeZeroBaselineVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isRangeZeroBaselineVisible
    
    public void testIsRangeZeroBaselineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible
    
    ///region Errors report for setRangeZeroBaselineVisible
    
    public void testSetRangeZeroBaselineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainZeroBaselineVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainZeroBaselineVisible()}
 * @utbot.returnsFrom {@code return this.domainZeroBaselineVisible;}
 *  */
    @Test
    public void testIsDomainZeroBaselineVisible_ReturnThisDomainZeroBaselineVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainZeroBaselineVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isDomainZeroBaselineVisible
    
    public void testIsDomainZeroBaselineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainZeroBaselinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainZeroBaselinePaint()}
 * @utbot.returnsFrom {@code return this.domainZeroBaselinePaint;}
 *  */
    @Test
    public void testGetDomainZeroBaselinePaint_ReturnThisDomainZeroBaselinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getDomainZeroBaselinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDomainZeroBaselinePaint
    
    public void testGetDomainZeroBaselinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainGridlineStroke
    
    ///region Errors report for getDomainGridlineStroke
    
    public void testGetDomainGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainGridlinePaint()}
 * @utbot.returnsFrom {@code return this.domainGridlinePaint;}
 *  */
    @Test
    public void testGetDomainGridlinePaint_ReturnThisDomainGridlinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getDomainGridlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDomainGridlinePaint
    
    public void testGetDomainGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeGridlineStroke
    
    ///region Errors report for getRangeGridlineStroke
    
    public void testGetRangeGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainGridlineStroke(null);
    }
    ///endregion
    
    ///region Errors report for setDomainGridlineStroke
    
    public void testSetDomainGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainGridlinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setDomainGridlinePaint
    
    public void testSetDomainGridlinePaint_errors()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields798176958902900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798176958902900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798176958908800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798176958902900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798176958908800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields798176961587800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798176961587800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798176961590100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798176961587800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798176961590100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798176961679400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798176961679400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798176961679900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798176961679400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798176961679900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

