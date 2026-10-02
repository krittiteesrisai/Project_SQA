package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import sun.util.calendar.ZoneInfo;
import java.lang.reflect.Method;
import java.util.Date;
import java.text.FieldPosition;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.CompactNumberFormat;
import java.text.ParsePosition;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.time.ZoneId;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_util_StdDateFormatTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null);
        
        String actual = stdDateFormat.toString();
        
        String expected = "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: java.util.SimpleTimeZone[id=null,offset=0,dstSavings=0,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0])(locale: null)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        String actual = stdDateFormat.toString();
        
        String expected = "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#clone()}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, _locale, _lenient);}
 *  */
    @Test
    public void testClone_Return() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        StdDateFormat actual = stdDateFormat.clone();
        
        StdDateFormat expected = new StdDateFormat(null, null, null);
        
        TimeZone actual_timezone = actual._timezone;
        assertNull(actual_timezone);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (_formatISO8601 == null): False}
 * @utbot.invokes {@link java.text.DateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.returnsFrom {@code return _formatISO8601.format(date, toAppendTo, fieldPosition);}
 *  */
    @Test
    public void testFormat__formatISO8601NotEqualsNull() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatISO8601, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        setField(_formatISO8601, "java.text.SimpleDateFormat", "locale", locale);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(calendar, "java.util.Calendar", "time", 0L);
        setField(calendar, "java.util.Calendar", "isTimeSet", true);
        setField(calendar, "java.util.Calendar", "areFieldsSet", true);
        setField(calendar, "java.util.Calendar", "areAllFieldsSet", true);
        ZoneInfo zone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatISO8601, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        Date date = new Date(0L);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        StringBuffer actual = stdDateFormat.format(date, ((StringBuffer) null), fieldPosition);
        
        assertNull(actual);
        
        int finalFieldPositionEndIndex = ((Integer) getFieldValue(fieldPosition, "java.text.FieldPosition", "endIndex"));
        int finalFieldPositionBeginIndex = ((Integer) getFieldValue(fieldPosition, "java.text.FieldPosition", "beginIndex"));
        
        assertEquals(0, finalFieldPositionEndIndex);
        
        assertEquals(0, finalFieldPositionBeginIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (_formatISO8601 == null): False}
 * @utbot.invokes {@link java.text.DateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _formatISO8601.format(date, toAppendTo, fieldPosition);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatISO8601, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.NullPointerException: date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.Calendar.setTime(Calendar.java:1792)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:978)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:971)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:362) */
        stdDateFormat.format(((Date) null), ((StringBuffer) null), fieldPosition);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    @Test
    public void testFormat1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] zoneOffsets = {};
        setField(calendar, "java.util.GregorianCalendar", "zoneOffsets", zoneOffsets);
        setField(calendar, "java.util.Calendar", "time", 0L);
        setField(calendar, "java.util.Calendar", "isTimeSet", true);
        setField(calendar, "java.util.Calendar", "areFieldsSet", true);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        _formatISO8601.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        java.sql.Date date = new java.sql.Date(0L);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2304)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.Calendar.setTime(Calendar.java:1793)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:978)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:971)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:362) */
        stdDateFormat.format(((Date) date), ((StringBuffer) null), fieldPosition);
    }
    
    @Test
    public void testFormat2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] zoneOffsets = {0};
        setField(calendar, "java.util.GregorianCalendar", "zoneOffsets", zoneOffsets);
        setField(calendar, "java.util.Calendar", "time", 0L);
        setField(calendar, "java.util.Calendar", "isTimeSet", true);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        _formatISO8601.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        java.sql.Date date = new java.sql.Date(0L);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2305)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.Calendar.setTime(Calendar.java:1793)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:978)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:971)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:362) */
        stdDateFormat.format(((Date) date), ((StringBuffer) null), fieldPosition);
    }
    
    @Test
    public void testFormat3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] zoneOffsets = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(calendar, "java.util.GregorianCalendar", "zoneOffsets", zoneOffsets);
        setField(calendar, "java.util.Calendar", "time", -5529439749728812032L);
        setField(calendar, "java.util.Calendar", "isTimeSet", true);
        setField(calendar, "java.util.Calendar", "areFieldsSet", true);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        zone.setRawOffset(1673658625);
        setField(calendar, "java.util.Calendar", "zone", zone);
        _formatISO8601.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        java.sql.Date date = new java.sql.Date(-5529439749728812032L);
        StringBuffer stringBuffer = new StringBuffer("");
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2383)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.Calendar.setTime(Calendar.java:1793)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:978)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:971)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:362) */
        stdDateFormat.format(((Date) date), stringBuffer, fieldPosition);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] zoneOffsets = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(calendar, "java.util.GregorianCalendar", "zoneOffsets", zoneOffsets);
        setField(calendar, "java.util.Calendar", "time", 0L);
        setField(calendar, "java.util.Calendar", "isTimeSet", true);
        setField(calendar, "java.util.Calendar", "areFieldsSet", true);
        setField(calendar, "java.util.Calendar", "areAllFieldsSet", true);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        _formatISO8601.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601", _formatISO8601);
        java.sql.Date date = new java.sql.Date(0L);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.NullPointerException]
            java.base/sun.util.calendar.BaseCalendar.getCalendarDateFromFixedDate(BaseCalendar.java:428)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2358)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.Calendar.setTime(Calendar.java:1793)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:978)
            java.base/java.text.SimpleDateFormat.format(SimpleDateFormat.java:971)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:362) */
        stdDateFormat.format(((Date) date), ((StringBuffer) null), fieldPosition);
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
 * @utbot.executesCondition {@code (i < 0): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (dateStr.charAt(0) == '-' || NumberInput.inLongRange(dateStr, false))
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:291) */
        stdDateFormat.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
 * @utbot.executesCondition {@code (i < 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dt = parseAsRFC1123(dateStr, pos);
 *  */
    @Test
    public void testParse_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
 * @utbot.executesCondition {@code (i < 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dt = parseAsRFC1123(dateStr, pos);
 *  */
    @Test
    public void testParse_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1485)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dateStr = dateStr.trim();
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:270) */
        stdDateFormat.parse(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
     */
    @Test
    public void testParseWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        double[] doubleArray = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        java.lang.String[] stringArray = {"XZ", "", "\", \"", "#$\\\"'"};
        ChoiceFormat choiceFormat = new ChoiceFormat(doubleArray, stringArray);
        choiceFormat.setMinimumFractionDigits(1);
        choiceFormat.setMinimumIntegerDigits(57);
        choiceFormat.setMaximumFractionDigits(47);
        choiceFormat.setMaximumIntegerDigits(1);
        stdDateFormat.setNumberFormat(choiceFormat);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(48, 0, 0, 34, -1);
        gregorianCalendar.setFirstDayOfWeek(4194305);
        gregorianCalendar.setMinimalDaysInFirstWeek(-1);
        stdDateFormat.setCalendar(gregorianCalendar);
        
        Date actual = stdDateFormat.parse("10");
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String)
    
    @Test
    public void testParse1() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u00010";
        
        Date actual = stdDateFormat.parse(string);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse2() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-2";
        
        Date actual = stdDateFormat.parse(string);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String)
    
    @Test
    public void testParse3() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001-\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:701)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:292) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {};
        setField(calendar, "java.util.Calendar", "fields", fields);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatRFC1123, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.JapaneseImperialCalendar.computeTime(JapaneseImperialCalendar.java:1839)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse6() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse7() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001:\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse8() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse9() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2896)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse10() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        ChoiceFormat numberFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse11() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse12() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse13() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        ChoiceFormat originalNumberFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!2";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse14() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u00FF', '\u0000', '\u0000', '\u0900', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse15() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2896)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse16() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse17() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse18() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse19() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse20() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse21() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "!\u0000\u0000!";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        String negativePrefix = "";
        originalNumberFormat.setNegativePrefix(negativePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2908)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:295) */
        stdDateFormat.parse(positivePrefix);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    @Test(expected = ParseException.class)
    public void testParse22() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "!\u0000\u80002";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse23() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001!\u0000\u0000!\u0001\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse24() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u00011\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse25() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse26() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse27() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse28() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse29() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001\u0001!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse30() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001!\u00000";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse31() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!2";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse32() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u00002";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse33() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001B\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse34() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001:";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse35() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000:";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse36() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000:";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse37() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u6400', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!\u0000\u0000!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse38() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u6400', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        stdDateFormat.parse(string);
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (i < 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: dateStr.charAt(0) == '-' || NumberInput.inLongRange(dateStr, false)
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException1() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:340) */
        stdDateFormat.parse(string, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseThrowsSIOOBEWithBlankString() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        double[] doubleArray = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        java.lang.String[] stringArray = {"10", "-3", "\n\t\r", "10"};
        ChoiceFormat choiceFormat = new ChoiceFormat(doubleArray, stringArray);
        choiceFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        choiceFormat.setMinimumIntegerDigits(45);
        choiceFormat.setMaximumFractionDigits(0);
        choiceFormat.setMaximumIntegerDigits(58);
        stdDateFormat.setNumberFormat(choiceFormat);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(-1, Integer.MAX_VALUE, 0, 46, -1);
        gregorianCalendar.setFirstDayOfWeek(57);
        gregorianCalendar.setMinimalDaysInFirstWeek(0);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(45);
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483648]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1908)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse("\n\t\r", parsePosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse39() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:2";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse40() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "0";
        
        Date actual = stdDateFormat.parse(string, null);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse41() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-2";
        
        Date actual = stdDateFormat.parse(string, null);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse42() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse43() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00004";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse44() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse45() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u0000\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse46() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u6400', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse47() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:701)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:341) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse48() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1485)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse49() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse50() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:158)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:41)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse51() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse52() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":2";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:158)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:41)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse53() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "  /0";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse54() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u000042";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse55() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:158)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:41)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse56() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse57() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:158)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:41)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse58() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse59() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatRFC1123 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:158)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:41)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse60() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse61() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/   :";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:548)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:524)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse62() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse63() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse64() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u00002";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse65() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse66() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse67() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse68() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "  <0";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse69() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/   /";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse70() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = new char[11];
        compiledPattern[0] = '\u65FF';
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse71() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse72() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":2";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse73() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse74() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse75() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "\u0000\u0000";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(posPrefixPattern, null);
    }
    
    @Test
    public void testParse76() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = ":";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(posPrefixPattern, null);
    }
    
    @Test
    public void testParse77() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "\u0000";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(posPrefixPattern, null);
    }
    
    @Test
    public void testParse78() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse79() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse80() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse81() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "/";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(positivePrefix, null);
    }
    
    @Test
    public void testParse82() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        String positiveSuffix = "";
        originalNumberFormat.setPositiveSuffix(positiveSuffix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(positivePrefix, parsePosition);
    }
    
    @Test
    public void testParse83() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000B";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        String negativePrefix = "";
        originalNumberFormat.setNegativePrefix(negativePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2908)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:345) */
        stdDateFormat.parse(positivePrefix, parsePosition);
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withLocale(java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLocale_Return_1() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale);
        
        TimeZone actual_timezone = actual._timezone;
        assertNull(actual_timezone);
        
        Locale stdDateFormat_locale = stdDateFormat._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(stdDateFormat_locale, actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, loc, _lenient);}
 *  */
    @Test
    public void testWithLocale_Return() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        StdDateFormat actual = stdDateFormat.withLocale(locale);
        
        StdDateFormat expected = new StdDateFormat(null, locale, null);
        
        TimeZone actual_timezone = actual._timezone;
        assertNull(actual_timezone);
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, loc, _lenient);}
 *  */
    @Test
    public void testWithLocale_Return_2() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        String script = "";
        setField(baseLocale, "sun.util.locale.BaseLocale", "script", script);
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", script);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, locale, null);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale1 = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale1, "sun.util.locale.BaseLocale", "script", script);
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale1);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = "\u0000";
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale1);
        
        StdDateFormat expected = new StdDateFormat(simpleTimeZone, locale1, null);
        
        TimeZone expected_timezone = expected._timezone;
        TimeZone actual_timezone = actual._timezone;
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLocale_Return_3() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = "";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale1 = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale1);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale1);
        
        Locale stdDateFormat_locale = stdDateFormat._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(stdDateFormat_locale, actual_locale);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLocale_Return_4() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = "";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale1 = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale1);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id1 = "";
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id1);
        setField(locale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale1);
        
        Locale stdDateFormat_locale = stdDateFormat._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(stdDateFormat_locale, actual_locale);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withLocale(java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: loc.equals(_locale)
 *  */
    @Test
    public void testWithLocale_ThrowNullPointerException() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.withLocale] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.withLocale(StdDateFormat.java:169) */
        stdDateFormat.withLocale(null);
    }
    ///endregion
    
    ///region Errors report for withLocale
    
    public void testWithLocale_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.setTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTimeZone(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null);
        
        stdDateFormat.setTimeZone(simpleTimeZone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_1() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        TimeZone initialStdDateFormat_timezone = stdDateFormat._timezone;
        
        stdDateFormat.setTimeZone(simpleTimeZone);
        
        TimeZone finalStdDateFormat_timezone = stdDateFormat._timezone;
        
        assertFalse(initialStdDateFormat_timezone == finalStdDateFormat_timezone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_2() {
        ZoneInfo zoneInfo = new ZoneInfo();
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null);
        
        stdDateFormat.setTimeZone(zoneInfo);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_3() throws Exception  {
        ZoneInfo zoneInfo = new ZoneInfo();
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        String id = "";
        zoneInfo1.setID(id);
        
        TimeZone initialStdDateFormat_timezone = stdDateFormat._timezone;
        
        stdDateFormat.setTimeZone(zoneInfo1);
        
        TimeZone finalStdDateFormat_timezone = stdDateFormat._timezone;
        
        assertFalse(initialStdDateFormat_timezone == finalStdDateFormat_timezone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_4() throws Exception  {
        ZoneInfo zoneInfo = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo.setRawOffset(1);
        String id = "";
        zoneInfo.setID(id);
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo1.setRawOffset(1);
        zoneInfo1.setID(id);
        
        stdDateFormat.setTimeZone(zoneInfo1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTimeZone(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !tz.equals(_timezone)
 *  */
    @Test
    public void testSetTimeZone_ThrowNullPointerException() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.setTimeZone] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.setTimeZone(StdDateFormat.java:239) */
        stdDateFormat.setTimeZone(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getTimeZone()}
 * @utbot.returnsFrom {@code return _timezone;}
 *  */
    @Test
    public void testGetTimeZone_Return_timezone() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        TimeZone actual = stdDateFormat.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isLenient()}
 * @utbot.executesCondition {@code (_lenient == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsLenient__lenientEqualsNull() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        boolean actual = stdDateFormat.isLenient();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isLenient()}
 * @utbot.executesCondition {@code (_lenient == null): False}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return _lenient.booleanValue();}
 *  */
    @Test
    public void testIsLenient__lenientNotEqualsNull() {
        Boolean boolean1 = false;
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, boolean1);
        
        boolean actual = stdDateFormat.isLenient();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDefaultTimeZone()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getDefaultTimeZone()}
     */
    @Test
    public void testGetDefaultTimeZone() {
        ZoneInfo actual = ((ZoneInfo) StdDateFormat.getDefaultTimeZone());
        
        ZoneInfo expected = new ZoneInfo();
        
        // sun.util.calendar.ZoneInfo has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getDefaultTimeZone
    
    public void testGetDefaultTimeZone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTimeZone(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(tz, _locale, _lenient);}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_2() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        ZoneInfo zoneInfo = new ZoneInfo();
        
        StdDateFormat actual = stdDateFormat.withTimeZone(zoneInfo);
        
        StdDateFormat expected = new StdDateFormat(zoneInfo, null, null);
        
        TimeZone expected_timezone = expected._timezone;
        TimeZone actual_timezone = actual._timezone;
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(tz, _locale, _lenient);}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_3() throws Exception  {
        ZoneInfo zoneInfo = new ZoneInfo();
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        String id = "";
        zoneInfo1.setID(id);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(zoneInfo1);
        
        StdDateFormat expected = new StdDateFormat(zoneInfo1, null, null);
        
        TimeZone expected_timezone = expected._timezone;
        TimeZone actual_timezone = actual._timezone;
        String expected_timezoneID = expected_timezone.getID();
        String actual_timezoneID = actual_timezone.getID();
        assertEquals(expected_timezoneID, actual_timezoneID);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_4() throws Exception  {
        ZoneInfo zoneInfo = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo.setRawOffset(1);
        String id = "";
        zoneInfo.setID(id);
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo1.setRawOffset(1);
        zoneInfo1.setID(id);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(zoneInfo1);
        
        TimeZone stdDateFormat_timezone = stdDateFormat._timezone;
        TimeZone actual_timezone = actual._timezone;
        int stdDateFormat_timezoneRawOffset = (((ZoneInfo) stdDateFormat_timezone)).getRawOffset();
        int actual_timezoneRawOffset = (((ZoneInfo) actual_timezone)).getRawOffset();
        assertEquals(stdDateFormat_timezoneRawOffset, actual_timezoneRawOffset);
        
        int stdDateFormat_timezoneRawOffsetDiff = ((Integer) getFieldValue(stdDateFormat_timezone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff"));
        int actual_timezoneRawOffsetDiff = ((Integer) getFieldValue(actual_timezone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff"));
        assertEquals(stdDateFormat_timezoneRawOffsetDiff, actual_timezoneRawOffsetDiff);
        
        int stdDateFormat_timezoneChecksum = ((Integer) getFieldValue(stdDateFormat_timezone, "sun.util.calendar.ZoneInfo", "checksum"));
        int actual_timezoneChecksum = ((Integer) getFieldValue(actual_timezone, "sun.util.calendar.ZoneInfo", "checksum"));
        assertEquals(stdDateFormat_timezoneChecksum, actual_timezoneChecksum);
        
        String stdDateFormat_timezoneID = stdDateFormat_timezone.getID();
        String actual_timezoneID = actual_timezone.getID();
        assertEquals(stdDateFormat_timezoneID, actual_timezoneID);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTimeZone_TzEquals_timezone() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone);
        
        TimeZone stdDateFormat_timezone = stdDateFormat._timezone;
        TimeZone actual_timezone = actual._timezone;
        int stdDateFormat_timezoneStartMonth = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startMonth"));
        int actual_timezoneStartMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMonth"));
        assertEquals(stdDateFormat_timezoneStartMonth, actual_timezoneStartMonth);
        
        int stdDateFormat_timezoneStartDay = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startDay"));
        int actual_timezoneStartDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDay"));
        assertEquals(stdDateFormat_timezoneStartDay, actual_timezoneStartDay);
        
        int stdDateFormat_timezoneStartDayOfWeek = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        int actual_timezoneStartDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        assertEquals(stdDateFormat_timezoneStartDayOfWeek, actual_timezoneStartDayOfWeek);
        
        int stdDateFormat_timezoneStartTime = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startTime"));
        int actual_timezoneStartTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTime"));
        assertEquals(stdDateFormat_timezoneStartTime, actual_timezoneStartTime);
        
        int stdDateFormat_timezoneStartTimeMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        int actual_timezoneStartTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        assertEquals(stdDateFormat_timezoneStartTimeMode, actual_timezoneStartTimeMode);
        
        int stdDateFormat_timezoneEndMonth = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endMonth"));
        int actual_timezoneEndMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMonth"));
        assertEquals(stdDateFormat_timezoneEndMonth, actual_timezoneEndMonth);
        
        int stdDateFormat_timezoneEndDay = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endDay"));
        int actual_timezoneEndDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDay"));
        assertEquals(stdDateFormat_timezoneEndDay, actual_timezoneEndDay);
        
        int stdDateFormat_timezoneEndDayOfWeek = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        int actual_timezoneEndDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        assertEquals(stdDateFormat_timezoneEndDayOfWeek, actual_timezoneEndDayOfWeek);
        
        int stdDateFormat_timezoneEndTime = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endTime"));
        int actual_timezoneEndTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTime"));
        assertEquals(stdDateFormat_timezoneEndTime, actual_timezoneEndTime);
        
        int stdDateFormat_timezoneEndTimeMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        int actual_timezoneEndTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        assertEquals(stdDateFormat_timezoneEndTimeMode, actual_timezoneEndTimeMode);
        
        int stdDateFormat_timezoneStartYear = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startYear"));
        int actual_timezoneStartYear = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startYear"));
        assertEquals(stdDateFormat_timezoneStartYear, actual_timezoneStartYear);
        
        int stdDateFormat_timezoneRawOffset = (((SimpleTimeZone) stdDateFormat_timezone)).getRawOffset();
        int actual_timezoneRawOffset = (((SimpleTimeZone) actual_timezone)).getRawOffset();
        assertEquals(stdDateFormat_timezoneRawOffset, actual_timezoneRawOffset);
        
        boolean actual_timezoneUseDaylight = ((Boolean) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actual_timezoneUseDaylight);
        
        byte[] actual_timezoneMonthLength = ((byte[]) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "monthLength"));
        assertNull(actual_timezoneMonthLength);
        
        int stdDateFormat_timezoneStartMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startMode"));
        int actual_timezoneStartMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMode"));
        assertEquals(stdDateFormat_timezoneStartMode, actual_timezoneStartMode);
        
        int stdDateFormat_timezoneEndMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endMode"));
        int actual_timezoneEndMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMode"));
        assertEquals(stdDateFormat_timezoneEndMode, actual_timezoneEndMode);
        
        int stdDateFormat_timezoneDstSavings = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        int actual_timezoneDstSavings = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        assertEquals(stdDateFormat_timezoneDstSavings, actual_timezoneDstSavings);
        
        Object actual_timezoneCache = getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "cache");
        assertNull(actual_timezoneCache);
        
        int stdDateFormat_timezoneSerialVersionOnStream = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        int actual_timezoneSerialVersionOnStream = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        assertEquals(stdDateFormat_timezoneSerialVersionOnStream, actual_timezoneSerialVersionOnStream);
        
        String actual_timezoneID = actual_timezone.getID();
        assertNull(actual_timezoneID);
        
        ZoneId actual_timezoneZoneId = ((ZoneId) getFieldValue(actual_timezone, "java.util.TimeZone", "zoneId"));
        assertNull(actual_timezoneZoneId);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(tz, _locale, _lenient);}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone);
        
        StdDateFormat expected = new StdDateFormat(simpleTimeZone, null, null);
        
        TimeZone expected_timezone = expected._timezone;
        TimeZone actual_timezone = actual._timezone;
        int expected_timezoneStartMonth = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startMonth"));
        int actual_timezoneStartMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMonth"));
        assertEquals(expected_timezoneStartMonth, actual_timezoneStartMonth);
        
        int expected_timezoneStartDay = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startDay"));
        int actual_timezoneStartDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDay"));
        assertEquals(expected_timezoneStartDay, actual_timezoneStartDay);
        
        int expected_timezoneStartDayOfWeek = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        int actual_timezoneStartDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        assertEquals(expected_timezoneStartDayOfWeek, actual_timezoneStartDayOfWeek);
        
        int expected_timezoneStartTime = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startTime"));
        int actual_timezoneStartTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTime"));
        assertEquals(expected_timezoneStartTime, actual_timezoneStartTime);
        
        int expected_timezoneStartTimeMode = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        int actual_timezoneStartTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        assertEquals(expected_timezoneStartTimeMode, actual_timezoneStartTimeMode);
        
        int expected_timezoneEndMonth = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endMonth"));
        int actual_timezoneEndMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMonth"));
        assertEquals(expected_timezoneEndMonth, actual_timezoneEndMonth);
        
        int expected_timezoneEndDay = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endDay"));
        int actual_timezoneEndDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDay"));
        assertEquals(expected_timezoneEndDay, actual_timezoneEndDay);
        
        int expected_timezoneEndDayOfWeek = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        int actual_timezoneEndDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        assertEquals(expected_timezoneEndDayOfWeek, actual_timezoneEndDayOfWeek);
        
        int expected_timezoneEndTime = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endTime"));
        int actual_timezoneEndTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTime"));
        assertEquals(expected_timezoneEndTime, actual_timezoneEndTime);
        
        int expected_timezoneEndTimeMode = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        int actual_timezoneEndTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        assertEquals(expected_timezoneEndTimeMode, actual_timezoneEndTimeMode);
        
        int expected_timezoneStartYear = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startYear"));
        int actual_timezoneStartYear = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startYear"));
        assertEquals(expected_timezoneStartYear, actual_timezoneStartYear);
        
        int expected_timezoneRawOffset = (((SimpleTimeZone) expected_timezone)).getRawOffset();
        int actual_timezoneRawOffset = (((SimpleTimeZone) actual_timezone)).getRawOffset();
        assertEquals(expected_timezoneRawOffset, actual_timezoneRawOffset);
        
        boolean actual_timezoneUseDaylight = ((Boolean) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actual_timezoneUseDaylight);
        
        byte[] actual_timezoneMonthLength = ((byte[]) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "monthLength"));
        assertNull(actual_timezoneMonthLength);
        
        int expected_timezoneStartMode = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "startMode"));
        int actual_timezoneStartMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMode"));
        assertEquals(expected_timezoneStartMode, actual_timezoneStartMode);
        
        int expected_timezoneEndMode = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "endMode"));
        int actual_timezoneEndMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMode"));
        assertEquals(expected_timezoneEndMode, actual_timezoneEndMode);
        
        int expected_timezoneDstSavings = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        int actual_timezoneDstSavings = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        assertEquals(expected_timezoneDstSavings, actual_timezoneDstSavings);
        
        Object actual_timezoneCache = getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "cache");
        assertNull(actual_timezoneCache);
        
        int expected_timezoneSerialVersionOnStream = ((Integer) getFieldValue(expected_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        int actual_timezoneSerialVersionOnStream = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        assertEquals(expected_timezoneSerialVersionOnStream, actual_timezoneSerialVersionOnStream);
        
        String actual_timezoneID = actual_timezone.getID();
        assertNull(actual_timezoneID);
        
        ZoneId actual_timezoneZoneId = ((ZoneId) getFieldValue(actual_timezone, "java.util.TimeZone", "zoneId"));
        assertNull(actual_timezoneZoneId);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_1() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        simpleTimeZone.setID(id);
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null);
        SimpleTimeZone simpleTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        simpleTimeZone1.setID(id);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone1);
        
        TimeZone stdDateFormat_timezone = stdDateFormat._timezone;
        TimeZone actual_timezone = actual._timezone;
        int stdDateFormat_timezoneStartMonth = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startMonth"));
        int actual_timezoneStartMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMonth"));
        assertEquals(stdDateFormat_timezoneStartMonth, actual_timezoneStartMonth);
        
        int stdDateFormat_timezoneStartDay = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startDay"));
        int actual_timezoneStartDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDay"));
        assertEquals(stdDateFormat_timezoneStartDay, actual_timezoneStartDay);
        
        int stdDateFormat_timezoneStartDayOfWeek = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        int actual_timezoneStartDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        assertEquals(stdDateFormat_timezoneStartDayOfWeek, actual_timezoneStartDayOfWeek);
        
        int stdDateFormat_timezoneStartTime = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startTime"));
        int actual_timezoneStartTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTime"));
        assertEquals(stdDateFormat_timezoneStartTime, actual_timezoneStartTime);
        
        int stdDateFormat_timezoneStartTimeMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        int actual_timezoneStartTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startTimeMode"));
        assertEquals(stdDateFormat_timezoneStartTimeMode, actual_timezoneStartTimeMode);
        
        int stdDateFormat_timezoneEndMonth = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endMonth"));
        int actual_timezoneEndMonth = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMonth"));
        assertEquals(stdDateFormat_timezoneEndMonth, actual_timezoneEndMonth);
        
        int stdDateFormat_timezoneEndDay = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endDay"));
        int actual_timezoneEndDay = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDay"));
        assertEquals(stdDateFormat_timezoneEndDay, actual_timezoneEndDay);
        
        int stdDateFormat_timezoneEndDayOfWeek = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        int actual_timezoneEndDayOfWeek = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        assertEquals(stdDateFormat_timezoneEndDayOfWeek, actual_timezoneEndDayOfWeek);
        
        int stdDateFormat_timezoneEndTime = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endTime"));
        int actual_timezoneEndTime = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTime"));
        assertEquals(stdDateFormat_timezoneEndTime, actual_timezoneEndTime);
        
        int stdDateFormat_timezoneEndTimeMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        int actual_timezoneEndTimeMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endTimeMode"));
        assertEquals(stdDateFormat_timezoneEndTimeMode, actual_timezoneEndTimeMode);
        
        int stdDateFormat_timezoneStartYear = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startYear"));
        int actual_timezoneStartYear = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startYear"));
        assertEquals(stdDateFormat_timezoneStartYear, actual_timezoneStartYear);
        
        int stdDateFormat_timezoneRawOffset = (((SimpleTimeZone) stdDateFormat_timezone)).getRawOffset();
        int actual_timezoneRawOffset = (((SimpleTimeZone) actual_timezone)).getRawOffset();
        assertEquals(stdDateFormat_timezoneRawOffset, actual_timezoneRawOffset);
        
        boolean actual_timezoneUseDaylight = ((Boolean) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actual_timezoneUseDaylight);
        
        byte[] actual_timezoneMonthLength = ((byte[]) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "monthLength"));
        assertNull(actual_timezoneMonthLength);
        
        int stdDateFormat_timezoneStartMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "startMode"));
        int actual_timezoneStartMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "startMode"));
        assertEquals(stdDateFormat_timezoneStartMode, actual_timezoneStartMode);
        
        int stdDateFormat_timezoneEndMode = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "endMode"));
        int actual_timezoneEndMode = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "endMode"));
        assertEquals(stdDateFormat_timezoneEndMode, actual_timezoneEndMode);
        
        int stdDateFormat_timezoneDstSavings = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        int actual_timezoneDstSavings = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "dstSavings"));
        assertEquals(stdDateFormat_timezoneDstSavings, actual_timezoneDstSavings);
        
        Object actual_timezoneCache = getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "cache");
        assertNull(actual_timezoneCache);
        
        int stdDateFormat_timezoneSerialVersionOnStream = ((Integer) getFieldValue(stdDateFormat_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        int actual_timezoneSerialVersionOnStream = ((Integer) getFieldValue(actual_timezone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        assertEquals(stdDateFormat_timezoneSerialVersionOnStream, actual_timezoneSerialVersionOnStream);
        
        String stdDateFormat_timezoneID = stdDateFormat_timezone.getID();
        String actual_timezoneID = actual_timezone.getID();
        assertEquals(stdDateFormat_timezoneID, actual_timezoneID);
        
        ZoneId actual_timezoneZoneId = ((ZoneId) getFieldValue(actual_timezone, "java.util.TimeZone", "zoneId"));
        assertNull(actual_timezoneZoneId);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withTimeZone(java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
     */
    @Test
    public void testWithTimeZone() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        double[] doubleArray = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        java.lang.String[] stringArray = {"10", "-3", "\n\t\r", "10"};
        ChoiceFormat choiceFormat = new ChoiceFormat(doubleArray, stringArray);
        choiceFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        choiceFormat.setMinimumIntegerDigits(-1);
        choiceFormat.setMaximumFractionDigits(-1);
        choiceFormat.setMaximumIntegerDigits(0);
        stdDateFormat.setNumberFormat(choiceFormat);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Integer.MIN_VALUE, -1, -1, 0, Integer.MAX_VALUE);
        gregorianCalendar.setFirstDayOfWeek(-4194305);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MIN_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(null);
        
        ZoneInfo zoneInfo = new ZoneInfo();
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        StdDateFormat expected = new StdDateFormat(zoneInfo, locale, null);
        
        TimeZone expected_timezone = expected._timezone;
        TimeZone actual_timezone = actual._timezone;
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        Boolean actual_lenient = actual._lenient;
        assertNull(actual_lenient);
        
        DateFormat actual_formatRFC1123 = actual._formatRFC1123;
        assertNull(actual_formatRFC1123);
        
        DateFormat actual_formatISO8601 = actual._formatISO8601;
        assertNull(actual_formatISO8601);
        
        DateFormat actual_formatISO8601_z = actual._formatISO8601_z;
        assertNull(actual_formatISO8601_z);
        
        DateFormat actual_formatPlain = actual._formatPlain;
        assertNull(actual_formatPlain);
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    ///endregion
    
    ///region Errors report for withTimeZone
    
    public void testWithTimeZone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseAsRFC1123(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (_formatRFC1123 == null): False}
 * @utbot.invokes {@link java.text.DateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return _formatRFC1123.parse(dateStr, pos);}
 *  */
    @Test
    public void testParseAsRFC1123__formatRFC1123NotEqualsNull() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6501'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Date actual = stdDateFormat.parseAsRFC1123(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAsRFC1123(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1485)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "hasFollowingMinusSign", true);
        char[] compiledPattern = {'\u0000', '\u6500'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1537)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1490)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u8000', '\u0E00'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 23]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1899)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6501'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1500)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {0};
        setField(calendar, "java.util.Calendar", "fields", fields);
        boolean[] isSet = {};
        setField(calendar, "java.util.Calendar", "isSet", isSet);
        setField(calendar, "java.util.Calendar", "stamp", fields);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatRFC1123, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.clear(Calendar.java:2008)
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6500'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {0};
        setField(calendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(calendar, "java.util.Calendar", "stamp", stamp);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatRFC1123, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.clear(Calendar.java:2007)
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseAsRFC1123(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseAsRFC1123ThrowsSIOOBEWithNonEmptyString() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        double[] doubleArray = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        java.lang.String[] stringArray = {"#$\\\"'", "-3", "#$\\\"'", "XZ"};
        ChoiceFormat choiceFormat = new ChoiceFormat(doubleArray, stringArray);
        choiceFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        choiceFormat.setMinimumIntegerDigits(-1);
        choiceFormat.setMaximumFractionDigits(-1);
        choiceFormat.setMaximumIntegerDigits(0);
        stdDateFormat.setNumberFormat(choiceFormat);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Integer.MIN_VALUE, -1, -1, 0, Integer.MAX_VALUE);
        gregorianCalendar.setFirstDayOfWeek(-1);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MIN_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(Integer.MAX_VALUE);
        parsePosition.setErrorIndex(Integer.MAX_VALUE);
        parsePosition.setIndex(Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483648]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1908)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:527) */
        stdDateFormat.parseAsRFC1123("#$\\\"'", parsePosition);
    }
    ///endregion
    
    ///region Errors report for parseAsRFC1123
    
    public void testParseAsRFC1123_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parseAsISO8601(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.text.ParseException} in: pos.getErrorIndex()
 *  */
    @Test(expected = ParseException.class)
    public void testParseAsISO8601_ThrowParseException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "2";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        parsePosition.setErrorIndex(-255);
        
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (c == 'Z'): True}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.text.ParseException} in: pos.getErrorIndex()
 *  */
    @Test(expected = ParseException.class)
    public void testParseAsISO8601_ThrowParseException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601_z = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(_formatISO8601_z, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601_z", _formatISO8601_z);
        String string = "         Z";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (c == 'Z'): True}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.text.ParseException} in: pos.getErrorIndex()
 *  */
    @Test(expected = ParseException.class)
    public void testParseAsISO8601_ThrowParseException_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatISO8601_z = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(_formatISO8601_z, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601_z", _formatISO8601_z);
        String string = "          Z";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(11);
        
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAsISO8601(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = dateStr.charAt(len - 1);
 *  */
    @Test
    public void testParseAsISO8601_ThrowStringIndexOutOfBoundsException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:416) */
        stdDateFormat.parseAsISO8601(string, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (c == 'Z'): True}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: dateStr.charAt(len - 4) == ':'
 *  */
    @Test
    public void testParseAsISO8601_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ISO8601DateFormat _formatISO8601_z = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatISO8601_z", _formatISO8601_z);
        String string = " Z";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:436) */
        stdDateFormat.parseAsISO8601(string, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Date dt = df.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Date dt = df.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1485)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Date dt = df.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_formatPlain, "java.text.SimpleDateFormat", "hasFollowingMinusSign", true);
        char[] compiledPattern = {'\u0000', '\u6500'};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1537)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Date dt = df.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u80FF', '\u0000', '\u0000'};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 23]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1899)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(calendar, "java.util.Calendar", "fields", fields);
        setField(calendar, "java.util.Calendar", "stamp", fields);
        calendar.setLenient(true);
        _formatPlain.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.selectFields(Calendar.java:2447)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {0};
        setField(calendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(calendar, "java.util.Calendar", "stamp", stamp);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatPlain, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.clear(Calendar.java:2007)
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {0};
        setField(calendar, "java.util.Calendar", "fields", fields);
        boolean[] isSet = {};
        setField(calendar, "java.util.Calendar", "isSet", isSet);
        setField(calendar, "java.util.Calendar", "stamp", fields);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(_formatPlain, setCalendarMethodArguments);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = " 0";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.clear(Calendar.java:2008)
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.executesCondition {@code (df == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseAsISO8601_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatPlain = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatPlain, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(calendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {1};
        setField(calendar, "java.util.Calendar", "stamp", stamp);
        calendar.setLenient(true);
        _formatPlain.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatPlain", _formatPlain);
        String string = "4";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1]
            java.base/java.util.Calendar.selectFields(Calendar.java:2462)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:510) */
        stdDateFormat.parseAsISO8601(string, parsePosition, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = dateStr.length();
 *  */
    @Test
    public void testParseAsISO8601_ThrowNullPointerException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601(StdDateFormat.java:415) */
        stdDateFormat.parseAsISO8601(null, null, false);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parseAsISO8601(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition,boolean)}
     */
    @Test(expected = ParseException.class)
    public void testParseAsISO8601ThrowsPEWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        double[] doubleArray = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        java.lang.String[] stringArray = {"", "10", "", "00"};
        ChoiceFormat choiceFormat = new ChoiceFormat(doubleArray, stringArray);
        choiceFormat.setMinimumFractionDigits(10);
        choiceFormat.setMinimumIntegerDigits(-1);
        choiceFormat.setMaximumFractionDigits(0);
        choiceFormat.setMaximumIntegerDigits(10);
        stdDateFormat.setNumberFormat(choiceFormat);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(91, 5, 45, 11, -1);
        gregorianCalendar.setFirstDayOfWeek(43);
        gregorianCalendar.setMinimalDaysInFirstWeek(10);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(45);
        parsePosition.setErrorIndex(9);
        parsePosition.setIndex(5);
        
        stdDateFormat.parseAsISO8601("10", parsePosition, false);
    }
    ///endregion
    
    ///region Errors report for parseAsISO8601
    
    public void testParseAsISO8601_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.hasTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasTimeZone(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.executesCondition {@code (len >= 6): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTimeZone_LenLessThan6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.executesCondition {@code (len >= 6): True}
 * @utbot.executesCondition {@code (c == '+'): True}
 *  */
    @Test
    public void testHasTimeZone_CEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "+     ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.executesCondition {@code (len >= 6): True}
 * @utbot.executesCondition {@code (c == '+'): False}
 * @utbot.executesCondition {@code (c == '-'): True}
 *  */
    @Test
    public void testHasTimeZone_CEqualsChar_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "-     ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.executesCondition {@code (len >= 6): True}
 * @utbot.executesCondition {@code (c == '+'): False}
 * @utbot.executesCondition {@code (c == '-'): False}
 *  */
    @Test
    public void testHasTimeZone_CEqualsCharOrCEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "@+    ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.executesCondition {@code (len >= 6): True}
 * @utbot.executesCondition {@code (c == '+'): False}
 * @utbot.executesCondition {@code (c == '-'): False}
 *  */
    @Test
    public void testHasTimeZone_CEqualsCharOrCEqualsChar_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "@-    ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasTimeZone(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (len >= 6): True}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code (c == '+'): False},
    ///     {@code (c == '-'): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 *  */
    @Test
    public void testHasTimeZone_CEqualsCharOrCEqualsChar_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "   -  ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 *  */
    @Test
    public void testHasTimeZone_CEqualsCharOrCEqualsChar_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "   +  ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTimeZone_CNotEqualsCharOrCNotEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "      ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = string;
        boolean actual = ((Boolean) hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasTimeZone(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hasTimeZone(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = str.length();
 *  */
    @Test
    public void testHasTimeZone_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.hasTimeZone] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.hasTimeZone(StdDateFormat.java:533) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Method hasTimeZoneMethod = stdDateFormatClazz.getDeclaredMethod("hasTimeZone", stringType);
        hasTimeZoneMethod.setAccessible(true);
        java.lang.Object[] hasTimeZoneMethodArguments = new java.lang.Object[1];
        hasTimeZoneMethodArguments[0] = ((Object) null);
        try {
            hasTimeZoneMethod.invoke(null, hasTimeZoneMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getISO8601Format(java.util.TimeZone, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getISO8601Format(java.util.TimeZone,java.util.Locale)}
     */
    @Test
    public void testGetISO8601Format() throws Exception  {
        Locale locale = new Locale("10", "\n\t\r", "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        
        SimpleDateFormat actual = ((SimpleDateFormat) StdDateFormat.getISO8601Format(null, locale));
        
        SimpleDateFormat expected = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getISO8601Format
    
    public void testGetISO8601Format_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getISO8601Format(java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getISO8601Format(java.util.TimeZone)}
     */
    @Test
    public void testGetISO8601Format1() throws Exception  {
        SimpleDateFormat actual = ((SimpleDateFormat) StdDateFormat.getISO8601Format(null));
        
        SimpleDateFormat expected = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getISO8601Format
    
    public void testGetISO8601Format_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _cloneFormat(java.text.DateFormat, java.lang.String, java.util.TimeZone, java.util.Locale, java.lang.Boolean)
    
    @Test
    public void test_cloneFormatByFuzzer() throws Exception  {
        Locale locale = new Locale("-3", "XZ");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class dateFormatType = Class.forName("java.text.DateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class timeZoneType = Class.forName("java.util.TimeZone");
        Class localeType = Class.forName("java.util.Locale");
        Class booleanType = Class.forName("java.lang.Boolean");
        Method _cloneFormatMethod = stdDateFormatClazz.getDeclaredMethod("_cloneFormat", dateFormatType, stringType, timeZoneType, localeType, booleanType);
        _cloneFormatMethod.setAccessible(true);
        java.lang.Object[] _cloneFormatMethodArguments = new java.lang.Object[5];
        _cloneFormatMethodArguments[0] = ((Object) null);
        _cloneFormatMethodArguments[1] = "10";
        _cloneFormatMethodArguments[2] = ((Object) null);
        _cloneFormatMethodArguments[3] = locale;
        _cloneFormatMethodArguments[4] = ((Object) null);
        SimpleDateFormat actual = ((SimpleDateFormat) _cloneFormatMethod.invoke(null, _cloneFormatMethodArguments));
        
        SimpleDateFormat expected = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for _cloneFormat
    
    public void test_cloneFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._clearFormats
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _clearFormats()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_clearFormats()}
 *  */
    @Test
    public void test_clearFormats() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null);
        
        stdDateFormat._clearFormats();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRFC1123Format(java.util.TimeZone, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getRFC1123Format(java.util.TimeZone,java.util.Locale)}
     */
    @Test
    public void testGetRFC1123Format() throws Exception  {
        Locale locale = new Locale("10", "\n\t\r", "EEE, dd MMM yyyy HH:mm:ss zzz");
        
        SimpleDateFormat actual = ((SimpleDateFormat) StdDateFormat.getRFC1123Format(null, locale));
        
        SimpleDateFormat expected = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getRFC1123Format
    
    public void testGetRFC1123Format_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRFC1123Format(java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#getRFC1123Format(java.util.TimeZone)}
     */
    @Test
    public void testGetRFC1123Format1() throws Exception  {
        SimpleDateFormat actual = ((SimpleDateFormat) StdDateFormat.getRFC1123Format(null));
        
        SimpleDateFormat expected = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getRFC1123Format
    
    public void testGetRFC1123Format_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method looksLikeISO8601(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 5): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_DateStrLengthLessThan5() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 5): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_NotCharacterIsDigit() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "/    ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 5): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_NotCharacterIsDigit_1() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  / ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 5): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): True}
 * @utbot.executesCondition {@code (dateStr.charAt(4) == '-'): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_DateStrCharAtNotEqualsChar() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  2 ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 5): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): True}
 * @utbot.executesCondition {@code (dateStr.charAt(4) == '-'): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testLooksLikeISO8601_DateStrCharAtEqualsChar() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  2-";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method looksLikeISO8601(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dateStr.length() >= 5 && Character.isDigit(dateStr.charAt(0)) && Character.isDigit(dateStr.charAt(3)) && dateStr.charAt(4) == '-'
 *  */
    @Test
    public void testLooksLikeISO8601_ThrowNullPointerException() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601(StdDateFormat.java:394) */
        stdDateFormat.looksLikeISO8601(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1072006679837800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1072006679837800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1072006679855100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072006679837800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072006679855100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072006680272599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072006680272599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072006680279000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072006680272599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072006680279000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

