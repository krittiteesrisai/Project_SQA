package org.apache.commons.lang3.time;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.apache.commons.lang3.time.DateUtils.DateIterator;
import java.text.ParseException;
import sun.util.BuddhistCalendar;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_lang3_time_DateUtilsTest {
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.util.Date, int, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: date == null
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.add] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = -255;
        addMethodArguments[2] = -255;
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add(java.util.Date, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)}
     */
    @Test
    public void testAddThrowsIAE() throws Throwable  {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.add] produces [java.lang.IllegalArgumentException]
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:920)
            java.base/sun.util.BuddhistCalendar.add(BuddhistCalendar.java:161)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:518) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 16385;
        addMethodArguments[2] = -1;
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.util.Date, int, int)
    
    @Test
    public void testAdd1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 0;
        addMethodArguments[2] = 0;
        Date actual = ((Date) addMethod.invoke(null, addMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 0;
        addMethodArguments[2] = 0;
        Date actual = ((Date) addMethod.invoke(null, addMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 0;
        addMethodArguments[2] = 0;
        Date actual = ((Date) addMethod.invoke(null, addMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 0;
        addMethodArguments[2] = 0;
        Date actual = ((Date) addMethod.invoke(null, addMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method addMethod = dateUtilsClazz.getDeclaredMethod("add", dateType, intType, intType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = date;
        addMethodArguments[1] = 0;
        addMethodArguments[2] = 0;
        Date actual = ((Date) addMethod.invoke(null, addMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 1));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_1() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 2));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_2() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 3));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_MONTH_MONDAY}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_MONTH_MONDAY() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 6));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_WEEK_CENTER_3() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 4));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_MONTH_MONDAY}
 *  */
    @Test
    public void testIterator_SwitchRangeStyleCaseRANGE_MONTH_MONDAY_1() throws Exception  {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        DateUtils.DateIterator actual = ((DateUtils.DateIterator) DateUtils.iterator(((Calendar) gregorianCalendar), 5));
        
        DateUtils.DateIterator expected = ((DateUtils.DateIterator) createInstance("org.apache.commons.lang3.time.DateUtils$DateIterator"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test
    public void testIterator_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1160) */
        DateUtils.iterator(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.activatesSwitch {@code switch(rangeStyle) case: RANGE_WEEK_CENTER}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: start = truncate(focus, Calendar.DATE);
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1186) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    
    ///region FUZZER: ERROR SUITE for method iterator(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
     */
    @Test
    public void testIteratorThrowsIAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1160) */
        DateUtils.iterator(((Calendar) null), Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for iterator
    
    public void testIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.executesCondition {@code (focus instanceof Date): False}
 * @utbot.executesCondition {@code (focus instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: focus instanceof Calendar
 *  */
    @Test
    public void testIterator_ThrowClassCastException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.ClassCastException: Could not iterate based on [B@229e43cf]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1257) */
        DateUtils.iterator(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: focus == null
 *  */
    @Test
    public void testIterator_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1250) */
        DateUtils.iterator(((Object) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
 * @utbot.executesCondition {@code (focus == null): False}
 * @utbot.executesCondition {@code (focus instanceof Date): False}
 * @utbot.executesCondition {@code (focus instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iterator((Calendar) focus, rangeStyle);
 *  */
    @Test
    public void testIterator_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1186)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1255) */
        DateUtils.iterator(japaneseImperialCalendar, 2);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method iterator(java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
     */
    @Test
    public void testIteratorThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1250) */
        DateUtils.iterator(((Object) null), -2147483647);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterator(java.lang.Object, int)
    
    @Test
    public void testIterator1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1253) */
        DateUtils.iterator(((Object) date), 0);
    }
    
    @Test
    public void testIterator2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1253) */
        DateUtils.iterator(((Object) date), 0);
    }
    
    @Test
    public void testIterator3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1253) */
        DateUtils.iterator(((Object) date), 0);
    }
    
    @Test
    public void testIterator4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1253) */
        DateUtils.iterator(((Object) date), 0);
    }
    
    @Test
    public void testIterator5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1253) */
        DateUtils.iterator(((Object) date), 0);
    }
    
    @Test
    public void testIterator6() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1170)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1255) */
        DateUtils.iterator(japaneseImperialCalendar, 5);
    }
    
    @Test
    public void testIterator7() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1186)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1255) */
        DateUtils.iterator(japaneseImperialCalendar, 1);
    }
    ///endregion
    
    ///region Errors report for iterator
    
    public void testIterator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.iterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Date,int)}
 * @utbot.executesCondition {@code (focus == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: focus == null
 *  */
    @Test
    public void testIterator_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1128) */
        DateUtils.iterator(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method iterator(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Date,int)}
     */
    @Test
    public void testIteratorThrowsIAE1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style -2147483647 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, -2147483647);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterator(java.util.Date, int)
    
    @Test
    public void testIterator8() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, 0);
    }
    
    @Test
    public void testIterator9() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, 0);
    }
    
    @Test
    public void testIterator10() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, 0);
    }
    
    @Test
    public void testIterator11() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, 0);
    }
    
    @Test
    public void testIterator12() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.iterator] produces [java.lang.IllegalArgumentException: The range style 0 is not valid.]
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1209)
            org.apache.commons.lang3.time.DateUtils.iterator(DateUtils.java:1131) */
        DateUtils.iterator(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.set
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(java.util.Date, int, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: date == null
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.set] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = ((Object) null);
        setMethodArguments[1] = -255;
        setMethodArguments[2] = -255;
        try {
            setMethod.invoke(null, setMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method set(java.util.Date, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)}
     */
    @Test
    public void testSetThrowsAIOOBE() throws Throwable  {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.set] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16384 out of bounds for length 17]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/sun.util.BuddhistCalendar.set(BuddhistCalendar.java:144)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:647) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 16384;
        setMethodArguments[2] = -1;
        try {
            setMethod.invoke(null, setMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method set(java.util.Date, int, int)
    
    @Test
    public void testSet1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 0;
        setMethodArguments[2] = 0;
        Date actual = ((Date) setMethod.invoke(null, setMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSet2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 0;
        setMethodArguments[2] = 0;
        Date actual = ((Date) setMethod.invoke(null, setMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSet3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 0;
        setMethodArguments[2] = 0;
        Date actual = ((Date) setMethod.invoke(null, setMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSet4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 0;
        setMethodArguments[2] = 0;
        Date actual = ((Date) setMethod.invoke(null, setMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSet5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Date date = new Date();
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class dateType = Class.forName("java.util.Date");
        Class intType = int.class;
        Method setMethod = dateUtilsClazz.getDeclaredMethod("set", dateType, intType, intType);
        setMethod.setAccessible(true);
        java.lang.Object[] setMethodArguments = new java.lang.Object[3];
        setMethodArguments[0] = date;
        setMethodArguments[1] = 0;
        setMethodArguments[2] = 0;
        Date actual = ((Date) setMethod.invoke(null, setMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testRound_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:744) */
        DateUtils.round(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar rounded = (Calendar) date.clone();
 *  */
    @Test
    public void testRound_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:747) */
        DateUtils.round(((Calendar) gregorianCalendar), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar rounded = (Calendar) date.clone();
 *  */
    @Test
    public void testRound_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:746) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    
    ///region FUZZER: ERROR SUITE for method round(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
     */
    @Test
    public void testRoundThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:744) */
        DateUtils.round(((Calendar) null), -2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: date == null
 *  */
    @Test
    public void testRound_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:708) */
        DateUtils.round(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method round(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Date,int)}
     */
    @Test
    public void testRoundThrowsIAE1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The field -2147483647 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:711) */
        DateUtils.round(date, -2147483647);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.util.Date, int)
    
    @Test
    public void testRound1() {
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound2() {
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
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
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound5() {
        Date date = new Date();
        
        Date actual = DateUtils.round(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.round
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: date instanceof Calendar
 *  */
    @Test
    public void testRound_ThrowClassCastException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.ClassCastException: Could not round [B@60b5abaf]
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:792) */
        DateUtils.round(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testRound_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:785) */
        DateUtils.round(((Object) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Date,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return round((Date) date, field);
 *  */
    @Test
    public void testRound_ThrowIllegalArgumentException_11() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:711)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:788) */
        DateUtils.round(((Object) date), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return round((Calendar) date, field).getTime();
 *  */
    @Test
    public void testRound_ThrowNullPointerException2() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:746)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:790) */
        DateUtils.round(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method round(java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
     */
    @Test
    public void testRoundThrowsIAE2() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.round] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.round(DateUtils.java:785) */
        DateUtils.round(((Object) null), -2147483647);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(java.lang.Object, int)
    
    @Test
    public void testRound6() {
        Date date = new Date();
        
        Date actual = DateUtils.round(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound7() {
        Date date = new Date();
        
        Date actual = DateUtils.round(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRound8() {
        Date date = new Date();
        
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
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragment
    
    ///region Errors report for getFragment
    
    public void testGetFragment_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 155 occurrences of:
        // Concrete execution failed
        
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragment
    
    ///region Errors report for getFragment
    
    public void testGetFragment_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.ceiling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ceiling(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testCeiling_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:916) */
        DateUtils.ceiling(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar ceiled = (Calendar) date.clone();
 *  */
    @Test
    public void testCeiling_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:919) */
        DateUtils.ceiling(((Calendar) gregorianCalendar), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar ceiled = (Calendar) date.clone();
 *  */
    @Test
    public void testCeiling_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:918) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method ceilingMethod = dateUtilsClazz.getDeclaredMethod("ceiling", japaneseImperialCalendarType, intType);
        ceilingMethod.setAccessible(true);
        java.lang.Object[] ceilingMethodArguments = new java.lang.Object[2];
        ceilingMethodArguments[0] = japaneseImperialCalendar;
        ceilingMethodArguments[1] = -255;
        try {
            ceilingMethod.invoke(null, ceilingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method ceiling(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
     */
    @Test
    public void testCeilingThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:916) */
        DateUtils.ceiling(((Calendar) null), -2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.ceiling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ceiling(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: date instanceof Calendar
 *  */
    @Test
    public void testCeiling_ThrowClassCastException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.ClassCastException: Could not find ceiling of for type: class [B]
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:949) */
        DateUtils.ceiling(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testCeiling_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:942) */
        DateUtils.ceiling(((Object) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Date,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ceiling((Date) date, field);
 *  */
    @Test
    public void testCeiling_ThrowIllegalArgumentException_11() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:894)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:945) */
        DateUtils.ceiling(((Object) date), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ceiling((Calendar) date, field).getTime();
 *  */
    @Test
    public void testCeiling_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:918)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:947) */
        DateUtils.ceiling(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method ceiling(java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
     */
    @Test
    public void testCeilingThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:942) */
        DateUtils.ceiling(((Object) null), -2147483647);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ceiling(java.lang.Object, int)
    
    @Test
    public void testCeiling1() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling2() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling3() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for ceiling
    
    public void testCeiling_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.ceiling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ceiling(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: date == null
 *  */
    @Test
    public void testCeiling_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:891) */
        DateUtils.ceiling(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method ceiling(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Date,int)}
     */
    @Test
    public void testCeilingThrowsIAE2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.ceiling] produces [java.lang.IllegalArgumentException: The field -2147483646 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.ceiling(DateUtils.java:894) */
        DateUtils.ceiling(date, -2147483646);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ceiling(java.util.Date, int)
    
    @Test
    public void testCeiling4() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling5() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling6() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling7() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCeiling8() {
        Date date = new Date();
        
        Date actual = DateUtils.ceiling(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addMonths
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addMonths(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMonths(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.MONTH, amount);
 *  */
    @Test
    public void testAddMonths_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addMonths] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addMonths(DateUtils.java:416) */
        DateUtils.addMonths(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addMonths(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMonths(java.util.Date,int)}
     */
    @Test
    public void testAddMonths() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, -2147483646);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMonths(java.util.Date, int)
    
    @Test
    public void testAddMonths1() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMonths2() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMonths3() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMonths4() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMonths5() {
        Date date = new Date();
        
        Date actual = DateUtils.addMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addDays
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDays(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addDays(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.DAY_OF_MONTH, amount);
 *  */
    @Test
    public void testAddDays_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addDays] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addDays(DateUtils.java:444) */
        DateUtils.addDays(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addDays(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addDays(java.util.Date,int)}
     */
    @Test
    public void testAddDays() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, -2147483643);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addDays(java.util.Date, int)
    
    @Test
    public void testAddDays1() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDays2() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDays3() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDays4() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDays5() {
        Date date = new Date();
        
        Date actual = DateUtils.addDays(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setHours
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setHours(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setHours(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.HOUR_OF_DAY, amount);
 *  */
    @Test
    public void testSetHours_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setHours] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setHours(DateUtils.java:580) */
        DateUtils.setHours(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setHours(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setHours(java.util.Date,int)}
     */
    @Test
    public void testSetHoursThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setHours] produces [java.lang.IllegalArgumentException: HOUR_OF_DAY]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setHours(DateUtils.java:580) */
        DateUtils.setHours(date, -2147483637);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setHours(java.util.Date, int)
    
    @Test
    public void testSetHours1() {
        Date date = new Date();
        
        Date actual = DateUtils.setHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetHours2() {
        Date date = new Date();
        
        Date actual = DateUtils.setHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetHours3() {
        Date date = new Date();
        
        Date actual = DateUtils.setHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetHours4() {
        Date date = new Date();
        
        Date actual = DateUtils.setHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetHours5() {
        Date date = new Date();
        
        Date actual = DateUtils.setHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setMinutes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMinutes(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMinutes(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.MINUTE, amount);
 *  */
    @Test
    public void testSetMinutes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMinutes] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setMinutes(DateUtils.java:595) */
        DateUtils.setMinutes(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setMinutes(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMinutes(java.util.Date,int)}
     */
    @Test
    public void testSetMinutesThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMinutes] produces [java.lang.IllegalArgumentException: MINUTE]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setMinutes(DateUtils.java:595) */
        DateUtils.setMinutes(date, -2147483636);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setMinutes(java.util.Date, int)
    
    @Test
    public void testSetMinutes1() {
        Date date = new Date();
        
        Date actual = DateUtils.setMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMinutes2() {
        Date date = new Date();
        
        Date actual = DateUtils.setMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMinutes3() {
        Date date = new Date();
        
        Date actual = DateUtils.setMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMinutes4() {
        Date date = new Date();
        
        Date actual = DateUtils.setMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMinutes5() {
        Date date = new Date();
        
        Date actual = DateUtils.setMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setSeconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setSeconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.SECOND, amount);
 *  */
    @Test
    public void testSetSeconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setSeconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setSeconds(DateUtils.java:610) */
        DateUtils.setSeconds(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setSeconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setSeconds(java.util.Date,int)}
     */
    @Test
    public void testSetSecondsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setSeconds] produces [java.lang.IllegalArgumentException: SECOND]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setSeconds(DateUtils.java:610) */
        DateUtils.setSeconds(date, -2147483635);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setSeconds(java.util.Date, int)
    
    @Test
    public void testSetSeconds1() {
        Date date = new Date();
        
        Date actual = DateUtils.setSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetSeconds2() {
        Date date = new Date();
        
        Date actual = DateUtils.setSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetSeconds3() {
        Date date = new Date();
        
        Date actual = DateUtils.setSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetSeconds4() {
        Date date = new Date();
        
        Date actual = DateUtils.setSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetSeconds5() {
        Date date = new Date();
        
        Date actual = DateUtils.setSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addHours
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addHours(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addHours(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.HOUR_OF_DAY, amount);
 *  */
    @Test
    public void testAddHours_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addHours] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addHours(DateUtils.java:458) */
        DateUtils.addHours(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addHours(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addHours(java.util.Date,int)}
     */
    @Test
    public void testAddHours() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, -2147483637);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addHours(java.util.Date, int)
    
    @Test
    public void testAddHours1() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddHours2() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddHours3() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddHours4() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddHours5() {
        Date date = new Date();
        
        Date actual = DateUtils.addHours(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addMinutes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addMinutes(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMinutes(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.MINUTE, amount);
 *  */
    @Test
    public void testAddMinutes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addMinutes] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addMinutes(DateUtils.java:472) */
        DateUtils.addMinutes(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addMinutes(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMinutes(java.util.Date,int)}
     */
    @Test
    public void testAddMinutes() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, -2147483636);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMinutes(java.util.Date, int)
    
    @Test
    public void testAddMinutes1() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMinutes2() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMinutes3() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMinutes4() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMinutes5() {
        Date date = new Date();
        
        Date actual = DateUtils.addMinutes(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addSeconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addSeconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addSeconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.SECOND, amount);
 *  */
    @Test
    public void testAddSeconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addSeconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addSeconds(DateUtils.java:486) */
        DateUtils.addSeconds(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addSeconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addSeconds(java.util.Date,int)}
     */
    @Test
    public void testAddSeconds() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, -2147483635);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addSeconds(java.util.Date, int)
    
    @Test
    public void testAddSeconds1() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSeconds2() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSeconds3() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSeconds4() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSeconds5() {
        Date date = new Date();
        
        Date actual = DateUtils.addSeconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setMonths
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMonths(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMonths(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.MONTH, amount);
 *  */
    @Test
    public void testSetMonths_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMonths] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setMonths(DateUtils.java:549) */
        DateUtils.setMonths(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setMonths(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMonths(java.util.Date,int)}
     */
    @Test
    public void testSetMonthsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMonths] produces [java.lang.IllegalArgumentException: MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setMonths(DateUtils.java:549) */
        DateUtils.setMonths(date, -2147483646);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setMonths(java.util.Date, int)
    
    @Test
    public void testSetMonths1() {
        Date date = new Date();
        
        Date actual = DateUtils.setMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMonths2() {
        Date date = new Date();
        
        Date actual = DateUtils.setMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMonths3() {
        Date date = new Date();
        
        Date actual = DateUtils.setMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMonths4() {
        Date date = new Date();
        
        Date actual = DateUtils.setMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMonths5() {
        Date date = new Date();
        
        Date actual = DateUtils.setMonths(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncate(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testTruncate_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837) */
        DateUtils.truncate(((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar truncated = (Calendar) date.clone();
 *  */
    @Test
    public void testTruncate_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:840) */
        DateUtils.truncate(((Calendar) gregorianCalendar), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar truncated = (Calendar) date.clone();
 *  */
    @Test
    public void testTruncate_ThrowNullPointerException() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    
    ///region FUZZER: ERROR SUITE for method truncate(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
     */
    @Test
    public void testTruncateThrowsIAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837) */
        DateUtils.truncate(((Calendar) null), Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncate(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: date instanceof Calendar
 *  */
    @Test
    public void testTruncate_ThrowClassCastException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.ClassCastException: Could not truncate [B@db16a]
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:869) */
        DateUtils.truncate(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date == null
 *  */
    @Test
    public void testTruncate_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:862) */
        DateUtils.truncate(((Object) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Date,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return truncate((Date) date, field);
 *  */
    @Test
    public void testTruncate_ThrowIllegalArgumentException_11() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:816)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:865) */
        DateUtils.truncate(((Object) date), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
 * @utbot.executesCondition {@code (date == null): False}
 * @utbot.executesCondition {@code (date instanceof Date): False}
 * @utbot.executesCondition {@code (date instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return truncate((Calendar) date, field).getTime();
 *  */
    @Test
    public void testTruncate_ThrowNullPointerException1() throws Exception  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:867) */
        DateUtils.truncate(japaneseImperialCalendar, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncate(java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
     */
    @Test
    public void testTruncateThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:862) */
        DateUtils.truncate(((Object) null), -2147483647);
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
        Date date = new Date();
        
        Date actual = DateUtils.truncate(((Object) date), 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate3() {
        Date date = new Date();
        
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
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncate(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Date,int)}
 * @utbot.executesCondition {@code (date == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: date == null
 *  */
    @Test
    public void testTruncate_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813) */
        DateUtils.truncate(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncate(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Date,int)}
     */
    @Test
    public void testTruncateThrowsIAEWithCornerCase1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncate] produces [java.lang.IllegalArgumentException: The field -2147483648 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:816) */
        DateUtils.truncate(date, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncate(java.util.Date, int)
    
    @Test
    public void testTruncate4() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate5() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate6() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate7() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruncate8() {
        Date date = new Date();
        
        Date actual = DateUtils.truncate(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFragmentInMinutes(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Calendar,int,int)
 * @utbot.returnsFrom {@code return getFragment(calendar, fragment, Calendar.MINUTE);}
 *  */
    @Test
    public void testGetFragmentInMinutes_DateUtilsGetFragment() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 14);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInMinutes(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 10 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 10);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 3 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 7 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 7);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 4 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 4);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 9 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 9);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment -241 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, -241);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 8 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 8);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowIllegalArgumentException_7() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(((Calendar) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInMinutes(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
     */
    @Test
    public void testGetFragmentInMinutesThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(((Calendar) null), -2147483636);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFragmentInMinutes(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInMinutes1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 1);
        
        assertEquals(386110L, actual);
    }
    
    @Test
    public void testGetFragmentInMinutes2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 13);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetFragmentInMinutes3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 5);
        
        assertEquals(190L, actual);
    }
    
    @Test
    public void testGetFragmentInMinutes4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 6);
        
        assertEquals(190L, actual);
    }
    
    @Test
    public void testGetFragmentInMinutes5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMinutes(gregorianCalendar, 2);
        
        assertEquals(36190L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInMinutes(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInMinutes6() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[4] = 33554449;
        stamp[7] = 33554432;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes7() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[4] = 16;
        stamp[7] = 33554432;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes8() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes9() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes10() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[4] = 16;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes11() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.NullPointerException] */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInMinutes12() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInMinutes13() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMinutes14() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1558) */
        DateUtils.getFragmentInMinutes(gregorianCalendar, 11);
    }
    ///endregion
    
    ///region Errors report for getFragmentInMinutes
    
    public void testGetFragmentInMinutes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 178 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInMinutes(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getFragment(date, fragment, Calendar.MINUTE);
 *  */
    @Test
    public void testGetFragmentInMinutes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1651)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInMinutes(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Date,int)}
     */
    @Test
    public void testGetFragmentInMinutesThrowsIAE1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment -2147483636 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, -2147483636);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInMinutes(java.util.Date, int)
    
    @Test
    public void testGetFragmentInMinutes15() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, 0);
    }
    
    @Test
    public void testGetFragmentInMinutes16() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, 0);
    }
    
    @Test
    public void testGetFragmentInMinutes17() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, 0);
    }
    
    @Test
    public void testGetFragmentInMinutes18() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, 0);
    }
    
    @Test
    public void testGetFragmentInMinutes19() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(DateUtils.java:1369) */
        DateUtils.getFragmentInMinutes(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInSeconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getFragment(date, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1651)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInSeconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Date,int)}
     */
    @Test
    public void testGetFragmentInSecondsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment -2147483635 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, -2147483635);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInSeconds(java.util.Date, int)
    
    @Test
    public void testGetFragmentInSeconds1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInSeconds2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInSeconds3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInSeconds4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInSeconds5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1331) */
        DateUtils.getFragmentInSeconds(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFragmentInSeconds(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Calendar,int,int)
 * @utbot.returnsFrom {@code return getFragment(calendar, fragment, Calendar.SECOND);}
 *  */
    @Test
    public void testGetFragmentInSeconds_DateUtilsGetFragment() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInSeconds(gregorianCalendar, 14);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInSeconds(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 10 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 10);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 3 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 7 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 7);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 4 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 4);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 9 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 9);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment -241 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, -241);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The fragment 8 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 8);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.SECOND);
 *  */
    @Test
    public void testGetFragmentInSeconds_ThrowIllegalArgumentException_7() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(((Calendar) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInSeconds(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
     */
    @Test
    public void testGetFragmentInSecondsThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(((Calendar) null), -2147483635);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInSeconds(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInSeconds6() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInSeconds7() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInSeconds8() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[4] = 16;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInSeconds9() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInSeconds10() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInSeconds11() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInSeconds12() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(DateUtils.java:1520) */
        DateUtils.getFragmentInSeconds(gregorianCalendar, 12);
    }
    ///endregion
    
    ///region Errors report for getFragmentInSeconds
    
    public void testGetFragmentInSeconds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 142 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency
    
    ///region Errors report for parseDateWithLeniency
    
    public void testParseDateWithLeniency_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInMilliseconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getFragment(date, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1651)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInMilliseconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Date,int)}
     */
    @Test
    public void testGetFragmentInMillisecondsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment -2147483634 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, -2147483634);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInMilliseconds(java.util.Date, int)
    
    @Test
    public void testGetFragmentInMilliseconds1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInMilliseconds2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInMilliseconds3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInMilliseconds4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, 0);
    }
    
    @Test
    public void testGetFragmentInMilliseconds5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1293) */
        DateUtils.getFragmentInMilliseconds(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFragmentInMilliseconds(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Calendar,int,int)
 * @utbot.returnsFrom {@code return getFragment(calendar, fragment, Calendar.MILLISECOND);}
 *  */
    @Test
    public void testGetFragmentInMilliseconds_DateUtilsGetFragment() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 14);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInMilliseconds(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 10 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 10);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 3 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 7 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 7);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 4 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 4);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 9 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 9);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment -241 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, -241);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The fragment 8 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 8);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.MILLISECOND);
 *  */
    @Test
    public void testGetFragmentInMilliseconds_ThrowIllegalArgumentException_7() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(((Calendar) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInMilliseconds(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
     */
    @Test
    public void testGetFragmentInMillisecondsThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(((Calendar) null), -2147483634);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFragmentInMilliseconds(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInMilliseconds6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 12);
        
        assertEquals(35706L, actual);
    }
    
    @Test
    public void testGetFragmentInMilliseconds7() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 13);
        
        assertEquals(102L, actual);
    }
    
    @Test
    public void testGetFragmentInMilliseconds8() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 5);
        
        assertEquals(11436104L, actual);
    }
    
    @Test
    public void testGetFragmentInMilliseconds9() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 6);
        
        assertEquals(11436106L, actual);
    }
    
    @Test
    public void testGetFragmentInMilliseconds10() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 2);
        
        assertEquals(2171436107L, actual);
    }
    
    @Test
    public void testGetFragmentInMilliseconds11() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInMilliseconds(gregorianCalendar, 1);
        
        assertEquals(23166636109L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInMilliseconds(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInMilliseconds12() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMilliseconds13() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMilliseconds14() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMilliseconds15() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInMilliseconds16() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(DateUtils.java:1483) */
        DateUtils.getFragmentInMilliseconds(gregorianCalendar, 11);
    }
    ///endregion
    
    ///region Errors report for getFragmentInMilliseconds
    
    public void testGetFragmentInMilliseconds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 166 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.isSameLocalTime
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameLocalTime(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test
    public void testIsSameLocalTime_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameLocalTime] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameLocalTime(DateUtils.java:251) */
        DateUtils.isSameLocalTime(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSameLocalTime(java.util.Calendar, java.util.Calendar)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
     */
    @Test
    public void testIsSameLocalTimeThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameLocalTime] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameLocalTime(DateUtils.java:251) */
        DateUtils.isSameLocalTime(null, null);
    }
    ///endregion
    
    ///region Errors report for isSameLocalTime
    
    public void testIsSameLocalTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addWeeks
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addWeeks(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addWeeks(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.WEEK_OF_YEAR, amount);
 *  */
    @Test
    public void testAddWeeks_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addWeeks] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addWeeks(DateUtils.java:430) */
        DateUtils.addWeeks(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addWeeks(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addWeeks(java.util.Date,int)}
     */
    @Test
    public void testAddWeeks() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, -2147483645);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addWeeks(java.util.Date, int)
    
    @Test
    public void testAddWeeks1() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddWeeks2() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddWeeks3() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddWeeks4() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddWeeks5() {
        Date date = new Date();
        
        Date actual = DateUtils.addWeeks(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.parseDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseDateWithLeniency(str, parsePatterns, true);
 *  */
    @Test
    public void testParseDate_ThrowIllegalArgumentException() throws ParseException  {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDate] produces [java.lang.IllegalArgumentException: Date and Patterns must not be null]
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:367)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:302)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:279) */
        DateUtils.parseDate(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseDateWithLeniency(str, parsePatterns, true);
 *  */
    @Test
    public void testParseDate_ThrowIllegalArgumentException_1() throws ParseException  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDate] produces [java.lang.IllegalArgumentException: Date and Patterns must not be null]
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:367)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:302)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:279) */
        DateUtils.parseDate(string, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDate(java.lang.String,java.lang.String[])}
     */
    @Test
    public void testParseDateThrowsIAEWithBlankStringAndNonEmptyObjectArray() throws ParseException  {
        java.lang.String[] stringArray = {"#$\\\"'", "\n\t\r", "-3"};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDate] produces [java.lang.IllegalArgumentException: Unterminated quote]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.literal(FastDateParser.java:245)
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:213)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:302)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:279) */
        DateUtils.parseDate("\n\t\r", stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testParseDate1() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:205)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:302)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:279) */
        DateUtils.parseDate(string, stringArray);
    }
    
    @Test
    public void testParseDate2() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:205)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:302)
            org.apache.commons.lang3.time.DateUtils.parseDate(DateUtils.java:279) */
        DateUtils.parseDate(string, stringArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parseDate(java.lang.String, [Ljava.lang.String;)
    
    @Test(expected = ParseException.class)
    public void testParseDate3() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {};
        
        DateUtils.parseDate(string, stringArray);
    }
    
    @Test(expected = ParseException.class)
    public void testParseDate4() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {};
        
        DateUtils.parseDate(string, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addYears
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addYears(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addYears(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.YEAR, amount);
 *  */
    @Test
    public void testAddYears_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addYears] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addYears(DateUtils.java:402) */
        DateUtils.addYears(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addYears(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addYears(java.util.Date,int)}
     */
    @Test
    public void testAddYears() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, -2147483647);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addYears(java.util.Date, int)
    
    @Test
    public void testAddYears1() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddYears2() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddYears3() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddYears4() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddYears5() {
        Date date = new Date();
        
        Date actual = DateUtils.addYears(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.isSameInstant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime() {
        Date date = new Date(-255L);
        Date date1 = new Date(-256L);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime() {
        Date date = new Date(-255L);
        
        boolean actual = DateUtils.isSameInstant(date, date);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSameInstant(java.util.Date, java.util.Date)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link sun.util.calendar.BaseCalendar.Date#isNormalized()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeEqualsDate2GetTime_1() throws Exception  {
        Date date = new Date(-255L);
        Date date1 = ((Date) createInstance("java.util.Date"));
        setField(date1, "java.util.Date", "fastTime", -255L);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime_1() throws Exception  {
        Date date = new Date(1L);
        Date date1 = ((Date) createInstance("java.util.Date"));
        setField(date1, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date2 = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(date1, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.returnsFrom {@code return date1.getTime() == date2.getTime();}
 *  */
    @Test
    public void testIsSameInstant_Date1GetTimeNotEqualsDate2GetTime_2() throws Exception  {
        Date date = new Date(1L);
        Date date1 = ((Date) createInstance("java.util.Date"));
        setField(date1, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date2 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date3 = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date3, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date2, "sun.util.calendar.ImmutableGregorianDate", "date", date3);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(date1, "java.util.Date", "cdate", cdate);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test
    public void testIsSameInstant_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:213) */
        DateUtils.isSameInstant(((Date) null), ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): False}
 * @utbot.executesCondition {@code (date2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test
    public void testIsSameInstant_ThrowIllegalArgumentException_1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:213) */
        DateUtils.isSameInstant(date, ((Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameInstant(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
     */
    @Test
    public void testIsSameInstantReturnsFalse() {
        Date date = new Date();
        Date date1 = new Date(-1L);
        
        boolean actual = DateUtils.isSameInstant(date, date1);
        
        assertFalse(actual);
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
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.isSameInstant
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test
    public void testIsSameInstant_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:231) */
        DateUtils.isSameInstant(((Calendar) null), ((Calendar) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): False}
 * @utbot.executesCondition {@code (cal2 == null): False}
 * @utbot.invokes {@link java.util.Calendar#getTime()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsSameInstant_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {0, 3, 3, 3, 4, 3, 3, 4};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8]
            java.base/java.util.Calendar.selectFields(Calendar.java:2466)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
     */
    @Test
    public void testIsSameInstantThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:231) */
        DateUtils.isSameInstant(((Calendar) null), ((Calendar) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSameInstant(java.util.Calendar, java.util.Calendar)
    
    @Test
    public void testIsSameInstant1() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[4] = Integer.MIN_VALUE;
        stamp[5] = Integer.MIN_VALUE;
        stamp[6] = -2147483645;
        stamp[7] = -2147483647;
        stamp[8] = -2147483646;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant2() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[0] = 1;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[5] = 3;
        stamp[6] = 3;
        stamp[7] = 3;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant3() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[3] = -2147483642;
        stamp[4] = -2147483642;
        stamp[5] = Integer.MIN_VALUE;
        stamp[6] = 2;
        stamp[7] = -1073741821;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant4() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            1, 3, 3, 3, 1, 3, 3, 0,
            3
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant5() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[0] = 1;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 3;
        stamp[5] = 3;
        stamp[6] = 3;
        stamp[7] = 3;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant6() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 3;
        stamp[5] = 3;
        stamp[6] = 3;
        stamp[8] = 1;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant7() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[3] = 3;
        stamp[4] = -2147483646;
        stamp[5] = 1073741824;
        stamp[6] = -1073741823;
        stamp[7] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant8() throws Throwable  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[0] = 1;
        stamp[6] = 1;
        stamp[7] = -1073741823;
        stamp[8] = -2147483646;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
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
    public void testIsSameInstant9() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[0] = 1;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 1;
        stamp[5] = 3;
        stamp[6] = 3;
        stamp[9] = 3;
        stamp[10] = 3;
        stamp[11] = 3;
        stamp[12] = 3;
        stamp[13] = 3;
        stamp[14] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    
    @Test
    public void testIsSameInstant10() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[4] = -1879048191;
        stamp[5] = 268435456;
        stamp[6] = 268435459;
        stamp[7] = 268435456;
        stamp[8] = 268435458;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameInstant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.isSameInstant(DateUtils.java:233) */
        DateUtils.isSameInstant(gregorianCalendar, gregorianCalendar1);
    }
    ///endregion
    
    ///region Errors report for isSameInstant
    
    public void testIsSameInstant_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 110 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.parseDateStrictly
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDateStrictly(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDateStrictly(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseDateWithLeniency(str, parsePatterns, false);
 *  */
    @Test
    public void testParseDateStrictly_ThrowIllegalArgumentException() throws ParseException  {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDateStrictly] produces [java.lang.IllegalArgumentException: Date and Patterns must not be null]
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:367)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:344)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:322) */
        DateUtils.parseDateStrictly(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDateStrictly(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseDateWithLeniency(str, parsePatterns, false);
 *  */
    @Test
    public void testParseDateStrictly_ThrowIllegalArgumentException_1() throws ParseException  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDateStrictly] produces [java.lang.IllegalArgumentException: Date and Patterns must not be null]
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:367)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:344)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:322) */
        DateUtils.parseDateStrictly(string, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseDateStrictly(java.lang.String, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#parseDateStrictly(java.lang.String,java.lang.String[])}
     */
    @Test
    public void testParseDateStrictlyThrowsIAEWithBlankStringAndNonEmptyObjectArray() throws ParseException  {
        java.lang.String[] stringArray = {"#$\\\"'", "\n\t\r", "-3"};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDateStrictly] produces [java.lang.IllegalArgumentException: Unterminated quote]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.literal(FastDateParser.java:245)
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:213)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:344)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:322) */
        DateUtils.parseDateStrictly("\n\t\r", stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseDateStrictly(java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testParseDateStrictly1() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDateStrictly] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:205)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:344)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:322) */
        DateUtils.parseDateStrictly(string, stringArray);
    }
    
    @Test
    public void testParseDateStrictly2() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.parseDateStrictly] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser$StrategyParser.getNextStrategy(FastDateParser.java:205)
            org.apache.commons.lang3.time.FastDateParser.init(FastDateParser.java:160)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:146)
            org.apache.commons.lang3.time.FastDateParser.<init>(FastDateParser.java:111)
            org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(DateUtils.java:377)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:344)
            org.apache.commons.lang3.time.DateUtils.parseDateStrictly(DateUtils.java:322) */
        DateUtils.parseDateStrictly(string, stringArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parseDateStrictly(java.lang.String, [Ljava.lang.String;)
    
    @Test(expected = ParseException.class)
    public void testParseDateStrictly3() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {};
        
        DateUtils.parseDateStrictly(string, stringArray);
    }
    
    @Test(expected = ParseException.class)
    public void testParseDateStrictly4() throws ParseException  {
        String string = "";
        java.lang.String[] stringArray = {};
        
        DateUtils.parseDateStrictly(string, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.toCalendar
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toCalendar(java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#toCalendar(java.util.Date)}
     */
    @Test
    public void testToCalendar() throws Exception  {
        Date date = new Date();
        
        BuddhistCalendar actual = ((BuddhistCalendar) DateUtils.toCalendar(date));
        
        BuddhistCalendar expected = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toCalendar(java.util.Date)
    
    @Test
    public void testToCalendar1() throws Exception  {
        Date date = new Date();
        
        BuddhistCalendar actual = ((BuddhistCalendar) DateUtils.toCalendar(date));
        
        BuddhistCalendar expected = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToCalendar2() throws Exception  {
        Date date = new Date();
        
        BuddhistCalendar actual = ((BuddhistCalendar) DateUtils.toCalendar(date));
        
        BuddhistCalendar expected = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToCalendar3() throws Exception  {
        Date date = new Date();
        
        BuddhistCalendar actual = ((BuddhistCalendar) DateUtils.toCalendar(date));
        
        BuddhistCalendar expected = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toCalendar(java.util.Date)
    
    @Test
    public void testToCalendar4() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.toCalendar] produces [java.lang.NullPointerException: date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.Calendar.setTime(Calendar.java:1792)
            org.apache.commons.lang3.time.DateUtils.toCalendar(DateUtils.java:662) */
        DateUtils.toCalendar(null);
    }
    
    @Test
    public void testToCalendar5() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.toCalendar] produces [java.lang.NullPointerException: date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.Calendar.setTime(Calendar.java:1792)
            org.apache.commons.lang3.time.DateUtils.toCalendar(DateUtils.java:662) */
        DateUtils.toCalendar(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.addMilliseconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addMilliseconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMilliseconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#add(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(date, Calendar.MILLISECOND, amount);
 *  */
    @Test
    public void testAddMilliseconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.addMilliseconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.add(DateUtils.java:515)
            org.apache.commons.lang3.time.DateUtils.addMilliseconds(DateUtils.java:500) */
        DateUtils.addMilliseconds(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addMilliseconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#addMilliseconds(java.util.Date,int)}
     */
    @Test
    public void testAddMilliseconds() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, -2147483634);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addMilliseconds(java.util.Date, int)
    
    @Test
    public void testAddMilliseconds1() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMilliseconds2() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMilliseconds3() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMilliseconds4() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddMilliseconds5() {
        Date date = new Date();
        
        Date actual = DateUtils.addMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.modify
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method modify(java.util.Calendar, int, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#modify(java.util.Calendar,int,int)}
 * @utbot.executesCondition {@code (val.get(Calendar.YEAR) > 280000000): False}
 * @utbot.executesCondition {@code (field == Calendar.MILLISECOND): True}
 * @utbot.invokes {@link java.util.Calendar#get(int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testModify_FieldEqualsCalendarMILLISECOND() throws Exception  {
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(buddhistCalendar, "sun.util.BuddhistCalendar", "yearOffset", 280000510);
        int[] fields = {0, -510};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class buddhistCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method modifyMethod = dateUtilsClazz.getDeclaredMethod("modify", buddhistCalendarType, intType, intType);
        modifyMethod.setAccessible(true);
        java.lang.Object[] modifyMethodArguments = new java.lang.Object[3];
        modifyMethodArguments[0] = buddhistCalendar;
        modifyMethodArguments[1] = 14;
        modifyMethodArguments[2] = -255;
        modifyMethod.invoke(null, modifyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method modify(java.util.Calendar, int, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#modify(java.util.Calendar,int,int)}
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
        
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class buddhistCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method modifyMethod = dateUtilsClazz.getDeclaredMethod("modify", buddhistCalendarType, intType, intType);
        modifyMethod.setAccessible(true);
        java.lang.Object[] modifyMethodArguments = new java.lang.Object[3];
        modifyMethodArguments[0] = buddhistCalendar;
        modifyMethodArguments[1] = 1;
        modifyMethodArguments[2] = -255;
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
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setMilliseconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMilliseconds(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMilliseconds(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.MILLISECOND, amount);
 *  */
    @Test
    public void testSetMilliseconds_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMilliseconds] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setMilliseconds(DateUtils.java:625) */
        DateUtils.setMilliseconds(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setMilliseconds(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setMilliseconds(java.util.Date,int)}
     */
    @Test
    public void testSetMillisecondsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setMilliseconds] produces [java.lang.IllegalArgumentException: MILLISECOND]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setMilliseconds(DateUtils.java:625) */
        DateUtils.setMilliseconds(date, -2147483634);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setMilliseconds(java.util.Date, int)
    
    @Test
    public void testSetMilliseconds1() {
        Date date = new Date();
        
        Date actual = DateUtils.setMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMilliseconds2() {
        Date date = new Date();
        
        Date actual = DateUtils.setMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMilliseconds3() {
        Date date = new Date();
        
        Date actual = DateUtils.setMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMilliseconds4() {
        Date date = new Date();
        
        Date actual = DateUtils.setMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetMilliseconds5() {
        Date date = new Date();
        
        Date actual = DateUtils.setMilliseconds(date, 0);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.isSameDay
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameDay(java.util.Calendar, java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
 * @utbot.executesCondition {@code (cal1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cal1 == null || cal2 == null
 *  */
    @Test
    public void testIsSameDay_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameDay] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameDay(DateUtils.java:192) */
        DateUtils.isSameDay(((Calendar) null), ((Calendar) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSameDay(java.util.Calendar, java.util.Calendar)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
     */
    @Test
    public void testIsSameDayThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameDay] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameDay(DateUtils.java:192) */
        DateUtils.isSameDay(((Calendar) null), ((Calendar) null));
    }
    ///endregion
    
    ///region Errors report for isSameDay
    
    public void testIsSameDay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 82 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.isSameDay
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameDay(java.util.Date, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): False}
 * @utbot.executesCondition {@code (date2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test
    public void testIsSameDay_ThrowIllegalArgumentException1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameDay] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameDay(DateUtils.java:168) */
        DateUtils.isSameDay(date, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
 * @utbot.executesCondition {@code (date1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: date1 == null || date2 == null
 *  */
    @Test
    public void testIsSameDay_ThrowIllegalArgumentException_1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.isSameDay] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.isSameDay(DateUtils.java:168) */
        DateUtils.isSameDay(((Date) null), ((Date) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameDay(java.util.Date, java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
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
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSameDay2() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSameDay3() {
        Date date = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSameDay4() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSameDay5() {
        Date date = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSameDay6() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.isSameDay(date, date1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setYears
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setYears(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setYears(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.YEAR, amount);
 *  */
    @Test
    public void testSetYears_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setYears(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setYears(java.util.Date,int)}
     */
    @Test
    public void testSetYearsThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, -2147483647);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setYears(java.util.Date, int)
    
    @Test
    public void testSetYears1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, 0);
    }
    
    @Test
    public void testSetYears2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, 0);
    }
    
    @Test
    public void testSetYears3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, 0);
    }
    
    @Test
    public void testSetYears4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, 0);
    }
    
    @Test
    public void testSetYears5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setYears] produces [java.lang.IllegalArgumentException: YEAR]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setYears(DateUtils.java:534) */
        DateUtils.setYears(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.setDays
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDays(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setDays(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#set(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set(date, Calendar.DAY_OF_MONTH, amount);
 *  */
    @Test
    public void testSetDays_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:642)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setDays(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#setDays(java.util.Date,int)}
     */
    @Test
    public void testSetDaysThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, -2147483643);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDays(java.util.Date, int)
    
    @Test
    public void testSetDays1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, 0);
    }
    
    @Test
    public void testSetDays2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, 0);
    }
    
    @Test
    public void testSetDays3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, 0);
    }
    
    @Test
    public void testSetDays4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, 0);
    }
    
    @Test
    public void testSetDays5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.setDays] produces [java.lang.IllegalArgumentException: DAY_OF_MONTH]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            org.apache.commons.lang3.time.DateUtils.set(DateUtils.java:648)
            org.apache.commons.lang3.time.DateUtils.setDays(DateUtils.java:564) */
        DateUtils.setDays(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInDays
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInDays(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getFragment(date, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1651)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInDays(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Date,int)}
     */
    @Test
    public void testGetFragmentInDaysThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment -2147483642 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, -2147483642);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInDays(java.util.Date, int)
    
    @Test
    public void testGetFragmentInDays1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, 0);
    }
    
    @Test
    public void testGetFragmentInDays2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, 0);
    }
    
    @Test
    public void testGetFragmentInDays3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, 0);
    }
    
    @Test
    public void testGetFragmentInDays4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, 0);
    }
    
    @Test
    public void testGetFragmentInDays5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1445) */
        DateUtils.getFragmentInDays(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInDays
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFragmentInDays(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Calendar,int,int)
 * @utbot.returnsFrom {@code return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);}
 *  */
    @Test
    public void testGetFragmentInDays_DateUtilsGetFragment() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 14);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInDays(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 10 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 10);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 3 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 7 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 7);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 4 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 4);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 9 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 9);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment -241 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, -241);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The fragment 8 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 8);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
 *  */
    @Test
    public void testGetFragmentInDays_ThrowIllegalArgumentException_7() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(((Calendar) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInDays(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
     */
    @Test
    public void testGetFragmentInDaysThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(((Calendar) null), -2147483642);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFragmentInDays(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInDays6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 1);
        
        assertEquals(269L, actual);
    }
    
    @Test
    public void testGetFragmentInDays7() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 2);
        
        assertEquals(26L, actual);
    }
    
    @Test
    public void testGetFragmentInDays8() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 6);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetFragmentInDays9() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 5);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetFragmentInDays10() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInDays(gregorianCalendar, 13);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInDays(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInDays11() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInDays12() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInDays13() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInDays14() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInDays15() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInDays16() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInDays] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInDays(DateUtils.java:1636) */
        DateUtils.getFragmentInDays(gregorianCalendar, 11);
    }
    ///endregion
    
    ///region Errors report for getFragmentInDays
    
    public void testGetFragmentInDays_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 174 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncatedEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncatedEquals(java.util.Date, java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Date,java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Date,java.util.Date,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return truncatedCompareTo(date1, date2, field) == 0;
 *  */
    @Test
    public void testTruncatedEquals_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1783)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1745) */
        DateUtils.truncatedEquals(((Date) null), ((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncatedEquals(java.util.Date, java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Date,java.util.Date,int)}
     */
    @Test
    public void testTruncatedEqualsThrowsIAE() {
        Date date = new Date();
        Date date1 = new Date(-1L);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.IllegalArgumentException: The field 64 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:816)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1783)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1745) */
        DateUtils.truncatedEquals(date, date1, 64);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncatedEquals(java.util.Date, java.util.Date, int)
    
    @Test
    public void testTruncatedEquals1() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.truncatedEquals(date, date1, 0);
        
        assertTrue(actual);
    }
    
    @Test
    public void testTruncatedEquals2() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.truncatedEquals(date, date1, 0);
        
        assertTrue(actual);
    }
    
    @Test
    public void testTruncatedEquals3() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.truncatedEquals(date, date1, 0);
        
        assertTrue(actual);
    }
    
    @Test
    public void testTruncatedEquals4() {
        Date date = new Date();
        Date date1 = new Date();
        
        boolean actual = DateUtils.truncatedEquals(date, date1, 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method truncatedEquals(java.util.Date, java.util.Date, int)
    
    @Test
    public void testTruncatedEquals5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1784)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1745) */
        DateUtils.truncatedEquals(date, ((Date) null), 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncatedEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncatedEquals(java.util.Calendar, java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return truncatedCompareTo(cal1, cal2, field) == 0;
 *  */
    @Test
    public void testTruncatedEquals_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1728) */
        DateUtils.truncatedEquals(((Calendar) null), ((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return truncatedCompareTo(cal1, cal2, field) == 0;
 *  */
    @Test
    public void testTruncatedEquals_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:840)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1728) */
        DateUtils.truncatedEquals(gregorianCalendar, ((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return truncatedCompareTo(cal1, cal2, field) == 0;
 *  */
    @Test
    public void testTruncatedEquals_ThrowNullPointerException1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1728) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method truncatedEqualsMethod = dateUtilsClazz.getDeclaredMethod("truncatedEquals", japaneseImperialCalendarType, japaneseImperialCalendarType, intType);
        truncatedEqualsMethod.setAccessible(true);
        java.lang.Object[] truncatedEqualsMethodArguments = new java.lang.Object[3];
        truncatedEqualsMethodArguments[0] = japaneseImperialCalendar;
        truncatedEqualsMethodArguments[1] = ((Object) null);
        truncatedEqualsMethodArguments[2] = -255;
        try {
            truncatedEqualsMethod.invoke(null, truncatedEqualsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncatedEquals(java.util.Calendar, java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
     */
    @Test
    public void testTruncatedEqualsThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedEquals] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763)
            org.apache.commons.lang3.time.DateUtils.truncatedEquals(DateUtils.java:1728) */
        DateUtils.truncatedEquals(((Calendar) null), ((Calendar) null), -16385);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncatedCompareTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncatedCompareTo(java.util.Date, java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Date,java.util.Date,int)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Date,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Date truncatedDate1 = truncate(date1, field);
 *  */
    @Test
    public void testTruncatedCompareTo_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1783) */
        DateUtils.truncatedCompareTo(((Date) null), ((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncatedCompareTo(java.util.Date, java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Date,java.util.Date,int)}
     */
    @Test
    public void testTruncatedCompareToThrowsIAE() {
        Date date = new Date();
        Date date1 = new Date(-1L);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.IllegalArgumentException: The field -65 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:816)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1783) */
        DateUtils.truncatedCompareTo(date, date1, -65);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method truncatedCompareTo(java.util.Date, java.util.Date, int)
    
    @Test
    public void testTruncatedCompareTo1() {
        Date date = new Date();
        
        int actual = DateUtils.truncatedCompareTo(date, date, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testTruncatedCompareTo2() {
        Date date = new Date();
        Date date1 = new Date();
        
        int actual = DateUtils.truncatedCompareTo(date, date1, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method truncatedCompareTo(java.util.Date, java.util.Date, int)
    
    @Test
    public void testTruncatedCompareTo3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1784) */
        DateUtils.truncatedCompareTo(date, ((Date) null), 0);
    }
    
    @Test
    public void testTruncatedCompareTo4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1784) */
        DateUtils.truncatedCompareTo(date, ((Date) null), 0);
    }
    
    @Test
    public void testTruncatedCompareTo5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:813)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1784) */
        DateUtils.truncatedCompareTo(date, ((Date) null), 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.truncatedCompareTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method truncatedCompareTo(java.util.Calendar, java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar truncatedCal1 = truncate(cal1, field);
 *  */
    @Test
    public void testTruncatedCompareTo_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763) */
        DateUtils.truncatedCompareTo(((Calendar) null), ((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Calendar truncatedCal1 = truncate(cal1, field);
 *  */
    @Test
    public void testTruncatedCompareTo_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.IllegalArgumentException: The field -255 is not supported]
            org.apache.commons.lang3.time.DateUtils.modify(DateUtils.java:1098)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:840)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763) */
        DateUtils.truncatedCompareTo(gregorianCalendar, ((Calendar) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar truncatedCal1 = truncate(cal1, field);
 *  */
    @Test
    public void testTruncatedCompareTo_ThrowNullPointerException1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:839)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763) */
        Class dateUtilsClazz = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method truncatedCompareToMethod = dateUtilsClazz.getDeclaredMethod("truncatedCompareTo", japaneseImperialCalendarType, japaneseImperialCalendarType, intType);
        truncatedCompareToMethod.setAccessible(true);
        java.lang.Object[] truncatedCompareToMethodArguments = new java.lang.Object[3];
        truncatedCompareToMethodArguments[0] = japaneseImperialCalendar;
        truncatedCompareToMethodArguments[1] = ((Object) null);
        truncatedCompareToMethodArguments[2] = -255;
        try {
            truncatedCompareToMethod.invoke(null, truncatedCompareToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method truncatedCompareTo(java.util.Calendar, java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)}
     */
    @Test
    public void testTruncatedCompareToThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.truncatedCompareTo] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.truncate(DateUtils.java:837)
            org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(DateUtils.java:1763) */
        DateUtils.truncatedCompareTo(((Calendar) null), ((Calendar) null), -16385);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInHours
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInHours(java.util.Date, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Date,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Date,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getFragment(date, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.NullPointerException: The date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.DateUtils.validateDateNotNull(DateUtils.java:1789)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1651)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(((Date) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInHours(java.util.Date, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Date,int)}
     */
    @Test
    public void testGetFragmentInHoursThrowsIAE() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment -2147483637 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, -2147483637);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInHours(java.util.Date, int)
    
    @Test
    public void testGetFragmentInHours1() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, 0);
    }
    
    @Test
    public void testGetFragmentInHours2() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, 0);
    }
    
    @Test
    public void testGetFragmentInHours3() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, 0);
    }
    
    @Test
    public void testGetFragmentInHours4() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, 0);
    }
    
    @Test
    public void testGetFragmentInHours5() {
        Date date = new Date();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 0 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1654)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1407) */
        DateUtils.getFragmentInHours(date, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getFragmentInHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFragmentInHours(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.invokes org.apache.commons.lang3.time.DateUtils#getFragment(java.util.Calendar,int,int)
 * @utbot.returnsFrom {@code return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);}
 *  */
    @Test
    public void testGetFragmentInHours_DateUtilsGetFragment() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = DateUtils.getFragmentInHours(gregorianCalendar, 14);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFragmentInHours(java.util.Calendar, int)
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 10 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 10);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 3 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 7 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 7);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_3() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 4 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 4);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_4() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 9 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 9);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_5() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment -241 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, -241);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_6() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The fragment 8 is not supported]
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1709)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 8);
    }
    
    /**
    @utbot.classUnderTest {@link DateUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
 *  */
    @Test
    public void testGetFragmentInHours_ThrowIllegalArgumentException_7() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(((Calendar) null), -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFragmentInHours(java.util.Calendar, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.DateUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
     */
    @Test
    public void testGetFragmentInHoursThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.IllegalArgumentException: The date must not be null]
            org.apache.commons.lang3.time.DateUtils.nullDateIllegalArgumentException(DateUtils.java:752)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1670)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(((Calendar) null), -2147483637);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFragmentInHours(java.util.Calendar, int)
    
    @Test
    public void testGetFragmentInHours6() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInHours7() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[4] = 16;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInHours8() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInHours9() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1703)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 12);
    }
    
    @Test
    public void testGetFragmentInHours10() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 11);
    }
    
    @Test
    public void testGetFragmentInHours11() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.DateUtils.getFragmentInHours] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang3.time.DateUtils.getFragment(DateUtils.java:1700)
            org.apache.commons.lang3.time.DateUtils.getFragmentInHours(DateUtils.java:1596) */
        DateUtils.getFragmentInHours(gregorianCalendar, 11);
    }
    ///endregion
    
    ///region Errors report for getFragmentInHours
    
    public void testGetFragmentInHours_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 24 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.DateUtils.getMillisPerUnit
    
    ///region Errors report for getMillisPerUnit
    
    public void testGetMillisPerUnit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields627903227659400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields627903227659400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass627903227664000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields627903227659400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass627903227664000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

