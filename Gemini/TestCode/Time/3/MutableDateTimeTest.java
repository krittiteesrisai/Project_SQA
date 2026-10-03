package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MutableDateTimeTest {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone UTC = DateTimeZone.UTC;

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
    // Factory Methods
    // -----------------------------------------------------------------------
    @Test
    public void testNow() {
        MutableDateTime dt = MutableDateTime.now();
        assertNotNull(dt);
        assertEquals(ISOChronology.getInstance(LONDON), dt.getChronology());
    }

    @Test
    public void testNow_DateTimeZone() {
        MutableDateTime dt = MutableDateTime.now(PARIS);
        assertNotNull(dt);
        assertEquals(ISOChronology.getInstance(PARIS), dt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_DateTimeZone_Null() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNow_Chronology() {
        Chronology chrono = BuddhistChronology.getInstance(PARIS);
        MutableDateTime dt = MutableDateTime.now(chrono);
        assertNotNull(dt);
        assertEquals(chrono, dt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_Chronology_Null() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testParse_String() {
        MutableDateTime dt = MutableDateTime.parse("2023-05-12T10:30:45.123+01:00");
        assertEquals(2023, dt.getYear());
        assertEquals(5, dt.getMonthOfYear());
        assertEquals(12, dt.getDayOfMonth());
        assertEquals(10, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());
        assertEquals(45, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());
    }

    @Test
    public void testParse_String_Formatter() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
        MutableDateTime dt = MutableDateTime.parse("2023/11/25 15:45:30", formatter);
        assertEquals(2023, dt.getYear());
        assertEquals(11, dt.getMonthOfYear());
        assertEquals(25, dt.getDayOfMonth());
        assertEquals(15, dt.getHourOfDay());
        assertEquals(45, dt.getMinuteOfHour());
        assertEquals(30, dt.getSecondOfMinute());
    }

    // -----------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------
    @Test
    public void testConstructors_NullAndNonNull() {
        MutableDateTime dtZoneNull = new MutableDateTime((DateTimeZone) null);
        assertEquals(LONDON, dtZoneNull.getZone());

        MutableDateTime dtChronoNull = new MutableDateTime((Chronology) null);
        assertEquals(ISOChronology.getInstance(LONDON), dtChronoNull.getChronology());

        MutableDateTime dtInstantZone = new MutableDateTime(10000L, (DateTimeZone) null);
        assertEquals(10000L, dtInstantZone.getMillis());
        assertEquals(LONDON, dtInstantZone.getZone());

        MutableDateTime dtInstantChrono = new MutableDateTime(10000L, (Chronology) null);
        assertEquals(10000L, dtInstantChrono.getMillis());
        assertEquals(ISOChronology.getInstance(LONDON), dtInstantChrono.getChronology());

        // Object constructor
        MutableDateTime dtObjNull = new MutableDateTime((Object) null);
        assertTrue(Math.abs(System.currentTimeMillis() - dtObjNull.getMillis()) < 2000);

        MutableDateTime dtObjDate = new MutableDateTime(new Date(123456789L));
        assertEquals(123456789L, dtObjDate.getMillis());

        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(987654321L);
        MutableDateTime dtObjCal = new MutableDateTime(cal);
        assertEquals(987654321L, dtObjCal.getMillis());
        assertEquals(GJChronology.getInstance(LONDON), dtObjCal.getChronology());

        MutableDateTime dtObjWithZone = new MutableDateTime(new Date(123456789L), PARIS);
        assertEquals(PARIS, dtObjWithZone.getZone());

        MutableDateTime dtObjWithChrono = new MutableDateTime(new Date(123456789L), (Chronology) null);
        assertEquals(ISOChronology.getInstance(LONDON), dtObjWithChrono.getChronology());
    }

    @Test
    public void testConstructors_FieldValues() {
        MutableDateTime dt1 = new MutableDateTime(2020, 2, 29, 12, 30, 45, 500);
        assertEquals(2020, dt1.getYear());
        assertEquals(2, dt1.getMonthOfYear());
        assertEquals(29, dt1.getDayOfMonth());

        MutableDateTime dt2 = new MutableDateTime(2020, 2, 29, 12, 30, 45, 500, PARIS);
        assertEquals(PARIS, dt2.getZone());

        MutableDateTime dt3 = new MutableDateTime(2020, 2, 29, 12, 30, 45, 500, (DateTimeZone) null);
        assertEquals(LONDON, dt3.getZone());

        MutableDateTime dt4 = new MutableDateTime(2020, 2, 29, 12, 30, 45, 500, BuddhistChronology.getInstance(UTC));
        assertEquals(BuddhistChronology.getInstance(UTC), dt4.getChronology());

        MutableDateTime dt5 = new MutableDateTime(2020, 2, 29, 12, 30, 45, 500, (Chronology) null);
        assertEquals(ISOChronology.getInstance(LONDON), dt5.getChronology());
    }

    // -----------------------------------------------------------------------
    // Rounding & setMillis
    // -----------------------------------------------------------------------
    @Test
    public void testRounding_AllModes() {
        MutableDateTime dt = new MutableDateTime(2020, 1, 1, 10, 30, 45, 500, UTC);
        DateTimeField secondField = dt.getChronology().secondOfMinute();

        // ROUND_FLOOR default
        dt.setRounding(secondField);
        assertEquals(secondField, dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_FLOOR, dt.getRoundingMode());
        assertEquals(0, dt.getMillisOfSecond());

        // ROUND_CEILING
        dt.setMillis(2020, 1, 1, 10, 30, 45, 500);
        dt.setRounding(secondField, MutableDateTime.ROUND_CEILING);
        assertEquals(46, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());

        // ROUND_HALF_FLOOR
        dt.setRounding(secondField, MutableDateTime.ROUND_NONE);
        dt.setMillis(2020, 1, 1, 10, 30, 45, 500);
        dt.setRounding(secondField, MutableDateTime.ROUND_HALF_FLOOR);
        assertEquals(45, dt.getSecondOfMinute());

        // ROUND_HALF_CEILING
        dt.setRounding(secondField, MutableDateTime.ROUND_NONE);
        dt.setMillis(2020, 1, 1, 10, 30, 45, 500);
        dt.setRounding(secondField, MutableDateTime.ROUND_HALF_CEILING);
        assertEquals(46, dt.getSecondOfMinute());

        // ROUND_HALF_EVEN
        dt.setRounding(secondField, MutableDateTime.ROUND_NONE);
        dt.setMillis(2020, 1, 1, 10, 30, 45, 500); // 45 is odd -> round to 46
        dt.setRounding(secondField, MutableDateTime.ROUND_HALF_EVEN);
        assertEquals(46, dt.getSecondOfMinute());

        // Disable rounding with null field or ROUND_NONE
        dt.setRounding(null, MutableDateTime.ROUND_FLOOR);
        assertNull(dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());

        dt.setRounding(secondField, MutableDateTime.ROUND_NONE);
        assertNull(dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRounding_InvalidModeNegative() {
        MutableDateTime dt = new MutableDateTime();
        dt.setRounding(dt.getChronology().secondOfMinute(), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRounding_InvalidModeTooLarge() {
        MutableDateTime dt = new MutableDateTime();
        dt.setRounding(dt.getChronology().secondOfMinute(), 6);
    }

    @Test
    public void testSetMillis_ReadableInstant() {
        MutableDateTime dt = new MutableDateTime(0L, UTC);
        DateTime other = new DateTime(5000L, UTC);
        dt.setMillis(other);
        assertEquals(5000L, dt.getMillis());

        dt.setMillis((ReadableInstant) null);
        assertTrue(Math.abs(System.currentTimeMillis() - dt.getMillis()) < 2000);
    }

    // -----------------------------------------------------------------------
    // Add Operations (Durations & Periods)
    // -----------------------------------------------------------------------
    @Test
    public void testAdd_LongAndDurations() {
        MutableDateTime dt = new MutableDateTime(1000L, UTC);
        dt.add(500L);
        assertEquals(1500L, dt.getMillis());

        dt.add((ReadableDuration) null);
        assertEquals(1500L, dt.getMillis());

        Duration duration = new Duration(2000L);
        dt.add(duration);
        assertEquals(3500L, dt.getMillis());

        dt.add(duration, 2);
        assertEquals(7500L, dt.getMillis());

        dt.add((ReadableDuration) null, 3);
        assertEquals(7500L, dt.getMillis());
    }

    @Test
    public void testAdd_Period() {
        MutableDateTime dt = new MutableDateTime(2021, 1, 15, 10, 0, 0, 0, UTC);
        dt.add((ReadablePeriod) null);
        assertEquals(15, dt.getDayOfMonth());

        Period period = Period.days(5);
        dt.add(period);
        assertEquals(20, dt.getDayOfMonth());

        dt.add(period, -2);
        assertEquals(10, dt.getDayOfMonth());

        dt.add((ReadablePeriod) null, 5);
        assertEquals(10, dt.getDayOfMonth());
    }

    @Test
    public void testAdd_DurationFieldType() {
        MutableDateTime dt = new MutableDateTime(2021, 1, 15, 10, 0, 0, 0, UTC);
        dt.add(DurationFieldType.days(), 5);
        assertEquals(20, dt.getDayOfMonth());

        dt.add(DurationFieldType.months(), 1);
        assertEquals(2, dt.getMonthOfYear());

        dt.add(DurationFieldType.years(), -1);
        assertEquals(2020, dt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_DurationFieldType_Null() {
        MutableDateTime dt = new MutableDateTime();
        dt.add((DurationFieldType) null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_DateTimeFieldType_Null() {
        MutableDateTime dt = new MutableDateTime();
        dt.set((DateTimeFieldType) null, 1);
    }

    // -----------------------------------------------------------------------
    // Zone changes
    // -----------------------------------------------------------------------
    @Test
    public void testSetZone() {
        MutableDateTime dt = new MutableDateTime(2021, 6, 1, 12, 0, 0, 0, LONDON);
        long millis = dt.getMillis();
        dt.setZone(LONDON); // same zone -> no change
        assertEquals(millis, dt.getMillis());

        dt.setZone(PARIS);
        assertEquals(millis, dt.getMillis());
        assertEquals(PARIS, dt.getZone());

        dt.setZone(null); // defaults to LONDON
        assertEquals(LONDON, dt.getZone());
    }

    @Test
    public void testSetZoneRetainFields() {
        MutableDateTime dt = new MutableDateTime(2021, 6, 1, 12, 0, 0, 0, UTC);
        dt.setZoneRetainFields(UTC); // same zone
        assertEquals(12, dt.getHourOfDay());

        dt.setZoneRetainFields(PARIS);
        assertEquals(12, dt.getHourOfDay());
        assertEquals(PARIS, dt.getZone());

        dt.setZoneRetainFields(null); // defaults to LONDON
        assertEquals(12, dt.getHourOfDay());
        assertEquals(LONDON, dt.getZone());
    }

    // -----------------------------------------------------------------------
    // Field Setters and Adders
    // -----------------------------------------------------------------------
    @Test
    public void testFieldAddAndSetMethods() {
        MutableDateTime dt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);

        dt.setYear(2022);
        assertEquals(2022, dt.getYear());
        dt.addYears(2);
        assertEquals(2024, dt.getYear());

        dt.setWeekyear(2025);
        assertEquals(2025, dt.getWeekyear());
        dt.addWeekyears(1);
        assertEquals(2026, dt.getWeekyear());

        dt.setMonthOfYear(6);
        assertEquals(6, dt.getMonthOfYear());
        dt.addMonths(2);
        assertEquals(8, dt.getMonthOfYear());

        dt.setWeekOfWeekyear(10);
        assertEquals(10, dt.getWeekOfWeekyear());
        dt.addWeeks(2);
        assertEquals(12, dt.getWeekOfWeekyear());

        dt.setDayOfYear(50);
        assertEquals(50, dt.getDayOfYear());

        dt.setDayOfMonth(15);
        assertEquals(15, dt.getDayOfMonth());

        dt.setDayOfWeek(DateTimeConstants.WEDNESDAY);
        assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());

        dt.addDays(3);
        assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek());

        dt.setHourOfDay(14);
        assertEquals(14, dt.getHourOfDay());
        dt.addHours(2);
        assertEquals(16, dt.getHourOfDay());

        dt.setMinuteOfDay(120);
        assertEquals(2, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());

        dt.setMinuteOfHour(45);
        assertEquals(45, dt.getMinuteOfHour());
        dt.addMinutes(15);
        assertEquals(3, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());

        dt.setSecondOfDay(3600);
        assertEquals(1, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());

        dt.setSecondOfMinute(30);
        assertEquals(30, dt.getSecondOfMinute());
        dt.addSeconds(40);
        assertEquals(1, dt.getMinuteOfHour());
        assertEquals(10, dt.getSecondOfMinute());

        dt.setMillisOfDay(5000);
        assertEquals(5000, dt.getMillisOfDay());

        dt.setMillisOfSecond(800);
        assertEquals(800, dt.getMillisOfSecond());
        dt.addMillis(300);
        assertEquals(100, dt.getMillisOfSecond());
    }

    // -----------------------------------------------------------------------
    // setDate / setTime / setDateTime
    // -----------------------------------------------------------------------
    @Test
    public void testSetDate_Variants() {
        MutableDateTime dt = new MutableDateTime(2020, 5, 20, 15, 30, 45, 123, UTC);

        dt.setDate(new DateTime(2022, 11, 5, 2, 2, 2, 2, UTC).getMillis());
        assertEquals(2022, dt.getYear());
        assertEquals(11, dt.getMonthOfYear());
        assertEquals(5, dt.getDayOfMonth());
        assertEquals(15, dt.getHourOfDay()); // time part unaffected

        DateTime instantWithZone = new DateTime(2023, 1, 10, 0, 0, 0, 0, PARIS);
        dt.setDate(instantWithZone);
        assertEquals(2023, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(10, dt.getDayOfMonth());

        Instant pureInstant = new Instant(0L); // 1970-01-01 UTC
        dt.setDate(pureInstant);
        assertEquals(1970, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(1, dt.getDayOfMonth());

        dt.setDate(2025, 7, 19);
        assertEquals(2025, dt.getYear());
        assertEquals(7, dt.getMonthOfYear());
        assertEquals(19, dt.getDayOfMonth());
    }

    @Test
    public void testSetTime_Variants() {
        MutableDateTime dt = new MutableDateTime(2020, 5, 20, 15, 30, 45, 123, UTC);

        DateTime timeInstant = new DateTime(2000, 1, 1, 8, 20, 10, 50, UTC);
        dt.setTime(timeInstant.getMillis());
        assertEquals(8, dt.getHourOfDay());
        assertEquals(20, dt.getMinuteOfHour());
        assertEquals(10, dt.getSecondOfMinute());
        assertEquals(50, dt.getMillisOfSecond());
        assertEquals(2020, dt.getYear()); // date part unaffected

        DateTime timeWithZone = new DateTime(2000, 1, 1, 9, 30, 0, 0, PARIS);
        dt.setTime(timeWithZone);
        assertEquals(9, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());

        dt.setTime(22, 15, 40, 999);
        assertEquals(22, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(40, dt.getSecondOfMinute());
        assertEquals(999, dt.getMillisOfSecond());
    }

    @Test
    public void testSetDateTime() {
        MutableDateTime dt = new MutableDateTime(0L, UTC);
        dt.setDateTime(2024, 12, 31, 23, 59, 59, 999);
        assertEquals(2024, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(31, dt.getDayOfMonth());
        assertEquals(23, dt.getHourOfDay());
        assertEquals(59, dt.getMinuteOfHour());
        assertEquals(59, dt.getSecondOfMinute());
        assertEquals(999, dt.getMillisOfSecond());
    }

    // -----------------------------------------------------------------------
    // Properties & Clones
    // -----------------------------------------------------------------------
    @Test
    public void testPropertiesAccessors() {
        MutableDateTime dt = new MutableDateTime(2020, 6, 15, 12, 30, 40, 500, UTC);

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
        assertNotNull(dt.minuteOfDay());
        assertNotNull(dt.minuteOfHour());
        assertNotNull(dt.secondOfDay());
        assertNotNull(dt.secondOfMinute());
        assertNotNull(dt.millisOfDay());
        assertNotNull(dt.millisOfSecond());

        assertNotNull(dt.property(DateTimeFieldType.dayOfMonth()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_NullType() {
        MutableDateTime dt = new MutableDateTime();
        dt.property(null);
    }

    @Test
    public void testPropertyOperations() {
        MutableDateTime dt = new MutableDateTime(2020, 1, 15, 12, 30, 40, 500, UTC);
        MutableDateTime.Property dayProp = dt.dayOfMonth();

        assertEquals(15, dayProp.get());
        assertEquals(dt, dayProp.getMutableDateTime());
        assertEquals(dt.getMillis(), dayProp.getMillis());
        assertEquals(dt.getChronology(), dayProp.getChronology());
        assertEquals(dt.getChronology().dayOfMonth(), dayProp.getField());

        dayProp.add(5);
        assertEquals(20, dt.getDayOfMonth());

        dayProp.add(5L);
        assertEquals(25, dt.getDayOfMonth());

        dayProp.addWrapField(10); // Wraps around Jan (31 days)
        assertEquals(4, dt.getDayOfMonth());

        dayProp.set(10);
        assertEquals(10, dt.getDayOfMonth());

        MutableDateTime.Property monthProp = dt.monthOfYear();
        monthProp.set("February", Locale.UK);
        assertEquals(2, dt.getMonthOfYear());

        monthProp.set("3");
        assertEquals(3, dt.getMonthOfYear());

        // Rounding via Property
        MutableDateTime.Property minProp = dt.minuteOfHour();
        minProp.roundFloor();
        assertEquals(0, dt.getSecondOfMinute());

        dt.secondOfMinute().set(45);
        minProp.roundCeiling();
        assertEquals(31, dt.getMinuteOfHour());

        dt.secondOfMinute().set(30);
        minProp.roundHalfFloor();
        assertEquals(31, dt.getMinuteOfHour());

        dt.secondOfMinute().set(30);
        minProp.roundHalfCeiling();
        assertEquals(31, dt.getMinuteOfHour());

        dt.secondOfMinute().set(30);
        minProp.roundHalfEven();
        assertEquals(31, dt.getMinuteOfHour());
    }

    @Test
    public void testCloneCopyToString() {
        MutableDateTime dt = new MutableDateTime(2021, 5, 10, 8, 30, 0, 0, UTC);
        MutableDateTime copy = dt.copy();
        assertEquals(dt, copy);
        assertNotSame(dt, copy);

        MutableDateTime clone = (MutableDateTime) dt.clone();
        assertEquals(dt, clone);
        assertNotSame(dt, clone);

        assertEquals("2021-05-10T08:30:00.000Z", dt.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        MutableDateTime dt = new MutableDateTime(2021, 5, 10, 8, 30, 0, 0, UTC);
        MutableDateTime.Property prop = dt.monthOfYear();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        MutableDateTime.Property deserialized = (MutableDateTime.Property) ois.readObject();
        ois.close();

        assertEquals(prop.get(), deserialized.get());
        assertEquals(prop.getField().getType(), deserialized.getField().getType());
    }
}