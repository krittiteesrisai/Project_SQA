package org.joda.time.format; // เดียวกับคลาสเป้าหมาย เพื่อให้ไม่ต้อง import PeriodFormatterBuilder, PeriodPrinter, PeriodParser (เป็น public/ package-level ในแพ็กเกจนี้)

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * Unit tests for {@link PeriodFormatterBuilder} (Defects4J Time-27b).
 *
 * หมายเหตุสำคัญ:
 * - คลาส PeriodFormatter, PeriodPrinter, PeriodParser, Period, MutablePeriod, PeriodType
 *   ไม่ได้แสดง source ในโจทย์ จึงใช้ตาม public API มาตรฐานที่มีการอ้างอิงใน source
 *   ที่ให้มา (เช่น formatter.getPrinter(), f.getParser(), javadoc isPrinter()/isParser())
 *   และ behavior มาตรฐานของ Joda-Time (print(), parsePeriod(), withXxxRemoved()).
 *   จุดใดที่พึ่งพา behavior ของคลาสเหล่านี้ที่ไม่ได้อยู่ใน source ที่ให้มา จะมีคอมเมนต์กำกับไว้
 */
public class PeriodFormatterBuilderTest {

    // ===================================================================
    // clear()
    // ===================================================================

    @Test
    public void testClear_resetsBuilderState() {
        PeriodFormatterBuilder b = new PeriodFormatterBuilder();
        b.appendLiteral("X");
        b.clear();
        PeriodFormatter f = b.toFormatter();
        assertEquals("", f.print(new Period()));
    }

    // ===================================================================
    // appendLiteral
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_nullThrows() {
        new PeriodFormatterBuilder().appendLiteral(null);
    }

    @Test
    public void testAppendLiteral_printsText() {
        PeriodFormatter f = new PeriodFormatterBuilder().appendLiteral("ABC").toFormatter();
        assertEquals("ABC", f.print(new Period()));
    }

    // ===================================================================
    // append(PeriodFormatter) / append(printer,parser)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullFormatterThrows() {
        new PeriodFormatterBuilder().append((PeriodFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_printerParserBothNullThrows() {
        new PeriodFormatterBuilder().append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test
    public void testAppend_onlyPrinter_parserIsNull() {
        PeriodFormatter lit = new PeriodFormatterBuilder().appendLiteral("x").toFormatter();
        PeriodFormatterBuilder b = new PeriodFormatterBuilder();
        b.append(lit.getPrinter(), null);
        PeriodFormatter f = b.toFormatter();
        assertTrue(f.isPrinter());
        assertFalse(f.isParser());
        assertNull(b.toParser());
    }

    @Test
    public void testAppend_onlyParser_printerIsNull() {
        PeriodFormatter lit = new PeriodFormatterBuilder().appendLiteral("x").toFormatter();
        PeriodFormatterBuilder b = new PeriodFormatterBuilder();
        b.append(null, lit.getParser());
        PeriodFormatter f = b.toFormatter();
        assertFalse(f.isPrinter());
        assertTrue(f.isParser());
        assertNull(b.toPrinter());
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatter_neitherPrinterNorParser_throws() {
        PeriodFormatter lit = new PeriodFormatterBuilder().appendLiteral("x").toFormatter();
        PeriodFormatterBuilder b = new PeriodFormatterBuilder();
        b.append(null, lit.getParser());   // iNotPrinter = true
        b.append(lit.getPrinter(), null);  // iNotParser  = true
        b.toFormatter();
    }

    // ===================================================================
    // appendPrefix
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_nullThrows() {
        new PeriodFormatterBuilder().appendPrefix(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_singularPluralNullThrows() {
        new PeriodFormatterBuilder().appendPrefix(null, "s");
    }

    @Test
    public void testAppendPrefix_compositeMerge() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendPrefix("A").appendPrefix("B").appendYears().toFormatter();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("AB5", f.print(p));
    }

    // ===================================================================
    // appendSuffix
    // ===================================================================

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_noFieldThrows() {
        new PeriodFormatterBuilder().appendSuffix("Y");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_afterLiteralThrows() {
        new PeriodFormatterBuilder().appendLiteral("L").appendSuffix("Y");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_nullThrows() {
        new PeriodFormatterBuilder().appendYears().appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_singularPluralNullThrows() {
        new PeriodFormatterBuilder().appendYears().appendSuffix(null, "s");
    }

    @Test
    public void testAppendSuffix_compositeMerge() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("Y1").appendSuffix("Y2").toFormatter();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("5Y1Y2", f.print(p));
    }

    // ===================================================================
    // orphan prefix -> clearPrefix() IllegalStateException
    // ===================================================================

    @Test(expected = IllegalStateException.class)
    public void testPrefixOrphan_beforeLiteral_throws() {
        new PeriodFormatterBuilder().appendPrefix("X").appendLiteral("L");
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixOrphan_beforeSuffix_throws() {
        new PeriodFormatterBuilder().appendYears().appendPrefix("X").appendSuffix("S");
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixOrphan_beforeSeparator_throws() {
        new PeriodFormatterBuilder().appendPrefix("X").appendSeparator(",");
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixOrphan_beforeAppendFormatter_throws() {
        PeriodFormatter lit = new PeriodFormatterBuilder().appendLiteral("x").toFormatter();
        new PeriodFormatterBuilder().appendPrefix("X").append(lit);
    }

    // ===================================================================
    // minimumPrintedDigits
    // ===================================================================

    @Test
    public void testMinimumPrintedDigits_padsOutput() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .minimumPrintedDigits(3).appendYears().toFormatter();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("005", f.print(p));
    }

    // ===================================================================
    // appendSeparator family
    // ===================================================================

    @Test
    public void testAppendSeparator_asFirstElement_noOp() {
        PeriodFormatterBuilder b = new PeriodFormatterBuilder();
        b.appendSeparator(","); // pairs.size()==0, useBefore=true -> no-op branch
        b.appendYears();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("5", b.toFormatter().print(p));
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter_asFirstElement_added() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendSeparatorIfFieldsAfter(",")
                .appendYears()
                .toFormatter();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(",5", f.print(p));
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_adjacentSeparatorsThrows() {
        new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendSeparator(";");
    }

    @Test
    public void testAppendSeparator_basicBetweenTwoFields() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 2, 3, 0, 0, 0);
        assertEquals("2,3", f.print(p));
    }

    @Test
    public void testAppendSeparator_omittedWhenOneFieldSuppressed() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 0, 3, 0, 0, 0); // days=0 suppressed, not all-zero
        assertEquals("3", f.print(p));
    }

    @Test
    public void testAppendSeparator_finalTextAndVariants() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendYears()
                .appendSeparator(",", "&", new String[] {";"})
                .appendMonths()
                .appendSeparator(",", "&", new String[] {";"})
                .appendMinutes()
                .toFormatter();
        Period p = new Period(1, 2, 0, 0, 0, 3, 0, 0);
        assertEquals("1,2&3", f.print(p));

        // parsePeriod() เป็น public API มาตรฐานของ PeriodFormatter (ไม่อยู่ใน source ที่ให้มา)
        Period parsed = f.parsePeriod("1;2;3");
        assertEquals(1, parsed.getYears());
        assertEquals(2, parsed.getMonths());
        assertEquals(3, parsed.getMinutes());
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter_onlyWhenAfterPrinted() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendYears().appendSeparatorIfFieldsAfter(",").appendMonths()
                .toFormatter();
        assertEquals("1,2", f.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1", f.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore_onlyWhenBeforePrinted() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .appendYears().appendSeparatorIfFieldsBefore(",").appendMonths()
                .toFormatter();
        assertEquals("2", f.print(new Period(0, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1,2", f.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
    }

    // ===================================================================
    // printZero* family
    // ===================================================================

    @Test
    public void testPrintZeroRarelyLast_picksLastField() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyLast()
                .appendYears().appendSuffix("Y")
                .appendSeparator("-")
                .appendMonths().appendSuffix("M")
                .appendSeparator("-")
                .appendWeeks().appendSuffix("W")
                .toFormatter();
        assertEquals("0W", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPrintZeroRarelyFirst_picksFirstField() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendYears().appendSuffix("Y")
                .appendSeparator("-")
                .appendMonths().appendSuffix("M")
                .appendSeparator("-")
                .appendWeeks().appendSuffix("W")
                .toFormatter();
        assertEquals("0Y", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPrintZeroNever_suppressesZero() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroNever().appendYears().toFormatter();
        assertEquals("", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals("5", f.print(new Period(5, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPrintZeroIfSupported_printsZeroWhenSupported() {
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroIfSupported().appendMonths().toFormatter();
        assertEquals("0", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPrintZeroIfSupported_suppressesWhenUnsupported() {
        PeriodType noMonths = PeriodType.standard().withMonthsRemoved();
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroIfSupported().appendMonths().toFormatter();
        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0, noMonths);
        assertEquals("", f.print(p));
    }

    @Test
    public void testPrintZeroAlways_printsEvenUnsupported() {
        PeriodType noMonths = PeriodType.standard().withMonthsRemoved();
        PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroAlways().appendMonths().toFormatter();
        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0, noMonths);
        // พึ่งพา ReadablePeriod#get(...) คืนค่า 0 สำหรับฟิลด์ที่ไม่รองรับ
        // (ตาม javadoc ของ printZeroAlways() ใน source ที่ให้มา แต่ implementation จริง
        //  ของ Period#get ไม่ได้อยู่ใน source นี้)
        assertEquals("0", f.print(p));
    }

    // ===================================================================
    // secondsWithMillis / secondsWithOptionalMillis / millis3Digit
    // ===================================================================

    @Test
    public void testAppendSecondsWithMillis_print() {
        PeriodFormatter f = new PeriodFormatterBuilder().appendSecondsWithMillis().toFormatter();
        assertEquals("7.000", f.print(new Period(0, 0, 0, 0, 0, 0, 7, 0)));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis_printsNoDecimalWhenZero() {
        PeriodFormatter f = new PeriodFormatterBuilder().appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 0, 0, 0, 7, 0)));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis_printsDecimalWhenNonZero() {
        PeriodFormatter f = new PeriodFormatterBuilder().appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("7.250", f.print(new Period(0, 0, 0, 0, 0, 0, 7, 250)));
    }

    @Test
    public void testAppendMillis3Digit() {
        PeriodFormatter f = new PeriodFormatterBuilder().appendMillis3Digit().toFormatter();
        assertEquals("045", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 45)));
    }

    // ===================================================================
    // FieldFormatter.parseInto branches (via toParser())
    // ===================================================================

    @Test
    public void testParseInto_basicYears() {
        PeriodParser parser = new PeriodFormatterBuilder().appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "2021", 0, null);
        assertEquals(4, pos);
        assertEquals(2021, period.getYears());
    }

    @Test
    public void testParseInto_prefixMissing_softFail() {
        PeriodParser parser = new PeriodFormatterBuilder().appendPrefix("P").appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5", 0, null);
        assertEquals(0, pos); // mustParse=false -> graceful skip คืน position เดิม
    }

    @Test
    public void testParseInto_prefixPresent_requiresMatch() {
        PeriodParser parser = new PeriodFormatterBuilder().appendPrefix("P").appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "P5", 0, null);
        assertEquals(2, pos);
        assertEquals(5, period.getYears());
    }

    @Test
    public void testParseInto_printZeroAlways_emptyText_hardFail() {
        PeriodParser parser = new PeriodFormatterBuilder().printZeroAlways().appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "", 0, null);
        assertEquals(-1, pos); // mustParse=true, shortcut test -> ~position
    }

    @Test
    public void testParseInto_suffixNotFound_softFail() {
        PeriodParser parser = new PeriodFormatterBuilder().appendYears().appendSuffix("Y").toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5X", 0, null);
        assertEquals(0, pos);
    }

    @Test
    public void testParseInto_suffixFound_success() {
        PeriodParser parser = new PeriodFormatterBuilder().appendYears().appendSuffix("Y").toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5Y", 0, null);
        assertEquals(2, pos);
        assertEquals(5, period.getYears());
    }

    @Test
    public void testParseInto_suffixMismatchPosition_returnsOriginal() {
        PeriodParser parser = new PeriodFormatterBuilder().appendYears().appendSuffix("Y").toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5.9Y", 0, null);
        assertEquals(0, pos); // digits stop at '.', suffix พบไกลเกินไป -> คืน position เดิม
    }

    @Test
    public void testParseInto_unsupportedFieldSoftSkip() {
        PeriodType noMonths = PeriodType.standard().withMonthsRemoved();
        PeriodParser parser = new PeriodFormatterBuilder().appendMonths().toParser();
        MutablePeriod period = new MutablePeriod(noMonths);
        int pos = parser.parseInto(period, "5", 0, null);
        assertEquals(0, pos);
    }

    @Test
    public void testParseInto_rejectSignedValues_breaksOnSign() {
        PeriodParser parser = new PeriodFormatterBuilder().rejectSignedValues(true).appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "-5", 0, null);
        assertEquals(-1, pos); // hasDigits=false -> ~position เสมอ
    }

    @Test
    public void testParseInto_allowSignedValues_negative() {
        PeriodParser parser = new PeriodFormatterBuilder().appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "-5", 0, null);
        assertEquals(2, pos);
        assertEquals(-5, period.getYears());
    }

    @Test
    public void testParseInto_maximumParsedDigits_limitsLength() {
        PeriodParser parser = new PeriodFormatterBuilder().maximumParsedDigits(2).appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "12345", 0, null);
        assertEquals(2, pos);
        assertEquals(12, period.getYears());
    }

    @Test
    public void testParseInto_longDigitLength_usesIntegerParse() {
        PeriodParser parser = new PeriodFormatterBuilder().maximumParsedDigits(10).appendYears().toParser();
        MutablePeriod period = new MutablePeriod();
        String text = "1234567890";
        int pos = parser.parseInto(period, text, 0, null);
        assertEquals(10, pos);
        assertEquals(1234567890, period.getYears());
    }

    @Test
    public void testParseInto_secondsMillis_fractLenThreeOrMore() {
        PeriodParser parser = new PeriodFormatterBuilder().appendSecondsWithMillis().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5.1234", 0, null);
        assertEquals(6, pos);
        assertEquals(5, period.getSeconds());
        assertEquals(123, period.getMillis());
    }

    @Test
    public void testParseInto_secondsMillis_fractLenOne() {
        PeriodParser parser = new PeriodFormatterBuilder().appendSecondsWithMillis().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5.1", 0, null);
        assertEquals(3, pos);
        assertEquals(5, period.getSeconds());
        assertEquals(100, period.getMillis());
    }

    @Test
    public void testParseInto_secondsMillis_noFraction() {
        PeriodParser parser = new PeriodFormatterBuilder().appendSecondsWithMillis().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "5", 0, null);
        assertEquals(1, pos);
        assertEquals(5, period.getSeconds());
        assertEquals(0, period.getMillis());
    }

    @Test
    public void testParseInto_secondsMillis_negativeFraction() {
        PeriodParser parser = new PeriodFormatterBuilder().appendSecondsWithMillis().toParser();
        MutablePeriod period = new MutablePeriod();
        int pos = parser.parseInto(period, "-5.5", 0, null);
        assertEquals(4, pos);
        assertEquals(-5, period.getSeconds());
        assertEquals(-500, period.getMillis());
    }
}
