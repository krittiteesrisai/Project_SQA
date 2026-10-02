package org.jfree.data.xy;

import org.junit.Test;
import java.util.Date;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Method;
import javax.swing.event.EventListenerList;
import java.beans.PropertyChangeSupport;
import org.jfree.data.general.SeriesException;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_jfree_data_xy_XYSeriesTest {
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(double, double, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(double,double,boolean)}
     */
    @Test
    public void testAddWithCornerCases() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        xYSeries.add(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double, double, boolean)
    
    @Test
    public void testAdd1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        xYSeries.add(-7.291122019768597E-304, java.lang.Double.NaN, false);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.add(-1.2882297539194272E-231, java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(double,double)}
     */
    @Test
    public void testAddWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(1);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = Integer.MIN_VALUE;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        xYSeries.add(-1.1235582092889474E307, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double, double)
    
    @Test
    public void testAdd3() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        xYSeries.add(-2.0000000074505806, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.xy.XYDataItem)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(org.jfree.data.xy.XYDataItem)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#add(org.jfree.data.xy.XYDataItem,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(item, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.add(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.jfree.data.xy.XYDataItem)
    
    @Test
    public void testAdd4() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        
        xYSeries.add(xYDataItem);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.jfree.data.xy.XYDataItem)
    
    @Test
    public void testAdd5() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.indexOf(XYSeries.java:593)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:381)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:244) */
        xYSeries.add(xYDataItem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(double, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(double,java.lang.Number)}
     */
    @Test
    public void testAddWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, true);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        xYSeries.add(java.lang.Double.NEGATIVE_INFINITY, ((Number) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double, java.lang.Number)
    
    @Test
    public void testAdd6() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        xYSeries.add(java.lang.Double.NaN, ((Number) null));
    }
    
    @Test
    public void testAdd7() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "allowDuplicateXValues", true);
        
        xYSeries.add(java.lang.Double.NaN, ((Number) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(double, java.lang.Number)
    
    @Test
    public void testAdd8() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        Float float1 = 0.0f;
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:353)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:334)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:315)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:281) */
        xYSeries.add(java.lang.Double.NaN, ((Number) float1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(double, java.lang.Number, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(double,java.lang.Number,boolean)}
     */
    @Test
    public void testAdd() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        xYSeries.add(-1.1235582092889474E307, ((Number) null), false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double, java.lang.Number, boolean)
    
    @Test
    public void testAdd9() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.add(2.2250738585072014E-308, ((Number) null), false);
    }
    
    @Test
    public void testAdd10() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "allowDuplicateXValues", true);
        
        xYSeries.add(java.lang.Double.NaN, ((Number) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.Number, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(x, y, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.add(((Number) null), ((Number) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(java.lang.Number, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number)}
     */
    @Test
    public void testAdd11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setMaximumItemCount(1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method addMethod = xYSeriesClazz.getDeclaredMethod("add", numberType, numberType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = (short) -1;
        addMethodArguments[1] = -1;
        addMethod.invoke(xYSeries, addMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number)}
     */
    @Test
    public void testAdd12() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, false, false);
        xYSeries.setMaximumItemCount(1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method addMethod = xYSeriesClazz.getDeclaredMethod("add", numberType, numberType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = (short) -1;
        addMethodArguments[1] = -1;
        addMethod.invoke(xYSeries, addMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.Number, java.lang.Number)
    
    @Test
    public void testAdd13() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        Float float1 = 0.0f;
        
        xYSeries.add(float1, ((Number) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(java.lang.Number, java.lang.Number)
    
    @Test
    public void testAdd14() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        Byte byte1 = (byte) 0;
        Short short1 = (short) 0;
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:353)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:334)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:315) */
        xYSeries.add(byte1, ((Number) short1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.Number, java.lang.Number, boolean)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYDataItem item = new XYDataItem(x, y);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.add(((Number) null), ((Number) null), false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(java.lang.Number, java.lang.Number, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number,boolean)}
     */
    @Test
    public void testAddWithCornerCases1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class booleanType = boolean.class;
        Method addMethod = xYSeriesClazz.getDeclaredMethod("add", numberType, numberType, booleanType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = java.lang.Short.MIN_VALUE;
        addMethodArguments[1] = Integer.MAX_VALUE;
        addMethodArguments[2] = false;
        addMethod.invoke(xYSeries, addMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(java.lang.Number,java.lang.Number,boolean)}
     */
    @Test
    public void testAddWithCornerCases2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class booleanType = boolean.class;
        Method addMethod = xYSeriesClazz.getDeclaredMethod("add", numberType, numberType, booleanType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = java.lang.Short.MIN_VALUE;
        addMethodArguments[1] = Integer.MAX_VALUE;
        addMethodArguments[2] = true;
        addMethod.invoke(xYSeries, addMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.Number, java.lang.Number, boolean)
    
    @Test
    public void testAdd15() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        Integer integer = 0;
        Byte byte1 = (byte) 0;
        
        xYSeries.add(integer, ((Number) byte1), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.xy.XYDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(org.jfree.data.xy.XYDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: item == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException3() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.add(((XYDataItem) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.xy.XYDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#add(org.jfree.data.xy.XYDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): False}
 * @utbot.executesCondition {@code (this.autoSort): False}
 * @utbot.executesCondition {@code (!this.allowDuplicateXValues): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.data.add(item);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "allowDuplicateXValues", true);
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.add(XYSeries.java:386) */
        xYSeries.add(xYDataItem, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.jfree.data.xy.XYDataItem, boolean)
    
    @Test
    public void testAdd16() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.indexOf(XYSeries.java:593)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:381) */
        xYSeries.add(xYDataItem, false);
    }
    
    @Test
    public void testAdd17() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.add] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.xy.XYSeries.add(XYSeries.java:353) */
        xYSeries.add(xYDataItem, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_ReturnResult() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        XYDataItem actual = xYSeries.remove(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_ReturnResult_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        XYDataItem actual = xYSeries.remove(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: XYDataItem result = (XYDataItem) this.data.remove(index);
 *  */
    @Test
    public void testRemove_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.remove(XYSeries.java:419) */
        xYSeries.remove(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testRemove_ThrowClassCastException_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.remove(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testRemove_ThrowClassCastException_2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[6];
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        Class class1 = Object.class;
        listenerList[2] = ((Object) class1);
        listenerList[3] = object;
        listenerList[5] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.remove(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: XYDataItem result = (XYDataItem) this.data.remove(index);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.remove(XYSeries.java:419) */
        xYSeries.remove(-255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove(int)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(int)}
     */
    @Test
    public void testRemoveThrowsIOOBE() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.IndexOutOfBoundsException: Index -3 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.xy.XYSeries.remove(XYSeries.java:419) */
        xYSeries.remove(-3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#indexOf(java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return remove(indexOf(x));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        xYSeries.remove(((Number) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove(java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#remove(java.lang.Number)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithCornerCase() throws Throwable  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, true);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.xy.XYSeries.remove(XYSeries.java:419)
            org.jfree.data.xy.XYSeries.remove(XYSeries.java:433) */
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Method removeMethod = xYSeriesClazz.getDeclaredMethod("remove", numberType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = java.lang.Short.MIN_VALUE;
        try {
            removeMethod.invoke(xYSeries, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        boolean actual = xYSeries.equals(xYSeries);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfXYSeries() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        boolean actual = xYSeries.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): True}
 *  */
    @Test
    public void testEquals_NotSuperEquals() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        Integer key = 0;
        xYSeries.setKey(key);
        XYSeries xYSeries1 = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        boolean actual = xYSeries.equals(xYSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): True}
 *  */
    @Test
    public void testEquals_NotSuperEquals_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        Integer key = 0;
        xYSeries.setKey(key);
        XYSeries xYSeries1 = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries1.setKey(key);
        String description = "";
        xYSeries1.setDescription(description);
        
        boolean actual = xYSeries.equals(xYSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): False}
 * @utbot.executesCondition {@code (this.maximumItemCount != that.maximumItemCount): True}
 *  */
    @Test
    public void testEquals_ThisMaximumItemCountNotEqualsThatMaximumItemCount() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries.setMaximumItemCount(1);
        Integer key = 0;
        xYSeries.setKey(key);
        XYSeries xYSeries1 = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries1.setKey(key);
        
        boolean actual = xYSeries.equals(xYSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): False}
 * @utbot.executesCondition {@code (this.maximumItemCount != that.maximumItemCount): False}
 * @utbot.executesCondition {@code (this.autoSort != that.autoSort): True}
 *  */
    @Test
    public void testEquals_ThisAutoSortNotEqualsThatAutoSort() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        Integer key = 0;
        xYSeries.setKey(key);
        XYSeries xYSeries1 = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries1.setKey(key);
        
        boolean actual = xYSeries.equals(xYSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof XYSeries)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): False}
 * @utbot.executesCondition {@code (this.maximumItemCount != that.maximumItemCount): False}
 * @utbot.executesCondition {@code (this.autoSort != that.autoSort): False}
 * @utbot.executesCondition {@code (this.allowDuplicateXValues != that.allowDuplicateXValues): True}
 *  */
    @Test
    public void testEquals_ThisAllowDuplicateXValuesNotEqualsThatAllowDuplicateXValues() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "allowDuplicateXValues", true);
        Integer key = 0;
        xYSeries.setKey(key);
        XYSeries xYSeries1 = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries1.setKey(key);
        
        boolean actual = xYSeries.equals(xYSeries1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#hashCode()}
 * @utbot.executesCondition {@code (this.autoSort): False}
 * @utbot.executesCondition {@code (this.allowDuplicateXValues): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotThisAllowDuplicateXValues() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        Integer key = 0;
        xYSeries.setKey(key);
        
        int actual = xYSeries.hashCode();
        
        assertEquals(-214455, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#hashCode()}
 * @utbot.executesCondition {@code (this.autoSort): False}
 * @utbot.executesCondition {@code (this.allowDuplicateXValues): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ThisAllowDuplicateXValues() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-254);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "allowDuplicateXValues", true);
        Integer key = 0;
        xYSeries.setKey(key);
        
        int actual = xYSeries.hashCode();
        
        assertEquals(-213613, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#hashCode()}
 * @utbot.executesCondition {@code (this.autoSort): True}
 * @utbot.executesCondition {@code (this.allowDuplicateXValues): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ThisAutoSort() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        Integer key = 0;
        xYSeries.setKey(key);
        
        int actual = xYSeries.hashCode();
        
        assertEquals(-214426, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#hashCode()}
     */
    @Test
    public void testHashCode() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(2L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(false);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(1);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 3;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        int actual = xYSeries.hashCode();
        
        assertEquals(180687751, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.clone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clone()}
 * @utbot.invokes {@link org.jfree.data.general.Series#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYSeries clone = (XYSeries) super.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(false);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        XYSeries actual = ((XYSeries) xYSeries.clone());
        
        XYSeries expected = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(expected, "org.jfree.data.xy.XYSeries", "data", data);
        expected.setMaximumItemCount(Integer.MAX_VALUE);
        setField(expected, "org.jfree.data.xy.XYSeries", "autoSort", true);
        WindDataItem key = ((WindDataItem) createInstance("org.jfree.data.xy.WindDataItem"));
        Integer x = 0;
        setField(key, "org.jfree.data.xy.WindDataItem", "x", x);
        Double windDir = -1.0;
        setField(key, "org.jfree.data.xy.WindDataItem", "windDir", windDir);
        Double windForce = java.lang.Double.POSITIVE_INFINITY;
        setField(key, "org.jfree.data.xy.WindDataItem", "windForce", windForce);
        expected.setKey(key);
        String description = "\n\t\r";
        expected.setDescription(description);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.Series", "listeners", listeners);
        PropertyChangeSupport propertyChangeSupport = ((PropertyChangeSupport) createInstance("java.beans.PropertyChangeSupport"));
        setField(expected, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        // org.jfree.data.xy.XYSeries has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#indexOf(java.lang.Number)}
 * @utbot.executesCondition {@code (this.autoSort): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.data.size(); i++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testIndexOf_NotThisAutoSort() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        int actual = xYSeries.indexOf(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#indexOf(java.lang.Number)}
 * @utbot.executesCondition {@code (this.autoSort): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.data.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.data.size(); i++)
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.indexOf] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.indexOf(XYSeries.java:593) */
        xYSeries.indexOf(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexOf(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#indexOf(java.lang.Number)}
 * @utbot.executesCondition {@code (this.autoSort): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collections.binarySearch(this.data, new XYDataItem(x, null));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexOf_ThrowIllegalArgumentException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        xYSeries.indexOf(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#indexOf(java.lang.Number)}
     */
    @Test
    public void testIndexOfWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, true);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(0);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = -1;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Method indexOfMethod = xYSeriesClazz.getDeclaredMethod("indexOf", numberType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = java.lang.Short.MAX_VALUE;
        int actual = ((Integer) indexOfMethod.invoke(xYSeries, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.update
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method update(java.lang.Number, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#update(java.lang.Number,java.lang.Number)}
     */
    @Test(expected = SeriesException.class)
    public void testUpdateThrowsSEWithCornerCase() throws Throwable  {
        Date date = new Date(0L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setMaximumItemCount(-1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method updateMethod = xYSeriesClazz.getDeclaredMethod("update", numberType, numberType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[2];
        updateMethodArguments[0] = java.lang.Short.MAX_VALUE;
        updateMethodArguments[1] = 1;
        try {
            updateMethod.invoke(xYSeries, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#update(java.lang.Number,java.lang.Number)}
     */
    @Test(expected = SeriesException.class)
    public void testUpdateThrowsSEWithCornerCase1() throws Throwable  {
        Date date = new Date(0L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, false, false);
        xYSeries.setMaximumItemCount(-1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method updateMethod = xYSeriesClazz.getDeclaredMethod("update", numberType, numberType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[2];
        updateMethodArguments[0] = java.lang.Short.MAX_VALUE;
        updateMethodArguments[1] = 1;
        try {
            updateMethod.invoke(xYSeries, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): False}
 *  */
    @Test
    public void testClear_ThisDataSizeLessOrEqualZero() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 *  */
    @Test
    public void testClear_ThisDataSizeGreaterThanZero() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 *  */
    @Test
    public void testClear_ThisDataSizeGreaterThanZero_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 *  */
    @Test
    public void testClear_ThisDataSizeGreaterThanZero_2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#fireSeriesChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testClear_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.clear] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#clear()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.data.size() > 0
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.clear] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.clear(XYSeries.java:440) */
        xYSeries.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#toArray()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToArray_ReturnResult() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        double[][] actual = xYSeries.toArray();
        
        double[][] expected = new double[2][];
        double[] doubleArray = {};
        expected[0] = doubleArray;
        double[] doubleArray1 = {};
        expected[1] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#toArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < itemCount; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToArray_YNotEqualsNull() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Long x = 0L;
        setField(xYDataItem, "org.jfree.data.xy.XYDataItem", "x", x);
        xYDataItem.setY(x);
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        double[][] actual = xYSeries.toArray();
        
        double[][] expected = new double[2][];
        double[] doubleArray = {0.0};
        expected[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        expected[1] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#toArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < itemCount; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToArray_YEqualsNull() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Long x = 0L;
        setField(xYDataItem, "org.jfree.data.xy.XYDataItem", "x", x);
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        double[][] actual = xYSeries.toArray();
        
        double[][] expected = new double[2][];
        double[] doubleArray = {0.0};
        expected[0] = doubleArray;
        double[] doubleArray1 = {java.lang.Double.NaN};
        expected[1] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#toArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < itemCount; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result[0][i] = this.getX(i).doubleValue();
 *  */
    @Test
    public void testToArray_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.toArray] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.getX(XYSeries.java:465)
            org.jfree.data.xy.XYSeries.toArray(XYSeries.java:614) */
        xYSeries.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#toArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < itemCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[0][i] = this.getX(i).doubleValue();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.toArray] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.toArray(XYSeries.java:614) */
        xYSeries.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.delete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.delete(-1, -2);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.delete(-1, -2);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete_2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.delete(-1, -2);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i <= end; i++)} once
 *  */
    @Test
    public void testDelete_ListRemove() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.delete(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i <= end; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.xy.XYSeries.delete(XYSeries.java:405) */
        xYSeries.delete(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#fireSeriesChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testDelete_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.delete] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.delete(-2, -3);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i <= end; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.delete(XYSeries.java:405) */
        xYSeries.delete(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(int, int)
    
    @Test
    public void testDelete1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.xy.XYSeries.delete(XYSeries.java:405) */
        xYSeries.delete(2, 1073741824);
    }
    
    @Test
    public void testDelete2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.general.Series.notifyListeners(Series.java:326)
            org.jfree.data.general.Series.fireSeriesChanged(Series.java:314)
            org.jfree.data.xy.XYSeries.delete(XYSeries.java:407) */
        xYSeries.delete(6, 6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getItemCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.data.size();}
 *  */
    @Test
    public void testGetItemCount_ListSize() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        int actual = xYSeries.getItemCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getItemCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.size();
 *  */
    @Test
    public void testGetItemCount_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.getItemCount(XYSeries.java:186) */
        xYSeries.getItemCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getAutoSort
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAutoSort()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getAutoSort()}
 * @utbot.returnsFrom {@code return this.autoSort;}
 *  */
    @Test
    public void testGetAutoSort_ReturnThisAutoSort() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        boolean actual = xYSeries.getAutoSort();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItems()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getItems()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.data);}
 *  */
    @Test
    public void testGetItems_CollectionsUnmodifiableList() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        List actual = xYSeries.getItems();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.updateByIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateByIndex(int, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdateByIndex() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Double y = 0.0;
        xYDataItem.setY(((Number) y));
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.updateByIndex(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdateByIndex_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Double y = 0.0;
        xYDataItem.setY(((Number) y));
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.updateByIndex(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdateByIndex_2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Double y = 0.0;
        xYDataItem.setY(((Number) y));
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.updateByIndex(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateByIndex(int, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: XYDataItem item = getDataItem(index);
 *  */
    @Test
    public void testUpdateByIndex_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.updateByIndex] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.updateByIndex(XYSeries.java:489) */
        xYSeries.updateByIndex(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: XYDataItem item = getDataItem(index);
 *  */
    @Test
    public void testUpdateByIndex_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.updateByIndex] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.updateByIndex(XYSeries.java:489) */
        xYSeries.updateByIndex(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataItem#setY(java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#fireSeriesChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testUpdateByIndex_ThrowClassCastException_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Double y = 0.0;
        xYDataItem.setY(((Number) y));
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.updateByIndex] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.updateByIndex(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#updateByIndex(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: item.setY(y);
 *  */
    @Test
    public void testUpdateByIndex_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.updateByIndex] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.updateByIndex(XYSeries.java:490) */
        xYSeries.updateByIndex(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(java.lang.Number, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#addOrUpdate(java.lang.Number,java.lang.Number)}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: x == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        xYSeries.addOrUpdate(((Number) null), ((Number) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOrUpdate(java.lang.Number, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#addOrUpdate(java.lang.Number,java.lang.Number)}
     */
    @Test
    public void testAddOrUpdate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(0L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setMaximumItemCount(-1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method addOrUpdateMethod = xYSeriesClazz.getDeclaredMethod("addOrUpdate", numberType, numberType);
        addOrUpdateMethod.setAccessible(true);
        java.lang.Object[] addOrUpdateMethodArguments = new java.lang.Object[2];
        addOrUpdateMethodArguments[0] = (short) -1;
        addOrUpdateMethodArguments[1] = -1;
        XYDataItem actual = ((XYDataItem) addOrUpdateMethod.invoke(xYSeries, addOrUpdateMethodArguments));
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#addOrUpdate(java.lang.Number,java.lang.Number)}
     */
    @Test
    public void testAddOrUpdate1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(0L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, false, false);
        xYSeries.setMaximumItemCount(-1);
        
        Class xYSeriesClazz = Class.forName("org.jfree.data.xy.XYSeries");
        Class numberType = Class.forName("java.lang.Number");
        Method addOrUpdateMethod = xYSeriesClazz.getDeclaredMethod("addOrUpdate", numberType, numberType);
        addOrUpdateMethod.setAccessible(true);
        java.lang.Object[] addOrUpdateMethodArguments = new java.lang.Object[2];
        addOrUpdateMethodArguments[0] = (short) -1;
        addOrUpdateMethodArguments[1] = -1;
        XYDataItem actual = ((XYDataItem) addOrUpdateMethod.invoke(xYSeries, addOrUpdateMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(java.lang.Number, java.lang.Number)
    
    @Test
    public void testAddOrUpdate2() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        LongAdder longAdder = new LongAdder();
        BigDecimal bigDecimal = new BigDecimal(0);
        
        XYDataItem actual = xYSeries.addOrUpdate(longAdder, bigDecimal);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addOrUpdate(java.lang.Number, java.lang.Number)
    
    @Test
    public void testAddOrUpdate3() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        AtomicInteger atomicInteger = new AtomicInteger();
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.addOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.indexOf(XYSeries.java:595)
            org.jfree.data.xy.XYSeries.addOrUpdate(XYSeries.java:547) */
        xYSeries.addOrUpdate(atomicInteger, ((Number) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.addOrUpdate
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOrUpdate(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#addOrUpdate(double,double)}
     */
    @Test
    public void testAddOrUpdateWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date(-1L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("\n\t\r");
        xYSeries.setMaximumItemCount(Integer.MAX_VALUE);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = 0;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        XYDataItem actual = xYSeries.addOrUpdate(-1.1235582092889474E307, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(double, double)
    
    @Test
    public void testAddOrUpdate4() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "autoSort", true);
        
        XYDataItem actual = xYSeries.addOrUpdate(-1.4916681462834546E-154, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    @Test
    public void testAddOrUpdate5() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        XYDataItem actual = xYSeries.addOrUpdate(java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addOrUpdate(double, double)
    
    @Test
    public void testAddOrUpdate6() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.addOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.indexOf(XYSeries.java:595)
            org.jfree.data.xy.XYSeries.addOrUpdate(XYSeries.java:547)
            org.jfree.data.xy.XYSeries.addOrUpdate(XYSeries.java:527) */
        xYSeries.addOrUpdate(java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getDataItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (XYDataItem) this.data.get(index);}
 *  */
    @Test
    public void testGetDataItem_ListGet() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        XYDataItem actual = xYSeries.getDataItem(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (XYDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getDataItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454) */
        xYSeries.getDataItem(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (XYDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getDataItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454) */
        xYSeries.getDataItem(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (XYDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getDataItem] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454) */
        xYSeries.getDataItem(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getX
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getX(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getX(int)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataItem#getX()}
 * @utbot.returnsFrom {@code return getDataItem(index).getX();}
 *  */
    @Test
    public void testGetX_XYDataItemGetX() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Integer x = 0;
        setField(xYDataItem, "org.jfree.data.xy.XYDataItem", "x", x);
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        Integer actual = ((Integer) xYSeries.getX(0));
        
        assertEquals(x, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getX(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getX(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataItem(index).getX();
 *  */
    @Test
    public void testGetX_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getX] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.getX(XYSeries.java:465) */
        xYSeries.getX(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getX(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getDataItem(index).getX();
 *  */
    @Test
    public void testGetX_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getX] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.getX(XYSeries.java:465) */
        xYSeries.getX(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getX(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDataItem(index).getX();
 *  */
    @Test
    public void testGetX_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getX] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.getX(XYSeries.java:465) */
        xYSeries.getX(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getY(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getY(int)}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#getDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataItem#getY()}
 * @utbot.returnsFrom {@code return getDataItem(index).getY();}
 *  */
    @Test
    public void testGetY_XYDataItemGetY() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        XYDataItem xYDataItem = ((XYDataItem) createInstance("org.jfree.data.xy.XYDataItem"));
        Long y = 0L;
        xYDataItem.setY(y);
        data.add(xYDataItem);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        Long actual = ((Long) xYSeries.getY(0));
        
        assertEquals(y, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getY(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getY(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataItem(index).getY();
 *  */
    @Test
    public void testGetY_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getY] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.xy.XYDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.xy.XYDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.getY(XYSeries.java:476) */
        xYSeries.getY(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getY(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getDataItem(index).getY();
 *  */
    @Test
    public void testGetY_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getY] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.xy.XYSeries.getDataItem(XYSeries.java:454)
            org.jfree.data.xy.XYSeries.getY(XYSeries.java:476) */
        xYSeries.getY(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getY(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDataItem(index).getY();
 *  */
    @Test
    public void testGetY_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.getY] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.getY(XYSeries.java:476) */
        xYSeries.getY(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.createCopy
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCopy(int, int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#createCopy(int,int)}
 * @utbot.invokes {@link org.jfree.data.general.Series#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: XYSeries copy = (XYSeries) super.clone();
 *  */
    @Test
    public void testCreateCopy_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.createCopy] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.createCopy(XYSeries.java:654) */
        xYSeries.createCopy(-255, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createCopy(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.xy.XYSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#createCopy(int,int)}
     */
    @Test
    public void testCreateCopyWithCornerCase() throws Exception  {
        Date date = new Date(0L);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 1.0);
        XYSeries xYSeries = new XYSeries(oHLCDataItem, true, false);
        xYSeries.setNotify(true);
        xYSeries.setDescription("abc");
        xYSeries.setMaximumItemCount(0);
        Class windDataItemClazz = Class.forName("org.jfree.data.xy.WindDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor windDataItemConstructor = windDataItemClazz.getDeclaredConstructor(numberType, numberType, numberType);
        windDataItemConstructor.setAccessible(true);
        java.lang.Object[] windDataItemConstructorArguments = new java.lang.Object[3];
        windDataItemConstructorArguments[0] = Integer.MAX_VALUE;
        windDataItemConstructorArguments[1] = -1.0;
        windDataItemConstructorArguments[2] = java.lang.Double.POSITIVE_INFINITY;
        WindDataItem windDataItem = ((WindDataItem) windDataItemConstructor.newInstance(windDataItemConstructorArguments));
        xYSeries.setKey(windDataItem);
        
        XYSeries actual = xYSeries.createCopy(-2147483647, Integer.MIN_VALUE);
        
        XYSeries expected = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(expected, "org.jfree.data.xy.XYSeries", "data", data);
        setField(expected, "org.jfree.data.xy.XYSeries", "autoSort", true);
        WindDataItem key = ((WindDataItem) createInstance("org.jfree.data.xy.WindDataItem"));
        Integer x = Integer.MAX_VALUE;
        setField(key, "org.jfree.data.xy.WindDataItem", "x", x);
        Double windDir = -1.0;
        setField(key, "org.jfree.data.xy.WindDataItem", "windDir", windDir);
        Double windForce = java.lang.Double.POSITIVE_INFINITY;
        setField(key, "org.jfree.data.xy.WindDataItem", "windForce", windForce);
        expected.setKey(key);
        String description = "abc";
        expected.setDescription(description);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.Series", "listeners", listeners);
        PropertyChangeSupport propertyChangeSupport = ((PropertyChangeSupport) createInstance("java.beans.PropertyChangeSupport"));
        setField(expected, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        expected.setNotify(true);
        
        // org.jfree.data.xy.XYSeries has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getMaximumItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximumItemCount()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getMaximumItemCount()}
 * @utbot.returnsFrom {@code return this.maximumItemCount;}
 *  */
    @Test
    public void testGetMaximumItemCount_ReturnThisMaximumItemCount() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries.setMaximumItemCount(-255);
        
        int actual = xYSeries.getMaximumItemCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.getAllowDuplicateXValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllowDuplicateXValues()
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#getAllowDuplicateXValues()}
 * @utbot.returnsFrom {@code return this.allowDuplicateXValues;}
 *  */
    @Test
    public void testGetAllowDuplicateXValues_ReturnThisAllowDuplicateXValues() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        
        boolean actual = xYSeries.getAllowDuplicateXValues();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.xy.XYSeries.setMaximumItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (dataRemoved): True}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} twice
 *  */
    @Test
    public void testSetMaximumItemCount_DataRemoved() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        
        xYSeries.setMaximumItemCount(0);
        
        int finalXYSeriesMaximumItemCount = ((Integer) getFieldValue(xYSeries, "org.jfree.data.xy.XYSeries", "maximumItemCount"));
        
        assertEquals(0, finalXYSeriesMaximumItemCount);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (dataRemoved): True}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} twice
 *  */
    @Test
    public void testSetMaximumItemCount_DataRemoved_1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        xYSeries.setMaximumItemCount(0);
        
        int finalXYSeriesMaximumItemCount = ((Integer) getFieldValue(xYSeries, "org.jfree.data.xy.XYSeries", "maximumItemCount"));
        
        assertEquals(0, finalXYSeriesMaximumItemCount);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (dataRemoved): False}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} once
 *  */
    @Test
    public void testSetMaximumItemCount_NotDataRemoved() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        
        xYSeries.setMaximumItemCount(3);
        
        int finalXYSeriesMaximumItemCount = ((Integer) getFieldValue(xYSeries, "org.jfree.data.xy.XYSeries", "maximumItemCount"));
        
        assertEquals(3, finalXYSeriesMaximumItemCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.data.remove(0);
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowIndexOutOfBoundsException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.setMaximumItemCount] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.xy.XYSeries.setMaximumItemCount(XYSeries.java:228) */
        xYSeries.setMaximumItemCount(-1);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (dataRemoved): True}
 * @utbot.invokes {@link org.jfree.data.xy.XYSeries#fireSeriesChanged()}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} twice
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowClassCastException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        xYSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(xYSeries, "org.jfree.data.general.Series", "listeners", listeners);
        xYSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.setMaximumItemCount] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        xYSeries.setMaximumItemCount(0);
    }
    
    /**
    @utbot.classUnderTest {@link XYSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.xy.XYSeries#setMaximumItemCount(int)}
 * @utbot.iterates iterate the loop {@code while(this.data.size() > maximum)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(this.data.size() > maximum)
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowNullPointerException() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        xYSeries.setMaximumItemCount(-255);
        
        /* This test fails because method [org.jfree.data.xy.XYSeries.setMaximumItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeries.setMaximumItemCount(XYSeries.java:227) */
        xYSeries.setMaximumItemCount(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setMaximumItemCount(int)
    
    @Test
    public void testSetMaximumItemCount1() throws Exception  {
        XYSeries xYSeries = ((XYSeries) createInstance("org.jfree.data.xy.XYSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        setField(xYSeries, "org.jfree.data.xy.XYSeries", "data", data);
        
        xYSeries.setMaximumItemCount(0);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields795975654231800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields795975654231800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass795975654262900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795975654231800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795975654262900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields795975657895200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields795975657895200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass795975657898900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795975657895200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795975657898900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

