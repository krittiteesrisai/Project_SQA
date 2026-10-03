package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeFormatterTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone FIXED_PLUS_2 = DateTimeZone.forOffsetHours(2);

    private DateTimeZone originalDefaultZone;
    private Locale originalDefaultLocale;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalDefaultLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        Locale.setDefault(originalDefaultLocale);
    }

    // -----------------------------------------------------------------------
    // Printer / Parser Availability Tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsPrinterAndIsParser() {
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, DateTimeFormat.forPattern("yyyy").getParser());
        assertFalse(parserOnly.isPrinter());
        assertTrue(parserOnly.isParser());
        assertNull(parserOnly.getPrinter());
        assertNotNull(parserOnly.getParser());

        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        assertTrue(printerOnly.isPrinter());
        assertFalse(printerOnly.isParser());
        assertNotNull(printerOnly.getPrinter());
        assertNull(printerOnly.getParser());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequirePrinterThrowsExceptionWhenNull() {
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, DateTimeFormat.forPattern("yyyy").getParser());
        parserOnly.print(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParserThrowsExceptionWhenNull() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseMillis("2024");
    }

    // -----------------------------------------------------------------------
    // Modifier Methods Branch Coverage (withLocale, withZone, withChronology, etc.)
    // -----------------------------------------------------------------------

    @Test
    public void testWithLocaleBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("MMMM").withLocale(Locale.ENGLISH);
        assertSame("Same locale instance should return this", f, f.withLocale(Locale.ENGLISH));
        assertSame("Equal locale should return this", f, f.withLocale(new Locale("en")));

        DateTimeFormatter fFrench = f.withLocale(Locale.FRENCH);
        assertNotSame(f, fFrench);
        assertEquals(Locale.FRENCH, fFrench.getLocale());

        DateTimeFormatter fNull = fFrench.withLocale(null);
        assertNull(fNull.getLocale());
    }

    @Test
    public void testWithOffsetParsedBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        assertFalse(f.isOffsetParsed());

        DateTimeFormatter fOffset = f.withOffsetParsed();
        assertTrue(fOffset.isOffsetParsed());
        assertSame("Calling withOffsetParsed when already parsed returns this", fOffset, fOffset.withOffsetParsed());

        DateTimeFormatter fZoneReset = fOffset.withZone(PARIS);
        assertFalse("Calling withZone resets offsetParsed flag", fZoneReset.isOffsetParsed());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testWithChronologyBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        assertNull(f.getChronology());
        assertNull(f.getChronolgy());

        DateTimeFormatter fBuddhist = f.withChronology(BuddhistChronology.getInstanceUTC());
        assertEquals(BuddhistChronology.getInstanceUTC(), fBuddhist.getChronology());
        assertSame("Same chronology returns this", fBuddhist, fBuddhist.withChronology(BuddhistChronology.getInstanceUTC()));

        DateTimeFormatter fISO = fBuddhist.withChronology(ISOChronology.getInstanceUTC());
        assertEquals(ISOChronology.getInstanceUTC(), fISO.getChronology());
    }

    @Test
    public void testWithZoneAndWithZoneUTCBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        assertNull(f.getZone());

        DateTimeFormatter fParis = f.withZone(PARIS);
        assertEquals(PARIS, fParis.getZone());
        assertSame("Same zone returns this", fParis, fParis.withZone(PARIS));

        DateTimeFormatter fUTC = fParis.withZoneUTC();
        assertEquals(DateTimeZone.UTC, fUTC.getZone());
    }

    @Test
    public void testWithPivotYearBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yy-MM-dd");
        assertNull(f.getPivotYear());

        DateTimeFormatter fPivot2000 = f.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), fPivot2000.getPivotYear());
        assertSame("Same pivot year returns this", fPivot2000, fPivot2000.withPivotYear(2000));
        assertSame("Same pivot year object returns this", fPivot2000, fPivot2000.withPivotYear(Integer.valueOf(2000)));

        DateTimeFormatter fPivotNull = fPivot2000.withPivotYear((Integer) null);
        assertNull(fPivotNull.getPivotYear());
    }

    @Test
    public void testWithDefaultYearBranching() {
        DateTimeFormatter f = DateTimeFormat.forPattern("MM-dd");
        assertEquals(2000, f.getDefaultYear());

        DateTimeFormatter fDefault2020 = f.withDefaultYear(2020);
        assertEquals(2020, fDefault2020.getDefaultYear());
    }

    // -----------------------------------------------------------------------
    // Printing Methods & Overflow Branch
    // -----------------------------------------------------------------------

    @Test
    public void testPrintReadableInstant() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(DateTimeZone.UTC);
        DateTime dt = new DateTime(2024, 5, 1, 12, 30, 0, DateTimeZone.UTC);

        assertEquals("2024-05-01 12:30:00", f.print(dt));

        StringBuffer sb = new StringBuffer();
        f.printTo(sb, dt);
        assertEquals("2024-05-01 12:30:00", sb.toString());

        StringWriter sw = new StringWriter();
        f.printTo(sw, dt);
        assertEquals("2024-05-01 12:30:00", sw.toString());

        StringBuilder sBuilder = new StringBuilder();
        f.printTo((Appendable) sBuilder, dt);
        assertEquals("2024-05-01 12:30:00", sBuilder.toString());

        // Test null instant -> formats current time (should not throw exception)
        assertNotNull(f.print((DateTime) null));
    }

    @Test
    public void testPrintMillisAndAppenders() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.UTC);
        long millis = 0L; // 1970-01-01

        assertEquals("1970-01-01", f.print(millis));

        StringBuffer sb = new StringBuffer();
        f.printTo(sb, millis);
        assertEquals("1970-01-01", sb.toString());

        CharArrayWriter writer = new CharArrayWriter();
        f.printTo(writer, millis);
        assertEquals("1970-01-01", writer.toString());

        StringBuilder app = new StringBuilder();
        f.printTo((Appendable) app, millis);
        assertEquals("1970-01-01", app.toString());
    }

    @Test
    public void testPrintReadablePartial() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime time = new LocalTime(15, 45, 30);

        assertEquals("15:45:30", f.print(time));

        StringBuffer sb = new StringBuffer();
        f.printTo(sb, time);
        assertEquals("15:45:30", sb.toString());

        StringWriter sw = new StringWriter();
        f.printTo(sw, time);
        assertEquals("15:45:30", sw.toString());

        StringBuilder app = new StringBuilder();
        f.printTo((Appendable) app, time);
        assertEquals("15:45:30", app.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintReadablePartialNullThrowsException() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.print((ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToWriterReadablePartialNullThrowsException() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test
    public void testPrintTimeZoneOffsetOverflowBranch() {
        // Instant + Positive offset overflowing Long.MAX_VALUE
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(FIXED_PLUS_2);
        long maxMillis = Long.MAX_VALUE - 1000L; // Adding 2 hours (7,200,000 millis) causes overflow
        
        // When overflow is detected, it falls back to UTC without throwing arithmetic exception
        String result = f.print(maxMillis);
        assertNotNull(result);
    }

    // -----------------------------------------------------------------------
    // Parsing Branch Coverage & Defects4J Time-16 Fault Scenarios
    // -----------------------------------------------------------------------

    @Test
    public void testParseIntoSuccessAndFailure() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);

        int pos = f.parseInto(mdt, "2024-05-18", 0);
        assertEquals(10, pos);
        assertEquals(2024, mdt.getYear());
        assertEquals(5, mdt.getMonthOfYear());
        assertEquals(18, mdt.getDayOfMonth());

        // Partial invalid parse returns negative complement index
        int failPos = f.parseInto(mdt, "2024-XX-18", 0);
        assertTrue(failPos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntoNullInstantThrowsException() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.parseInto(null, "2024-01-01", 0);
    }

    @Test
    public void testParseIntoWithOffsetParsedAndZone() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm Z").withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(0L, PARIS);

        f.parseInto(mdt, "2024-05-18 10:00 +0300", 0);
        assertEquals(DateTimeZone.forOffsetHours(3), mdt.getZone());

        // Test with explicit formatter zone override applied on instant
        DateTimeFormatter fWithZone = f.withZone(LONDON);
        fWithZone.parseInto(mdt, "2024-05-18 10:00 +0300", 0);
        assertEquals(LONDON, mdt.getZone());
    }

    @Test
    public void testParseIntoMonthOnlyMaintainsInstantYear() {
        // Defects4J Time-16 targeted scenario: Month parsing without year should respect instant's year
        DateTimeFormatter f = DateTimeFormat.forPattern("MMMM").withLocale(Locale.ENGLISH);
        
        MutableDateTime mdt = new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, DateTimeZone.UTC);
        f.parseInto(mdt, "February", 0);
        assertEquals(2004, mdt.getYear());
        assertEquals(2, mdt.getMonthOfYear());
        assertEquals(29, mdt.getDayOfMonth());
    }

    @Test
    public void testParseMillisSuccessAndFailures() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        long millis = f.parseMillis("2024-01-01 00:00:00");
        assertEquals(new DateTime(2024, 1, 1, 0, 0, 0, DateTimeZone.UTC).getMillis(), millis);

        // Incomplete text parse throws IllegalArgumentException
        try {
            f.parseMillis("2024-01-01 00:00:00 extra text");
            fail("Expected IllegalArgumentException for unparsed extra text");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("extra text"));
        }

        // Invalid format parse failure throws IllegalArgumentException
        try {
            f.parseMillis("INVALID_DATE");
            fail("Expected IllegalArgumentException for invalid input");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testParseLocalDateTimeAndLocalComponents() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        
        LocalDateTime ldt = f.parseLocalDateTime("2024-06-15 14:30:45");
        assertEquals(new LocalDateTime(2024, 6, 15, 14, 30, 45), ldt);

        LocalDate ld = f.parseLocalDate("2024-06-15 14:30:45");
        assertEquals(new LocalDate(2024, 6, 15), ld);

        LocalTime lt = f.parseLocalTime("2024-06-15 14:30:45");
        assertEquals(new LocalTime(14, 30, 45), lt);

        // Parse local date time with parsed offset branch
        DateTimeFormatter fOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        LocalDateTime ldtOffset = fOffset.parseLocalDateTime("2024-06-15 14:30:45 +0500");
        assertEquals(2024, ldtOffset.getYear());
        assertEquals(14, ldtOffset.getHourOfDay());
    }

    @Test
    public void testParseDateTimeAndMutableDateTimeBranches() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");

        // Case 1: withOffsetParsed enabled
        DateTimeFormatter fOffset = f.withOffsetParsed();
        DateTime dtOffset = fOffset.parseDateTime("2024-06-15 12:00:00 +0400");
        assertEquals(DateTimeZone.forOffsetHours(4), dtOffset.getZone());

        MutableDateTime mdtOffset = fOffset.parseMutableDateTime("2024-06-15 12:00:00 +0400");
        assertEquals(DateTimeZone.forOffsetHours(4), mdtOffset.getZone());

        // Case 2: Formatter has an override zone
        DateTimeFormatter fWithZone = f.withZone(NEW_YORK);
        DateTime dtWithZone = fWithZone.parseDateTime("2024-06-15 12:00:00 +0000");
        assertEquals(NEW_YORK, dtWithZone.getZone());

        MutableDateTime mdtWithZone = fWithZone.parseMutableDateTime("2024-06-15 12:00:00 +0000");
        assertEquals(NEW_YORK, mdtWithZone.getZone());

        // Case 3: Zone name parsed from text
        DateTimeFormatter fZoneName = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss zzz");
        DateTime dtZone = fZoneName.parseDateTime("2024-06-15 12:00:00 UTC");
        assertEquals(DateTimeZone.UTC, dtZone.getZone());
    }

    @Test
    public void testSelectChronologyPrecedence() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd")
                .withChronology(BuddhistChronology.getInstanceUTC())
                .withZone(PARIS);

        DateTime dt = f.parseDateTime("2567-05-18");
        assertEquals(PARIS, dt.getZone());
        assertTrue(dt.getChronology() instanceof BuddhistChronology);
    }
}