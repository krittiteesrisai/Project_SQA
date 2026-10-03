package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    // =========================================================================
    // 1. Validation & Exception Handling Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullFormatter() {
        builder.append((PeriodFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullPrinterAndParser() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteralNull() {
        builder.appendLiteral(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixNullSingle() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixNullPlural() {
        builder.appendPrefix(null, "days");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPluralNullSecond() {
        builder.appendPrefix("day", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixNullSingle() {
        builder.appendDays();
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixNullPlural() {
        builder.appendDays();
        builder.appendSuffix(null, "days");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPluralNullSecond() {
        builder.appendDays();
        builder.appendSuffix("day", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffixWithoutField() {
        builder.appendSuffix("days");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffixAfterLiteral() {
        builder.appendLiteral("PT");
        builder.appendSuffix("days");
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixNotFollowedByField() {
        builder.appendPrefix("P");
        builder.appendLiteral("T"); // clearPrefix throws IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testAdjacentSeparators() {
        builder.appendDays();
        builder.appendSeparator(",");
        builder.appendSeparator(",");
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatterEmptyBuilder() {
        builder.toFormatter();
    }

    // =========================================================================
    // 2. Printer / Parser only combinations
    // =========================================================================

    @Test
    public void testPrinterParserNullCombinations() {
        PeriodPrinter dummyPrinter = new PeriodFormatterBuilder().appendDays().toPrinter();
        PeriodParser dummyParser = new PeriodFormatterBuilder().appendDays().toParser();

        PeriodFormatterBuilder b1 = new PeriodFormatterBuilder();
        b1.append(dummyPrinter, null);
        assertTrue(b1.toFormatter().isPrinter());
        assertFalse(b1.toFormatter().isParser());
        assertNotNull(b1.toPrinter());
        assertNull(b1.toParser());

        PeriodFormatterBuilder b2 = new PeriodFormatterBuilder();
        b2.append(null, dummyParser);
        assertFalse(b2.toFormatter().isPrinter());
        assertTrue(b2.toFormatter().isParser());
        assertNull(b2.toPrinter());
        assertNotNull(b2.toParser());
    }

    @Test
    public void testClearBuilder() {
        builder.appendDays().appendHours();
        builder.clear();
        assertNull(builder.toPrinter());
        assertNull(builder.toParser());
    }

    // =========================================================================
    // 3. Field Types Formatting & Printing
    // =========================================================================

    @Test
    public void testAllFieldTypesPrinting() throws IOException {
        PeriodFormatter formatter = builder
                .appendYears().appendSuffix("Y")
                .appendMonths().appendSuffix("M")
                .appendWeeks().appendSuffix("W")
                .appendDays().appendSuffix("D")
                .appendHours().appendSuffix("h")
                .appendMinutes().appendSuffix("m")
                .appendSeconds().appendSuffix("s")
                .appendMillis().appendSuffix("ms")
                .toFormatter();

        Period period = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("1Y2M3W4D5h6m7s8ms", formatter.print(period));

        StringWriter writer = new StringWriter();
        formatter.getPrinter().printTo(writer, period, Locale.ENGLISH);
        assertEquals("1Y2M3W4D5h6m7s8ms", writer.toString());
        assertEquals("1Y2M3W4D5h6m7s8ms".length(), formatter.getPrinter().calculatePrintedLength(period, Locale.ENGLISH));
    }

    @Test
    public void testSecondsWithMillisAndOptionalMillis() {
        PeriodFormatter f1 = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .toFormatter();
        assertEquals("5.006", f1.print(new Period(0, 0, 0, 0, 0, 0, 5, 6)));
        assertEquals("5.000", f1.print(new Period(0, 0, 0, 0, 0, 0, 5, 0)));

        PeriodFormatter f2 = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        assertEquals("5.006", f2.print(new Period(0, 0, 0, 0, 0, 0, 5, 6)));
        assertEquals("5", f2.print(new Period(0, 0, 0, 0, 0, 0, 5, 0)));

        PeriodFormatter f3 = new PeriodFormatterBuilder()
                .appendMillis3Digit()
                .toFormatter();
        assertEquals("005", f3.print(new Period(0, 0, 0, 0, 0, 0, 0, 5)));
    }

    @Test
    public void testPaddedDigitsAndSignedValues() {
        PeriodFormatter formatter = builder
                .minimumPrintedDigits(3)
                .appendYears()
                .toFormatter();

        assertEquals("005", formatter.print(new Period().withYears(5)));
        assertEquals("-005", formatter.print(new Period().withYears(-5)));

        StringWriter sw = new StringWriter();
        try {
            formatter.getPrinter().printTo(sw, new Period().withYears(5), Locale.ENGLISH);
            assertEquals("005", sw.toString());
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }

    // =========================================================================
    // 4. PrintZero Behaviors
    // =========================================================================

    @Test
    public void testPrintZeroSettings() {
        Period zeroPeriod = Period.ZERO;

        // Print Zero Always
        PeriodFormatter fAlways = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendDays()
                .appendHours()
                .toFormatter();
        assertEquals("00", fAlways.print(zeroPeriod));

        // Print Zero Never
        PeriodFormatter fNever = new PeriodFormatterBuilder()
                .printZeroNever()
                .appendDays()
                .appendHours()
                .toFormatter();
        assertEquals("", fNever.print(zeroPeriod));

        // Print Zero Rarely Last (Default)
        PeriodFormatter fRarelyLast = new PeriodFormatterBuilder()
                .printZeroRarelyLast()
                .appendDays()
                .appendHours()
                .toFormatter();
        assertEquals("0", fRarelyLast.print(zeroPeriod)); // only hours printed

        // Print Zero Rarely First
        PeriodFormatter fRarelyFirst = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendDays()
                .appendHours()
                .toFormatter();
        assertEquals("0", fRarelyFirst.print(zeroPeriod)); // only days printed

        // Print Zero If Supported
        PeriodFormatter fIfSupported = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .appendDays()
                .toFormatter();
        assertEquals("0", fIfSupported.print(zeroPeriod));
        assertEquals("", fIfSupported.print(new Period(PeriodType.hours())));
    }

    // =========================================================================
    // 5. Affix Parsing and Printing (Simple, Plural, Composite)
    // =========================================================================

    @Test
    public void testPluralAndCompositeAffixes() {
        PeriodFormatter formatter = builder
                .appendPrefix("Time: ")
                .appendPrefix("~")
                .appendDays()
                .appendSuffix(" day", " days")
                .appendSuffix("!")
                .toFormatter();

        assertEquals("Time:~1 day!", formatter.print(new Period().withDays(1)));
        assertEquals("Time:~2 days!", formatter.print(new Period().withDays(2)));

        MutablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "Time:~3 days!", 0, Locale.ENGLISH);
        assertEquals(13, pos);
        assertEquals(3, period.getDays());

        // Parse with singular form
        MutablePeriod p2 = new MutablePeriod();
        int pos2 = formatter.getParser().parseInto(p2, "Time:~1 day!", 0, Locale.ENGLISH);
        assertEquals(12, pos2);
        assertEquals(1, p2.getDays());
    }

    // =========================================================================
    // 6. Separator Tests (including initial separator edge cases)
    // =========================================================================

    @Test
    public void testSeparatorsFormatting() {
        PeriodFormatter formatter = builder
                .appendDays()
                .appendSeparator(", ", " and ")
                .appendHours()
                .appendSeparator(", ", " and ")
                .appendMinutes()
                .toFormatter();

        assertEquals("1, 2 and 3", formatter.print(new Period(0, 0, 0, 1, 2, 3, 0, 0)));
        assertEquals("1 and 2", formatter.print(new Period(0, 0, 0, 1, 2, 0, 0, 0)));
        assertEquals("1", formatter.print(new Period(0, 0, 0, 1, 0, 0, 0, 0)));
        assertEquals("", formatter.print(Period.ZERO));
    }

    @Test
    public void testSeparatorIfFieldsBeforeAndAfter() {
        PeriodFormatter fBefore = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsBefore(";")
                .appendHours()
                .toFormatter();
        assertEquals("1;2", fBefore.print(new Period(0, 0, 0, 1, 2, 0, 0, 0)));
        assertEquals("1;", fBefore.print(new Period(0, 0, 0, 1, 0, 0, 0, 0)));
        assertEquals("2", fBefore.print(new Period(0, 0, 0, 0, 2, 0, 0, 0)));

        PeriodFormatter fAfter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsAfter(";")
                .appendHours()
                .toFormatter();
        assertEquals("1;2", fAfter.print(new Period(0, 0, 0, 1, 2, 0, 0, 0)));
        assertEquals("1", fAfter.print(new Period(0, 0, 0, 1, 0, 0, 0, 0)));
        assertEquals(";2", fAfter.print(new Period(0, 0, 0, 0, 2, 0, 0, 0)));
    }

    @Test
    public void testSeparatorAtBeginning_Defects4J_Time27() {
        // Test edge-case when separator is appended at the very beginning of the builder
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .toFormatter();

        assertEquals("T5", formatter.print(new Period().withHours(5)));
        assertEquals("", formatter.print(Period.ZERO));

        MutablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "T5", 0, Locale.ENGLISH);
        assertTrue(pos >= 0);
        assertEquals(5, period.getHours());
    }

    @Test
    public void testSeparatorParsingVariants() {
        PeriodFormatter formatter = builder
                .appendDays()
                .appendSeparator(",", " and ", new String[]{" & ", "/"})
                .appendHours()
                .toFormatter();

        MutablePeriod p1 = new MutablePeriod();
        assertTrue(formatter.getParser().parseInto(p1, "1 & 2", 0, Locale.ENGLISH) > 0);
        assertEquals(1, p1.getDays());
        assertEquals(2, p1.getHours());

        MutablePeriod p2 = new MutablePeriod();
        assertTrue(formatter.getParser().parseInto(p2, "1/2", 0, Locale.ENGLISH) > 0);
        assertEquals(1, p2.getDays());
        assertEquals(2, p2.getHours());
    }

    // =========================================================================
    // 7. Parsing Boundary & Edge Cases
    // =========================================================================

    @Test
    public void testParseNegativeAndPositiveSigns() {
        PeriodFormatter parser = builder
                .appendYears()
                .appendSuffix("Y")
                .appendDays()
                .appendSuffix("D")
                .toFormatter();

        MutablePeriod p1 = new MutablePeriod();
        assertTrue(parser.getParser().parseInto(p1, "+5Y-3D", 0, Locale.ENGLISH) > 0);
        assertEquals(5, p1.getYears());
        assertEquals(-3, p1.getDays());

        // Reject signed values
        PeriodFormatter rejectingParser = new PeriodFormatterBuilder()
                .rejectSignedValues(true)
                .appendYears()
                .appendSuffix("Y")
                .toFormatter();

        MutablePeriod p2 = new MutablePeriod();
        assertTrue(rejectingParser.getParser().parseInto(p2, "-5Y", 0, Locale.ENGLISH) < 0);
    }

    @Test
    public void testParseSecondsWithDecimals() {
        PeriodFormatter formatter = builder
                .appendSecondsWithMillis()
                .toFormatter();

        MutablePeriod p1 = new MutablePeriod();
        int pos1 = formatter.getParser().parseInto(p1, "12.345", 0, Locale.ENGLISH);
        assertTrue(pos1 > 0);
        assertEquals(12, p1.getSeconds());
        assertEquals(345, p1.getMillis());

        // 1 digit decimal (.3 -> 300ms)
        MutablePeriod p2 = new MutablePeriod();
        formatter.getParser().parseInto(p2, "12.3", 0, Locale.ENGLISH);
        assertEquals(12, p2.getSeconds());
        assertEquals(300, p2.getMillis());

        // Negative decimal
        MutablePeriod p3 = new MutablePeriod();
        formatter.getParser().parseInto(p3, "-12.345", 0, Locale.ENGLISH);
        assertEquals(-12, p3.getSeconds());
        assertEquals(-345, p3.getMillis());

        // Comma decimal separator
        MutablePeriod p4 = new MutablePeriod();
        formatter.getParser().parseInto(p4, "12,5", 0, Locale.ENGLISH);
        assertEquals(12, p4.getSeconds());
        assertEquals(500, p4.getMillis());
    }

    @Test
    public void testParseDigitsLimitAndLargeNumber() {
        PeriodFormatter formatter = builder
                .maximumParsedDigits(4)
                .appendDays()
                .toFormatter();

        MutablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "123456", 0, Locale.ENGLISH);
        assertEquals(4, pos);
        assertEquals(1234, period.getDays());

        // Large number (> 10 digits fallback to Integer.parseInt)
        PeriodFormatter largeNumFormatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(12)
                .appendDays()
                .toFormatter();

        MutablePeriod p2 = new MutablePeriod();
        largeNumFormatter.getParser().parseInto(p2, "1000000005", 0, Locale.ENGLISH);
        assertEquals(1000000005, p2.getDays());
    }

    @Test
    public void testParseFailuresAndPositionTracking() {
        PeriodFormatter formatter = builder
                .appendDays().appendSuffix("D")
                .appendHours().appendSuffix("H")
                .toFormatter();

        MutablePeriod p = new MutablePeriod();
        // Parsing invalid literal
        int res = formatter.getParser().parseInto(p, "ABC", 0, Locale.ENGLISH);
        assertTrue(res < 0);

        // Parsing beyond length
        int resEnd = formatter.getParser().parseInto(p, "10D", 3, Locale.ENGLISH);
        assertEquals(3, resEnd);

        // Required parsing past text with printZeroAlways
        PeriodFormatter alwaysParser = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendDays()
                .toFormatter();
        int resAlways = alwaysParser.getParser().parseInto(p, "10D", 3, Locale.ENGLISH);
        assertTrue(resAlways < 0);
    }
}