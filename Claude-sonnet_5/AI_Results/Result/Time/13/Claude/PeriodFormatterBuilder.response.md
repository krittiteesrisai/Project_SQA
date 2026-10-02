# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `PeriodFormatterBuilder`

**หมายเหตุสำคัญ:** โค้ดที่ให้มาคือ `PeriodFormatterBuilder` ซึ่งต้องพึ่งพาคลาสอื่นในแพ็กเกจ `org.joda.time` (เช่น `Period`, `PeriodType`, `PeriodFormatter`) ที่ไม่ได้แสดงซอร์สมาด้วย ผมจึงใช้เฉพาะ public API ที่เป็นที่รู้จักแน่นอนของ Joda-Time (เช่น `PeriodFormatter.print()`, `parsePeriod()`, `parseInto()`, `Period.get(DurationFieldType)`) และ **กำกับด้วยคอมเมนต์ `// ASSUMPTION:`** ทุกจุดที่พึ่งพา behavior ของคลาสภายนอกที่ไม่ได้อยู่ในซอร์สที่ให้มา เพื่อไม่ให้เดา behavior ของ `PeriodFormatterBuilder` เอง

```java
package org.joda.time.format;

import static org.junit.Assert.*;

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

/**
 * JUnit4 tests for {@link PeriodFormatterBuilder} (Defects4J Time-13b).
 *
 * ASSUMPTION: ใช้ public API มาตรฐานของ org.joda.time.format.PeriodFormatter
 * (print, parsePeriod, parseMutablePeriod, parseInto, isPrinter, isParser,
 * getPrinter, getParser) ซึ่งเป็น dependency ของคลาสเป้าหมาย แต่ไม่ได้แสดงซอร์สมา
 * ถ้า behavior จริงต่างจากที่สันนิษฐาน ผลเทสอาจต้องปรับ assertion
 */
public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    // ------------------------------------------------------------
    // Dummy Printer / Parser สำหรับทดสอบ append(printer, parser)
    // ------------------------------------------------------------
    static class DummyPrinter implements PeriodPrinter {
        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {
            return 1;
        }
        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {
            return 1;
        }
        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {
            buf.append('P');
        }
        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {
            out.write('P');
        }
    }

    static class DummyParser implements PeriodParser {
        public int parseInto(ReadWritablePeriod period, String periodStr, int position, Locale locale) {
            return position; // no-op, consumes nothing
        }
    }

    // ============================================================
    // 1. toFormatter() / toPrinter() / toParser()
    // ============================================================

    @Test
    public void testToFormatter_emptyBuilder_doesNotThrow() {
        // elementPairs ว่าง -> createComposite ส่งคืน Literal.EMPTY ทั้งสองฝั่ง
        PeriodFormatter f = builder.toFormatter();
        assertNotNull(f);
        assertTrue(f.isPrinter());
        assertTrue(f.isParser());
    }

    @Test
    public void testToFormatter_bothNotPrinterNotParser_throwsIllegalState() {
        builder.append(null, new DummyParser());   // iNotPrinter = true
        builder.append(new DummyPrinter(), null);   // iNotParser  = true (iNotPrinter คงเป็น true ต่อ)
        try {
            builder.toFormatter();
            fail("ควร throw IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testToPrinter_returnsNull_whenNotPrinter() {
        builder.append(null, new DummyParser());
        assertNull(builder.toPrinter());
    }

    @Test
    public void testToPrinter_returnsValue_whenIsPrinter() {
        builder.append(new DummyPrinter(), new DummyParser());
        assertNotNull(builder.toPrinter());
    }

    @Test
    public void testToParser_returnsNull_whenNotParser() {
        builder.append(new DummyPrinter(), null);
        assertNull(builder.toParser());
    }

    @Test
    public void testToParser_returnsValue_whenIsParser() {
        builder.append(new DummyPrinter(), new DummyParser());
        assertNotNull(builder.toParser());
    }

    // ============================================================
    // 2. append(PeriodFormatter) / append(printer, parser)
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFormatter_null_throws() {
        builder.append((PeriodFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParser_bothNull_throws() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test
    public void testAppendFormatter_normal() {
        PeriodFormatter inner = new PeriodFormatterBuilder().appendLiteral("X").toFormatter();
        PeriodFormatter outer = builder.append(inner).toFormatter();
        assertEquals("X", outer.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendPrinterParser_onlyPrinter_printsDummy() {
        PeriodFormatter f = builder.append(new DummyPrinter(), null).toFormatter();
        assertEquals("P", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    // ============================================================
    // 3. appendLiteral
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_null_throws() {
        builder.appendLiteral(null);
    }

    @Test
    public void testAppendLiteral_normal() {
        PeriodFormatter f = builder.appendLiteral("hello").toFormatter();
        assertEquals("hello", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 0)));
    }

    // ============================================================
    // 4. minimumPrintedDigits / maximumParsedDigits / rejectSignedValues
    // ============================================================

    @Test
    public void testMinimumPrintedDigits_padded_branch() {
        // minDigits > 1 -> appendPaddedInteger branch
        PeriodFormatter f = builder.minimumPrintedDigits(3).appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 0, 5, 0, 0, 0);
        assertEquals("005", f.print(p));
    }

    @Test
    public void testMinimumPrintedDigits_defaultUnpadded_branch() {
        // minDigits <= 1 -> appendUnpaddedInteger branch (ค่า default = 1)
        PeriodFormatter f = builder.appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 0, 5, 0, 0, 0);
        assertEquals("5", f.print(p));
    }

    @Test
    public void testMaximumParsedDigits_limitsParsedLength() {
        PeriodFormatter f = builder.maximumParsedDigits(2).appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        // ASSUMPTION: PeriodFormatter.parseInto คืน raw position ตาม internal parser contract
        int newPos = f.parseInto(mp, "12345", 0);
        assertEquals(2, newPos);
        assertEquals(12, mp.getYears());
    }

    @Test
    public void testRejectSignedValues_true_rejectsSign() {
        PeriodFormatter f = builder.rejectSignedValues(true).appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "-5", 0);
        // hasDigits=false เพราะ '-' ไม่ถูกมองเป็น sign -> คืนค่า ~position (ลบ)
        assertTrue("คาดหวังค่าติดลบแสดงความล้มเหลว", pos < 0);
    }

    @Test
    public void testRejectSignedValues_false_acceptsSign() {
        PeriodFormatter f = builder.rejectSignedValues(false).appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "-5", 0);
        assertTrue(pos >= 0);
        assertEquals(-5, mp.getYears());
    }

    @Test
    public void testParseInt_signExpandsLimit() {
        // ตรวจสาขา limit = min(limit+1, ...) เมื่อพบ '+' นำหน้า
        PeriodFormatter f = builder.maximumParsedDigits(2).appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "+12", 0);
        assertEquals(3, pos);
        assertEquals(12, mp.getYears());
    }

    @Test
    public void testParseInt_longLength_branch() {
        // length >= 10 -> ใช้ Integer.parseInt branch
        PeriodFormatter f = builder.maximumParsedDigits(10).appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "1234567890", 0);
        assertEquals(10, pos);
        assertEquals(1234567890, mp.getYears());
    }

    // ============================================================
    // 5. appendPrefix
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_singleArgNull_throws() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_singularNull_throws() {
        builder.appendPrefix(null, "plural");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_pluralNull_throws() {
        builder.appendPrefix("singular", null);
    }

    @Test
    public void testAppendPrefix_normal() {
        PeriodFormatter f = builder.appendPrefix("H:").appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 0, 3, 0, 0, 0);
        assertEquals("H:3", f.print(p));
    }

    @Test
    public void testAppendPrefix_composite_branch() {
        // เรียก appendPrefix 2 ครั้งติดกัน -> เข้าสาขา iPrefix != null -> CompositeAffix
        PeriodFormatter f = builder.appendPrefix("A").appendPrefix("B").appendHours().toFormatter();
        Period p = new Period(0, 0, 0, 0, 3, 0, 0, 0);
        assertEquals("AB3", f.print(p));
    }

    @Test
    public void testAppendPrefix_pluralAffix_singularVsPlural() {
        PeriodFormatter f = builder.appendPrefix("1 hr:", "N hrs:").appendHours().toFormatter();
        assertEquals("1 hr:1", f.print(new Period(0, 0, 0, 0, 1, 0, 0, 0)));
        assertEquals("N hrs:2", f.print(new Period(0, 0, 0, 0, 2, 0, 0, 0)));
    }

    // ============================================================
    // 6. appendXxx field methods
    // ============================================================

    @Test
    public void testAppendYears() {
        PeriodFormatter f = builder.appendYears().toFormatter();
        assertEquals("7", f.print(new Period(7, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendMonths() {
        PeriodFormatter f = builder.appendMonths().toFormatter();
        assertEquals("7", f.print(new Period(0, 7, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendWeeks() {
        PeriodFormatter f = builder.appendWeeks().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 7, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendDays() {
        PeriodFormatter f = builder.appendDays().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 7, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendHours() {
        PeriodFormatter f = builder.appendHours().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 0, 7, 0, 0, 0)));
    }

    @Test
    public void testAppendMinutes() {
        PeriodFormatter f = builder.appendMinutes().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 0, 0, 7, 0, 0)));
    }

    @Test
    public void testAppendSeconds() {
        PeriodFormatter f = builder.appendSeconds().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 0, 0, 0, 7, 0)));
    }

    @Test
    public void testAppendMillis() {
        PeriodFormatter f = builder.appendMillis().toFormatter();
        assertEquals("7", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testAppendMillis3Digit() {
        PeriodFormatter f = builder.appendMillis3Digit().toFormatter();
        assertEquals("007", f.print(new Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testAppendSecondsWithMillis_alwaysShowsDecimal() {
        PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter();
        // iFieldType == SECONDS_MILLIS -> เงื่อนไข (iFieldType==SECONDS_MILLIS || dp>0) เป็นจริงเสมอ
        assertEquals("5.000", f.print(new Period(0, 0, 0, 0, 0, 0, 5, 0)));
        assertEquals("5.250", f.print(new Period(0, 0, 0, 0, 0, 0, 5, 250)));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis_dpZero_noDecimal() {
        PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("5", f.print(new Period(0, 0, 0, 0, 0, 0, 5, 0)));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis_dpNonZero_showsDecimal() {
        PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("5.250", f.print(new Period(0, 0, 0, 0, 0, 0, 5, 250)));
    }

    @Test
    public void testAppendSecondsWithMillis_negativeValue() {
        PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter();
        assertEquals("-5.250", f.print(new Period(0, 0, 0, 0, 0, 0, -5, -250)));
    }

    // ============================================================
    // 7. appendSuffix
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_singleArgNull_throws() {
        builder.appendYears();
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_singularNull_throws() {
        builder.appendYears();
        builder.appendSuffix(null, "years");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_pluralNull_throws() {
        builder.appendYears();
        builder.appendSuffix("year", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_noPriorField_throws() {
        // iElementPairs.size()==0 -> originalPrinter/Parser = null
        builder.appendSuffix("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_priorElementNotFieldFormatter_throws() {
        // Literal ไม่ใช่ FieldFormatter -> instanceof check ล้มเหลว
        builder.appendLiteral("abc");
        builder.appendSuffix("x");
    }

    @Test
    public void testAppendSuffix_normal() {
        PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter();
        assertEquals("1 year", f.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals("2 years", f.print(new Period(2, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSuffix_combinesWithExistingSuffix() {
        // ทดสอบ constructor FieldFormatter(field, suffix) กรณี field.iSuffix != null
        // โดยอ้อมผ่าน appendSuffix สองครั้งไม่ได้ (มันจะชี้ element ตัวใหม่ทุกครั้ง)
        // เทสนี้จึงตรวจแค่ suffix เดียวทำงานถูกต้องตามที่คาด (กรณีฐาน)
        PeriodFormatter f = builder.appendYears().appendSuffix("y").toFormatter();
        assertEquals("3y", f.print(new Period(3, 0, 0, 0, 0, 0, 0, 0)));
    }

    // ============================================================
    // 8. printZero* settings
    // ============================================================

    @Test
    public void testPrintZeroAlways_forcesZeroEvenIfUnsupported() {
        // ASSUMPTION: Period.get(DurationFieldType) คืน 0 เมื่อ field ไม่ถูก support
        PeriodFormatter f = builder.printZeroAlways().appendYears().toFormatter();
        Period unsupported = new Period(0, 5, 0, 0, 0, 0, 0, 0, PeriodType.months());
        assertEquals("0", f.print(unsupported));
    }

    @Test
    public void testPrintZeroNever_neverPrintsZero() {
        PeriodFormatter f = builder.printZeroNever().appendYears().appendSuffix("Y")
                .appendSeparator(",").appendMonths().appendSuffix("M").toFormatter();
        Period p = new Period(0, 5, 0, 0, 0, 0, 0, 0);
        assertEquals("5M", f.print(p));
    }

    @Test
    public void testPrintZeroIfSupported_supportedField_printsZero() {
        PeriodFormatter f = builder.printZeroIfSupported().appendYears().toFormatter();
        Period zero = new Period(0, 0, 0, 0, 0, 0, 0, 0); // standard type รองรับ years
        assertEquals("0", f.print(zero));
    }

    @Test
    public void testPrintZeroIfSupported_unsupportedField_notPrinted() {
        PeriodFormatter f = builder.printZeroIfSupported().appendYears().toFormatter();
        Period zero = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.months());
        assertEquals("", f.print(zero));
    }

    @Test
    public void testPrintZeroRarelyLast_forcesLastFieldOnAllZero() {
        PeriodFormatter f = builder.printZeroRarelyLast()
                .appendYears().appendMonths().toFormatter();
        Period zero = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0", f.print(zero)); // field "ท้าย" (months) ถูกบังคับพิมพ์ 0
    }

    @Test
    public void testPrintZeroRarelyFirst_forcesFirstFieldOnAllZero() {
        PeriodFormatter f = builder.printZeroRarelyFirst()
                .appendYears().appendMonths().toFormatter();
        Period zero = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0", f.print(zero)); // field "แรก" (years) ถูกบังคับพิมพ์ 0
    }

    @Test
    public void testPrintZeroRarelyLast_notZeroPeriod_regularSkip() {
        PeriodFormatter f = builder.printZeroRarelyLast()
                .appendYears().appendSuffix("Y")
                .appendSeparator(",")
                .appendMonths().appendSuffix("M").toFormatter();
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0); // months=0 แต่ไม่ใช่ all-zero
        assertEquals("1Y", f.print(p)); // months ถูกข้าม เพราะไม่ใช่ all-zero period
    }

    // ============================================================
    // 9. clear()
    // ============================================================

    @Test
    public void testClear_resetsBuilderState() {
        builder.appendYears().appendSuffix("Y").minimumPrintedDigits(5).printZeroAlways();
        builder.clear();
        PeriodFormatter f = builder.appendHours().toFormatter();
        // ค่า default กลับมา: minimumPrintedDigits=1 (unpadded), printZeroRarelyLast
        assertEquals("5", f.print(new Period(0, 0, 0, 0, 5, 0, 0, 0)));
    }

    // ============================================================
    // 10. toFormatter() clone ป้องกันผลกระทบย้อนหลัง (regression: Time-13)
    // ============================================================

    @Test
    public void testToFormatter_subsequentBuilderChanges_doNotAffectAlreadyBuiltFormatter() {
        builder.printZeroRarelyLast().appendYears().appendMonths();
        PeriodFormatter formatter1 = builder.toFormatter();

        Period zero = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0", formatter1.print(zero)); // months คือ field ท้ายสุด ณ ขณะนั้น

        // เพิ่ม field ใหม่ต่อจาก builder เดิม -> ต้องไม่กระทบ formatter1 ที่ build ไปแล้ว
        builder.appendDays();
        PeriodFormatter formatter2 = builder.toFormatter();
        assertEquals("0", formatter2.print(zero)); // days คือ field ท้ายสุดของ formatter2

        // formatter1 ต้องให้ผลลัพธ์เดิมไม่เปลี่ยน (สำคัญที่สุด: ตรวจ bug การ clone iFieldFormatters)
        assertEquals("0", formatter1.print(zero));
    }

    // ============================================================
    // 11. appendSeparator family
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_textNull_throws() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_twoArgs_finalTextNull_throws() {
        builder.appendSeparator("a", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_adjacentSeparators_throws() {
        builder.appendYears().appendSeparator(",").appendSeparator(";");
    }

    @Test
    public void testAppendSeparator_emptyBuilder_withUseAfterOnly() {
        // pairs.size()==0 && useAfter && !useBefore -> appendSeparatorIfFieldsAfter บน builder ว่าง
        PeriodFormatter f = builder.appendSeparatorIfFieldsAfter(",").appendHours().toFormatter();
        assertEquals("5", f.print(new Period(0, 0, 0, 0, 5, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparator_emptyBuilder_withUseBeforeOnly_noOp() {
        // pairs.size()==0 && !(useAfter && !useBefore) -> return this โดยไม่เพิ่มอะไร
        PeriodFormatter f = builder.appendSeparatorIfFieldsBefore(",").appendHours().toFormatter();
        assertEquals("5", f.print(new Period(0, 0, 0, 0, 5, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparator_normal_bothFieldsPrinted() {
        PeriodFormatter f = builder.appendDays().appendSuffix("d")
                .appendSeparator(",").appendHours().appendSuffix("h").toFormatter();
        Period p = new Period(0, 0, 0, 2, 3, 0, 0, 0);
        assertEquals("2d,3h", f.print(p));
    }

    @Test
    public void testAppendSeparator_textVsFinalText_allFieldsPrinted() {
        // ตามตัวอย่างใน Javadoc: afterCount > 1 ใช้ text, == 1 ใช้ finalText
        PeriodFormatter f = builder.appendYears().appendSuffix("Y")
                .appendSeparator(",", "&")
                .appendMonths().appendSuffix("M")
                .appendSeparator(",", "&")
                .appendDays().appendSuffix("D").toFormatter();
        Period p = new Period(1, 2, 0, 3, 0, 0, 0, 0);
        assertEquals("1Y,2M&3D", f.print(p));
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter_onlyWhenAfterPresent() {
        PeriodFormatter f = builder.printZeroNever().appendYears().appendSuffix("Y")
                .appendSeparatorIfFieldsAfter(",")
                .appendMonths().appendSuffix("M").toFormatter();
        // months=0 และ printZeroNever -> ไม่พิมพ์ month -> ไม่มี separator
        assertEquals("1Y", f.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals("1Y,2M", f.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore_onlyWhenBeforePresent() {
        PeriodFormatter f = builder.printZeroNever().appendYears().appendSuffix("Y")
                .appendSeparatorIfFieldsBefore(",")
                .appendMonths().appendSuffix("M").toFormatter();
        // years=0 -> ไม่พิมพ์ year -> ไม่มี separator แม้ months จะพิมพ์
        assertEquals("2M", f.print(new Period(0, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1Y,2M", f.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparator_withVariants_parses() {
        PeriodFormatter f = builder.appendDays().appendSuffix("d")
                .appendSeparator(",", ",", new String[] {";", "|"})
                .appendHours().appendSuffix("h").toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "2d;3h", 0);
        assertEquals(5, pos);
        assertEquals(2, mp.getDays());
        assertEquals(3, mp.getHours());
    }

    // ============================================================
    // 12. parsePeriod / parseInto - error cases
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testParsePeriod_malformedInput_throws() {
        PeriodFormatter f = builder.appendLiteral("ABC").toFormatter();
        // ASSUMPTION: parsePeriod() throw IllegalArgumentException เมื่อ parse ไม่สำเร็จ/ไม่ครบ
        f.parsePeriod("XYZ");
    }

    @Test
    public void testParseInto_prefixNotFound_notMustParse_returnsComplement() {
        PeriodFormatter f = builder.appendPrefix("P:").appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "5", 0); // ไม่มี "P:" นำหน้า และ printZero ไม่ใช่ ALWAYS -> mustParse=false
        assertTrue(pos < 0);
    }

    @Test
    public void testParseInto_prefixFound_mustParse_succeeds() {
        PeriodFormatter f = builder.appendPrefix("P:").appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "P:5", 0);
        assertEquals(3, pos);
        assertEquals(5, mp.getYears());
    }

    @Test
    public void testParseInto_positionAtEnd_mustParseFalse_returnsPosition() {
        PeriodFormatter f = builder.appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "abc", 3); // position >= text.length(), mustParse=false (ไม่ใช่ PRINT_ZERO_ALWAYS)
        assertEquals(3, pos);
    }

    @Test
    public void testParseInto_positionAtEnd_mustParseTrue_returnsComplement() {
        PeriodFormatter f = builder.printZeroAlways().appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "abc", 3); // mustParse=true -> ~position
        assertEquals(~3, pos);
    }

    @Test
    public void testParseInto_noDigits_returnsComplement() {
        PeriodFormatter f = builder.appendYears().toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "abc", 0);
        assertTrue(pos < 0);
    }

    // ============================================================
    // 13. SimpleAffix / PluralAffix (ทางอ้อมผ่าน prefix/suffix parsing)
    // ============================================================

    @Test
    public void testSuffix_pluralAffix_parseAcceptsEither() {
        PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter();
        MutablePeriod mp = new MutablePeriod();
        // parse แบบ plural แม้ value=1 (ตามคอมเมนต์: "accepted whether or not the actual value matches plurality")
        int pos = f.parseInto(mp, "1 years", 0);
        assertTrue(pos >= 0);
        assertEquals(1, mp.getYears());
    }

    @Test
    public void testSuffix_simpleAffix_parseCaseInsensitive() {
        PeriodFormatter f = builder.appendYears().appendSuffix("Y").toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = f.parseInto(mp, "5y", 0); // case-insensitive ตาม SimpleAffix.parse
        assertTrue(pos >= 0);
        assertEquals(5, mp.getYears());
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testToFormatter_emptyBuilder_doesNotThrow | `createComposite` size==0 → Literal.EMPTY |
| testToFormatter_bothNotPrinterNotParser_throwsIllegalState | `notPrinter && notParser` → throw |
| testToPrinter_returnsNull/Value* | `iNotPrinter` true/false branch |
| testToParser_returnsNull/Value* | `iNotParser` true/false branch |
| testAppendFormatter_null_throws | null check ใน `append(PeriodFormatter)` |
| testAppendPrinterParser_bothNull_throws | null check ใน `append(printer,parser)` |
| testAppendFormatter_normal / PrinterParser_onlyPrinter | normal path append0 |
| testAppendLiteral_null_throws / normal | null check / normal literal |
| testMinimumPrintedDigits_padded/Unpadded | `minDigits<=1` if/else |
| testMaximumParsedDigits_limitsParsedLength | limit คำนวณจาก maxParsedDigits |
| testRejectSignedValues_true/false | sign-accept condition ใน parseInto loop |
| testParseInt_signExpandsLimit | ขยาย limit เมื่อพบ sign |
| testParseInt_longLength_branch | `length>=10` ใน parseInt |
| testAppendPrefix_* (null x3, normal, composite, plural) | null checks, `iPrefix!=null` composite branch, PluralAffix |
| testAppendYears...Millis3Digit | field type switch ทุกตัว (YEARS..MILLIS) |
| testAppendSecondsWithMillis_* / OptionalMillis_* / negative | SECONDS_MILLIS/OPTIONAL branch, `dp>0` if/else, ลบ 4 หลักเมื่อ dp==0 |
| testAppendSuffix_* (null x3, no field, not FieldFormatter, normal) | null checks, IllegalStateException สองเงื่อนไข, normal |
| testPrintZeroAlways_forcesZero | PRINT_ZERO_ALWAYS, `type=null` skip isSupported |
| testPrintZeroNever_neverPrintsZero | PRINT_ZERO_NEVER → MAX_VALUE |
| testPrintZeroIfSupported_* | supported/unsupported branch |
| testPrintZeroRarelyLast_* / RarelyFirst_* | forced-last/first zero logic, loop ทั้งสองทิศทาง |
| testClear_resetsBuilderState | `clear()` reset ค่า default |
| testToFormatter_subsequentBuilderChanges_* | การ clone `iFieldFormatters` ป้องกันผลกระทบย้อนหลัง (Time-13 regression) |
| testAppendSeparator_null/finalTextNull_throws | null checks ใน appendSeparator |
| testAppendSeparator_adjacentSeparators_throws | `lastSeparator!=null && pairs.size()==0` |
| testAppendSeparator_emptyBuilder_* | `pairs.size()==0` + useBefore/useAfter combos |
| testAppendSeparator_normal / textVsFinalText | afterCount>1 vs ==1 branch, merge composite |
| testAppendSeparatorIfFieldsAfter/Before | useBefore/useAfter เดี่ยว ๆ |
| testAppendSeparator_withVariants_parses | TreeSet variants parsing branch |
| testParsePeriod_malformedInput_throws | parse failure high-level |
| testParseInto_prefix* | prefix found/not found, mustParse true/false |
| testParseInto_positionAtEnd_* | shortcut `position>=text.length()` ทั้ง mustParse true/false |
| testParseInto_noDigits_returnsComplement | `!hasDigits` branch |
| testSuffix_pluralAffix_parseAcceptsEither | PluralAffix.parse swap+match |
| testSuffix_simpleAffix_parseCaseInsensitive | SimpleAffix.parse case-insensitive |

**ข้อจำกัด/จุดที่ไม่แน่ใจ (คอมเมนต์ไว้ในโค้ด):** exact public API signature ของ `PeriodFormatter` (print/parsePeriod/parseInto) และ behavior ของ `Period.get()` กับฟิลด์ที่ไม่ถูกรองรับ เนื่องจากไม่มีซอร์สของคลาสเหล่านี้ให้มาด้วย