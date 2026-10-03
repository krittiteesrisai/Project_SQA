package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive test suite for DateTimeFormatterBuilder targeting branch coverage
 * and boundary/fault conditions.
 */
public class DateTimeFormatterBuilderTest {

    private DateTimeFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new DateTimeFormatterBuilder();
    }

    // =========================================================================
    // 1. Builder Life-cycle & State Tests (toFormatter, toPrinter, toParser, clear)
    // =========================================================================

    @Test
    public void testEmptyBuilderState() {
        assertFalse(builder.canBuildFormatter());
        assertFalse(builder.canBuildPrinter());
        assertFalse(builder.canBuildParser());

        try {
            builder.toFormatter();
            fail("Expected UnsupportedOperationException for empty builder");
        } catch (UnsupportedOperationException expected) {}

        try {
            builder.toPrinter();
            fail("Expected UnsupportedOperationException for empty builder");
        } catch (UnsupportedOperationException expected) {}

        try {
            builder.toParser();
            fail("Expected UnsupportedOperationException for empty builder");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test
    public void testClearResetsBuilder() {
        builder.appendLiteral("2023");
        assertTrue(builder.canBuildFormatter());
        builder.clear();
        assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void testPrinterOnlyAndParserOnly() {
        DateTimePrinter dummyPrinter = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        DateTimeParser dummyParser = new DateTimeFormatterBuilder().appendLiteral('P').toParser();

        DateTimeFormatterBuilder printerBuilder = new DateTimeFormatterBuilder().append(dummyPrinter);
        assertTrue(printerBuilder.canBuildPrinter());
        assertFalse(printerBuilder.canBuildParser());
        assertTrue(printerBuilder.canBuildFormatter());
        assertNotNull(printerBuilder.toPrinter());
        try {
            printerBuilder.toParser();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}

        DateTimeFormatterBuilder parserBuilder = new DateTimeFormatterBuilder().append(dummyParser);
        assertFalse(parserBuilder.canBuildPrinter());
        assertTrue(parserBuilder.canBuildParser());
        assertTrue(parserBuilder.canBuildFormatter());
        assertNotNull(parserBuilder.toParser());
        try {
            parserBuilder.toPrinter();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}
    }

    // =========================================================================
    // 2. Input Validation & Boundary Checks
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullFormatter() {
        builder.append((DateTimeFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullPrinter() {
        builder.append((DateTimePrinter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullParser() {
        builder.append((DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullPrinterAndParser() {
        builder.append(null, (DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullParsersArray() {
        builder.append(null, (DateTimeParser[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSingleNullParserInArray() {
        builder.append(null, new DateTimeParser[] { null });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendIncompleteParserArray() {
        DateTimeParser p1 = builder.appendLiteral('A').toParser();
        builder.clear();
        builder.append(null, new DateTimeParser[] { null, p1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullLiteral() {
        builder.appendLiteral((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimalNullField() {
        builder.appendDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimalInvalidDigits() {
        builder.appendDecimal(DateTimeFieldType.year(), -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimalInvalidDigits() {
        builder.appendFixedDecimal(DateTimeFieldType.year(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimalInvalidDigits() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimalInvalidBounds() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFractionNullField() {
        builder.appendFraction(null, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNullField() {
        builder.appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortTextNullField() {
        builder.appendShortText(null);
    }

    // =========================================================================
    // 3. Literals & Fixed/Padded/Unpadded Decimals
    // =========================================================================

    @Test
    public void testEmptyLiteralAndSingleCharLiteral() {
        builder.appendLiteral("")
               .appendLiteral('X')
               .appendLiteral("YZ");
        DateTimeFormatter formatter = builder.toFormatter();

        DateTime dt = formatter.parseDateTime("XYZ");
        assertNotNull(dt);
        assertEquals("XYZ", formatter.print(0L));
    }

    @Test
    public void testCaseInsensitiveLiterals() {
        DateTimeFormatter formatter = builder.appendLiteral("T").toFormatter();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2000);
        int pos = formatter.getParser().parseInto(bucket, "t", 0);
        assertEquals(1, pos);
    }

    @Test
    public void testUnpaddedAndPaddedDecimalPrintingAndParsing() {
        DateTimeFormatter formatter = builder
                .appendYear(1, 4)
                .appendLiteral('-')
                .appendMonthOfYear(2)
                .appendLiteral('-')
                .appendDayOfMonth(2)
                .toFormatter();

        DateTime dt = formatter.parseDateTime("2023-05-09");
        assertEquals(2023, dt.getYear());
        assertEquals(5, dt.getMonthOfYear());
        assertEquals(9, dt.getDayOfMonth());

        assertEquals("2023-05-09", formatter.print(dt));
    }

    @Test
    public void testFixedDecimalParseFailures() {
        DateTimeFormatter formatter = builder
                .appendFixedDecimal(DateTimeFieldType.year(), 4)
                .toFormatter();

        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2000);
        // Only 3 digits provided where 4 expected
        int result = formatter.getParser().parseInto(bucket, "123", 0);
        assertTrue("Parsing should fail on insufficient digits", result < 0);
    }

    @Test
    public void testSignedDecimalWithSigns() {
        DateTimeFormatter formatter = builder
                .appendSignedDecimal(DateTimeFieldType.year(), 1, 4)
                .toFormatter();

        DateTime dtNeg = formatter.parseDateTime("-150");
        assertEquals(-150, dtNeg.getYear());

        DateTime dtPos = formatter.parseDateTime("+2023");
        assertEquals(2023, dtPos.getYear());
    }

    // =========================================================================
    // 4. Two Digit Year & Weekyear Tests
    // =========================================================================

    @Test
    public void testTwoDigitYearPivotRanges() {
        DateTimeFormatter formatter = builder
                .appendTwoDigitYear(2000, false)
                .toFormatter();

        // 2000 pivot -> range 1950..2049
        assertEquals(1950, formatter.parseDateTime("50").getYear());
        assertEquals(2049, formatter.parseDateTime("49").getYear());
        assertEquals(2000, formatter.parseDateTime("00").getYear());
    }

    @Test
    public void testTwoDigitYearLenientParsing() {
        DateTimeFormatter formatter = builder
                .appendTwoDigitYear(2000, true)
                .toFormatter();

        // Lenient accepts full 4-digit years or signed years
        assertEquals(2023, formatter.parseDateTime("2023").getYear());
        assertEquals(1985, formatter.parseDateTime("1985").getYear());
        assertEquals(105, formatter.parseDateTime("+105").getYear());
        assertEquals(-50, formatter.parseDateTime("-50").getYear());
    }

    @Test
    public void testTwoDigitWeekyear() {
        DateTimeFormatter formatter = builder
                .appendTwoDigitWeekyear(2000)
                .toFormatter();

        DateTime dt = formatter.parseDateTime("23");
        assertEquals(2023, dt.getWeekyear());
    }

    // =========================================================================
    // 5. Fraction of Second / Minute / Hour / Day
    // =========================================================================

    @Test
    public void testFractions() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendHourOfDay(2)
                .appendLiteral(':')
                .appendMinuteOfHour(2)
                .appendLiteral(':')
                .appendSecondOfMinute(2)
                .appendLiteral('.')
                .appendFractionOfSecond(1, 3)
                .toFormatter();

        DateTime dt = formatter.parseDateTime("12:30:45.123");
        assertEquals(123, dt.getMillisOfSecond());

        DateTime dtShort = formatter.parseDateTime("12:30:45.5");
        assertEquals(500, dtShort.getMillisOfSecond());
    }

    @Test
    public void testFractionOfMinuteAndHour() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.appendFractionOfMinute(1, 2);
        b.appendFractionOfHour(1, 2);
        b.appendFractionOfDay(1, 2);
        assertNotNull(b.toFormatter());
    }

    // =========================================================================
    // 6. TimeZone ID & Bug Detection (Defects4J Time-20 Prefix Collision)
    // =========================================================================

    @Test
    public void testTimeZoneIdParsing() {
        DateTimeFormatter formatter = builder
                .appendHourOfDay(2)
                .appendLiteral(' ')
                .appendTimeZoneId()
                .toFormatter();

        DateTime dt = formatter.parseDateTime("12 America/New_York");
        assertEquals(DateTimeZone.forID("America/New_York"), dt.getZone());
    }

    @Test
    public void testTimeZoneIdLongestMatchPrefixCollision() {
        // Testing Time-20: e.g. America/Dawson vs America/Dawson_Creek
        DateTimeFormatter formatter = builder
                .appendTimeZoneId()
                .toFormatter();

        DateTime dt = formatter.parseDateTime("America/Dawson_Creek");
        assertEquals(DateTimeZone.forID("America/Dawson_Creek"), dt.getZone());
    }

    // =========================================================================
    // 7. TimeZone Offset & Zero Offset Variants
    // =========================================================================

    @Test
    public void testTimeZoneOffsetParsingVariousFormats() {
        DateTimeFormatter formatter = builder
                .appendHourOfDay(2)
                .appendTimeZoneOffset("Z", true, 2, 4)
                .toFormatter();

        DateTime dt1 = formatter.parseDateTime("12Z");
        assertEquals(DateTimeZone.UTC, dt1.getZone());

        DateTime dt2 = formatter.parseDateTime("12+02:00");
        assertEquals(DateTimeZone.forOffsetHours(2), dt2.getZone());

        DateTime dt3 = formatter.parseDateTime("12-05:30:15.123");
        int expectedOffset = -((5 * 3600 + 30 * 60 + 15) * 1000 + 123);
        assertEquals(DateTimeZone.forOffsetMillis(expectedOffset), dt3.getZone());
    }

    @Test
    public void testTimeZoneOffsetEmptyZeroParseText() {
        DateTimeFormatter formatter = builder
                .appendHourOfDay(2)
                .appendTimeZoneOffset("UTC", "", false, 1, 2)
                .toFormatter();

        DateTime dt = formatter.parseDateTime("12");
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testTimeZoneOffsetInvalidHourOrMinute() {
        DateTimeFormatter formatter = builder
                .appendTimeZoneOffset("Z", true, 1, 2)
                .toFormatter();

        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2000);
        // Invalid hour 25
        int res1 = formatter.getParser().parseInto(bucket, "+25:00", 0);
        assertTrue(res1 < 0);

        // Invalid minute 60
        int res2 = formatter.getParser().parseInto(bucket, "+05:60", 0);
        assertTrue(res2 < 0);
    }

    // =========================================================================
    // 8. TimeZone Name Lookup
    // =========================================================================

    @Test
    public void testTimeZoneNameLookup() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("EST", DateTimeZone.forOffsetHours(-5));
        lookup.put("EDT", DateTimeZone.forOffsetHours(-4));

        DateTimeFormatter formatter = builder
                .appendHourOfDay(2)
                .appendLiteral(' ')
                .appendTimeZoneShortName(lookup)
                .toFormatter();

        DateTime dt = formatter.parseDateTime("10 EST");
        assertEquals(DateTimeZone.forOffsetHours(-5), dt.getZone());
    }

    // =========================================================================
    // 9. Text & ShortText Fields (Month, Era, Halfday, DayOfWeek)
    // =========================================================================

    @Test
    public void testTextAndShortTextFields() {
        DateTimeFormatter formatter = builder
                .appendMonthOfYearText()
                .appendLiteral(' ')
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .appendEraText()
                .appendLiteral(' ')
                .appendHalfdayOfDayText()
                .toFormatter();

        DateTime dt = formatter.withLocale(Locale.ENGLISH).parseDateTime("December Mon AD PM");
        assertEquals(12, dt.getMonthOfYear());
    }

    // =========================================================================
    // 10. MatchingParser & Optional Elements
    // =========================================================================

    @Test
    public void testAppendOptionalParser() {
        DateTimeParser optionalParser = new DateTimeFormatterBuilder()
                .appendLiteral('T')
                .toParser();

        DateTimeFormatter formatter = builder
                .appendYear(4, 4)
                .appendOptional(optionalParser)
                .appendHourOfDay(2)
                .toFormatter();

        DateTime dtWithT = formatter.parseDateTime("2023T12");
        assertEquals(2023, dtWithT.getYear());
        assertEquals(12, dtWithT.getHourOfDay());

        DateTime dtWithoutT = formatter.parseDateTime("202312");
        assertEquals(2023, dtWithoutT.getYear());
        assertEquals(12, dtWithoutT.getHourOfDay());
    }

    @Test
    public void testMultipleParsersMatchingFallback() {
        DateTimeParser[] parsers = new DateTimeParser[] {
                new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toParser(),
                new DateTimeFormatterBuilder().appendLiteral('/').appendMonthOfYear(2).toParser()
        };

        DateTimeFormatter formatter = builder
                .appendYear(4, 4)
                .append(null, parsers)
                .toFormatter();

        DateTime dt1 = formatter.parseDateTime("2023-08");
        assertEquals(8, dt1.getMonthOfYear());

        DateTime dt2 = formatter.parseDateTime("2023/08");
        assertEquals(8, dt2.getMonthOfYear());
    }

    // =========================================================================
    // 11. Partial & Writer Printing Branch Coverage
    // =========================================================================

    @Test
    public void testPrintToWriterAndPartial() throws IOException {
        DateTimeFormatter formatter = builder
                .appendYear(4, 4)
                .appendLiteral('-')
                .appendMonthOfYear(2)
                .appendLiteral('-')
                .appendDayOfMonth(2)
                .toFormatter();

        LocalDate date = new LocalDate(2023, 5, 9);
        StringWriter sw = new StringWriter();
        formatter.printTo(sw, date);
        assertEquals("2023-05-09", sw.toString());

        StringBuffer sb = new StringBuffer();
        formatter.printTo(sb, date);
        assertEquals("2023-05-09", sb.toString());
    }
}