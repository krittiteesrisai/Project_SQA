# DateTimeFormatterBuilderTest

ด้านล่างเป็นชุดทดสอบ JUnit 4 สำหรับคลาส `DateTimeFormatterBuilder` (Joda-Time, Defects4J Time-20b)

**หมายเหตุสำคัญก่อนโค้ด:**
- วาง test class ไว้ใน package `org.joda.time.format` เช่นเดียวกับคลาสเป้าหมาย เพื่อให้สามารถเข้าถึง inner static classes/interfaces ที่เป็น package-private ได้ถ้าจำเป็น
- ฟังก์ชันที่พึ่งพาคลาสภายนอก (เช่น `DateTimeFormatter.parseDateTime`, ค่า default field ที่ไม่ได้ระบุ) ผมใช้เฉพาะพฤติกรรมที่ **เอกสารมาตรฐานของ Joda-Time ระบุไว้ชัดเจน** (เช่น unset field จะ default จาก epoch) และกำกับด้วยคอมเมนต์ `// NOTE:` ทุกจุดที่พึ่งพาสิ่งที่ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง
- สำหรับการตรวจพฤติกรรมของ inner printer/parser classes (CharacterLiteral, UnpaddedNumber, PaddedNumber ฯลฯ) ผมเรียก `printTo(...)` ของ interface `DateTimePrinter` ตรง ๆ (ผ่าน `toPrinter()`) เพราะ signature และ logic อยู่ในซอร์สที่ให้มาโดยตรง ไม่ต้องเดา
- หลีกเลี่ยงการสร้าง `DateTimeParserBucket` ตรง ๆ เพราะไม่มีซอร์สให้ (เสี่ยงเดา constructor) — ฝั่ง parser จะตรวจแบบ structural (exception / canBuildParser) เป็นหลัก และใช้ `DateTimeFormatter.parseDateTime/parseMillis` เฉพาะกรณีที่ fields ครบและชัดเจน

```java
package org.joda.time.format;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class DateTimeFormatterBuilderTest {

    private static final java.util.Locale LOCALE = java.util.Locale.US;
    private static final org.joda.time.Chronology UTC_CHRONO = ISOChronology.getInstanceUTC();

    // =====================================================================
    // Constructor / clear()
    // =====================================================================

    @Test
    public void testNewBuilder_emptyCannotBuildAnything() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        assertFalse(b.canBuildFormatter());
        assertFalse(b.canBuildPrinter());
        assertFalse(b.canBuildParser());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToFormatter_emptyThrows() {
        new DateTimeFormatterBuilder().toFormatter();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter_emptyThrows() {
        new DateTimeFormatterBuilder().toPrinter();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToParser_emptyThrows() {
        new DateTimeFormatterBuilder().toParser();
    }

    @Test
    public void testClear_resetsBuilder() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.appendLiteral('A');
        assertTrue(b.canBuildFormatter());
        b.clear();
        assertFalse(b.canBuildFormatter());
        assertFalse(b.canBuildPrinter());
        assertFalse(b.canBuildParser());
    }

    // =====================================================================
    // getFormatter() internal branches via canBuild*/toFormatter
    // =====================================================================

    @Test
    public void testSingleElement_printerEqualsParser_directPath() {
        // appendLiteral uses append0(element) -> printer==parser (same obj) -> f=printer directly
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral('X');
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testPrinterOnly_parserNull_directPath() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(p);
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertFalse(b.canBuildParser());
        try {
            b.toParser();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testParserOnly_printerNull_directPath() throws Exception {
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(q);
        assertTrue(b.canBuildFormatter());
        assertFalse(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
        try {
            b.toPrinter();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testDistinctPrinterAndParser_compositePath() throws Exception {
        // printer != parser && parser != null -> getFormatter() falls through to Composite
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(p, q);
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());

        // Verify decompose(): only element at even index checked as printer -> only 'P' printed
        DateTimePrinter composedPrinter = b.toPrinter();
        StringBuffer buf = new StringBuffer();
        composedPrinter.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("P", buf.toString());
    }

    @Test
    public void testMultiplePairs_sizeNotTwo_compositePath() {
        // appending twice => size()==4 => skip direct branch => Composite created
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendLiteral('A').appendLiteral('B');
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testFormatterCaching_subsequentChangesDoNotAffectOldFormatter() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral('A');
        DateTimePrinter p1 = b.toPrinter();
        b.appendLiteral('B'); // iFormatter reset to null via append0
        DateTimePrinter p2 = b.toPrinter();

        StringBuffer buf1 = new StringBuffer();
        p1.printTo(buf1, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("A", buf1.toString());

        StringBuffer buf2 = new StringBuffer();
        p2.printTo(buf2, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("AB", buf2.toString());
    }

    // =====================================================================
    // append(DateTimeFormatter)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFormatter_null() {
        new DateTimeFormatterBuilder().append((DateTimeFormatter) null);
    }

    @Test
    public void testAppendFormatter_valid() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('Z').toFormatter();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(inner);
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // append(DateTimePrinter) / append(DateTimeParser)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinter_null() {
        new DateTimeFormatterBuilder().append((DateTimePrinter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParser_null() {
        new DateTimeFormatterBuilder().append((DateTimeParser) null);
    }

    // =====================================================================
    // append(DateTimePrinter, DateTimeParser)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParser_nullPrinter() throws Exception {
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        new DateTimeFormatterBuilder().append((DateTimePrinter) null, q);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParser_nullParser() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        new DateTimeFormatterBuilder().append(p, (DateTimeParser) null);
    }

    @Test
    public void testAppendPrinterParser_bothValid() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(p, q);
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // append(DateTimePrinter, DateTimeParser[])
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParserArray_nullArray() {
        new DateTimeFormatterBuilder().append((DateTimePrinter) null, (DateTimeParser[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParserArray_lengthOne_nullElement() {
        new DateTimeFormatterBuilder().append((DateTimePrinter) null,
                new DateTimeParser[] { null });
    }

    @Test
    public void testAppendPrinterParserArray_lengthOne_valid() throws Exception {
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .append(null, new DateTimeParser[] { q });
        assertTrue(b.canBuildParser());
        assertFalse(b.canBuildPrinter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParserArray_nullInMiddle_throws() throws Exception {
        DateTimeParser a = new DateTimeFormatterBuilder().appendLiteral('A').toParser();
        DateTimeParser c = new DateTimeFormatterBuilder().appendLiteral('C').toParser();
        new DateTimeFormatterBuilder().append(null, new DateTimeParser[] { a, null, c });
    }

    @Test
    public void testAppendPrinterParserArray_nullLast_allowedOptional() throws Exception {
        DateTimeParser a = new DateTimeFormatterBuilder().appendLiteral('A').toParser();
        DateTimeParser c = new DateTimeFormatterBuilder().appendLiteral('C').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .append(null, new DateTimeParser[] { a, c, null });
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testAppendPrinterParserArray_multipleAllNonNull() throws Exception {
        DateTimeParser a = new DateTimeFormatterBuilder().appendLiteral('A').toParser();
        DateTimeParser c = new DateTimeFormatterBuilder().appendLiteral('C').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .append(null, new DateTimeParser[] { a, c });
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testAppendPrinterParserArray_withPrinterNonNull() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('P').toPrinter();
        DateTimeParser a = new DateTimeFormatterBuilder().appendLiteral('A').toParser();
        DateTimeParser c = new DateTimeFormatterBuilder().appendLiteral('C').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .append(p, new DateTimeParser[] { a, c });
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    // =====================================================================
    // appendOptional
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_null() {
        new DateTimeFormatterBuilder().appendOptional(null);
    }

    @Test
    public void testAppendOptional_valid() throws Exception {
        DateTimeParser q = new DateTimeFormatterBuilder().appendLiteral('Q').toParser();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendOptional(q);
        assertTrue(b.canBuildParser());
        assertFalse(b.canBuildPrinter());
    }

    // =====================================================================
    // appendLiteral(char) / appendLiteral(String)
    // =====================================================================

    @Test
    public void testAppendLiteralChar_printsChar() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral('Q').toPrinter();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("Q", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteralString_null() {
        new DateTimeFormatterBuilder().appendLiteral((String) null);
    }

    @Test
    public void testAppendLiteralString_empty_noOp() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder returned = b.appendLiteral("");
        assertSame(b, returned);
        assertFalse(b.canBuildFormatter()); // nothing was actually appended
    }

    @Test
    public void testAppendLiteralString_singleChar_usesCharacterLiteral() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral("A").toPrinter();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("A", buf.toString());
    }

    @Test
    public void testAppendLiteralString_multiChar_usesStringLiteral() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendLiteral("ABC").toPrinter();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("ABC", buf.toString());
    }

    // =====================================================================
    // appendDecimal
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_nullFieldType() {
        new DateTimeFormatterBuilder().appendDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_negativeMinDigits() {
        new DateTimeFormatterBuilder().appendDecimal(DateTimeFieldType.dayOfMonth(), -1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_maxDigitsZero() {
        new DateTimeFormatterBuilder().appendDecimal(DateTimeFieldType.dayOfMonth(), 0, 0);
    }

    @Test
    public void testAppendDecimal_minDigitsZero_unpaddedPath_noLeadingZero() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder()
                .appendDecimal(DateTimeFieldType.dayOfMonth(), 0, 3).toPrinter();
        long instant = new DateTime(2023, 1, 5, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, instant, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("5", buf.toString());
    }

    @Test
    public void testAppendDecimal_minDigitsTwo_paddedPath_withAdjustedMax() throws Exception {
        // maxDigits(1) < minDigits(2) -> adjusted to 2; minDigits<=1 false -> PaddedNumber
        DateTimePrinter p = new DateTimeFormatterBuilder()
                .appendDecimal(DateTimeFieldType.dayOfMonth(), 2, 1).toPrinter();
        long instant = new DateTime(2023, 1, 5, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, instant, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("05", buf.toString());
    }

    // =====================================================================
    // appendFixedDecimal
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_nullFieldType() {
        new DateTimeFormatterBuilder().appendFixedDecimal(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_zeroDigits() {
        new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 0);
    }

    @Test
    public void testAppendFixedDecimal_valid() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2);
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // appendSignedDecimal / appendFixedSignedDecimal
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_nullFieldType() {
        new DateTimeFormatterBuilder().appendSignedDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_negativeMinDigits() {
        new DateTimeFormatterBuilder().appendSignedDecimal(DateTimeFieldType.year(), -1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_maxDigitsZero() {
        new DateTimeFormatterBuilder().appendSignedDecimal(DateTimeFieldType.year(), 0, 0);
    }

    @Test
    public void testAppendSignedDecimal_minDigitsOne_unpaddedPath() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendSignedDecimal(DateTimeFieldType.year(), 1, 4);
        assertTrue(b.canBuildFormatter());
    }

    @Test
    public void testAppendSignedDecimal_minDigitsFour_paddedPath() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendSignedDecimal(DateTimeFieldType.year(), 4, 4);
        assertTrue(b.canBuildFormatter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_nullFieldType() {
        new DateTimeFormatterBuilder().appendFixedSignedDecimal(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_zeroDigits() {
        new DateTimeFormatterBuilder().appendFixedSignedDecimal(DateTimeFieldType.year(), 0);
    }

    @Test
    public void testAppendFixedSignedDecimal_valid() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // appendText / appendShortText
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_nullFieldType() {
        new DateTimeFormatterBuilder().appendText(null);
    }

    @Test
    public void testAppendText_valid() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendText(DateTimeFieldType.monthOfYear());
        assertTrue(b.canBuildFormatter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortText_nullFieldType() {
        new DateTimeFormatterBuilder().appendShortText(null);
    }

    @Test
    public void testAppendShortText_valid() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendShortText(DateTimeFieldType.monthOfYear());
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // appendFraction + delegates
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_nullFieldType() {
        new DateTimeFormatterBuilder().appendFraction(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_negativeMinDigits() {
        new DateTimeFormatterBuilder().appendFraction(DateTimeFieldType.secondOfDay(), -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_maxDigitsZero() {
        new DateTimeFormatterBuilder().appendFraction(DateTimeFieldType.secondOfDay(), 0, 0);
    }

    @Test
    public void testAppendFraction_maxLessThanMin_adjustedOk() {
        // maxDigits(1) < minDigits(3) -> adjusted to 3, should not throw
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendFraction(DateTimeFieldType.secondOfDay(), 3, 1);
        assertTrue(b.canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfSecond_delegate() {
        assertTrue(new DateTimeFormatterBuilder().appendFractionOfSecond(1, 3).canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfMinute_delegate() {
        assertTrue(new DateTimeFormatterBuilder().appendFractionOfMinute(1, 3).canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfHour_delegate() {
        assertTrue(new DateTimeFormatterBuilder().appendFractionOfHour(1, 3).canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfDay_delegate() {
        assertTrue(new DateTimeFormatterBuilder().appendFractionOfDay(1, 3).canBuildFormatter());
    }

    // =====================================================================
    // Numeric-field delegate methods (smoke tests: each builds successfully)
    // =====================================================================

    @Test
    public void testNumericFieldDelegates_buildSuccessfully() {
        assertTrue(new DateTimeFormatterBuilder().appendMillisOfSecond(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMillisOfDay(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendSecondOfMinute(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendSecondOfDay(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMinuteOfHour(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMinuteOfDay(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendHourOfDay(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendClockhourOfDay(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendHourOfHalfday(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendClockhourOfHalfday(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendDayOfWeek(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendDayOfMonth(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendDayOfYear(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendWeekOfWeekyear(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendWeekyear(1, 4).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMonthOfYear(1).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendYear(1, 4).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendYearOfEra(1, 4).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendYearOfCentury(1, 4).canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendCenturyOfEra(1, 2).canBuildFormatter());
    }

    @Test
    public void testTextFieldDelegates_buildSuccessfully() {
        assertTrue(new DateTimeFormatterBuilder().appendHalfdayOfDayText().canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendDayOfWeekText().canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendDayOfWeekShortText().canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMonthOfYearText().canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendMonthOfYearShortText().canBuildFormatter());
        assertTrue(new DateTimeFormatterBuilder().appendEraText().canBuildFormatter());
    }

    // =====================================================================
    // appendTwoDigitYear / appendTwoDigitWeekyear
    // =====================================================================

    @Test
    public void testAppendTwoDigitYear_defaultNotLenient() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTwoDigitYear(2000);
        assertTrue(b.canBuildFormatter());
        DateTimeParser parser = b.toParser();
        assertEquals(2, parser.estimateParsedLength()); // iLenientParse=false -> 2
    }

    @Test
    public void testAppendTwoDigitYear_lenientTrue() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true);
        DateTimeParser parser = b.toParser();
        assertEquals(4, parser.estimateParsedLength()); // iLenientParse=true -> 4
    }

    @Test
    public void testAppendTwoDigitWeekyear_defaultNotLenient() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000);
        DateTimeParser parser = b.toParser();
        assertEquals(2, parser.estimateParsedLength());
    }

    @Test
    public void testAppendTwoDigitWeekyear_lenientTrue() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true);
        DateTimeParser parser = b.toParser();
        assertEquals(4, parser.estimateParsedLength());
    }

    @Test
    public void testAppendTwoDigitYear_printsTwoDigits() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toPrinter();
        long instant = new DateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, instant, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("23", buf.toString());
    }

    // =====================================================================
    // appendTimeZoneName / appendTimeZoneShortName / appendTimeZoneId
    // =====================================================================

    @Test
    public void testAppendTimeZoneName_noLookup_printOnly() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneName();
        assertTrue(b.canBuildPrinter());
        assertFalse(b.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneName_withLookup_printAndParse() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneName(lookup);
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneShortName_noLookup_printOnly() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneShortName();
        assertTrue(b.canBuildPrinter());
        assertFalse(b.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneShortName_withLookup_printAndParse() {
        Map<String, DateTimeZone> lookup = new HashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneShortName(lookup);
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneId_buildsBoth() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneId();
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    // =====================================================================
    // appendTimeZoneOffset (4-arg / 5-arg)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset4_minFieldsZero_throws() {
        new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset4_maxLessThanMin_throws() {
        new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 3, 2);
    }

    @Test
    public void testAppendTimeZoneOffset4_minFieldsMoreThanFour_adjustedNoThrow() {
        // minFields(5) > 4 -> adjusted to min=4,max=4 internally; should not throw
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendTimeZoneOffset("Z", true, 5, 6);
        assertTrue(b.canBuildFormatter());
    }

    @Test
    public void testAppendTimeZoneOffset4_valid_zeroOffsetText() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder()
                .appendTimeZoneOffset("Z", true, 1, 4).toPrinter();
        StringBuffer buf = new StringBuffer();
        // displayOffset == 0 and zeroOffsetText != null -> prints the zero text
        p.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("Z", buf.toString());
    }

    @Test
    public void testAppendTimeZoneOffset4_nonZeroOffset_printsSignAndHours() throws Exception {
        DateTimePrinter p = new DateTimeFormatterBuilder()
                .appendTimeZoneOffset("Z", false, 1, 1).toPrinter();
        StringBuffer buf = new StringBuffer();
        int oneHourMillis = 60 * 60 * 1000;
        p.printTo(buf, 0L, UTC_CHRONO, oneHourMillis, DateTimeZone.UTC, LOCALE);
        assertEquals("+01", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset5_invalidFields_throws() {
        new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", "Z", true, 0, 1);
    }

    @Test
    public void testAppendTimeZoneOffset5_valid() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendTimeZoneOffset("Z", "ZULU", true, 1, 4);
        assertTrue(b.canBuildFormatter());
    }

    // =====================================================================
    // appendPattern (thin delegate — structural / simple literal check only)
    // =====================================================================

    @Test
    public void testAppendPattern_quotedLiteral_printsLiteralText() throws Exception {
        // NOTE: relies on DateTimeFormat's documented quoted-literal pattern syntax,
        // not shown in the given source file, but well-established in Joda-Time docs.
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.appendPattern("'T'");
        assertTrue(b.canBuildFormatter());
        DateTimePrinter p = b.toPrinter();
        StringBuffer buf = new StringBuffer();
        p.printTo(buf, 0L, UTC_CHRONO, 0, DateTimeZone.UTC, LOCALE);
        assertEquals("T", buf.toString());
    }

    @Test
    public void testAppendPattern_returnsThis() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder returned = b.appendPattern("'A'");
        assertSame(b, returned);
    }

    // =====================================================================
    // Full round-trip sanity test combining several appenders
    // =====================================================================

    @Test
    public void testFullRoundTrip_yearMonthDay() {
        // NOTE: relies on documented Joda-Time behaviour that explicitly-parsed
        // fields (year, month, day all present here) are set exactly as parsed.
        DateTimeFormatter f = new DateTimeFormatterBuilder()
                .appendYear(4, 4)
                .appendLiteral('-')
                .appendMonthOfYear(2)
                .appendLiteral('-')
                .appendDayOfMonth(2)
                .toFormatter()
                .withZone(DateTimeZone.UTC);

        DateTime dt = f.parseDateTime("2023-07-15");
        assertEquals(2023, dt.getYear());
        assertEquals(7, dt.getMonthOfYear());
        assertEquals(15, dt.getDayOfMonth());

        String printed = f.print(dt);
        assertEquals("2023-07-15", printed);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testNewBuilder_emptyCannotBuildAnything, testToFormatter/Printer/Parser_emptyThrows | `getFormatter()` เมื่อ list ว่าง → Composite ว่าง → `isPrinter/isParser=false` → throw `UnsupportedOperationException` |
| testClear_resetsBuilder | `clear()` รีเซ็ต `iFormatter`/`iElementPairs` |
| testSingleElement_printerEqualsParser_directPath | `getFormatter()`: `printer==parser` → `f=printer` |
| testPrinterOnly_parserNull_directPath | `getFormatter()`: `printer!=null, parser==null` → `f=printer`; `toParser()` throw |
| testParserOnly_printerNull_directPath | `getFormatter()`: `printer==null` → `f=parser`; `toPrinter()` throw |
| testDistinctPrinterAndParser_compositePath | `getFormatter()`: `printer!=parser && parser!=null` → fallback สร้าง `Composite`; ทดสอบ `decompose()` |
| testMultiplePairs_sizeNotTwo_compositePath | `iElementPairs.size()!=2` → ข้ามเงื่อนไข ตรงไป Composite |
| testFormatterCaching_subsequentChangesDoNotAffectOldFormatter | `append0` รีเซ็ต `iFormatter=null`; formatter เดิมไม่เปลี่ยน |
| testAppendFormatter_null / _valid | null-check ของ `append(DateTimeFormatter)` |
| testAppendPrinter_null / testAppendParser_null | `checkPrinter/checkParser` null branch |
| testAppendPrinterParser_nullPrinter/_nullParser/_bothValid | branch ทั้งสองของ `append(printer,parser)` |
| testAppendPrinterParserArray_* (7 เมธอด) | ทุก branch ของ `append(DateTimePrinter, DateTimeParser[])`: parsers null, length==1 (null/valid), null กลางอาร์เรย์ (throw), null ตัวสุดท้าย (optional), หลายตัวไม่มี null, printer!=null |
| testAppendOptional_null / _valid | null-check และ path สำเร็จของ `appendOptional` |
| testAppendLiteralChar_printsChar | พฤติกรรม `CharacterLiteral.printTo` |
| testAppendLiteralString_null/_empty/_singleChar/_multiChar | switch(text.length()): case 0,1,default ของ `appendLiteral(String)` |
| testAppendDecimal_nullFieldType/_negativeMinDigits/_maxDigitsZero | branch null, `minDigits<0`, `maxDigits<=0` |
| testAppendDecimal_minDigitsZero_unpaddedPath / _minDigitsTwo_paddedPath | branch `minDigits<=1` (Unpadded) และ adjust `maxDigits<minDigits` + Padded |
| testAppendFixedDecimal_* (3 เมธอด) | null-check, `numDigits<=0`, path สำเร็จ |
| testAppendSignedDecimal_*/testAppendFixedSignedDecimal_* | เหมือน appendDecimal/appendFixedDecimal แต่ signed, รวม Unpadded/Padded branch |
| testAppendText_*/testAppendShortText_* | null-check และ path สำเร็จของทั้งสองเมธอด |
| testAppendFraction_nullFieldType/_negativeMinDigits/_maxDigitsZero/_maxLessThanMin_adjustedOk | ทุก branch ของ `appendFraction` |
| testAppendFractionOf(Second/Minute/Hour/Day) | delegate methods เรียก `appendFraction` ถูกต้อง |
| testNumericFieldDelegates_buildSuccessfully, testTextFieldDelegates_buildSuccessfully | smoke test delegate methods ทั้งหมด (appendMillisOfSecond ... appendEraText) |
| testAppendTwoDigitYear_defaultNotLenient/_lenientTrue, testAppendTwoDigitWeekyear_* | branch `iLenientParse` true/false ผ่าน `estimateParsedLength()` |
| testAppendTwoDigitYear_printsTwoDigits | พฤติกรรม print ของ `TwoDigitYear` |
| testAppendTimeZoneName_*/testAppendTimeZoneShortName_*/testAppendTimeZoneId_buildsBoth | lookup null vs non-null (parser ได้/ไม่ได้) |
| testAppendTimeZoneOffset4_minFieldsZero_throws/_maxLessThanMin_throws | branch `minFields<=0`, `maxFields<minFields` ใน `TimeZoneOffset` constructor |
| testAppendTimeZoneOffset4_minFieldsMoreThanFour_adjustedNoThrow | branch `minFields>4` adjust |
| testAppendTimeZoneOffset4_valid_zeroOffsetText/_nonZeroOffset_printsSignAndHours | branch `displayOffset==0 && zeroOffsetText!=null`, และ sign `+`/`-` ใน `printTo` |
| testAppendTimeZoneOffset5_invalidFields_throws/_valid | 5-arg overload ผ่าน constructor เดียวกัน |
| testAppendPattern_quotedLiteral_printsLiteralText, testAppendPattern_returnsThis | delegate ไปยัง `DateTimeFormat.appendPatternTo`, คืนค่า `this` |
| testFullRoundTrip_yearMonthDay | integration: print/parse ผ่าน formatter ที่ประกอบจากหลาย element (Composite ทำงานถูกต้องทั้ง print และ parse) |

**ข้อจำกัดที่ยอมรับ:** ฝั่ง parser ของ inner classes บางตัว (เช่น `NumberFormatter.parseInto`, `Fraction.parseInto`, `TimeZoneOffset.parseInto`) ไม่ได้ทดสอบโดยตรงด้วย `DateTimeParserBucket` เนื่องจาก constructor ของคลาสนี้ไม่ได้อยู่ในซอร์สที่ให้มา การเดา constructor อาจทำให้ test ผิดพลาดหรือ compile ไม่ผ่าน จึงใช้การทดสอบ structural (exception, `canBuildParser`) และ full-roundtrip ผ่าน `DateTimeFormatter.parseDateTime` แทนในจุดที่ field ครบถ้วนและพฤติกรรม default เป็นที่ทราบแน่ชัด