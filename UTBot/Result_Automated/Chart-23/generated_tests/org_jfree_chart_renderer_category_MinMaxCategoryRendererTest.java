package org.jfree.chart.renderer.category;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.jfree.chart.event.ChartChangeEventType;
import java.awt.Color;
import javax.swing.event.EventListenerList;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import org.jfree.experimental.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.RingPlot;
import javax.swing.plaf.ColorUIResource;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import java.awt.GradientPaint;
import java.awt.BasicStroke;
import java.awt.geom.Area;
import java.awt.Stroke;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.ThermometerPlot;
import javax.swing.Icon;
import javax.swing.plaf.IconUIResource;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import javax.swing.ImageIcon;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.DefaultKeyedValues2D;
import java.util.ArrayList;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import javax.swing.text.DefaultCaret;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_jfree_chart_renderer_category_MinMaxCategoryRendererTest {
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.readObject(MinMaxCategoryRenderer.java:537) */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(minMaxCategoryRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
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
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(minMaxCategoryRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(minMaxCategoryRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(minMaxCategoryRenderer, readObjectMethodArguments);
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
        // 7 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.writeObject(MinMaxCategoryRenderer.java:522) */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(minMaxCategoryRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(minMaxCategoryRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    @Test(expected = NotActiveException.class)
    public void testWriteObject1() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread obj = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        Class cl = Object.class;
        setField(desc, "java.io.ObjectStreamClass", "cl", cl);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        setField(curContext, "java.io.SerialCallbackContext", "thread", obj);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = minMaxCategoryRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(minMaxCategoryRenderer, writeObjectMethodArguments);
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
        // 34 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGroupPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetGroupPaint_PaintNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Color groupPaint = ((Color) createInstance("java.awt.Color"));
            minMaxCategoryRenderer.setGroupPaint(groupPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialMinMaxCategoryRendererGroupPaint = ((Paint) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "groupPaint"));
            
            minMaxCategoryRenderer.setGroupPaint(color);
            
            Paint finalMinMaxCategoryRendererGroupPaint = ((Paint) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "groupPaint"));
            
            assertFalse(initialMinMaxCategoryRendererGroupPaint == finalMinMaxCategoryRendererGroupPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setGroupPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaint_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setGroupPaint(null);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetGroupPaint_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            RadialGradientPaint groupPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class groupPaintType = Class.forName("java.awt.Paint");
            Method setGroupPaintMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setGroupPaint", groupPaintType);
            setGroupPaintMethod.setAccessible(true);
            java.lang.Object[] setGroupPaintMethodArguments = new java.lang.Object[1];
            setGroupPaintMethodArguments[0] = groupPaint;
            setGroupPaintMethod.invoke(minMaxCategoryRenderer, setGroupPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            DialPlot dialPlot = ((DialPlot) createInstance("org.jfree.experimental.chart.plot.dial.DialPlot"));
            listenerList1[2] = ((Object) dialPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CombinedDomainCategoryPlot parent = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            parent.setParent(dialPlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) dialPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Color color = new Color(0);
            
            minMaxCategoryRenderer.setGroupPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetGroupPaint_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
            listenerList1[2] = ((Object) ringPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(ringPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) ringPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Color color = new Color(0);
            
            minMaxCategoryRenderer.setGroupPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setGroupPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            ColorUIResource groupPaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class groupPaintType = Class.forName("java.awt.Paint");
            Method setGroupPaintMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setGroupPaint", groupPaintType);
            setGroupPaintMethod.setAccessible(true);
            java.lang.Object[] setGroupPaintMethodArguments = new java.lang.Object[1];
            setGroupPaintMethodArguments[0] = groupPaint;
            setGroupPaintMethod.invoke(minMaxCategoryRenderer, setGroupPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setGroupPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupPaint_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setGroupPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupPaint_ThrowClassCastException_2() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class colorUIResourceType = Class.forName("java.awt.Paint");
            Method setGroupPaintMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setGroupPaint", colorUIResourceType);
            setGroupPaintMethod.setAccessible(true);
            java.lang.Object[] setGroupPaintMethodArguments = new java.lang.Object[1];
            setGroupPaintMethodArguments[0] = colorUIResource;
            try {
                setGroupPaintMethod.invoke(minMaxCategoryRenderer, setGroupPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetGroupPaint_ThrowIndexOutOfBoundsException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) objectList);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class colorUIResourceType = Class.forName("java.awt.Paint");
            Method setGroupPaintMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setGroupPaint", colorUIResourceType);
            setGroupPaintMethod.setAccessible(true);
            java.lang.Object[] setGroupPaintMethodArguments = new java.lang.Object[1];
            setGroupPaintMethodArguments[0] = colorUIResource;
            try {
                setGroupPaintMethod.invoke(minMaxCategoryRenderer, setGroupPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.isDrawLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDrawLines()
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#isDrawLines()}
 * @utbot.returnsFrom {@code return this.plotLines;}
 *  */
    @Test
    public void testIsDrawLines_ReturnThisPlotLines() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        boolean actual = minMaxCategoryRenderer.isDrawLines();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGroupPaint()
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getGroupPaint()}
 * @utbot.returnsFrom {@code return this.groupPaint;}
 *  */
    @Test
    public void testGetGroupPaint_ReturnThisGroupPaint() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        Paint actual = minMaxCategoryRenderer.getGroupPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupStroke
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGroupStroke()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer}
     * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getGroupStroke()}
     */
    @Test
    public void testGetGroupStroke() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer.setPlot(null);
        minMaxCategoryRenderer.setAutoPopulateSeriesStroke(false);
        minMaxCategoryRenderer.setBaseItemLabelsVisible(true);
        minMaxCategoryRenderer.setAutoPopulateSeriesPaint(false);
        StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator = new StandardCategorySeriesLabelGenerator();
        minMaxCategoryRenderer.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator);
        Color color = new Color(java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, 0.0f);
        Color color1 = new Color(0.0f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY);
        GradientPaint gradientPaint = new GradientPaint(java.lang.Float.POSITIVE_INFINITY, -1.0f, color, 0.0f, java.lang.Float.POSITIVE_INFINITY, color1, false);
        minMaxCategoryRenderer.setBaseOutlinePaint(gradientPaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, Integer.MAX_VALUE, 1.0f);
        minMaxCategoryRenderer.setBaseStroke(basicStroke);
        StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new StandardCategorySeriesLabelGenerator();
        minMaxCategoryRenderer.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator1);
        Color color2 = new Color(1, false);
        Color color3 = new Color(-1, 1, 0);
        GradientPaint gradientPaint1 = new GradientPaint(-1.0f, 0.0f, color2, 0.0f, 1.0f, color3, true);
        minMaxCategoryRenderer.setBasePaint(gradientPaint1);
        Area area = new Area(null);
        minMaxCategoryRenderer.setBaseShape(area);
        
        BasicStroke actual = ((BasicStroke) minMaxCategoryRenderer.getGroupStroke());
        
        BasicStroke expected = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getGroupStroke
    
    public void testGetGroupStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGroupStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetGroupStroke_StrokeNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            BasicStroke groupStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            minMaxCategoryRenderer.setGroupStroke(groupStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialMinMaxCategoryRendererGroupStroke = ((Stroke) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "groupStroke"));
            
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
            
            Stroke finalMinMaxCategoryRendererGroupStroke = ((Stroke) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "groupStroke"));
            
            assertFalse(initialMinMaxCategoryRendererGroupStroke == finalMinMaxCategoryRendererGroupStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setGroupStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setGroupStroke(null);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetGroupStroke_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            BasicStroke groupStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            minMaxCategoryRenderer.setGroupStroke(groupStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
            listenerList1[2] = ((Object) ringPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(ringPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetGroupStroke_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            listenerList1[2] = ((Object) multiplePiePlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CombinedDomainCategoryPlot parent = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            parent.setParent(multiplePiePlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setGroupStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            BasicStroke groupStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            minMaxCategoryRenderer.setGroupStroke(groupStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupStroke_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            BasicStroke groupStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            minMaxCategoryRenderer.setGroupStroke(groupStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetGroupStroke_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            BasicStroke groupStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            minMaxCategoryRenderer.setGroupStroke(groupStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupStroke_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setGroupStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetGroupStroke_ThrowClassCastException_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[2];
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            cyclicNumberAxis.setAutoRange(true);
            PiePlot3D plot = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            cyclicNumberAxis.setPlot(plot);
            objects[0] = ((Object) cyclicNumberAxis);
            objects[1] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            minMaxCategoryRenderer.setGroupStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDrawLines(boolean)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (this.plotLines != draw): False}
 *  */
    @Test
    public void testSetDrawLines_ThisPlotLinesEqualsDraw() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setDrawLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (this.plotLines != draw): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetDrawLines_ThisPlotLinesNotEqualsDraw() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            minMaxCategoryRenderer.setDrawLines(false);
            
            boolean finalMinMaxCategoryRendererPlotLines = ((Boolean) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines"));
            
            assertFalse(finalMinMaxCategoryRendererPlotLines);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDrawLines(boolean)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetDrawLines_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetDrawLines_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetDrawLines_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetDrawLines_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[0] = ((Object) objectList);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetDrawLines_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[2] = ((Object) objectList);
            listenerList1[3] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects1 = new java.lang.Object[1];
            DateAxis dateAxis = ((DateAxis) createInstance("org.jfree.chart.axis.DateAxis"));
            dateAxis.setAutoRange(true);
            CategoryPlot plot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            setField(plot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            dateAxis.setPlot(plot);
            objects1[0] = ((Object) dateAxis);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) objectList);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDrawLines(boolean)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: this.notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetDrawLines_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            CompassPlot compassPlot = ((CompassPlot) createInstance("org.jfree.chart.plot.CompassPlot"));
            listenerList1[0] = ((Object) compassPlot);
            listenerList1[2] = ((Object) compassPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(compassPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setDrawLines(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: this.notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetDrawLines_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "plotLines", true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ThermometerPlot thermometerPlot = ((ThermometerPlot) createInstance("org.jfree.chart.plot.ThermometerPlot"));
            listenerList1[0] = ((Object) thermometerPlot);
            listenerList1[2] = ((Object) thermometerPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CombinedDomainCategoryPlot parent = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            parent.setParent(thermometerPlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            minMaxCategoryRenderer.setDrawLines(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetMaxIcon_IconNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            Icon initialMinMaxCategoryRendererMaxIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "maxIcon"));
            
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class metalBumpsType = Class.forName("javax.swing.Icon");
            Method setMaxIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMaxIcon", metalBumpsType);
            setMaxIconMethod.setAccessible(true);
            java.lang.Object[] setMaxIconMethodArguments = new java.lang.Object[1];
            setMaxIconMethodArguments[0] = metalBumps;
            setMaxIconMethod.invoke(minMaxCategoryRenderer, setMaxIconMethodArguments);
            
            Icon finalMinMaxCategoryRendererMaxIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "maxIcon"));
            
            assertFalse(initialMinMaxCategoryRendererMaxIcon == finalMinMaxCategoryRendererMaxIcon);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMaxIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: icon == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIcon_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setMaxIcon(null);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetMaxIcon_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object maxIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class maxIconType = Class.forName("javax.swing.Icon");
            Method setMaxIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMaxIcon", maxIconType);
            setMaxIconMethod.setAccessible(true);
            java.lang.Object[] setMaxIconMethodArguments = new java.lang.Object[1];
            setMaxIconMethodArguments[0] = maxIcon;
            setMaxIconMethod.invoke(minMaxCategoryRenderer, setMaxIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ThermometerPlot thermometerPlot = ((ThermometerPlot) createInstance("org.jfree.chart.plot.ThermometerPlot"));
            listenerList1[0] = ((Object) thermometerPlot);
            listenerList1[2] = ((Object) thermometerPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(thermometerPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            minMaxCategoryRenderer.setMaxIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetMaxIcon_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ThermometerPlot thermometerPlot = ((ThermometerPlot) createInstance("org.jfree.chart.plot.ThermometerPlot"));
            listenerList1[0] = ((Object) thermometerPlot);
            listenerList1[2] = ((Object) thermometerPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CombinedRangeCategoryPlot parent = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            parent.setParent(thermometerPlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            Object object = createInstance("java.lang.Object");
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            minMaxCategoryRenderer.setMaxIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaxIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetMaxIcon_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object maxIcon = createInstance("javax.swing.plaf.metal.MetalIconFactory$FileChooserHomeFolderIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class maxIconType = Class.forName("javax.swing.Icon");
            Method setMaxIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMaxIcon", maxIconType);
            setMaxIconMethod.setAccessible(true);
            java.lang.Object[] setMaxIconMethodArguments = new java.lang.Object[1];
            setMaxIconMethodArguments[0] = maxIcon;
            setMaxIconMethod.invoke(minMaxCategoryRenderer, setMaxIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[0] = ((Object) objectList);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setMaxIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMaxIcon_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setMaxIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMaxIcon_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList1[6] = object1;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setMaxIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMaxIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMaxIcon_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object maxIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class maxIconType = Class.forName("javax.swing.Icon");
            Method setMaxIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMaxIcon", maxIconType);
            setMaxIconMethod.setAccessible(true);
            java.lang.Object[] setMaxIconMethodArguments = new java.lang.Object[1];
            setMaxIconMethodArguments[0] = maxIcon;
            setMaxIconMethod.invoke(minMaxCategoryRenderer, setMaxIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            ImageIcon imageIcon = new ImageIcon();
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            minMaxCategoryRenderer.setMaxIcon(imageIcon);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setMaxIcon
    
    public void testSetMaxIcon_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 *  */
    @Test
    public void testDrawItem() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 *  */
    @Test
    public void testDrawItem_1() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        JDBCCategoryDataset jDBCCategoryDataset = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Class clientPropertyKeyClazz = Class.forName("javax.swing.ClientPropertyKey");
        Object clientPropertyKey = getEnumConstantByName(clientPropertyKeyClazz, "JComponent_INPUT_VERIFIER");
        columnKeys.add(clientPropertyKey);
        ArrayList arrayList = new ArrayList();
        columnKeys.add(arrayList);
        columnKeys.add(null);
        columnKeys.add(null);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "data", arrayList);
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(arrayList);
        columnKeys.add(arrayList);
        columnKeys.add(arrayList);
        columnKeys.add(arrayList);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(jDBCCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class graphics2DType = Class.forName("java.awt.Graphics2D");
        Class categoryItemRendererStateType = Class.forName("org.jfree.chart.renderer.category.CategoryItemRendererState");
        Class rectangle2DType = Class.forName("java.awt.geom.Rectangle2D");
        Class categoryPlotType = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class categoryAxisType = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Class valueAxisType = Class.forName("org.jfree.chart.axis.ValueAxis");
        Class jDBCCategoryDatasetType = Class.forName("org.jfree.data.category.CategoryDataset");
        Class intType = int.class;
        Method drawItemMethod = minMaxCategoryRendererClazz.getDeclaredMethod("drawItem", graphics2DType, categoryItemRendererStateType, rectangle2DType, categoryPlotType, categoryAxisType, valueAxisType, jDBCCategoryDatasetType, intType, intType, intType);
        drawItemMethod.setAccessible(true);
        java.lang.Object[] drawItemMethodArguments = new java.lang.Object[10];
        drawItemMethodArguments[0] = ((Object) null);
        drawItemMethodArguments[1] = ((Object) null);
        drawItemMethodArguments[2] = ((Object) null);
        drawItemMethodArguments[3] = ((Object) null);
        drawItemMethodArguments[4] = ((Object) null);
        drawItemMethodArguments[5] = ((Object) null);
        drawItemMethodArguments[6] = jDBCCategoryDataset;
        drawItemMethodArguments[7] = 4;
        drawItemMethodArguments[8] = 0;
        drawItemMethodArguments[9] = -255;
        drawItemMethod.invoke(minMaxCategoryRenderer, drawItemMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowIndexOutOfBoundsException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:145)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:112)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException_3() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.gantt.TaskSeries (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.gantt.TaskSeries is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @51f848ba)]
            org.jfree.data.gantt.TaskSeriesCollection.getRowKey(TaskSeriesCollection.java:238)
            org.jfree.data.gantt.TaskSeriesCollection.getStartValue(TaskSeriesCollection.java:385)
            org.jfree.data.gantt.TaskSeriesCollection.getValue(TaskSeriesCollection.java:350)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, taskSeriesCollection, 0, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.DefaultKeyedValues (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @51f848ba)]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:145)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:112)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException_1() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.ClassCastException: class org.jfree.data.DefaultKeyedValues cannot be cast to class java.lang.Comparable (org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @51f848ba; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:147)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:112)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowIndexOutOfBoundsException_1() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:147)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:112)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException_2() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        Character character = '\u0000';
        columnKeys.add(character);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "data", columnKeys);
        columnKeys.add(defaultKeyedValues);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedValue (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedValue is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @51f848ba)]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:155)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:150)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:112)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultKeyedValues2DDataset, 2, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowIndexOutOfBoundsException_2() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.gantt.TaskSeriesCollection.getRowKey(TaskSeriesCollection.java:238)
            org.jfree.data.gantt.TaskSeriesCollection.getStartValue(TaskSeriesCollection.java:385)
            org.jfree.data.gantt.TaskSeriesCollection.getValue(TaskSeriesCollection.java:350)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, taskSeriesCollection, -1, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowIndexOutOfBoundsException_3() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        TaskSeries taskSeries = ((TaskSeries) createInstance("org.jfree.data.gantt.TaskSeries"));
        keys.add(taskSeries);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", keys);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.IndexOutOfBoundsException: Index 130 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.gantt.TaskSeriesCollection.getColumnKey(TaskSeriesCollection.java:196)
            org.jfree.data.gantt.TaskSeriesCollection.getStartValue(TaskSeriesCollection.java:386)
            org.jfree.data.gantt.TaskSeriesCollection.getValue(TaskSeriesCollection.java:350)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, taskSeriesCollection, 0, 130, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException_4() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        TaskSeries taskSeries = ((TaskSeries) createInstance("org.jfree.data.gantt.TaskSeries"));
        Long key = 0L;
        taskSeries.setKey(key);
        keys.add(taskSeries);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", keys);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.ClassCastException: class org.jfree.data.gantt.TaskSeries cannot be cast to class java.lang.Comparable (org.jfree.data.gantt.TaskSeries is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @51f848ba; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.gantt.TaskSeriesCollection.getColumnKey(TaskSeriesCollection.java:196)
            org.jfree.data.gantt.TaskSeriesCollection.getStartValue(TaskSeriesCollection.java:386)
            org.jfree.data.gantt.TaskSeriesCollection.getValue(TaskSeriesCollection.java:350)
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, taskSeriesCollection, 0, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test
    public void testDrawItem_ThrowNullPointerException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(MinMaxCategoryRenderer.java:336) */
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, null, -255, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Number value = dataset.getValue(row, column);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawItem_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        minMaxCategoryRenderer.drawItem(null, null, null, null, null, null, defaultCategoryDataset, 0, 2, -255);
    }
    ///endregion
    
    ///region Errors report for drawItem
    
    public void testDrawItem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMaxIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxIcon()
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getMaxIcon()}
 * @utbot.returnsFrom {@code return this.maxIcon;}
 *  */
    @Test
    public void testGetMaxIcon_ReturnThisMaxIcon() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        Icon actual = minMaxCategoryRenderer.getMaxIcon();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetMinIcon_IconNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            Icon initialMinMaxCategoryRendererMinIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "minIcon"));
            
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class metalBumpsType = Class.forName("javax.swing.Icon");
            Method setMinIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMinIcon", metalBumpsType);
            setMinIconMethod.setAccessible(true);
            java.lang.Object[] setMinIconMethodArguments = new java.lang.Object[1];
            setMinIconMethodArguments[0] = metalBumps;
            setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments);
            
            Icon finalMinMaxCategoryRendererMinIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "minIcon"));
            
            assertFalse(initialMinMaxCategoryRendererMinIcon == finalMinMaxCategoryRendererMinIcon);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMinIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: icon == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIcon_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setMinIcon(null);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetMinIcon_ThrowRuntimeException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object minIcon = createInstance("javax.swing.plaf.metal.MetalIconFactory$InternalFrameMinimizeIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class minIconType = Class.forName("javax.swing.Icon");
            Method setMinIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMinIcon", minIconType);
            setMinIconMethod.setAccessible(true);
            java.lang.Object[] setMinIconMethodArguments = new java.lang.Object[1];
            setMinIconMethodArguments[0] = minIcon;
            setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ThermometerPlot thermometerPlot = ((ThermometerPlot) createInstance("org.jfree.chart.plot.ThermometerPlot"));
            listenerList1[0] = ((Object) thermometerPlot);
            listenerList1[2] = ((Object) thermometerPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            parent.setParent(thermometerPlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            java.lang.Object[] setMinIconMethodArguments1 = new java.lang.Object[1];
            setMinIconMethodArguments1[0] = metalBumps;
            try {
                setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetMinIcon_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            FastScatterPlot fastScatterPlot = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            listenerList1[0] = ((Object) fastScatterPlot);
            listenerList1[2] = ((Object) fastScatterPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(fastScatterPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            Object object = createInstance("java.lang.Object");
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            minMaxCategoryRenderer.setMinIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMinIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMinIcon_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object minIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class minIconType = Class.forName("javax.swing.Icon");
            Method setMinIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMinIcon", minIconType);
            setMinIconMethod.setAccessible(true);
            java.lang.Object[] setMinIconMethodArguments = new java.lang.Object[1];
            setMinIconMethodArguments[0] = minIcon;
            setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            java.lang.Object[] setMinIconMethodArguments1 = new java.lang.Object[1];
            setMinIconMethodArguments1[0] = metalBumps;
            try {
                setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetMinIcon_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object minIcon = createInstance("javax.swing.plaf.metal.MetalIconFactory$FileChooserHomeFolderIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class minIconType = Class.forName("javax.swing.Icon");
            Method setMinIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setMinIcon", minIconType);
            setMinIconMethod.setAccessible(true);
            java.lang.Object[] setMinIconMethodArguments = new java.lang.Object[1];
            setMinIconMethodArguments[0] = minIcon;
            setMinIconMethod.invoke(minMaxCategoryRenderer, setMinIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[0] = ((Object) objectList);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setMinIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMinIcon_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setMinIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setMinIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetMinIcon_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList1[6] = object1;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setMinIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setMinIcon
    
    public void testSetMinIcon_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setObjectIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 *  */
    @Test
    public void testSetObjectIcon_IconNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            Icon initialMinMaxCategoryRendererObjectIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "objectIcon"));
            
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class metalBumpsType = Class.forName("javax.swing.Icon");
            Method setObjectIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setObjectIcon", metalBumpsType);
            setObjectIconMethod.setAccessible(true);
            java.lang.Object[] setObjectIconMethodArguments = new java.lang.Object[1];
            setObjectIconMethodArguments[0] = metalBumps;
            setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments);
            
            Icon finalMinMaxCategoryRendererObjectIcon = ((Icon) getFieldValue(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "objectIcon"));
            
            assertFalse(initialMinMaxCategoryRendererObjectIcon == finalMinMaxCategoryRendererObjectIcon);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setObjectIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: icon == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIcon_ThrowIllegalArgumentException() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        minMaxCategoryRenderer.setObjectIcon(null);
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetObjectIcon_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object objectIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class objectIconType = Class.forName("javax.swing.Icon");
            Method setObjectIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setObjectIcon", objectIconType);
            setObjectIconMethod.setAccessible(true);
            java.lang.Object[] setObjectIconMethodArguments = new java.lang.Object[1];
            setObjectIconMethodArguments[0] = objectIcon;
            setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ThermometerPlot thermometerPlot = ((ThermometerPlot) createInstance("org.jfree.chart.plot.ThermometerPlot"));
            listenerList1[0] = ((Object) thermometerPlot);
            listenerList1[2] = ((Object) thermometerPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(thermometerPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            minMaxCategoryRenderer.setObjectIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (icon == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetObjectIcon_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object objectIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class objectIconType = Class.forName("javax.swing.Icon");
            Method setObjectIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setObjectIcon", objectIconType);
            setObjectIconMethod.setAccessible(true);
            java.lang.Object[] setObjectIconMethodArguments = new java.lang.Object[1];
            setObjectIconMethodArguments[0] = objectIcon;
            setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            MeterPlot meterPlot = ((MeterPlot) createInstance("org.jfree.chart.plot.MeterPlot"));
            listenerList1[0] = ((Object) meterPlot);
            listenerList1[2] = ((Object) meterPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            CombinedRangeCategoryPlot parent = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            parent.setParent(meterPlot);
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            ImageIcon imageIcon = new ImageIcon();
            
            minMaxCategoryRenderer.setObjectIcon(imageIcon);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setObjectIcon(javax.swing.Icon)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetObjectIcon_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object objectIcon = createInstance("javax.swing.plaf.basic.BasicIconFactory$EmptyFrameIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class objectIconType = Class.forName("javax.swing.Icon");
            Method setObjectIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setObjectIcon", objectIconType);
            setObjectIconMethod.setAccessible(true);
            java.lang.Object[] setObjectIconMethodArguments = new java.lang.Object[1];
            setObjectIconMethodArguments[0] = objectIcon;
            setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            Object metalBumps = createInstance("javax.swing.plaf.metal.MetalBumps");
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            java.lang.Object[] setObjectIconMethodArguments1 = new java.lang.Object[1];
            setObjectIconMethodArguments1[0] = metalBumps;
            try {
                setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetObjectIcon_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            Object objectIcon = createInstance("javax.swing.plaf.metal.MetalIconFactory$FileChooserHomeFolderIcon");
            Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
            Class objectIconType = Class.forName("javax.swing.Icon");
            Method setObjectIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("setObjectIcon", objectIconType);
            setObjectIconMethod.setAccessible(true);
            java.lang.Object[] setObjectIconMethodArguments = new java.lang.Object[1];
            setObjectIconMethodArguments[0] = objectIcon;
            setObjectIconMethod.invoke(minMaxCategoryRenderer, setObjectIconMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            ObjectList objectList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(objectList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            listenerList1[0] = ((Object) objectList);
            listenerList1[2] = ((Object) objectList);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", objectList);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            minMaxCategoryRenderer.setObjectIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetObjectIcon_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setObjectIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#setObjectIcon(javax.swing.Icon)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetObjectIcon_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[0] = object;
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            listenerList1[5] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList1[6] = object1;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            IconUIResource iconUIResource = ((IconUIResource) createInstance("javax.swing.plaf.IconUIResource"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            minMaxCategoryRenderer.setObjectIcon(iconUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setObjectIcon
    
    public void testSetObjectIcon_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIcon(java.awt.Shape, java.awt.Paint, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final GeneralPath path = new GeneralPath(shape);
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {};
        polygon.xpoints = xpoints;
        Rectangle bounds = ((Rectangle) createInstance("java.awt.Rectangle"));
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final GeneralPath path = new GeneralPath(shape);
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 2;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        polygon.ypoints = xpoints;
        Rectangle bounds = ((Rectangle) createInstance("java.awt.Rectangle"));
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final GeneralPath path = new GeneralPath(shape);
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        int[] ypoints = {};
        polygon.ypoints = ypoints;
        Rectangle bounds = ((Rectangle) createInstance("java.awt.Rectangle"));
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int width = shape.getBounds().width;
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        int[] ypoints = {};
        polygon.ypoints = ypoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int width = shape.getBounds().width;
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 2;
        int[] xpoints = {Integer.MAX_VALUE};
        polygon.xpoints = xpoints;
        int[] ypoints = {0};
        polygon.ypoints = ypoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int width = shape.getBounds().width;
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_5() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {};
        polygon.xpoints = xpoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,java.awt.Paint,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int width = shape.getBounds().width;
 *  */
    @Test
    public void testGetIcon_ThrowNullPointerException() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(MinMaxCategoryRenderer.java:448) */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class shapeType = Class.forName("java.awt.Shape");
        Class paintType = Class.forName("java.awt.Paint");
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", shapeType, paintType, paintType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = ((Object) null);
        getIconMethodArguments[1] = ((Object) null);
        getIconMethodArguments[2] = ((Object) null);
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getIcon
    
    public void testGetIcon_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIcon(java.awt.Shape, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.invokes {@link java.awt.Shape#getBounds()}
 * @utbot.invokes {@link java.awt.Shape#getBounds()}
 *  */
    @Test
    public void testGetIcon() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = -1;
        
        Rectangle initialPolygonBounds = ((Rectangle) getFieldValue(polygon, "java.awt.Polygon", "bounds"));
        
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        Icon actual = ((Icon) getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments));
        
        Icon expected = ((Icon) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2"));
        GeneralPath val$path = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        float[] floatCoords = new float[40];
        setField(val$path, "java.awt.geom.Path2D$Float", "floatCoords", floatCoords);
        byte[] pointTypes = new byte[20];
        setField(val$path, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$path", val$path);
        setField(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$width", 1);
        setField(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$height", 1);
        setField(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "this$0", minMaxCategoryRenderer);
        
        GeneralPath expectedVal$path = ((GeneralPath) getFieldValue(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$path"));
        GeneralPath actualVal$path = ((GeneralPath) getFieldValue(actual, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$path"));
        float[] expectedVal$pathFloatCoords = ((float[]) getFieldValue(expectedVal$path, "java.awt.geom.Path2D$Float", "floatCoords"));
        float[] actualVal$pathFloatCoords = ((float[]) getFieldValue(actualVal$path, "java.awt.geom.Path2D$Float", "floatCoords"));
        int expectedVal$pathFloatCoordsSize = expectedVal$pathFloatCoords.length;
        assertEquals(expectedVal$pathFloatCoordsSize, actualVal$pathFloatCoords.length);
        assertArrayEquals(expectedVal$pathFloatCoords, actualVal$pathFloatCoords, 1.0E-6f);
        
        byte[] expectedVal$pathPointTypes = ((byte[]) getFieldValue(expectedVal$path, "java.awt.geom.Path2D", "pointTypes"));
        byte[] actualVal$pathPointTypes = ((byte[]) getFieldValue(actualVal$path, "java.awt.geom.Path2D", "pointTypes"));
        int expectedVal$pathPointTypesSize = expectedVal$pathPointTypes.length;
        assertEquals(expectedVal$pathPointTypesSize, actualVal$pathPointTypes.length);
        org.junit.Assert.assertArrayEquals(expectedVal$pathPointTypes, actualVal$pathPointTypes);
        
        int expectedVal$pathWindingRule = expectedVal$path.getWindingRule();
        int actualVal$pathWindingRule = actualVal$path.getWindingRule();
        assertEquals(expectedVal$pathWindingRule, actualVal$pathWindingRule);
        
        boolean actualVal$fill = ((Boolean) getFieldValue(actual, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$fill"));
        assertFalse(actualVal$fill);
        
        boolean actualVal$outline = ((Boolean) getFieldValue(actual, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$outline"));
        assertFalse(actualVal$outline);
        
        int expectedVal$width = ((Integer) getFieldValue(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$width"));
        int actualVal$width = ((Integer) getFieldValue(actual, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$width"));
        assertEquals(expectedVal$width, actualVal$width);
        
        int expectedVal$height = ((Integer) getFieldValue(expected, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$height"));
        int actualVal$height = ((Integer) getFieldValue(actual, "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2", "val$height"));
        assertEquals(expectedVal$height, actualVal$height);
        
        Rectangle finalPolygonBounds = ((Rectangle) getFieldValue(polygon, "java.awt.Polygon", "bounds"));
        
        assertFalse(initialPolygonBounds == finalPolygonBounds);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIcon(java.awt.Shape, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException1() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {};
        polygon.xpoints = xpoints;
        Object bounds = createInstance("javax.swing.text.JTextComponent$ComposedTextCaret");
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_11() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 2;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        polygon.ypoints = xpoints;
        Object bounds = createInstance("javax.swing.text.JTextComponent$ComposedTextCaret");
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_21() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        int[] ypoints = {};
        polygon.ypoints = ypoints;
        DefaultCaret bounds = ((DefaultCaret) createInstance("javax.swing.text.DefaultCaret"));
        setField(polygon, "java.awt.Polygon", "bounds", bounds);
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_31() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        int[] ypoints = {};
        polygon.ypoints = ypoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_41() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 2;
        int[] xpoints = {Integer.MAX_VALUE};
        polygon.xpoints = xpoints;
        int[] ypoints = {0};
        polygon.ypoints = ypoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetIcon_ThrowIndexOutOfBoundsException_51() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {};
        polygon.xpoints = xpoints;
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class polygonType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", polygonType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = polygon;
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getIcon(java.awt.Shape,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetIcon_ThrowNullPointerException1() throws Throwable  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(MinMaxCategoryRenderer.java:488) */
        Class minMaxCategoryRendererClazz = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class shapeType = Class.forName("java.awt.Shape");
        Class booleanType = boolean.class;
        Method getIconMethod = minMaxCategoryRendererClazz.getDeclaredMethod("getIcon", shapeType, booleanType, booleanType);
        getIconMethod.setAccessible(true);
        java.lang.Object[] getIconMethodArguments = new java.lang.Object[3];
        getIconMethodArguments[0] = ((Object) null);
        getIconMethodArguments[1] = false;
        getIconMethodArguments[2] = false;
        try {
            getIconMethod.invoke(minMaxCategoryRenderer, getIconMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getIcon
    
    public void testGetIcon_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getObjectIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectIcon()
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getObjectIcon()}
 * @utbot.returnsFrom {@code return this.objectIcon;}
 *  */
    @Test
    public void testGetObjectIcon_ReturnThisObjectIcon() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        Icon actual = minMaxCategoryRenderer.getObjectIcon();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMinIcon
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinIcon()
    
    /**
    @utbot.classUnderTest {@link MinMaxCategoryRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.MinMaxCategoryRenderer#getMinIcon()}
 * @utbot.returnsFrom {@code return this.minIcon;}
 *  */
    @Test
    public void testGetMinIcon_ReturnThisMinIcon() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        Icon actual = minMaxCategoryRenderer.getMinIcon();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields800054845933400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields800054845933400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass800054845941700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800054845933400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800054845941700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800054846886100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800054846886100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800054846891900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800054846886100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800054846891900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800054847597700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800054847597700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800054847600200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800054847597700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800054847600200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

