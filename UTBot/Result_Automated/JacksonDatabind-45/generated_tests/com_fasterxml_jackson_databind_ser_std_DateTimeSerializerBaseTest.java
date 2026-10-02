package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import java.util.GregorianCalendar;
import java.sql.Date;
import java.sql.Time;
import sun.util.calendar.LocalGregorianCalendar;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_ser_std_DateTimeSerializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", 1L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        boolean actual = calendarSerializer.isEmpty(null, gregorianCalendar);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero() {
        DateSerializer dateSerializer = new DateSerializer();
        
        boolean actual = dateSerializer.isEmpty(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_1() {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = new Date(0L);
        
        boolean actual = dateSerializer.isEmpty(null, date);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_1() {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = new Time(1L);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_2() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = ((Date) createInstance("java.sql.Date"));
        setField(date, "java.util.Date", "fastTime", 1L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, date);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_3() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(date, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_4() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(675282944);
        setField(timestamp, "java.util.Date", "fastTime", 512L);
        
        boolean actual = dateSerializer.isEmpty(null, timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_5() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException() {
        DateSerializer dateSerializer = new DateSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Date ([B and java.util.Date are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.DateSerializer._timestamp(DateSerializer.java:15)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        dateSerializer.isEmpty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException_1() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Calendar ([B and java.util.Calendar are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsEmpty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {1, 0, 0, 0, 1, 0, 0, 1};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8]
            java.base/java.util.Calendar.selectFields(Calendar.java:2466)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowIllegalArgumentException() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {2};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.IllegalArgumentException: ERA]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsEmpty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.isExternallySet(Calendar.java:2301)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2606)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    @Test
    public void testIsEmpty1() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = -1879048189;
        stamp[4] = -2143289344;
        stamp[6] = 2;
        stamp[7] = -1879048191;
        stamp[8] = -2147483646;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty2() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            0, 3, 3, 0, -66879487, -33554432, -1107296255, -66879487,
            -1073741696
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty3() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[12];
        stamp[0] = 1;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1073741824;
        stamp[6] = 1;
        stamp[11] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            java.base/java.util.Calendar.selectFields(Calendar.java:2570)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty4() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[13];
        stamp[0] = 1;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1073741824;
        stamp[6] = 1;
        stamp[10] = 1;
        stamp[11] = 1;
        stamp[12] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            java.base/java.util.Calendar.selectFields(Calendar.java:2573)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty5() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1073741824;
        stamp[6] = 1;
        stamp[9] = -2147483647;
        stamp[11] = Integer.MIN_VALUE;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty6() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[16];
        stamp[0] = 16;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1073741824;
        stamp[6] = 1;
        stamp[11] = 1;
        stamp[12] = 1;
        stamp[15] = 1073741824;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16]
            java.base/java.util.Calendar.selectFields(Calendar.java:2582)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty7() {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.sql.Date (java.lang.Object is in module java.base of loader 'bootstrap'; java.sql.Date is in module java.sql of loader 'platform')]
            com.fasterxml.jackson.databind.ser.std.SqlDateSerializer._timestamp(SqlDateSerializer.java:18)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        sqlDateSerializer.isEmpty(null, object);
    }
    
    @Test
    public void testIsEmpty8() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0, 0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = new int[26];
        stamp[0] = 1;
        stamp[1] = 1;
        stamp[2] = 3;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 889217360;
        stamp[6] = 889217360;
        stamp[9] = 1;
        stamp[11] = -1;
        stamp[12] = 1;
        stamp[15] = 2;
        stamp[16] = 2;
        stamp[17] = 3;
        stamp[18] = 3;
        stamp[19] = 3;
        stamp[20] = 3;
        stamp[21] = 3;
        stamp[22] = 3;
        stamp[23] = 3;
        stamp[24] = 3;
        stamp[25] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 2]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2648)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty9() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[27];
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[4] = -2113765255;
        stamp[6] = 33718386;
        stamp[7] = 33718386;
        stamp[8] = -2079850333;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        stamp[15] = 3;
        stamp[16] = 3;
        stamp[17] = 3;
        stamp[18] = 3;
        stamp[19] = 3;
        stamp[20] = 3;
        stamp[21] = 3;
        stamp[22] = 3;
        stamp[23] = 3;
        stamp[24] = 3;
        stamp[25] = 3;
        stamp[26] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2623)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty10() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {
            1073741824, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3311)
            java.base/java.util.GregorianCalendar.clone(GregorianCalendar.java:1964)
            java.base/java.util.GregorianCalendar.getMaximum(GregorianCalendar.java:1566)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2608)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:99) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    ///endregion
    
    ///region Errors report for isEmpty
    
    public void testIsEmpty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 107 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero1() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(japaneseImperialCalendar, "java.util.Calendar", "time", 1L);
        setField(japaneseImperialCalendar, "java.util.Calendar", "isTimeSet", true);
        
        boolean actual = calendarSerializer.isEmpty(japaneseImperialCalendar);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero1() {
        DateSerializer dateSerializer = new DateSerializer();
        
        boolean actual = dateSerializer.isEmpty(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEmpty(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_11() {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = new Date(0L);
        
        boolean actual = dateSerializer.isEmpty(date);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_11() {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = new Time(1L);
        
        boolean actual = dateSerializer.isEmpty(time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_21() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(1027736704);
        setField(timestamp, "java.util.Date", "fastTime", 3072L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(timestamp, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_31() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(131072);
        setField(timestamp, "java.util.Date", "fastTime", 2L);
        
        boolean actual = dateSerializer.isEmpty(timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_41() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(date, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_2() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = ((Date) createInstance("java.sql.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date2 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date3 = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(date3, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date2, "sun.util.calendar.ImmutableGregorianDate", "date", date3);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(date);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException1() {
        DateSerializer dateSerializer = new DateSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Date ([B and java.util.Date are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.DateSerializer._timestamp(DateSerializer.java:15)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        dateSerializer.isEmpty(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException_11() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Calendar ([B and java.util.Calendar are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(byteArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty(java.lang.Object)
    
    @Test
    public void testIsEmpty11() {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.sql.Date (java.lang.Object is in module java.base of loader 'bootstrap'; java.sql.Date is in module java.sql of loader 'platform')]
            com.fasterxml.jackson.databind.ser.std.SqlDateSerializer._timestamp(SqlDateSerializer.java:18)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        sqlDateSerializer.isEmpty(object);
    }
    
    @Test
    public void testIsEmpty12() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[4] = 1;
        stamp[6] = 1;
        stamp[7] = 1073741824;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty13() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[11];
        stamp[3] = 1342177279;
        stamp[5] = -1;
        stamp[6] = 1610612738;
        stamp[7] = -1879048195;
        stamp[8] = -1879048195;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty14() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[12];
        stamp[0] = 1;
        stamp[3] = 70;
        stamp[4] = 70;
        stamp[5] = 70;
        stamp[6] = 70;
        stamp[7] = 70;
        stamp[11] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            java.base/java.util.Calendar.selectFields(Calendar.java:2570)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty15() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[16];
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[4] = -535818239;
        stamp[5] = -268435456;
        stamp[7] = -535818240;
        stamp[8] = -535818240;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        stamp[15] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16]
            java.base/java.util.Calendar.selectFields(Calendar.java:2582)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty16() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 2048;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 33611371;
        stamp[4] = -2147483644;
        stamp[6] = 2;
        stamp[7] = -2147483644;
        stamp[9] = 3;
        stamp[10] = 262144;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty17() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.JapaneseImperialCalendar.computeTime(JapaneseImperialCalendar.java:1839)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:93) */
        calendarSerializer.isEmpty(japaneseImperialCalendar);
    }
    ///endregion
    
    ///region Errors report for isEmpty
    
    public void testIsEmpty_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 270 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = new ISO8601DateFormat();
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, iSO8601DateFormat);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        calendarSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_1() throws Exception  {
        Boolean boolean1 = false;
        DateSerializer dateSerializer = new DateSerializer(boolean1, null);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        dateSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_2() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer(null, null);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        dateSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_3() throws Exception  {
        Boolean boolean1 = true;
        DateSerializer dateSerializer = new DateSerializer(boolean1, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        dateSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_4() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer(null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        dateSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor(DateTimeSerializerBase.java:113) */
        calendarSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_ThrowIllegalArgumentException() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(null);
        
        calendarSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            Boolean boolean1 = false;
            CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            Boolean boolean1 = true;
            CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "number";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            ISO8601DateFormat iSO8601DateFormat = new ISO8601DateFormat();
            CalendarSerializer calendarSerializer = new CalendarSerializer(null, iSO8601DateFormat);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -256);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(impl, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "number";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(impl, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _asTimestamp(serializers)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSchema_ThrowIllegalArgumentException() {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        
        calendarSerializer.getSchema(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): True}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_AsNumber_1() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        dateSerializer._acceptJsonFormatVisitor(anonymousBase, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): False}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_NotAsNumber() throws JsonMappingException  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        
        sqlDateSerializer._acceptJsonFormatVisitor(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): False}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_NotAsNumber_1() throws JsonMappingException  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        sqlDateSerializer._acceptJsonFormatVisitor(base, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): True}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_AsNumber() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        calendarSerializer._acceptJsonFormatVisitor(null, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return _useTimestamp.booleanValue();}
 *  */
    @Test
    public void test_asTimestamp__useTimestampNotEqualsNull() {
        Boolean boolean1 = false;
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(boolean1);
        
        boolean actual = sqlDateSerializer._asTimestamp(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.executesCondition {@code (serializers != null): True}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);}
 *  */
    @Test
    public void test_asTimestamp_SerializersNotEqualsNull() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = calendarSerializer._asTimestamp(impl);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.executesCondition {@code (serializers != null): True}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);}
 *  */
    @Test
    public void test_asTimestamp_SerializersNotEqualsNull_1() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer(null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = dateSerializer._asTimestamp(impl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): False}
 * @utbot.returnsFrom {@code return false;}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return false;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_asTimestamp_ThrowIllegalArgumentException() {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
        
        sqlDateSerializer._asTimestamp(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_PropertyEqualsNull() throws JsonMappingException  {
        DateSerializer dateSerializer = new DateSerializer();
        
        DateSerializer actual = ((DateSerializer) dateSerializer.createContextual(null, null));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        Class dateSerializer_handledType = dateSerializer._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanProperty#getMember()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanProperty#getMember()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFormat(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFormat(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_PropertyNotEqualsNull() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DateSerializer dateSerializer = new DateSerializer();
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            
            Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = objectIdValueProperty;
            DateSerializer actual = ((DateSerializer) createContextualMethod.invoke(dateSerializer, createContextualMethodArguments));
            
            Boolean actual_useTimestamp = actual._useTimestamp;
            assertNull(actual_useTimestamp);
            
            DateFormat actual_customFormat = actual._customFormat;
            assertNull(actual_customFormat);
            
            Class dateSerializer_handledType = dateSerializer._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = serializers.getAnnotationIntrospector().findFormat((Annotated) property.getMember());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:54) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class serializerProviderType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", serializerProviderType, managedReferencePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = ((Object) null);
        createContextualMethodArguments[1] = managedReferenceProperty;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = serializers.getAnnotationIntrospector().findFormat((Annotated) property.getMember());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:54) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = serializers.getAnnotationIntrospector().findFormat((Annotated) property.getMember());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:54) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual1() throws Throwable  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual2() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual3() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, beanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = beanPropertyWriter;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual4() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual5() throws Throwable  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary9);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual6() throws Throwable  {
        DateSerializer dateSerializer = new DateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual7() throws Throwable  {
        DateSerializer dateSerializer = new DateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:411)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:54) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual8() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException] */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual9() throws Throwable  {
        DateSerializer dateSerializer = new DateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:411)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:410)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:54) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual10() throws Throwable  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException] */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
        try {
            createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1074821602177799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1074821602177799.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1074821602184500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074821602177799.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074821602184500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1074821603636400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1074821603636400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1074821603639900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074821603636400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074821603639900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

