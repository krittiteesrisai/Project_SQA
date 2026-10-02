package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import java.util.SimpleTimeZone;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.FieldPosition;
import java.util.Locale;
import sun.util.calendar.LocalGregorianCalendar;
import sun.util.calendar.ZoneInfo;
import java.text.DecimalFormatSymbols;
import java.text.CompactNumberFormat;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.text.ChoiceFormat;
import java.text.ParsePosition;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.util.TimeZone;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import sun.util.BuddhistCalendar;
import java.util.Calendar;
import sun.util.calendar.BaseCalendar;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_util_StdDateFormatTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (o == this);}
 *  */
    @Test
    public void testEquals_ONotEquals() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        boolean actual = stdDateFormat.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (o == this);}
 *  */
    @Test
    public void testEquals_OEquals() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        boolean actual = stdDateFormat.equals(stdDateFormat);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        String actual = stdDateFormat.toString();
        
        String expected = "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: null, lenient: null)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#hashCode()}
 * @utbot.invokes {@link java.lang.System#identityHashCode(java.lang.Object)}
 * @utbot.returnsFrom {@code return System.identityHashCode(this);}
 *  */
    @Test
    public void testHashCode_SystemIdentityHashCode() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        int actual = stdDateFormat.hashCode();
        
        assertEquals(16028041, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#clone()}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, _locale, _lenient, _tzSerializedWithColon);}
 *  */
    @Test
    public void testClone_Return() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        StdDateFormat actual = stdDateFormat.clone();
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (tz == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _format(tz, _locale, date, toAppendTo);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleTimeZone _timezone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(_calendar, "java.util.Calendar", "zone", _timezone);
        setField(_calendar, "java.util.Calendar", "sharedZone", true);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.getTimeZone(GregorianCalendar.java:1983)
            com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar(StdDateFormat.java:770)
            com.fasterxml.jackson.databind.util.StdDateFormat._format(StdDateFormat.java:435)
            com.fasterxml.jackson.databind.util.StdDateFormat.format(StdDateFormat.java:428) */
        stdDateFormat.format(((Date) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _format(tz, _locale, date, toAppendTo);
 *  */
    @Test(expected = NullPointerException.class)
    public void testFormat_ThrowNullPointerException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleTimeZone _timezone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", _locale);
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(jdate, "sun.util.calendar.CalendarDate", "zoneinfo", _timezone);
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        setField(_calendar, "java.util.Calendar", "zone", _timezone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat.format(((Date) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _format(tz, _locale, date, toAppendTo);
 *  */
    @Test(expected = NullPointerException.class)
    public void testFormat_ThrowNullPointerException_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleTimeZone _timezone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", _locale);
        Boolean _lenient = false;
        stdDateFormat._lenient = _lenient;
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(jdate, "sun.util.calendar.CalendarDate", "zoneinfo", _timezone);
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        setField(_calendar, "java.util.Calendar", "zone", _timezone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat.format(((Date) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _format(tz, _locale, date, toAppendTo);
 *  */
    @Test(expected = NullPointerException.class)
    public void testFormat_ThrowNullPointerException_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ZoneInfo _timezone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", _locale);
        Boolean _lenient = true;
        stdDateFormat._lenient = _lenient;
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        SimpleTimeZone zoneinfo = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(jdate, "sun.util.calendar.CalendarDate", "zoneinfo", zoneinfo);
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        setField(_calendar, "java.util.Calendar", "zone", _timezone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat.format(((Date) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}
     */
    @Test
    public void testFormat() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('?');
        decimalFormatSymbols.setInfinity("10");
        decimalFormatSymbols.setZeroDigit('?');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('@');
        decimalFormatSymbols.setGroupingSeparator('');
        decimalFormatSymbols.setCurrencySymbol("-3");
        decimalFormatSymbols.setPercent('\u0000');
        java.lang.String[] stringArray = {"\n\t\r", "\n\t\r"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("-3", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MAX_VALUE);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMaximumFractionDigits(0);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "", "XZ");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(1);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MIN_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        Date date = new Date(Integer.MIN_VALUE, 1, Integer.MIN_VALUE, 1, 1);
        StringBuffer stringBuffer = new StringBuffer(((CharSequence) ""));
        FieldPosition fieldPosition = new FieldPosition(-1);
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(-1);
        
        StringBuffer actual = stdDateFormat.format(date, stringBuffer, fieldPosition);
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[68];
        value[0] = (byte) 26;
        value[1] = (byte) -46;
        value[2] = (byte) 55;
        value[4] = (byte) 52;
        value[6] = (byte) 49;
        value[8] = (byte) 45;
        value[10] = (byte) 48;
        value[12] = (byte) 55;
        value[14] = (byte) 45;
        value[16] = (byte) 49;
        value[18] = (byte) 49;
        value[20] = (byte) 84;
        value[22] = (byte) 48;
        value[24] = (byte) 51;
        value[26] = (byte) 58;
        value[28] = (byte) 52;
        value[30] = (byte) 52;
        value[32] = (byte) 58;
        value[34] = (byte) 50;
        value[36] = (byte) 54;
        value[38] = (byte) 46;
        value[40] = (byte) 52;
        value[42] = (byte) 54;
        value[44] = (byte) 52;
        value[46] = (byte) 43;
        value[48] = (byte) 48;
        value[50] = (byte) 48;
        value[52] = (byte) 48;
        value[54] = (byte) 48;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 1);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 28);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDate(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: Date dt = _parseDate(dateStr, pos);
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:407)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:356) */
        stdDateFormat.parse(null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String)}
     */
    @Test(expected = ParseException.class)
    public void testParseThrowsPEWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('\u0000');
        decimalFormatSymbols.setPatternSeparator('\u0002');
        decimalFormatSymbols.setInfinity("#$\\\"'");
        decimalFormatSymbols.setZeroDigit('\u0001');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setNaN("Cannot parse date \"%s\": not compatible with any of standard forms (%s)");
        decimalFormatSymbols.setDecimalSeparator('\u0001');
        decimalFormatSymbols.setGroupingSeparator('@');
        decimalFormatSymbols.setCurrencySymbol("abc");
        decimalFormatSymbols.setPercent('\u0002');
        java.lang.String[] stringArray = {"", "-3"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("\n\t\r", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(1);
        compactNumberFormat.setMaximumFractionDigits(0);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        compactNumberFormat.setMinimumIntegerDigits(-1);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("-3", "10", "");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(Integer.MIN_VALUE);
        gregorianCalendar.setMinimalDaysInFirstWeek(2);
        stdDateFormat.setCalendar(gregorianCalendar);
        
        stdDateFormat.parse("XZ");
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
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    @Test(expected = ParseException.class)
    public void testParse2() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse3() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u00011\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse4() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001-";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse5() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0001\u0001\u0001!\u0001\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse6() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "!\u0000\u0000\u0000\u0000!\u0001\u0001\u0001";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse7() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u00010\u0000\u00000";
        
        stdDateFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse8() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "!5";
        
        stdDateFormat.parse(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String)
    
    @Test
    public void testParse9() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse10() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse11() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse12() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2896)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse13() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        ChoiceFormat numberFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse14() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat numberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse16() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat numberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse17() throws Exception  {
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse18() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        ChoiceFormat originalNumberFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse19() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse20() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse21() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse22() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse23() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0001!\u0400";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse24() throws Exception  {
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse25() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "!!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    
    @Test
    public void testParse26() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        String string = "\u0001!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358) */
        stdDateFormat.parse(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return _parseDate(dateStr, pos);}
 *  */
    @Test
    public void testParse_Return_parseDate() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = new char[11];
        compiledPattern[0] = '\u64FF';
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = " /";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(2);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(2, finalParsePositionErrorIndex);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return _parseDate(dateStr, pos);}
 *  */
    @Test
    public void testParse_Return_parseDate_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = new char[11];
        compiledPattern[0] = '\u64FF';
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Date actual = stdDateFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return _parseDate(dateStr, pos);
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException1() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:407)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _parseDate(dateStr, pos);
 *  */
    @Test
    public void testParse_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "/";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse27() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "0";
        
        Date actual = stdDateFormat.parse(string, null);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse28() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1485)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse29() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(calendar, "java.util.Calendar", "fields", fields);
        _formatRFC1123.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse30() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(calendar, "java.util.Calendar", "fields", fields);
        _formatRFC1123.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2605)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            java.base/java.util.Calendar.getTime(Calendar.java:1776)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse31() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse32() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u00002";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse33() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse34() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse35() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse36() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse37() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse38() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u0000'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse39() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u6400', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse40() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse41() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse42() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(calendar, "java.util.Calendar", "fields", fields);
        _formatRFC1123.setCalendar(calendar);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.clear(Calendar.java:2007)
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse43() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse44() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        numberFormat.setPositivePrefix(positivePrefix);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse45() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        originalNumberFormat.setPositiveSuffix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(string, null);
    }
    
    @Test
    public void testParse46() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = ":";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        String positiveSuffix = "";
        originalNumberFormat.setPositiveSuffix(positiveSuffix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382) */
        stdDateFormat.parse(positivePrefix, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withLocale(java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, loc, _lenient, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithLocale_Return_4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(_locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = "";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(_locale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", _locale);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id1 = " ";
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id1);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", locale);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLocale_Return_2() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = " ";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null, false);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale1);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(stdDateFormat, actual);
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
        String id = " ";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null, false);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id1 = " ";
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id1);
        setField(locale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale1);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(stdDateFormat, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, loc, _lenient, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithLocale_Return() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        StdDateFormat actual = stdDateFormat.withLocale(locale);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", locale);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLocale(java.util.Locale)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLocale_Return_1() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        StdDateFormat stdDateFormat = new StdDateFormat(null, locale, null, false);
        
        StdDateFormat actual = stdDateFormat.withLocale(locale);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", locale);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
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
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.withLocale] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.withLocale(StdDateFormat.java:209) */
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
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null, false);
        
        stdDateFormat.setTimeZone(simpleTimeZone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_1() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
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
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null, false);
        
        stdDateFormat.setTimeZone(zoneInfo);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setTimeZone(java.util.TimeZone)}
 *  */
    @Test
    public void testSetTimeZone_3() throws Exception  {
        ZoneInfo zoneInfo = new ZoneInfo();
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null, false);
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
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null, false);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo1.setRawOffset(-2);
        zoneInfo1.setID(id);
        
        TimeZone initialStdDateFormat_timezone = stdDateFormat._timezone;
        
        stdDateFormat.setTimeZone(zoneInfo1);
        
        TimeZone finalStdDateFormat_timezone = stdDateFormat._timezone;
        
        assertFalse(initialStdDateFormat_timezone == finalStdDateFormat_timezone);
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
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.setTimeZone] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.setTimeZone(StdDateFormat.java:302) */
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
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        TimeZone actual = stdDateFormat.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.setLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLenient(boolean)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setLenient(boolean)}
 * @utbot.executesCondition {@code (!_equals(newValue, _lenient)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#_clearFormats()}
 *  */
    @Test
    public void testSetLenient_Not_equals() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        stdDateFormat.setLenient(false);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#setLenient(boolean)}
 * @utbot.executesCondition {@code (!_equals(newValue, _lenient)): False}
 *  */
    @Test
    public void testSetLenient__equals() {
        Boolean boolean1 = false;
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, boolean1, false);
        
        stdDateFormat.setLenient(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isLenient()}
 * @utbot.returnsFrom {@code return (_lenient == null) || _lenient.booleanValue();}
 *  */
    @Test
    public void testIsLenient__lenientEqualsNullOr_lenientBooleanValue() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        boolean actual = stdDateFormat.isLenient();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isLenient()}
 * @utbot.returnsFrom {@code return (_lenient == null) || _lenient.booleanValue();}
 *  */
    @Test
    public void testIsLenient__lenientEqualsNullOr_lenientBooleanValue_1() {
        Boolean boolean1 = false;
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, boolean1, false);
        
        boolean actual = stdDateFormat.isLenient();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isLenient()}
 * @utbot.returnsFrom {@code return (_lenient == null) || _lenient.booleanValue();}
 *  */
    @Test
    public void testIsLenient__lenientNotEqualsNullOr_lenientBooleanValue() {
        Boolean boolean1 = true;
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, boolean1, false);
        
        boolean actual = stdDateFormat.isLenient();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.toPattern
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPattern()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#toPattern()}
     */
    @Test
    public void testToPattern() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('\u0000');
        decimalFormatSymbols.setInfinity("");
        decimalFormatSymbols.setZeroDigit('@');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setNaN("' (");
        decimalFormatSymbols.setDecimalSeparator('?');
        decimalFormatSymbols.setGroupingSeparator('d');
        decimalFormatSymbols.setCurrencySymbol("\n\t\r");
        decimalFormatSymbols.setPercent('?');
        java.lang.String[] stringArray = {"strict", "', '"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MAX_VALUE);
        compactNumberFormat.setMaximumFractionDigits(1);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(-1);
        compactNumberFormat.setMinimumIntegerDigits(0);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("3-", "EEE, dd MMM yyyy HH:mm:ss zzz", "#$\\\"'");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(0);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MAX_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        
        String actual = stdDateFormat.toPattern();
        
        String expected = "[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.isColonIncludedInTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isColonIncludedInTimeZone()
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#isColonIncludedInTimeZone()}
 * @utbot.returnsFrom {@code return _tzSerializedWithColon;}
 *  */
    @Test
    public void testIsColonIncludedInTimeZone_Return_tzSerializedWithColon() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        boolean actual = stdDateFormat.isColonIncludedInTimeZone();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withColonInTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withColonInTimeZone(boolean)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withColonInTimeZone(boolean)}
 * @utbot.executesCondition {@code (_tzSerializedWithColon == b): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithColonInTimeZone__tzSerializedWithColonEqualsB() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        StdDateFormat actual = stdDateFormat.withColonInTimeZone(false);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(stdDateFormat, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withColonInTimeZone(boolean)}
 * @utbot.executesCondition {@code (_tzSerializedWithColon == b): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, _locale, _lenient, b);}
 *  */
    @Test
    public void testWithColonInTimeZone__tzSerializedWithColonNotEqualsB() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_tzSerializedWithColon", true);
        
        StdDateFormat actual = stdDateFormat.withColonInTimeZone(false);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._parseDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseDate(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDate(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (i < 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return parseAsRFC1123(dateStr, pos);}
 *  */
    @Test
    public void test_parseDate_IGreaterOrEqualZero() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        parsePosition.setErrorIndex(-255);
        
        Date actual = stdDateFormat._parseDate(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDate(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDate(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (i < 0): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (dateStr.charAt(0) == '-' || NumberInput.inLongRange(dateStr, false))
 *  */
    @Test
    public void test_parseDate_ThrowStringIndexOutOfBoundsException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:407) */
        stdDateFormat._parseDate(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDate(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (i < 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseAsRFC1123(dateStr, pos);
 *  */
    @Test
    public void test_parseDate_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1484)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _parseDate(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDate(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void test_parseDateWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('');
        decimalFormatSymbols.setPatternSeparator('.');
        decimalFormatSymbols.setInfinity("10");
        decimalFormatSymbols.setZeroDigit('\uFFFF');
        decimalFormatSymbols.setDigit(':');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('@');
        decimalFormatSymbols.setGroupingSeparator('-');
        decimalFormatSymbols.setCurrencySymbol("-3");
        decimalFormatSymbols.setPercent(':');
        java.lang.String[] stringArray = {"\n\t\r", "\n\t\r"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("-3", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(-1);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMaximumFractionDigits(0);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "", "XZ");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(0);
        gregorianCalendar.setMinimalDaysInFirstWeek(1);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(57);
        parsePosition.setErrorIndex(0);
        parsePosition.setIndex(0);
        
        Date actual = stdDateFormat._parseDate("1", parsePosition);
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseDate(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void test_parseDate1() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u8000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat._parseDate(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void test_parseDate2() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat._parseDate(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void test_parseDate3() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u0000\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        Date actual = stdDateFormat._parseDate(string, parsePosition);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDate(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void test_parseDate4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate6() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u80002";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate7() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate8() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        StdDateFormat _formatRFC1123 = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:382)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate9() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1472)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate10() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate11() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate12() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate13() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u00002";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate14() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1480)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate15() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = new char[11];
        compiledPattern[0] = '\u65FF';
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate16() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u00002";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3204)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate17() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate18() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate19() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate20() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2900)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate21() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000:";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate22() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate23() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000";
        ParsePosition parsePosition = new ParsePosition(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, parsePosition);
    }
    
    @Test
    public void test_parseDate24() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate25() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        String string = "\u0000\u0000\u0000:2";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate26() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        numberFormat.setPositivePrefix(positivePrefix);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate27() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CompactNumberFormat originalNumberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        numberFormat.setPositivePrefix(positivePrefix);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(string, null);
    }
    
    @Test
    public void test_parseDate28() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000\u0000";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        String positiveSuffix = "";
        originalNumberFormat.setPositiveSuffix(positiveSuffix);
        setField(originalNumberFormat, "java.text.DecimalFormat", "posPrefixPattern", positiveSuffix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411) */
        stdDateFormat._parseDate(positivePrefix, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.pad3
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad3(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad3(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): True}
 *  */
    @Test
    public void testPad3_HEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad3Method = stdDateFormatClazz.getDeclaredMethod("pad3", stringBufferType, intType);
        pad3Method.setAccessible(true);
        java.lang.Object[] pad3MethodArguments = new java.lang.Object[2];
        pad3MethodArguments[0] = stringBuffer;
        pad3MethodArguments[1] = -80;
        pad3Method.invoke(null, pad3MethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad3(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): True}
 *  */
    @Test
    public void testPad3_HEqualsZero_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad3Method = stdDateFormatClazz.getDeclaredMethod("pad3", stringBufferType, intType);
        pad3Method.setAccessible(true);
        java.lang.Object[] pad3MethodArguments = new java.lang.Object[2];
        pad3MethodArguments[0] = stringBuffer;
        pad3MethodArguments[1] = -1;
        pad3Method.invoke(null, pad3MethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad3(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 *  */
    @Test
    public void testPad3_HNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad3Method = stdDateFormatClazz.getDeclaredMethod("pad3", stringBufferType, intType);
        pad3Method.setAccessible(true);
        java.lang.Object[] pad3MethodArguments = new java.lang.Object[2];
        pad3MethodArguments[0] = stringBuffer;
        pad3MethodArguments[1] = -125;
        pad3Method.invoke(null, pad3MethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad3(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad3(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append((char) ('0' + h));
 *  */
    @Test
    public void testPad3_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad3] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad3(StdDateFormat.java:505) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad3Method = stdDateFormatClazz.getDeclaredMethod("pad3", stringBufferType, intType);
        pad3Method.setAccessible(true);
        java.lang.Object[] pad3MethodArguments = new java.lang.Object[2];
        pad3MethodArguments[0] = ((Object) null);
        pad3MethodArguments[1] = -131;
        try {
            pad3Method.invoke(null, pad3MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad3(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('0');
 *  */
    @Test
    public void testPad3_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad3] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad3(StdDateFormat.java:503) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad3Method = stdDateFormatClazz.getDeclaredMethod("pad3", stringBufferType, intType);
        pad3Method.setAccessible(true);
        java.lang.Object[] pad3MethodArguments = new java.lang.Object[2];
        pad3MethodArguments[0] = ((Object) null);
        pad3MethodArguments[1] = 0;
        try {
            pad3Method.invoke(null, pad3MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
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
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.pad2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad2(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad2(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (tens == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 *  */
    @Test
    public void testPad2_TensEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("        ");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad2Method = stdDateFormatClazz.getDeclaredMethod("pad2", stringBufferType, intType);
        pad2Method.setAccessible(true);
        java.lang.Object[] pad2MethodArguments = new java.lang.Object[2];
        pad2MethodArguments[0] = stringBuffer;
        pad2MethodArguments[1] = 0;
        pad2Method.invoke(null, pad2MethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad2(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (tens == 0): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 *  */
    @Test
    public void testPad2_TensNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad2Method = stdDateFormatClazz.getDeclaredMethod("pad2", stringBufferType, intType);
        pad2Method.setAccessible(true);
        java.lang.Object[] pad2MethodArguments = new java.lang.Object[2];
        pad2MethodArguments[0] = stringBuffer;
        pad2MethodArguments[1] = 256;
        pad2Method.invoke(null, pad2MethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad2(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad2(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (tens == 0): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append((char) ('0' + tens));
 *  */
    @Test
    public void testPad2_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad2(StdDateFormat.java:494) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad2Method = stdDateFormatClazz.getDeclaredMethod("pad2", stringBufferType, intType);
        pad2Method.setAccessible(true);
        java.lang.Object[] pad2MethodArguments = new java.lang.Object[2];
        pad2MethodArguments[0] = ((Object) null);
        pad2MethodArguments[1] = -160;
        try {
            pad2Method.invoke(null, pad2MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad2(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (tens == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('0');
 *  */
    @Test
    public void testPad2_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad2(StdDateFormat.java:492) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad2Method = stdDateFormatClazz.getDeclaredMethod("pad2", stringBufferType, intType);
        pad2Method.setAccessible(true);
        java.lang.Object[] pad2MethodArguments = new java.lang.Object[2];
        pad2MethodArguments[0] = ((Object) null);
        pad2MethodArguments[1] = -1;
        try {
            pad2Method.invoke(null, pad2MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method looksLikeISO8601(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_DateStrLengthLessThan7() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_NotCharacterIsDigit() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "/      ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_NotCharacterIsDigit_1() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  /   ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): True}
 * @utbot.executesCondition {@code (dateStr.charAt(4) == '-'): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_DateStrCharAtNotEqualsChar() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  2   ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): True}
 * @utbot.executesCondition {@code (dateStr.charAt(4) == '-'): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(5))): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testLooksLikeISO8601_NotCharacterIsDigit_2() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  2-/ ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.executesCondition {@code (dateStr.length() >= 7): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(0))): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(3))): True}
 * @utbot.executesCondition {@code (dateStr.charAt(4) == '-'): True}
 * @utbot.executesCondition {@code (Character.isDigit(dateStr.charAt(5))): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testLooksLikeISO8601_CharacterIsDigit() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2  2-2 ";
        
        boolean actual = stdDateFormat.looksLikeISO8601(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method looksLikeISO8601(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#looksLikeISO8601(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dateStr.length() >= 7 && Character.isDigit(dateStr.charAt(0)) && Character.isDigit(dateStr.charAt(3)) && dateStr.charAt(4) == '-' && Character.isDigit(dateStr.charAt(5))
 *  */
    @Test
    public void testLooksLikeISO8601_ThrowNullPointerException() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.looksLikeISO8601(StdDateFormat.java:570) */
        stdDateFormat.looksLikeISO8601(null);
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
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._parse4D
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parse4D(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse4D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (1000 * (str.charAt(index) - '0')) + (100 * (str.charAt(index + 1) - '0')) + (10 * (str.charAt(index + 2) - '0')) + (str.charAt(index + 3) - '0');}
 *  */
    @Test
    public void test_parse4D_StringCharAt() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "                            ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse4DMethod = stdDateFormatClazz.getDeclaredMethod("_parse4D", stringType, intType);
        _parse4DMethod.setAccessible(true);
        java.lang.Object[] _parse4DMethodArguments = new java.lang.Object[2];
        _parse4DMethodArguments[0] = string;
        _parse4DMethodArguments[1] = 22;
        int actual = ((Integer) _parse4DMethod.invoke(null, _parse4DMethodArguments));
        
        assertEquals(-17776, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parse4D(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse4D(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return (1000 * (str.charAt(index) - '0')) + (100 * (str.charAt(index + 1) - '0')) + (10 * (str.charAt(index + 2) - '0')) + (str.charAt(index + 3) - '0');
 *  */
    @Test
    public void test_parse4D_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "  ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse4D] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parse4D(StdDateFormat.java:717) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse4DMethod = stdDateFormatClazz.getDeclaredMethod("_parse4D", stringType, intType);
        _parse4DMethod.setAccessible(true);
        java.lang.Object[] _parse4DMethodArguments = new java.lang.Object[2];
        _parse4DMethodArguments[0] = string;
        _parse4DMethodArguments[1] = -255;
        try {
            _parse4DMethod.invoke(null, _parse4DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse4D(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (100 * (str.charAt(index + 1) - '0'))
 *  */
    @Test
    public void test_parse4D_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse4D] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parse4D(StdDateFormat.java:718) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse4DMethod = stdDateFormatClazz.getDeclaredMethod("_parse4D", stringType, intType);
        _parse4DMethod.setAccessible(true);
        java.lang.Object[] _parse4DMethodArguments = new java.lang.Object[2];
        _parse4DMethodArguments[0] = string;
        _parse4DMethodArguments[1] = 0;
        try {
            _parse4DMethod.invoke(null, _parse4DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse4D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (10 * (str.charAt(index + 2) - '0'))
 *  */
    @Test
    public void test_parse4D_ThrowStringIndexOutOfBoundsException_2() throws Throwable  {
        String string = "  ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse4D] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parse4D(StdDateFormat.java:719) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse4DMethod = stdDateFormatClazz.getDeclaredMethod("_parse4D", stringType, intType);
        _parse4DMethod.setAccessible(true);
        java.lang.Object[] _parse4DMethodArguments = new java.lang.Object[2];
        _parse4DMethodArguments[0] = string;
        _parse4DMethodArguments[1] = 0;
        try {
            _parse4DMethod.invoke(null, _parse4DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse4D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (1000 * (str.charAt(index) - '0')) + (100 * (str.charAt(index + 1) - '0')) + (10 * (str.charAt(index + 2) - '0')) + (str.charAt(index + 3) - '0');
 *  */
    @Test
    public void test_parse4D_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse4D] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parse4D(StdDateFormat.java:717) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse4DMethod = stdDateFormatClazz.getDeclaredMethod("_parse4D", stringType, intType);
        _parse4DMethod.setAccessible(true);
        java.lang.Object[] _parse4DMethodArguments = new java.lang.Object[2];
        _parse4DMethodArguments[0] = ((Object) null);
        _parse4DMethodArguments[1] = -255;
        try {
            _parse4DMethod.invoke(null, _parse4DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withLenient(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLenient(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, _locale, b, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithLenient_Return_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = false;
        stdDateFormat._lenient = _lenient;
        
        StdDateFormat actual = stdDateFormat.withLenient(null);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLenient(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return new StdDateFormat(_timezone, _locale, b, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithLenient_Return_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean boolean1 = false;
        
        StdDateFormat actual = stdDateFormat.withLenient(boolean1);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        expected._lenient = boolean1;
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLenient(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLenient_Return() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        StdDateFormat actual = stdDateFormat.withLenient(null);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withLenient(java.lang.Boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithLenient_Return_2() throws Exception  {
        Boolean boolean1 = false;
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, boolean1, false);
        Boolean boolean2 = false;
        
        StdDateFormat actual = stdDateFormat.withLenient(boolean2);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        expected._lenient = boolean1;
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._parseAsISO8601
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseAsISO8601(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseAsISO8601(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int totalLen = dateStr.length();
 *  */
    @Test
    public void test_parseAsISO8601_ThrowNullPointerException() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseAsISO8601] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseAsISO8601(StdDateFormat.java:609) */
        stdDateFormat._parseAsISO8601(null, null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method _parseAsISO8601(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseAsISO8601(java.lang.String,java.text.ParsePosition)}
     */
    @Test(expected = ParseException.class)
    public void test_parseAsISO8601ThrowsPEWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('\u0003');
        decimalFormatSymbols.setPatternSeparator('\u0E10');
        decimalFormatSymbols.setInfinity("#$\\\"'");
        decimalFormatSymbols.setZeroDigit('Z');
        decimalFormatSymbols.setDigit('\u0010');
        decimalFormatSymbols.setNaN("\n\t\r");
        decimalFormatSymbols.setDecimalSeparator('\u0003');
        decimalFormatSymbols.setGroupingSeparator('\u0011');
        decimalFormatSymbols.setCurrencySymbol("yyyy-MM-dd");
        decimalFormatSymbols.setPercent('<');
        java.lang.String[] stringArray = {"XZ", "XZ"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(100);
        compactNumberFormat.setMaximumFractionDigits(60);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(3);
        compactNumberFormat.setMinimumIntegerDigits(5);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", "abc", "10");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(5);
        gregorianCalendar.setMinimalDaysInFirstWeek(14);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(16);
        parsePosition.setErrorIndex(1);
        parsePosition.setIndex(-1000);
        
        stdDateFormat._parseAsISO8601("Cannot parse date \"%s\": invalid fractional econds '%s'; can use at most 9 digits", parsePosition);
    }
    ///endregion
    
    ///region Errors report for _parseAsISO8601
    
    public void test_parseAsISO8601_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
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
        char[] compiledPattern = {'\u6501'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1500)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _formatRFC1123.parse(dateStr, pos);
 *  */
    @Test
    public void testParseAsRFC1123_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
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
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseAsRFC1123(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsRFC1123(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseAsRFC1123WithNonEmptyString() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('?');
        decimalFormatSymbols.setInfinity("XZ");
        decimalFormatSymbols.setZeroDigit('?');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('@');
        decimalFormatSymbols.setGroupingSeparator('');
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormatSymbols.setPercent('\u0000');
        java.lang.String[] stringArray = {"XZ", "-3"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("EEE, dd MMM yyyy HH:mm:ss zzz", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MAX_VALUE);
        compactNumberFormat.setMaximumFractionDigits(0);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        compactNumberFormat.setMinimumIntegerDigits(-1);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "10", "EEE, dd MMM yyyy HH:mm:ss zzz");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(1);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MIN_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(1);
        parsePosition.setErrorIndex(1);
        parsePosition.setIndex(1);
        
        Date actual = stdDateFormat.parseAsRFC1123("ac", parsePosition);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseAsRFC1123(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParseAsRFC11231() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = new char[11];
        compiledPattern[0] = '\u64FF';
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483648]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1490)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    @Test
    public void testParseAsRFC11232() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {
            '\u6502', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1963)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    @Test
    public void testParseAsRFC11233() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "hasFollowingMinusSign", true);
        char[] compiledPattern = {
            '\u1300', '\u0100', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1895)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1545)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    @Test
    public void testParseAsRFC11234() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6500'};
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            java.base/java.text.CalendarBuilder.establish(CalendarBuilder.java:115)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1563)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(string, parsePosition);
    }
    
    @Test
    public void testParseAsRFC11235() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String posPrefixPattern = "";
        setField(numberFormat, "java.text.DecimalFormat", "posPrefixPattern", posPrefixPattern);
        setField(numberFormat, "java.text.DecimalFormat", "useExponentialNotation", true);
        numberFormat.setMaximumIntegerDigits(-2147483647);
        numberFormat.setMaximumFractionDigits(-2147483647);
        _formatRFC1123.setNumberFormat(numberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3176)
            java.base/java.text.DecimalFormat.appendAffix(DecimalFormat.java:3117)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:3243)
            java.base/java.text.DecimalFormat.toPattern(DecimalFormat.java:2943)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2520)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(null, null);
    }
    
    @Test
    public void testParseAsRFC11236() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:746)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:731) */
        stdDateFormat.parseAsRFC1123(null, null);
    }
    
    @Test
    public void testParseAsRFC11237() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleDateFormat _formatRFC1123 = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        DecimalFormat originalNumberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        originalNumberFormat.setPositivePrefix(positivePrefix);
        String positiveSuffix = "";
        originalNumberFormat.setPositiveSuffix(positiveSuffix);
        setField(_formatRFC1123, "java.text.SimpleDateFormat", "originalNumberFormat", originalNumberFormat);
        _formatRFC1123.setNumberFormat(originalNumberFormat);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatRFC1123", _formatRFC1123);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.equals(DecimalFormat.java:2904)
            java.base/java.text.SimpleDateFormat.checkNegativeNumberExpression(SimpleDateFormat.java:2519)
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1470)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:734) */
        stdDateFormat.parseAsRFC1123(null, null);
    }
    ///endregion
    
    ///region Errors report for parseAsRFC1123
    
    public void testParseAsRFC1123_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
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
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._parse2D
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parse2D(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse2D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return (10 * (str.charAt(index) - '0')) + (str.charAt(index + 1) - '0');}
 *  */
    @Test
    public void test_parse2D_StringCharAt() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "  ";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse2DMethod = stdDateFormatClazz.getDeclaredMethod("_parse2D", stringType, intType);
        _parse2DMethod.setAccessible(true);
        java.lang.Object[] _parse2DMethodArguments = new java.lang.Object[2];
        _parse2DMethodArguments[0] = string;
        _parse2DMethodArguments[1] = 0;
        int actual = ((Integer) _parse2DMethod.invoke(null, _parse2DMethodArguments));
        
        assertEquals(-176, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parse2D(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse2D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return (10 * (str.charAt(index) - '0')) + (str.charAt(index + 1) - '0');
 *  */
    @Test
    public void test_parse2D_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "  ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse2D] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parse2D(StdDateFormat.java:724) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse2DMethod = stdDateFormatClazz.getDeclaredMethod("_parse2D", stringType, intType);
        _parse2DMethod.setAccessible(true);
        java.lang.Object[] _parse2DMethodArguments = new java.lang.Object[2];
        _parse2DMethodArguments[0] = string;
        _parse2DMethodArguments[1] = -255;
        try {
            _parse2DMethod.invoke(null, _parse2DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parse2D(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (10 * (str.charAt(index) - '0')) + (str.charAt(index + 1) - '0');
 *  */
    @Test
    public void test_parse2D_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parse2D] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parse2D(StdDateFormat.java:724) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method _parse2DMethod = stdDateFormatClazz.getDeclaredMethod("_parse2D", stringType, intType);
        _parse2DMethod.setAccessible(true);
        java.lang.Object[] _parse2DMethodArguments = new java.lang.Object[2];
        _parse2DMethodArguments[0] = ((Object) null);
        _parse2DMethodArguments[1] = -255;
        try {
            _parse2DMethod.invoke(null, _parse2DMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.parseAsISO8601
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parseAsISO8601(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#parseAsISO8601(java.lang.String,java.text.ParsePosition)}
     */
    @Test(expected = ParseException.class)
    public void testParseAsISO8601ThrowsPEWithNonEmptyString() throws ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('@');
        decimalFormatSymbols.setInfinity("XZ");
        decimalFormatSymbols.setZeroDigit('\u0000');
        decimalFormatSymbols.setDigit('\u0000');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('\u0002');
        decimalFormatSymbols.setGroupingSeparator('\u0000');
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormatSymbols.setPercent('\u0002');
        java.lang.String[] stringArray = {"XZ", "-3"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("Cannot parse date \"%s\", problem: %s", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MIN_VALUE);
        compactNumberFormat.setMaximumFractionDigits(1);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(0);
        compactNumberFormat.setMinimumIntegerDigits(Integer.MIN_VALUE);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "10", "Cannot parse date \"%s\", problem: %s");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(1);
        gregorianCalendar.setMinimalDaysInFirstWeek(1);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(0);
        parsePosition.setErrorIndex(Integer.MAX_VALUE);
        parsePosition.setIndex(-1);
        
        stdDateFormat.parseAsISO8601("ac", parsePosition);
    }
    ///endregion
    
    ///region Errors report for parseAsISO8601
    
    public void testParseAsISO8601_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _format(java.util.TimeZone, java.util.Locale, java.util.Date, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Calendar cal = _getCalendar(tz);
 *  */
    @Test
    public void test_format_ThrowNullPointerException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(_calendar, "java.util.Calendar", "sharedZone", true);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._format] produces [java.lang.NullPointerException]
            java.base/java.util.JapaneseImperialCalendar.getTimeZone(JapaneseImperialCalendar.java:1518)
            com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar(StdDateFormat.java:770)
            com.fasterxml.jackson.databind.util.StdDateFormat._format(StdDateFormat.java:435) */
        stdDateFormat._format(null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _format(java.util.TimeZone, java.util.Locale, java.util.Date, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Calendar cal = _getCalendar(tz);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void test_format_ThrowUnsupportedOperationException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        BuddhistCalendar _calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        setField(_calendar, "java.util.GregorianCalendar", "cdate", cdate);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._format(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cal.setTime(date);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_format_ThrowNullPointerException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        BuddhistCalendar _calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        setField(_calendar, "java.util.GregorianCalendar", "cdate", gdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._format(zone, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cal.setTime(date);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_format_ThrowNullPointerException_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = false;
        stdDateFormat._lenient = _lenient;
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._format(zone, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cal.setTime(date);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_format_ThrowNullPointerException_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = true;
        stdDateFormat._lenient = _lenient;
        BuddhistCalendar _calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._format(zone, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cal.setTime(date);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_format_ThrowNullPointerException_4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(_calendar, "java.util.GregorianCalendar", "cdate", cdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._format(zone, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_format(java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cal.setTime(date);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_format_ThrowNullPointerException_5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = true;
        stdDateFormat._lenient = _lenient;
        BuddhistCalendar _calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        ZoneInfo zone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        ZoneInfo zoneInfo = new ZoneInfo();
        
        stdDateFormat._format(zoneInfo, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _format(java.util.TimeZone, java.util.Locale, java.util.Date, java.lang.StringBuffer)
    
    @Test
    public void test_format1() {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._format] produces [java.lang.NullPointerException: date must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.Calendar.setTime(Calendar.java:1792)
            com.fasterxml.jackson.databind.util.StdDateFormat._format(StdDateFormat.java:436) */
        stdDateFormat._format(null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for _format
    
    public void test_format_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseDateFromLong(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return new Date(ts);}
 *  */
    @Test
    public void test_parseDateFromLong_Return() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        Date actual = ((Date) _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return new Date(ts);}
 *  */
    @Test
    public void test_parseDateFromLong_Return_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-2";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        Date actual = ((Date) _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return new Date(ts);}
 *  */
    @Test
    public void test_parseDateFromLong_Return_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "22";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        Date actual = ((Date) _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.returnsFrom {@code return new Date(ts);}
 *  */
    @Test
    public void test_parseDateFromLong_Return_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "222";
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        Date actual = ((Date) _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDateFromLong(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: ts = NumberInput.parseLong(longStr);
 *  */
    @Test
    public void test_parseDateFromLong_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:68)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:130)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:585) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getErrorIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.getErrorIndex()
 *  */
    @Test
    public void test_parseDateFromLong_ThrowNullPointerException() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method _parseDateFromLong(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_parseDateFromLong(java.lang.String,java.text.ParsePosition)}
     */
    @Test(expected = ParseException.class)
    public void test_parseDateFromLongThrowsPEWithNonEmptyString() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('');
        decimalFormatSymbols.setInfinity("XZ");
        decimalFormatSymbols.setZeroDigit('\u0000');
        decimalFormatSymbols.setDigit('?');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('@');
        decimalFormatSymbols.setGroupingSeparator('\u0000');
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormatSymbols.setPercent('@');
        java.lang.String[] stringArray = {"XZ", "-3"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("Timestamp value %s out of 64-bit value range", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MIN_VALUE);
        compactNumberFormat.setMaximumFractionDigits(Integer.MIN_VALUE);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(Integer.MAX_VALUE);
        compactNumberFormat.setMinimumIntegerDigits(Integer.MIN_VALUE);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "10", "Timestamp value %s out of 64-bit value range");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(0);
        gregorianCalendar.setMinimalDaysInFirstWeek(0);
        stdDateFormat.setCalendar(gregorianCalendar);
        ParsePosition parsePosition = new ParsePosition(Integer.MAX_VALUE);
        parsePosition.setErrorIndex(0);
        parsePosition.setIndex(Integer.MIN_VALUE);
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = "ac";
        _parseDateFromLongMethodArguments[1] = parsePosition;
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDateFromLong(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void test_parseDateFromLong1() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-222\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong2() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong3() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-2:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong4() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-22:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong5() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong6() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong7() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = ":\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong8() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong9() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "222\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong10() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong11() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong12() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "22\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseDateFromLong13() throws Throwable  {
        StdDateFormat stdDateFormat = new StdDateFormat();
        String string = "-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDateFromLong(StdDateFormat.java:589) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method _parseDateFromLongMethod = stdDateFormatClazz.getDeclaredMethod("_parseDateFromLong", stringType, parsePositionType);
        _parseDateFromLongMethod.setAccessible(true);
        java.lang.Object[] _parseDateFromLongMethodArguments = new java.lang.Object[2];
        _parseDateFromLongMethodArguments[0] = string;
        _parseDateFromLongMethodArguments[1] = ((Object) null);
        try {
            _parseDateFromLongMethod.invoke(stdDateFormat, _parseDateFromLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _getCalendar(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(zone);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = true;
        stdDateFormat._lenient = _lenient;
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(zone);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Boolean _lenient = false;
        stdDateFormat._lenient = _lenient;
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(zone);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertFalse(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_3() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        setField(_calendar, "java.util.GregorianCalendar", "cdate", gdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.BaseCalendar.Date stdDateFormat_calendar_calendarGdate = ((sun.util.calendar.BaseCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone initialStdDateFormat_calendarGdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        GregorianCalendar actual = ((GregorianCalendar) stdDateFormat._getCalendar(zone));
        
        // java.util.GregorianCalendar has overridden equals method
        assertEquals(_calendar, actual);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.BaseCalendar.Date stdDateFormat_calendar1_calendarGdate = ((sun.util.calendar.BaseCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.GregorianCalendar", "gdate"));
        TimeZone finalStdDateFormat_calendarGdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarGdateZoneinfo == finalStdDateFormat_calendarGdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_5() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        ZoneInfo zone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        ZoneInfo zoneInfo = new ZoneInfo();
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(zoneInfo);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_4() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Object actual = stdDateFormat._getCalendar(null);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        assertNull(actualJdateZoneinfo);
        
        boolean actualAreFieldsSet = ((Boolean) getFieldValue(actual, "java.util.Calendar", "areFieldsSet"));
        assertFalse(actualAreFieldsSet);
        
        boolean actualAreAllFieldsSet = ((Boolean) getFieldValue(actual, "java.util.Calendar", "areAllFieldsSet"));
        assertFalse(actualAreAllFieldsSet);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        assertNull(actualZone);
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar, "java.util.Calendar", "lenient"));
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        TimeZone finalStdDateFormat_calendarZone = ((TimeZone) getFieldValue(stdDateFormat_calendar1, "java.util.Calendar", "zone"));
        
        assertTrue(finalStdDateFormat_calendarLenient);
        
        assertNull(finalStdDateFormat_calendarZone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_6() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        setField(_calendar, "java.util.GregorianCalendar", "cdate", gdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        GregorianCalendar actual = ((GregorianCalendar) stdDateFormat._getCalendar(null));
        
        // java.util.GregorianCalendar has overridden equals method
        assertEquals(_calendar, actual);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar, "java.util.Calendar", "lenient"));
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        TimeZone finalStdDateFormat_calendarZone = ((TimeZone) getFieldValue(stdDateFormat_calendar1, "java.util.Calendar", "zone"));
        
        assertTrue(finalStdDateFormat_calendarLenient);
        
        assertNull(finalStdDateFormat_calendarZone);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_7() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        BuddhistCalendar _calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "cdate", cdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.BaseCalendar.Date stdDateFormat_calendar_calendarGdate = ((sun.util.calendar.BaseCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone initialStdDateFormat_calendarGdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        BuddhistCalendar actual = ((BuddhistCalendar) stdDateFormat._getCalendar(zone));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(_calendar, actual);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.BaseCalendar.Date stdDateFormat_calendar1_calendarGdate = ((sun.util.calendar.BaseCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.GregorianCalendar", "gdate"));
        TimeZone finalStdDateFormat_calendarGdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarGdateZoneinfo == finalStdDateFormat_calendarGdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_8() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        zone.setID(id);
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        simpleTimeZone.setID(id);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(simpleTimeZone);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        int _calendarJdateZoneinfoRawOffset = (((SimpleTimeZone) _calendarJdateZoneinfo)).getRawOffset();
        int actualJdateZoneinfoRawOffset = (((SimpleTimeZone) actualJdateZoneinfo)).getRawOffset();
        assertEquals(_calendarJdateZoneinfoRawOffset, actualJdateZoneinfoRawOffset);
        
        boolean actualJdateZoneinfoUseDaylight = ((Boolean) getFieldValue(actualJdateZoneinfo, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actualJdateZoneinfoUseDaylight);
        
        String _calendarJdateZoneinfoID = _calendarJdateZoneinfo.getID();
        String actualJdateZoneinfoID = actualJdateZoneinfo.getID();
        assertEquals(_calendarJdateZoneinfoID, actualJdateZoneinfoID);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        assertTrue(deepEquals(_calendarZone, actualZone));
        assertTrue(deepEquals(_calendarZone, actualZone));
        assertTrue(deepEquals(_calendarZone, actualZone));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.returnsFrom {@code return cal;}
 *  */
    @Test
    public void test_getCalendar_ReturnCal_9() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "\u0000\u0000";
        zone.setID(id);
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id1 = "\u0000";
        simpleTimeZone.setID(id1);
        
        Calendar stdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        Object actual = stdDateFormat._getCalendar(simpleTimeZone);
        
        sun.util.calendar.LocalGregorianCalendar.Date _calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(_calendar, "java.util.JapaneseImperialCalendar", "jdate"));
        sun.util.calendar.LocalGregorianCalendar.Date actualJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(actual, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone _calendarJdateZoneinfo = ((TimeZone) getFieldValue(_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        TimeZone actualJdateZoneinfo = ((TimeZone) getFieldValue(actualJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        String _calendarJdateZoneinfoID = _calendarJdateZoneinfo.getID();
        String actualJdateZoneinfoID = actualJdateZoneinfo.getID();
        assertEquals(_calendarJdateZoneinfoID, actualJdateZoneinfoID);
        
        boolean actualAreFieldsSet = ((Boolean) getFieldValue(actual, "java.util.Calendar", "areFieldsSet"));
        assertFalse(actualAreFieldsSet);
        
        boolean actualAreAllFieldsSet = ((Boolean) getFieldValue(actual, "java.util.Calendar", "areAllFieldsSet"));
        assertFalse(actualAreAllFieldsSet);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "java.util.Calendar", "lenient"));
        assertTrue(actualLenient);
        
        TimeZone _calendarZone = ((TimeZone) getFieldValue(_calendar, "java.util.Calendar", "zone"));
        TimeZone actualZone = ((TimeZone) getFieldValue(actual, "java.util.Calendar", "zone"));
        assertTrue(deepEquals(_calendarZone, actualZone));
        
        boolean actualSharedZone = ((Boolean) getFieldValue(actual, "java.util.Calendar", "sharedZone"));
        assertFalse(actualSharedZone);
        
        Calendar stdDateFormat_calendar1 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date stdDateFormat_calendar1_calendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(stdDateFormat_calendar1, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalStdDateFormat_calendarJdateZoneinfo = ((TimeZone) getFieldValue(stdDateFormat_calendar1_calendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        Calendar stdDateFormat_calendar2 = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        boolean finalStdDateFormat_calendarLenient = ((Boolean) getFieldValue(stdDateFormat_calendar2, "java.util.Calendar", "lenient"));
        
        assertFalse(initialStdDateFormat_calendarJdateZoneinfo == finalStdDateFormat_calendarJdateZoneinfo);
        
        assertTrue(finalStdDateFormat_calendarLenient);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _getCalendar(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cal.getTimeZone().equals(tz)
 *  */
    @Test
    public void test_getCalendar_ThrowNullPointerException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(_calendar, "java.util.Calendar", "sharedZone", true);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.getTimeZone(GregorianCalendar.java:1983)
            com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar(StdDateFormat.java:770) */
        stdDateFormat._getCalendar(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cal.getTimeZone().equals(tz)
 *  */
    @Test
    public void test_getCalendar_ThrowNullPointerException_1() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object _calendar = createInstance("java.util.JapaneseImperialCalendar");
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_calendar, "java.util.Calendar", "zone", zone);
        setField(_calendar, "java.util.Calendar", "sharedZone", true);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar] produces [java.lang.NullPointerException]
            java.base/java.util.JapaneseImperialCalendar.getTimeZone(JapaneseImperialCalendar.java:1518)
            com.fasterxml.jackson.databind.util.StdDateFormat._getCalendar(StdDateFormat.java:770) */
        stdDateFormat._getCalendar(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _getCalendar(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_getCalendar(java.util.TimeZone)}
 * @utbot.executesCondition {@code (cal == null): False}
 * @utbot.invokes {@link java.util.Calendar#getTimeZone()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !cal.getTimeZone().equals(tz)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void test_getCalendar_ThrowUnsupportedOperationException() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        GregorianCalendar _calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        sun.util.calendar.LocalGregorianCalendar.Date gdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(_calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        setField(_calendar, "java.util.GregorianCalendar", "cdate", cdate);
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar", _calendar);
        
        stdDateFormat._getCalendar(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _getCalendar(java.util.TimeZone)
    
    @Test
    public void test_getCalendar1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null, null, false);
        
        Calendar initialStdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        
        GregorianCalendar actual = ((GregorianCalendar) stdDateFormat._getCalendar(null));
        
        GregorianCalendar expected = new GregorianCalendar();
        
        // java.util.GregorianCalendar has overridden equals method
        assertEquals(expected, actual);
        
        Calendar finalStdDateFormat_calendar = ((Calendar) getFieldValue(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_calendar"));
        
        assertFalse(initialStdDateFormat_calendar == finalStdDateFormat_calendar);
    }
    ///endregion
    
    ///region Errors report for _getCalendar
    
    public void test_getCalendar_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.withTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTimeZone(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(tz, _locale, _lenient, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_2() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleTimeZone _timezone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(stdDateFormat, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        ZoneInfo zoneInfo = new ZoneInfo();
        
        StdDateFormat actual = stdDateFormat.withTimeZone(zoneInfo);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ZoneInfo _timezone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone1);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone_3() throws Exception  {
        ZoneInfo zoneInfo = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo.setRawOffset(1);
        String id = "";
        zoneInfo.setID(id);
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null, null, false);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo1.setRawOffset(1);
        zoneInfo1.setID(id);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(zoneInfo1);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(stdDateFormat, actual);
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
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null, false);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", simpleTimeZone);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#withTimeZone(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == _timezone): False}
 * @utbot.returnsFrom {@code return new StdDateFormat(tz, _locale, _lenient, _tzSerializedWithColon);}
 *  */
    @Test
    public void testWithTimeZone_TzNotEquals_timezone() throws Exception  {
        StdDateFormat stdDateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", simpleTimeZone);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
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
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null, null, false);
        SimpleTimeZone simpleTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        simpleTimeZone1.setID(id);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(simpleTimeZone1);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", simpleTimeZone);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
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
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setPerMill('?');
        decimalFormatSymbols.setPatternSeparator('?');
        decimalFormatSymbols.setInfinity("10");
        decimalFormatSymbols.setZeroDigit('?');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setNaN("#$\\\"'");
        decimalFormatSymbols.setDecimalSeparator('@');
        decimalFormatSymbols.setGroupingSeparator('');
        decimalFormatSymbols.setCurrencySymbol("-3");
        decimalFormatSymbols.setPercent('\u0000');
        java.lang.String[] stringArray = {"\n\t\r", "\n\t\r"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("-3", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMaximumIntegerDigits(Integer.MAX_VALUE);
        compactNumberFormat.setMaximumFractionDigits(0);
        RoundingMode roundingMode = RoundingMode.CEILING;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMinimumFractionDigits(Integer.MIN_VALUE);
        compactNumberFormat.setMinimumIntegerDigits(-1);
        stdDateFormat.setNumberFormat(compactNumberFormat);
        Locale locale = new Locale("10", "", "XZ");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        gregorianCalendar.setFirstDayOfWeek(134217729);
        gregorianCalendar.setMinimalDaysInFirstWeek(Integer.MIN_VALUE);
        stdDateFormat.setCalendar(gregorianCalendar);
        
        StdDateFormat actual = stdDateFormat.withTimeZone(null);
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        ZoneInfo _timezone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_timezone", _timezone);
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "com.fasterxml.jackson.databind.util.StdDateFormat", "_locale", _locale);
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for withTimeZone
    
    public void testWithTimeZone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat.pad4
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad4(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad4(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 *  */
    @Test
    public void testPad4_HEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad4Method = stdDateFormatClazz.getDeclaredMethod("pad4", stringBufferType, intType);
        pad4Method.setAccessible(true);
        java.lang.Object[] pad4MethodArguments = new java.lang.Object[2];
        pad4MethodArguments[0] = stringBuffer;
        pad4MethodArguments[1] = -1;
        pad4Method.invoke(null, pad4MethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad4(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): False}
 * @utbot.invokes com.fasterxml.jackson.databind.util.StdDateFormat#pad2(java.lang.StringBuffer,int)
 *  */
    @Test
    public void testPad4_HNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuffer stringBuffer = new StringBuffer("@");
        
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad4Method = stdDateFormatClazz.getDeclaredMethod("pad4", stringBufferType, intType);
        pad4Method.setAccessible(true);
        java.lang.Object[] pad4MethodArguments = new java.lang.Object[2];
        pad4MethodArguments[0] = stringBuffer;
        pad4MethodArguments[1] = 1713;
        pad4Method.invoke(null, pad4MethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad4(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad4(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad2(buffer, h);
 *  */
    @Test
    public void testPad4_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad4] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad2(StdDateFormat.java:494)
            com.fasterxml.jackson.databind.util.StdDateFormat.pad4(StdDateFormat.java:516) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad4Method = stdDateFormatClazz.getDeclaredMethod("pad4", stringBufferType, intType);
        pad4Method.setAccessible(true);
        java.lang.Object[] pad4MethodArguments = new java.lang.Object[2];
        pad4MethodArguments[0] = ((Object) null);
        pad4MethodArguments[1] = 1018;
        try {
            pad4Method.invoke(null, pad4MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad4(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('0').append('0');
 *  */
    @Test
    public void testPad4_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad4] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad4(StdDateFormat.java:514) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad4Method = stdDateFormatClazz.getDeclaredMethod("pad4", stringBufferType, intType);
        pad4Method.setAccessible(true);
        java.lang.Object[] pad4MethodArguments = new java.lang.Object[2];
        pad4MethodArguments[0] = ((Object) null);
        pad4MethodArguments[1] = 0;
        try {
            pad4Method.invoke(null, pad4MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#pad4(java.lang.StringBuffer,int)}
 * @utbot.executesCondition {@code (h == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad2(buffer, h);
 *  */
    @Test
    public void testPad4_ThrowNullPointerException_2() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.StdDateFormat.pad4] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat.pad2(StdDateFormat.java:492)
            com.fasterxml.jackson.databind.util.StdDateFormat.pad4(StdDateFormat.java:516) */
        Class stdDateFormatClazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method pad4Method = stdDateFormatClazz.getDeclaredMethod("pad4", stringBufferType, intType);
        pad4Method.setAccessible(true);
        java.lang.Object[] pad4MethodArguments = new java.lang.Object[2];
        pad4MethodArguments[0] = ((Object) null);
        pad4MethodArguments[1] = 160;
        try {
            pad4Method.invoke(null, pad4MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.StdDateFormat._equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _equals(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (value1 == value2): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_equals_Value1EqualsValue2() {
        boolean actual = StdDateFormat._equals(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _equals(java.lang.Object, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (value1 == value2): False}
    /// return from: {@code return (value1 != null) && value1.equals(value2);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_equals(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value1 != null) && value1.equals(value2);}
 *  */
    @Test
    public void test_equals_Value1EqualsNullAndValue1Equals() {
        int[] intArray = {};
        
        boolean actual = StdDateFormat._equals(null, intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_equals(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value1 != null) && value1.equals(value2);}
 *  */
    @Test
    public void test_equals_Value1EqualsNullAndValue1Equals_1() {
        Integer integer = 0;
        
        boolean actual = StdDateFormat._equals(integer, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDateFormat}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.StdDateFormat#_equals(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value1 != null) && value1.equals(value2);}
 *  */
    @Test
    public void test_equals_Value1NotEqualsNullAndValue1Equals() {
        Integer integer = 0;
        Integer integer1 = 0;
        
        boolean actual = StdDateFormat._equals(integer, integer1);
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1092712928260700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1092712928260700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1092712928265000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092712928260700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092712928265000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1092712928558700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092712928558700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092712928560199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092712928558700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092712928560199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

