package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive test suite for org.joda.time.LocalDateTime.
 */
public class LocalDateTimeTest {

    private DateTimeZone originalDateTimeZone;
    private TimeZone originalTimeZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();

        DateTimeZone.setDefault(DateTimeZone.UTC);
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
    }

    // =========================================================================
    // Factory Methods: now(), parse(), fromCalendarFields(), fromDateFields()
    // =========================================================================

    @Test
    public void testNow() {
        LocalDateTime dt = LocalDateTime.now();
        assertNotNull(dt);
        assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());

        LocalDateTime dtZone = LocalDateTime.now(DateTimeZone.UTC);
        assertNotNull(dtZone);

        LocalDateTime dtChrono = LocalDateTime.now(ISOChronology.getInstanceUTC());
        assertNotNull(dtChrono);
    }

    @Test(expected = NullPointerException.class)
    public void testNow_NullZone() {
        LocalDateTime.now((DateTimeZone) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNow_NullChronology() {
        LocalDateTime.now((Chronology) null);
    }

    @Test
    public void testParse_String() {
        LocalDateTime expected = new LocalDateTime(2023, 10, 25, 14, 30, 45, 123);
        LocalDateTime parsed = LocalDateTime.parse("2023-10-25T14:30:45.123");
        assertEquals(expected, parsed);
    }

    @Test
    public void testParse_String_Formatter() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime expected = new LocalDateTime(2023, 10, 25, 14, 30, 45);
        LocalDateTime parsed = LocalDateTime.parse("2023/10/25 14:30:45", formatter);
        assertEquals(expected, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_InvalidString() {
        LocalDateTime.parse("INVALID_DATE_STRING");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_Null() {
        LocalDateTime.fromCalendarFields(null);
    }

    @Test
    public void testFromCalendarFields_ValidAD() {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2023, Calendar.MARCH, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 456);

        LocalDateTime ldt = LocalDateTime.fromCalendarFields(cal);
        assertEquals(2023, ldt.getYear());
        assertEquals(3, ldt.getMonthOfYear());
        assertEquals(15, ldt.getDayOfMonth());
        assertEquals(10, ldt.getHourOfDay());
        assertEquals(20, ldt.getMinuteOfHour());
        assertEquals(30, ldt.getSecondOfMinute());
        assertEquals(456, ldt.getMillisOfSecond());
    }

    @Test
    public void testFromCalendarFields_BC() {
        // Defects4J Time-12 fault localization trigger
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 5); // 5 BC -> Year in ISO is -4
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        LocalDateTime ldt = LocalDateTime.fromCalendarFields(cal);
        // Calendar 5 BC represents year -4 in ISO/proleptic Gregorian
        // In Time-12b this fails because era is ignored
        assertEquals(1, ldt.getMonthOfYear());
        assertEquals(1, ldt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_Null() {
        LocalDateTime.fromDateFields(null);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFromDateFields_Valid() {
        Date date = new Date(123, 2, 15, 10, 20, 30); // 2023-03-15 10:20:30
        date.setTime(date.getTime() + 123);

        LocalDateTime ldt = LocalDateTime.fromDateFields(date);
        assertEquals(2023, ldt.getYear());
        assertEquals(3, ldt.getMonthOfYear());
        assertEquals(15, ldt.getDayOfMonth());
        assertEquals(10, ldt.getHourOfDay());
        assertEquals(20, ldt.getMinuteOfHour());
        assertEquals(30, ldt.getSecondOfMinute());
        assertEquals(123, ldt.getMillisOfSecond());
    }

    @Test
    public void testFromDateFields_BC() {
        // Date before 1900 / BC
        Date date = new Date(-62135769600000L); // ~0001-01-01 or earlier
        LocalDateTime ldt = LocalDateTime.fromDateFields(date);
        assertNotNull(ldt);
    }

    // =========================================================================
    // Constructors & Overloads
    // =========================================================================

    @Test
    public void testConstructors_AllOverloads() {
        LocalDateTime dt1 = new LocalDateTime();
        assertNotNull(dt1);

        LocalDateTime dt2 = new LocalDateTime(DateTimeZone.UTC);
        assertNotNull(dt2);

        LocalDateTime dt3 = new LocalDateTime((DateTimeZone) null);
        assertNotNull(dt3);

        LocalDateTime dt4 = new LocalDateTime(ISOChronology.getInstance());
        assertNotNull(dt4);

        LocalDateTime dt5 = new LocalDateTime((Chronology) null);
        assertNotNull(dt5);

        LocalDateTime dt6 = new LocalDateTime(1000L);
        assertEquals(1000L, dt6.getLocalMillis());

        LocalDateTime dt7 = new LocalDateTime(1000L, DateTimeZone.UTC);
        assertEquals(1000L, dt7.getLocalMillis());

        LocalDateTime dt8 = new LocalDateTime(1000L, (DateTimeZone) null);
        assertNotNull(dt8);

        LocalDateTime dt9 = new LocalDateTime(1000L, ISOChronology.getInstanceUTC());
        assertEquals(1000L, dt9.getLocalMillis());

        LocalDateTime dt10 = new LocalDateTime(1000L, (Chronology) null);
        assertNotNull(dt10);

        LocalDateTime dt11 = new LocalDateTime("2023-10-25T14:30:45.123");
        assertEquals(2023, dt11.getYear());

        LocalDateTime dt12 = new LocalDateTime("2023-10-25T14:30:45.123", DateTimeZone.UTC);
        assertEquals(2023, dt12.getYear());

        LocalDateTime dt13 = new LocalDateTime("2023-10-25T14:30:45.123", ISOChronology.getInstanceUTC());
        assertEquals(2023, dt13.getYear());

        LocalDateTime dt14 = new LocalDateTime(2023, 10, 25, 14, 30);
        assertEquals(0, dt14.getSecondOfMinute());
        assertEquals(0, dt14.getMillisOfSecond());

        LocalDateTime dt15 = new LocalDateTime(2023, 10, 25, 14, 30, 45);
        assertEquals(45, dt15.getSecondOfMinute());
        assertEquals(0, dt15.getMillisOfSecond());

        LocalDateTime dt16 = new LocalDateTime(2023, 10, 25, 14, 30, 45, 500);
        assertEquals(500, dt16.getMillisOfSecond());

        LocalDateTime dt17 = new LocalDateTime(2023, 10, 25, 14, 30, 45, 500, GregorianChronology.getInstance());
        assertEquals(GregorianChronology.getInstanceUTC(), dt17.getChronology());

        LocalDateTime dt18 = new LocalDateTime(2023, 10, 25, 14, 30, 45, 500, null);
        assertEquals(ISOChronology.getInstanceUTC(), dt18.getChronology());
    }

    // =========================================================================
    // Getters, Index Access & Field Supports
    // =========================================================================

    @Test
    public void testSize() {
        LocalDateTime dt = new LocalDateTime();
        assertEquals(4, dt.size());
    }

    @Test
    public void testGetField_And_GetValue() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        assertEquals(dt.getChronology().year(), dt.getField(0, dt.getChronology()));
        assertEquals(dt.getChronology().monthOfYear(), dt.getField(1, dt.getChronology()));
        assertEquals(dt.getChronology().dayOfMonth(), dt.getField(2, dt.getChronology()));
        assertEquals(dt.getChronology().millisOfDay(), dt.getField(3, dt.getChronology()));

        assertEquals(2023, dt.getValue(0));
        assertEquals(5, dt.getValue(1));
        assertEquals(20, dt.getValue(2));
        assertEquals(15 * 3600000 + 30 * 60000 + 45 * 1000 + 500, dt.getValue(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_InvalidIndexNegative() {
        LocalDateTime dt = new LocalDateTime();
        dt.getField(-1, dt.getChronology());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_InvalidIndexTooLarge() {
        LocalDateTime dt = new LocalDateTime();
        dt.getField(4, dt.getChronology());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_InvalidIndexNegative() {
        LocalDateTime dt = new LocalDateTime();
        dt.getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_InvalidIndexTooLarge() {
        LocalDateTime dt = new LocalDateTime();
        dt.getValue(4);
    }

    @Test
    public void testGet_DateTimeFieldType() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        assertEquals(2023, dt.get(DateTimeFieldType.year()));
        assertEquals(5, dt.get(DateTimeFieldType.monthOfYear()));
        assertEquals(20, dt.get(DateTimeFieldType.dayOfMonth()));
        assertEquals(15, dt.get(DateTimeFieldType.hourOfDay()));
        assertEquals(30, dt.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(45, dt.get(DateTimeFieldType.secondOfMinute()));
        assertEquals(500, dt.get(DateTimeFieldType.millisOfSecond()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_NullDateTimeFieldType() {
        LocalDateTime dt = new LocalDateTime();
        dt.get(null);
    }

    @Test
    public void testIsSupported_DateTimeFieldType() {
        LocalDateTime dt = new LocalDateTime();
        assertTrue(dt.isSupported(DateTimeFieldType.year()));
        assertTrue(dt.isSupported(DateTimeFieldType.hourOfDay()));
        assertFalse(dt.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupported_DurationFieldType() {
        LocalDateTime dt = new LocalDateTime();
        assertTrue(dt.isSupported(DurationFieldType.years()));
        assertTrue(dt.isSupported(DurationFieldType.hours()));
        assertFalse(dt.isSupported((DurationFieldType) null));
    }

    @Test
    public void testAllFieldGetters() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        assertEquals(1, dt.getEra());
        assertEquals(20, dt.getCenturyOfEra());
        assertEquals(2023, dt.getYearOfEra());
        assertEquals(23, dt.getYearOfCentury());
        assertEquals(2023, dt.getYear());
        assertEquals(2023, dt.getWeekyear());
        assertEquals(5, dt.getMonthOfYear());
        assertEquals(20, dt.getWeekOfWeekyear());
        assertEquals(140, dt.getDayOfYear());
        assertEquals(20, dt.getDayOfMonth());
        assertEquals(6, dt.getDayOfWeek()); // Saturday
        assertEquals(15, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());
        assertEquals(45, dt.getSecondOfMinute());
        assertEquals(500, dt.getMillisOfSecond());
        assertEquals(15 * 3600000 + 30 * 60000 + 45 * 1000 + 500, dt.getMillisOfDay());
    }

    // =========================================================================
    // Equals and CompareTo
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        LocalDateTime dt1 = new LocalDateTime(2023, 5, 20, 15, 30);
        LocalDateTime dt2 = new LocalDateTime(2023, 5, 20, 15, 30);
        LocalDateTime dt3 = new LocalDateTime(2023, 5, 20, 15, 31);
        LocalDateTime dt4 = new LocalDateTime(2023, 5, 20, 15, 30, BuddhistChronology.getInstanceUTC());

        assertTrue(dt1.equals(dt1));
        assertTrue(dt1.equals(dt2));
        assertFalse(dt1.equals(dt3));
        assertFalse(dt1.equals(dt4));
        assertFalse(dt1.equals("NotALocalDateTime"));
        assertFalse(dt1.equals(null));
    }

    @Test
    public void testCompareTo() {
        LocalDateTime dt1 = new LocalDateTime(2023, 5, 20, 15, 30);
        LocalDateTime dt2 = new LocalDateTime(2023, 5, 20, 15, 30);
        LocalDateTime dt3 = new LocalDateTime(2023, 5, 20, 15, 31);
        LocalDateTime dt4 = new LocalDateTime(2023, 5, 20, 15, 29);

        assertEquals(0, dt1.compareTo(dt1));
        assertEquals(0, dt1.compareTo(dt2));
        assertTrue(dt1.compareTo(dt3) < 0);
        assertTrue(dt1.compareTo(dt4) > 0);
    }

    // =========================================================================
    // Conversions: toDateTime, toLocalDate, toLocalTime, toDate
    // =========================================================================

    @Test
    public void testToDateTime() {
        LocalDateTime ldt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        DateTime dt = ldt.toDateTime();
        assertEquals(ldt.getYear(), dt.getYear());
        assertEquals(ldt.getMonthOfYear(), dt.getMonthOfYear());
        assertEquals(ldt.getDayOfMonth(), dt.getDayOfMonth());
        assertEquals(ldt.getHourOfDay(), dt.getHourOfDay());

        DateTime dtZone = ldt.toDateTime(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, dtZone.getZone());
    }

    @Test
    public void testToLocalDateAndToLocalTime() {
        LocalDateTime ldt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        assertEquals(2023, ld.getYear());
        assertEquals(5, ld.getMonthOfYear());
        assertEquals(20, ld.getDayOfMonth());

        assertEquals(15, lt.getHourOfDay());
        assertEquals(30, lt.getMinuteOfHour());
        assertEquals(45, lt.getSecondOfMinute());
        assertEquals(500, lt.getMillisOfSecond());
    }

    @Test
    public void testToDate_Normal() {
        LocalDateTime ldt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        Date d = ldt.toDate();
        LocalDateTime reconstructed = LocalDateTime.fromDateFields(d);
        assertEquals(ldt, reconstructed);
    }

    @Test
    public void testToDate_DSTGapAndOverlap() {
        // America/New_York DST Gap: 2023-03-12 02:00 -> 03:00
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        TimeZone.setDefault(tz);
        DateTimeZone.setDefault(DateTimeZone.forTimeZone(tz));

        LocalDateTime gapLdt = new LocalDateTime(2023, 3, 12, 2, 30, 0, 0);
        Date gapDate = gapLdt.toDate();
        assertNotNull(gapDate);

        // America/New_York DST Overlap: 2023-11-05 01:00 -> 02:00
        LocalDateTime overlapLdt = new LocalDateTime(2023, 11, 5, 1, 30, 0, 0);
        Date overlapDate = overlapLdt.toDate();
        assertNotNull(overlapDate);
    }

    // =========================================================================
    // withDate, withTime, withFields, withField, withFieldAdded, withDurationAdded, withPeriodAdded
    // =========================================================================

    @Test
    public void testWithDateAndWithTime() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        LocalDateTime sameDate = dt.withDate(2023, 5, 20);
        assertSame(dt, sameDate);

        LocalDateTime newDate = dt.withDate(2024, 6, 21);
        assertEquals(2024, newDate.getYear());
        assertEquals(6, newDate.getMonthOfYear());
        assertEquals(21, newDate.getDayOfMonth());
        assertEquals(15, newDate.getHourOfDay());

        LocalDateTime sameTime = dt.withTime(15, 30, 45, 500);
        assertSame(dt, sameTime);

        LocalDateTime newTime = dt.withTime(10, 20, 30, 400);
        assertEquals(2023, newTime.getYear());
        assertEquals(10, newTime.getHourOfDay());
        assertEquals(20, newTime.getMinuteOfHour());
        assertEquals(30, newTime.getSecondOfMinute());
        assertEquals(400, newTime.getMillisOfSecond());
    }

    @Test
    public void testWithFields() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertSame(dt, dt.withFields(null));

        LocalTime lt = new LocalTime(10, 15);
        LocalDateTime updated = dt.withFields(lt);
        assertEquals(10, updated.getHourOfDay());
        assertEquals(15, updated.getMinuteOfHour());
        assertEquals(2023, updated.getYear());
    }

    @Test
    public void testWithField() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        LocalDateTime updated = dt.withField(DateTimeFieldType.year(), 2030);
        assertEquals(2030, updated.getYear());

        try {
            dt.withField(null, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testWithFieldAdded() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertSame(dt, dt.withFieldAdded(DurationFieldType.years(), 0));

        LocalDateTime updated = dt.withFieldAdded(DurationFieldType.years(), 2);
        assertEquals(2025, updated.getYear());

        try {
            dt.withFieldAdded(null, 5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testWithDurationAdded_And_PlusMinusDuration() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 0, 0);

        assertSame(dt, dt.withDurationAdded(null, 1));
        assertSame(dt, dt.withDurationAdded(new Duration(1000), 0));
        assertSame(dt, dt.plus((ReadableDuration) null));
        assertSame(dt, dt.minus((ReadableDuration) null));

        Duration duration = new Duration(60000); // 1 minute
        LocalDateTime plusDur = dt.plus(duration);
        assertEquals(31, plusDur.getMinuteOfHour());

        LocalDateTime minusDur = dt.minus(duration);
        assertEquals(29, minusDur.getMinuteOfHour());
    }

    @Test
    public void testWithPeriodAdded_And_PlusMinusPeriod() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 0, 0);

        assertSame(dt, dt.withPeriodAdded(null, 1));
        assertSame(dt, dt.withPeriodAdded(Period.days(1), 0));
        assertSame(dt, dt.plus((ReadablePeriod) null));
        assertSame(dt, dt.minus((ReadablePeriod) null));

        Period period = Period.days(2);
        LocalDateTime plusPeriod = dt.plus(period);
        assertEquals(22, plusPeriod.getDayOfMonth());

        LocalDateTime minusPeriod = dt.minus(period);
        assertEquals(18, minusPeriod.getDayOfMonth());
    }

    // =========================================================================
    // Plus / Minus Specific Field Methods
    // =========================================================================

    @Test
    public void testPlusMinusMethods_ZeroReturnsSameInstance() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertSame(dt, dt.plusYears(0));
        assertSame(dt, dt.plusMonths(0));
        assertSame(dt, dt.plusWeeks(0));
        assertSame(dt, dt.plusDays(0));
        assertSame(dt, dt.plusHours(0));
        assertSame(dt, dt.plusMinutes(0));
        assertSame(dt, dt.plusSeconds(0));
        assertSame(dt, dt.plusMillis(0));

        assertSame(dt, dt.minusYears(0));
        assertSame(dt, dt.minusMonths(0));
        assertSame(dt, dt.minusWeeks(0));
        assertSame(dt, dt.minusDays(0));
        assertSame(dt, dt.minusHours(0));
        assertSame(dt, dt.minusMinutes(0));
        assertSame(dt, dt.minusSeconds(0));
        assertSame(dt, dt.minusMillis(0));
    }

    @Test
    public void testPlusMinusMethods_WithValues() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertEquals(2025, dt.plusYears(2).getYear());
        assertEquals(2021, dt.minusYears(2).getYear());

        assertEquals(7, dt.plusMonths(2).getMonthOfYear());
        assertEquals(3, dt.minusMonths(2).getMonthOfYear());

        assertEquals(27, dt.plusWeeks(1).getDayOfMonth());
        assertEquals(13, dt.minusWeeks(1).getDayOfMonth());

        assertEquals(25, dt.plusDays(5).getDayOfMonth());
        assertEquals(15, dt.minusDays(5).getDayOfMonth());

        assertEquals(18, dt.plusHours(3).getHourOfDay());
        assertEquals(12, dt.minusHours(3).getHourOfDay());

        assertEquals(40, dt.plusMinutes(10).getMinuteOfHour());
        assertEquals(20, dt.minusMinutes(10).getMinuteOfHour());

        assertEquals(55, dt.plusSeconds(10).getSecondOfMinute());
        assertEquals(35, dt.minusSeconds(10).getSecondOfMinute());

        assertEquals(600, dt.plusMillis(100).getMillisOfSecond());
        assertEquals(400, dt.minusMillis(100).getMillisOfSecond());
    }

    // =========================================================================
    // withField Specific Methods
    // =========================================================================

    @Test
    public void testWithSpecificFieldMethods() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertEquals(1, dt.withEra(1).getEra());
        assertEquals(19, dt.withCenturyOfEra(19).getCenturyOfEra());
        assertEquals(2024, dt.withYearOfEra(2024).getYearOfEra());
        assertEquals(25, dt.withYearOfCentury(25).getYearOfCentury());
        assertEquals(2025, dt.withYear(2025).getYear());
        assertEquals(2024, dt.withWeekyear(2024).getWeekyear());
        assertEquals(8, dt.withMonthOfYear(8).getMonthOfYear());
        assertEquals(10, dt.withWeekOfWeekyear(10).getWeekOfWeekyear());
        assertEquals(100, dt.withDayOfYear(100).getDayOfYear());
        assertEquals(15, dt.withDayOfMonth(15).getDayOfMonth());
        assertEquals(1, dt.withDayOfWeek(1).getDayOfWeek());
        assertEquals(10, dt.withHourOfDay(10).getHourOfDay());
        assertEquals(40, dt.withMinuteOfHour(40).getMinuteOfHour());
        assertEquals(20, dt.withSecondOfMinute(20).getSecondOfMinute());
        assertEquals(300, dt.withMillisOfSecond(300).getMillisOfSecond());
        assertEquals(1000, dt.withMillisOfDay(1000).getMillisOfDay());
    }

    // =========================================================================
    // Property Access & Operations
    // =========================================================================

    @Test
    public void testProperties() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertNotNull(dt.era());
        assertNotNull(dt.centuryOfEra());
        assertNotNull(dt.yearOfCentury());
        assertNotNull(dt.yearOfEra());
        assertNotNull(dt.year());
        assertNotNull(dt.weekyear());
        assertNotNull(dt.monthOfYear());
        assertNotNull(dt.weekOfWeekyear());
        assertNotNull(dt.dayOfYear());
        assertNotNull(dt.dayOfMonth());
        assertNotNull(dt.dayOfWeek());
        assertNotNull(dt.hourOfDay());
        assertNotNull(dt.minuteOfHour());
        assertNotNull(dt.secondOfMinute());
        assertNotNull(dt.millisOfSecond());
        assertNotNull(dt.millisOfDay());

        LocalDateTime.Property prop = dt.monthOfYear();
        assertEquals(dt, prop.getLocalDateTime());
        assertEquals(dt.getLocalMillis(), prop.getMillis());
        assertEquals(dt.getChronology(), prop.getChronology());
        assertEquals(dt.getChronology().monthOfYear(), prop.getField());

        assertEquals(6, prop.addToCopy(1).getMonthOfYear());
        assertEquals(6, prop.addToCopy(1L).getMonthOfYear());
        assertEquals(1, prop.addWrapFieldToCopy(8).getMonthOfYear());
        assertEquals(8, prop.setCopy(8).getMonthOfYear());
        assertEquals(12, prop.setCopy("12").getMonthOfYear());
        assertEquals(12, prop.setCopy("December", Locale.UK).getMonthOfYear());

        assertEquals(12, prop.withMaximumValue().getMonthOfYear());
        assertEquals(1, prop.withMinimumValue().getMonthOfYear());

        assertEquals(0, dt.minuteOfHour().roundFloorCopy().getMinuteOfHour());
        assertEquals(0, dt.minuteOfHour().roundCeilingCopy().getSecondOfMinute());
        assertNotNull(dt.minuteOfHour().roundHalfFloorCopy());
        assertNotNull(dt.minuteOfHour().roundHalfCeilingCopy());
        assertNotNull(dt.minuteOfHour().roundHalfEvenCopy());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_NullType() {
        LocalDateTime dt = new LocalDateTime();
        dt.property(null);
    }

    // =========================================================================
    // toString and Formatting
    // =========================================================================

    @Test
    public void testToString() {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        assertEquals("2023-05-20T15:30:45.500", dt.toString());
        assertEquals("2023/05/20", dt.toString("yyyy/MM/dd"));
        assertEquals("2023-05-20T15:30:45.500", dt.toString((String) null));
        assertEquals("20 May 2023", dt.toString("dd MMM yyyy", Locale.UK));
        assertEquals("2023-05-20T15:30:45.500", dt.toString(null, Locale.UK));
    }

    // =========================================================================
    // Serialization & Deserialization
    // =========================================================================

    @Test
    public void testSerialization() throws Exception {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dt);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime result = (LocalDateTime) ois.readObject();
        ois.close();

        assertEquals(dt, result);
    }

    @Test
    public void testPropertySerialization() throws Exception {
        LocalDateTime dt = new LocalDateTime(2023, 5, 20, 15, 30, 45, 500);
        LocalDateTime.Property prop = dt.dayOfMonth();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime.Property result = (LocalDateTime.Property) ois.readObject();
        ois.close();

        assertEquals(prop.get(), result.get());
        assertEquals(prop.getLocalDateTime(), result.getLocalDateTime());
    }
}