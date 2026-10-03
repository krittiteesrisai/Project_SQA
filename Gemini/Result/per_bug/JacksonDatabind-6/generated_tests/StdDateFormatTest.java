package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    @Test
    public void testConstructorsAndGetters() {
        StdDateFormat fmt1 = new StdDateFormat();
        assertNotNull(fmt1);
        assertEquals(TimeZone.getTimeZone("GMT"), StdDateFormat.getDefaultTimeZone());
        assertNotNull(StdDateFormat.getBlueprintISO8601Format());
        assertNotNull(StdDateFormat.getBlueprintRFC1123Format());
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault()));
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getDefault(), Locale.US));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getDefault(), Locale.US));

        StdDateFormat fmt2 = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(fmt2);
        
        @SuppressWarnings("deprecation")
        StdDateFormat fmt3 = new StdDateFormat(TimeZone.getTimeZone("UTC"));
        assertNotNull(fmt3);
    }

    @Test
    public void testWithTimeZone() {
        StdDateFormat base = StdDateFormat.instance;
        // null timezone branch
        StdDateFormat withNullTz = base.withTimeZone(null);
        assertNotNull(withNullTz);

        // same timezone branch
        StdDateFormat withSameTz = base.withTimeZone(TimeZone.getTimeZone("GMT"));
        assertSame(base, withSameTz);

        // different timezone branch
        StdDateFormat withDiffTz = base.withTimeZone(TimeZone.getTimeZone("PST"));
        assertNotNull(withDiffTz);
        assertNotSame(base, withDiffTz);
    }

    @Test
    public void testWithLocale() {
        StdDateFormat base = StdDateFormat.instance;
        // same locale branch
        StdDateFormat withSameLocale = base.withLocale(Locale.US);
        assertSame(base, withSameLocale);

        // different locale branch
        StdDateFormat withDiffLocale = base.withLocale(Locale.GERMAN);
        assertNotNull(withDiffLocale);
        assertNotSame(base, withDiffLocale);
    }

    @Test
    public void testClone() {
        StdDateFormat base = StdDateFormat.instance;
        StdDateFormat cloned = base.clone();
        assertNotNull(cloned);
        assertNotSame(base, cloned);
    }

    @Test
    public void testSetTimeZone() {
        StdDateFormat fmt = new StdDateFormat();
        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("PST");
        
        fmt.setTimeZone(tz1); // same timezone, should do nothing
        fmt.setTimeZone(tz2); // different timezone, should reset cached formats
        assertEquals(tz2, fmt._timezone);
    }

    @Test
    public void testParseISO8601Plain() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        Date date = fmt.parse("2020-05-01");
        assertNotNull(date);
    }

    @Test
    public void testParseISO8601Zulu() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        // With milliseconds
        Date date1 = fmt.parse("2020-05-01T12:30:45.123Z");
        assertNotNull(date1);

        // Missing milliseconds (triggers colon check branch for Z)
        Date date2 = fmt.parse("2020-05-01T12:30:45Z");
        assertNotNull(date2);
    }

    @Test
    public void testParseISO8601WithTimezoneOffsets() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        // Offset with colon (+hh:mm)
        Date date1 = fmt.parse("2020-05-01T12:30:45.123+02:00");
        assertNotNull(date1);

        // Offset missing minutes (+hh)
        Date date2 = fmt.parse("2020-05-01T12:30:45.123+02");
        assertNotNull(date2);

        // Offset without colon (+hhmm)
        Date date3 = fmt.parse("2020-05-01T12:30:45.123+0200");
        assertNotNull(date3);

        // Partial time / missing seconds
        Date date4 = fmt.parse("2020-05-01T12+0200");
        assertNotNull(date4);
    }

    @Test
    public void testParseISO8601WithoutTimezone() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        Date date = fmt.parse("2020-05-01T12:30:45");
        assertNotNull(date);
        
        Date dateShortTime = fmt.parse("2020-05-01T12");
        assertNotNull(dateShortTime);
    }

    @Test
    public void testParseNumericTimestamp() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        // Positive timestamp
        Date date1 = fmt.parse("1588334400000");
        assertNotNull(date1);

        // Negative timestamp
        Date date2 = fmt.parse("-1588334400000");
        assertNotNull(date2);
    }

    @Test
    public void testParseRFC1123Fallback() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        Date date = fmt.parse("Fri, 01 May 2020 12:30:45 GMT");
        assertNotNull(date);
    }

    @Test(expected = ParseException.class)
    public void testParseFailureThrowsException() throws ParseException {
        StdDateFormat fmt = StdDateFormat.instance;
        fmt.parse("Invalid-Date-String-12345");
    }

    @Test
    public void testParseWithParsePosition() {
        StdDateFormat fmt = StdDateFormat.instance;
        ParsePosition pos = new ParsePosition(0);
        Date date = fmt.parse("2020-05-01", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());

        // Invalid parse with position
        ParsePosition invalidPos = new ParsePosition(0);
        Date invalidDate = fmt.parse("NotADate", invalidPos);
        assertNull(invalidDate);
    }

    @Test
    public void testFormat() {
        StdDateFormat fmt = StdDateFormat.instance;
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fmt.format(new Date(0L), sb, new java.text.FieldPosition(0));
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testToString() {
        StdDateFormat fmt = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US);
        String str = fmt.toString();
        assertNotNull(str);
        assertTrue(str.contains("StdDateFormat"));
    }

    @Test
    public void testCloneFormatCustomLocale() {
        // Test _cloneFormat with non-default locale
        StdDateFormat fmt = new StdDateFormat(TimeZone.getDefault(), Locale.GERMAN);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fmt.format(new Date(0L), sb, new java.text.FieldPosition(0));
        assertNotNull(result);
    }
}