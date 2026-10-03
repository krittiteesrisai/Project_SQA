package com.google.gson.internal.bind.util;

import org.junit.Test;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class ISO8601UtilsTest {

    @Test
    public void testFormatDefaultUtcWithoutMillis() {
        // 2023-01-15 12:30:45 UTC
        Date date = new Date(1673785845000L); 
        String formatted = ISO8601Utils.format(date);
        assertEquals("2023-01-15T12:30:45Z", formatted);
    }

    @Test
    public void testFormatWithMillisAndCustomTimezone() {
        // Test with millis = true and non-zero offset (+02:00 and -05:00)
        Date date = new Date(1673785845123L);
        TimeZone tzPlus = TimeZone.getTimeZone("GMT+02:00");
        String formattedPlus = ISO8601Utils.format(date, true, tzPlus);
        assertTrue(formattedPlus.startsWith("2023-01-15T14:30:45.123+02:00"));

        TimeZone tzMinus = TimeZone.getTimeZone("GMT-05:00");
        String formattedMinus = ISO8601Utils.format(date, true, tzMinus);
        assertTrue(formattedMinus.startsWith("2023-01-15T07:30:45.123-05:00"));
    }

    @Test
    public void testParseDateOnlyWithHyphens() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-01-15", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseFullDateTimeWithZ() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // Includes seconds and 3-digit millis
        Date date = ISO8601Utils.parse("2023-01-15T12:30:45.123Z", pos);
        assertNotNull(date);
        assertEquals(24, pos.getIndex());
    }

    @Test
    public void testParseDateTimeWith1And2DigitMillis() throws ParseException {
        // 1 digit millis (.1 -> 100ms)
        ParsePosition pos1 = new ParsePosition(0);
        Date d1 = ISO8601Utils.parse("2023-01-15T12:30:45.1Z", pos1);
        assertNotNull(d1);

        // 2 digit millis (.12 -> 120ms)
        ParsePosition pos2 = new ParsePosition(0);
        Date d2 = ISO8601Utils.parse("2023-01-15T12:30:45.12Z", pos2);
        assertNotNull(d2);
    }

    @Test
    public void testParseLeapSecondTruncation() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // seconds = 60 should be truncated to 59
        Date date = ISO8601Utils.parse("2023-01-15T12:30:60Z", pos);
        assertNotNull(date);
    }

    @Test
    public void testParseTimezoneOffsets() throws ParseException {
        // +00:00 and +0000 special handling
        ParsePosition pos1 = new ParsePosition(0);
        assertNotNull(ISO8601Utils.parse("2023-01-15T12:30:45+00:00", pos1));

        ParsePosition pos2 = new ParsePosition(0);
        assertNotNull(ISO8601Utils.parse("2023-01-15T12:30:45+0000", pos2));

        // +02:00 custom offset
        ParsePosition pos3 = new ParsePosition(0);
        assertNotNull(ISO8601Utils.parse("2023-01-15T12:30:45+02:00", pos3));
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidNumberFormat() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // Year contains non-digit character
        ISO8601Utils.parse("202A-01-15T12:30:45Z", pos);
    }

    @Test(expected = ParseException.class)
    public void testParseMissingTimeZone() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // Missing Z or offset
        ISO8601Utils.parse("2023-01-15T12:30:45", pos);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidTimeZoneIndicator() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // 'X' is invalid timezone indicator
        ISO8601Utils.parse("2023-01-15T12:30:45X", pos);
    }

    @Test(expected = ParseException.class)
    public void testParseMismatchingTimeZone() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // Triggers mismatching timezone ID check
        ISO8601Utils.parse("2023-01-15T12:30:45+99:99", pos);
    }
    
    @Test(expected = ParseException.class)
    public void testParseOutOfBounds() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        // String too short
        ISO8601Utils.parse("2023", pos);
    }
}