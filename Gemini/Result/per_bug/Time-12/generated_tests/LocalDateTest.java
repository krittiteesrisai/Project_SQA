package org.joda.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LocalDateTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();

    private DateTimeZone originalZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // Factory methods & BC / Era Boundary Cases (Time-12 Focus)
    // -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_null() {
        LocalDate.fromCalendarFields(null);
    }

    @Test
    public void testFromCalendarFields_AD() {
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 15);
        LocalDate date = LocalDate.fromCalendarFields(cal);
        assertEquals(2023, date.getYear());
        assertEquals(3, date.getMonthOfYear());
        assertEquals(15, date.getDayOfMonth());
    }

    @Test
    public void testFromCalendarFields_BC() {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 5);
        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
        cal.set(Calendar.DAY_OF_MONTH, 10);

        LocalDate date = LocalDate.fromCalendarFields(cal);
        // Year 5 BC in astronomical/ISO year numbering is -4
        assertEquals(-4, date.getYear());
        assertEquals(2, date.getMonthOfYear());
        assertEquals(10, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_null() {
        LocalDate.fromDateFields(null);
    }

    @Test
    public void testFromDateFields_AD() {
        @SuppressWarnings("deprecation")
        Date d = new Date(123, 2, 15); // Year 2023, Month 2 (March), Day 15
        LocalDate date = LocalDate.fromDateFields(d);
        assertEquals(2023, date.getYear());
        assertEquals(3, date.getMonthOfYear());
        assertEquals(15, date.getDayOfMonth());
    }

    @Test
    public void testFromDateFields_BC() {
        @SuppressWarnings("deprecation")
        Date d = new Date(-1905, 1, 10); // 5 BC (Year -5 AD + 1900 = -1905)
        LocalDate date = LocalDate.fromDateFields(d);
        assertEquals(-4, date.getYear());
        assertEquals(2, date.getMonthOfYear());
        assertEquals(10, date.getDayOfMonth());
    }

    // -----------------------------------------------------------------------
    // now() and parse() factories
    // -----------------------------------------------------------------------
    @Test
    public void testNow() {
        LocalDate date = LocalDate.now();
        assertNotNull(date);
    }

    @Test
    public void testNow_Zone() {
        LocalDate date = LocalDate.now(PARIS);
        assertNotNull(date);
    }

    @Test(expected = NullPointerException.class)
    public void testNow_ZoneNull() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void testNow_Chronology() {
        LocalDate date = LocalDate.now(BuddhistChronology.getInstance());
        assertNotNull(date);
        assertTrue(date.getChronology() instanceof BuddhistChronology);
    }

    @Test(expected = NullPointerException.class)
    public void testNow_ChronologyNull() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void testParse_String() {
        LocalDate date = LocalDate.parse("2020-05-20");
        assertEquals(2020, date.getYear());
        assertEquals(5, date.getMonthOfYear());
        assertEquals(20, date.getDayOfMonth());
    }

    @Test
    public void testParse_Formatter() {
        LocalDate date = LocalDate.parse("20/05/2020", DateTimeFormat.forPattern("dd/MM/yyyy"));
        assertEquals(2020, date.getYear());
        assertEquals(5, date.getMonthOfYear());
        assertEquals(20, date.getDayOfMonth());
    }

    // -----------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------
    @Test
    public void testConstructors_DateTimeZone() {
        LocalDate d1 = new LocalDate((DateTimeZone) null);
        assertNotNull(d1);

        LocalDate d2 = new LocalDate(PARIS);
        assertNotNull(d2);
    }

    @Test
    public void testConstructors_Chronology() {
        LocalDate d1 = new LocalDate((Chronology) null);
        assertEquals(ISO_UTC, d1.getChronology());

        LocalDate d2 = new LocalDate(CopticChronology.getInstanceUTC());
        assertEquals(CopticChronology.getInstanceUTC(), d2.getChronology());
    }

    @Test
    public void testConstructors_long() {
        long millis = 1589976000000L; // 2020-05-20T12:00:00Z
        LocalDate d1 = new LocalDate(millis);
        assertEquals(2020, d1.getYear());
        assertEquals(5, d1.getMonthOfYear());
        assertEquals(20, d1.getDayOfMonth());

        LocalDate d2 = new LocalDate(millis, (DateTimeZone) null);
        assertEquals(d1, d2);

        LocalDate d3 = new LocalDate(millis, PARIS);
        assertNotNull(d3);

        LocalDate d4 = new LocalDate(millis, (Chronology) null);
        assertEquals(ISO_UTC, d4.getChronology());

        LocalDate d5 = new LocalDate(millis, GregorianChronology.getInstanceUTC());
        assertEquals(GregorianChronology.getInstanceUTC(), d5.getChronology());
    }

    @Test
    public void testConstructors_Object() {
        LocalDate d1 = new LocalDate("2021-12-25");
        assertEquals(2021, d1.getYear());
        assertEquals(12, d1.getMonthOfYear());
        assertEquals(25, d1.getDayOfMonth());

        LocalDate d2 = new LocalDate("2021-12-25", PARIS);
        assertEquals(2021, d2.getYear());

        LocalDate d3 = new LocalDate("2021-12-25", (DateTimeZone) null);
        assertEquals(d1, d3);

        LocalDate d4 = new LocalDate("2021-12-25", CopticChronology.getInstanceUTC());
        assertTrue(d4.getChronology() instanceof CopticChronology);

        LocalDate d5 = new LocalDate("2021-12-25", (Chronology) null);
        assertEquals(ISO_UTC, d5.getChronology());
    }

    @Test
    public void testConstructors_YMD() {
        LocalDate date = new LocalDate(2022, 7, 4, (Chronology) null);
        assertEquals(2022, date.getYear());
        assertEquals(7, date.getMonthOfYear());
        assertEquals(4, date.getDayOfMonth());
        assertEquals(ISO_UTC, date.getChronology());
    }

    // -----------------------------------------------------------------------
    // Field Access & Indices
    // -----------------------------------------------------------------------
    @Test
    public void testSize() {
        LocalDate date = new LocalDate(2020, 1, 1);
        assertEquals(3, date.size());
    }

    @Test
    public void testGetField_and_Value() {
        LocalDate date = new LocalDate(2020, 5, 12);
        assertEquals(ISO_UTC.year(), date.getField(0, ISO_UTC));
        assertEquals(ISO_UTC.monthOfYear(), date.getField(1, ISO_UTC));
        assertEquals(ISO_UTC.dayOfMonth(), date.getField(2, ISO_UTC));

        assertEquals(2020, date.getValue(0));
        assertEquals(5, date.getValue(1));
        assertEquals(12, date.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidNegative() {
        new LocalDate().getField(-1, ISO_UTC);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidPositive() {
        new LocalDate().getField(3, ISO_UTC);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidNegative() {
        new LocalDate().getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidPositive() {
        new LocalDate().getValue(3);
    }

    @Test
    public void testGet_DateTimeFieldType() {
        LocalDate date = new LocalDate(2020, 5, 12);
        assertEquals(2020, date.get(DateTimeFieldType.year()));
        assertEquals(5, date.get(DateTimeFieldType.monthOfYear()));
        assertEquals(12, date.get(DateTimeFieldType.dayOfMonth()));
        assertEquals(133, date.get(DateTimeFieldType.dayOfYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_DateTimeFieldType_null() {
        new LocalDate().get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_DateTimeFieldType_unsupported() {
        new LocalDate().get(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void testIsSupported_DateTimeFieldType() {
        LocalDate date = new LocalDate(2020, 1, 1);
        assertTrue(date.isSupported(DateTimeFieldType.year()));
        assertTrue(date.isSupported(DateTimeFieldType.dayOfMonth()));
        assertTrue(date.isSupported(DateTimeFieldType.dayOfYear()));
        assertFalse(date.isSupported(DateTimeFieldType.hourOfDay()));
        assertFalse(date.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupported_DurationFieldType() {
        LocalDate date = new LocalDate(2020, 1, 1);
        assertTrue(date.isSupported(DurationFieldType.days()));
        assertTrue(date.isSupported(DurationFieldType.weeks()));
        assertTrue(date.isSupported(DurationFieldType.months()));
        assertTrue(date.isSupported(DurationFieldType.years()));
        assertTrue(date.isSupported(DurationFieldType.centuries()));
        assertTrue(date.isSupported(DurationFieldType.eras()));
        assertFalse(date.isSupported(DurationFieldType.hours()));
        assertFalse(date.isSupported(DurationFieldType.minutes()));
        assertFalse(date.isSupported((DurationFieldType) null));
    }

    // -----------------------------------------------------------------------
    // Equals, HashCode, CompareTo
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        LocalDate d1 = new LocalDate(2020, 1, 1);
        LocalDate d2 = new LocalDate(2020, 1, 1);
        LocalDate d3 = new LocalDate(2020, 1, 2);
        LocalDate d4 = new LocalDate(2020, 1, 1, GregorianChronology.getInstanceUTC());

        assertTrue(d1.equals(d1));
        assertTrue(d1.equals(d2));
        assertFalse(d1.equals(d3));
        assertFalse(d1.equals(d4));
        assertFalse(d1.equals(null));
        assertFalse(d1.equals("2020-01-01"));

        assertEquals(d1.hashCode(), d2.hashCode());
        assertEquals(d1.hashCode(), d1.hashCode()); // caching branch
    }

    @Test
    public void testCompareTo() {
        LocalDate d1 = new LocalDate(2020, 1, 1);
        LocalDate d2 = new LocalDate(2020, 1, 1);
        LocalDate d3 = new LocalDate(2020, 1, 2);
        LocalDate d4 = new LocalDate(2019, 12, 31);

        assertEquals(0, d1.compareTo(d1));
        assertEquals(0, d1.compareTo(d2));
        assertTrue(d1.compareTo(d3) < 0);
        assertTrue(d1.compareTo(d4) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null() {
        new LocalDate().compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_invalidPartial() {
        new LocalDate().compareTo(new YearMonth(2020, 1));
    }

    // -----------------------------------------------------------------------
    // Conversions
    // -----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtStartOfDay() {
        LocalDate date = new LocalDate(2020, 5, 20);
        DateTime dt = date.toDateTimeAtStartOfDay();
        assertEquals(new DateTime(2020, 5, 20, 0, 0, 0, 0, LONDON), dt);

        DateTime dtParis = date.toDateTimeAtStartOfDay(PARIS);
        assertEquals(new DateTime(2020, 5, 20, 0, 0, 0, 0, PARIS), dtParis);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight() {
        LocalDate date = new LocalDate(2020, 5, 20);
        DateTime dt = date.toDateTimeAtMidnight();
        assertEquals(new DateTime(2020, 5, 20, 0, 0, 0, 0, LONDON), dt);

        DateTime dtParis = date.toDateTimeAtMidnight(PARIS);
        assertEquals(new DateTime(2020, 5, 20, 0, 0, 0, 0, PARIS), dtParis);
    }

    @Test
    public void testToDateTimeAtCurrentTime() {
        LocalDate date = new LocalDate(2020, 5, 20);
        DateTime dt = date.toDateTimeAtCurrentTime();
        assertEquals(2020, dt.getYear());
        assertEquals(5, dt.getMonthOfYear());
        assertEquals(20, dt.getDayOfMonth());

        DateTime dtParis = date.toDateTimeAtCurrentTime(PARIS);
        assertEquals(PARIS, dtParis.getZone());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight() {
        LocalDate date = new LocalDate(2020, 5, 20);
        DateMidnight dm = date.toDateMidnight();
        assertEquals(new DateMidnight(2020, 5, 20, LONDON), dm);

        DateMidnight dmParis = date.toDateMidnight(PARIS);
        assertEquals(new DateMidnight(2020, 5, 20, PARIS), dmParis);
    }

    @Test
    public void testToLocalDateTime() {
        LocalDate date = new LocalDate(2020, 5, 20);
        LocalTime time = new LocalTime(14, 30, 15);
        LocalDateTime ldt = date.toLocalDateTime(time);

        assertEquals(new LocalDateTime(2020, 5, 20, 14, 30, 15), ldt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTime_nullTime() {
        new LocalDate().toLocalDateTime(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTime_chronoMismatch() {
        LocalDate date = new LocalDate(2020, 5, 20, ISO_UTC);
        LocalTime time = new LocalTime(12, 0, CopticChronology.getInstanceUTC());
        date.toLocalDateTime(time);
    }

    @Test
    public void testToDateTime_LocalTime() {
        LocalDate date = new LocalDate(2020, 5, 20);
        LocalTime time = new LocalTime(10, 15);

        DateTime dt1 = date.toDateTime(time);
        assertEquals(new DateTime(2020, 5, 20, 10, 15, 0, 0, LONDON), dt1);

        DateTime dt2 = date.toDateTime((LocalTime) null);
        assertEquals(2020, dt2.getYear());
        assertEquals(5, dt2.getMonthOfYear());
        assertEquals(20, dt2.getDayOfMonth());

        DateTime dt3 = date.toDateTime(time, PARIS);
        assertEquals(PARIS, dt3.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToDateTime_chronoMismatch() {
        LocalDate date = new LocalDate(2020, 5, 20, ISO_UTC);
        LocalTime time = new LocalTime(12, 0, CopticChronology.getInstanceUTC());
        date.toDateTime(time, LONDON);
    }

    @Test
    public void testToInterval() {
        LocalDate date = new LocalDate(2020, 5, 20);
        Interval interval = date.toInterval();
        assertEquals(date.toDateTimeAtStartOfDay(), interval.getStart());
        assertEquals(date.plusDays(1).toDateTimeAtStartOfDay(), interval.getEnd());

        Interval intervalParis = date.toInterval(PARIS);
        assertEquals(date.toDateTimeAtStartOfDay(PARIS), intervalParis.getStart());
        assertEquals(date.plusDays(1).toDateTimeAtStartOfDay(PARIS), intervalParis.getEnd());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDate() {
        LocalDate date = new LocalDate(2020, 5, 20);
        Date d = date.toDate();
        assertEquals(120, d.getYear()); // 2020 - 1900
        assertEquals(4, d.getMonth());  // May = 4
        assertEquals(20, d.getDate());
    }

    // -----------------------------------------------------------------------
    // Math, with*, plus*, minus*
    // -----------------------------------------------------------------------
    @Test
    public void testWithFields() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.withFields(null));

        LocalDate updated = date.withFields(new MonthDay(12, 25));
        assertEquals(new LocalDate(2020, 12, 25), updated);
    }

    @Test
    public void testWithField() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertEquals(new LocalDate(2020, 5, 10), date.withField(DateTimeFieldType.dayOfMonth(), 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_null() {
        new LocalDate().withField(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupported() {
        new LocalDate().withField(DateTimeFieldType.hourOfDay(), 1);
    }

    @Test
    public void testWithFieldAdded() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.withFieldAdded(DurationFieldType.days(), 0));
        assertEquals(new LocalDate(2020, 5, 25), date.withFieldAdded(DurationFieldType.days(), 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_null() {
        new LocalDate().withFieldAdded(null, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupported() {
        new LocalDate().withFieldAdded(DurationFieldType.hours(), 5);
    }

    @Test
    public void testWithPeriodAdded() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.withPeriodAdded(null, 1));
        assertSame(date, date.withPeriodAdded(Period.days(1), 0));

        LocalDate added = date.withPeriodAdded(Period.days(5).withHours(12), 2);
        assertEquals(new LocalDate(2020, 5, 30), added);
    }

    @Test
    public void testPlus_minus_Period() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.plus(null));
        assertSame(date, date.minus(null));

        assertEquals(new LocalDate(2020, 5, 22), date.plus(Period.days(2)));
        assertEquals(new LocalDate(2020, 5, 18), date.minus(Period.days(2)));
    }

    @Test
    public void testPlusMinusYears() {
        LocalDate date = new LocalDate(2020, 2, 29);
        assertSame(date, date.plusYears(0));
        assertSame(date, date.minusYears(0));

        // Leap year boundary adjustment
        assertEquals(new LocalDate(2021, 2, 28), date.plusYears(1));
        assertEquals(new LocalDate(2019, 2, 28), date.minusYears(1));
    }

    @Test
    public void testPlusMinusMonths() {
        LocalDate date = new LocalDate(2020, 3, 31);
        assertSame(date, date.plusMonths(0));
        assertSame(date, date.minusMonths(0));

        assertEquals(new LocalDate(2020, 4, 30), date.plusMonths(1));
        assertEquals(new LocalDate(2020, 2, 29), date.minusMonths(1));
    }

    @Test
    public void testPlusMinusWeeks() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.plusWeeks(0));
        assertSame(date, date.minusWeeks(0));

        assertEquals(new LocalDate(2020, 5, 27), date.plusWeeks(1));
        assertEquals(new LocalDate(2020, 5, 13), date.minusWeeks(1));
    }

    @Test
    public void testPlusMinusDays() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertSame(date, date.plusDays(0));
        assertSame(date, date.minusDays(0));

        assertEquals(new LocalDate(2020, 5, 25), date.plusDays(5));
        assertEquals(new LocalDate(2020, 5, 15), date.minusDays(5));
    }

    // -----------------------------------------------------------------------
    // Getters and Specific with* methods
    // -----------------------------------------------------------------------
    @Test
    public void testGettersAndWithMethods() {
        LocalDate date = new LocalDate(2021, 6, 18);
        assertEquals(1, date.getEra());
        assertEquals(21, date.getCenturyOfEra());
        assertEquals(2021, date.getYearOfEra());
        assertEquals(21, date.getYearOfCentury());
        assertEquals(2021, date.getYear());
        assertEquals(2021, date.getWeekyear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(24, date.getWeekOfWeekyear());
        assertEquals(169, date.getDayOfYear());
        assertEquals(18, date.getDayOfMonth());
        assertEquals(5, date.getDayOfWeek());

        assertEquals(new LocalDate(2021, 6, 18), date.withEra(1));
        assertEquals(new LocalDate(1921, 6, 18), date.withCenturyOfEra(20));
        assertEquals(new LocalDate(2025, 6, 18), date.withYearOfEra(2025));
        assertEquals(new LocalDate(2050, 6, 18), date.withYearOfCentury(50));
        assertEquals(new LocalDate(2030, 6, 18), date.withYear(2030));
        assertEquals(new LocalDate(2022, 6, 24), date.withWeekyear(2022));
        assertEquals(new LocalDate(2021, 10, 18), date.withMonthOfYear(10));
        assertEquals(new LocalDate(2021, 6, 25), date.withWeekOfWeekyear(25));
        assertEquals(new LocalDate(2021, 1, 1), date.withDayOfYear(1));
        assertEquals(new LocalDate(2021, 6, 5), date.withDayOfMonth(5));
        assertEquals(new LocalDate(2021, 6, 14), date.withDayOfWeek(1));
    }

    // -----------------------------------------------------------------------
    // ToString formatting
    // -----------------------------------------------------------------------
    @Test
    public void testToString() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertEquals("2020-05-20", date.toString());
        assertEquals("20/05/2020", date.toString("dd/MM/yyyy"));
        assertEquals("2020-05-20", date.toString((String) null));
        assertEquals("20. May 2020", date.toString("dd. MMM yyyy", Locale.UK));
        assertEquals("2020-05-20", date.toString(null, Locale.UK));
    }

    // -----------------------------------------------------------------------
    // Property Inner Class
    // -----------------------------------------------------------------------
    @Test
    public void testPropertyMethods() {
        LocalDate date = new LocalDate(2020, 2, 15);
        LocalDate.Property prop = date.dayOfMonth();

        assertEquals(date, prop.getLocalDate());
        assertEquals(15, prop.get());
        assertEquals(ISO_UTC.dayOfMonth(), prop.getField());
        assertEquals(ISO_UTC, prop.getChronology());

        assertEquals(new LocalDate(2020, 2, 20), prop.addToCopy(5));
        assertEquals(new LocalDate(2020, 2, 1), prop.addWrapFieldToCopy(15));
        assertEquals(new LocalDate(2020, 2, 10), prop.setCopy(10));
        assertEquals(new LocalDate(2020, 2, 25), prop.setCopy("25"));
        assertEquals(new LocalDate(2020, 2, 25), prop.setCopy("25", Locale.ENGLISH));

        assertEquals(new LocalDate(2020, 2, 29), prop.withMaximumValue());
        assertEquals(new LocalDate(2020, 2, 1), prop.withMinimumValue());

        assertEquals(new LocalDate(2020, 2, 1), date.monthOfYear().roundFloorCopy());
        assertEquals(new LocalDate(2020, 3, 1), date.monthOfYear().roundCeilingCopy());
        assertEquals(new LocalDate(2020, 2, 1), date.monthOfYear().roundHalfFloorCopy());
        assertEquals(new LocalDate(2020, 3, 1), date.monthOfYear().roundHalfCeilingCopy());
        assertEquals(new LocalDate(2020, 2, 1), date.monthOfYear().roundHalfEvenCopy());
    }

    @Test
    public void testAllPropertiesAccess() {
        LocalDate date = new LocalDate(2020, 5, 20);
        assertNotNull(date.era());
        assertNotNull(date.centuryOfEra());
        assertNotNull(date.yearOfCentury());
        assertNotNull(date.yearOfEra());
        assertNotNull(date.year());
        assertNotNull(date.weekyear());
        assertNotNull(date.monthOfYear());
        assertNotNull(date.weekOfWeekyear());
        assertNotNull(date.dayOfYear());
        assertNotNull(date.dayOfMonth());
        assertNotNull(date.dayOfWeek());
        assertNotNull(date.property(DateTimeFieldType.year()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_null() {
        new LocalDate().property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupported() {
        new LocalDate().property(DateTimeFieldType.minuteOfHour());
    }

    // -----------------------------------------------------------------------
    // Serialization & readResolve
    // -----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {
        LocalDate date = new LocalDate(2020, 5, 20);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(date);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDate result = (LocalDate) ois.readObject();
        ois.close();

        assertEquals(date, result);
    }

    @Test
    public void testPropertySerialization() throws Exception {
        LocalDate.Property prop = new LocalDate(2020, 5, 20).dayOfMonth();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDate.Property result = (LocalDate.Property) ois.readObject();
        ois.close();

        assertEquals(prop.getLocalDate(), result.getLocalDate());
        assertEquals(prop.get(), result.get());
    }
}