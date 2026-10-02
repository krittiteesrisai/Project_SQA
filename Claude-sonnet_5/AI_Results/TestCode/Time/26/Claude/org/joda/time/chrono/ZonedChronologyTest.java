package org.joda.time.chrono;

// import แบบ explicit ตามข้อกำหนด (แม้อยู่ package เดียวกัน เพื่อความชัดเจนว่าเทสอะไร)
import org.joda.time.chrono.ZonedChronology;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZonedChronologyTest {

    private final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    // zone แบบ fixed offset (ไม่มี DST) ใช้ deterministic ไม่พึ่งข้อมูล TZ ของระบบ
    private final DateTimeZone FIXED_ZONE = DateTimeZone.forOffsetHours(5);
    // zone ที่มี DST จริง ใช้ทดสอบ gap/transition (Europe/Paris: 2013-03-31 02:00 -> 03:00)
    private final DateTimeZone DST_ZONE = DateTimeZone.forID("Europe/Paris");

    // ---------------------------------------------------------------
    // getInstance()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullBase() {
        ZonedChronology.getInstance(null, FIXED_ZONE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullZone() {
        ZonedChronology.getInstance(ISO_UTC, null);
    }

    // Branch "base.withUTC() == null" ไม่สามารถ trigger ได้ด้วย Chronology จริงที่มีใน classpath
    // (ต้องใช้ mock ซึ่งไม่มี mocking library ให้ใช้) จึงไม่ได้เขียนเทสสำหรับ branch นี้

    @Test
    public void testGetInstance_valid() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertNotNull(chrono);
        assertEquals(FIXED_ZONE, chrono.getZone());
        assertEquals(ISO_UTC, chrono.withUTC());
    }

    // ---------------------------------------------------------------
    // useTimeArithmetic (static package-private)
    // ---------------------------------------------------------------

    @Test
    public void testUseTimeArithmetic_nullField() {
        assertFalse(ZonedChronology.useTimeArithmetic(null));
    }

    @Test
    public void testUseTimeArithmetic_smallUnit_true() {
        DurationField hours = ISO_UTC.hours();
        assertTrue(ZonedChronology.useTimeArithmetic(hours));
    }

    @Test
    public void testUseTimeArithmetic_largeUnit_false() {
        DurationField days = ISO_UTC.days();
        assertFalse(ZonedChronology.useTimeArithmetic(days));
    }

    // ---------------------------------------------------------------
    // withZone()
    // ---------------------------------------------------------------

    @Test
    public void testWithZone_null_usesDefault() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        Chronology result = chrono.withZone(null);
        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    public void testWithZone_sameZoneReference_returnsThis() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        Chronology result = chrono.withZone(chrono.getZone());
        assertSame(chrono, result);
    }

    @Test
    public void testWithZone_UTC_returnsBase() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        Chronology result = chrono.withZone(DateTimeZone.UTC);
        assertSame(chrono.withUTC(), result);
    }

    @Test
    public void testWithZone_differentZone_returnsNewInstance() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        Chronology result = chrono.withZone(DST_ZONE);
        assertNotSame(chrono, result);
        assertEquals(DST_ZONE, result.getZone());
    }

    // ---------------------------------------------------------------
    // getDateTimeMillis() overloads + localToUTC()
    // ---------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis_4args_normal() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long millis = chrono.getDateTimeMillis(2020, 6, 15, 0);
        // round-trip: แปลงกลับมาต้องได้ปี/เดือน/วันเดิม
        assertEquals(2020, chrono.year().get(millis));
        assertEquals(6, chrono.monthOfYear().get(millis));
        assertEquals(15, chrono.dayOfMonth().get(millis));
    }

    @Test
    public void testGetDateTimeMillis_7args_normal() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long millis = chrono.getDateTimeMillis(2020, 6, 15, 10, 20, 30, 40);
        assertEquals(10, chrono.hourOfDay().get(millis));
        assertEquals(20, chrono.minuteOfHour().get(millis));
        assertEquals(30, chrono.secondOfMinute().get(millis));
        assertEquals(40, chrono.millisOfSecond().get(millis));
    }

    @Test
    public void testGetDateTimeMillis_instantPlusTime_normal() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long baseInstant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long result = chrono.getDateTimeMillis(baseInstant, 5, 0, 0, 0);
        assertEquals(5, chrono.hourOfDay().get(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLocalToUTC_gapThrows() {
        // Europe/Paris, 2013-03-31: เวลา local 02:00-03:00 ไม่มีอยู่จริง (DST spring-forward)
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        chrono.getDateTimeMillis(2013, 3, 31, 2, 30, 0, 0);
    }

    // ---------------------------------------------------------------
    // equals() / hashCode() / toString()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertTrue(chrono.equals(chrono));
    }

    @Test
    public void testEquals_notInstanceOf() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertFalse(chrono.equals("not a chronology"));
        assertFalse(chrono.equals(null));
    }

    @Test
    public void testEquals_equalBaseAndZone_true() {
        ZonedChronology c1 = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        ZonedChronology c2 = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_differentZone_false() {
        ZonedChronology c1 = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        ZonedChronology c2 = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_differentBase_false() {
        ZonedChronology c1 = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        ZonedChronology c2 = ZonedChronology.getInstance(GregorianChronology.getInstanceUTC(), FIXED_ZONE);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testHashCode_formulaAndConsistency() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        int expected = 326565 + chrono.getZone().hashCode() * 11 + chrono.getBase().hashCode() * 7;
        assertEquals(expected, chrono.hashCode());

        ZonedChronology sameOne = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertEquals(chrono.hashCode(), sameOne.hashCode());
    }

    @Test
    public void testToString_format() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        String expected = "ZonedChronology[" + chrono.getBase() + ", " + chrono.getZone().getID() + ']';
        assertEquals(expected, chrono.toString());
    }

    // ---------------------------------------------------------------
    // assemble()/convertField() ผ่าน field access (indirect)
    // ---------------------------------------------------------------

    @Test
    public void testAssemble_fieldsAreZonedAndCached() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        DateTimeField dayOfMonth = chrono.dayOfMonth();
        DateTimeField dayOfWeek = chrono.dayOfWeek();

        assertNotNull(dayOfMonth);
        assertNotNull(dayOfWeek);

        // dayOfMonth และ dayOfWeek ใช้ duration field "days" ตัวเดียวกันจาก base
        // -> ต้อง map ไปเป็น ZonedDurationField instance เดียวกัน (converted.containsKey == true)
        assertSame(dayOfMonth.getDurationField(), dayOfWeek.getDurationField());
        // และต้องเป็นตัวเดียวกับที่ chrono.days() คืนกลับมา (แปลงจากฟิลด์เดียวกัน)
        assertSame(chrono.days(), dayOfMonth.getDurationField());
    }

    @Test
    public void testAssemble_rangeAndLeapDurationFieldsNotNullForMonthOfYear() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        DateTimeField monthOfYear = chrono.monthOfYear();
        assertNotNull(monthOfYear.getDurationField());
        assertNotNull(monthOfYear.getRangeDurationField());
        // leapDurationField ของ monthOfYear ใน ISOChronology อาจเป็น null ได้ตามการ implement ของ base
        // จึงไม่ assert ค่าตายตัว เพียงตรวจว่าไม่ throw exception
        monthOfYear.getLeapDurationField();
    }

    // ---------------------------------------------------------------
    // ZonedDurationField : isPrecise()
    // ---------------------------------------------------------------

    @Test
    public void testDurationField_isPrecise_timeField_true() {
        // hours: unitMillis < 12h => iTimeField = true => isPrecise() = iField.isPrecise()
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        assertTrue(chrono.hours().isPrecise());
    }

    @Test
    public void testDurationField_isPrecise_dateField_fixedZone_true() {
        // days: unitMillis >= 12h => iTimeField=false => isPrecise() = iField.isPrecise() && zone.isFixed()
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertTrue(FIXED_ZONE.isFixed());
        assertTrue(chrono.days().isPrecise());
    }

    @Test
    public void testDurationField_isPrecise_dateField_nonFixedZone_false() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        assertFalse(DST_ZONE.isFixed());
        assertFalse(chrono.days().isPrecise());
    }

    @Test
    public void testDurationField_getUnitMillis_delegates() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertEquals(ISO_UTC.hours().getUnitMillis(), chrono.hours().getUnitMillis());
    }

    // ---------------------------------------------------------------
    // ZonedDurationField : add()/getDifference() (time-field offset-cancel property)
    // ---------------------------------------------------------------

    @Test
    public void testDurationField_add_int_timeField_exactMillisShift() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = chrono.hours().add(instant, 3);
        // iTimeField=true => offset ถูกบวกแล้วหักกลับ => เท่ากับ instant + 3*3600000 เสมอ
        assertEquals(instant + 3L * 3600000L, result);
    }

    @Test
    public void testDurationField_add_long_timeField_exactMillisShift() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = chrono.hours().add(instant, 3L);
        assertEquals(instant + 3L * 3600000L, result);
    }

    @Test
    public void testDurationField_add_dateField_advancesCalendarDay() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long result = chrono.days().add(instant, 1);
        assertEquals(16, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testDurationField_getDifference_timeField_exact() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long a = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long b = a - 5L * 3600000L;
        // offset cancel ที่ minuend/subtrahend เท่ากันเพราะ iTimeField=true => diff ตรง
        assertEquals(5, chrono.hours().getDifference(a, b));
    }

    @Test
    public void testDurationField_getDifferenceAsLong_timeField_exact() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long a = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long b = a - 5L * 3600000L;
        assertEquals(5L, chrono.hours().getDifferenceAsLong(a, b));
    }

    // Branch overflow (ArithmeticException ใน getOffsetToAdd/getOffsetFromLocalToSubtract)
    // ต้องใช้ instant ใกล้ Long.MAX_VALUE/MIN_VALUE ร่วมกับ offset พิเศษ ซึ่งยากต่อการยืนยัน
    // behavior ที่ถูกต้องโดยไม่เดา จึงไม่ได้เขียนเทสสำหรับ branch นี้

    // ---------------------------------------------------------------
    // ZonedDateTimeField : get()/getAsText()/getAsShortText()
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_get_fixedOffsetConversion() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE); // +5h
        long utcInstant = chrono.getBase().getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        assertEquals(15, chrono.hourOfDay().get(utcInstant)); // 10 + 5
    }

    @Test
    public void testDateTimeField_getAsText_and_getAsShortText() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        assertNotNull(chrono.monthOfYear().getAsText(instant, Locale.ENGLISH));
        assertNotNull(chrono.monthOfYear().getAsShortText(instant, Locale.ENGLISH));
        assertNotNull(chrono.monthOfYear().getAsText(6, Locale.ENGLISH));
        assertNotNull(chrono.monthOfYear().getAsShortText(6, Locale.ENGLISH));
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : add()/addWrapField() (time-field & date-field branches)
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_add_int_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = chrono.hourOfDay().add(instant, 3);
        assertEquals(instant + 3L * 3600000L, result);
    }

    @Test
    public void testDateTimeField_add_long_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = chrono.hourOfDay().add(instant, 3L);
        assertEquals(instant + 3L * 3600000L, result);
    }

    @Test
    public void testDateTimeField_add_dateField_advancesMonth() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long result = chrono.monthOfYear().add(instant, 1);
        assertEquals(7, chrono.monthOfYear().get(result));
    }

    @Test
    public void testDateTimeField_addWrapField_timeField_fullCycleInvariant() {
        // iTimeField=true: offset cancel => addWrapField(instant,24) บน hourOfDay ต้องวนกลับค่าเดิม
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = chrono.hourOfDay().addWrapField(instant, 24);
        assertEquals(instant, result);
    }

    @Test
    public void testDateTimeField_addWrapField_dateField_fullCycleInvariant() {
        // iTimeField=false: dayOfWeek วนรอบ 7 วัน (เลือกวันที่ไม่ชิดกับ DST transition)
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0); // ไม่ใกล้ DST transition
        long result = chrono.dayOfWeek().addWrapField(instant, 7);
        assertEquals(instant, result);
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : set() (normal + gap -> IllegalFieldValueException)
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_set_normal() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long result = chrono.monthOfYear().set(instant, 9);
        assertEquals(9, chrono.monthOfYear().get(result));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testDateTimeField_set_gapThrows() {
        // Europe/Paris 2013-03-31 ช่วง local 02:00-03:00 ไม่มีจริง
        // ตั้งค่า hourOfDay=2 ให้กับ instant ที่ local time อยู่ก่อนช่วง gap
        // -> set() แล้ว get(result) จะไม่เท่ากับ 2 เพราะตกใน gap => throw
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instantBeforeGap = chrono.getBase().getDateTimeMillis(2013, 3, 31, 0, 0, 0, 0); // local ~01:00 CET
        chrono.hourOfDay().set(instantBeforeGap, 2);
    }

    @Test
    public void testDateTimeField_set_withText() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long result = chrono.monthOfYear().set(instant, "December", Locale.ENGLISH);
        assertEquals(12, chrono.monthOfYear().get(result));
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : getDifference()/getDifferenceAsLong()
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_getDifference_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long a = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long b = a - 5L * 3600000L;
        assertEquals(5, chrono.hourOfDay().getDifference(a, b));
    }

    @Test
    public void testDateTimeField_getDifferenceAsLong_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long a = chrono.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long b = a - 5L * 3600000L;
        assertEquals(5L, chrono.hourOfDay().getDifferenceAsLong(a, b));
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : roundFloor()/roundCeiling()/remainder()
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_roundFloor_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long floored = chrono.hourOfDay().roundFloor(instant);
        assertEquals(0, chrono.minuteOfHour().get(floored));
        assertEquals(10, chrono.hourOfDay().get(floored));
    }

    @Test
    public void testDateTimeField_roundFloor_dateField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 12, 30, 0, 0);
        long floored = chrono.dayOfMonth().roundFloor(instant);
        assertEquals(0, chrono.hourOfDay().get(floored));
        assertEquals(15, chrono.dayOfMonth().get(floored));
    }

    @Test
    public void testDateTimeField_roundCeiling_timeField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, DST_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long ceil = chrono.hourOfDay().roundCeiling(instant);
        assertEquals(11, chrono.hourOfDay().get(ceil));
    }

    @Test
    public void testDateTimeField_roundCeiling_dateField() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 12, 30, 0, 0);
        long ceil = chrono.dayOfMonth().roundCeiling(instant);
        assertEquals(16, chrono.dayOfMonth().get(ceil));
    }

    @Test
    public void testDateTimeField_remainder() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long floored = chrono.hourOfDay().roundFloor(instant);
        long remainder = chrono.hourOfDay().remainder(instant);
        assertEquals(instant - floored, remainder);
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : min/max value delegation
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_getMinimumMaximumValue_static() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertEquals(1, chrono.monthOfYear().getMinimumValue());
        assertEquals(12, chrono.monthOfYear().getMaximumValue());
    }

    @Test
    public void testDateTimeField_getMinimumMaximumValue_instantBased() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 6, 15, 0);
        // dayOfMonth min/max ขึ้นกับเดือน (มิถุนายนมี 30 วัน)
        assertEquals(1, chrono.dayOfMonth().getMinimumValue(instant));
        assertEquals(30, chrono.dayOfMonth().getMaximumValue(instant));
    }

    // ---------------------------------------------------------------
    // ZonedDateTimeField : isLeap()/getLeapAmount() (sanity passthrough)
    // ---------------------------------------------------------------

    @Test
    public void testDateTimeField_isLeap_leapYear() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        long instant = chrono.getDateTimeMillis(2020, 2, 29, 0); // 2020 เป็นปีอธิกสุรทิน
        // ไม่ throw และคืนค่าได้โดยไม่ error
        chrono.monthOfYear().isLeap(instant);
        chrono.monthOfYear().getLeapAmount(instant);
    }

    @Test
    public void testDateTimeField_isLenient_delegates() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertEquals(ISO_UTC.monthOfYear().isLenient(), chrono.monthOfYear().isLenient());
    }

    @Test
    public void testDateTimeField_getMaximumTextLength_delegates() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISO_UTC, FIXED_ZONE);
        assertEquals(
            ISO_UTC.monthOfYear().getMaximumTextLength(Locale.ENGLISH),
            chrono.monthOfYear().getMaximumTextLength(Locale.ENGLISH));
        assertEquals(
            ISO_UTC.monthOfYear().getMaximumShortTextLength(Locale.ENGLISH),
            chrono.monthOfYear().getMaximumShortTextLength(Locale.ENGLISH));
    }
}
