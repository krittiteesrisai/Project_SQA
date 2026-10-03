package com.fasterxml.jackson.databind.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class StdDateFormatTest {

    private StdDateFormat stdDateFormat;

    @Before
    public void setUp() {
        stdDateFormat = new StdDateFormat();
    }

    @After
    public void tearDown() {
        stdDateFormat = null;
    }

    @Test
    public void testLifecycleAndDefaults() {
        assertNotNull(StdDateFormat.getDefaultTimeZone());
        assertEquals(TimeZone.getTimeZone("UTC"), StdDateFormat.getDefaultTimeZone());
        assertTrue(stdDateFormat.isLenient());
        
        stdDateFormat = new StdDateFormat(TimeZone.getDefault(), Locale.US, Boolean.FALSE);
        assertFalse(stdDateFormat.isLenient());
        assertEquals(Boolean.FALSE, stdDateFormat._lenient);
    }

    @Test
    public void testWithTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        StdDateFormat updated = stdDateFormat.withTimeZone(tz);
        assertNotSame(stdDateFormat, updated);
        assertEquals(tz, updated.getTimeZone());

        // Branch: tz == null -> defaults to UTC
        StdDateFormat nullTz = stdDateFormat.withTimeZone(null);
        assertEquals(TimeZone.getTimeZone("UTC"), nullTz.getTimeZone());

        // Branch: tz equals current timezone
        StdDateFormat sameTz = updated.withTimeZone(tz);
        assertSame(updated, sameTz);
    }

    @Test
    public void testWithLocale() {
        Locale loc = Locale.GERMAN;
        StdDateFormat updated = stdDateFormat.withLocale(loc);
        assertNotSame(stdDateFormat, updated);

        // Branch: loc equals current locale
        StdDateFormat sameLoc = updated.withLocale(loc);
        assertSame(updated, sameLoc);
    }

    @Test
    public void testClone() {
        StdDateFormat cloned = stdDateFormat.clone();
        assertNotNull(cloned);
        assertNotSame(stdDateFormat, cloned);
        assertEquals(stdDateFormat.isLenient(), cloned.isLenient());
    }

    @Test
    public void testSetTimeZone() {
        TimeZone newTz = TimeZone.getTimeZone("PST");
        stdDateFormat.setTimeZone(newTz);
        assertEquals(newTz, stdDateFormat.getTimeZone());

        // Setting same timezone should not clear formats unnecessarily
        stdDateFormat.setTimeZone(newTz);
        assertEquals(newTz, stdDateFormat.getTimeZone());
    }

    @Test
    public void testToString() {
        String str = stdDateFormat.toString();
        assertTrue(str.contains("StdDateFormat"));
        assertTrue(str.contains("locale: US"));

        stdDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertTrue(stdDateFormat.toString().contains("timezone:"));
    }

    @Test
    public void testParseISO8601PlainDate() throws ParseException {
        Date date = stdDateFormat.parse("2023-05-15");
        assertNotNull(date);
    }

    @Test
    public void testParseISO8601ZuluFormat() throws ParseException {
        // With millis and colon in Z
        Date date1 = stdDateFormat.parse("2023-05-15T12:30:45.123Z");
        assertNotNull(date1);

        // Without millis, with colon before Z
        Date date2 = stdDateFormat.parse("2023-05-15T12:30:45:Z");
        assertNotNull(date2);
    }

    @Test
    public void testParseISO8601WithTimezoneVariations() throws ParseException {
        // Offset with colon
        Date d1 = stdDateFormat.parse("2023-05-15T12:30:45.123+02:00");
        assertNotNull(d1);

        // Offset without minutes (+02)
        Date d2 = stdDateFormat.parse("2023-05-15T12:30:45.123+02");
        assertNotNull(d2);

        // Various timeLen cases for padding (e.g., missing seconds, partial millis)
        assertNotNull(stdDateFormat.parse("2023-05-15T12Z")); // case 5
        assertNotNull(stdDateFormat.parse("2023-05-15T12:30Z")); // case 6
        assertNotNull(stdDateFormat.parse("2023-05-15T12:30:45Z")); // case 8
        assertNotNull(stdDateFormat.parse("2023-05-15T12:30:45.1Z")); // case 9
        assertNotNull(stdDateFormat.parse("2023-05-15T12:30:45.12Z")); // case 10
        assertNotNull(stdDateFormat.parse("2023-05-15T12:30:45.1234Z")); // case 11
    }

    @Test
    public void testParseISO8601WithoutTimezone() throws ParseException {
        Date date = stdDateFormat.parse("2023-05-15T12:30:45");
        assertNotNull(date);
    }

    @Test
    public void testParseTimestampLong() throws ParseException {
        String positiveTimestamp = "1684152645000";
        Date date1 = stdDateFormat.parse(positiveTimestamp);
        assertNotNull(date1);

        String negativeTimestamp = "-62135596800000";
        Date date2 = stdDateFormat.parse(negativeTimestamp);
        assertNotNull(date2);
    }

    @Test
    public void testParseRFC1123Fallback() throws ParseException {
        String rfc1123Date = "Wed, 15 May 2023 12:30:45 GMT";
        // Since RFC1123 strict parsing depends on format, let's use a standard format string
        Date date = stdDateFormat.parse("Tue, 03 Jun 2008 11:05:30 GMT");
        assertNotNull(date);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidDateThrowsException() throws ParseException {
        stdDateFormat.parse("Invalid-Date-String-12345");
    }

    @Test
    public void testParseWithParsePosition() {
        ParsePosition pos = new ParsePosition(0);
        Date date = stdDateFormat.parse("2023-05-15", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());

        // Test fallback to timestamp with parse position
        ParsePosition posTs = new ParsePosition(0);
        Date dateTs = stdDateFormat.parse("1684152645000", posTs);
        assertNotNull(dateTs);

        // Test invalid format with ParsePosition returning null
        ParsePosition posErr = new ParsePosition(0);
        Date dateErr = stdDateFormat.parse("NotADate", posErr);
        // Might fall back to RFC1123 or return null/parse error position
    }

    @Test
    public void testFormat() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = stdDateFormat.format(new Date(0L), sb, new java.text.FieldPosition(0));
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testStaticGetFormats() {
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault(), Locale.US));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault(), Locale.US));
    }
}