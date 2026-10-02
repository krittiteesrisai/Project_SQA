package org.jfree.data.time;

import org.junit.Test;
import java.util.ArrayList;
import org.jfree.data.general.SeriesException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.swing.event.EventListenerList;
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Date;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.plot.PieLabelRecord;
import java.util.List;
import java.util.Locale.Category;
import java.util.Locale;
import java.math.BigDecimal;
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
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_jfree_data_time_TimeSeriesTest {
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, double, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TimeSeriesDataItem item = new TimeSeriesDataItem(period, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.throwsException {@link org.jfree.data.general.SeriesException} in: add(item, notify);
 *  */
    @Test(expected = SeriesException.class)
    public void testAdd_ThrowSeriesException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        timeSeries.add(((RegularTimePeriod) day), 2.0E-323, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(period, value, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.throwsException {@link org.jfree.data.general.SeriesException} 
 *  */
    @Test(expected = SeriesException.class)
    public void testAdd_ThrowSeriesException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        timeSeries.add(((RegularTimePeriod) day), 2.0E-323);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.TimeSeriesDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: item == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((TimeSeriesDataItem) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.TimeSeriesDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): False}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getPeriod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !item.getPeriod().getClass().equals(this.timePeriodClass)
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:492) */
        timeSeries.add(timeSeriesDataItem, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.TimeSeriesDataItem, boolean)
    
    @Test(expected = SeriesException.class)
    public void testAdd1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(1073741824);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Week period = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        
        timeSeries.add(timeSeriesDataItem, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(item, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test(expected = SeriesException.class)
    public void testAdd2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        
        timeSeries.add(timeSeriesDataItem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(period, value, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), ((Number) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    @Test(expected = SeriesException.class)
    public void testAdd3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        
        timeSeries.add(((RegularTimePeriod) year), ((Number) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TimeSeriesDataItem item = new TimeSeriesDataItem(period, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), ((Number) null), false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)
    
    @Test(expected = SeriesException.class)
    public void testAdd4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(1073741824);
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        AtomicInteger atomicInteger = new AtomicInteger();
        
        timeSeries.add(((RegularTimePeriod) week), atomicInteger, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 *  */
    @Test
    public void testEquals_Object() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(timeSeries);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ObjectNotInstanceOfTimeSeries() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof TimeSeries)): True}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfTimeSeries() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 0;
        timeSeries.setKey(key);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof TimeSeries)): True}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfTimeSeries_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 0;
        timeSeries.setKey(key);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setKey(key);
        String description = "";
        timeSeries1.setDescription(description);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof TimeSeries)): True}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfTimeSeries_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 0;
        timeSeries.setKey(key);
        String description = "";
        timeSeries.setDescription(description);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setKey(key);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof TimeSeries)): True}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getDomainDescription()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getDomainDescription()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testEquals_TimeSeriesGetDomainDescription() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 0;
        timeSeries.setKey(key);
        String description = "";
        timeSeries.setDescription(description);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "domain", description);
        timeSeries1.setKey(key);
        timeSeries1.setDescription(description);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        Character key = '\u0000';
        timeSeries.setKey(key);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setKey(key);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Character key = '\u0000';
        timeSeries.setKey(key);
        String description = "";
        timeSeries.setDescription(description);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setKey(key);
        String description1 = "";
        timeSeries1.setDescription(description1);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.equals] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.equals(TimeSeries.java:992) */
        timeSeries.equals(timeSeries1);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Character key = '\u0000';
        timeSeries.setKey(key);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setKey(key);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.equals] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.equals(TimeSeries.java:992) */
        timeSeries.equals(timeSeries1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.hashCode
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Integer key = 0;
        timeSeries.setKey(key);
        
        Class initialTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        int actual = timeSeries.hashCode();
        
        assertEquals(-1210908537, actual);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        assertFalse(initialTimeSeriesTimePeriodClass == finalTimeSeriesTimePeriodClass);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Integer key = 0;
        timeSeries.setKey(key);
        
        int actual = timeSeries.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        Integer key = 0;
        timeSeries.setKey(key);
        timeSeries.setDescription(domain);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.hashCode(TimeSeries.java:1018) */
        timeSeries.hashCode();
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        Integer key = 0;
        timeSeries.setKey(key);
        timeSeries.setDescription(range);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.hashCode(TimeSeries.java:1018) */
        timeSeries.hashCode();
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", domain);
        Integer key = 0;
        timeSeries.setKey(key);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.hashCode(TimeSeries.java:1018) */
        timeSeries.hashCode();
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 0;
        timeSeries.setKey(key);
        String description = "";
        timeSeries.setDescription(description);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238)
            org.jfree.data.time.TimeSeries.hashCode(TimeSeries.java:1018) */
        timeSeries.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.clone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clone()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#createCopy(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Object clone = createCopy(0, getItemCount() - 1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.clone();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clone()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#createCopy(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object clone = createCopy(0, getItemCount() - 1);
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clone] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:889)
            org.jfree.data.time.TimeSeries.clone(TimeSeries.java:857) */
        timeSeries.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.update
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TimeSeriesDataItem temp = new TimeSeriesDataItem(period, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdate_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.update(((RegularTimePeriod) null), ((Number) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    @Test
    public void testUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        AtomicLong atomicLong = new AtomicLong();
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:613) */
        timeSeries.update(month, ((Number) atomicLong));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.update
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method update(int, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdate() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdate_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 *  */
    @Test
    public void testUpdate_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.update(0, ((Number) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method update(int, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: TimeSeriesDataItem item = getDataItem(index);
 *  */
    @Test
    public void testUpdate_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:634) */
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TimeSeriesDataItem item = getDataItem(index);
 *  */
    @Test
    public void testUpdate_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:634) */
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#setValue(java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#fireSeriesChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testUpdate_ThrowClassCastException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: item.setValue(value);
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:635) */
        timeSeries.update(0, ((Number) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 *  */
    @Test
    public void testClear() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 *  */
    @Test
    public void testClear_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 *  */
    @Test
    public void testClear_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 *  */
    @Test
    public void testClear_3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 *  */
    @Test
    public void testClear_4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        TimeSeriesTableModel timeSeriesTableModel = ((TimeSeriesTableModel) createInstance("org.jfree.data.time.TimeSeriesTableModel"));
        EventListenerList listenerList1 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList2 = {null};
        setField(listenerList1, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
        setField(timeSeriesTableModel, "javax.swing.table.AbstractTableModel", "listenerList", listenerList1);
        listenerList[1] = ((Object) timeSeriesTableModel);
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        EventListenerList timeSeriesListeners = ((EventListenerList) getFieldValue(timeSeries, "org.jfree.data.general.Series", "listeners"));
        java.lang.Object[] timeSeriesListenersListenersListenerList = ((java.lang.Object[]) getFieldValue(timeSeriesListeners, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialTimeSeriesListenersListenerList0 = get(timeSeriesListenersListenersListenerList, 0);
        
        timeSeries.clear();
        
        EventListenerList timeSeriesListeners1 = ((EventListenerList) getFieldValue(timeSeries, "org.jfree.data.general.Series", "listeners"));
        java.lang.Object[] timeSeriesListeners1ListenersListenerList = ((java.lang.Object[]) getFieldValue(timeSeriesListeners1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalTimeSeriesListenersListenerList0 = get(timeSeriesListeners1ListenersListenerList, 0);
        
        assertFalse(initialTimeSeriesListenersListenerList0 == finalTimeSeriesListenersListenerList0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testClear_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clear] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testClear_ThrowClassCastException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        TimeSeriesTableModel timeSeriesTableModel = ((TimeSeriesTableModel) createInstance("org.jfree.data.time.TimeSeriesTableModel"));
        EventListenerList listenerList1 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList2 = new java.lang.Object[2];
        listenerList2[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList2[1] = object;
        setField(listenerList1, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
        setField(timeSeriesTableModel, "javax.swing.table.AbstractTableModel", "listenerList", listenerList1);
        listenerList[1] = ((Object) timeSeriesTableModel);
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clear] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.swing.event.TableModelListener] */
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.data.size() > 0
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clear] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.clear(TimeSeries.java:803) */
        timeSeries.clear();
    }
    ///endregion
    
    ///region Errors report for clear
    
    public void testClear_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.returnsFrom {@code return getDataItem(index).getValue();}
 *  */
    @Test
    public void testGetValue_TimeSeriesDataItemGetValue() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Integer actual = ((Integer) timeSeries.getValue(0));
        
        assertEquals(value, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataItem(index).getValue();
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:444) */
        timeSeries.getValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getDataItem(index).getValue();
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:444) */
        timeSeries.getValue(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDataItem(index).getValue();
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:444) */
        timeSeries.getValue(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getIndex(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(period);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.getValue(((RegularTimePeriod) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValue(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetValue1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        
        Number actual = timeSeries.getValue(millisecond);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValue(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetValue2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:433)
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:457) */
        timeSeries.getValue(week);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.delete
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method delete(org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getIndex(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(period);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDelete_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.delete(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method delete(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testDelete1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        
        timeSeries.delete(millisecond);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testDelete2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:433)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:818) */
        timeSeries.delete(millisecond);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.delete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.delete(-2147483166, 496);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.delete(-1283793151, 922877952);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 *  */
    @Test
    public void testDelete_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.delete(-1790607111, 553648128);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i <= (end - start); i++)} once
 *  */
    @Test
    public void testDelete_ListRemove() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.delete(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.executesCondition {@code (end < start): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: end < start
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDelete_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.delete(256, 255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i <= (end - start); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:836) */
        timeSeries.delete(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#fireSeriesChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireSeriesChanged();
 *  */
    @Test
    public void testDelete_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[8];
        Object object = createInstance("java.lang.Object");
        listenerList[0] = object;
        listenerList[3] = object;
        Class class1 = Object.class;
        listenerList[4] = ((Object) class1);
        listenerList[5] = object;
        Object object1 = createInstance("java.lang.Object");
        listenerList[6] = object1;
        listenerList[7] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        timeSeries.delete(-268287999, 1946161152);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i <= (end - start); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:836) */
        timeSeries.delete(-251, -251);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(int, int)
    
    @Test
    public void testDelete3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:836) */
        timeSeries.delete(0, 8195);
    }
    
    @Test
    public void testDelete4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.general.Series.notifyListeners(Series.java:326)
            org.jfree.data.general.Series.fireSeriesChanged(Series.java:314)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:838) */
        timeSeries.delete(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getIndex
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getIndex(org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getIndex(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: period == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.getIndex(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getIndex(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetIndex1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getIndex] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:433) */
        timeSeries.getIndex(week);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.data.size();}
 *  */
    @Test
    public void testGetItemCount_ListSize() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        int actual = timeSeries.getItemCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.size();
 *  */
    @Test
    public void testGetItemCount_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:238) */
        timeSeries.getItemCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getDomainDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainDescription()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDomainDescription()}
 * @utbot.returnsFrom {@code return this.domain;}
 *  */
    @Test
    public void testGetDomainDescription_ReturnThisDomain() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        String actual = timeSeries.getDomainDescription();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setDomainDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDomainDescription_TimeSeriesFirePropertyChange() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        SwingPropertyChangeSupport propertyChangeSupport = ((SwingPropertyChangeSupport) createInstance("javax.swing.event.SwingPropertyChangeSupport"));
        Object map = createInstance("java.beans.PropertyChangeSupport$PropertyChangeListenerMap");
        setField(propertyChangeSupport, "java.beans.PropertyChangeSupport", "map", map);
        short[] source = {};
        setField(propertyChangeSupport, "java.beans.PropertyChangeSupport", "source", source);
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setDomainDescription(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Domain", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainDescription_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        Object propertyChangeSupport = createInstance("java.awt.Toolkit$DesktopPropertyChangeSupport");
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setDomainDescription(null);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Domain", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainDescription_ThrowIllegalArgumentException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        Object propertyChangeSupport = createInstance("java.awt.Toolkit$DesktopPropertyChangeSupport");
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        String string = "\u0000";
        
        timeSeries.setDomainDescription(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setDomainDescription(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
     */
    @Test
    public void testSetDomainDescriptionWithBlankString() {
        Date date = new Date(java.lang.Long.MIN_VALUE);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, 1.0, -1.0, java.lang.Double.NaN, 1.0, java.lang.Double.NaN);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem);
        timeSeries.setDescription("");
        timeSeries.setNotify(true);
        timeSeries.setMaximumItemAge(1L);
        TextBox textBox = new TextBox("-3");
        textBox.setOutlinePaint(null);
        textBox.setBackgroundPaint(null);
        textBox.setOutlineStroke(null);
        textBox.setShadowXOffset(java.lang.Double.POSITIVE_INFINITY);
        textBox.setShadowYOffset(0.0);
        textBox.setShadowPaint(null);
        textBox.setInteriorGap(null);
        textBox.setTextBlock(null);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, java.lang.Double.POSITIVE_INFINITY, 1.0, textBox, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, 0.0);
        pieLabelRecord.setAllocatedY(1.0);
        pieLabelRecord.setBaseY(-1.0);
        timeSeries.setKey(pieLabelRecord);
        timeSeries.setMaximumItemCount(-1);
        
        timeSeries.setDomainDescription("\r\t\n");
    }
    ///endregion
    
    ///region Errors report for setDomainDescription
    
    public void testSetDomainDescription_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static java.awt.Toolkit java.awt.Toolkit.toolkit accessible: module
        java.desktop does not "opens java.awt" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getRangeDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeDescription()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRangeDescription()}
 * @utbot.returnsFrom {@code return this.range;}
 *  */
    @Test
    public void testGetRangeDescription_ReturnThisRange() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        String actual = timeSeries.getRangeDescription();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setRangeDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetRangeDescription_TimeSeriesFirePropertyChange() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        SwingPropertyChangeSupport propertyChangeSupport = ((SwingPropertyChangeSupport) createInstance("javax.swing.event.SwingPropertyChangeSupport"));
        Object map = createInstance("java.beans.PropertyChangeSupport$PropertyChangeListenerMap");
        setField(propertyChangeSupport, "java.beans.PropertyChangeSupport", "map", map);
        int[] source = {};
        setField(propertyChangeSupport, "java.beans.PropertyChangeSupport", "source", source);
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setRangeDescription(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Range", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeDescription_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        Object propertyChangeSupport = createInstance("java.awt.Toolkit$DesktopPropertyChangeSupport");
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setRangeDescription(null);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Range", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeDescription_ThrowIllegalArgumentException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        Object propertyChangeSupport = createInstance("java.awt.Toolkit$DesktopPropertyChangeSupport");
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        String string = "\u0000";
        
        timeSeries.setRangeDescription(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setRangeDescription(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
     */
    @Test
    public void testSetRangeDescriptionWithBlankString() {
        Date date = new Date(java.lang.Long.MIN_VALUE);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, 1.0, -1.0, java.lang.Double.NaN, 1.0, java.lang.Double.NaN);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem);
        timeSeries.setDescription("");
        timeSeries.setNotify(true);
        timeSeries.setMaximumItemAge(1L);
        TextBox textBox = new TextBox("-3");
        textBox.setOutlinePaint(null);
        textBox.setBackgroundPaint(null);
        textBox.setOutlineStroke(null);
        textBox.setShadowXOffset(java.lang.Double.POSITIVE_INFINITY);
        textBox.setShadowYOffset(0.0);
        textBox.setShadowPaint(null);
        textBox.setInteriorGap(null);
        textBox.setTextBlock(null);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, java.lang.Double.POSITIVE_INFINITY, 1.0, textBox, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, 0.0);
        pieLabelRecord.setAllocatedY(1.0);
        pieLabelRecord.setBaseY(-1.0);
        timeSeries.setKey(pieLabelRecord);
        timeSeries.setMaximumItemCount(-1);
        
        timeSeries.setRangeDescription("\r\t\n");
    }
    ///endregion
    
    ///region Errors report for setRangeDescription
    
    public void testSetRangeDescription_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static java.awt.Toolkit java.awt.Toolkit.toolkit accessible: module
        java.desktop does not "opens java.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getMaximumItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximumItemCount()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getMaximumItemCount()}
 * @utbot.returnsFrom {@code return this.maximumItemCount;}
 *  */
    @Test
    public void testGetMaximumItemCount_ReturnThisMaximumItemCount() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemCount(-255);
        
        int actual = timeSeries.getMaximumItemCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setMaximumItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 *  */
    @Test
    public void testSetMaximumItemCount() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        
        timeSeries.setMaximumItemCount(0);
        
        int finalTimeSeriesMaximumItemCount = ((Integer) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemCount"));
        
        assertEquals(0, finalTimeSeriesMaximumItemCount);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 *  */
    @Test
    public void testSetMaximumItemCount_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        
        timeSeries.setMaximumItemCount(2);
        
        int finalTimeSeriesMaximumItemCount = ((Integer) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemCount"));
        
        assertEquals(2, finalTimeSeriesMaximumItemCount);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 *  */
    @Test
    public void testSetMaximumItemCount_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.setMaximumItemCount(2);
        
        int finalTimeSeriesMaximumItemCount = ((Integer) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemCount"));
        
        assertEquals(2, finalTimeSeriesMaximumItemCount);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 *  */
    @Test
    public void testSetMaximumItemCount_3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        TimeSeriesTableModel timeSeriesTableModel = ((TimeSeriesTableModel) createInstance("org.jfree.data.time.TimeSeriesTableModel"));
        EventListenerList listenerList1 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList2 = {null, null};
        setField(listenerList1, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
        setField(timeSeriesTableModel, "javax.swing.table.AbstractTableModel", "listenerList", listenerList1);
        listenerList[1] = ((Object) timeSeriesTableModel);
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        EventListenerList timeSeriesListeners = ((EventListenerList) getFieldValue(timeSeries, "org.jfree.data.general.Series", "listeners"));
        java.lang.Object[] timeSeriesListenersListenersListenerList = ((java.lang.Object[]) getFieldValue(timeSeriesListeners, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialTimeSeriesListenersListenerList0 = get(timeSeriesListenersListenersListenerList, 0);
        
        timeSeries.setMaximumItemCount(2);
        
        int finalTimeSeriesMaximumItemCount = ((Integer) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemCount"));
        EventListenerList timeSeriesListeners1 = ((EventListenerList) getFieldValue(timeSeries, "org.jfree.data.general.Series", "listeners"));
        java.lang.Object[] timeSeriesListeners1ListenersListenerList = ((java.lang.Object[]) getFieldValue(timeSeriesListeners1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalTimeSeriesListenersListenerList0 = get(timeSeriesListeners1ListenersListenerList, 0);
        
        assertFalse(initialTimeSeriesListenersListenerList0 == finalTimeSeriesListenersListenerList0);
        
        assertEquals(2, finalTimeSeriesMaximumItemCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (maximum < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: maximum < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.setMaximumItemCount(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: delete(0, count - maximum - 1);
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.SeriesChangeListener] */
        timeSeries.setMaximumItemCount(2);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowClassCastException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        TimeSeriesTableModel timeSeriesTableModel = ((TimeSeriesTableModel) createInstance("org.jfree.data.time.TimeSeriesTableModel"));
        EventListenerList listenerList1 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList2 = new java.lang.Object[2];
        listenerList2[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList2[1] = object;
        setField(listenerList1, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
        setField(timeSeriesTableModel, "javax.swing.table.AbstractTableModel", "listenerList", listenerList1);
        listenerList[1] = ((Object) timeSeriesTableModel);
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.swing.event.TableModelListener] */
        timeSeries.setMaximumItemCount(2);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.data.size();
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemCount(-255);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.setMaximumItemCount(TimeSeries.java:279) */
        timeSeries.setMaximumItemCount(0);
    }
    ///endregion
    
    ///region Errors report for setMaximumItemCount
    
    public void testSetMaximumItemCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_ReturnResult() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        ArrayList actual = ((ArrayList) timeSeries.getTimePeriodsUniqueToOtherSeries(timeSeries));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < series.getItemCount(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: RegularTimePeriod period = series.getTimePeriod(i);
 *  */
    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(TimeSeries.java:409) */
        timeSeries.getTimePeriodsUniqueToOtherSeries(timeSeries1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < series.getItemCount(); i++)
 *  */
    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(TimeSeries.java:408) */
        timeSeries.getTimePeriodsUniqueToOtherSeries(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < series.getItemCount(); i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(period);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTimePeriodsUniqueToOtherSeries_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.getTimePeriodsUniqueToOtherSeries(timeSeries1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItems()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getItems()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.data);}
 *  */
    @Test
    public void testGetItems_CollectionsUnmodifiableList() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        List actual = timeSeries.getItems();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setMaximumItemAge
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximumItemAge(long)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 *  */
    @Test
    public void testSetMaximumItemAge() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        timeSeries.setMaximumItemAge(0L);
        
        long finalTimeSeriesMaximumItemAge = ((Long) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemAge"));
        
        assertEquals(0L, finalTimeSeriesMaximumItemAge);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 *  */
    @Test
    public void testSetMaximumItemAge_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period, "org.jfree.data.time.Month", "month", -8);
        setField(period, "org.jfree.data.time.Month", "year", 1);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 4);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        timeSeries.setMaximumItemAge(0L);
        
        long finalTimeSeriesMaximumItemAge = ((Long) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemAge"));
        
        assertEquals(0L, finalTimeSeriesMaximumItemAge);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 *  */
    @Test
    public void testSetMaximumItemAge_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        timeSeries.setMaximumItemAge(0L);
        
        long finalTimeSeriesMaximumItemAge = ((Long) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemAge"));
        
        assertEquals(0L, finalTimeSeriesMaximumItemAge);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 *  */
    @Test
    public void testSetMaximumItemAge_3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) -3);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        timeSeries.setMaximumItemAge(0L);
        
        long finalTimeSeriesMaximumItemAge = ((Long) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemAge"));
        
        assertEquals(0L, finalTimeSeriesMaximumItemAge);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 *  */
    @Test
    public void testSetMaximumItemAge_4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) -3);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.setMaximumItemAge(0L);
        
        long finalTimeSeriesMaximumItemAge = ((Long) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemAge"));
        
        assertEquals(0L, finalTimeSeriesMaximumItemAge);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMaximumItemAge(long)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 * @utbot.executesCondition {@code (periods < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: periods < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.setMaximumItemAge(-255L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaximumItemAge(long)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetMaximumItemAge_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:739)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:313) */
        timeSeries.setMaximumItemAge(0L);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetMaximumItemAge_ThrowClassCastException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:741)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:313) */
        timeSeries.setMaximumItemAge(0L);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemAge(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetMaximumItemAge_ThrowClassCastException_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period, "org.jfree.data.time.Month", "month", -1073741824);
        setField(period, "org.jfree.data.time.Month", "year", 89478485);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 16371);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-255L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:741)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:313) */
        timeSeries.setMaximumItemAge(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getDataItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (TimeSeriesDataItem) this.data.get(index);}
 *  */
    @Test
    public void testGetDataItem_ListGet() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        TimeSeriesDataItem actual = timeSeries.getDataItem(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339) */
        timeSeries.getDataItem(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339) */
        timeSeries.getDataItem(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339) */
        timeSeries.getDataItem(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getDataItem
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDataItem(org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getIndex(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(period);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDataItem_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.getDataItem(((RegularTimePeriod) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getTimePeriods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriods()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriods()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetTimePeriods_ReturnResult() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        ArrayList actual = ((ArrayList) timeSeries.getTimePeriods());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriods()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getItemCount(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetTimePeriods_CollectionAdd() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Day period = ((Day) createInstance("org.jfree.data.time.Day"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        ArrayList actual = ((ArrayList) timeSeries.getTimePeriods());
        
        ArrayList expected = new ArrayList();
        expected.add(period);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimePeriods()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriods()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getItemCount(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result.add(getTimePeriod(i));
 *  */
    @Test
    public void testGetTimePeriods_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriods] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.getTimePeriods(TimeSeries.java:392) */
        timeSeries.getTimePeriods();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getNextTimePeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextTimePeriod()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getNextTimePeriod()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.invokes {@link org.jfree.data.time.RegularTimePeriod#next()}
 * @utbot.returnsFrom {@code return last.next();}
 *  */
    @Test
    public void testGetNextTimePeriod_RegularTimePeriodNext() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 9999);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        RegularTimePeriod actual = timeSeries.getNextTimePeriod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextTimePeriod()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getNextTimePeriod()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: RegularTimePeriod last = getTimePeriod(getItemCount() - 1);
 *  */
    @Test
    public void testGetNextTimePeriod_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getNextTimePeriod] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:380) */
        timeSeries.getNextTimePeriod();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getNextTimePeriod()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: RegularTimePeriod last = getTimePeriod(getItemCount() - 1);
 *  */
    @Test
    public void testGetNextTimePeriod_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getNextTimePeriod] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:380) */
        timeSeries.getNextTimePeriod();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getNextTimePeriod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return last.next();
 *  */
    @Test
    public void testGetNextTimePeriod_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getNextTimePeriod] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:381) */
        timeSeries.getNextTimePeriod();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNextTimePeriod()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getNextTimePeriod()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.invokes {@link org.jfree.data.time.RegularTimePeriod#next()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return last.next();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetNextTimePeriod_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 1897);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.getNextTimePeriod();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNextTimePeriod()
    
    @Test
    public void testGetNextTimePeriod1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        java.util.Locale.Category[] categoryArray = {null, null};
        data.add(categoryArray);
        data.add(categoryArray);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 5993);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Year actual = ((Year) timeSeries.getNextTimePeriod());
        
        Year expected = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(expected, "org.jfree.data.time.Year", "year", (short) 5994);
        setField(expected, "org.jfree.data.time.Year", "firstMillisecond", 109849712400000L);
        setField(expected, "org.jfree.data.time.Year", "lastMillisecond", 109881248399999L);
        
        // org.jfree.data.time.Year has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getTimePeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriod(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getPeriod()}
 * @utbot.returnsFrom {@code return getDataItem(index).getPeriod();}
 *  */
    @Test
    public void testGetTimePeriod_TimeSeriesDataItemGetPeriod() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Day period = ((Day) createInstance("org.jfree.data.time.Day"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Day actual = ((Day) timeSeries.getTimePeriod(0));
        
        // org.jfree.data.time.Day has overridden equals method
        assertEquals(period, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimePeriod(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataItem(index).getPeriod();
 *  */
    @Test
    public void testGetTimePeriod_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriod] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370) */
        timeSeries.getTimePeriod(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getDataItem(index).getPeriod();
 *  */
    @Test
    public void testGetTimePeriod_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriod] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370) */
        timeSeries.getTimePeriod(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDataItem(index).getPeriod();
 *  */
    @Test
    public void testGetTimePeriod_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriod] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370) */
        timeSeries.getTimePeriod(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getMaximumItemAge
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximumItemAge()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getMaximumItemAge()}
 * @utbot.returnsFrom {@code return this.maximumItemAge;}
 *  */
    @Test
    public void testGetMaximumItemAge_ReturnThisMaximumItemAge() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemAge(1L);
        
        long actual = timeSeries.getMaximumItemAge();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getTimePeriodClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriodClass()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriodClass()}
 * @utbot.returnsFrom {@code return this.timePeriodClass;}
 *  */
    @Test
    public void testGetTimePeriodClass_ReturnThisTimePeriodClass() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class actual = timeSeries.getTimePeriodClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.removeAgedItems
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAgedItems(long, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(long,boolean)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredMethod(java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Method m = RegularTimePeriod.class.getDeclaredMethod("createInstance", new Class[] { Class.class, Date.class, TimeZone.class });
 *  */
    @Test
    public void testRemoveAgedItems_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:773) */
        timeSeries.removeAgedItems(-255L, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.removeAgedItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAgedItems(boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.executesCondition {@code (getItemCount() > 1): False}
 *  */
    @Test
    public void testRemoveAgedItems_GetItemCountLessOrEqual1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.executesCondition {@code (getItemCount() > 1): True}
 * @utbot.executesCondition {@code (removed && notify): False}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} once
 *  */
    @Test
    public void testRemoveAgedItems_RemovedAndNotify() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 254);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period1, "org.jfree.data.time.Month", "year", 1);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-242L);
        
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.executesCondition {@code (getItemCount() > 1): True}
 * @utbot.executesCondition {@code (removed && notify): True}
 * @utbot.executesCondition {@code (if (removed && notify) {
 *     fireSeriesChanged();
 * }): False}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} twice
 *  */
    @Test
    public void testRemoveAgedItems_RemovedAndNotify_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period, "org.jfree.data.time.Month", "month", -539285871);
        setField(period, "org.jfree.data.time.Month", "year", 30053620);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) -3);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        data.add(null);
        data.add(null);
        data.add(period1);
        data.add(period1);
        data.add(null);
        data.add(period1);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem2 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period2 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period2, "org.jfree.data.time.Month", "month", -1006632960);
        setField(period2, "org.jfree.data.time.Month", "year", 83886081);
        setField(timeSeriesDataItem2, "org.jfree.data.time.TimeSeriesDataItem", "period", period2);
        data.add(timeSeriesDataItem2);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(15L);
        
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.executesCondition {@code (getItemCount() > 1): True}
 * @utbot.executesCondition {@code (removed && notify): True}
 * @utbot.executesCondition {@code (if (removed && notify) {
 *     fireSeriesChanged();
 * }): True}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#fireSeriesChanged()}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} twice
 *  */
    @Test
    public void testRemoveAgedItems_RemovedAndNotify_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period, "org.jfree.data.time.Month", "month", 1944583140);
        setField(period, "org.jfree.data.time.Month", "year", -2130575272);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) -6);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        data.add(null);
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(month, "org.jfree.data.time.Month", "month", -268435431);
        setField(month, "org.jfree.data.time.Month", "year", 1164618414);
        data.add(month);
        data.add(null);
        data.add(null);
        data.add(month);
        data.add(null);
        data.add(month);
        TimeSeriesDataItem timeSeriesDataItem2 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        setField(timeSeriesDataItem2, "org.jfree.data.time.TimeSeriesDataItem", "period", month);
        data.add(timeSeriesDataItem2);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(13706985543L);
        
        timeSeries.removeAgedItems(true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAgedItems(boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: long latest = getTimePeriod(getItemCount() - 1).getSerialIndex();
 *  */
    @Test
    public void testRemoveAgedItems_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:739) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)
 *  */
    @Test
    public void testRemoveAgedItems_ThrowClassCastException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:741) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)
 *  */
    @Test
    public void testRemoveAgedItems_ThrowClassCastException_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(period);
        data.add(period);
        data.add(period);
        data.add(null);
        data.add(null);
        data.add(period);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period1, "org.jfree.data.time.Month", "month", 1607125027);
        setField(period1, "org.jfree.data.time.Month", "year", -133927103);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(-254L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:339)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:370)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:741) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long latest = getTimePeriod(getItemCount() - 1).getSerialIndex();
 *  */
    @Test
    public void testRemoveAgedItems_ThrowNullPointerException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:739) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)
 *  */
    @Test
    public void testRemoveAgedItems_ThrowNullPointerException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:741) */
        timeSeries.removeAgedItems(false);
    }
    ///endregion
    
    ///region Errors report for removeAgedItems
    
    public void testRemoveAgedItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addAndOrUpdate
    
    ///region OTHER: ERROR SUITE for method addAndOrUpdate(org.jfree.data.time.TimeSeries)
    
    @Test
    public void testAddAndOrUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.addAndOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.addAndOrUpdate(TimeSeries.java:649) */
        timeSeries.addAndOrUpdate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.createCopy
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.executesCondition {@code (start.compareTo(end) > 0): True}
 * @utbot.invokes {@link org.jfree.data.time.RegularTimePeriod#compareTo(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.compareTo(end) > 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year, "org.jfree.data.time.Year", "year", (short) 0);
        Year year1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year1, "org.jfree.data.time.Year", "year", (short) -1);
        
        timeSeries.createCopy(year, year1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        
        timeSeries.createCopy(month, ((RegularTimePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod)}
 * @utbot.executesCondition {@code (start == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.createCopy(((RegularTimePeriod) null), ((RegularTimePeriod) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testCreateCopy1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year, "org.jfree.data.time.Year", "year", (short) 0);
        Year year1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year1, "org.jfree.data.time.Year", "year", (short) 32765);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.binarySearch(Collections.java:216)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:433)
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:927) */
        timeSeries.createCopy(year, year1);
    }
    
    @Test
    public void testCreateCopy2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:433)
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:927) */
        timeSeries.createCopy(year, millisecond);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.createCopy
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCopy(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(int,int)}
 * @utbot.executesCondition {@code (start < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.createCopy(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(int,int)}
 * @utbot.executesCondition {@code (start < 0): False}
 * @utbot.executesCondition {@code (end < start): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: end < start
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException_11() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.createCopy(0, -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCopy(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(int,int)}
 * @utbot.executesCondition {@code (start < 0): False}
 * @utbot.executesCondition {@code (end < start): False}
 * @utbot.invokes {@link org.jfree.data.general.Series#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TimeSeries copy = (TimeSeries) super.clone();
 *  */
    @Test
    public void testCreateCopy_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:885) */
        timeSeries.createCopy(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: period == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) null), ((Number) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    @Test
    public void testAddOrUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        BigDecimal bigDecimal = new BigDecimal(0);
        
        TimeSeriesDataItem actual = timeSeries.addOrUpdate(((RegularTimePeriod) millisecond), bigDecimal);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.addOrUpdate(period, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    @Test
    public void testAddOrUpdate2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Second second = ((Second) createInstance("org.jfree.data.time.Second"));
        
        TimeSeriesDataItem actual = timeSeries.addOrUpdate(((RegularTimePeriod) second), 4.9E-324);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    @Test
    public void testAddOrUpdate3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Second second = ((Second) createInstance("org.jfree.data.time.Second"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.addOrUpdate] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.addOrUpdate(TimeSeries.java:699)
            org.jfree.data.time.TimeSeries.addOrUpdate(TimeSeries.java:675) */
        timeSeries.addOrUpdate(((RegularTimePeriod) second), java.lang.Double.NaN);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields798757384234800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798757384234800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798757384241200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798757384234800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798757384241200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798757384717100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798757384717100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798757384718900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798757384717100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798757384718900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

