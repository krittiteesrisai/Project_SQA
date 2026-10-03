package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class StdDateFormatTest {

    @Test
    public void testStandardISO8601Parsing() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date date = df.parse("2023-05-15T12:30:45.123+0000");
        assertNotNull(date);
    }

    @Test
    public void testISO8601WithZulü() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // Test with Z and colon in seconds/millis
        Date date1 = df.parse("2023-05-15T12:30:45Z");
        assertNotNull(date1);

        Date date2 = df.parse("2023-05-15T12:30Z");
        assertNotNull(date2);
    }

    @Test
    public void testPlainDateParsing() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date date = df.parse("2023-05-15");
        assertNotNull(date);
        
        // Using ParsePosition overload (non-throwing)
        ParsePosition pos = new ParsePosition(0);
        Date datePos = df.parse("2023-05-15", pos);
        assertNotNull(datePos);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testISO8601WithTimezoneEdgeCases() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // Timezone with colon offset (+00:00)
        assertNotNull(df.parse("2023-05-15T12:30:45.123+00:00"));
        // Timezone missing minutes (+02)
        assertNotNull(df.parse("2023-05-15T12:30:45.123+02"));
        // Missing partial time lengths
        assertNotNull(df.parse("2023-05-15T12+0000"));
        assertNotNull(df.parse("2023-05-15T12:30+0000"));
        assertNotNull(df.parse("2023-05-15T12:30:45+0000"));
    }

    @Test
    public void testISO8601WithoutTimezone() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // No timezone, should append 'Z' and fill milliseconds
        assertNotNull(df.parse("2023-05-15T12:30:45"));
        assertNotNull(df.parse("2023-05-15T12:30"));
        assertNotNull(df.parse("2023-05-15T12"));
    }

    @Test
    public void testTimestampParsing() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // Positive timestamp
        Date date1 = df.parse("1684153845000");
        assertNotNull(date1);

        // Negative timestamp (databind #267)
        Date date2 = df.parse("-1684153845000");
        assertNotNull(date2);

        // ParsePosition overload for timestamp
        ParsePosition pos = new ParsePosition(0);
        assertNotNull(df.parse("1684153845000", pos));
    }

    @Test
    public void testRFC1123FallbackParsing() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // Valid RFC 1123 string
        Date date = df.parse("Mon, 15 May 2023 12:30:45 GMT");
        assertNotNull(date);

        // ParsePosition overload for RFC 1123
        ParsePosition pos = new ParsePosition(0);
        assertNotNull(df.parse("Mon, 15 May 2023 12:30:45 GMT", pos));
    }

    @Test(expected = ParseException.class)
    public void testInvalidDateFormatThrowsException() throws Exception {
        StdDateFormat df = new StdDateFormat();
        df.parse("invalid-date-string-format");
    }

    @Test
    public void testParsePositionISO8601ExceptionHandling() {
        StdDateFormat df = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        // Looks like ISO8601 but invalid content, parseAsISO8601 catches ParseException and returns null
        Date result = df.parse("2023-XX-XXT12:30:45.123+0000", pos);
        assertNull(result);
    }

    @Test
    public void testConfigurationAndSetters() {
        StdDateFormat df = new StdDateFormat();
        
        // TimeZone manipulation
        TimeZone tz = TimeZone.getTimeZone("PST");
        df.setTimeZone(tz);
        assertEquals(tz, df.getTimeZone());
        
        // Setting same timezone should do nothing branch
        df.setTimeZone(tz);
        
        // Leniency manipulation
        df.setLenient(false);
        assertFalse(df.isLenient());
        df.setLenient(false); // duplicate branch

        df.setLenient(true);
        assertTrue(df.isLenient());

        // withTimeZone & withLocale branches
        StdDateFormat tzCustom = df.withTimeZone(null);
        assertNotNull(tzCustom);
        
        StdDateFormat tzSame = df.withTimeZone(tz);
        assertSame(df, tzSame);

        StdDateFormat tzNew = df.withTimeZone(TimeZone.getTimeZone("EST"));
        assertNotNull(tzNew);

        StdDateFormat locSame = df.withLocale(Locale.US);
        assertSame(df, locSame);

        StdDateFormat locNew = df.withLocale(Locale.GERMANY);
        assertNotNull(locNew);

        // Cloning
        StdDateFormat cloned = df.clone();
        assertNotNull(cloned);
    }

    @Test
    public void formatAndMiscMethods() {
        StdDateFormat df = new StdDateFormat();
        
        // Format method
        StringBuffer sb = new StringBuffer();
        df.format(new Date(0L), sb, new java.text.FieldPosition(0));
        assertTrue(sb.length() > 0);

        // Format method second call to cover cached _formatISO8601 != null branch
        StringBuffer sb2 = new StringBuffer();
        df.format(new Date(0L), sb2, new java.text.FieldPosition(0));
        assertTrue(sb2.length() > 0);

        // toString, equals, hashCode
        String str = df.toString();
        assertTrue(str.contains("StdDateFormat"));

        assertTrue(df.equals(df));
        assertFalse(df.equals(new Object()));

        assertEquals(System.identityHashCode(df), df.hashCode());
        
        // Static helpers
        assertNotNull(StdDateFormat.getDefaultTimeZone());
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault(), Locale.US));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault(), Locale.US));
    }
}