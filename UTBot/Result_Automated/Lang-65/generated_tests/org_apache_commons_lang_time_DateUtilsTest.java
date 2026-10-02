package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Time;
import org.apache.commons.lang.time.DateUtils.DateIterator;
import sun.util.BuddhistCalendar;
import sun.util.calendar.LocalGregorianCalendar;
import java.sql.Timestamp;
import java.text.ParseException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_time_DateUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_ThrowIllegalArgumentException() {
        DateUtils.truncate(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar truncated = (Calendar) date.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.truncate(((Calendar) gregorianCalendar), -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncate(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar truncated = (Calendar) date.clone();
 *  */
    @Test
    public void testTruncate_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:572) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method truncateMethod = dateUtilsClazz.getDeclaredMethod("truncate", japaneseImperialCalendarType, intType);
        truncateMethod.setAccessible(true);
        java.lang.Object[] truncateMethodArguments = new java.lang.Object[2];
        truncateMethodArguments[0] = japaneseImperialCalendar;
        truncateMethodArguments[1] = -255;
        try {
            truncateMethod.invoke(null, truncateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: date instanceof Calendar
 *  */
    @Test(expected = ClassCastException.class)
    public void testTruncate_ThrowClassCastException() {
        byte[] byteArray = {};
        
        DateUtils.truncate(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_ThrowIllegalArgumentException1() {
        DateUtils.truncate(((Object) null), -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncate(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return truncate((Calendar) date, field).getTime();
 *  */
    @Test
    public void testTruncate_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:572)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:604) */
        DateUtils.truncate(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncate(java.lang.Object, int)
    
    @Test
    public void testTruncate1() {
        Date date = new Date(0L);
        
        java.util.Date actual = DateUtils.truncate(((Object) date), 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for truncate
    
    public void testTruncate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_ThrowIllegalArgumentException2() {
        DateUtils.truncate(((java.util.Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method truncate(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Date,int)}
     */
    @Test
    public void testTruncateWithCornerCase() {
        java.util.Date date = new java.util.Date();
        
        java.util.Date actual = DateUtils.truncate(date, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Date,int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncateThrowsIAEWithCornerCase() {
        java.util.Date date = new java.util.Date();
        
        DateUtils.truncate(date, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncate(java.util.Date, int)
    
    @Test
    public void testTruncate2() {
        java.util.Date date = new java.util.Date();
        
        java.util.Date actual = DateUtils.truncate(date, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for truncate
    
    public void testTruncate_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.util.Date, int, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() {
        DateUtils.add(null, -255, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add(java.util.Date, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
     */
    @Test
    public void testAddThrowsIAE() {
        java.util.Date date = new java.util.Date();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.add] produces [java.lang.IllegalArgumentException]
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:920)
            java.base/sun.util.BuddhistCalendar.add(BuddhistCalendar.java:161)
            org.apache.commons.lang.time.DateUtils.add(DateUtils.java:402) */
        DateUtils.add(date, 16385, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.util.Date, int, int)
    
    @Test
    public void testAdd1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.add(time, 0, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Date,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_ThrowIllegalArgumentException() {
        DateUtils.iterator(((java.util.Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Date,int)}
     */
    @Test
    public void testIterator() throws Exception  {
        java.util.Date date = new java.util.Date();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(date, 1));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        BuddhistCalendar endFinal = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        BuddhistCalendar spot = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.util.Date, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterator1() {
        Date date = new Date(0L);
        
        DateUtils.iterator(((java.util.Date) date), 0);
    }
    ///endregion
    
    ///region Errors report for iterator
    
    public void testIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 1));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_1() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 2));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_2() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 3));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_3() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 4));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_MONTH_MONDAY}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_MONTH_MONDAY() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 6));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_MONTH_MONDAY}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_MONTH_MONDAY_1() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 5));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang.time.DateUtils$DateIterator"));
        GregorianCalendar endFinal = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal", endFinal);
        GregorianCalendar spot = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot", spot);
        
        Calendar expectedEndFinal = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        Calendar actualEndFinal = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "endFinal"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedEndFinal, actualEndFinal);
        
        Calendar expectedSpot = ((Calendar) getFieldValue(expected, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        Calendar actualSpot = ((Calendar) getFieldValue(actual, "org.apache.commons.lang.time.DateUtils$DateIterator", "spot"));
        // java.util.Calendar has overridden equals method
        assertEquals(expectedSpot, actualSpot);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_ThrowIllegalArgumentException1() {
        DateUtils.iterator(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: switch(rangeStyle) case: default
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.iterator(((Calendar) gregorianCalendar), -249);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: start = truncate(focus, Calendar.DATE);
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:572)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:801) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method iteratorMethod = dateUtilsClazz.getDeclaredMethod("iterator", japaneseImperialCalendarType, intType);
        iteratorMethod.setAccessible(true);
        java.lang.Object[] iteratorMethodArguments = new java.lang.Object[2];
        iteratorMethodArguments[0] = japaneseImperialCalendar;
        iteratorMethodArguments[1] = 3;
        try {
            iteratorMethod.invoke(null, iteratorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.executesCondition {@code (focus instanceof Date): False}
 * @utbot.executesCondition {@code (focus instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: focus instanceof Calendar
 *  */
    @Test(expected = ClassCastException.class)
    public void testIterator_ThrowClassCastException() {
        byte[] byteArray = {};
        
        DateUtils.iterator(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_ThrowIllegalArgumentException2() {
        DateUtils.iterator(((Object) null), -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.executesCondition {@code (focus instanceof Date): False}
 * @utbot.executesCondition {@code (focus instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iterator((Calendar) focus, rangeStyle);
 *  */
    @Test
    public void testIterator_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:572)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:801)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:871) */
        DateUtils.iterator(japaneseImperialCalendar, 2);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.lang.Object, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterator2() {
        Date date = new Date(0L);
        
        DateUtils.iterator(((Object) date), 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterator(java.lang.Object, int)
    
    @Test
    public void testIterator3() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:572)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:785)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:871) */
        DateUtils.iterator(japaneseImperialCalendar, 5);
    }
    ///endregion
    
    ///region Errors report for iterator
    
    public void testIterator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method round(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRound_ThrowIllegalArgumentException() {
        DateUtils.round(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar rounded = (Calendar) date.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRound_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.round(((Calendar) gregorianCalendar), -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar rounded = (Calendar) date.clone();
 *  */
    @Test
    public void testRound_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:477) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method roundMethod = dateUtilsClazz.getDeclaredMethod("round", japaneseImperialCalendarType, intType);
        roundMethod.setAccessible(true);
        java.lang.Object[] roundMethodArguments = new java.lang.Object[2];
        roundMethodArguments[0] = japaneseImperialCalendar;
        roundMethodArguments[1] = -255;
        try {
            roundMethod.invoke(null, roundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method round(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: date instanceof Calendar
 *  */
    @Test(expected = ClassCastException.class)
    public void testRound_ThrowClassCastException() {
        byte[] byteArray = {};
        
        DateUtils.round(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRound_ThrowIllegalArgumentException1() {
        DateUtils.round(((Object) null), -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return round((Calendar) date, field).getTime();
 *  */
    @Test
    public void testRound_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:477)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:519) */
        DateUtils.round(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.lang.Object, int)
    
    @Test
    public void testRound1() {
        java.util.Date date = new java.util.Date();
        
        java.util.Date actual = DateUtils.round(((Object) date), 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for round
    
    public void testRound_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method round(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRound_ThrowIllegalArgumentException2() {
        DateUtils.round(((java.util.Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Date,int)}
     */
    @Test
    public void testRound() {
        java.util.Date date = new java.util.Date();
        
        java.util.Date actual = DateUtils.round(date, 1);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method round(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Date,int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRoundThrowsIAE() {
        java.util.Date date = new java.util.Date();
        
        DateUtils.round(date, -2147483647);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.util.Date, int)
    
    @Test
    public void testRound2() {
        java.util.Date date = new java.util.Date();
        
        java.util.Date actual = DateUtils.round(date, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound3() {
        Date date = new Date(0L);
        
        java.util.Date actual = DateUtils.round(((java.util.Date) date), 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for round
    
    public void testRound_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addMonths
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addMonths(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addMonths(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.MONTH, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddMonths_ThrowIllegalArgumentException() {
        DateUtils.addMonths(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMonths(java.util.Date, int)
    
    @Test
    public void testAddMonths1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addMonths(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addMonths
    
    public void testAddMonths_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addDays
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDays(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addDays(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.DAY_OF_MONTH, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDays_ThrowIllegalArgumentException() {
        DateUtils.addDays(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addDays(java.util.Date, int)
    
    @Test
    public void testAddDays1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addDays(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addDays
    
    public void testAddDays_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addHours
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addHours(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addHours(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.HOUR_OF_DAY, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddHours_ThrowIllegalArgumentException() {
        DateUtils.addHours(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addHours(java.util.Date, int)
    
    @Test
    public void testAddHours1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addHours(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addHours
    
    public void testAddHours_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addMinutes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addMinutes(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addMinutes(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.MINUTE, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddMinutes_ThrowIllegalArgumentException() {
        DateUtils.addMinutes(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMinutes(java.util.Date, int)
    
    @Test
    public void testAddMinutes1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addMinutes(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addMinutes
    
    public void testAddMinutes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addSeconds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSeconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addSeconds(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.SECOND, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSeconds_ThrowIllegalArgumentException() {
        DateUtils.addSeconds(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addSeconds(java.util.Date, int)
    
    @Test
    public void testAddSeconds1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addSeconds(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addSeconds
    
    public void testAddSeconds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameInstant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime() throws Exception  {
        Time time = new Time(0L);
        Time time1 = ((Time) createInstance("java.sql.Time"));
        setField(time1, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time1, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(time, time1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime() throws Exception  {
        Date date = new Date(1L);
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date1 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(date, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime_1() throws Exception  {
        Time time = new Time(9L);
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(1);
        setField(timestamp, "java.util.Date", "fastTime", 9L);
        
        boolean actual = DateUtils.isSameInstant(time, timestamp);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSameInstant(java.util.Date, java.util.Date)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.util.Date#getTime()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime_1() throws Exception  {
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(-63);
        setField(timestamp, "java.util.Date", "fastTime", 9L);
        Time time = new Time(0L);
        
        boolean actual = DateUtils.isSameInstant(timestamp, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime_2() throws Exception  {
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(180224);
        setField(timestamp, "java.util.Date", "fastTime", 16777217L);
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 0L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(timestamp, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime_2() throws Exception  {
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(180224);
        setField(timestamp, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date1 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(timestamp, "java.util.Date", "cdate", cdate);
        Date date2 = new Date(0L);
        
        boolean actual = DateUtils.isSameInstant(timestamp, date2);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_ThrowIllegalArgumentException() {
        DateUtils.isSameInstant(((java.util.Date) null), ((java.util.Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): False}
 * @utbot.executesCondition {@code (date2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_ThrowIllegalArgumentException_1() {
        Time time = new Time(0L);
        
        DateUtils.isSameInstant(time, ((java.util.Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
     */
    @Test
    public void testIsSameInstantReturnsFalse() {
        java.util.Date date = new java.util.Date();
        java.util.Date date1 = new java.util.Date(-1L);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSameInstant(java.util.Date, java.util.Date)
    
    @Test
    public void testIsSameInstant1() {
        Time time = new Time(0L);
        Time time1 = new Time(0L);
        
        boolean actual = DateUtils.isSameInstant(time, time1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isSameInstant
    
    public void testIsSameInstant_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameInstant
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_ThrowIllegalArgumentException1() {
        DateUtils.isSameInstant(((Calendar) null), ((Calendar) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): False}
 * @utbot.executesCondition {@code (cal2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_ThrowIllegalArgumentException_11() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.isSameInstant(gregorianCalendar, ((Calendar) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {0};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1]
            java.base/java.util.Calendar.selectFields(Calendar.java:2462)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {0, 3, 3, 3, 4, 3, 3, 4};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8]
            java.base/java.util.Calendar.selectFields(Calendar.java:2466)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.selectFields(Calendar.java:2447)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[11];
        stamp[0] = 1;
        stamp[3] = 1;
        stamp[7] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] originalFields = {0};
        setField(gregorianCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cal1.getTime().getTime() == cal2.getTime().getTime();
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] originalFields = {};
        setField(gregorianCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {1};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2612)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:207) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar);
    }
    ///endregion
    
    ///region Errors report for isSameInstant
    
    public void testIsSameInstant_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.parseDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (parsePatterns == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < parsePatterns.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parser = new SimpleDateFormat(parsePatterns[0]);
 *  */
    @Test
    public void testParseDate_ThrowNullPointerException() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.<init>(SimpleDateFormat.java:621)
            java.base/java.text.SimpleDateFormat.<init>(SimpleDateFormat.java:603)
            org.apache.commons.lang.time.DateUtils.parseDate(DateUtils.java:260) */
        DateUtils.parseDate(string, stringArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: str == null || parsePatterns == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_ThrowIllegalArgumentException() throws ParseException  {
        DateUtils.parseDate(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (parsePatterns == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: str == null || parsePatterns == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_ThrowIllegalArgumentException_1() throws ParseException  {
        String string = "";
        
        DateUtils.parseDate(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (parsePatterns == null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.text.ParseException} in: throw new ParseException("Unable to parse the date: " + str, -1);
 *  */
    @Test(expected = ParseException.class)
    public void testParseDate_ThrowParseException() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {};
        
        DateUtils.parseDate(string, stringArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
     */
    @Test
    public void testParseDateThrowsIAEWithNonEmptyStringAndNonEmptyObjectArray() throws ParseException  {
        java.lang.String[] stringArray = {"10", "#$\\\"'", "\n\t\r"};
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.parseDate] produces [java.lang.IllegalArgumentException: Unterminated quote]
            java.base/java.text.SimpleDateFormat.compile(SimpleDateFormat.java:865)
            java.base/java.text.SimpleDateFormat.applyPatternImpl(SimpleDateFormat.java:2354)
            java.base/java.text.SimpleDateFormat.applyPattern(SimpleDateFormat.java:2350)
            org.apache.commons.lang.time.DateUtils.parseDate(DateUtils.java:262) */
        DateUtils.parseDate("XZ", stringArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testParseDate1() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = new java.lang.String[9];
        String string1 = "";
        stringArray[0] = string1;
        
        java.util.Date actual = DateUtils.parseDate(string, stringArray);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
        
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addMilliseconds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addMilliseconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addMilliseconds(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.MILLISECOND, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddMilliseconds_ThrowIllegalArgumentException() {
        DateUtils.addMilliseconds(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMilliseconds(java.util.Date, int)
    
    @Test
    public void testAddMilliseconds1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addMilliseconds(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addMilliseconds
    
    public void testAddMilliseconds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addYears
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addYears(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addYears(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.YEAR, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddYears_ThrowIllegalArgumentException() {
        DateUtils.addYears(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addYears(java.util.Date, int)
    
    @Test
    public void testAddYears1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addYears(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addYears
    
    public void testAddYears_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.modify
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method modify(java.util.Calendar, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#modify(java.util.Calendar,int,boolean)}
 * @utbot.invokes {@link java.util.Calendar#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: val.get(Calendar.YEAR) > 280000000
 *  */
    @Test
    public void testModify_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.modify] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DateUtils.modify(DateUtils.java:620) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class calendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method modifyMethod = dateUtilsClazz.getDeclaredMethod("modify", calendarType, intType, booleanType);
        modifyMethod.setAccessible(true);
        java.lang.Object[] modifyMethodArguments = new java.lang.Object[3];
        modifyMethodArguments[0] = ((Object) null);
        modifyMethodArguments[1] = -255;
        modifyMethodArguments[2] = false;
        try {
            modifyMethod.invoke(null, modifyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method modify(java.util.Calendar, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#modify(java.util.Calendar,int,boolean)}
 * @utbot.executesCondition {@code (val.get(Calendar.YEAR) > 280000000): True}
 * @utbot.invokes {@link java.util.Calendar#get(int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: val.get(Calendar.YEAR) > 280000000
 *  */
    @Test(expected = ArithmeticException.class)
    public void testModify_ThrowArithmeticException() throws Throwable  {
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(buddhistCalendar, "sun.util.BuddhistCalendar", "yearOffset", 280000004);
        int[] fields = {0, -3};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class buddhistCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method modifyMethod = dateUtilsClazz.getDeclaredMethod("modify", buddhistCalendarType, intType, booleanType);
        modifyMethod.setAccessible(true);
        java.lang.Object[] modifyMethodArguments = new java.lang.Object[3];
        modifyMethodArguments[0] = buddhistCalendar;
        modifyMethodArguments[1] = -255;
        modifyMethodArguments[2] = false;
        try {
            modifyMethod.invoke(null, modifyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for modify
    
    public void testModify_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameDay
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSameDay(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_ThrowIllegalArgumentException() {
        DateUtils.isSameDay(((Calendar) null), ((Calendar) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): False}
 * @utbot.executesCondition {@code (cal2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.isSameDay(gregorianCalendar, ((Calendar) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSameDay(java.util.Calendar, java.util.Calendar)
    
    @Test
    public void testIsSameDay1() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameDay] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.DateUtils.isSameDay(DateUtils.java:168) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class gregorianCalendarType = Class.forName("java.util.Calendar");
        Method isSameDayMethod = dateUtilsClazz.getDeclaredMethod("isSameDay", gregorianCalendarType, gregorianCalendarType);
        isSameDayMethod.setAccessible(true);
        java.lang.Object[] isSameDayMethodArguments = new java.lang.Object[2];
        isSameDayMethodArguments[0] = gregorianCalendar;
        isSameDayMethodArguments[1] = japaneseImperialCalendar;
        try {
            isSameDayMethod.invoke(null, isSameDayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for isSameDay
    
    public void testIsSameDay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 33 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameDay
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): False}
 * @utbot.executesCondition {@code (date2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_ThrowIllegalArgumentException1() {
        Time time = new Time(0L);
        
        DateUtils.isSameDay(time, ((java.util.Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_ThrowIllegalArgumentException_11() {
        DateUtils.isSameDay(((java.util.Date) null), ((java.util.Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
     */
    @Test
    public void testIsSameDayReturnsFalse() {
        java.util.Date date = new java.util.Date();
        java.util.Date date1 = new java.util.Date(-1L);
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    @Test
    public void testIsSameDay2() {
        Time time = new Time(0L);
        Date date = new Date(0L);
        
        boolean actual = DateUtils.isSameDay(time, date);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isSameDay
    
    public void testIsSameDay_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameLocalTime
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSameLocalTime(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_ThrowIllegalArgumentException() {
        DateUtils.isSameLocalTime(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): False}
 * @utbot.executesCondition {@code (cal2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.isSameLocalTime(gregorianCalendar, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSameLocalTime(java.util.Calendar, java.util.Calendar)
    
    @Test
    public void testIsSameLocalTime1() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameLocalTime] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.DateUtils.isSameLocalTime(DateUtils.java:227) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class gregorianCalendarType = Class.forName("java.util.Calendar");
        Method isSameLocalTimeMethod = dateUtilsClazz.getDeclaredMethod("isSameLocalTime", gregorianCalendarType, gregorianCalendarType);
        isSameLocalTimeMethod.setAccessible(true);
        java.lang.Object[] isSameLocalTimeMethodArguments = new java.lang.Object[2];
        isSameLocalTimeMethodArguments[0] = gregorianCalendar;
        isSameLocalTimeMethodArguments[1] = japaneseImperialCalendar;
        try {
            isSameLocalTimeMethod.invoke(null, isSameLocalTimeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsSameLocalTime2() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(japaneseImperialCalendar, "java.util.Calendar", "isTimeSet", true);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameLocalTime] produces [java.lang.NullPointerException]
            java.base/java.util.JapaneseImperialCalendar.computeFields(JapaneseImperialCalendar.java:1587)
            java.base/java.util.JapaneseImperialCalendar.computeFields(JapaneseImperialCalendar.java:1557)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.DateUtils.isSameLocalTime(DateUtils.java:227) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Method isSameLocalTimeMethod = dateUtilsClazz.getDeclaredMethod("isSameLocalTime", japaneseImperialCalendarType, japaneseImperialCalendarType);
        isSameLocalTimeMethod.setAccessible(true);
        java.lang.Object[] isSameLocalTimeMethodArguments = new java.lang.Object[2];
        isSameLocalTimeMethodArguments[0] = japaneseImperialCalendar;
        isSameLocalTimeMethodArguments[1] = gregorianCalendar;
        try {
            isSameLocalTimeMethod.invoke(null, isSameLocalTimeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for isSameLocalTime
    
    public void testIsSameLocalTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 123 occurrences of:
        // Concrete execution failed
        
        // 7 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.addWeeks
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addWeeks(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#addWeeks(java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add(date, Calendar.WEEK_OF_YEAR, amount);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddWeeks_ThrowIllegalArgumentException() {
        DateUtils.addWeeks(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addWeeks(java.util.Date, int)
    
    @Test
    public void testAddWeeks1() {
        Time time = new Time(0L);
        
        java.util.Date actual = DateUtils.addWeeks(time, 0);
        
        java.util.Date expected = new java.util.Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for addWeeks
    
    public void testAddWeeks_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields672534521126700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields672534521126700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass672534521132000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields672534521126700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass672534521132000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields672534521505100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields672534521505100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass672534521506700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields672534521505100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass672534521506700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

