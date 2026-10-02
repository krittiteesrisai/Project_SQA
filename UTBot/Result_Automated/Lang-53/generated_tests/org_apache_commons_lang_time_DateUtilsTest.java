package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.apache.commons.lang.time.DateUtils.DateIterator;
import java.lang.reflect.Method;
import sun.util.BuddhistCalendar;
import java.sql.Time;
import java.sql.Timestamp;
import sun.util.calendar.LocalGregorianCalendar;
import java.text.ParseException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_time_DateUtilsTest {
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
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.add] produces [java.lang.IllegalArgumentException]
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:920)
            java.base/sun.util.BuddhistCalendar.add(BuddhistCalendar.java:161)
            org.apache.commons.lang.time.DateUtils.add(DateUtils.java:403) */
        DateUtils.add(date, 16385, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.util.Date, int, int)
    
    @Test
    public void testAdd1() {
        java.sql.Date date = new java.sql.Date(0L);
        
        Date actual = DateUtils.add(date, 0, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
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
    public void testIterator_ThrowIllegalArgumentException() {
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
    public void testIterator_ThrowNullPointerException() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:573)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:832)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:902) */
        DateUtils.iterator(japaneseImperialCalendar, 2);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.lang.Object, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterator1() {
        Date date = new Date();
        
        DateUtils.iterator(((Object) date), 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterator(java.lang.Object, int)
    
    @Test
    public void testIterator2() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:573)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:816)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:902) */
        DateUtils.iterator(japaneseImperialCalendar, 5);
    }
    ///endregion
    
    ///region Errors report for iterator
    
    public void testIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
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
    public void testIterator_ThrowNullPointerException1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:573)
            org.apache.commons.lang.time.DateUtils.iterator(DateUtils.java:832) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Date,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_ThrowIllegalArgumentException2() {
        DateUtils.iterator(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#iterator(java.util.Date,int)}
     */
    @Test
    public void testIterator() throws Exception  {
        Date date = new Date();
        
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
    public void testIterator3() {
        Time time = new Time(0L);
        
        DateUtils.iterator(((Date) time), 0);
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
    public void testRound_ThrowIllegalArgumentException() {
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
    public void testRound_ThrowNullPointerException() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:478)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:520) */
        DateUtils.round(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.lang.Object, int)
    
    @Test
    public void testRound1() {
        Date date = new Date();
        
        Date actual = DateUtils.round(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound2() {
        java.sql.Date date = new java.sql.Date(0L);
        
        Date actual = DateUtils.round(((Object) date), 0);
        
        Date expected = new Date();
        
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
    public void testRound_ThrowIllegalArgumentException1() {
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
    public void testRound_ThrowNullPointerException1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.round(DateUtils.java:478) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method round(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRound_ThrowIllegalArgumentException2() {
        DateUtils.round(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#round(java.util.Date,int)}
     */
    @Test
    public void testRound() {
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 1);
        
        Date expected = new Date();
        
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
        Date date = new Date();
        
        DateUtils.round(date, -2147483647);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.util.Date, int)
    
    @Test
    public void testRound3() {
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound4() {
        Time time = new Time(0L);
        
        Date actual = DateUtils.round(((Date) time), 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addMonths(time, 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addDays(time, 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addHours(time, 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addMinutes(time, 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addSeconds(time, 0);
        
        Date expected = new Date();
        
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
    public void testTruncate_ThrowIllegalArgumentException() {
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
    public void testTruncate_ThrowNullPointerException() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:573)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:605) */
        DateUtils.truncate(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncate(java.lang.Object, int)
    
    @Test
    public void testTruncate1() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate2() {
        java.sql.Date date = new java.sql.Date(0L);
        
        Date actual = DateUtils.truncate(((Object) date), 0);
        
        Date expected = new Date();
        
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
    public void testTruncate_ThrowIllegalArgumentException1() {
        DateUtils.truncate(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Date,int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncateThrowsIAEWithCornerCase() {
        Date date = new Date();
        
        DateUtils.truncate(date, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncate(java.util.Date, int)
    
    @Test
    public void testTruncate3() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate4() {
        Time time = new Time(0L);
        
        Date actual = DateUtils.truncate(((Date) time), 0);
        
        Date expected = new Date();
        
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
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method truncate(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_ThrowIllegalArgumentException2() {
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
    public void testTruncate_ThrowNullPointerException1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang.time.DateUtils.truncate(DateUtils.java:573) */
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
    ///endregion
    
    ///region Errors report for isSameLocalTime
    
    public void testIsSameLocalTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 56 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
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
        
        Date actual = DateUtils.addWeeks(time, 0);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addYears(time, 0);
        
        Date expected = new Date();
        
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
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.isSameInstant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime() throws Exception  {
        java.sql.Date date = new java.sql.Date(0L);
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(date, time);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime() throws Exception  {
        java.sql.Date date = new java.sql.Date(1L);
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.JulianCalendar$Date");
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
        Time time = new Time(8L);
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(1);
        setField(timestamp, "java.util.Date", "fastTime", 8L);
        
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
        setField(timestamp, "java.util.Date", "fastTime", 9L);
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.JulianCalendar$Date");
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
        DateUtils.isSameInstant(((Date) null), ((Date) null));
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
        
        DateUtils.isSameInstant(time, ((Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
     */
    @Test
    public void testIsSameInstantReturnsFalse() {
        Date date = new Date();
        Date date1 = new Date(-1L);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): False}
 * @utbot.executesCondition {@code (cal2 == null): False}
 * @utbot.invokes {@link java.util.Calendar#getTime()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cal1.getTime().getTime() == cal2.getTime().getTime();
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:208) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    @Test
    public void testIsSameInstant2() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[1] = 4730;
        stamp[2] = 4730;
        stamp[3] = 3;
        stamp[4] = -2147483646;
        stamp[5] = 1073741824;
        stamp[6] = -1073741823;
        stamp[7] = 1;
        stamp[9] = 4730;
        stamp[10] = 4730;
        stamp[11] = 4730;
        stamp[12] = 4730;
        stamp[13] = 4730;
        stamp[14] = 4730;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:208) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class gregorianCalendarType = Class.forName("java.util.Calendar");
        Method isSameInstantMethod = dateUtilsClazz.getDeclaredMethod("isSameInstant", gregorianCalendarType, gregorianCalendarType);
        isSameInstantMethod.setAccessible(true);
        java.lang.Object[] isSameInstantMethodArguments = new java.lang.Object[2];
        isSameInstantMethodArguments[0] = gregorianCalendar;
        isSameInstantMethodArguments[1] = japaneseImperialCalendar;
        try {
            isSameInstantMethod.invoke(null, isSameInstantMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsSameInstant3() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", 0L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        GregorianCalendar gregorianCalendar1 = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            1, 0, 0, 0, 3, 0, 0, 2,
            0
        };
        setField(gregorianCalendar1, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar1.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang.time.DateUtils.isSameInstant(DateUtils.java:208) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    ///endregion
    
    ///region Errors report for isSameInstant
    
    public void testIsSameInstant_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 164 occurrences of:
        // Concrete execution failed
        
        // 9 occurrences of:
        // Default concrete execution failed
        
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
    public void testIsSameDay_ThrowIllegalArgumentException() {
        Time time = new Time(0L);
        
        DateUtils.isSameDay(time, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_ThrowIllegalArgumentException_1() {
        DateUtils.isSameDay(((Date) null), ((Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
     */
    @Test
    public void testIsSameDayReturnsFalse() {
        Date date = new Date();
        Date date1 = new Date(-1L);
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    @Test
    public void testIsSameDay1() {
        Time time = new Time(0L);
        java.sql.Date date = new java.sql.Date(0L);
        
        boolean actual = DateUtils.isSameDay(time, date);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isSameDay
    
    public void testIsSameDay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
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
    public void testIsSameDay_ThrowIllegalArgumentException1() {
        DateUtils.isSameDay(((Calendar) null), ((Calendar) null));
    }
    ///endregion
    
    ///region Errors report for isSameDay
    
    public void testIsSameDay_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
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
            org.apache.commons.lang.time.DateUtils.parseDate(DateUtils.java:261) */
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
            org.apache.commons.lang.time.DateUtils.parseDate(DateUtils.java:263) */
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
        
        Date actual = DateUtils.parseDate(string, stringArray);
        
        Date expected = new Date();
        
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
        
        Date actual = DateUtils.addMilliseconds(time, 0);
        
        Date expected = new Date();
        
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
    
    ///region Test suites for executable org.apache.commons.lang.time.DateUtils.modify
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method modify(java.util.Calendar, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DateUtils#modify(java.util.Calendar,int,boolean)}
 * @utbot.executesCondition {@code (val.get(Calendar.YEAR) > 280000000): False}
 * @utbot.executesCondition {@code (field == Calendar.MILLISECOND): True}
 * @utbot.invokes {@link java.util.Calendar#get(int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testModify_FieldEqualsCalendarMILLISECOND() throws Exception  {
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(buddhistCalendar, "sun.util.BuddhistCalendar", "yearOffset", 280000510);
        int[] fields = {4730, -510};
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
        modifyMethodArguments[1] = 14;
        modifyMethodArguments[2] = false;
        modifyMethod.invoke(null, modifyMethodArguments);
    }
    ///endregion
    
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
            org.apache.commons.lang.time.DateUtils.modify(DateUtils.java:621) */
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
        int[] fields = {4730, -3};
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
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields670763517573000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields670763517573000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass670763517619700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670763517573000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670763517619700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields670763518703200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670763518703200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670763518707100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670763518703200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670763518707100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

