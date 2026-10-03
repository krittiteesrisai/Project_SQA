package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.Before;
import org.junit.Test;

public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    // =========================================================================
    // 1. Boundary & Argument Validation Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullFormatterThrowsException() {
        builder.append((PeriodFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullPrinterAndParserThrowsException() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteralNullThrowsException() {
        builder.appendLiteral(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixNullThrowsException() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPluralNullThrowsException() {
        builder.appendPrefix("single", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixNullThrowsException() {
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPluralNullThrowsException() {
        builder.appendSuffix("single", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparatorNullThrowsException() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffixWithoutFieldThrowsException() {
        builder.appendSuffix("s");
    }

    @Test(expected = IllegalStateException.class)
    public void testDoublePrefixWithoutFieldThrowsException() {
        builder.appendPrefix("P").appendPrefix("X");
    }

    @Test(expected = IllegalStateException.class)
    public void testAdjacentSeparatorsThrowException() {
        builder.appendYears().appendSeparator(",").appendSeparator(";").appendMonths();
    }

    // =========================================================================
    // 2. Formatter Construction & Component Availability
    // =========================================================================

    @Test
    public void testBuilderToPrinterAndParserNullWhenIncomplete() {
        PeriodFormatter pf = builder.appendYears().toFormatter();
        assertNotNull(builder.toPrinter());
        assertNotNull(builder.toParser());

        builder.clear();
        builder.append(pf.getPrinter(), null);
        assertNotNull(builder.toPrinter());
        assertNull(builder.toParser());

        builder.clear();
        builder.append(null, pf.getParser());
        assertNull(builder.toPrinter());
        assertNotNull(builder.toParser());
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatterThrowsWhenNeitherPrinterNorParser() {
        builder.append(null, null);
    }

    // =========================================================================
    // 3. Print Zero Settings & Field Formatting
    // =========================================================================

    @Test
    public void testPrintZeroRarelyLast() {
        PeriodFormatter formatter = builder
                .printZeroRarelyLast()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        Period zeroPeriod = Period.ZERO;
        assertEquals("0m", formatter.print(zeroPeriod));

        Period nonZero = new Period().withYears(2);
        assertEquals("2y", formatter.print(nonZero));
    }

    @Test
    public void testPrintZeroRarelyFirst() {
        PeriodFormatter formatter = builder
                .printZeroRarelyFirst()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        Period zeroPeriod = Period.ZERO;
        assertEquals("0y", formatter.print(zeroPeriod));
    }

    @Test
    public void testPrintZeroAlwaysAndNever() {
        PeriodFormatter formatter = builder
                .printZeroAlways()
                .appendYears().appendSuffix("y")
                .printZeroNever()
                .appendMonths().appendSuffix("m")
                .toFormatter();

        Period zero = Period.ZERO;
        assertEquals("0y", formatter.print(zero));

        Period monthsOnly = new Period().withMonths(5);
        assertEquals("0y5m", formatter.print(monthsOnly));
    }

    @Test
    public void testPrintZeroIfSupported() {
        PeriodType type = PeriodType.forFields(new DurationFieldType[]{DurationFieldType.years()});
        PeriodFormatter formatter = builder
                .printZeroIfSupported()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        Period period = new Period(0, 0, 0, 0, 0, 0, 0, 0, type);
        assertEquals("0y", formatter.print(period));
    }

    @Test
    public void testAllStandardFieldsPrintingAndPadding() {
        PeriodFormatter formatter = builder
                .minimumPrintedDigits(2)
                .appendYears().appendSuffix("Y")
                .appendMonths().appendSuffix("M")
                .appendWeeks().appendSuffix("W")
                .appendDays().appendSuffix("D")
                .appendHours().appendSuffix("H")
                .appendMinutes().appendSuffix("MIN")
                .appendSeconds().appendSuffix("S")
                .appendMillis().appendSuffix("MS")
                .toFormatter();

        Period period = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("01Y02M03W04D05H06MIN07S08MS", formatter.print(period));
    }

    // =========================================================================
    // 4. Seconds with Millis & Optional Millis (Defects4J Time-13 Edge Cases)
    // =========================================================================

    @Test
    public void testAppendSecondsWithMillis() {
        PeriodFormatter formatter = builder
                .appendSecondsWithMillis()
                .toFormatter();

        Period p1 = new Period().withSeconds(5).withMillis(20);
        assertEquals("5.020", formatter.print(p1));

        Period pZero = new Period().withSeconds(0).withMillis(0);
        assertEquals("0.000", formatter.print(pZero));

        Period pNegative = new Period().withSeconds(-2).withMillis(-300);
        assertEquals("-2.300", formatter.print(pNegative));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis() {
        PeriodFormatter formatter = builder
                .appendSecondsWithOptionalMillis()
                .toFormatter();

        Period pNoMillis = new Period().withSeconds(12);
        assertEquals("12", formatter.print(pNoMillis));

        Period pWithMillis = new Period().withSeconds(12).withMillis(50);
        assertEquals("12.050", formatter.print(pWithMillis));
    }

    @Test
    public void testAppendMillis3Digit() {
        PeriodFormatter formatter = builder
                .appendMillis3Digit()
                .toFormatter();

        Period p = new Period().withMillis(7);
        assertEquals("007", formatter.print(p));
    }

    // =========================================================================
    // 5. Affixes (Plural & Composite Affixes)
    // =========================================================================

    @Test
    public void testPluralAffixes() {
        PeriodFormatter formatter = builder
                .appendYears()
                .appendSuffix(" year", " years")
                .appendSeparator(" ")
                .appendMonths()
                .appendSuffix(" month", " months")
                .toFormatter();

        assertEquals("1 year 2 months", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("2 years 1 month", formatter.print(new Period(2, 1, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPrefixAndCompositeAffixes() {
        PeriodFormatter formatter = builder
                .appendPrefix("About ")
                .appendYears().appendSuffix("y")
                .appendSuffix("!")
                .toFormatter();

        assertEquals("About 5y!", formatter.print(new Period().withYears(5)));
    }

    // =========================================================================
    // 6. Separator Variants & Boundary Conditions
    // =========================================================================

    @Test
    public void testSeparatorVariantsAndFinalText() {
        PeriodFormatter formatter = builder
                .appendYears().appendSuffix("y")
                .appendSeparator(", ", " and ", new String[]{", and "})
                .appendMonths().appendSuffix("m")
                .appendSeparator(", ", " and ", new String[]{", and "})
                .appendDays().appendSuffix("d")
                .toFormatter();

        assertEquals("1y, 2m and 3d", formatter.print(new Period(1, 2, 0, 3, 0, 0, 0, 0)));
        assertEquals("1y and 2m", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1y", formatter.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testSeparatorIfFieldsBeforeAndAfter() {
        PeriodFormatter formatterBefore = new PeriodFormatterBuilder()
                .appendDays().appendSuffix("d")
                .appendSeparatorIfFieldsBefore(":")
                .appendHours().appendSuffix("h")
                .toFormatter();

        assertEquals("2d:5h", formatterBefore.print(new Period().withDays(2).withHours(5)));
        assertEquals("2d:", formatterBefore.print(new Period().withDays(2)));
        assertEquals("5h", formatterBefore.print(new Period().withHours(5)));

        PeriodFormatter formatterAfter = new PeriodFormatterBuilder()
                .appendDays().appendSuffix("d")
                .appendSeparatorIfFieldsAfter(":")
                .appendHours().appendSuffix("h")
                .toFormatter();

        assertEquals("2d:5h", formatterAfter.print(new Period().withDays(2).withHours(5)));
        assertEquals("2d", formatterAfter.print(new Period().withDays(2)));
        assertEquals(":5h", formatterAfter.print(new Period().withHours(5)));
    }

    // =========================================================================
    // 7. Parsing Logic & Edge Cases
    // =========================================================================

    @Test
    public void testParseSignedValuesAndRejection() {
        PeriodFormatter normalParser = builder
                .appendYears().appendSuffix("y")
                .toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = normalParser.getParser().parseInto(mp, "+5y", 0, Locale.getDefault());
        assertTrue(pos > 0);
        assertEquals(5, mp.getYears());

        pos = normalParser.getParser().parseInto(mp, "-5y", 0, Locale.getDefault());
        assertTrue(pos > 0);
        assertEquals(-5, mp.getYears());

        builder.clear();
        PeriodFormatter rejectParser = builder
                .rejectSignedValues(true)
                .appendYears().appendSuffix("y")
                .toFormatter();

        MutablePeriod mp2 = new MutablePeriod();
        int failPos = rejectParser.getParser().parseInto(mp2, "-5y", 0, Locale.getDefault());
        assertTrue(failPos < 0);
    }

    @Test
    public void testParseSecondsAndMillisWithFractions() {
        PeriodFormatter formatter = builder
                .appendSecondsWithOptionalMillis()
                .appendSuffix("s")
                .toFormatter();

        MutablePeriod period = new MutablePeriod();
        // 1 decimal place: 5.4s -> 5 sec 400 millis
        formatter.getParser().parseInto(period, "5.4s", 0, Locale.getDefault());
        assertEquals(5, period.getSeconds());
        assertEquals(400, period.getMillis());

        // 2 decimal places: 5.45s -> 5 sec 450 millis
        period.clear();
        formatter.getParser().parseInto(period, "5.45s", 0, Locale.getDefault());
        assertEquals(5, period.getSeconds());
        assertEquals(450, period.getMillis());

        // 3 decimal places with comma: 5,456s -> 5 sec 456 millis
        period.clear();
        formatter.getParser().parseInto(period, "5,456s", 0, Locale.getDefault());
        assertEquals(5, period.getSeconds());
        assertEquals(456, period.getMillis());

        // Negative composite
        period.clear();
        formatter.getParser().parseInto(period, "-5.25s", 0, Locale.getDefault());
        assertEquals(-5, period.getSeconds());
        assertEquals(-250, period.getMillis());
    }

    @Test
    public void testParseLiteralAndInvalidInput() {
        PeriodFormatter formatter = builder
                .appendLiteral("PT")
                .appendHours().appendSuffix("H")
                .toFormatter();

        MutablePeriod period = new MutablePeriod();
        int result = formatter.getParser().parseInto(period, "INVALID", 0, Locale.getDefault());
        assertTrue(result < 0);

        result = formatter.getParser().parseInto(period, "PT10H", 0, Locale.getDefault());
        assertEquals(5, result);
        assertEquals(10, period.getHours());
    }

    // =========================================================================
    // 8. Writer and Output Stream Methods
    // =========================================================================

    @Test
    public void testPrintToWriter() throws IOException {
        PeriodFormatter formatter = builder
                .appendYears().appendSuffix("Y")
                .appendSeparator(" ")
                .appendMonths().appendSuffix("M")
                .toFormatter();

        Period period = new Period(3, 4, 0, 0, 0, 0, 0, 0);
        StringWriter sw = new StringWriter();
        formatter.getPrinter().printTo(sw, period, Locale.getDefault());
        assertEquals("3Y 4M", sw.toString());

        CharArrayWriter cw = new CharArrayWriter();
        formatter.getPrinter().printTo(cw, period, Locale.getDefault());
        assertEquals("3Y 4M", cw.toString());
    }
}