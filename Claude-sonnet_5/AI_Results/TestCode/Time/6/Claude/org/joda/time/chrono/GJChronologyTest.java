package org.joda.time.chrono;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;

/**
 * JUnit 4 test suite for {@link GJChronology}.
 * Target: Defects4J Time-6b.
 *
 * หมายเหตุ: ทดสอบโดยอ้างอิงจาก behavior ที่ปรากฏในซอร์สโค้ดที่ให้มาเท่านั้น
 * ไม่ได้เดา behavior เพิ่มเติมนอกเหนือจากที่วิเคราะห์ได้จาก logic ของเมธอด
 */
public class GJChronologyTest {

    // ---------------------------------------------------------------
    // getInstanceUTC()
    // ---------------------------------------------------------------

    @Test
    public void testGetInstanceUTC_zoneIsUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(DateTimeZone.UTC, chrono.getZone());
    }

    @Test
    public void testGetInstanceUTC_cutoverIsDefault() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceUTC_minDaysInFirstWeekIs4() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    // ---------------------------------------------------------------
    // getInstance() (no-arg, default zone)
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_defaultZone() {
        GJChronology chrono = GJChronology.getInstance();
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    // ---------------------------------------------------------------
    // getInstance(DateTimeZone)
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_withZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetInstance_withNullZoneUsesDefault() {
        GJChronology chrono = GJChronology.getInstance((DateTimeZone) null);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    // ---------------------------------------------------------------
    // getInstance(DateTimeZone, ReadableInstant)
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_zoneAndCutover() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertEquals(cutover, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_zoneAndNullCutoverUsesDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (Instant) null);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    // ---------------------------------------------------------------
    // getInstance(DateTimeZone, ReadableInstant, int) - caching behaviour
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_cachedSameInstanceReturned() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        // Branch: cache loop finds matching minDays + cutover -> returns same object
        assertSame(c1, c2);
    }

    @Test
    public void testGetInstance_differentMinDaysNotCachedButNewInstanceCorrect() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 2);
        // Branch: loop does not match (different minDaysInFirstWeek) -> new instance created
        assertNotSame(c1, c2);
        assertEquals(2, c2.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_UTCZoneDirectCreation() {
        // Branch: zone == DateTimeZone.UTC -> direct construction (no base chronology)
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertNull(chrono.getBase());
    }

    @Test
    public void testGetInstance_nonUTCZoneUsesZonedChronology() {
        // Branch: zone != UTC -> wraps ZonedChronology as base
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        GJChronology chrono = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        assertNotNull(chrono.getBase());
        assertEquals(zone, chrono.getZone());
    }

    // ---------------------------------------------------------------
    // getInstance(DateTimeZone, long, int)
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_longCutoverEqualsDefault() {
        // Branch: gregorianCutover == DEFAULT_CUTOVER.getMillis() -> cutoverInstant = null -> default used
        GJChronology chrono = GJChronology.getInstance(
                DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER.getMillis(), 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_longCutoverDifferentFromDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        assertEquals(new Instant(0L), chrono.getGregorianCutover());
    }

    // ---------------------------------------------------------------
    // withUTC() / withZone()
    // ---------------------------------------------------------------

    @Test
    public void testWithUTC_returnsUTCZoneChronology() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("America/New_York"));
        Chronology utcChrono = chrono.withUTC();
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithZone_nullUsesDefault() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology result = chrono.withZone(null);
        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    public void testWithZone_sameZoneReturnsThis() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology result = chrono.withZone(DateTimeZone.UTC);
        assertSame(chrono, result);
    }

    @Test
    public void testWithZone_differentZoneReturnsNewChronology() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeZone newZone = DateTimeZone.forID("Asia/Tokyo");
        Chronology result = chrono.withZone(newZone);
        assertEquals(newZone, result.getZone());
    }

    // ---------------------------------------------------------------
    // getDateTimeMillis(year, month, day, millisOfDay) - 4 arg
    // ---------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis4Arg_afterCutoverGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long result = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long expected = GregorianChronology.getInstanceUTC().getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(expected, result);
    }

    @Test
    public void testGetDateTimeMillis4Arg_beforeCutoverJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long result = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long expected = JulianChronology.getInstanceUTC().getDateTimeMillis(1500, 1, 1, 0);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis4Arg_inGapThrows() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // October 5-14, 1582 (Gregorian) do not exist - cutover gap
        chrono.getDateTimeMillis(1582, 10, 10, 0);
    }

    @Test
    public void testGetDateTimeMillis4Arg_withBaseDelegatesToBase() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        GJChronology chrono = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        long result = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long expectedUtc = GJChronology.getInstanceUTC().getDateTimeMillis(1999, 12, 31, 22, 0, 0, 0);
        assertEquals(expectedUtc, result);
    }

    // ---------------------------------------------------------------
    // getDateTimeMillis(year, month, day, hour, min, sec, millis) - 7 arg
    // ---------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis7Arg_afterCutoverGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long result = chrono.getDateTimeMillis(2000, 1, 1, 10, 30, 15, 500);
        long expected = GregorianChronology.getInstanceUTC()
                .getDateTimeMillis(2000, 1, 1, 10, 30, 15, 500);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis7Arg_feb29NonLeapGregorianYearThrows() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // 1900 is not a leap year in Gregorian, and day-28 fallback is still after cutover -> rethrow
        chrono.getDateTimeMillis(1900, 2, 29, 0, 0, 0, 0);
    }

    @Test
    public void testGetDateTimeMillis7Arg_feb29LeapJulianYearBeforeCutoverSucceeds() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // 1500 is a leap year under the Julian calendar (divisible by 4), before cutover
        long result = chrono.getDateTimeMillis(1500, 2, 29, 0, 0, 0, 0);
        long expected = JulianChronology.getInstanceUTC().getDateTimeMillis(1500, 2, 29, 0, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis7Arg_invalidMonthRethrowsImmediately() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // monthOfYear != 2 (invalid month 13) -> ex rethrown directly (branch: monthOfYear!=2 || dayOfMonth!=29)
        chrono.getDateTimeMillis(2000, 13, 1, 0, 0, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis7Arg_inGapThrows() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 10, 0, 0, 0, 0);
    }

    @Test
    public void testGetDateTimeMillis7Arg_withBaseDelegatesToBase() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        GJChronology chrono = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        long result = chrono.getDateTimeMillis(2000, 1, 1, 10, 0, 0, 0);
        long expectedUtc = GJChronology.getInstanceUTC().getDateTimeMillis(2000, 1, 1, 8, 0, 0, 0);
        assertEquals(expectedUtc, result);
    }

    // ---------------------------------------------------------------
    // getGregorianCutover() / getMinimumDaysInFirstWeek()
    // ---------------------------------------------------------------

    @Test
    public void testGetGregorianCutover_returnsConfiguredValue() {
        Instant cutover = new Instant(12345L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover, 4);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek_returnsConfiguredValue() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 6);
        assertEquals(6, chrono.getMinimumDaysInFirstWeek());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstanceTrue() {
        GJChronology c1 = GJChronology.getInstanceUTC();
        assertTrue(c1.equals(c1));
    }

    @Test
    public void testEquals_differentTypeFalse() {
        GJChronology c1 = GJChronology.getInstanceUTC();
        assertFalse(c1.equals("not a chronology"));
    }

    @Test
    public void testEquals_equalValuesTrue() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_differentZoneFalse() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(
                DateTimeZone.forID("America/New_York"), GJChronology.DEFAULT_CUTOVER, 4);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_differentMinDaysFalse() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 2);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_differentCutoverFalse() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        assertFalse(c1.equals(c2));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_consistentForEqualObjects() {
        GJChronology c1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology c2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_defaultCutoverAndMdfw() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals("GJChronology[UTC]", chrono.toString());
    }

    @Test
    public void testToString_customMdfwOnly() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 2);
        assertEquals("GJChronology[UTC,mdfw=2]", chrono.toString());
    }

    @Test
    public void testToString_customCutoverAtMidnightUsesDateFormat() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        // Branch: time-of-day remainder == 0 -> ISODateTimeFormat.date()
        assertEquals("GJChronology[UTC,cutover=1970-01-01]", chrono.toString());
    }

    @Test
    public void testToString_customCutoverNonMidnightUsesDateTimeFormat() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(3600000L), 4);
        // Branch: time-of-day remainder != 0 -> ISODateTimeFormat.dateTime()
        String str = chrono.toString();
        assertTrue(str.startsWith("GJChronology[UTC,cutover=1970-01-01T"));
        assertTrue(str.endsWith("]"));
    }

    // ---------------------------------------------------------------
    // CutoverField / ImpreciseCutoverField branch coverage via field access
    // ---------------------------------------------------------------

    @Test
    public void testYearField_beforeCutoverUsesJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = JulianChronology.getInstanceUTC().getDateTimeMillis(1500, 6, 1, 0);
        assertEquals(1500, chrono.year().get(millis));
    }

    @Test
    public void testYearField_afterCutoverUsesGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = GregorianChronology.getInstanceUTC().getDateTimeMillis(2000, 6, 1, 0);
        assertEquals(2000, chrono.year().get(millis));
    }

    @Test
    public void testEraField_aroundCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long before = JulianChronology.getInstanceUTC().getDateTimeMillis(100, 1, 1, 0);
        long after = GregorianChronology.getInstanceUTC().getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(1, chrono.era().get(before)); // CE
        assertEquals(1, chrono.era().get(after));  // CE
    }

    /**
     * ทดสอบตรงจุดที่เกี่ยวข้องกับ defect Time-6b: ใน assemble() ลำดับการ assign
     * fields.weekyears ทำหลังจากที่นำไปใช้สร้าง fields.weekyearOfCentury แล้ว
     * ทำให้ weekyearOfCentury field ผูกกับ DurationField ที่ไม่ถูกต้อง (ของ Gregorian ตรงๆ
     * ไม่ใช่ linked duration field ที่คำนึงถึง cutover) ถ้าบั๊กยังอยู่ assertSame นี้จะ fail
     */
    @Test
    public void testWeekyearOfCenturyDurationFieldShouldMatchWeekyearsDurationField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField weekyearOfCentury = chrono.weekyearOfCentury();
        DurationField weekyearOfCenturyDuration = weekyearOfCentury.getDurationField();
        DurationField weekyearsDuration = chrono.weekyears();
        assertSame(weekyearsDuration, weekyearOfCenturyDuration);
    }

    @Test
    public void testMonthOfYearAdd_crossingCutoverJulianToGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // start just before cutover (Julian side), add months to cross into Gregorian
        long start = JulianChronology.getInstanceUTC().getDateTimeMillis(1582, 1, 1, 0);
        long result = chrono.monthOfYear().add(start, 12); // add a year's worth of months
        // just assert no exception and result moved forward in time
        assertTrue(result > start);
    }

    @Test
    public void testDayOfMonthField_getReflectsCorrectSide() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long beforeCutover = JulianChronology.getInstanceUTC().getDateTimeMillis(1582, 10, 4, 0);
        long afterCutover = GregorianChronology.getInstanceUTC().getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(4, chrono.dayOfMonth().get(beforeCutover));
        assertEquals(15, chrono.dayOfMonth().get(afterCutover));
    }
}
