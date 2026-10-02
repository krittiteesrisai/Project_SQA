package org.jfree.chart.plot;

import org.junit.Test;
import org.jfree.chart.util.ObjectList;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.io.ObjectOutputStream;
import java.io.NotActiveException;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.event.ChartChangeEventType;
import java.awt.Paint;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.data.xy.XYDataset;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Map;
import org.jfree.chart.annotations.XYDrawableAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYLineAnnotation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.LegendItemCollection;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.XYDatasetSelectionState;
import org.jfree.chart.event.RendererChangeEvent;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_jfree_chart_plot_XYPlotTest {
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
    public void testIndexOf_ReturnResult() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.indexOf(null);
        
        assertEquals(-1, actual);
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
            org.jfree.chart.plot.XYPlot.indexOf(XYPlot.java:1444) */
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
            org.jfree.chart.plot.XYPlot.readObject(XYPlot.java:5643) */
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
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
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
            org.jfree.chart.plot.XYPlot.writeObject(XYPlot.java:5607) */
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
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)
    
    @Test
    public void testRender1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        boolean actual = xYPlot.render(null, null, 0, null, null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testRender2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        boolean actual = xYPlot.render(null, null, Integer.MIN_VALUE, null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToRangeAxes(int, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToRangeAxes(int,java.util.List)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxes_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.mapDatasetToRangeAxes(-1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToRangeAxes(int, java.util.List)
    
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList arrayList = new ArrayList();
        
        xYPlot.mapDatasetToRangeAxes(0, arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToRangeAxes(int, java.util.List)
    
    @Test
    public void testMapDatasetToRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes(XYPlot.java:1520) */
        xYPlot.mapDatasetToRangeAxes(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisLocation
    
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
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1112) */
        xYPlot.getRangeAxisLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxisLocation()
    
    @Test
    public void testGetRangeAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = xYPlot.getRangeAxisLocation();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRangeAxisLocation2() throws Exception  {
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
        
        AxisLocation actual = xYPlot.getRangeAxisLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisLocation
    
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
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1290) */
        xYPlot.getRangeAxisLocation(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisLocation(int)
    
    @Test
    public void testGetRangeAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1112)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1294) */
        xYPlot.getRangeAxisLocation(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisLocation(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisLocation4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisLocation(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxisLocations.size()
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:990) */
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
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:893)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:994) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return (AxisLocation) this.domainAxisLocations.get(0);}
 *  */
    @Test
    public void testGetDomainAxisLocation_ObjectListGet() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (AxisLocation) this.domainAxisLocations.get(0);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:893) */
        xYPlot.getDomainAxisLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation()
    
    @Test
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
        
        AxisLocation actual = xYPlot.getDomainAxisLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToDomainAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToDomainAxis(int,int)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#mapDatasetToDomainAxes(int,java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: mapDatasetToDomainAxes(index, axisIndices);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxis_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.mapDatasetToDomainAxis(-1, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    @Test
    public void testMapDatasetToDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes(XYPlot.java:1484)
            org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(XYPlot.java:1465) */
        xYPlot.mapDatasetToDomainAxis(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToDomainAxes(int, java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToDomainAxes(int,java.util.List)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxes_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.mapDatasetToDomainAxes(-1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToDomainAxes(int, java.util.List)
    
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList arrayList = new ArrayList();
        
        xYPlot.mapDatasetToDomainAxes(0, arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToDomainAxes(int, java.util.List)
    
    @Test
    public void testMapDatasetToDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes(XYPlot.java:1484) */
        xYPlot.mapDatasetToDomainAxes(0, null);
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
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1334) */
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
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1334) */
        xYPlot.setRangeAxisLocation(1, null, false);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.setRangeAxisLocation(8, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1334) */
        xYPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetRangeAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1334)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1310) */
        xYPlot.setRangeAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetRangeAxisLocation4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1334)
            org.jfree.chart.plot.XYPlot.setRangeAxisLocation(XYPlot.java:1310) */
        xYPlot.setRangeAxisLocation(0, axisLocation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)
    
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
        
        xYPlot.setRangeAxisLocation(axisLocation);
        
        ObjectList xYPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] finalXYPlotRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        assertFalse(initialXYPlotRangeAxisLocationsObjects == finalXYPlotRangeAxisLocationsObjects);
    }
    
    @Test
    public void testSetRangeAxisLocation6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList xYPlotRangeAxisLocations = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] xYPlotRangeAxisLocationsRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialXYPlotRangeAxisLocationsObjects0 = get(xYPlotRangeAxisLocationsRangeAxisLocationsObjects, 0);
        
        xYPlot.setRangeAxisLocation(axisLocation);
        
        ObjectList xYPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        java.lang.Object[] xYPlotRangeAxisLocations1RangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(xYPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalXYPlotRangeAxisLocationsObjects0 = get(xYPlotRangeAxisLocations1RangeAxisLocationsObjects, 0);
        ObjectList xYPlotRangeAxisLocations2 = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations"));
        int finalXYPlotRangeAxisLocationsSize = ((Integer) getFieldValue(xYPlotRangeAxisLocations2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialXYPlotRangeAxisLocationsObjects0 == finalXYPlotRangeAxisLocationsObjects0);
        
        assertEquals(1, finalXYPlotRangeAxisLocationsSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation7() throws Exception  {
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
    
    @Test
    public void testSetRangeAxisLocation8() throws Exception  {
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToRangeAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#mapDatasetToRangeAxis(int,int)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#mapDatasetToRangeAxes(int,java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: mapDatasetToRangeAxes(index, axisIndices);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxis_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.mapDatasetToRangeAxis(-1, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToRangeAxis(int, int)
    
    @Test
    public void testMapDatasetToRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes(XYPlot.java:1520)
            org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(XYPlot.java:1501) */
        xYPlot.mapDatasetToRangeAxis(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation1() throws Exception  {
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxisLocation
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetDomainAxisLocation2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1035)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1011) */
        xYPlot.setDomainAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetDomainAxisLocation3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1035)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1011) */
        xYPlot.setDomainAxisLocation(0, axisLocation);
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
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1035) */
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
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1035) */
        xYPlot.setDomainAxisLocation(1, null, false);
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
    public void testSetDomainAxisLocation4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.setDomainAxisLocation(8, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test(expected = OutOfMemoryError.class)
    public void testSetDomainAxisLocation5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.setDomainAxisLocation(1073741824, null, false);
    }
    
    @Test
    public void testSetDomainAxisLocation6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxisLocation(XYPlot.java:1035) */
        xYPlot.setDomainAxisLocation(0, axisLocation, false);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:969) */
        xYPlot.configureDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainZeroBaselineVisible(boolean)
    
    @Test
    public void testSetDomainZeroBaselineVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setDomainZeroBaselineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke
    
    ///region Errors report for getDomainZeroBaselineStroke
    
    public void testGetDomainZeroBaselineStroke_errors()
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
        // 1 occurrences of:
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
        // Concrete execution failed
        
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
        // Concrete execution failed
        
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
        // 2 occurrences of:
        // Concrete execution failed
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)
    
    @Test
    public void testSetSeriesRenderingOrder1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        SeriesRenderingOrder seriesRenderingOrder = ((SeriesRenderingOrder) createInstance("org.jfree.chart.plot.SeriesRenderingOrder"));
        
        SeriesRenderingOrder initialXYPlotSeriesRenderingOrder = ((SeriesRenderingOrder) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "seriesRenderingOrder"));
        
        xYPlot.setSeriesRenderingOrder(seriesRenderingOrder);
        
        SeriesRenderingOrder finalXYPlotSeriesRenderingOrder = ((SeriesRenderingOrder) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "seriesRenderingOrder"));
        
        assertFalse(initialXYPlotSeriesRenderingOrder == finalXYPlotSeriesRenderingOrder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainMinorGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainMinorGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainMinorGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainMinorGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainMinorGridlineStroke(null);
    }
    ///endregion
    
    ///region Errors report for setDomainMinorGridlineStroke
    
    public void testSetDomainMinorGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeGridlineStroke
    
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeZeroBaselineVisible(boolean)
    
    @Test
    public void testSetRangeZeroBaselineVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setRangeZeroBaselineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMinorGridlineStroke
    
    ///region Errors report for getDomainMinorGridlineStroke
    
    public void testGetDomainMinorGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainMinorGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainMinorGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainMinorGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainMinorGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetDomainMinorGridlinesVisible_ThisDomainMinorGridlinesVisibleEqualsVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainMinorGridlinesVisible(false);
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
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainMinorGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainMinorGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainMinorGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainMinorGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainMinorGridlinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setDomainMinorGridlinePaint
    
    public void testSetDomainMinorGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainMinorGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainMinorGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainMinorGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.domainMinorGridlinesVisible;}
 *  */
    @Test
    public void testIsDomainMinorGridlinesVisible_ReturnThisDomainMinorGridlinesVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainMinorGridlinesVisible();
        
        assertFalse(actual);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainGridlinesVisible(boolean)
    
    @Test
    public void testSetDomainGridlinesVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setDomainGridlinesVisible(true);
            
            xYPlot.setDomainGridlinesVisible(false);
            
            boolean finalXYPlotDomainGridlinesVisible = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainGridlinesVisible"));
            
            assertFalse(finalXYPlotDomainGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    @Test
    public void testSetDatasetRenderingOrder1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        DatasetRenderingOrder datasetRenderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
        
        DatasetRenderingOrder initialXYPlotDatasetRenderingOrder = ((DatasetRenderingOrder) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetRenderingOrder"));
        
        xYPlot.setDatasetRenderingOrder(datasetRenderingOrder);
        
        DatasetRenderingOrder finalXYPlotDatasetRenderingOrder = ((DatasetRenderingOrder) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "datasetRenderingOrder"));
        
        assertFalse(initialXYPlotDatasetRenderingOrder == finalXYPlotDatasetRenderingOrder);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRendererForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRendererForDataset(XYPlot.java:1745) */
        xYPlot.getRendererForDataset(null);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangeMinorGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeMinorGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangeMinorGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.rangeMinorGridlinesVisible;}
 *  */
    @Test
    public void testIsRangeMinorGridlinesVisible_ReturnThisRangeMinorGridlinesVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangeMinorGridlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeMinorGridlineStroke
    
    ///region Errors report for getRangeMinorGridlineStroke
    
    public void testGetRangeMinorGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMinorGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainMinorGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainMinorGridlinePaint()}
 * @utbot.returnsFrom {@code return this.domainMinorGridlinePaint;}
 *  */
    @Test
    public void testGetDomainMinorGridlinePaint_ReturnThisDomainMinorGridlinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getDomainMinorGridlinePaint();
        
        assertNull(actual);
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
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeMinorGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeMinorGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeMinorGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeMinorGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeMinorGridlineStroke(null);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeGridlinesVisible(boolean)
    
    @Test
    public void testSetRangeGridlinesVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setRangeGridlinesVisible(true);
            
            xYPlot.setRangeGridlinesVisible(false);
            
            boolean finalXYPlotRangeGridlinesVisible = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeGridlinesVisible"));
            
            assertFalse(finalXYPlotRangeGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeMinorGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeMinorGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeMinorGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeMinorGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetRangeMinorGridlinesVisible_ThisRangeMinorGridlinesVisibleEqualsVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeMinorGridlinesVisible(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeMinorGridlinesVisible(boolean)
    
    @Test
    public void testSetRangeMinorGridlinesVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setRangeMinorGridlinesVisible(true);
            
            xYPlot.setRangeMinorGridlinesVisible(false);
            
            boolean finalXYPlotRangeMinorGridlinesVisible = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeMinorGridlinesVisible"));
            
            assertFalse(finalXYPlotRangeMinorGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeMinorGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeMinorGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeMinorGridlinePaint()}
 * @utbot.returnsFrom {@code return this.rangeMinorGridlinePaint;}
 *  */
    @Test
    public void testGetRangeMinorGridlinePaint_ReturnThisRangeMinorGridlinePaint() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Paint actual = xYPlot.getRangeMinorGridlinePaint();
        
        assertNull(actual);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeMinorGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeMinorGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangeMinorGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeMinorGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeMinorGridlinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setRangeMinorGridlinePaint
    
    public void testSetRangeMinorGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers1() throws Exception  {
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainMarkers(org.jfree.chart.util.Layer)
    
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
                org.jfree.chart.plot.XYPlot.getDomainMarkers(XYPlot.java:4118)
                org.jfree.chart.plot.XYPlot.getDomainMarkers(XYPlot.java:4084) */
            xYPlot.getDomainMarkers(background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainMarkers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
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
                org.jfree.chart.plot.XYPlot.getDomainMarkers(XYPlot.java:4115) */
            xYPlot.getDomainMarkers(-255, foreground);
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            Collection actual = xYPlot.getDomainMarkers(0, foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testGetDomainMarkers4() throws Exception  {
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
            
            Collection actual = xYPlot.getDomainMarkers(0, null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
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
    
    ///region OTHER: ERROR SUITE for method getRangeMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetRangeMarkers3() throws Exception  {
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
                org.jfree.chart.plot.XYPlot.getRangeMarkers(XYPlot.java:4144)
                org.jfree.chart.plot.XYPlot.getRangeMarkers(XYPlot.java:4097) */
            xYPlot.getRangeMarkers(background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetRangeMarkers4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Collection actual = xYPlot.getRangeMarkers(0, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeGridlines
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    @Test
    public void testDrawRangeGridlines1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeGridlines(null, null, null);
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
            org.jfree.chart.plot.XYPlot.drawAnnotations(XYPlot.java:3999) */
        xYPlot.drawAnnotations(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    @Test
    public void testDrawDomainMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainMarkers(null, null, Integer.MIN_VALUE, null);
    }
    
    @Test
    public void testDrawDomainMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainMarkers(null, null, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    @Test
    public void testDrawRangeMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeMarkers(null, null, Integer.MIN_VALUE, null);
    }
    
    @Test
    public void testDrawRangeMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawRangeMarkers(null, null, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawHorizontalLine
    
    ///region OTHER: ERROR SUITE for method drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)
    
    @Test
    public void testDrawHorizontalLine1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawHorizontalLine] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.drawHorizontalLine(XYPlot.java:4170) */
        xYPlot.drawHorizontalLine(null, null, java.lang.Double.NaN, null, null);
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
            org.jfree.chart.plot.XYPlot.getDomainAxisCount(XYPlot.java:945) */
        xYPlot.getDomainAxisCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1210) */
        xYPlot.setRangeAxis(0, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.setRangeAxis(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1210)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1189) */
        xYPlot.setRangeAxis(0, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.setRangeAxis(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1095) */
        xYPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis6() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1167)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1071)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1090) */
        xYPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis7() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:4384)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:4433)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:434)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:417)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:1044)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1086) */
        xYPlot.setRangeAxis(numberAxis);
    }
    
    @Test
    public void testSetRangeAxis8() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        DateAxis dateAxis = ((DateAxis) createInstance("org.jfree.chart.axis.DateAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1166)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1071)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1090) */
        xYPlot.setRangeAxis(dateAxis);
    }
    
    @Test
    public void testSetRangeAxis9() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1095) */
        xYPlot.setRangeAxis(numberAxis);
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
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1229) */
        xYPlot.setRangeAxes(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {};
        
        xYPlot.setRangeAxes(valueAxisArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1167)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1203)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1230) */
        xYPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRangeAxis(XYPlot.java:1210)
            org.jfree.chart.plot.XYPlot.setRangeAxes(XYPlot.java:1230) */
        xYPlot.setRangeAxes(valueAxisArray);
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
            org.jfree.chart.plot.XYPlot.getRangeAxisCount(XYPlot.java:1243) */
        xYPlot.getRangeAxisCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxis
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    @Test
    public void testGetRangeAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis(int)
    
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
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1166) */
        xYPlot.getRangeAxis(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis(int)
    
    @Test
    public void testGetRangeAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRangeAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = xYPlot.getRangeAxis(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis(int)
    
    @Test
    public void testGetRangeAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1167) */
        xYPlot.getRangeAxis(0);
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
            org.jfree.chart.plot.XYPlot.clearDomainAxes(XYPlot.java:955) */
        xYPlot.clearDomainAxes();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearDomainAxes()
    
    @Test
    public void testClearDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.clearDomainAxes(XYPlot.java:956) */
        xYPlot.clearDomainAxes();
    }
    
    @Test
    public void testClearDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3429)
            org.jfree.chart.util.AbstractObjectList.clear(AbstractObjectList.java:139)
            org.jfree.chart.plot.XYPlot.clearDomainAxes(XYPlot.java:961) */
        xYPlot.clearDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisEdge
    
    ///region OTHER: ERROR SUITE for method getDomainAxisEdge()
    
    @Test
    public void testGetDomainAxisEdge1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:893)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:933) */
        xYPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisEdge
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        xYPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisEdge(int)
    
    @Test
    public void testGetDomainAxisEdge3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:893)
            org.jfree.chart.plot.XYPlot.getDomainAxisLocation(XYPlot.java:994)
            org.jfree.chart.plot.XYPlot.getDomainAxisEdge(XYPlot.java:1051) */
        xYPlot.getDomainAxisEdge(Integer.MIN_VALUE);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxis
    
    ///region OTHER: ERROR SUITE for method getDomainAxis()
    
    @Test
    public void testGetDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:802)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:788) */
        xYPlot.getDomainAxis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis(int)
    
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
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:802) */
        xYPlot.getDomainAxis(-255);
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
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:879) */
        xYPlot.setDomainAxes(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:802)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:853)
            org.jfree.chart.plot.XYPlot.setDomainAxes(XYPlot.java:880) */
        xYPlot.setDomainAxes(valueAxisArray);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setAxisOffset(org.jfree.chart.util.RectangleInsets)
    
    @Test
    public void testSetAxisOffset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        
        RectangleInsets initialXYPlotAxisOffset = ((RectangleInsets) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "axisOffset"));
        
        xYPlot.setAxisOffset(rectangleInsets);
        
        RectangleInsets finalXYPlotAxisOffset = ((RectangleInsets) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "axisOffset"));
        
        assertFalse(initialXYPlotAxisOffset == finalXYPlotAxisOffset);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    @Test
    public void testSetOrientation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        PlotOrientation initialXYPlotOrientation = ((PlotOrientation) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "orientation"));
        
        xYPlot.setOrientation(plotOrientation);
        
        PlotOrientation finalXYPlotOrientation = ((PlotOrientation) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "orientation"));
        
        assertFalse(initialXYPlotOrientation == finalXYPlotOrientation);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisEdge(int)
    
    @Test
    public void testGetRangeAxisEdge2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1112)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1294)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1351) */
        xYPlot.getRangeAxisEdge(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisEdge
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        xYPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisEdge()
    
    @Test
    public void testGetRangeAxisEdge4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisEdge] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRangeAxisLocation(XYPlot.java:1112)
            org.jfree.chart.plot.XYPlot.getRangeAxisEdge(XYPlot.java:1151) */
        xYPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetDomainAxis1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:839)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:825) */
        xYPlot.setDomainAxis(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetDomainAxis2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:860) */
        xYPlot.setDomainAxis(0, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.setDomainAxis(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainAxis
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetDomainAxis4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:860)
            org.jfree.chart.plot.XYPlot.setDomainAxis(XYPlot.java:839) */
        xYPlot.setDomainAxis(0, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.setDomainAxis(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getPlotType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPlotType()
    
    @Test
    public void testGetPlotType1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        String actual = xYPlot.getPlotType();
        
        String expected = "XY Plot";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRenderer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenderer(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenderer(int)
    
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
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1590) */
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
    
    ///region OTHER: ERROR SUITE for method getRenderer(int)
    
    @Test
    public void testGetRenderer2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getRenderer(XYPlot.java:1591) */
        xYPlot.getRenderer(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRenderer
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRenderer()
    
    @Test
    public void testGetRenderer3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRenderer4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) xYPlot);
        objects[2] = ((Object) xYPlot);
        objects[3] = ((Object) xYPlot);
        objects[4] = ((Object) xYPlot);
        objects[5] = ((Object) xYPlot);
        objects[6] = ((Object) xYPlot);
        objects[7] = ((Object) xYPlot);
        objects[8] = ((Object) xYPlot);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        XYItemRenderer actual = xYPlot.getRenderer();
        
        assertNull(actual);
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
            org.jfree.chart.plot.XYPlot.getDatasetCount(XYPlot.java:1431) */
        xYPlot.getDatasetCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRenderer1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.setRenderer(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)
    
    @Test
    public void testSetRenderer2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1639) */
        xYPlot.setRenderer(0, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRenderer3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.setRenderer(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testSetRenderer4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1639)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1620) */
        xYPlot.setRenderer(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testSetRenderer5() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1639)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1620)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1607) */
        xYPlot.setRenderer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setWeight
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setWeight(int)
    
    @Test
    public void testSetWeight1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setWeight(0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testSetDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureDomainAxes(XYPlot.java:969)
            org.jfree.chart.plot.XYPlot.datasetChanged(XYPlot.java:4529)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1422)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1399) */
        xYPlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1415)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1399) */
        xYPlot.setDataset(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(int, org.jfree.data.xy.XYDataset)
    
    @Test
    public void testSetDataset3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setDataset(XYPlot.java:1415) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ObjectListIndexOf() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getIndexOf] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getIndexOf(XYPlot.java:1731) */
        xYPlot.getIndexOf(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)
    
    @Test
    public void testGetIndexOf1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        int actual = xYPlot.getIndexOf(null);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testGetIndexOf2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        XYDotRenderer xYDotRenderer = ((XYDotRenderer) createInstance("org.jfree.chart.renderer.xy.XYDotRenderer"));
        
        int actual = xYPlot.getIndexOf(xYDotRenderer);
        
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
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1658) */
        xYPlot.setRenderers(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRenderers([Lorg.jfree.chart.renderer.xy.XYItemRenderer;)
    
    @Test
    public void testSetRenderers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray = {};
        
        xYPlot.setRenderers(xYItemRendererArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.xy.XYItemRenderer;)
    
    @Test
    public void testSetRenderers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.XYPlot.setRenderer(XYPlot.java:1639)
            org.jfree.chart.plot.XYPlot.setRenderers(XYPlot.java:1659) */
        xYPlot.setRenderers(xYItemRendererArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearRangeAxes()
    
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
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1253) */
        xYPlot.clearRangeAxes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearRangeAxes()
    
    @Test
    public void testClearRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.clearRangeAxes();
        
        ObjectList xYPlotRangeAxes = ((ObjectList) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes"));
        int finalXYPlotRangeAxesSize = ((Integer) getFieldValue(xYPlotRangeAxes, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertEquals(0, finalXYPlotRangeAxesSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearRangeAxes()
    
    @Test
    public void testClearRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.clearRangeAxes(XYPlot.java:1254) */
        xYPlot.clearRangeAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRendererCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRendererCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.renderers.size();}
 *  */
    @Test
    public void testGetRendererCount_ObjectListSize() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        int actual = xYPlot.getRendererCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRendererCount()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRendererCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.renderers.size();
 *  */
    @Test
    public void testGetRendererCount_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRendererCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRendererCount(XYPlot.java:1565) */
        xYPlot.getRendererCount();
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.checkAxisIndices
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkAxisIndices(java.util.List)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#checkAxisIndices(java.util.List)}
 * @utbot.executesCondition {@code (indices == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckAxisIndices_IndicesEqualsNull() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class listType = Class.forName("java.util.List");
        Method checkAxisIndicesMethod = xYPlotClazz.getDeclaredMethod("checkAxisIndices", listType);
        checkAxisIndicesMethod.setAccessible(true);
        java.lang.Object[] checkAxisIndicesMethodArguments = new java.lang.Object[1];
        checkAxisIndicesMethodArguments[0] = ((Object) null);
        checkAxisIndicesMethod.invoke(xYPlot, checkAxisIndicesMethodArguments);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.configureRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1269) */
        xYPlot.configureRangeAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.returnsFrom {@code return getDataset(0);}
 *  */
    @Test
    public void testGetDataset_XYPlotGetDataset() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataset()
    
    @Test
    public void testGetDataset1() throws Exception  {
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
        
        XYDataset actual = xYPlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
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
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1383) */
        xYPlot.getDataset(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    @Test
    public void testGetDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        XYDataset actual = xYPlot.getDataset(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDataset(int)
    
    @Test
    public void testGetDataset3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.getDataset(XYPlot.java:1384) */
        xYPlot.getDataset(0);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setQuadrantOrigin(java.awt.geom.Point2D)
    
    @Test
    public void testSetQuadrantOrigin1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        Point point = new Point();
        
        Point2D initialXYPlotQuadrantOrigin = ((Point2D) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantOrigin"));
        
        xYPlot.setQuadrantOrigin(point);
        
        Point2D finalXYPlotQuadrantOrigin = ((Point2D) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "quadrantOrigin"));
        
        assertFalse(initialXYPlotQuadrantOrigin == finalXYPlotQuadrantOrigin);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearDomainMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearDomainMarkers()
    
    @Test
    public void testClearDomainMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
        
        xYPlot.clearDomainMarkers();
    }
    
    @Test
    public void testClearDomainMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
        
        xYPlot.clearDomainMarkers();
        
        Map finalXYPlotBackgroundDomainMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers"));
        
        assertNull(finalXYPlotBackgroundDomainMarkers);
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
            org.jfree.chart.plot.XYPlot.clearDomainMarkers(XYPlot.java:2533) */
        xYPlot.clearDomainMarkers(1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearDomainMarkers(int)
    
    @Test
    public void testClearDomainMarkers3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
        
        xYPlot.clearDomainMarkers(0);
    }
    
    @Test
    public void testClearDomainMarkers4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.clearDomainMarkers(0);
        
        Map finalXYPlotBackgroundDomainMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundDomainMarkers"));
        Map finalXYPlotForegroundRangeMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers"));
        
        assertNull(finalXYPlotBackgroundDomainMarkers);
        
        assertNull(finalXYPlotForegroundRangeMarkers);
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
            org.jfree.chart.plot.XYPlot.getQuadrantPaint(XYPlot.java:2427) */
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
            org.jfree.chart.plot.XYPlot.getQuadrantPaint(XYPlot.java:2427) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_1() throws Exception  {
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
    public void testAddDomainMarker_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addDomainMarker(-255, null, null);
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
    public void testAddDomainMarker_ThrowIllegalArgumentException_11() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        xYPlot.addDomainMarker(-255, categoryMarker, null, false);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
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
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2590)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2562)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2478)
                org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2462) */
            xYPlot.addDomainMarker(intervalMarker);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addDomainMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#addDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        xYPlot.addDomainMarker(intervalMarker, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.addDomainMarker(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddDomainMarker3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.addDomainMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Marker.addChangeListener(Marker.java:534)
            org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2607)
            org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2562)
            org.jfree.chart.plot.XYPlot.addDomainMarker(XYPlot.java:2478) */
        xYPlot.addDomainMarker(intervalMarker, layer);
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
            org.jfree.chart.plot.XYPlot.setQuadrantPaint(XYPlot.java:2444) */
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
            org.jfree.chart.plot.XYPlot.setQuadrantPaint(XYPlot.java:2444) */
        xYPlot.setQuadrantPaint(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker1() throws Exception  {
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
            
            boolean actual = xYPlot.removeDomainMarker(intervalMarker, layer);
            
            assertFalse(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2679)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2658)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2641) */
            xYPlot.removeDomainMarker(null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
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
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2683) */
            xYPlot.removeDomainMarker(0, null, null, false);
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
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2679) */
            xYPlot.removeDomainMarker(0, null, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
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
            
            boolean actual = xYPlot.removeDomainMarker(0, valueMarker, null);
            
            assertFalse(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker6() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2679)
                org.jfree.chart.plot.XYPlot.removeDomainMarker(XYPlot.java:2658) */
            xYPlot.removeDomainMarker(0, null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeDomainMarker
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeDomainMarker(org.jfree.chart.plot.Marker)
    
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
            
            boolean actual = xYPlot.removeDomainMarker(null);
            
            assertFalse(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
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
            org.jfree.chart.plot.XYPlot.draw(XYPlot.java:3154) */
        xYPlot.draw(null, null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for draw
    
    public void testDraw_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearRangeMarkers()
    
    @Test
    public void testClearRangeMarkers1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundRangeMarkers", backgroundRangeMarkers);
        
        xYPlot.clearRangeMarkers();
    }
    
    @Test
    public void testClearRangeMarkers2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        xYPlot.clearRangeMarkers();
        
        Map finalXYPlotBackgroundRangeMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundRangeMarkers"));
        
        assertNull(finalXYPlotBackgroundRangeMarkers);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearRangeMarkers(int)
    
    @Test
    public void testClearRangeMarkers3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        LinkedHashMap backgroundRangeMarkers = new LinkedHashMap();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundRangeMarkers", backgroundRangeMarkers);
        
        xYPlot.clearRangeMarkers(0);
    }
    
    @Test
    public void testClearRangeMarkers4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.clearRangeMarkers(0);
        
        Map finalXYPlotForegroundRangeMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "foregroundRangeMarkers"));
        Map finalXYPlotBackgroundRangeMarkers = ((Map) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "backgroundRangeMarkers"));
        
        assertNull(finalXYPlotForegroundRangeMarkers);
        
        assertNull(finalXYPlotBackgroundRangeMarkers);
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
    public void testRemoveRangeMarker_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeRangeMarker(-255, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testRemoveRangeMarker1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2922) */
        xYPlot.removeRangeMarker(0, categoryMarker, null, false);
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
    public void testRemoveRangeMarker_ThrowIllegalArgumentException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.removeRangeMarker(-255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveRangeMarker2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2922)
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2894) */
        xYPlot.removeRangeMarker(0, intervalMarker, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.removeRangeMarker
    
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2918)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2894)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2877)
                org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2861) */
            xYPlot.removeRangeMarker(intervalMarker);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
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
    public void testRemoveRangeMarker4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2922)
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2894)
            org.jfree.chart.plot.XYPlot.removeRangeMarker(XYPlot.java:2877) */
        xYPlot.removeRangeMarker(categoryMarker, null);
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
        XYDrawableAnnotation xYDrawableAnnotation = ((XYDrawableAnnotation) createInstance("org.jfree.chart.annotations.XYDrawableAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.addAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.addAnnotation(XYPlot.java:2961) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYDrawableAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method addAnnotationMethod = xYPlotClazz.getDeclaredMethod("addAnnotation", xYDrawableAnnotationType, booleanType);
        addAnnotationMethod.setAccessible(true);
        java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
        addAnnotationMethodArguments[0] = xYDrawableAnnotation;
        addAnnotationMethodArguments[1] = false;
        try {
            addAnnotationMethod.invoke(xYPlot, addAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    @Test
    public void testAddAnnotation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList annotations = new ArrayList();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "annotations", annotations);
        XYShapeAnnotation xYShapeAnnotation = ((XYShapeAnnotation) createInstance("org.jfree.chart.annotations.XYShapeAnnotation"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYShapeAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method addAnnotationMethod = xYPlotClazz.getDeclaredMethod("addAnnotation", xYShapeAnnotationType, booleanType);
        addAnnotationMethod.setAccessible(true);
        java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
        addAnnotationMethodArguments[0] = xYShapeAnnotation;
        addAnnotationMethodArguments[1] = false;
        addAnnotationMethod.invoke(xYPlot, addAnnotationMethodArguments);
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
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2791)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2770)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2724)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2708) */
            xYPlot.addRangeMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddRangeMarker2() throws Exception  {
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
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2808)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2770) */
            xYPlot.addRangeMarker(0, null, null);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#addRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
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
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2808) */
            xYPlot.addRangeMarker(-255, null, null, false);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testAddRangeMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2791) */
            xYPlot.addRangeMarker(0, null, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
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
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2808)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2770)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2724) */
            xYPlot.addRangeMarker(null, null);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddRangeMarker5() throws Exception  {
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
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2800)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2770)
                org.jfree.chart.plot.XYPlot.addRangeMarker(XYPlot.java:2724) */
            xYPlot.addRangeMarker(null, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
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
            org.jfree.chart.plot.XYPlot.clearAnnotations(XYPlot.java:3024) */
        xYPlot.clearAnnotations();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearAnnotations()
    
    @Test
    public void testClearAnnotations1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList annotations = new ArrayList();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "annotations", annotations);
        
        xYPlot.clearAnnotations();
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
        XYDrawableAnnotation xYDrawableAnnotation = ((XYDrawableAnnotation) createInstance("org.jfree.chart.annotations.XYDrawableAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.removeAnnotation(XYPlot.java:2997) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYDrawableAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method removeAnnotationMethod = xYPlotClazz.getDeclaredMethod("removeAnnotation", xYDrawableAnnotationType, booleanType);
        removeAnnotationMethod.setAccessible(true);
        java.lang.Object[] removeAnnotationMethodArguments = new java.lang.Object[2];
        removeAnnotationMethodArguments[0] = xYDrawableAnnotation;
        removeAnnotationMethodArguments[1] = false;
        try {
            removeAnnotationMethod.invoke(xYPlot, removeAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)
    
    @Test
    public void testRemoveAnnotation1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ArrayList annotations = new ArrayList();
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "annotations", annotations);
        XYLineAnnotation xYLineAnnotation = ((XYLineAnnotation) createInstance("org.jfree.chart.annotations.XYLineAnnotation"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYLineAnnotationType = Class.forName("org.jfree.chart.annotations.XYAnnotation");
        Class booleanType = boolean.class;
        Method removeAnnotationMethod = xYPlotClazz.getDeclaredMethod("removeAnnotation", xYLineAnnotationType, booleanType);
        removeAnnotationMethod.setAccessible(true);
        java.lang.Object[] removeAnnotationMethodArguments = new java.lang.Object[2];
        removeAnnotationMethodArguments[0] = xYLineAnnotation;
        removeAnnotationMethodArguments[1] = false;
        boolean actual = ((Boolean) removeAnnotationMethod.invoke(xYPlot, removeAnnotationMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.calculateAxisSpace
    
    ///region OTHER: ERROR SUITE for method calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testCalculateAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:3127)
            org.jfree.chart.plot.XYPlot.calculateAxisSpace(XYPlot.java:3039) */
        xYPlot.calculateAxisSpace(null, null);
    }
    
    @Test
    public void testCalculateAxisSpace2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.AxisSpace.shrink(AxisSpace.java:245)
            org.jfree.chart.plot.XYPlot.calculateAxisSpace(XYPlot.java:3040) */
        xYPlot.calculateAxisSpace(null, null);
    }
    
    @Test
    public void testCalculateAxisSpace3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace fixedRangeAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        fixedRangeAxisSpace.setTop(0.0);
        fixedRangeAxisSpace.setBottom(0.0);
        fixedRangeAxisSpace.setLeft(0.0);
        fixedRangeAxisSpace.setRight(0.0);
        xYPlot.setFixedRangeAxisSpace(fixedRangeAxisSpace);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.AxisSpace.shrink(AxisSpace.java:245)
            org.jfree.chart.plot.XYPlot.calculateAxisSpace(XYPlot.java:3040) */
        xYPlot.calculateAxisSpace(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawQuadrants
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawQuadrants1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.drawQuadrants(null, null);
    }
    
    @Test
    public void testDrawQuadrants2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.drawQuadrants(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawBackground
    
    ///region OTHER: ERROR SUITE for method drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawBackground1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        xYPlot.setOrientation(orientation);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawBackground] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:802)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:788)
            org.jfree.chart.plot.XYPlot.drawQuadrants(XYPlot.java:3432)
            org.jfree.chart.plot.XYPlot.drawBackground(XYPlot.java:3413) */
        xYPlot.drawBackground(null, null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis
    
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
    
    ///region OTHER: ERROR SUITE for method getDatasetsMappedToDomainAxis(java.lang.Integer)
    
    @Test
    public void testGetDatasetsMappedToDomainAxis1() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(XYPlot.java:4327) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangeTickBandPaint
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeTickBandPaint(java.awt.Paint)
    
    @Test
    public void testSetRangeTickBandPaint1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangeTickBandPaint(null);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#calculateDomainAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedDomainAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testCalculateDomainAxisSpace_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(XYPlot.java:3079) */
        xYPlot.calculateDomainAxisSpace(null, null, axisSpace);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateDomainAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        xYPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = xYPlot.calculateDomainAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateDomainAxisSpace2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(XYPlot.java:3079) */
        xYPlot.calculateDomainAxisSpace(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke
    
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
    
    ///region Errors report for setRangeZeroBaselinePaint
    
    public void testSetRangeZeroBaselinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeCrosshairVisible(boolean)
    
    @Test
    public void testSetRangeCrosshairVisible1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairVisible(true);
        
        xYPlot.setRangeCrosshairVisible(false);
        
        boolean finalXYPlotRangeCrosshairVisible = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeCrosshairVisible"));
        
        assertFalse(finalXYPlotRangeCrosshairVisible);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeCrosshairLockedOnData(boolean)
    
    @Test
    public void testSetRangeCrosshairLockedOnData1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setRangeCrosshairLockedOnData(true);
            
            xYPlot.setRangeCrosshairLockedOnData(false);
            
            boolean finalXYPlotRangeCrosshairLockedOnData = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeCrosshairLockedOnData"));
            
            assertFalse(finalXYPlotRangeCrosshairLockedOnData);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double)
    
    @Test
    public void testSetRangeCrosshairValue1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setRangeCrosshairVisible(true);
        xYPlot.setRangeCrosshairValue(0.0);
        
        xYPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        double finalXYPlotRangeCrosshairValue = ((Double) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalXYPlotRangeCrosshairValue, 1.0E-6);
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
        // Concrete execution failed
        
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
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        xYPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        
        xYPlot.setFixedDomainAxisSpace(null, false);
        
        AxisSpace finalXYPlotFixedDomainAxisSpace = ((AxisSpace) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "fixedDomainAxisSpace"));
        
        assertNull(finalXYPlotFixedDomainAxisSpace);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    @Test
    public void testSetFixedDomainAxisSpace1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setFixedDomainAxisSpace(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testSetFixedDomainAxisSpace2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setFixedDomainAxisSpace(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testSetFixedDomainAxisSpace3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setNotify(true);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Plot.notifyListeners(Plot.java:965)
                org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:979)
                org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(XYPlot.java:4904)
                org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(XYPlot.java:4887) */
            xYPlot.setFixedDomainAxisSpace(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#drawZeroDomainBaseline(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.executesCondition {@code (isDomainZeroBaselineVisible()): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#isDomainZeroBaselineVisible()}
 *  */
    @Test
    public void testDrawZeroDomainBaseline_NotIsDomainZeroBaselineVisible() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.drawZeroDomainBaseline(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawZeroDomainBaseline1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setDomainZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:802)
            org.jfree.chart.plot.XYPlot.getDomainAxis(XYPlot.java:788)
            org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(XYPlot.java:3967) */
        xYPlot.drawZeroDomainBaseline(null, null);
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
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedRangeAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:3126) */
        xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateRangeAxisSpace1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        AxisSpace fixedRangeAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        xYPlot.setFixedRangeAxisSpace(fixedRangeAxisSpace);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateRangeAxisSpace2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:3126) */
        xYPlot.calculateRangeAxisSpace(null, null, null);
    }
    
    @Test
    public void testCalculateRangeAxisSpace3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(XYPlot.java:3127) */
        xYPlot.calculateRangeAxisSpace(null, null, axisSpace);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis
    
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
 * @utbot.executesCondition {@code (axisIndex == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetDatasetsMappedToRangeAxis_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(XYPlot.java:4357) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDatasetsMappedToRangeAxis(java.lang.Integer)
    
    @Test
    public void testGetDatasetsMappedToRangeAxis1() throws Exception  {
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainCrosshairValue(double)
    
    @Test
    public void testSetDomainCrosshairValue1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairVisible(true);
        xYPlot.setDomainCrosshairValue(0.0);
        
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN);
        
        double finalXYPlotDomainCrosshairValue = ((Double) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalXYPlotDomainCrosshairValue, 1.0E-6);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainCrosshairValue(double, boolean)
    
    @Test
    public void testSetDomainCrosshairValue2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        xYPlot.setDomainCrosshairVisible(true);
        xYPlot.setDomainCrosshairValue(0.0);
        
        xYPlot.setDomainCrosshairValue(java.lang.Double.NaN, true);
        
        double finalXYPlotDomainCrosshairValue = ((Double) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalXYPlotDomainCrosshairValue, 1.0E-6);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainTickBandPaint
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainTickBandPaint(java.awt.Paint)
    
    @Test
    public void testSetDomainTickBandPaint1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setDomainTickBandPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainTickBandPaint(java.awt.Paint)
    
    @Test
    public void testSetDomainTickBandPaint2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setNotify(true);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.setDomainTickBandPaint] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Plot.notifyListeners(Plot.java:965)
                org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:979)
                org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(XYPlot.java:2358) */
            xYPlot.setDomainTickBandPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
        // Concrete execution failed
        
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
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setRangeZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1166)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1071)
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3983) */
        xYPlot.drawZeroRangeBaseline(null, null);
    }
    
    @Test
    public void testDrawZeroRangeBaseline2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        xYPlot.setRangeZeroBaselineVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1166)
            org.jfree.chart.plot.XYPlot.getRangeAxis(XYPlot.java:1071)
            org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(XYPlot.java:3983) */
        xYPlot.drawZeroRangeBaseline(null, null);
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
            org.jfree.chart.plot.XYPlot.drawDomainCrosshair(XYPlot.java:4198) */
        xYPlot.drawDomainCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawDomainCrosshair
    
    public void testDrawDomainCrosshair_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainCrosshairLockedOnData(boolean)
    
    @Test
    public void testSetDomainCrosshairLockedOnData1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setDomainCrosshairLockedOnData(true);
            
            xYPlot.setDomainCrosshairLockedOnData(false);
            
            boolean finalXYPlotDomainCrosshairLockedOnData = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainCrosshairLockedOnData"));
            
            assertFalse(finalXYPlotDomainCrosshairLockedOnData);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke
    
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
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisForDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getRangeAxisForDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDatasetCount()}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getRendererCount()}
 * @utbot.invokes {@link java.lang.Math#max(int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= upper
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDataset_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.getRangeAxisForDataset(-1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisForDataset(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", datasets);
        
        xYPlot.getRangeAxisForDataset(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisForDataset(int)
    
    @Test
    public void testGetRangeAxisForDataset2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(XYPlot.java:3842) */
        xYPlot.getRangeAxisForDataset(0);
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
        // Concrete execution failed
        
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
        // Concrete execution failed
        
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
    
    ///region Errors report for setRangeZeroBaselineStroke
    
    public void testSetRangeZeroBaselineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testSetFixedRangeAxisSpace1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setFixedRangeAxisSpace(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testSetFixedRangeAxisSpace2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setNotify(true);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Plot.notifyListeners(Plot.java:965)
                org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:979)
                org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(XYPlot.java:4945)
                org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(XYPlot.java:4928) */
            xYPlot.setFixedRangeAxisSpace(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    @Test
    public void testSetFixedRangeAxisSpace3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setFixedRangeAxisSpace(null, true);
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisForDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= upper
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDataset_ThrowIllegalArgumentException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.getDomainAxisForDataset(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisForDataset(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= upper): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index < 0 || index >= upper
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDataset_ThrowIllegalArgumentException_1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisForDataset(int)
    
    @Test
    public void testGetDomainAxisForDataset1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(XYPlot.java:3815) */
        xYPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.drawDomainGridlines
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    @Test
    public void testDrawDomainGridlines1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainGridlines(null, null, null);
    }
    
    @Test
    public void testDrawDomainGridlines2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "renderers", renderers);
        
        xYPlot.drawDomainGridlines(null, null, null);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainCrosshairVisible(boolean)
    
    @Test
    public void testSetDomainCrosshairVisible1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setDomainCrosshairVisible(true);
            
            xYPlot.setDomainCrosshairVisible(false);
            
            boolean finalXYPlotDomainCrosshairVisible = ((Boolean) getFieldValue(xYPlot, "org.jfree.chart.plot.XYPlot", "domainCrosshairVisible"));
            
            assertFalse(finalXYPlotDomainCrosshairVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setFixedLegendItems
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFixedLegendItems(org.jfree.chart.LegendItemCollection)
    
    @Test
    public void testSetFixedLegendItems1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            
            xYPlot.setFixedLegendItems(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setFixedLegendItems(org.jfree.chart.LegendItemCollection)
    
    @Test
    public void testSetFixedLegendItems2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            xYPlot.setNotify(true);
            
            /* This test fails because method [org.jfree.chart.plot.XYPlot.setFixedLegendItems] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Plot.notifyListeners(Plot.java:965)
                org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:979)
                org.jfree.chart.plot.XYPlot.setFixedLegendItems(XYPlot.java:5261) */
            xYPlot.setFixedLegendItems(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.findSelectionStateForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSelectionStateForDataset(org.jfree.data.xy.XYDataset, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#findSelectionStateForDataset(org.jfree.data.xy.XYDataset,java.lang.Object)}
 * @utbot.executesCondition {@code (dataset instanceof SelectableXYDataset): True}
 * @utbot.invokes {@link org.jfree.data.xy.SelectableXYDataset#getSelectionState()}
 * @utbot.returnsFrom {@code return s;}
 *  */
    @Test
    public void testFindSelectionStateForDataset_DatasetInstanceOfSelectableXYDataset() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        SimpleHistogramDataset simpleHistogramDataset = ((SimpleHistogramDataset) createInstance("org.jfree.data.statistics.SimpleHistogramDataset"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class simpleHistogramDatasetType = Class.forName("org.jfree.data.xy.XYDataset");
        Class objectType = Class.forName("java.lang.Object");
        Method findSelectionStateForDatasetMethod = xYPlotClazz.getDeclaredMethod("findSelectionStateForDataset", simpleHistogramDatasetType, objectType);
        findSelectionStateForDatasetMethod.setAccessible(true);
        java.lang.Object[] findSelectionStateForDatasetMethodArguments = new java.lang.Object[2];
        findSelectionStateForDatasetMethodArguments[0] = simpleHistogramDataset;
        findSelectionStateForDatasetMethodArguments[1] = ((Object) null);
        XYDatasetSelectionState actual = ((XYDatasetSelectionState) findSelectionStateForDatasetMethod.invoke(xYPlot, findSelectionStateForDatasetMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findSelectionStateForDataset(org.jfree.data.xy.XYDataset, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#findSelectionStateForDataset(org.jfree.data.xy.XYDataset,java.lang.Object)}
 * @utbot.executesCondition {@code (dataset instanceof SelectableXYDataset): False}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: throw new RuntimeException();
 *  */
    @Test(expected = RuntimeException.class)
    public void testFindSelectionStateForDataset_ThrowRuntimeException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class xYDatasetType = Class.forName("org.jfree.data.xy.XYDataset");
        Class objectType = Class.forName("java.lang.Object");
        Method findSelectionStateForDatasetMethod = xYPlotClazz.getDeclaredMethod("findSelectionStateForDataset", xYDatasetType, objectType);
        findSelectionStateForDatasetMethod.setAccessible(true);
        java.lang.Object[] findSelectionStateForDatasetMethodArguments = new java.lang.Object[2];
        findSelectionStateForDatasetMethodArguments[0] = ((Object) null);
        findSelectionStateForDatasetMethodArguments[1] = ((Object) null);
        try {
            findSelectionStateForDatasetMethod.invoke(xYPlot, findSelectionStateForDatasetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.jfree.chart.plot.XYPlot.drawRangeCrosshair(XYPlot.java:4264) */
        xYPlot.drawRangeCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeCrosshair
    
    public void testDrawRangeCrosshair_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDomainAxisIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
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
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:4384) */
        xYPlot.getDomainAxisIndex(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDomainAxisIndex1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        int actual = xYPlot.getDomainAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testGetDomainAxisIndex2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        DateAxis dateAxis = ((DateAxis) createInstance("org.jfree.chart.axis.DateAxis"));
        
        int actual = xYPlot.getDomainAxisIndex(dateAxis);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.datasetChanged
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method datasetChanged(org.jfree.data.general.DatasetChangeEvent)
    
    @Test
    public void testDatasetChanged1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", domainAxes);
        
        xYPlot.datasetChanged(null);
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
            org.jfree.chart.plot.XYPlot.drawVerticalLine(XYPlot.java:4235) */
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
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getDataRange
    
    ///region OTHER: ERROR SUITE for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDataRange1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.getDomainAxisIndex(XYPlot.java:4384)
            org.jfree.chart.plot.XYPlot.getDataRange(XYPlot.java:4433) */
        xYPlot.getDataRange(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.rendererChanged
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rendererChanged(org.jfree.chart.event.RendererChangeEvent)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeEvent#getSeriesVisibilityChanged()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: event.getSeriesVisibilityChanged()
 *  */
    @Test
    public void testRendererChanged_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.rendererChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.rendererChanged(XYPlot.java:4549) */
        xYPlot.rendererChanged(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method rendererChanged(org.jfree.chart.event.RendererChangeEvent)
    
    @Test
    public void testRendererChanged1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        RendererChangeEvent rendererChangeEvent = ((RendererChangeEvent) createInstance("org.jfree.chart.event.RendererChangeEvent"));
        
        xYPlot.rendererChanged(rendererChangeEvent);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rendererChanged(org.jfree.chart.event.RendererChangeEvent)
    
    @Test
    public void testRendererChanged2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        RendererChangeEvent rendererChangeEvent = ((RendererChangeEvent) createInstance("org.jfree.chart.event.RendererChangeEvent"));
        setField(rendererChangeEvent, "org.jfree.chart.event.RendererChangeEvent", "seriesVisibilityChanged", true);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.rendererChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.configureRangeAxes(XYPlot.java:1269)
            org.jfree.chart.plot.XYPlot.rendererChanged(XYPlot.java:4551) */
        xYPlot.rendererChanged(rendererChangeEvent);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.handleClick
    
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
            org.jfree.chart.plot.XYPlot.handleClick(XYPlot.java:4294) */
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
            org.jfree.chart.plot.XYPlot.handleClick(XYPlot.java:4295) */
        xYPlot.handleClick(-255, -255, plotRenderingInfo);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testHandleClick1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);
        plotRenderingInfo.setDataArea(rectangle);
        
        xYPlot.handleClick(0, 0, plotRenderingInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getRangeAxisIndex
    
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
            org.jfree.chart.plot.XYPlot.getRangeAxisIndex(XYPlot.java:4406) */
        xYPlot.getRangeAxisIndex(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetRangeAxisIndex1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        int actual = xYPlot.getRangeAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.panRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#panRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.executesCondition {@code (!isRangePannable()): True}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#isRangePannable()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPanRangeAxes_NotIsRangePannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.panRangeAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testPanRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        xYPlot.setRangePannable(true);
        
        xYPlot.panRangeAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setDomainPannable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainPannable(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setDomainPannable(boolean)}
 *  */
    @Test
    public void testSetDomainPannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setDomainPannable(false);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomRangeAxes_IterateForLoop() throws Exception  {
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
    public void testZoomRangeAxes_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:5159) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    @Test
    public void testZoomRangeAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:5160) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomRangeAxes
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomRangeAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
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
    public void testZoomRangeAxes_IterateForLoop1() throws Exception  {
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
    public void testZoomRangeAxes_ThrowNullPointerException1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:5192) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomRangeAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.zoomRangeAxes(XYPlot.java:5193) */
        xYPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomDomainAxes
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomDomainAxes1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, null, null);
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
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:5119) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomDomainAxes2() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:5120) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
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
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:5082) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    @Test
    public void testZoomDomainAxes3() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    @Test
    public void testZoomDomainAxes4() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.zoomDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.XYPlot.zoomDomainAxes(XYPlot.java:5083) */
        xYPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.getSeriesCount
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSeriesCount()
    
    @Test
    public void testGetSeriesCount1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        int actual = xYPlot.getSeriesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isDomainPannable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainPannable()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isDomainPannable()}
 * @utbot.returnsFrom {@code return this.domainPannable;}
 *  */
    @Test
    public void testIsDomainPannable_ReturnThisDomainPannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isDomainPannable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.isRangePannable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangePannable()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#isRangePannable()}
 * @utbot.returnsFrom {@code return this.rangePannable;}
 *  */
    @Test
    public void testIsRangePannable_ReturnThisRangePannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.isRangePannable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.setRangePannable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangePannable(boolean)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#setRangePannable(boolean)}
 *  */
    @Test
    public void testSetRangePannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.setRangePannable(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.panDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#panDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.executesCondition {@code (!isDomainPannable()): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPanDomainAxes_NotIsDomainPannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.panDomainAxes(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#panDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.executesCondition {@code (!isDomainPannable()): False}
 * @utbot.invokes {@link org.jfree.chart.plot.XYPlot#getDomainAxisCount()}
 *  */
    @Test
    public void testPanDomainAxes_IsDomainPannable() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "domainAxes", domainAxes);
        xYPlot.setDomainPannable(true);
        
        xYPlot.panDomainAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.canSelectByPoint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canSelectByPoint()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#canSelectByPoint()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanSelectByPoint_ReturnFalse() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.canSelectByPoint();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.convertToDataSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertToDataSpace(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#convertToDataSpace(java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.data.xy.XYDataset)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getWindingRule()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: GeneralPath result = new GeneralPath(path.getWindingRule());
 *  */
    @Test
    public void testConvertToDataSpace_ThrowNullPointerException() throws Throwable  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.convertToDataSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.convertToDataSpace(XYPlot.java:5816) */
        Class xYPlotClazz = Class.forName("org.jfree.chart.plot.XYPlot");
        Class generalPathType = Class.forName("java.awt.geom.GeneralPath");
        Class rectangle2DType = Class.forName("java.awt.geom.Rectangle2D");
        Class xYDatasetType = Class.forName("org.jfree.data.xy.XYDataset");
        Method convertToDataSpaceMethod = xYPlotClazz.getDeclaredMethod("convertToDataSpace", generalPathType, rectangle2DType, xYDatasetType);
        convertToDataSpaceMethod.setAccessible(true);
        java.lang.Object[] convertToDataSpaceMethodArguments = new java.lang.Object[3];
        convertToDataSpaceMethodArguments[0] = ((Object) null);
        convertToDataSpaceMethodArguments[1] = ((Object) null);
        convertToDataSpaceMethodArguments[2] = ((Object) null);
        try {
            convertToDataSpaceMethod.invoke(xYPlot, convertToDataSpaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.canSelectByRegion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canSelectByRegion()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#canSelectByRegion()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCanSelectByRegion_ReturnTrue() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        boolean actual = xYPlot.canSelectByRegion();
        
        assertTrue(actual);
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.clearSelection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearSelection()
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#clearSelection()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int datasetCount = this.datasets.size();
 *  */
    @Test
    public void testClearSelection_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.clearSelection] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.clearSelection(XYPlot.java:5849) */
        xYPlot.clearSelection();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearSelection()
    
    @Test
    public void testClearSelection1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        xYPlot.clearSelection();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.select
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method select(double, double, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#select(double,double,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource)}
 *  */
    @Test
    public void testSelect() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        xYPlot.select(java.lang.Double.NaN, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.XYPlot.select
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)
    
    /**
    @utbot.classUnderTest {@link XYPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.XYPlot#select(java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int datasetCount = this.datasets.size();
 *  */
    @Test
    public void testSelect_ThrowNullPointerException() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.XYPlot.select] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.XYPlot.select(XYPlot.java:5752) */
        xYPlot.select(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)
    
    @Test
    public void testSelect1() throws Exception  {
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(xYPlot, "org.jfree.chart.plot.XYPlot", "datasets", datasets);
        
        xYPlot.select(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields795776427276700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields795776427276700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass795776427289400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795776427276700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795776427289400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields795776430785900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields795776430785900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass795776430789600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795776430785900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795776430789600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields795776431043000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields795776431043000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass795776431045100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795776431043000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795776431045100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

