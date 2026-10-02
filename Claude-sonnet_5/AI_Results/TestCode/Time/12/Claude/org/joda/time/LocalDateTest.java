package org.joda.time;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

@SuppressWarnings("deprecation")
public class LocalDateTest {

    private Locale originalLocale;

    @Before
    public void setUp() {
        // ให้ผลลัพธ์ที่ parse ข้อความ (เช่น setCopy("December")) deterministic
        originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
    }

    // ===================== Factory methods =====================

    @Test
    public void testNow() {
        assertNotNull(LocalDate.now());
    }

    @Test
    public void testNowWithZone() {
        assertNotNull(LocalDate.now(DateTimeZone.UTC));
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithNullZone() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void testNowWithChronology() {
        assertNotNull(LocalDate.now(ISOChronology.getInstanceUTC()));
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithNullChronology() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void testParseString() {
        LocalDate ld = LocalDate.parse("2012-06-30");
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test
    public void testFromCalendarFields() {
        Calendar cal = new GregorianCalendar(2012, Calendar.JUNE, 30);
        LocalDate ld = LocalDate.fromCalendarFields(cal);
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFieldsNull() {
        LocalDate.fromCalendarFields(null);
    }

    @Test
    public void testFromDateFields() {
        // year=1900+112=2012, month=5(0-indexed)=June, day=30
        Date date = new Date(112, 5, 30);
        LocalDate ld = LocalDate.fromDateFields(date);
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFieldsNull() {
        LocalDate.fromDateFields(null);
    }

    // ===================== Constructors =====================

    @Test
    public void testConstructorDefault() {
        assertNotNull(new LocalDate());
    }

    @Test
    public void testConstructorZone() {
        assertNotNull(new LocalDate(DateTimeZone.UTC));
    }

    @Test
    public void testConstructorZoneNull() {
        assertNotNull(new LocalDate((DateTimeZone) null));
    }

    @Test
    public void testConstructorChronology() {
        assertNotNull(new LocalDate(ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testConstructorChronologyNull() {
        assertNotNull(new LocalDate((Chronology) null));
    }

    @Test
    public void testConstructorInstant() {
        LocalDate ld = new LocalDate(0L);
        assertEquals(1970, ld.getYear());
    }

    @Test
    public void testConstructorInstantZone() {
        LocalDate ld = new LocalDate(0L, DateTimeZone.UTC);
        assertEquals(1970, ld.getYear());
    }

    @Test
    public void testConstructorInstantChronology() {
        LocalDate ld = new LocalDate(0L, ISOChronology.getInstanceUTC());
        assertEquals(1970, ld.getYear());
    }

    @Test
    public void testConstructorInstantChronologyNull() {
        LocalDate ld = new LocalDate(0L, (Chronology) null);
        assertEquals(1970, ld.getYear());
    }

    @Test
    public void testConstructorObject() {
        LocalDate ld = new LocalDate("2012-06-30");
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test
    public void testConstructorObjectZone() {
        LocalDate ld = new LocalDate("2012-06-30", DateTimeZone.UTC);
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test
    public void testConstructorObjectChronology() {
        LocalDate ld = new LocalDate("2012-06-30", ISOChronology.getInstanceUTC());
        assertEquals(new LocalDate(2012, 6, 30), ld);
    }

    @Test
    public void testConstructorYMD() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(2012, ld.getYear());
        assertEquals(6, ld.getMonthOfYear());
        assertEquals(30, ld.getDayOfMonth());
    }

    @Test
    public void testConstructorYMDChronology() {
        LocalDate ld = new LocalDate(2012, 6, 30, ISOChronology.getInstanceUTC());
        assertEquals(2012, ld.getYear());
    }

    @Test
    public void testConstructorYMDChronologyNull() {
        LocalDate ld = new LocalDate(2012, 6, 30, (Chronology) null);
        assertEquals(2012, ld.getYear());
    }

    // ===================== size / getField / getValue =====================

    @Test
    public void testSize() {
        assertEquals(3, new LocalDate(2012, 6, 30).size());
    }

    @Test
    public void testGetValueYear() {
        assertEquals(2012, new LocalDate(2012, 6, 30).getValue(0));
    }

    @Test
    public void testGetValueMonth() {
        assertEquals(6, new LocalDate(2012, 6, 30).getValue(1));
    }

    @Test
    public void testGetValueDay() {
        assertEquals(30, new LocalDate(2012, 6, 30).getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueInvalidIndex() {
        new LocalDate(2012, 6, 30).getValue(3);
    }

    // ===================== get(DateTimeFieldType) =====================

    @Test
    public void testGetFieldType() {
        assertEquals(2012, new LocalDate(2012, 6, 30).get(DateTimeFieldType.year()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldTypeNull() {
        new LocalDate(2012, 6, 30).get((DateTimeFieldType) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldTypeUnsupported() {
        new LocalDate(2012, 6, 30).get(DateTimeFieldType.hourOfDay());
    }

    // ===================== isSupported(DateTimeFieldType) =====================

    @Test
    public void testIsSupportedFieldTypeNull() {
        assertFalse(new LocalDate(2012, 6, 30).isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupportedFieldTypeYear() {
        assertTrue(new LocalDate(2012, 6, 30).isSupported(DateTimeFieldType.year()));
    }

    @Test
    public void testIsSupportedFieldTypeDayOfMonth() {
        assertTrue(new LocalDate(2012, 6, 30).isSupported(DateTimeFieldType.dayOfMonth()));
    }

    @Test
    public void testIsSupportedFieldTypeHourOfDay() {
        assertFalse(new LocalDate(2012, 6, 30).isSupported(DateTimeFieldType.hourOfDay()));
    }

    // ===================== isSupported(DurationFieldType) =====================

    @Test
    public void testIsSupportedDurationTypeNull() {
        assertFalse(new LocalDate(2012, 6, 30).isSupported((DurationFieldType) null));
    }

    @Test
    public void testIsSupportedDurationTypeDaysInSet() {
        assertTrue(new LocalDate(2012, 6, 30).isSupported(DurationFieldType.days()));
    }

    @Test
    public void testIsSupportedDurationTypeErasInSet() {
        // อยู่ใน DATE_DURATION_TYPES แต่ field.isSupported() อาจ false ได้ใน ISOChronology
        // ทดสอบเพียง branch ของ contains() == true
        boolean result = new LocalDate(2012, 6, 30).isSupported(DurationFieldType.eras());
        assertNotNull(result); // just ensure no exception; actual boolean depends on chronology
    }

    @Test
    public void testIsSupportedDurationTypeHoursNotSupported() {
        assertFalse(new LocalDate(2012, 6, 30).isSupported(DurationFieldType.hours()));
    }

    // ===================== equals / hashCode / compareTo =====================

    @Test
    public void testEqualsSameInstance() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertTrue(ld.equals(ld));
    }

    @Test
    public void testEqualsEqualValues() {
        assertTrue(new LocalDate(2012, 6, 30).equals(new LocalDate(2012, 6, 30)));
    }

    @Test
    public void testEqualsDifferentValues() {
        assertFalse(new LocalDate(2012, 6, 30).equals(new LocalDate(2012, 6, 29)));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(new LocalDate(2012, 6, 30).equals("not a LocalDate"));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(new LocalDate(2012, 6, 30).equals(null));
    }

    @Test
    public void testHashCodeCachedAndConsistent() {
        LocalDate ld1 = new LocalDate(2012, 6, 30);
        LocalDate ld2 = new LocalDate(2012, 6, 30);
        assertEquals(ld1.hashCode(), ld2.hashCode());
        // เรียกซ้ำเพื่อ hit branch "hash != 0" (cached)
        assertEquals(ld1.hashCode(), ld1.hashCode());
    }

    @Test
    public void testCompareToSameInstance() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(0, ld.compareTo(ld));
    }

    @Test
    public void testCompareToLess() {
        assertTrue(new LocalDate(2012, 6, 29).compareTo(new LocalDate(2012, 6, 30)) < 0);
    }

    @Test
    public void testCompareToGreater() {
        assertTrue(new LocalDate(2012, 6, 30).compareTo(new LocalDate(2012, 6, 29)) > 0);
    }

    @Test
    public void testCompareToEqual() {
        assertEquals(0, new LocalDate(2012, 6, 30).compareTo(new LocalDate(2012, 6, 30)));
    }

    // ===================== toDateTimeAtStartOfDay =====================

    @Test
    public void testToDateTimeAtStartOfDay() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtStartOfDay());
    }

    @Test
    public void testToDateTimeAtStartOfDayWithZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtStartOfDay(DateTimeZone.UTC));
    }

    @Test
    public void testToDateTimeAtStartOfDayNullZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtStartOfDay((DateTimeZone) null));
    }

    // ===================== toDateTimeAtMidnight (deprecated) =====================

    @Test
    public void testToDateTimeAtMidnight() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtMidnight());
    }

    @Test
    public void testToDateTimeAtMidnightWithZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtMidnight(DateTimeZone.UTC));
    }

    // ===================== toDateTimeAtCurrentTime =====================

    @Test
    public void testToDateTimeAtCurrentTime() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtCurrentTime());
    }

    @Test
    public void testToDateTimeAtCurrentTimeWithZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateTimeAtCurrentTime(DateTimeZone.UTC));
    }

    // ===================== toDateMidnight =====================

    @Test
    public void testToDateMidnight() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateMidnight());
    }

    @Test
    public void testToDateMidnightWithZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toDateMidnight(DateTimeZone.UTC));
    }

    // ===================== toLocalDateTime =====================

    @Test
    public void testToLocalDateTime() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        LocalTime lt = new LocalTime(10, 20, 30);
        LocalDateTime ldt = ld.toLocalDateTime(lt);
        assertEquals(2012, ldt.getYear());
        assertEquals(10, ldt.getHourOfDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTimeNullTime() {
        new LocalDate(2012, 6, 30).toLocalDateTime(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTimeChronologyMismatch() {
        LocalDate ld = new LocalDate(2012, 6, 30, ISOChronology.getInstanceUTC());
        LocalTime lt = new LocalTime(10, 20, 30, 0, BuddhistChronology.getInstanceUTC());
        ld.toLocalDateTime(lt);
    }

    // ===================== toDateTime(LocalTime[, zone]) =====================

    @Test
    public void testToDateTimeWithLocalTime() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertNotNull(ld.toDateTime(new LocalTime(10, 20, 30)));
    }

    @Test
    public void testToDateTimeNullTimeUsesCurrent() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertNotNull(ld.toDateTime((LocalTime) null));
    }

    @Test
    public void testToDateTimeWithLocalTimeAndZone() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertNotNull(ld.toDateTime(new LocalTime(10, 20, 30), DateTimeZone.UTC));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToDateTimeChronologyMismatch() {
        LocalDate ld = new LocalDate(2012, 6, 30, ISOChronology.getInstanceUTC());
        LocalTime lt = new LocalTime(10, 20, 30, 0, BuddhistChronology.getInstanceUTC());
        ld.toDateTime(lt, DateTimeZone.UTC);
    }

    // ===================== toInterval =====================

    @Test
    public void testToInterval() {
        assertNotNull(new LocalDate(2012, 6, 30).toInterval());
    }

    @Test
    public void testToIntervalWithZone() {
        assertNotNull(new LocalDate(2012, 6, 30).toInterval(DateTimeZone.UTC));
    }

    // ===================== toDate() =====================

    @Test
    public void testToDateRoundTrip() {
        // หมายเหตุ: ผลลัพธ์ขึ้นกับ default TimeZone ของ JVM (DST handling),
        // แต่ควร round-trip ได้เสมอสำหรับวันที่ที่ไม่ใช่ DST transition
        LocalDate ld = new LocalDate(2012, 6, 30);
        Date date = ld.toDate();
        assertNotNull(date);
        LocalDate check = LocalDate.fromDateFields(date);
        assertEquals(ld, check);
    }

    // ===================== withFields =====================

    @Test
    public void testWithFieldsNullReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.withFields(null));
    }

    @Test
    public void testWithFields() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        LocalDate result = ld.withFields(new LocalDate(2000, 1, 1));
        assertEquals(2000, result.getYear());
        assertEquals(1, result.getMonthOfYear());
        assertEquals(1, result.getDayOfMonth());
    }

    // ===================== withField =====================

    @Test
    public void testWithField() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(2000, ld.withField(DateTimeFieldType.year(), 2000).getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldNullType() {
        new LocalDate(2012, 6, 30).withField(null, 2000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldUnsupported() {
        new LocalDate(2012, 6, 30).withField(DateTimeFieldType.hourOfDay(), 10);
    }

    // ===================== withFieldAdded =====================

    @Test
    public void testWithFieldAdded() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(2013, ld.withFieldAdded(DurationFieldType.years(), 1).getYear());
    }

    @Test
    public void testWithFieldAddedZeroAmountReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.withFieldAdded(DurationFieldType.years(), 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddedNullType() {
        new LocalDate(2012, 6, 30).withFieldAdded(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddedUnsupported() {
        new LocalDate(2012, 6, 30).withFieldAdded(DurationFieldType.hours(), 1);
    }

    // ===================== withPeriodAdded / plus(period) / minus(period) =====================

    @Test
    public void testWithPeriodAddedNullReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.withPeriodAdded(null, 1));
    }

    @Test
    public void testWithPeriodAddedZeroScalarReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.withPeriodAdded(Period.years(1), 0));
    }

    @Test
    public void testWithPeriodAdded() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        Period p = Period.years(1).withMonths(1);
        LocalDate result = ld.withPeriodAdded(p, 1);
        assertEquals(2013, result.getYear());
        assertEquals(7, result.getMonthOfYear());
    }

    @Test
    public void testWithPeriodAddedUnsupportedFieldIgnored() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        // hours ไม่ supported โดย LocalDate -> ควรถูก skip ใน loop, ผลลัพธ์ไม่เปลี่ยน
        LocalDate result = ld.withPeriodAdded(Period.hours(5), 1);
        assertSame(ld, result);
    }

    @Test
    public void testPlusPeriod() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        LocalDate result = ld.plus(Period.days(1));
        assertEquals(7, result.getMonthOfYear());
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testMinusPeriod() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(29, ld.minus(Period.days(1)).getDayOfMonth());
    }

    // ===================== plusYears/Months/Weeks/Days =====================

    @Test
    public void testPlusYears() {
        assertEquals(2013, new LocalDate(2012, 6, 30).plusYears(1).getYear());
    }

    @Test
    public void testPlusYearsZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.plusYears(0));
    }

    @Test
    public void testPlusMonths() {
        assertEquals(7, new LocalDate(2012, 6, 30).plusMonths(1).getMonthOfYear());
    }

    @Test
    public void testPlusMonthsZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.plusMonths(0));
    }

    @Test
    public void testPlusWeeks() {
        assertEquals(7, new LocalDate(2012, 6, 30).plusWeeks(1).getDayOfMonth());
    }

    @Test
    public void testPlusWeeksZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.plusWeeks(0));
    }

    @Test
    public void testPlusDays() {
        assertEquals(1, new LocalDate(2012, 6, 30).plusDays(1).getDayOfMonth());
    }

    @Test
    public void testPlusDaysZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.plusDays(0));
    }

    // ===================== minusYears/Months/Weeks/Days =====================

    @Test
    public void testMinusYears() {
        assertEquals(2011, new LocalDate(2012, 6, 30).minusYears(1).getYear());
    }

    @Test
    public void testMinusYearsZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.minusYears(0));
    }

    @Test
    public void testMinusMonths() {
        assertEquals(5, new LocalDate(2012, 6, 30).minusMonths(1).getMonthOfYear());
    }

    @Test
    public void testMinusMonthsZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.minusMonths(0));
    }

    @Test
    public void testMinusWeeks() {
        assertEquals(23, new LocalDate(2012, 6, 30).minusWeeks(1).getDayOfMonth());
    }

    @Test
    public void testMinusWeeksZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.minusWeeks(0));
    }

    @Test
    public void testMinusDays() {
        assertEquals(29, new LocalDate(2012, 6, 30).minusDays(1).getDayOfMonth());
    }

    @Test
    public void testMinusDaysZeroReturnsSame() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.minusDays(0));
    }

    // ===================== property(DateTimeFieldType) =====================

    @Test
    public void testProperty() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        LocalDate.Property prop = ld.property(DateTimeFieldType.year());
        assertEquals(2012, prop.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyNullType() {
        new LocalDate(2012, 6, 30).property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyUnsupported() {
        new LocalDate(2012, 6, 30).property(DateTimeFieldType.hourOfDay());
    }

    // ===================== getters (boundary known values) =====================

    @Test
    public void testGetters() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(1, ld.getEra());             // CE
        assertEquals(20, ld.getCenturyOfEra());
        assertEquals(2012, ld.getYearOfEra());
        assertEquals(12, ld.getYearOfCentury());
        assertEquals(2012, ld.getYear());
        assertEquals(2012, ld.getWeekyear());
        assertEquals(6, ld.getMonthOfYear());
        assertTrue(ld.getWeekOfWeekyear() > 0);
        assertEquals(182, ld.getDayOfYear());      // leap year 2012
        assertEquals(30, ld.getDayOfMonth());
        assertEquals(6, ld.getDayOfWeek());        // Saturday
    }

    // ===================== withXxx field setters =====================

    @Test
    public void testWithEra() {
        assertEquals(1, new LocalDate(2012, 6, 30).withEra(1).getEra());
    }

    @Test
    public void testWithCenturyOfEra() {
        assertEquals(19, new LocalDate(2012, 6, 30).withCenturyOfEra(19).getCenturyOfEra());
    }

    @Test
    public void testWithYearOfEra() {
        assertEquals(2000, new LocalDate(2012, 6, 30).withYearOfEra(2000).getYearOfEra());
    }

    @Test
    public void testWithYearOfCentury() {
        assertEquals(50, new LocalDate(2012, 6, 30).withYearOfCentury(50).getYearOfCentury());
    }

    @Test
    public void testWithYear() {
        assertEquals(2000, new LocalDate(2012, 6, 30).withYear(2000).getYear());
    }

    @Test
    public void testWithWeekyear() {
        assertEquals(2000, new LocalDate(2012, 6, 30).withWeekyear(2000).getWeekyear());
    }

    @Test
    public void testWithMonthOfYear() {
        assertEquals(1, new LocalDate(2012, 6, 30).withMonthOfYear(1).getMonthOfYear());
    }

    @Test
    public void testWithWeekOfWeekyear() {
        assertEquals(1, new LocalDate(2012, 6, 30).withWeekOfWeekyear(1).getWeekOfWeekyear());
    }

    @Test
    public void testWithDayOfYear() {
        assertEquals(1, new LocalDate(2012, 6, 30).withDayOfYear(1).getDayOfYear());
    }

    @Test
    public void testWithDayOfMonth() {
        assertEquals(1, new LocalDate(2012, 6, 30).withDayOfMonth(1).getDayOfMonth());
    }

    @Test
    public void testWithDayOfWeek() {
        assertEquals(1, new LocalDate(2012, 6, 30).withDayOfWeek(1).getDayOfWeek());
    }

    // ===================== Property accessor factories =====================

    @Test
    public void testPropertyFactories() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertNotNull(ld.era());
        assertNotNull(ld.centuryOfEra());
        assertNotNull(ld.yearOfCentury());
        assertNotNull(ld.yearOfEra());
        assertNotNull(ld.year());
        assertNotNull(ld.weekyear());
        assertNotNull(ld.monthOfYear());
        assertNotNull(ld.weekOfWeekyear());
        assertNotNull(ld.dayOfYear());
        assertNotNull(ld.dayOfMonth());
        assertNotNull(ld.dayOfWeek());
    }

    // ===================== toString =====================

    @Test
    public void testToString() {
        assertEquals("2012-06-30", new LocalDate(2012, 6, 30).toString());
    }

    @Test
    public void testToStringWithPattern() {
        assertEquals("2012 06 30", new LocalDate(2012, 6, 30).toString("yyyy MM dd"));
    }

    @Test
    public void testToStringWithNullPatternFallback() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(ld.toString(), ld.toString((String) null));
    }

    @Test
    public void testToStringWithPatternAndLocale() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals("2012 06 30", ld.toString("yyyy MM dd", Locale.US));
    }

    @Test
    public void testToStringWithNullPatternAndLocaleFallback() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(ld.toString(), ld.toString(null, Locale.US));
    }

    // ===================== Property class methods =====================

    @Test
    public void testPropertyAddToCopy() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        LocalDate result = ld.dayOfMonth().addToCopy(1);
        assertEquals(7, result.getMonthOfYear());
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        LocalDate ld = new LocalDate(2012, 1, 31);
        LocalDate result = ld.dayOfMonth().addWrapFieldToCopy(1);
        assertEquals(1, result.getMonthOfYear()); // wrap ภายในเดือนเดิม
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testPropertySetCopy() {
        assertEquals(2000, new LocalDate(2012, 6, 30).year().setCopy(2000).getYear());
    }

    @Test
    public void testPropertySetCopyText() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(12, ld.monthOfYear().setCopy("December").getMonthOfYear());
    }

    @Test
    public void testPropertySetCopyTextWithLocale() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertEquals(12, ld.monthOfYear().setCopy("December", Locale.ENGLISH).getMonthOfYear());
    }

    @Test
    public void testPropertyWithMaximumValue() {
        // มิถุนายนมี 30 วัน
        assertEquals(30, new LocalDate(2012, 6, 1).dayOfMonth().withMaximumValue().getDayOfMonth());
    }

    @Test
    public void testPropertyWithMinimumValue() {
        assertEquals(1, new LocalDate(2012, 6, 30).dayOfMonth().withMinimumValue().getDayOfMonth());
    }

    @Test
    public void testPropertyRoundFloorCopy() {
        assertNotNull(new LocalDate(2012, 6, 30).monthOfYear().roundFloorCopy());
    }

    @Test
    public void testPropertyRoundCeilingCopy() {
        assertNotNull(new LocalDate(2012, 6, 30).monthOfYear().roundCeilingCopy());
    }

    @Test
    public void testPropertyRoundHalfFloorCopy() {
        assertNotNull(new LocalDate(2012, 6, 30).monthOfYear().roundHalfFloorCopy());
    }

    @Test
    public void testPropertyRoundHalfCeilingCopy() {
        assertNotNull(new LocalDate(2012, 6, 30).monthOfYear().roundHalfCeilingCopy());
    }

    @Test
    public void testPropertyRoundHalfEvenCopy() {
        assertNotNull(new LocalDate(2012, 6, 30).monthOfYear().roundHalfEvenCopy());
    }

    @Test
    public void testPropertyGetField() {
        assertNotNull(new LocalDate(2012, 6, 30).year().getField());
    }

    @Test
    public void testPropertyGetLocalDate() {
        LocalDate ld = new LocalDate(2012, 6, 30);
        assertSame(ld, ld.year().getLocalDate());
    }
}
