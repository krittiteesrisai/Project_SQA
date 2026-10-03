package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

import static org.junit.Assert.*;

public class StdDateFormatTest {

    @Test
    public void testLifeCycleAndMutantFactories() {
        StdDateFormat df = new StdDateFormat();
        
        // TimeZone mutations
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        StdDateFormat dfWithGmt = df.withTimeZone(gmt);
        assertNotSame(df, dfWithGmt);
        assertSame(dfWithGmt, dfWithGmt.withTimeZone(gmt));
        assertSame(df, df.withTimeZone(null)); // Defaults to UTC

        // Locale mutations
        StdDateFormat dfWithUs = df.withLocale(Locale.US);
        assertSame(df, dfWithUs); // Same as DEFAULT_LOCALE
        StdDateFormat dfWithUk = df.withLocale(Locale.UK);
        assertNotSame(df, dfWithUk);

        // Lenient mutations
        StdDateFormat dfLenient = df.withLenient(Boolean.TRUE);
        assertSame(df, dfLenient); // Default is lenient
        StdDateFormat dfStrict = df.withLenient(Boolean.FALSE);
        assertNotSame(df, dfStrict);
        assertSame(dfStrict, dfStrict.withLenient(Boolean.FALSE));

        // Colon in TimeZone mutations
        StdDateFormat dfColon = df.withColonInTimeZone(true);
        assertNotSame(df, dfColon);
        assertSame(dfColon, dfColon.withColonInTimeZone(true));
        
        // Clone
        assertNotNull(df.clone());
        
        // toString & toPattern & equals & hashCode
        assertNotNull(df.toString());
        assertNotNull(df.toPattern());
        assertTrue(df.equals(df));
        assertFalse(df.equals(null));
        assertEquals(System.identityHashCode(df), df.hashCode());
    }

    @Test
    public void testSettersAndGetters() {
        StdDateFormat df = new StdDateFormat();
        
        TimeZone initialTz = df.getTimeZone();
        df.setTimeZone(StdDateFormat.getDefaultTimeZone()); // Same
        assertEquals(initialTz, df.getTimeZone());

        TimeZone cst = TimeZone.getTimeZone("CST");
        df.setTimeZone(cst);
        assertEquals(cst, df.getTimeZone());

        df.setLenient(false);
        assertFalse(df.isLenient());
        df.setLenient(false); // No change branch
        assertFalse(df.isLenient());

        assertFalse(df.isColonIncludedInTimeZone());
    }

    @Test
    public void testParsePlainAndISO8601() throws Exception {
        StdDateFormat df = new StdDateFormat();

        // Plain Date (length <= 10)
        Date dtPlain = df.parse("2020-05-15");
        assertNotNull(dtPlain);

        // ISO8601 with Z
        Date dtZ = df.parse("2020-05-15T10:15:30Z");
        assertNotNull(dtZ);

        // ISO8601 with timezone offset and colon
        Date dtOffsetColon = df.parse("2020-05-15T10:15:30.123+02:00");
        assertNotNull(dtOffsetColon);

        // ISO8601 with timezone offset without colon and short fractions
        Date dtOffsetNoColon = df.parse("2020-05-15T10:15:30.1-0500");
        assertNotNull(dtOffsetNoColon);

        // ISO8601 with 2-digit fraction
        Date dt2DigitFrac = df.parse("2020-05-15T10:15:30.12Z");
        assertNotNull(dt2DigitFrac);

        // ISO8601 without seconds but with offset
        Date dtNoSecs = df.parse("2020-05-15T10:15+0100");
        assertNotNull(dtNoSecs);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidFractionalSecondsNanos() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // > 9 digits fractional seconds should throw ParseException
        df.parse("2020-05-15T10:15:30.1234567890Z");
    }

    @Test
    public void testParseLongTimestamps() throws Exception {
        StdDateFormat df = new StdDateFormat();

        // Positive long
        Date dtPos = df.parse("1589537730000");
        assertNotNull(dtPos);

        // Negative long (databind #267)
        Date dtNeg = df.parse("-1589537730000");
        assertNotNull(dtNeg);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidLongOutOfRange() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // Out of 64-bit range
        df.parse("9999999999999999999999999999");
    }

    @Test
    public void testParseRFC1123Fallback() throws Exception {
        StdDateFormat df = new StdDateFormat();
        // RFC 1123 format string
        Date dtRfc = df.parse("Wed, 15 May 2020 10:15:30 GMT");
        assertNotNull(dtRfc);
    }

    @Test
    public void testParseWithParsePositionReturnsNull() {
        StdDateFormat df = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        // Invalid date that causes internal ParseException caught by parse(String, ParsePosition)
        Date dt = df.parse("Invalid-Date-String-12345", pos);
        assertNull(dt);
    }

    @Test(expected = ParseException.class)
    public void testParseCompletelyInvalidThrowsException() throws Exception {
        StdDateFormat df = new StdDateFormat();
        df.parse("Not-A-Date-At-All");
    }

    @Test
    public void testFormattingScenarios() {
        StdDateFormat df = new StdDateFormat();
        Date date = new Date(1589537730000L); // Fixed timestamp

        // Default UTC format (no colon)
        String formattedDefault = df.format(date);
        assertTrue(formattedDefault.endsWith("+0000") || formattedDefault.endsWith("Z"));

        // With colon in timezone
        StdDateFormat dfColon = df.withColonInTimeZone(true);
        String formattedColon = dfColon.format(date);
        assertTrue(formattedColon.contains("+00:00") || formattedColon.contains(":"));

        // Non-zero offset timezone
        TimeZone tzCustom = TimeZone.getTimeZone("GMT+03:30");
        StdDateFormat dfCustomTz = df.withTimeZone(tzCustom).withColonInTimeZone(true);
        String formattedCustom = dfCustomTz.format(date);
        assertTrue(formattedCustom.contains("+03:30"));
        
        // Null timezone fallback inside format
        StdDateFormat dfNullTz = new StdDateFormat(null, Locale.US, Boolean.TRUE, false);
        assertNotNull(dfNullTz.format(date));
    }
}