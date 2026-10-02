package org.jfree.data.time;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import org.jfree.data.xy.OHLCDataItem;
import javax.swing.event.EventListenerList;
import java.beans.PropertyChangeSupport;
import org.jfree.data.general.SeriesException;
import java.lang.reflect.Method;
import org.jfree.chart.renderer.Outlier;
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.List;
import java.util.Locale.Category;
import java.util.Locale;
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
import static org.junit.Assert.assertNull;

public final class org_jfree_data_time_TimeSeriesTest {
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.TimeSeriesDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: item == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((TimeSeriesDataItem) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.TimeSeriesDataItem, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.executesCondition {@code (item == null): False}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: item = (TimeSeriesDataItem) item.clone();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:580) */
        timeSeries.add(timeSeriesDataItem, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: add(period, value, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.RegularTimePeriod, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(period, value, true);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:597)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:667)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:653) */
        timeSeries.add(((RegularTimePeriod) day), java.lang.Double.NaN);
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
    public void testAdd_ThrowIllegalArgumentException2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(item, true);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:580)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:564) */
        timeSeries.add(timeSeriesDataItem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.RegularTimePeriod, double, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(item, notify);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:597)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:667) */
        timeSeries.add(((RegularTimePeriod) day), java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.jfree.data.time.RegularTimePeriod, double, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,double,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TimeSeriesDataItem item = new TimeSeriesDataItem(period, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.add(((RegularTimePeriod) null), java.lang.Double.NaN, false);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(period, value, true);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:597)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:694)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:680) */
        timeSeries.add(((RegularTimePeriod) day), ((Number) null));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#add(org.jfree.data.time.TimeSeriesDataItem,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(item, notify);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.add] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:597)
            org.jfree.data.time.TimeSeries.add(TimeSeries.java:694) */
        timeSeries.add(((RegularTimePeriod) day), ((Number) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(timeSeries);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfTimeSeries() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfTimeSeries() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "domain", domain);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfTimeSeries_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = " ";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ReturnFalse() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "range", range);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfTimeSeries_2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries1.timePeriodClass = timePeriodClass;
        
        Class initialTimeSeries1TimePeriodClass = timeSeries1.timePeriodClass;
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
        
        Class finalTimeSeries1TimePeriodClass = timeSeries1.timePeriodClass;
        
        assertFalse(initialTimeSeries1TimePeriodClass == finalTimeSeries1TimePeriodClass);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfTimeSeries_3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class initialTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        assertFalse(initialTimeSeriesTimePeriodClass == finalTimeSeriesTimePeriodClass);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 * @utbot.executesCondition {@code (getMaximumItemAge() != that.getMaximumItemAge()): True}
 *  */
    @Test
    public void testEquals_GetMaximumItemAgeNotEqualsThatGetMaximumItemAge() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemAge(-255L);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setMaximumItemAge(java.lang.Long.MIN_VALUE);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof TimeSeries)): False}
 * @utbot.executesCondition {@code (getMaximumItemAge() != that.getMaximumItemAge()): False}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getMaximumItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getMaximumItemCount()}
 *  */
    @Test
    public void testEquals_GetMaximumItemAgeEqualsThatGetMaximumItemAge() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemCount(1);
        timeSeries.setMaximumItemAge(-255L);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setMaximumItemAge(-255L);
        
        boolean actual = timeSeries.equals(timeSeries1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "domain", domain1);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.equals] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.equals(TimeSeries.java:1161) */
        timeSeries.equals(timeSeries1);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(0L);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries1.setMaximumItemAge(0L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.equals] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.equals(TimeSeries.java:1162) */
        timeSeries.equals(timeSeries1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.hashCode
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#hashCode()}
     */
    @Test
    public void testHashCode() {
        Date date = new Date(1, 0, 0);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 1.0);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem, "-3", "#$\\\"'");
        timeSeries.setMaximumItemAge(1L);
        timeSeries.setDescription("XZ");
        timeSeries.setNotify(true);
        timeSeries.setMaximumItemCount(2);
        Date date1 = new Date();
        Date date2 = new Date(Integer.MAX_VALUE, 0, -2147483646, 2, 0);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date1, date2);
        timeSeries.setKey(simpleTimePeriod);
        
        int actual = timeSeries.hashCode();
        
        assertEquals(-1656581779, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Integer key = 0;
        timeSeries.setKey(key);
        
        int actual = timeSeries.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.clone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clone()}
 * @utbot.invokes {@link org.jfree.data.general.Series#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TimeSeries clone = (TimeSeries) super.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        Date date = new Date(1, -1, 1);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 1.0);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem, "-3", "#$\\\"'");
        timeSeries.setMaximumItemAge(java.lang.Long.MAX_VALUE);
        timeSeries.setDescription("XZ");
        timeSeries.setNotify(true);
        timeSeries.setMaximumItemCount(-1);
        Date date1 = new Date();
        Date date2 = new Date(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date1, date2);
        timeSeries.setKey(simpleTimePeriod);
        
        TimeSeries actual = ((TimeSeries) timeSeries.clone());
        
        TimeSeries expected = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "-3";
        setField(expected, "org.jfree.data.time.TimeSeries", "domain", domain);
        String range = "#$\\\"'";
        setField(expected, "org.jfree.data.time.TimeSeries", "range", range);
        ArrayList data = new ArrayList();
        setField(expected, "org.jfree.data.time.TimeSeries", "data", data);
        expected.setMaximumItemCount(Integer.MAX_VALUE);
        expected.setMaximumItemAge(java.lang.Long.MAX_VALUE);
        setField(expected, "org.jfree.data.time.TimeSeries", "minY", java.lang.Double.NaN);
        setField(expected, "org.jfree.data.time.TimeSeries", "maxY", java.lang.Double.NaN);
        SimpleTimePeriod key = ((SimpleTimePeriod) createInstance("org.jfree.data.time.SimpleTimePeriod"));
        setField(key, "org.jfree.data.time.SimpleTimePeriod", "start", 1790534611052L);
        setField(key, "org.jfree.data.time.SimpleTimePeriod", "end", 6195355731081746464L);
        expected.setKey(key);
        String description = "XZ";
        expected.setDescription(description);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.Series", "listeners", listeners);
        PropertyChangeSupport propertyChangeSupport = ((PropertyChangeSupport) createInstance("java.beans.PropertyChangeSupport"));
        setField(expected, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        expected.setNotify(true);
        
        // org.jfree.data.time.TimeSeries has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.update
    
    ///region OTHER: ERROR SUITE for method update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    @Test
    public void testUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Day day = ((Day) createInstance("org.jfree.data.time.Day"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:230)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:706) */
        timeSeries.update(day, ((Number) integer));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.update
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method update(int, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testUpdate_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:721) */
        timeSeries.update(0, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testUpdate_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:721) */
        timeSeries.update(-1, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:721) */
        timeSeries.update(-255, ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#update(int,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number oldYN = item.getValue();
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:723) */
        timeSeries.update(0, ((Number) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method update(int, java.lang.Number)
    
    @Test
    public void testUpdate2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.update(0, ((Number) null));
    }
    
    @Test
    public void testUpdate3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Integer integer = 0;
        
        timeSeries.update(0, ((Number) integer));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method update(int, java.lang.Number)
    
    @Test
    public void testUpdate4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.general.Series.notifyListeners(Series.java:328)
            org.jfree.data.general.Series.fireSeriesChanged(Series.java:316)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:739) */
        timeSeries.update(0, ((Number) null));
    }
    
    @Test
    public void testUpdate5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:732) */
        timeSeries.update(0, ((Number) null));
    }
    
    @Test
    public void testUpdate6() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Float value = 0.0f;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Double double1 = 0.0;
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.update] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.update(TimeSeries.java:732) */
        timeSeries.update(0, ((Number) double1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): False}
 *  */
    @Test
    public void testClear_ThisDataSizeLessOrEqualZero() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 *  */
    @Test
    public void testClear_ThisDataSizeGreaterThanZero() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.clear();
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        assertNull(finalTimeSeriesTimePeriodClass);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 *  */
    @Test
    public void testClear_ThisDataSizeGreaterThanZero_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = {null, null};
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        timeSeries.clear();
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        assertNull(finalTimeSeriesTimePeriodClass);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.executesCondition {@code (this.data.size() > 0): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#fireSeriesChanged()}
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
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList[1] = object;
        setField(listeners, "javax.swing.event.EventListenerList", "listenerList", listenerList);
        setField(timeSeries, "org.jfree.data.general.Series", "listeners", listeners);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clear] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.event.SeriesChangeListener] */
        timeSeries.clear();
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#clear()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.data.size() > 0
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.clear] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.clear(TimeSeries.java:950) */
        timeSeries.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.returnsFrom {@code return getRawDataItem(index).getValue();}
 *  */
    @Test
    public void testGetValue_TimeSeriesDataItemGetValue() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Double value = 0.0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Double actual = ((Double) timeSeries.getValue(0));
        
        org.junit.Assert.assertEquals(value, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRawDataItem(index).getValue();
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:535) */
        timeSeries.getValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getRawDataItem(index).getValue();
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
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:535) */
        timeSeries.getValue(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getRawDataItem(index).getValue();
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getValue(TimeSeries.java:535) */
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
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        
        Number actual = timeSeries.getValue(month);
        
        assertNull(actual);
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
        Hour hour = ((Hour) createInstance("org.jfree.data.time.Hour"));
        
        timeSeries.delete(hour);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.delete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delete(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.executesCondition {@code (end < start): False}
 * @utbot.executesCondition {@code (this.data.isEmpty()): True}
 * @utbot.executesCondition {@code (notify): False}
 * @utbot.invokes org.jfree.data.time.TimeSeries#findBoundsByIteration()
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testDelete_NotNotify() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.delete(-52750976, 2095256577, false);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        assertNull(finalTimeSeriesTimePeriodClass);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delete(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i <= (end - start); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1004) */
        timeSeries.delete(-1, -1, false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i <= (end - start); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.data.remove(start);
 *  */
    @Test
    public void testDelete_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1004) */
        timeSeries.delete(-211, -211, false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.invokes org.jfree.data.time.TimeSeries#findBoundsByIteration()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findBoundsByIteration();
 *  */
    @Test
    public void testDelete_ThrowNullPointerException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1248)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006) */
        timeSeries.delete(-1061158912, 1145044992, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method delete(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.executesCondition {@code (end < start): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: end < start
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDelete_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.delete(256, 255, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method delete(int, int, boolean)
    
    @Test
    public void testDelete2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.delete(0, 0, false);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(int, int, boolean)
    
    @Test
    public void testDelete3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1004) */
        timeSeries.delete(1, 2147483646, false);
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
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006) */
        timeSeries.delete(0, 0, false);
    }
    
    @Test
    public void testDelete5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006) */
        timeSeries.delete(-1878884871, 402686208, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.delete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 *  */
    @Test
    public void testDelete_TimeSeriesDelete() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.delete(-1945100287, 202387456);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        assertNull(finalTimeSeriesTimePeriodClass);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: delete(start, end, true);
 *  */
    @Test
    public void testDelete_ThrowIndexOutOfBoundsException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1004)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987) */
        timeSeries.delete(-1, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delete(start, end, true);
 *  */
    @Test
    public void testDelete_ThrowNullPointerException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1248)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987) */
        timeSeries.delete(-1073741574, 1610612736);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method delete(int, int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#delete(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: delete(start, end, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDelete_ThrowIllegalArgumentException2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.delete(256, 255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method delete(int, int)
    
    @Test
    public void testDelete6() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.delete(0, 0);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method delete(int, int)
    
    @Test
    public void testDelete7() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1004)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987) */
        timeSeries.delete(2, 1073741825);
    }
    
    @Test
    public void testDelete8() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        timeSeries.setNotify(true);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.general.Series.notifyListeners(Series.java:328)
            org.jfree.data.general.Series.fireSeriesChanged(Series.java:316)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1011)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987) */
        timeSeries.delete(-554535431, 1879048192);
    }
    
    @Test
    public void testDelete9() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.delete] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987) */
        timeSeries.delete(-1186429571, 1526726672);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIndex(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetIndex1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        
        int actual = timeSeries.getIndex(month);
        
        assertEquals(-1, actual);
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
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254) */
        timeSeries.getItemCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addOrUpdate(new TimeSeriesDataItem(period, value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) null), ((Number) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)
    
    @Test(expected = SeriesException.class)
    public void testAddOrUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) month), ((Number) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.executesCondition {@code (item == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: item == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.addOrUpdate(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.executesCondition {@code (item == null): False}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getPeriod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class periodClass = item.getPeriod().getClass();
 *  */
    @Test
    public void testAddOrUpdate_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.addOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.addOrUpdate(TimeSeries.java:812) */
        timeSeries.addOrUpdate(timeSeriesDataItem);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test
    public void testAddOrUpdate2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Second period = ((Second) createInstance("org.jfree.data.time.Second"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        
        Class initialTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        TimeSeriesDataItem actual = timeSeries.addOrUpdate(timeSeriesDataItem);
        
        assertNull(actual);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        assertFalse(initialTimeSeriesTimePeriodClass == finalTimeSeriesTimePeriodClass);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test(expected = SeriesException.class)
    public void testAddOrUpdate3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Millisecond period = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        
        timeSeries.addOrUpdate(timeSeriesDataItem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addOrUpdate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,double)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#addOrUpdate(org.jfree.data.time.RegularTimePeriod,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addOrUpdate(period, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_ThrowIllegalArgumentException2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    @Test
    public void testAddOrUpdate4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Second second = ((Second) createInstance("org.jfree.data.time.Second"));
        
        Class initialTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        TimeSeriesDataItem actual = timeSeries.addOrUpdate(((RegularTimePeriod) second), java.lang.Double.NaN);
        
        assertNull(actual);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        
        assertFalse(initialTimeSeriesTimePeriodClass == finalTimeSeriesTimePeriodClass);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)
    
    @Test(expected = SeriesException.class)
    public void testAddOrUpdate5() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        FixedMillisecond fixedMillisecond = ((FixedMillisecond) createInstance("org.jfree.data.time.FixedMillisecond"));
        
        timeSeries.addOrUpdate(((RegularTimePeriod) fixedMillisecond), java.lang.Double.NaN);
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
    public void testCreateCopy_ThrowIllegalArgumentException() throws Exception  {
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
    public void testCreateCopy_ThrowIllegalArgumentException_1() throws Exception  {
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
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:1058) */
        timeSeries.createCopy(0, 0);
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
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.compareTo(end) > 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException_3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(month, "org.jfree.data.time.Month", "year", -3);
        Month month1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(month1, "org.jfree.data.time.Month", "year", -4);
        
        timeSeries.createCopy(month, month1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#createCopy(org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_ThrowIllegalArgumentException_11() throws Exception  {
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
    public void testCreateCopy_ThrowIllegalArgumentException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.createCopy(((RegularTimePeriod) null), ((RegularTimePeriod) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testCreateCopy1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        TimeSeries actual = timeSeries.createCopy(year, week);
        
        TimeSeries expected = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data1 = new ArrayList();
        setField(expected, "org.jfree.data.time.TimeSeries", "data", data1);
        expected.setMaximumItemAge(0L);
        setField(expected, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(expected, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.Series", "listeners", listeners);
        PropertyChangeSupport propertyChangeSupport = ((PropertyChangeSupport) createInstance("java.beans.PropertyChangeSupport"));
        setField(expected, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        // org.jfree.data.time.TimeSeries has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testCreateCopy2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        Quarter quarter = ((Quarter) createInstance("org.jfree.data.time.Quarter"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.binarySearch(Collections.java:216)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:524)
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:1102) */
        timeSeries.createCopy(month, quarter);
    }
    
    @Test
    public void testCreateCopy3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year, "org.jfree.data.time.Year", "year", (short) 0);
        Year year1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(year1, "org.jfree.data.time.Year", "year", (short) 32765);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.binarySearch(Collections.java:216)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:524)
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:1102) */
        timeSeries.createCopy(year, year1);
    }
    
    @Test
    public void testCreateCopy4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Month month = ((Month) createInstance("org.jfree.data.time.Month"));
        Month month1 = ((Month) createInstance("org.jfree.data.time.Month"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.createCopy] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.binarySearch(Collections.java:216)
            org.jfree.data.time.TimeSeries.getIndex(TimeSeries.java:524)
            org.jfree.data.time.TimeSeries.createCopy(TimeSeries.java:1102) */
        timeSeries.createCopy(month, month1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.maxIgnoreNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maxIgnoreNaN(double, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#maxIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): False}
 * @utbot.executesCondition {@code (Double.isNaN(b)): False}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.returnsFrom {@code return Math.max(a, b);}
 *  */
    @Test
    public void testMaxIgnoreNaN_NotDoubleIsNaN() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method maxIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("maxIgnoreNaN", doubleType, doubleType);
        maxIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] maxIgnoreNaNMethodArguments = new java.lang.Object[2];
        maxIgnoreNaNMethodArguments[0] = 4.450147721158926E-308;
        maxIgnoreNaNMethodArguments[1] = 4.450147721158926E-308;
        double actual = ((Double) maxIgnoreNaNMethod.invoke(timeSeries, maxIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(4.450147721158926E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#maxIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): True}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testMaxIgnoreNaN_DoubleIsNaN() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method maxIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("maxIgnoreNaN", doubleType, doubleType);
        maxIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] maxIgnoreNaNMethodArguments = new java.lang.Object[2];
        maxIgnoreNaNMethodArguments[0] = java.lang.Double.NaN;
        maxIgnoreNaNMethodArguments[1] = java.lang.Double.NaN;
        double actual = ((Double) maxIgnoreNaNMethod.invoke(timeSeries, maxIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#maxIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): False}
 * @utbot.executesCondition {@code (Double.isNaN(b)): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaxIgnoreNaN_DoubleIsNaN_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method maxIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("maxIgnoreNaN", doubleType, doubleType);
        maxIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] maxIgnoreNaNMethodArguments = new java.lang.Object[2];
        maxIgnoreNaNMethodArguments[0] = -2.0000000000000004;
        maxIgnoreNaNMethodArguments[1] = java.lang.Double.NaN;
        double actual = ((Double) maxIgnoreNaNMethod.invoke(timeSeries, maxIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(-2.0000000000000004, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.addAndOrUpdate
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAndOrUpdate(org.jfree.data.time.TimeSeries)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#addAndOrUpdate(org.jfree.data.time.TimeSeries)}
     */
    @Test
    public void testAddAndOrUpdate() throws Exception  {
        Date date = new Date(1, 1, 0);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 1.0);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem, "XZ", "abc");
        timeSeries.setMaximumItemAge(0L);
        timeSeries.setDescription("Overwritten values from: ");
        timeSeries.setNotify(true);
        timeSeries.setMaximumItemCount(-1);
        Date date1 = new Date();
        Date date2 = new Date(Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date1, date2);
        timeSeries.setKey(simpleTimePeriod);
        Outlier outlier = new Outlier(java.lang.Double.NaN, 1.0, java.lang.Double.NaN);
        TimeSeries timeSeries1 = new TimeSeries(outlier);
        timeSeries1.setMaximumItemAge(-1L);
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setNotify(false);
        Outlier outlier1 = new Outlier(0.0, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
        outlier1.setPoint(null);
        outlier1.setRadius(java.lang.Double.NEGATIVE_INFINITY);
        timeSeries1.setKey(outlier1);
        timeSeries1.setDescription("-3");
        
        TimeSeries actual = timeSeries.addAndOrUpdate(timeSeries1);
        
        TimeSeries expected = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "Time";
        setField(expected, "org.jfree.data.time.TimeSeries", "domain", domain);
        String range = "Value";
        setField(expected, "org.jfree.data.time.TimeSeries", "range", range);
        ArrayList data = new ArrayList();
        setField(expected, "org.jfree.data.time.TimeSeries", "data", data);
        expected.setMaximumItemCount(Integer.MAX_VALUE);
        expected.setMaximumItemAge(java.lang.Long.MAX_VALUE);
        setField(expected, "org.jfree.data.time.TimeSeries", "minY", java.lang.Double.NaN);
        setField(expected, "org.jfree.data.time.TimeSeries", "maxY", java.lang.Double.NaN);
        String key = "Overwritten values from: org.jfree.data.time.SimpleTimePeriod@9d0b5bd0";
        expected.setKey(key);
        EventListenerList listeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.Series", "listeners", listeners);
        PropertyChangeSupport propertyChangeSupport = ((PropertyChangeSupport) createInstance("java.beans.PropertyChangeSupport"));
        setField(expected, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        expected.setNotify(true);
        
        // org.jfree.data.time.TimeSeries has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAndOrUpdate(org.jfree.data.time.TimeSeries)
    
    @Test
    public void testAddAndOrUpdate1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.addAndOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.addAndOrUpdate(TimeSeries.java:753) */
        timeSeries.addAndOrUpdate(null);
    }
    
    @Test
    public void testAddAndOrUpdate2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Integer key = 1;
        timeSeries.setKey(key);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.addAndOrUpdate] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getItemCount(TimeSeries.java:254)
            org.jfree.data.time.TimeSeries.addAndOrUpdate(TimeSeries.java:753) */
        timeSeries.addAndOrUpdate(timeSeries);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.minIgnoreNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minIgnoreNaN(double, double)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#minIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): False}
 * @utbot.executesCondition {@code (Double.isNaN(b)): False}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.returnsFrom {@code return Math.min(a, b);}
 *  */
    @Test
    public void testMinIgnoreNaN_NotDoubleIsNaN() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method minIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("minIgnoreNaN", doubleType, doubleType);
        minIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] minIgnoreNaNMethodArguments = new java.lang.Object[2];
        minIgnoreNaNMethodArguments[0] = 4.450147717014405E-308;
        minIgnoreNaNMethodArguments[1] = 4.450147717014405E-308;
        double actual = ((Double) minIgnoreNaNMethod.invoke(timeSeries, minIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(4.450147717014405E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#minIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): True}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testMinIgnoreNaN_DoubleIsNaN() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method minIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("minIgnoreNaN", doubleType, doubleType);
        minIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] minIgnoreNaNMethodArguments = new java.lang.Object[2];
        minIgnoreNaNMethodArguments[0] = java.lang.Double.NaN;
        minIgnoreNaNMethodArguments[1] = java.lang.Double.NaN;
        double actual = ((Double) minIgnoreNaNMethod.invoke(timeSeries, minIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#minIgnoreNaN(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): False}
 * @utbot.executesCondition {@code (Double.isNaN(b)): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinIgnoreNaN_DoubleIsNaN_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class doubleType = double.class;
        Method minIgnoreNaNMethod = timeSeriesClazz.getDeclaredMethod("minIgnoreNaN", doubleType, doubleType);
        minIgnoreNaNMethod.setAccessible(true);
        java.lang.Object[] minIgnoreNaNMethodArguments = new java.lang.Object[2];
        minIgnoreNaNMethodArguments[0] = -2.0000000000000004;
        minIgnoreNaNMethodArguments[1] = java.lang.Double.NaN;
        double actual = ((Double) minIgnoreNaNMethod.invoke(timeSeries, minIgnoreNaNMethodArguments));
        
        org.junit.Assert.assertEquals(-2.0000000000000004, actual, 1.0E-6);
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
 * @utbot.executesCondition {@code (removed): False}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.invokes {@link org.jfree.data.time.RegularTimePeriod#getSerialIndex()}
 * @utbot.iterates iterate the loop {@code while((latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge)} once
 *  */
    @Test
    public void testRemoveAgedItems_NotRemoved() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) -10);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period1, "org.jfree.data.time.Month", "month", 1073741824);
        setField(period1, "org.jfree.data.time.Month", "year", -89478485);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(14L);
        
        timeSeries.removeAgedItems(false);
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:878) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long latest = getTimePeriod(getItemCount() - 1).getSerialIndex();
 *  */
    @Test
    public void testRemoveAgedItems_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:878) */
        timeSeries.removeAgedItems(false);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(boolean)}
 * @utbot.invokes {@link org.jfree.data.time.RegularTimePeriod#getSerialIndex()}
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
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:880) */
        timeSeries.removeAgedItems(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAgedItems(boolean)
    
    @Test
    public void testRemoveAgedItems1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.removeAgedItems(false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAgedItems(boolean)
    
    @Test
    public void testRemoveAgedItems2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) -1);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        data.add(timeSeries);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 2);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(0L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.ClassCastException: class org.jfree.data.time.TimeSeries cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (org.jfree.data.time.TimeSeries and org.jfree.data.time.TimeSeriesDataItem are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:880) */
        timeSeries.removeAgedItems(false);
    }
    
    @Test
    public void testRemoveAgedItems3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period, "org.jfree.data.time.Month", "year", 33554432);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period1 = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(period1, "org.jfree.data.time.Month", "month", 1342324747);
        setField(period1, "org.jfree.data.time.Month", "year", -11340460);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(0L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:880) */
        timeSeries.removeAgedItems(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.removeAgedItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAgedItems(long, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(long,boolean)}
 * @utbot.executesCondition {@code (this.data.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveAgedItems_ThisDataIsEmpty() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.removeAgedItems(-255L, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAgedItems(long, boolean)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#removeAgedItems(long,boolean)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.data.isEmpty()
 *  */
    @Test
    public void testRemoveAgedItems_ThrowNullPointerException1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:905) */
        timeSeries.removeAgedItems(-255L, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAgedItems(long, boolean)
    
    @Test
    public void testRemoveAgedItems4() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.removeAgedItems] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:917) */
        timeSeries.removeAgedItems(0L, false);
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Domain", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainDescription_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String domain = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "domain", domain);
        SwingPropertyChangeSupport propertyChangeSupport = ((SwingPropertyChangeSupport) createInstance("javax.swing.event.SwingPropertyChangeSupport"));
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setDomainDescription(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setDomainDescription(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setDomainDescription(java.lang.String)}
     */
    @Test
    public void testSetDomainDescriptionWithNonEmptyString() {
        Date date = new Date(1, -1, 1);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 1.0);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem, "XZ", "abc");
        timeSeries.setMaximumItemAge(java.lang.Long.MAX_VALUE);
        timeSeries.setDescription("Domain");
        timeSeries.setNotify(false);
        timeSeries.setMaximumItemCount(-1);
        Date date1 = new Date();
        Date date2 = new Date(Integer.MAX_VALUE, 0, -1, Integer.MIN_VALUE, -1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date1, date2);
        timeSeries.setKey(simpleTimePeriod);
        
        timeSeries.setDomainDescription("abc");
    }
    ///endregion
    
    ///region Errors report for setDomainDescription
    
    public void testSetDomainDescription_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static java.awt.Toolkit java.awt.Toolkit.toolkit accessible: module
        java.desktop does not "opens java.awt" to unnamed module @4fcd19b3 */
        
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
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)}
 *  */
    @Test
    public void testUpdateBoundsForRemovedItem() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.executesCondition {@code (y <= this.minY): False}
 * @utbot.executesCondition {@code (y >= this.maxY): False}
 * @utbot.invokes {@link java.lang.Number#doubleValue()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 *  */
    @Test
    public void testUpdateBoundsForRemovedItem_YLessThanThisMaxY() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", -2.0461584000000004E7);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 2.0358156171875004E7);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 4655363;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number yN = item.getValue();
 *  */
    @Test
    public void testUpdateBoundsForRemovedItem_ThrowNullPointerException() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem(TimeSeries.java:1228) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = ((Object) null);
        try {
            updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test
    public void testUpdateBoundsForRemovedItem1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", java.lang.Double.NaN);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 1.1125369292536007E-308);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 1057003654;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
        
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    
    @Test
    public void testUpdateBoundsForRemovedItem2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 1.3756410936121108E157);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", java.lang.Double.NaN);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 184815616;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test
    public void testUpdateBoundsForRemovedItem3() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 128.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", java.lang.Double.NaN);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 128;
        timeSeriesDataItem.setValue(value);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1248)
            org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem(TimeSeries.java:1233) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        try {
            updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateBoundsForRemovedItem4() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", -2.8003065049254016E102);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", -2.48663872908455E86);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = -671094083;
        timeSeriesDataItem.setValue(value);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1248)
            org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem(TimeSeries.java:1233) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForRemovedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForRemovedItem", timeSeriesDataItemType);
        updateBoundsForRemovedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForRemovedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForRemovedItemMethodArguments[0] = timeSeriesDataItem;
        try {
            updateBoundsForRemovedItemMethod.invoke(timeSeries, updateBoundsForRemovedItemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.findBoundsByIteration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findBoundsByIteration()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 *  */
    @Test
    public void testFindBoundsByIteration() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 *  */
    @Test
    public void testFindBoundsByIteration_IteratorHasNext() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 *  */
    @Test
    public void testFindBoundsByIteration_IteratorHasNext_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findBoundsByIteration()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) iterator.next();
 *  */
    @Test
    public void testFindBoundsByIteration_ThrowClassCastException() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.findBoundsByIteration] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1250) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        try {
            findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = this.data.iterator();
 *  */
    @Test
    public void testFindBoundsByIteration_ThrowNullPointerException() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.findBoundsByIteration] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1248) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        try {
            findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#findBoundsByIteration()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateBoundsForAddedItem(item);
 *  */
    @Test
    public void testFindBoundsByIteration_ThrowNullPointerException_1() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.findBoundsByIteration] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        try {
            findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findBoundsByIteration()
    
    @Test
    public void testFindBoundsByIteration1() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Double value = 0.0;
        timeSeriesDataItem.setValue(value);
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.findBoundsByIteration] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        try {
            findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFindBoundsByIteration2() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.findBoundsByIteration] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Method findBoundsByIterationMethod = timeSeriesClazz.getDeclaredMethod("findBoundsByIteration");
        findBoundsByIterationMethod.setAccessible(true);
        java.lang.Object[] findBoundsByIterationMethodArguments = new java.lang.Object[0];
        try {
            findBoundsByIterationMethod.invoke(timeSeries, findBoundsByIterationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setMaximumItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximumItemCount(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setMaximumItemCount(int)}
 * @utbot.executesCondition {@code (count > maximum): False}
 *  */
    @Test
    public void testSetMaximumItemCount_CountLessOrEqualMaximum() throws Exception  {
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
 * @utbot.executesCondition {@code (count > maximum): True}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#delete(int,int)}
 *  */
    @Test
    public void testSetMaximumItemCount_CountGreaterThanMaximum() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        Class timePeriodClass = Object.class;
        timeSeries.timePeriodClass = timePeriodClass;
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemCount(-255);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        timeSeries.setMaximumItemCount(0);
        
        Class finalTimeSeriesTimePeriodClass = timeSeries.timePeriodClass;
        int finalTimeSeriesMaximumItemCount = ((Integer) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maximumItemCount"));
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        assertNull(finalTimeSeriesTimePeriodClass);
        
        assertEquals(0, finalTimeSeriesMaximumItemCount);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalTimeSeriesMaxY, 1.0E-6);
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
 * @utbot.executesCondition {@code (maximum < 0): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.data.size();
 *  */
    @Test
    public void testSetMaximumItemCount_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        timeSeries.setMaximumItemCount(-255);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.setMaximumItemCount(TimeSeries.java:296) */
        timeSeries.setMaximumItemCount(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setMaximumItemCount(int)
    
    @Test
    public void testSetMaximumItemCount1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        timeSeries.setMaximumItemCount(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setMaximumItemCount(int)
    
    @Test
    public void testSetMaximumItemCount2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = object;
        objectArray[2] = objectArray;
        data.add(objectArray);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jfree.data.time.TimeSeriesDataItem ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1250)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987)
            org.jfree.data.time.TimeSeries.setMaximumItemCount(TimeSeries.java:298) */
        timeSeries.setMaximumItemCount(1);
    }
    
    @Test
    public void testSetMaximumItemCount3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211)
            org.jfree.data.time.TimeSeries.findBoundsByIteration(TimeSeries.java:1251)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:1006)
            org.jfree.data.time.TimeSeries.delete(TimeSeries.java:987)
            org.jfree.data.time.TimeSeries.setMaximumItemCount(TimeSeries.java:298) */
        timeSeries.setMaximumItemCount(2);
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(TimeSeries.java:501) */
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
            org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(TimeSeries.java:500) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)
    
    @Test
    public void testGetTimePeriodsUniqueToOtherSeries1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Second period = ((Second) createInstance("org.jfree.data.time.Second"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "data", data);
        
        ArrayList actual = ((ArrayList) timeSeries.getTimePeriodsUniqueToOtherSeries(timeSeries1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTimePeriodsUniqueToOtherSeries2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        TimeSeries timeSeries1 = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data1 = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Second period = ((Second) createInstance("org.jfree.data.time.Second"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data1.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data1.add(timeSeriesDataItem1);
        data1.add(timeSeriesDataItem1);
        setField(timeSeries1, "org.jfree.data.time.TimeSeries", "data", data1);
        
        timeSeries.getTimePeriodsUniqueToOtherSeries(timeSeries1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.setRangeDescription
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: firePropertyChange("Range", old, description);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeDescription_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        String range = "";
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "range", range);
        SwingPropertyChangeSupport propertyChangeSupport = ((SwingPropertyChangeSupport) createInstance("javax.swing.event.SwingPropertyChangeSupport"));
        setField(timeSeries, "org.jfree.data.general.Series", "propertyChangeSupport", propertyChangeSupport);
        
        timeSeries.setRangeDescription(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setRangeDescription(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.time.TimeSeries}
     * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#setRangeDescription(java.lang.String)}
     */
    @Test
    public void testSetRangeDescriptionWithNonEmptyString() {
        Date date = new Date(1, -1, 1);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 1.0);
        TimeSeries timeSeries = new TimeSeries(oHLCDataItem, "XZ", "abc");
        timeSeries.setMaximumItemAge(java.lang.Long.MAX_VALUE);
        timeSeries.setDescription("Range");
        timeSeries.setNotify(false);
        timeSeries.setMaximumItemCount(-1);
        Date date1 = new Date();
        Date date2 = new Date(Integer.MAX_VALUE, 0, -1, Integer.MIN_VALUE, -1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date1, date2);
        timeSeries.setKey(simpleTimePeriod);
        
        timeSeries.setRangeDescription("abc");
    }
    ///endregion
    
    ///region Errors report for setRangeDescription
    
    public void testSetRangeDescription_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static java.awt.Toolkit java.awt.Toolkit.toolkit accessible: module
        java.desktop does not "opens java.awt" to unnamed module @4fcd19b3 */
        
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
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.updateBoundsForAddedItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 *  */
    @Test
    public void testUpdateBoundsForAddedItem_TimeSeriesDataItemGetValue() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForAddedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForAddedItem", timeSeriesDataItemType);
        updateBoundsForAddedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForAddedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForAddedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForAddedItemMethod.invoke(timeSeries, updateBoundsForAddedItemMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number yN = item.getValue();
 *  */
    @Test
    public void testUpdateBoundsForAddedItem_ThrowNullPointerException() throws Throwable  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.updateBoundsForAddedItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(TimeSeries.java:1211) */
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForAddedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForAddedItem", timeSeriesDataItemType);
        updateBoundsForAddedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForAddedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForAddedItemMethodArguments[0] = ((Object) null);
        try {
            updateBoundsForAddedItemMethod.invoke(timeSeries, updateBoundsForAddedItemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)
    
    @Test
    public void testUpdateBoundsForAddedItem1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = -8585216;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForAddedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForAddedItem", timeSeriesDataItemType);
        updateBoundsForAddedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForAddedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForAddedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForAddedItemMethod.invoke(timeSeries, updateBoundsForAddedItemMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        
        org.junit.Assert.assertEquals(-8585216.0, finalTimeSeriesMinY, 1.0E-6);
    }
    
    @Test
    public void testUpdateBoundsForAddedItem2() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", java.lang.Double.NaN);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 2.0);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForAddedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForAddedItem", timeSeriesDataItemType);
        updateBoundsForAddedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForAddedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForAddedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForAddedItemMethod.invoke(timeSeries, updateBoundsForAddedItemMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        
        org.junit.Assert.assertEquals(0.0, finalTimeSeriesMinY, 1.0E-6);
    }
    
    @Test
    public void testUpdateBoundsForAddedItem3() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", java.lang.Double.NaN);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", java.lang.Double.NaN);
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Integer value = 0;
        timeSeriesDataItem.setValue(value);
        
        Class timeSeriesClazz = Class.forName("org.jfree.data.time.TimeSeries");
        Class timeSeriesDataItemType = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Method updateBoundsForAddedItemMethod = timeSeriesClazz.getDeclaredMethod("updateBoundsForAddedItem", timeSeriesDataItemType);
        updateBoundsForAddedItemMethod.setAccessible(true);
        java.lang.Object[] updateBoundsForAddedItemMethodArguments = new java.lang.Object[1];
        updateBoundsForAddedItemMethodArguments[0] = timeSeriesDataItem;
        updateBoundsForAddedItemMethod.invoke(timeSeries, updateBoundsForAddedItemMethodArguments);
        
        double finalTimeSeriesMinY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "minY"));
        double finalTimeSeriesMaxY = ((Double) getFieldValue(timeSeries, "org.jfree.data.time.TimeSeries", "maxY"));
        
        org.junit.Assert.assertEquals(0.0, finalTimeSeriesMinY, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalTimeSeriesMaxY, 1.0E-6);
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
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getTimePeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriod(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#getPeriod()}
 * @utbot.returnsFrom {@code return getRawDataItem(index).getPeriod();}
 *  */
    @Test
    public void testGetTimePeriod_TimeSeriesDataItemGetPeriod() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Month period = ((Month) createInstance("org.jfree.data.time.Month"));
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Month actual = ((Month) timeSeries.getTimePeriod(0));
        
        // org.jfree.data.time.Month has overridden equals method
        assertEquals(period, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimePeriod(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRawDataItem(index).getPeriod();
 *  */
    @Test
    public void testGetTimePeriod_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriod] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463) */
        timeSeries.getTimePeriod(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getRawDataItem(index).getPeriod();
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
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463) */
        timeSeries.getTimePeriod(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getTimePeriod(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getRawDataItem(index).getPeriod();
 *  */
    @Test
    public void testGetTimePeriod_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriod] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463) */
        timeSeries.getTimePeriod(0);
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
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:473) */
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getNextTimePeriod] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:473) */
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
            org.jfree.data.time.TimeSeries.getNextTimePeriod(TimeSeries.java:474) */
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
        setField(period, "org.jfree.data.time.Year", "year", (short) -10001);
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
        setField(period, "org.jfree.data.time.Year", "year", (short) -2065);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        Year actual = ((Year) timeSeries.getNextTimePeriod());
        
        Year expected = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(expected, "org.jfree.data.time.Year", "year", (short) -2064);
        setField(expected, "org.jfree.data.time.Year", "firstMillisecond", -144438015600000L);
        setField(expected, "org.jfree.data.time.Year", "lastMillisecond", 20164870799999L);
        
        // org.jfree.data.time.Year has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getDataItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#clone()}
 *  */
    @Test
    public void testGetDataItem_TimeSeriesDataItemClone() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        data.add(timeSeriesDataItem);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        TimeSeriesDataItem actual = timeSeries.getDataItem(0);
        
        TimeSeriesDataItem expected = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        
        // org.jfree.data.time.TimeSeriesDataItem has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:389) */
        timeSeries.getDataItem(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:389) */
        timeSeries.getDataItem(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TimeSeriesDataItem item = (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetDataItem_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:389) */
        timeSeries.getDataItem(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getDataItem(int)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeriesDataItem#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (TimeSeriesDataItem) item.clone();
 *  */
    @Test
    public void testGetDataItem_ThrowNullPointerException_1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getDataItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getDataItem(TimeSeries.java:390) */
        timeSeries.getDataItem(0);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataItem(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetDataItem1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Minute minute = ((Minute) createInstance("org.jfree.data.time.Minute"));
        
        TimeSeriesDataItem actual = timeSeries.getDataItem(minute);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getMinY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinY()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getMinY()}
 * @utbot.returnsFrom {@code return this.minY;}
 *  */
    @Test
    public void testGetMinY_ReturnThisMinY() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "minY", 0.0);
        
        double actual = timeSeries.getMinY();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getMaxY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxY()
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getMaxY()}
 * @utbot.returnsFrom {@code return this.maxY;}
 *  */
    @Test
    public void testGetMaxY_ReturnThisMaxY() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "maxY", 0.0);
        
        double actual = timeSeries.getMaxY();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
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
        setField(period, "org.jfree.data.time.Month", "month", -32752);
        setField(period, "org.jfree.data.time.Month", "year", 2);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) -32728);
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:878)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:330) */
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:880)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:330) */
        timeSeries.setMaximumItemAge(0L);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setMaximumItemAge(long)
    
    @Test
    public void testSetMaximumItemAge1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        TimeSeriesDataItem timeSeriesDataItem = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period, "org.jfree.data.time.Year", "year", (short) -3);
        setField(timeSeriesDataItem, "org.jfree.data.time.TimeSeriesDataItem", "period", period);
        data.add(timeSeriesDataItem);
        data.add(null);
        TimeSeriesDataItem timeSeriesDataItem1 = ((TimeSeriesDataItem) createInstance("org.jfree.data.time.TimeSeriesDataItem"));
        Year period1 = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(period1, "org.jfree.data.time.Year", "year", (short) 0);
        setField(timeSeriesDataItem1, "org.jfree.data.time.TimeSeriesDataItem", "period", period1);
        data.add(timeSeriesDataItem1);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        timeSeries.setMaximumItemAge(0L);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.setMaximumItemAge] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.removeAgedItems(TimeSeries.java:880)
            org.jfree.data.time.TimeSeries.setMaximumItemAge(TimeSeries.java:330) */
        timeSeries.setMaximumItemAge(2L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getRawDataItem
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRawDataItem(org.jfree.data.time.RegularTimePeriod)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRawDataItem(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.invokes {@link org.jfree.data.time.TimeSeries#getIndex(org.jfree.data.time.RegularTimePeriod)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(period);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRawDataItem_ThrowIllegalArgumentException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        timeSeries.getRawDataItem(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRawDataItem(org.jfree.data.time.RegularTimePeriod)
    
    @Test
    public void testGetRawDataItem1() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        Millisecond millisecond = ((Millisecond) createInstance("org.jfree.data.time.Millisecond"));
        
        TimeSeriesDataItem actual = timeSeries.getRawDataItem(millisecond);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.TimeSeries.getRawDataItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRawDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (TimeSeriesDataItem) this.data.get(index);}
 *  */
    @Test
    public void testGetRawDataItem_ListGet() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        TimeSeriesDataItem actual = timeSeries.getRawDataItem(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRawDataItem(int)
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetRawDataItem_ThrowClassCastException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        Object object = createInstance("java.lang.Object");
        data.add(object);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getRawDataItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429) */
        timeSeries.getRawDataItem(0);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetRawDataItem_ThrowIndexOutOfBoundsException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(timeSeries, "org.jfree.data.time.TimeSeries", "data", data);
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getRawDataItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429) */
        timeSeries.getRawDataItem(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TimeSeries}
 * @utbot.methodUnderTest {@link org.jfree.data.time.TimeSeries#getRawDataItem(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (TimeSeriesDataItem) this.data.get(index);
 *  */
    @Test
    public void testGetRawDataItem_ThrowNullPointerException() throws Exception  {
        TimeSeries timeSeries = ((TimeSeries) createInstance("org.jfree.data.time.TimeSeries"));
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getRawDataItem] produces [java.lang.NullPointerException]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429) */
        timeSeries.getRawDataItem(-255);
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
        Year period = ((Year) createInstance("org.jfree.data.time.Year"));
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
        
        /* This test fails because method [org.jfree.data.time.TimeSeries.getTimePeriods] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.time.TimeSeriesDataItem (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.time.TimeSeriesDataItem is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.time.TimeSeries.getRawDataItem(TimeSeries.java:429)
            org.jfree.data.time.TimeSeries.getTimePeriod(TimeSeries.java:463)
            org.jfree.data.time.TimeSeries.getTimePeriods(TimeSeries.java:485) */
        timeSeries.getTimePeriods();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields795567322734300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields795567322734300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass795567322747500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795567322734300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795567322747500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields795567323710400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields795567323710400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass795567323714500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields795567323710400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass795567323714500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

