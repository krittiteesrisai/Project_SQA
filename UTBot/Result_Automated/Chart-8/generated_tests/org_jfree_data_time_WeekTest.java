package org.jfree.data.time;

import org.junit.Test;
import java.util.GregorianCalendar;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jfree_data_time_WeekTest {
    ///region Test suites for executable org.jfree.data.time.Week.getFirstMillisecond
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFirstMillisecond(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getFirstMillisecond(java.util.Calendar)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 *  */
    @Test
    public void testGetFirstMillisecond_CalendarClone() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = week.getFirstMillisecond(gregorianCalendar);
        
        assertEquals(-62168367600000L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFirstMillisecond(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getFirstMillisecond(java.util.Calendar)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar c = (Calendar) calendar.clone();
 *  */
    @Test
    public void testGetFirstMillisecond_ThrowNullPointerException_1() throws Throwable  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.jfree.data.time.Week.getFirstMillisecond] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.jfree.data.time.Week.getFirstMillisecond(Week.java:380) */
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Method getFirstMillisecondMethod = weekClazz.getDeclaredMethod("getFirstMillisecond", japaneseImperialCalendarType);
        getFirstMillisecondMethod.setAccessible(true);
        java.lang.Object[] getFirstMillisecondMethodArguments = new java.lang.Object[1];
        getFirstMillisecondMethodArguments[0] = japaneseImperialCalendar;
        try {
            getFirstMillisecondMethod.invoke(week, getFirstMillisecondMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getFirstMillisecond(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar c = (Calendar) calendar.clone();
 *  */
    @Test
    public void testGetFirstMillisecond_ThrowNullPointerException() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        /* This test fails because method [org.jfree.data.time.Week.getFirstMillisecond] produces [java.lang.NullPointerException]
            org.jfree.data.time.Week.getFirstMillisecond(Week.java:380) */
        week.getFirstMillisecond(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getFirstMillisecond
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFirstMillisecond()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getFirstMillisecond()}
 * @utbot.returnsFrom {@code return this.firstMillisecond;}
 *  */
    @Test
    public void testGetFirstMillisecond_ReturnThisFirstMillisecond() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "firstMillisecond", 1L);
        
        long actual = week.getFirstMillisecond();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getYearValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getYearValue()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getYearValue()}
 * @utbot.returnsFrom {@code return this.year;}
 *  */
    @Test
    public void testGetYearValue_ReturnThisYear() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) -255);
        
        int actual = week.getYearValue();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.stringToWeek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringToWeek(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#stringToWeek(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#replace(char,char)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testStringToWeek_IntegerParseInt() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method stringToWeekMethod = weekClazz.getDeclaredMethod("stringToWeek", stringType);
        stringToWeekMethod.setAccessible(true);
        java.lang.Object[] stringToWeekMethodArguments = new java.lang.Object[1];
        stringToWeekMethodArguments[0] = string;
        int actual = ((Integer) stringToWeekMethod.invoke(null, stringToWeekMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stringToWeek(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#stringToWeek(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#replace(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: s = s.replace('W', ' ');
 *  */
    @Test
    public void testStringToWeek_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jfree.data.time.Week.stringToWeek] produces [java.lang.NullPointerException]
            org.jfree.data.time.Week.stringToWeek(Week.java:632) */
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method stringToWeekMethod = weekClazz.getDeclaredMethod("stringToWeek", stringType);
        stringToWeekMethod.setAccessible(true);
        java.lang.Object[] stringToWeekMethodArguments = new java.lang.Object[1];
        stringToWeekMethodArguments[0] = ((Object) null);
        try {
            stringToWeekMethod.invoke(null, stringToWeekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getSerialIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSerialIndex()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getSerialIndex()}
 * @utbot.returnsFrom {@code return this.year * 53L + this.week;}
 *  */
    @Test
    public void testGetSerialIndex_ReturnThisYearMultiply53LPlusThisWeek() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) -255);
        setField(week, "org.jfree.data.time.Week", "week", (byte) -127);
        
        long actual = week.getSerialIndex();
        
        assertEquals(-13642L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.findSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#findSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (result == -1): True}
 * @utbot.executesCondition {@code (result == -1): True}
 * @utbot.executesCondition {@code (result == -1): True}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSeparator_ResultEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method findSeparatorMethod = weekClazz.getDeclaredMethod("findSeparator", stringType);
        findSeparatorMethod.setAccessible(true);
        java.lang.Object[] findSeparatorMethodArguments = new java.lang.Object[1];
        findSeparatorMethodArguments[0] = string;
        int actual = ((Integer) findSeparatorMethod.invoke(null, findSeparatorMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#findSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (result == -1): False}
 * @utbot.executesCondition {@code (result == -1): False}
 * @utbot.executesCondition {@code (result == -1): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSeparator_ResultNotEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "-";
        
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method findSeparatorMethod = weekClazz.getDeclaredMethod("findSeparator", stringType);
        findSeparatorMethod.setAccessible(true);
        java.lang.Object[] findSeparatorMethodArguments = new java.lang.Object[1];
        findSeparatorMethodArguments[0] = string;
        int actual = ((Integer) findSeparatorMethod.invoke(null, findSeparatorMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#findSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (result == -1): True}
 * @utbot.executesCondition {@code (result == -1): False}
 * @utbot.executesCondition {@code (result == -1): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSeparator_ResultNotEqualsNegative1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = ",";
        
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method findSeparatorMethod = weekClazz.getDeclaredMethod("findSeparator", stringType);
        findSeparatorMethod.setAccessible(true);
        java.lang.Object[] findSeparatorMethodArguments = new java.lang.Object[1];
        findSeparatorMethodArguments[0] = string;
        int actual = ((Integer) findSeparatorMethod.invoke(null, findSeparatorMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#findSeparator(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = s.indexOf('-');
 *  */
    @Test
    public void testFindSeparator_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jfree.data.time.Week.findSeparator] produces [java.lang.NullPointerException]
            org.jfree.data.time.Week.findSeparator(Week.java:587) */
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method findSeparatorMethod = weekClazz.getDeclaredMethod("findSeparator", stringType);
        findSeparatorMethod.setAccessible(true);
        java.lang.Object[] findSeparatorMethodArguments = new java.lang.Object[1];
        findSeparatorMethodArguments[0] = ((Object) null);
        try {
            findSeparatorMethod.invoke(null, findSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.evaluateAsYear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluateAsYear(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#evaluateAsYear(java.lang.String)}
 * @utbot.invokes {@link org.jfree.data.time.Year#parseYear(java.lang.String)}
 *  */
    @Test
    public void testEvaluateAsYear_YearParseYear() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class stringType = Class.forName("java.lang.String");
        Method evaluateAsYearMethod = weekClazz.getDeclaredMethod("evaluateAsYear", stringType);
        evaluateAsYearMethod.setAccessible(true);
        java.lang.Object[] evaluateAsYearMethodArguments = new java.lang.Object[1];
        evaluateAsYearMethodArguments[0] = string;
        Year actual = ((Year) evaluateAsYearMethod.invoke(null, evaluateAsYearMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.parseWeek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseWeek(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#parseWeek(java.lang.String)}
 * @utbot.executesCondition {@code (s != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseWeek_SEqualsNull() {
        Week actual = Week.parseWeek(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseWeek(java.lang.String)
    
    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek1() {
        String string = "!";
        
        Week.parseWeek(string);
    }
    
    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek2() {
        String string = ",!";
        
        Week.parseWeek(string);
    }
    
    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek3() {
        String string = "!-";
        
        Week.parseWeek(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getLastMillisecond
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastMillisecond()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getLastMillisecond()}
 * @utbot.returnsFrom {@code return this.lastMillisecond;}
 *  */
    @Test
    public void testGetLastMillisecond_ReturnThisLastMillisecond() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "lastMillisecond", 1L);
        
        long actual = week.getLastMillisecond();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getLastMillisecond
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastMillisecond(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getLastMillisecond(java.util.Calendar)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 *  */
    @Test
    public void testGetLastMillisecond_CalendarClone() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        long actual = week.getLastMillisecond(gregorianCalendar);
        
        assertEquals(-62167762800001L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLastMillisecond(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getLastMillisecond(java.util.Calendar)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar c = (Calendar) calendar.clone();
 *  */
    @Test
    public void testGetLastMillisecond_ThrowNullPointerException_1() throws Throwable  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.jfree.data.time.Week.getLastMillisecond] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.jfree.data.time.Week.getLastMillisecond(Week.java:405) */
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Method getLastMillisecondMethod = weekClazz.getDeclaredMethod("getLastMillisecond", japaneseImperialCalendarType);
        getLastMillisecondMethod.setAccessible(true);
        java.lang.Object[] getLastMillisecondMethodArguments = new java.lang.Object[1];
        getLastMillisecondMethodArguments[0] = japaneseImperialCalendar;
        try {
            getLastMillisecondMethod.invoke(week, getLastMillisecondMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getLastMillisecond(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar c = (Calendar) calendar.clone();
 *  */
    @Test
    public void testGetLastMillisecond_ThrowNullPointerException() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        /* This test fails because method [org.jfree.data.time.Week.getLastMillisecond] produces [java.lang.NullPointerException]
            org.jfree.data.time.Week.getLastMillisecond(Week.java:405) */
        week.getLastMillisecond(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.peg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peg(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#peg(java.util.Calendar)}
 * @utbot.invokes {@link org.jfree.data.time.Week#getFirstMillisecond(java.util.Calendar)}
 *  */
    @Test
    public void testPeg_WeekGetFirstMillisecond() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        week.peg(gregorianCalendar);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peg(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#peg(java.util.Calendar)}
 * @utbot.invokes {@link org.jfree.data.time.Week#getFirstMillisecond(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.firstMillisecond = getFirstMillisecond(calendar);
 *  */
    @Test
    public void testPeg_ThrowNullPointerException() throws Throwable  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.jfree.data.time.Week.peg] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clone(Calendar.java:3309)
            java.base/java.util.JapaneseImperialCalendar.clone(JapaneseImperialCalendar.java:1507)
            org.jfree.data.time.Week.getFirstMillisecond(Week.java:380)
            org.jfree.data.time.Week.peg(Week.java:288) */
        Class weekClazz = Class.forName("org.jfree.data.time.Week");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Method pegMethod = weekClazz.getDeclaredMethod("peg", japaneseImperialCalendarType);
        pegMethod.setAccessible(true);
        java.lang.Object[] pegMethodArguments = new java.lang.Object[1];
        pegMethodArguments[0] = japaneseImperialCalendar;
        try {
            pegMethod.invoke(week, pegMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        boolean actual = week.equals(week);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Week)): False}
 * @utbot.executesCondition {@code (this.week != that.week): True}
 *  */
    @Test
    public void testEquals_ThisWeekNotEqualsThatWeek() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "week", java.lang.Byte.MIN_VALUE);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "week", (byte) 0);
        
        boolean actual = week.equals(week1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Week)): False}
 * @utbot.executesCondition {@code (this.week != that.week): False}
 * @utbot.executesCondition {@code (this.year != that.year): True}
 *  */
    @Test
    public void testEquals_ThisYearNotEqualsThatYear() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) -127);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "year", java.lang.Short.MIN_VALUE);
        setField(week1, "org.jfree.data.time.Week", "week", (byte) -127);
        
        boolean actual = week.equals(week1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Week)): False}
 * @utbot.executesCondition {@code (this.week != that.week): False}
 * @utbot.executesCondition {@code (this.year != that.year): False}
 *  */
    @Test
    public void testEquals_ThisYearEqualsThatYear() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) -255);
        setField(week, "org.jfree.data.time.Week", "week", (byte) -127);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "year", (short) -255);
        setField(week1, "org.jfree.data.time.Week", "week", (byte) -127);
        
        boolean actual = week.equals(week1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Week)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfWeek() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        boolean actual = week.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "Week " + this.week + ", " + this.year;}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 0);
        
        String actual = week.toString();
        
        String expected = "Week 0, 0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ReturnResult() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 1);
        setField(week, "org.jfree.data.time.Week", "week", (byte) -127);
        
        int actual = week.hashCode();
        
        assertEquals(18575, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareTo(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (o1 instanceof RegularTimePeriod): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCompareTo_O1InstanceOfRegularTimePeriod() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        Quarter quarter = ((Quarter) createInstance("org.jfree.data.time.Quarter"));
        
        int actual = week.compareTo(quarter);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (o1 instanceof RegularTimePeriod): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCompareTo_NotO1NotInstanceOfRegularTimePeriod() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        
        int actual = week.compareTo(null);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareTo(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#compareTo(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = this.year - w.getYear().getYear();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCompareTo_ThrowIllegalArgumentException() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) -255);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "year", (short) 1899);
        
        week.compareTo(week1);
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#compareTo(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = this.year - w.getYear().getYear();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCompareTo_ThrowIllegalArgumentException_1() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) -255);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "year", (short) 10000);
        
        week.compareTo(week1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compareTo(java.lang.Object)
    
    @Test
    public void testCompareTo1() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        Week week1 = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week1, "org.jfree.data.time.Week", "year", (short) 5920);
        
        int actual = week.compareTo(week1);
        
        assertEquals(-5920, actual);
    }
    
    @Test
    public void testCompareTo2() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 5920);
        
        int actual = week.compareTo(week);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.next
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method next()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#next()}
 * @utbot.executesCondition {@code (this.week < 52): False}
 * @utbot.invokes {@link java.util.Calendar#getInstance()}
 *  */
    @Test
    public void testNext_ThisWeekGreaterOrEqual52() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "week", (byte) 52);
        
        Week actual = ((Week) week.next());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 1);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) 1);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -79272111600000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -79271506800001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method next()
    
    @Test
    public void testNext1() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 3);
        
        Week actual = ((Week) week.next());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 0);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) 4);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -79301746800000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -79301142000001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNext2() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) -125);
        
        Week actual = ((Week) week.next());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 0);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) -124);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -79379161200000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -79378556400001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.previous
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previous()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#previous()}
 * @utbot.executesCondition {@code (this.week != FIRST_WEEK_IN_YEAR): False}
 * @utbot.executesCondition {@code (this.year > 1900): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testPrevious_ThisYearLessOrEqual1900() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 45);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 1);
        
        RegularTimePeriod actual = week.previous();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method previous()
    
    @Test
    public void testPrevious1() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 64);
        
        Week actual = ((Week) week.previous());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 0);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) 63);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -79266063600000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -79265458800001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrevious2() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 0);
        
        Week actual = ((Week) week.previous());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 0);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) -1);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -79304770800000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -79304166000001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrevious3() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 1901);
        setField(week, "org.jfree.data.time.Week", "week", (byte) 1);
        
        Week actual = ((Week) week.previous());
        
        Week expected = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(expected, "org.jfree.data.time.Week", "year", (short) 1900);
        setField(expected, "org.jfree.data.time.Week", "week", (byte) 52);
        setField(expected, "org.jfree.data.time.Week", "firstMillisecond", -19312844400000L);
        setField(expected, "org.jfree.data.time.Week", "lastMillisecond", -19312239600001L);
        
        // org.jfree.data.time.Week has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getYear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getYear()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getYear()}
 *  */
    @Test
    public void testGetYear() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 2080);
        
        Year actual = week.getYear();
        
        Year expected = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(expected, "org.jfree.data.time.Year", "year", (short) 2080);
        setField(expected, "org.jfree.data.time.Year", "firstMillisecond", -13663321200000L);
        setField(expected, "org.jfree.data.time.Year", "lastMillisecond", -13631785200001L);
        
        // org.jfree.data.time.Year has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getYear()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getYear()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Year(this.year);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetYear_ThrowIllegalArgumentException() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 10256);
        
        week.getYear();
    }
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getYear()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Year(this.year);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetYear_ThrowIllegalArgumentException_1() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "year", (short) 0);
        
        week.getYear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.time.Week.getWeek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeek()
    
    /**
    @utbot.classUnderTest {@link Week}
 * @utbot.methodUnderTest {@link org.jfree.data.time.Week#getWeek()}
 * @utbot.returnsFrom {@code return this.week;}
 *  */
    @Test
    public void testGetWeek_ReturnThisWeek() throws Exception  {
        Week week = ((Week) createInstance("org.jfree.data.time.Week"));
        setField(week, "org.jfree.data.time.Week", "week", (byte) -127);
        
        int actual = week.getWeek();
        
        assertEquals(-127, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields796771330755700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields796771330755700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass796771330771900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields796771330755700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass796771330771900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

