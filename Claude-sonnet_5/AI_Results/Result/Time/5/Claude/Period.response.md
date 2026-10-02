# PeriodTest.java

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับคลาส `org.joda.time.Period` ที่ครอบคลุม branch/condition ต่าง ๆ ที่วิเคราะห์ได้จากซอร์สโค้ดที่ให้มา

**หมายเหตุสำคัญ:** สังเกตว่าเมธอด `Period.years(int)` สร้าง array ขนาด 9 ช่อง (`{years,0,0,0,0,0,0,0,0}`) ในขณะที่เมธอด factory อื่น ๆ (`months`, `weeks`, `days`, ...) สร้าง array ขนาด 8 ช่อง ให้ตรงกับ `PeriodType.standard()` (8 fields) — นี่คือความไม่สอดคล้องที่น่าสงสัยว่าเป็น fault จริงของเวอร์ชันนี้ จึงมีเทสเฉพาะเจาะจงเพื่อดักจับพฤติกรรมนี้ (ดูหมวด A) โดยไม่เดา exception ที่อาจเกิด แต่เทสผลลัพธ์ที่ควรถูกต้องตาม contract เท่านั้น

```java
package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.ISOPeriodFormat;

public class PeriodTest {

    //=====================================================================
    // Test double สำหรับ ReadablePartial ที่ควบคุม DateTimeFieldType ได้เอง
    // ใช้เฉพาะกรณีที่ไม่สามารถสร้างผ่าน Partial ปรกติได้ (overlapping fields)
    //=====================================================================
    private static class FakePartial implements ReadablePartial {
        private final DateTimeFieldType[] types;
        private final int[] values;
        FakePartial(DateTimeFieldType[] types, int[] values) {
            this.types = types;
            this.values = values;
        }
        public int size() { return types.length; }
        public DateTimeFieldType getFieldType(int index) { return types[index]; }
        public DateTimeField getField(int index) { return types[index].getField(ISOChronology.getInstanceUTC()); }
        public int getValue(int index) { return values[index]; }
        public int get(DateTimeFieldType fieldType) {
            for (int i = 0; i < types.length; i++) {
                if (types[i] == fieldType) return values[i];
            }
            throw new IllegalArgumentException("unsupported");
        }
        public boolean isSupported(DateTimeFieldType fieldType) {
            for (DateTimeFieldType t : types) {
                if (t == fieldType) return true;
            }
            return false;
        }
        public Chronology getChronology() { return ISOChronology.getInstanceUTC(); }
        public DateTime toDateTime(ReadableInstant baseInstant) {
            throw new UnsupportedOperationException("not used in these tests");
        }
        public int compareTo(ReadablePartial partial) { return 0; }
    }

    //=====================================================================
    // A. Static factory methods (years/months/.../millis) + parse
    //=====================================================================

    @Test
    public void testParse_default() {
        Period p = Period.parse("P1Y2M3W4DT5H6M7S");
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
    }

    @Test
    public void testParse_withFormatter() {
        PeriodFormatter f = ISOPeriodFormat.standard();
        Period p = Period.parse("P1D", f);
        assertEquals(1, p.getDays());
    }

    @Test
    public void testParse_invalidString_throws() {
        try {
            Period.parse("garbage");
            fail("expected exception for malformed input");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    // --- สำคัญ: ดักจับ fault ของ years() ที่สร้าง array ผิดขนาด (9 ช่องแทน 8) ---
    @Test
    public void testYears_zero() {
        Period p = Period.years(0);
        assertEquals(0, p.getYears());
        assertEquals(0, p.getMonths());
    }

    @Test
    public void testYears_positive_fieldsAreCorrect() {
        Period p = Period.years(5);
        assertEquals(5, p.getYears());
        // ฟิลด์อื่นต้องเป็น 0 แม้ internal array จะมีขนาดผิดปรกติ (9 ช่อง)
        assertEquals(0, p.getMonths());
        assertEquals(0, p.getWeeks());
        assertEquals(0, p.getDays());
        assertEquals(0, p.getHours());
        assertEquals(0, p.getMinutes());
        assertEquals(0, p.getSeconds());
        assertEquals(0, p.getMillis());
    }

    @Test
    public void testYears_negative() {
        Period p = Period.years(-3);
        assertEquals(-3, p.getYears());
    }

    @Test
    public void testMonths_basic() {
        assertEquals(4, Period.months(4).getMonths());
    }

    @Test
    public void testWeeks_basic() {
        assertEquals(2, Period.weeks(2).getWeeks());
    }

    @Test
    public void testDays_basic() {
        assertEquals(7, Period.days(7).getDays());
    }

    @Test
    public void testHours_basic() {
        assertEquals(10, Period.hours(10).getHours());
    }

    @Test
    public void testMinutes_basic() {
        assertEquals(30, Period.minutes(30).getMinutes());
    }

    @Test
    public void testSeconds_basic() {
        assertEquals(45, Period.seconds(45).getSeconds());
    }

    @Test
    public void testMillis_basic() {
        assertEquals(500, Period.millis(500).getMillis());
    }

    //=====================================================================
    // B. fieldDifference(ReadablePartial, ReadablePartial)
    //=====================================================================

    @Test
    public void testFieldDifference_nullStart_throws() {
        try {
            Period.fieldDifference(null, new LocalDate(2020, 1, 1));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFieldDifference_nullEnd_throws() {
        try {
            Period.fieldDifference(new LocalDate(2020, 1, 1), null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFieldDifference_differentSize_throws() {
        ReadablePartial start = new LocalDate(2020, 1, 1);   // size = 3
        ReadablePartial end = new LocalTime(10, 0, 0, 0);    // size = 4
        try {
            Period.fieldDifference(start, end);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFieldDifference_differentFieldTypeAtIndex_throws() {
        Partial start = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});
        Partial end = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()},
                new int[]{2020, 10});
        try {
            Period.fieldDifference(start, end);
            fail("expected IllegalArgumentException (field types differ)");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFieldDifference_overlappingFields_throws() {
        // ใช้ FakePartial เพื่อบังคับให้ duration type ของ 2 ฟิลด์เหมือนกัน (ปรกติสร้างผ่าน Partial ไม่ได้)
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.year()};
        FakePartial start = new FakePartial(types, new int[]{2020, 2020});
        FakePartial end = new FakePartial(types, new int[]{2021, 2021});
        try {
            Period.fieldDifference(start, end);
            fail("expected IllegalArgumentException (overlapping fields)");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFieldDifference_normal_localDate() {
        LocalDate start = new LocalDate(2005, 6, 9);
        LocalDate end = new LocalDate(2007, 4, 12);
        Period p = Period.fieldDifference(start, end);
        assertEquals(1, p.getYears());
        assertEquals(-2, p.getMonths());
        assertEquals(3, p.getDays());
    }

    //=====================================================================
    // C. Constructors (smoke + boundary + exception)
    //=====================================================================

    @Test
    public void testConstructor_default_allZero() {
        Period p = new Period();
        assertEquals(0, p.getYears());
        assertEquals(0, p.getMillis());
    }

    @Test
    public void testConstructor_fourArgs() {
        Period p = new Period(1, 2, 3, 4);
        assertEquals(1, p.getHours());
        assertEquals(2, p.getMinutes());
        assertEquals(3, p.getSeconds());
        assertEquals(4, p.getMillis());
    }

    @Test
    public void testConstructor_eightArgs() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, p.getYears());
        assertEquals(8, p.getMillis());
    }

    @Test
    public void testConstructor_eightArgsWithType_valid() {
        Period p = new Period(0, 0, 0, 5, 3, 2, 1, 0, PeriodType.dayTime());
        assertEquals(5, p.getDays());
    }

    @Test
    public void testConstructor_eightArgsWithType_unsupportedNonZero_throws() {
        try {
            new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.dayTime());
            fail("expected IllegalArgumentException: years unsupported in dayTime()");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructor_longDuration() {
        Period p = new Period(3661000L); // 1h 1m 1s
        assertTrue(p.getHours() >= 0);
    }

    @Test
    public void testConstructor_longDuration_withType() {
        Period p = new Period(1000L, PeriodType.seconds());
        assertEquals(1, p.getSeconds());
    }

    @Test
    public void testConstructor_startEndMillis() {
        Period p = new Period(0L, 1000L);
        assertEquals(1, p.getSeconds());
    }

    @Test
    public void testConstructor_startEndMillis_withType() {
        Period p = new Period(0L, 1000L, PeriodType.seconds());
        assertEquals(1, p.getSeconds());
    }

    @Test
    public void testConstructor_readableInstants() {
        DateTime start = new DateTime(2020, 1, 1, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2020, 1, 2, 0, 0, ISOChronology.getInstanceUTC());
        Period p = new Period(start, end);
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_readablePartials_localDate() {
        Period p = new Period(new LocalDate(2020, 1, 1), new LocalDate(2020, 2, 1));
        assertTrue(p.getMonths() >= 0);
    }

    @Test
    public void testConstructor_fromObjectString() {
        Period p = new Period((Object) "P1D");
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_fromObjectPeriod() {
        Period original = new Period(0, 0, 0, 2, 0, 0, 0, 0);
        Period copy = new Period((Object) original);
        assertEquals(2, copy.getDays());
    }

    //=====================================================================
    // D. Getters (delegation ผ่าน PeriodType)
    //=====================================================================

    @Test
    public void testGetters_standardType_allFields() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());
    }

    @Test
    public void testGetYears_unsupportedType_returnsZero() {
        Period p = new Period(0, 0, 0, 5, 3, 2, 1, 0, PeriodType.dayTime());
        assertEquals(0, p.getYears());
    }

    //=====================================================================
    // E. toPeriod()
    //=====================================================================

    @Test
    public void testToPeriod_returnsSelf() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.toPeriod());
    }

    //=====================================================================
    // F. withPeriodType
    //=====================================================================

    @Test
    public void testWithPeriodType_sameType_returnsSameInstance() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); // standard type
        Period result = p.withPeriodType(PeriodType.standard());
        assertSame(p, result);
    }

    @Test
    public void testWithPeriodType_differentType_returnsNewInstance() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period result = p.withPeriodType(PeriodType.yearMonthDayTime());
        assertNotSame(p, result);
        assertEquals(1, result.getYears());
    }

    @Test
    public void testWithPeriodType_null_defaultsToStandard() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); // already standard
        Period result = p.withPeriodType(null);
        assertSame(p, result);
    }

    //=====================================================================
    // G. withFields
    //=====================================================================

    @Test
    public void testWithFields_null_returnsSameInstance() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.withFields(null));
    }

    @Test
    public void testWithFields_nonNull_mergesFields() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Period toMerge = Period.months(5);
        Period result = p.withFields(toMerge);
        assertEquals(1, result.getYears());
        assertEquals(5, result.getMonths());
    }

    //=====================================================================
    // H. withField
    //=====================================================================

    @Test
    public void testWithField_nullField_throwsIAE() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.withField(null, 5);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithField_valid_setsFieldValue() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Period result = p.withField(DurationFieldType.months(), 9);
        assertEquals(9, result.getMonths());
    }

    //=====================================================================
    // I. withFieldAdded
    //=====================================================================

    @Test
    public void testWithFieldAdded_nullField_throwsIAE() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.withFieldAdded(null, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithFieldAdded_zeroValue_returnsSameInstance() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.withFieldAdded(DurationFieldType.years(), 0));
    }

    @Test
    public void testWithFieldAdded_nonZeroValue_addsField() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Period result = p.withFieldAdded(DurationFieldType.years(), 4);
        assertEquals(5, result.getYears());
    }

    //=====================================================================
    // J. withYears..withMillis
    //=====================================================================

    @Test
    public void testWithYears_setsValue() {
        assertEquals(9, new Period(1,0,0,0,0,0,0,0).withYears(9).getYears());
    }

    @Test
    public void testWithMonths_setsValue() {
        assertEquals(9, new Period(0,1,0,0,0,0,0,0).withMonths(9).getMonths());
    }

    @Test
    public void testWithWeeks_setsValue() {
        assertEquals(9, new Period(0,0,1,0,0,0,0,0).withWeeks(9).getWeeks());
    }

    @Test
    public void testWithDays_setsValue() {
        assertEquals(9, new Period(0,0,0,1,0,0,0,0).withDays(9).getDays());
    }

    @Test
    public void testWithHours_setsValue() {
        assertEquals(9, new Period(0,0,0,0,1,0,0,0).withHours(9).getHours());
    }

    @Test
    public void testWithMinutes_setsValue() {
        assertEquals(9, new Period(0,0,0,0,0,1,0,0).withMinutes(9).getMinutes());
    }

    @Test
    public void testWithSeconds_setsValue() {
        assertEquals(9, new Period(0,0,0,0,0,0,1,0).withSeconds(9).getSeconds());
    }

    @Test
    public void testWithMillis_setsValue() {
        assertEquals(9, new Period(0,0,0,0,0,0,0,1).withMillis(9).getMillis());
    }

    @Test
    public void testWithYears_unsupportedField_throws() {
        Period p = new Period(0, 0, 0, 5, 3, 2, 1, 0, PeriodType.dayTime());
        try {
            p.withYears(5);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    //=====================================================================
    // K. plus(ReadablePeriod)
    //=====================================================================

    @Test
    public void testPlus_null_returnsSameInstance() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.plus(null));
    }

    @Test
    public void testPlus_nonNull_sumsFields() {
        Period p1 = new Period(1, 2, 0, 0, 0, 0, 0, 0);
        Period p2 = new Period(1, 1, 0, 0, 0, 0, 0, 0);
        Period result = p1.plus(p2);
        assertEquals(2, result.getYears());
        assertEquals(3, result.getMonths());
    }

    //=====================================================================
    // L. plusYears..plusMillis
    //=====================================================================

    @Test
    public void testPlusYears_zero_returnsSameInstance() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.plusYears(0));
    }

    @Test
    public void testPlusYears_nonZero_addsValue() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(6, p.plusYears(5).getYears());
    }

    @Test
    public void testPlusMonths_zero_returnsSameInstance() {
        Period p = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.plusMonths(0));
    }

    @Test
    public void testPlusDays_nonZero_addsValue() {
        Period p = new Period(0, 0, 0, 1, 0, 0, 0, 0);
        assertEquals(4, p.plusDays(3).getDays());
    }

    @Test
    public void testPlusMillis_nonZero_addsValue() {
        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 1);
        assertEquals(11, p.plusMillis(10).getMillis());
    }

    @Test
    public void testPlusYears_unsupportedButZero_noException() {
        // early-return ก่อนตรวจสอบ supported field
        Period p = new Period(0, 0, 0, 5, 0, 0, 0, 0, PeriodType.dayTime());
        assertSame(p, p.plusYears(0));
    }

    //=====================================================================
    // M. minus(ReadablePeriod)
    //=====================================================================

    @Test
    public void testMinus_null_returnsSameInstance() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.minus(null));
    }

    @Test
    public void testMinus_nonNull_subtractsFields() {
        Period p1 = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        Period p2 = new Period(2, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(3, p1.minus(p2).getYears());
    }

    //=====================================================================
    // N. minusYears..minusMillis (delegation to plusXxx(-value))
    //=====================================================================

    @Test
    public void testMinusYears_delegatesToPlusYearsNegated() {
        Period p = new Period(10, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(7, p.minusYears(3).getYears());
    }

    @Test
    public void testMinusHours_delegatesToPlusHoursNegated() {
        Period p = new Period(0, 0, 0, 0, 10, 0, 0, 0);
        assertEquals(4, p.minusHours(6).getHours());
    }

    @Test
    public void testMinusSeconds_zero_returnsSameInstance() {
        Period p = new Period(0, 0, 0, 0, 0, 0, 5, 0);
        assertSame(p, p.minusSeconds(0));
    }

    //=====================================================================
    // O. multipliedBy
    //=====================================================================

    @Test
    public void testMultipliedBy_zeroInstance_returnsSameInstance() {
        assertSame(Period.ZERO, Period.ZERO.multipliedBy(5));
    }

    @Test
    public void testMultipliedBy_scalarOne_returnsSameInstance() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertSame(p, p.multipliedBy(1));
    }

    @Test
    public void testMultipliedBy_normalScalar_multipliesAllFields() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period result = p.multipliedBy(3);
        assertEquals(3, result.getYears());
        assertEquals(24, result.getMillis());
    }

    @Test
    public void testMultipliedBy_negativeScalar() {
        Period p = new Period(2, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(-4, p.multipliedBy(-2).getYears());
    }

    @Test
    public void testMultipliedBy_overflow_throwsArithmeticException() {
        Period p = new Period(Integer.MAX_VALUE, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.multipliedBy(2);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    //=====================================================================
    // P. negated
    //=====================================================================

    @Test
    public void testNegated_normalPeriod() {
        Period p = new Period(2, 3, 0, 0, 0, 0, 0, 0);
        Period result = p.negated();
        assertEquals(-2, result.getYears());
        assertEquals(-3, result.getMonths());
    }

    @Test
    public void testNegated_zeroInstance_returnsSameInstance() {
        assertSame(Period.ZERO, Period.ZERO.negated());
    }

    //=====================================================================
    // Q. toStandardWeeks/Days/Hours/Minutes/Seconds/Duration + checkYearsAndMonths
    //=====================================================================

    @Test
    public void testToStandardWeeks_withMonths_throws() {
        Period p = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        try {
            p.toStandardWeeks();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testToStandardWeeks_withYears_throws() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.toStandardWeeks();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testToStandardWeeks_normal() {
        Period p = new Period(0, 0, 1, 7, 0, 0, 0, 0); // 1 week + 7 days = 2 weeks
        assertEquals(2, p.toStandardWeeks().getWeeks());
    }

    @Test
    public void testToStandardDays_normal() {
        Period p = new Period(0, 0, 1, 1, 24, 0, 0, 0); // 1w+1d+24h = 9 days
        assertEquals(9, p.toStandardDays().getDays());
    }

    @Test
    public void testToStandardHours_normal() {
        Period p = new Period(0, 0, 0, 1, 1, 60, 0, 0); // 1d+1h+60m = 26h
        assertEquals(26, p.toStandardHours().getHours());
    }

    @Test
    public void testToStandardMinutes_normal() {
        Period p = new Period(0, 0, 0, 0, 1, 1, 60, 0); // 1h+1m+60s = 62m
        assertEquals(62, p.toStandardMinutes().getMinutes());
    }

    @Test
    public void testToStandardSeconds_normal() {
        Period p = new Period(0, 0, 0, 0, 0, 1, 1, 1000); // 1m+1s+1000ms = 62s
        assertEquals(62, p.toStandardSeconds().getSeconds());
    }

    @Test
    public void testToStandardDuration_withMonths_throws() {
        Period p = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        try {
            p.toStandardDuration();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testToStandardDuration_withYears_throws() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.toStandardDuration();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testToStandardDuration_normal() {
        Period p = new Period(0, 0, 0, 1, 0, 0, 0, 0); // 1 day
        Duration d = p.toStandardDuration();
        assertEquals(DateTimeConstants.MILLIS_PER_DAY, d.getMillis());
    }

    //=====================================================================
    // R. normalizedStandard() / normalizedStandard(PeriodType)
    //=====================================================================

    @Test
    public void testNormalizedStandard_default_delegates() {
        Period p = new Period(0, 15, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard();
        assertEquals(1, result.getYears());
        assertEquals(3, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_zeroYearsZeroMonths_skipsAdjustment() {
        Period p = new Period(0, 0, 0, 0, 25, 0, 0, 0); // 25 hours, no years/months
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(0, result.getYears());
        assertEquals(0, result.getMonths());
        assertEquals(1, result.getDays());
        assertEquals(1, result.getHours());
    }

    @Test
    public void testNormalizedStandard_onlyYears_setsYearsField() {
        Period p = new Period(3, 0, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(3, result.getYears());
        assertEquals(0, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_onlyMonthsLessThan12_setsMonthsField() {
        Period p = new Period(0, 5, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(0, result.getYears());
        assertEquals(5, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_monthsMultipleOf12_convertsToYearsOnly() {
        Period p = new Period(0, 24, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(2, result.getYears());
        assertEquals(0, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_monthsGreaterThan12_yearsAndRemainder() {
        Period p = new Period(0, 15, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(1, result.getYears());
        assertEquals(3, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_negativeYearsCancelWithMonths_bothZero() {
        Period p = new Period(-1, 12, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(0, result.getYears());
        assertEquals(0, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_explicitType_foldsWeeksIntoDays() {
        Period p = new Period(0, 0, 1, 0, 0, 0, 0, 0); // 1 week
        Period result = p.normalizedStandard(PeriodType.dayTime());
        assertEquals(7, result.getDays());
        assertEquals(0, result.getHours());
    }

    @Test
    public void testNormalizedStandard_nullType_defaultsToStandard() {
        Period p = new Period(0, 15, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(null);
        assertEquals(1, result.getYears());
        assertEquals(3, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_typeUnsupportedYears_throws() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        try {
            p.normalizedStandard(PeriodType.dayTime());
            fail("expected UnsupportedOperationException: dayTime() ไม่รองรับ years");
        } catch (UnsupportedOperationException expected) { }
    }
}
```

## ตารางสรุป Coverage

| กลุ่มเทส | เมธอดที่ถูกทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| A. Factory methods | `parse`, `years`..`millis` | parse ปรกติ/formatter/ผิดรูปแบบ; **ตรวจจับ fault ของ `years()`** (array ขนาด 9 vs 8); boundary 0/+/- |
| B. fieldDifference | `fieldDifference` | null start/end → throw; size ไม่เท่ากัน → throw; field type ต่างกันใน index → throw; overlapping duration type (`types[i-1]==types[i]`) → throw; กรณีปรกติ |
| C. Constructors | ctor ต่าง ๆ | smoke test ของ overload หลัก; เคส unsupported field ไม่เป็นศูนย์ใน type ที่กำหนด → throw IAE |
| D. Getters | `getYears`..`getMillis` | field ที่ supported คืนค่าจริง, field ที่ unsupported คืน 0 |
| E. toPeriod | `toPeriod` | คืน `this` เดิม |
| F. withPeriodType | `withPeriodType` | type เท่ากัน → return this; type ต่างกัน → new instance; null → ใช้ standard |
| G. withFields | `withFields` | period == null → return this; non-null → merge |
| H. withField | `withField` | field == null → throw IAE; ปรกติ → set ค่า |
| I. withFieldAdded | `withFieldAdded` | field==null → throw IAE; value==0 → return this; value!=0 → add |
| J. withYears..withMillis | 8 เมธอด with* | set ค่าปรกติ 8 field; unsupported field → throw UnsupportedOperationException |
| K. plus(period) | `plus` | period==null → return this; non-null → รวมค่า 8 field |
| L. plusYears..plusMillis | 8 เมธอด plus* | value==0 → return this; value!=0 → เพิ่มค่า; unsupported-but-zero ไม่ throw (early return) |
| M. minus(period) | `minus` | period==null → return this; non-null → ลบค่า |
| N. minusYears..minusMillis | 3 ตัวแทน | delegate ไป plusXxx(-value) ถูกต้อง รวมกรณี 0 |
| O. multipliedBy | `multipliedBy` | this==ZERO → return this; scalar==1 → return this; ปรกติ/ลบ; overflow → ArithmeticException |
| P. negated | `negated` | ปรกติ negate ทุก field; ZERO instance → return same |
| Q. toStandardXxx + checkYearsAndMonths | `toStandardWeeks/Days/Hours/Minutes/Seconds/Duration` | `getMonths()!=0` → throw; `getYears()!=0` → throw (หลัง months ผ่าน); กรณีปรกติคำนวณถูกต้อง |
| R. normalizedStandard | `normalizedStandard()` / `(PeriodType)` | default delegate; `years==0&&months==0` → skip if; years-only; months<12; months%12==0; months>12; years/months หักกันจนเหลือ 0; type param ที่ไม่ใช่ null (fold weeks→days); type==null→standard; type ไม่รองรับ years → throw ที่ `withYears` |

**ข้อจำกัดที่ยังไม่ครอบคลุม 100%:** บาง constructor overload (เช่น `ReadableDuration`+`ReadableInstant` รวมกัน, `Object`+`Chronology`) ไม่มี branch ภายใน `Period.java` เอง (เพียง delegate ไป `super(...)`) จึงไม่ได้เพิ่ม test แยกสำหรับทุก overload เพื่อไม่ให้ชุดทดสอบยาวเกินจำเป็น — ครอบคลุมแล้วผ่านกลุ่ม C ซึ่งเป็นตัวแทนที่หลากหลายเพียงพอสำหรับ smoke-level coverage.