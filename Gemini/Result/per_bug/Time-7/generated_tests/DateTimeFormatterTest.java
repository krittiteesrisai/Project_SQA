package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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

public class DateTimeFormatterTest {

    private DateTimeZone originalDateTimeZone = null;
    private Locale originalLocale = null;

    private DateTimeFormatter formatter;
    private DateTimeFormatter printOnlyFormatter;
    private DateTimeFormatter parseOnlyFormatter;

    @Before
    public void setUp() throws Exception {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.UK);

        formatter = ISODateTimeFormat.dateTime();
        printOnlyFormatter = new DateTimeFormatter(formatter.getPrinter(), null);
        parseOnlyFormatter = new DateTimeFormatter(null, formatter.getParser());
    }

    @After
    public void tearDown() throws Exception {
        DateTimeZone.setDefault(originalDateTimeZone);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // Modifier Methods (withXxx) & Property Getters
    // -----------------------------------------------------------------------

    @Test
    public void testWithLocale_IdentityAndChange() {
        assertNull(formatter.getLocale());
        
        DateTimeFormatter fWithUK = formatter.withLocale(Locale.UK);
        assertEquals(Locale.UK, fWithUK.getLocale());
        
        // Same locale instance should return this
        assertSame(fWithUK, fWithUK.withLocale(Locale.UK));
        // Equal locale instance should return this
        assertSame(fWithUK, fWithUK.withLocale(new Locale("en", "GB")));
        // Null when currently null
        assertSame(formatter, formatter.withLocale(null));
        
        DateTimeFormatter fWithFR = fWithUK.withLocale(Locale.FRENCH);
        assertEquals(Locale.FRENCH, fWithFR.getLocale());
    }

    @Test
    public void testWithOffsetParsed() {
        assertFalse(formatter.isOffsetParsed());
        
        DateTimeFormatter fOffsetParsed = formatter.withOffsetParsed();
        assertTrue(fOffsetParsed.isOffsetParsed());
        assertNull(fOffsetParsed.getZone());
        
        // Calling withOffsetParsed when already true returns this
        assertSame(fOffsetParsed, fOffsetParsed.withOffsetParsed());
        
        // Setting zone resets offsetParsed
        DateTimeFormatter fWithZone = fOffsetParsed.withZone(DateTimeZone.UTC);
        assertFalse(fWithZone.isOffsetParsed());
        assertEquals(DateTimeZone.UTC, fWithZone.getZone());
    }

    @Test
    public void testWithChronology() {
        assertNull(formatter.getChronology());
        assertNull(formatter.getChronolgy()); // test deprecated method
        
        Chronology gj = GJChronology.getInstanceUTC();
        DateTimeFormatter fChrono = formatter.withChronology(gj);
        assertSame(gj, fChrono.getChronology());
        assertSame(gj, fChrono.getChronolgy());
        
        // Same instance returns this
        assertSame(fChrono, fChrono.withChronology(gj));
        
        DateTimeFormatter fChronoNull = fChrono.withChronology(null);
        assertNull(fChronoNull.getChronology());
    }

    @Test
    public void testWithZoneAndZoneUTC() {
        assertNull(formatter.getZone());
        
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter fParis = formatter.withZone(paris);
        assertEquals(paris, fParis.getZone());
        assertSame(fParis, fParis.withZone(paris));
        
        DateTimeFormatter fUtc = fParis.withZoneUTC();
        assertEquals(DateTimeZone.UTC, fUtc.getZone());
        
        DateTimeFormatter fNullZone = fUtc.withZone(null);
        assertNull(fNullZone.getZone());
    }

    @Test
    public void testWithPivotYear() {
        assertNull(formatter.getPivotYear());
        
        DateTimeFormatter fPivot = formatter.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), fPivot.getPivotYear());
        
        // Same Integer instance / equality
        assertSame(fPivot, fPivot.withPivotYear(2000));
        assertSame(fPivot, fPivot.withPivotYear(Integer.valueOf(2000)));
        
        DateTimeFormatter fPivotNull = fPivot.withPivotYear((Integer) null);
        assertNull(fPivotNull.getPivotYear());
        
        DateTimeFormatter fPivot2020 = fPivot.withPivotYear(2020);
        assertEquals(Integer.valueOf(2020), fPivot2020.getPivotYear());
    }

    @Test
    public void testWithDefaultYear() {
        assertEquals(2000, formatter.getDefaultYear());
        
        DateTimeFormatter fDefaultYear = formatter.withDefaultYear(1996);
        assertEquals(1996, fDefaultYear.getDefaultYear());
    }

    @Test
    public void testPrinterParserCapabilities() {
        assertTrue(formatter.isPrinter());
        assertTrue(formatter.isParser());
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());

        assertTrue(printOnlyFormatter.isPrinter());
        assertFalse(printOnlyFormatter.isParser());
        assertNotNull(printOnlyFormatter.getPrinter());
        assertNull(printOnlyFormatter.getParser());

        assertFalse(parseOnlyFormatter.isPrinter());
        assertTrue(parseOnlyFormatter.isParser());
        assertNull(parseOnlyFormatter.getPrinter());
        assertNotNull(parseOnlyFormatter.getParser());
    }

    // -----------------------------------------------------------------------
    // Printing Branches & Edge Cases
    // -----------------------------------------------------------------------

    @Test
    public void testPrintReadableInstant() throws IOException {
        DateTime dt = new DateTime(2020, 5, 12, 10, 30, 0, 0, DateTimeZone.UTC);
        String expected = "2020-05-12T10:30:00.000Z";
        
        assertEquals(expected, formatter.print(dt));
        
        // Test null instant defaults to DateTimeUtils.currentTimeMillis()
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        try {
            assertEquals(expected, formatter.print((DateTime) null));
            
            StringBuffer sb = new StringBuffer();
            formatter.printTo(sb, (DateTime) null);
            assertEquals(expected, sb.toString());
            
            StringWriter sw = new StringWriter();
            formatter.printTo(sw, (DateTime) null);
            assertEquals(expected, sw.toString());
            
            StringBuilder sBuilder = new StringBuilder();
            formatter.printTo((Appendable) sBuilder, (DateTime) null);
            assertEquals(expected, sBuilder.toString());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void testPrintMillisAndAppendables() throws IOException {
        long millis = 1589279400000L; // 2020-05-12T10:30:00.000Z
        String expected = "2020-05-12T10:30:00.000Z";
        
        assertEquals(expected, formatter.print(millis));
        
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, millis);
        assertEquals(expected, buf.toString());
        
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, millis);
        assertEquals(expected, writer.toString());
        
        StringBuilder appendable = new StringBuilder();
        formatter.printTo((Appendable) appendable, millis);
        assertEquals(expected, appendable.toString());
    }

    @Test
    public void testPrintReadablePartial() throws IOException {
        DateTimeFormatter partialFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate date = new LocalDate(2020, 5, 12);
        String expected = "2020-05-12";
        
        assertEquals(expected, partialFormatter.print(date));
        
        StringBuffer buf = new StringBuffer();
        partialFormatter.printTo(buf, date);
        assertEquals(expected, buf.toString());
        
        StringWriter writer = new StringWriter();
        partialFormatter.printTo(writer, date);
        assertEquals(expected, writer.toString());
        
        CharArrayWriter charWriter = new CharArrayWriter();
        partialFormatter.printTo((Appendable) charWriter, date);
        assertEquals(expected, charWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintPartialNullToBufferThrowsException() {
        formatter.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintPartialNullToWriterThrowsException() throws IOException {
        formatter.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrintWhenPrintingNotSupported() {
        parseOnlyFormatter.print(new DateTime());
    }

    @Test
    public void testPrintZoneOffsetOverflowRevertsToUTC() {
        DateTimeZone extremeZone = DateTimeZone.forOffsetHours(5);
        DateTimeFormatter f = ISODateTimeFormat.year().withZone(extremeZone);
        
        // Long.MAX_VALUE with positive offset causes overflow: (instant ^ adjustedInstant) < 0
        String result = f.print(Long.MAX_VALUE);
        assertNotNull(result);
        
        StringWriter writer = new StringWriter();
        try {
            f.printTo(writer, Long.MAX_VALUE);
            assertNotNull(writer.toString());
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }

    // -----------------------------------------------------------------------
    // Parsing Branches & Edge Cases
    // -----------------------------------------------------------------------

    @Test
    public void testParseIntoSuccessAndFailure() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        
        int nextPos = f.parseInto(mdt, "2022-12-25 15:30:00 extra", 0);
        assertEquals(19, nextPos);
        assertEquals(2022, mdt.getYear());
        assertEquals(12, mdt.getMonthOfYear());
        assertEquals(25, mdt.getDayOfMonth());
        assertEquals(15, mdt.getHourOfDay());

        // Parse failure returns negative value
        int failPos = f.parseInto(mdt, "invalid-date", 0);
        assertTrue(failPos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntoNullInstantThrowsException() {
        formatter.parseInto(null, "2020-05-12T10:30:00.000Z", 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseIntoWhenParsingNotSupported() {
        printOnlyFormatter.parseInto(new MutableDateTime(), "2020-05-12T10:30:00.000Z", 0);
    }

    @Test
    public void testParseIntoWithOffsetParsedAndZoneOverride() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd Z").withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        
        f.parseInto(mdt, "2020-05-12 +0200", 0);
        assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
        
        // Zone override on formatter
        DateTimeFormatter fWithZone = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.forOffsetHours(3));
        fWithZone.parseInto(mdt, "2020-05-12", 0);
        assertEquals(DateTimeZone.forOffsetHours(3), mdt.getZone());
    }

    @Test
    public void testParseMillis() {
        long millis = formatter.parseMillis("2020-05-12T10:30:00.000Z");
        assertEquals(1589279400000L, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillisIncompleteString() {
        formatter.parseMillis("2020-05-12T10:30:00.000Z extra text");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillisInvalidText() {
        formatter.parseMillis("invalid date text");
    }

    @Test
    public void testParseLocalDateAndLocalTime() {
        LocalDate localDate = formatter.parseLocalDate("2020-05-12T10:30:00.000Z");
        assertEquals(new LocalDate(2020, 5, 12), localDate);

        LocalTime localTime = formatter.parseLocalTime("2020-05-12T10:30:00.000Z");
        assertEquals(new LocalTime(10, 30, 0, 0), localTime);
    }

    @Test
    public void testParseLocalDateTime() {
        LocalDateTime ldt = formatter.parseLocalDateTime("2020-05-12T10:30:00.000Z");
        assertEquals(new LocalDateTime(2020, 5, 12, 10, 30, 0, 0), ldt);
        
        // Parse with offset parsed logic inside parseLocalDateTime
        DateTimeFormatter fWithOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        LocalDateTime ldt2 = fWithOffset.parseLocalDateTime("2020-05-12 10:30:00 +0300");
        assertNotNull(ldt2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTimeInvalid() {
        formatter.parseLocalDateTime("2020-05-12 invalid text");
    }

    @Test
    public void testParseDateTimeAndMutableDateTime() {
        DateTime dt = formatter.parseDateTime("2020-05-12T10:30:00.000Z");
        assertEquals(new DateTime(2020, 5, 12, 10, 30, 0, 0, DateTimeZone.UTC), dt);

        MutableDateTime mdt = formatter.parseMutableDateTime("2020-05-12T10:30:00.000Z");
        assertEquals(new MutableDateTime(2020, 5, 12, 10, 30, 0, 0, DateTimeZone.UTC), mdt);

        // With Zone override
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTime dtTokyo = formatter.withZone(tokyo).parseDateTime("2020-05-12T10:30:00.000Z");
        assertEquals(tokyo, dtTokyo.getZone());

        MutableDateTime mdtTokyo = formatter.withZone(tokyo).parseMutableDateTime("2020-05-12T10:30:00.000Z");
        assertEquals(tokyo, mdtTokyo.getZone());

        // With offset parsed
        DateTimeFormatter fOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z").withOffsetParsed();
        DateTime dtOffset = fOffset.parseDateTime("2020-05-12 10:30:00 +0530");
        assertEquals(DateTimeZone.forOffsetHoursMinutes(5, 30), dtOffset.getZone());

        MutableDateTime mdtOffset = fOffset.parseMutableDateTime("2020-05-12 10:30:00 -0400");
        assertEquals(DateTimeZone.forOffsetHours(-4), mdtOffset.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTimeIncomplete() {
        formatter.parseDateTime("2020-05-12T10:30:00.000Z trailing");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTimeIncomplete() {
        formatter.parseMutableDateTime("2020-05-12T10:30:00.000Z trailing");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTimeUnsupported() {
        printOnlyFormatter.parseDateTime("2020-05-12T10:30:00.000Z");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMutableDateTimeUnsupported() {
        printOnlyFormatter.parseMutableDateTime("2020-05-12T10:30:00.000Z");
    }

    @Test
    public void testChronologySelectionPreference() {
        Chronology buddhist = BuddhistChronology.getInstanceUTC();
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        
        DateTimeFormatter f = formatter.withChronology(buddhist).withZone(paris);
        DateTime parsed = f.parseDateTime("2563-05-12T10:30:00.000+02:00");
        
        assertEquals(paris, parsed.getZone());
        assertEquals(buddhist.withZone(paris), parsed.getChronology());
    }
}