package org.joda.time;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * JUnit 4 test suite for org.joda.time.MutableDateTime (Defects4J Time-3b)
 *
 * หมายเหตุทั่วไป:
 * - การทดสอบบางกรณี (เช่น branch "zone == null" ใน setDate/setTime(ReadableInstant)
 *   หรือ field ที่ "isSupported()==false" ใน property(type)) ไม่สามารถสร้างได้จาก
 *   Chronology มาตรฐานที่มีอยู่ใน classpath จึงถูกข้ามและคอมเมนต์กำกับไว้
 */
public class MutableDateTimeTest {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    @Before
    public void setUp() {
        // no shared mutable state needed; each test builds its own instance
    }

    // ---------------------------------------------------------------
    // Factory methods: now(), now(zone), now(chronology)
    // ---------------------------------------------------------------

    @Test
    public void testNow() {
        MutableDateTime mdt = MutableDateTime.now();
        assertNotNull(mdt);
    }

    @Test(expected = NullPointerException.class)
    public void testNowZoneNullThrows() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNowZoneValid() {
        MutableDateTime mdt = MutableDateTime.now(UTC);
        assertEquals(UTC, mdt.getZone());
    }

    @Test(expected = NullPointerException.class)
    public void testNowChronologyNullThrows() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testNowChronologyValid() {
        MutableDateTime mdt = MutableDateTime.now(ISO_UTC);
        assertEquals(ISO_UTC, mdt.getChronology());
    }

    // ---------------------------------------------------------------
    // parse()
    // ---------------------------------------------------------------

    @Test
    public void testParseDefault() {
        MutableDateTime mdt = MutableDateTime.parse("2004-06-09T10:20:30.000Z");
        assertEquals(2004, mdt.getYear());
        assertEquals(6, mdt.getMonthOfYear());
        assertEquals(9, mdt.getDayOfMonth());
    }

    @Test
    public void testParseWithFormatter() {
        DateTimeFormatter f = ISODateTimeFormat.dateTime();
        MutableDateTime mdt = MutableDateTime.parse("2004-06-09T10:20:30.000Z", f);
        assertEquals(2004, mdt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMalformedThrows() {
        MutableDateTime.parse("not-a-date");
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructorDefault() {
        MutableDateTime mdt = new MutableDateTime();
        assertNotNull(mdt);
    }

    @Test
    public void testConstructorZoneNullUsesDefault() {
        MutableDateTime mdt = new MutableDateTime((DateTimeZone) null);
        assertNotNull(mdt.getZone());
    }

    @Test
    public void testConstructorZone() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        assertEquals(UTC, mdt.getZone());
    }

    @Test
    public void testConstructorChronologyNullUsesISO() {
        MutableDateTime mdt = new MutableDateTime((Chronology) null);
        assertNotNull(mdt.getChronology());
    }

    @Test
    public void testConstructorChronology() {
        MutableDateTime mdt = new MutableDateTime(ISO_UTC);
        assertEquals(ISO_UTC, mdt.getChronology());
    }

    @Test
    public void testConstructorLong() {
        MutableDateTime mdt = new MutableDateTime(0L);
        assertEquals(0L, mdt.getMillis());
    }

    @Test
    public void testConstructorLongZone() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        assertEquals(0L, mdt.getMillis());
        assertEquals(UTC, mdt.getZone());
    }

    @Test
    public void testConstructorLongChronology() {
        MutableDateTime mdt = new MutableDateTime(0L, ISO_UTC);
        assertEquals(0L, mdt.getMillis());
    }

    @Test
    public void testConstructorObject() {
        MutableDateTime mdt = new MutableDateTime("2004-06-09T10:20:30.000Z");
        assertEquals(2004, mdt.getYear());
    }

    @Test
    public void testConstructorObjectZone() {
        MutableDateTime mdt = new MutableDateTime("2004-06-09T10:20:30.000Z", UTC);
        assertEquals(UTC, mdt.getZone());
    }

    @Test
    public void testConstructorObjectChronologyNull() {
        MutableDateTime mdt = new MutableDateTime("2004-06-09T10:20:30.000Z", (Chronology) null);
        assertNotNull(mdt.getChronology());
    }

    @Test
    public void testConstructorObjectChronology() {
        MutableDateTime mdt = new MutableDateTime("2004-06-09T10:20:30.000Z", ISO_UTC);
        assertEquals(ISO_UTC, mdt.getChronology());
    }

    @Test
    public void testConstructorFields() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500);
        assertEquals(2004, mdt.getYear());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testConstructorFieldsZone() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        assertEquals(UTC, mdt.getZone());
    }

    @Test
    public void testConstructorFieldsChronology() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, ISO_UTC);
        assertEquals(ISO_UTC, mdt.getChronology());
    }

    // ---------------------------------------------------------------
    // getRoundingField / getRoundingMode defaults
    // ---------------------------------------------------------------

    @Test
    public void testRoundingDefaults() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    // ---------------------------------------------------------------
    // setRounding(field) - single arg uses ROUND_FLOOR
    // ---------------------------------------------------------------

    @Test
    public void testSetRoundingSingleArgUsesFloor() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(ISO_UTC.minuteOfDay());
        assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
        assertNotNull(mdt.getRoundingField());
    }

    @Test
    public void testSetRoundingSingleArgNullDisables() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(ISO_UTC.minuteOfDay());
        mdt.setRounding((DateTimeField) null);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    // ---------------------------------------------------------------
    // setRounding(field, mode) - all branches of validation + ternary
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingModeTooLowThrows() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(ISO_UTC.minuteOfDay(), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingModeTooHighThrows() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(ISO_UTC.minuteOfDay(), MutableDateTime.ROUND_HALF_EVEN + 1);
    }

    @Test
    public void testSetRoundingFieldNullModeOutOfRangeDoesNotThrow() {
        // field == null -> first condition is false regardless of mode value, so no exception
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(null, 999);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingFieldNullModeFloor() {
        // field == null, mode != ROUND_NONE -> iRoundingField stays null (ternary false branch
        // picks "field" which is null); iRoundingMode forced to ROUND_NONE (field==null branch)
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(null, MutableDateTime.ROUND_FLOOR);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingFieldSetModeNone() {
        // field != null, mode == ROUND_NONE -> iRoundingField forced null (ternary true branch)
        // iRoundingMode = mode (field != null branch) = ROUND_NONE
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setRounding(ISO_UTC.minuteOfDay(), MutableDateTime.ROUND_NONE);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingFieldSetModeFloor() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.minuteOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_FLOOR);
        assertSame(field, mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
    }

    // ---------------------------------------------------------------
    // setMillis(long) switch-case branches (via setRounding + direct setMillis)
    // ---------------------------------------------------------------

    @Test
    public void testSetMillisRoundNone() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setMillis(12345L);
        assertEquals(12345L, mdt.getMillis());
    }

    @Test
    public void testSetMillisRoundFloor() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.minuteOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_FLOOR);
        long raw = new DateTime(2004, 6, 9, 10, 20, 45, 0, UTC).getMillis();
        mdt.setMillis(raw);
        assertEquals(field.roundFloor(raw), mdt.getMillis());
    }

    @Test
    public void testSetMillisRoundCeiling() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.minuteOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_CEILING);
        long raw = new DateTime(2004, 6, 9, 10, 20, 45, 0, UTC).getMillis();
        mdt.setMillis(raw);
        assertEquals(field.roundCeiling(raw), mdt.getMillis());
    }

    @Test
    public void testSetMillisRoundHalfFloor() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.secondOfMinute();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_FLOOR);
        long raw = new DateTime(2004, 6, 9, 10, 20, 30, 500, UTC).getMillis();
        mdt.setMillis(raw);
        assertEquals(field.roundHalfFloor(raw), mdt.getMillis());
    }

    @Test
    public void testSetMillisRoundHalfCeiling() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.secondOfMinute();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_CEILING);
        long raw = new DateTime(2004, 6, 9, 10, 20, 30, 500, UTC).getMillis();
        mdt.setMillis(raw);
        assertEquals(field.roundHalfCeiling(raw), mdt.getMillis());
    }

    @Test
    public void testSetMillisRoundHalfEven() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeField field = ISO_UTC.secondOfMinute();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_EVEN);
        long raw = new DateTime(2004, 6, 9, 10, 20, 30, 500, UTC).getMillis();
        mdt.setMillis(raw);
        assertEquals(field.roundHalfEven(raw), mdt.getMillis());
    }

    @Test
    public void testSetMillisReadableInstant() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        MutableDateTime other = new MutableDateTime(99999L, UTC);
        mdt.setMillis(other);
        assertEquals(99999L, mdt.getMillis());
    }

    @Test
    public void testSetMillisReadableInstantNullUsesNow() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setMillis((ReadableInstant) null); // DateTimeUtils.getInstantMillis(null) => now
        assertTrue(mdt.getMillis() != 0L);
    }

    // ---------------------------------------------------------------
    // add(long) / add(ReadableDuration[,scalar]) / add(ReadablePeriod[,scalar])
    // ---------------------------------------------------------------

    @Test
    public void testAddLong() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(500L);
        assertEquals(1500L, mdt.getMillis());
    }

    @Test(expected = ArithmeticException.class)
    public void testAddLongOverflowThrows() {
        MutableDateTime mdt = new MutableDateTime(Long.MAX_VALUE, UTC);
        mdt.add(1L);
    }

    @Test
    public void testAddDurationNullNoChange() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add((ReadableDuration) null);
        assertEquals(1000L, mdt.getMillis());
    }

    @Test
    public void testAddDurationNotNull() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(new Duration(500L));
        assertEquals(1500L, mdt.getMillis());
    }

    @Test
    public void testAddDurationWithScalar() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(new Duration(500L), 3);
        assertEquals(1000L + 500L * 3, mdt.getMillis());
    }

    @Test
    public void testAddDurationWithScalarNullNoChange() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add((ReadableDuration) null, 3);
        assertEquals(1000L, mdt.getMillis());
    }

    @Test
    public void testAddPeriodNullNoChange() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add((ReadablePeriod) null);
        assertEquals(2004, mdt.getYear());
    }

    @Test
    public void testAddPeriodNotNull() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(Period.years(1));
        assertEquals(2005, mdt.getYear());
    }

    @Test
    public void testAddPeriodWithScalar() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(Period.years(1), 2);
        assertEquals(2006, mdt.getYear());
    }

    @Test
    public void testAddPeriodWithScalarNullNoChange() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add((ReadablePeriod) null, 2);
        assertEquals(2004, mdt.getYear());
    }

    // ---------------------------------------------------------------
    // setChronology
    // ---------------------------------------------------------------

    @Test
    public void testSetChronology() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setChronology(ISO_UTC);
        assertEquals(ISO_UTC, mdt.getChronology());
    }

    @Test
    public void testSetChronologyNull() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setChronology(null);
        assertNotNull(mdt.getChronology());
    }

    // ---------------------------------------------------------------
    // setZone(zone) - branch: chrono.getZone() != newZone
    // ---------------------------------------------------------------

    @Test
    public void testSetZoneSameZoneNoChange() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        Chronology before = mdt.getChronology();
        mdt.setZone(UTC);
        assertSame(before, mdt.getChronology());
    }

    @Test
    public void testSetZoneDifferentZoneChanges() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTimeZone newZone = DateTimeZone.forOffsetHours(5);
        mdt.setZone(newZone);
        assertEquals(newZone, mdt.getZone());
    }

    @Test
    public void testSetZoneNullUsesDefault() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setZone(null);
        assertNotNull(mdt.getZone());
    }

    // ---------------------------------------------------------------
    // setZoneRetainFields(zone) - branch: newZone == originalZone -> return
    // ---------------------------------------------------------------

    @Test
    public void testSetZoneRetainFieldsSameZoneReturnsEarly() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        long before = mdt.getMillis();
        mdt.setZoneRetainFields(UTC);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testSetZoneRetainFieldsDifferentZoneKeepsLocalFields() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        DateTimeZone newZone = DateTimeZone.forOffsetHours(5);
        mdt.setZoneRetainFields(newZone);
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(newZone, mdt.getZone());
    }

    // ---------------------------------------------------------------
    // set(DateTimeFieldType,int) / add(DurationFieldType,int)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetFieldTypeNullThrows() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.set((DateTimeFieldType) null, 5);
    }

    @Test
    public void testSetFieldType() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.set(DateTimeFieldType.year(), 1999);
        assertEquals(1999, mdt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDurationFieldTypeNullThrows() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.add((DurationFieldType) null, 5);
    }

    @Test
    public void testAddDurationFieldType() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(DurationFieldType.years(), 1);
        assertEquals(2005, mdt.getYear());
    }

    // ---------------------------------------------------------------
    // Simple setters / adders for individual fields
    // ---------------------------------------------------------------

    @Test
    public void testSimpleFieldSettersAndAdders() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);

        mdt.setYear(2000);
        assertEquals(2000, mdt.getYear());
        mdt.addYears(1);
        assertEquals(2001, mdt.getYear());

        mdt.setWeekyear(1999);
        assertEquals(1999, mdt.weekyear().get());
        mdt.addWeekyears(1);
        assertEquals(2000, mdt.weekyear().get());

        mdt.setMonthOfYear(3);
        assertEquals(3, mdt.getMonthOfYear());
        mdt.addMonths(1);
        assertEquals(4, mdt.getMonthOfYear());

        mdt.setWeekOfWeekyear(10);
        assertEquals(10, mdt.getWeekOfWeekyear());
        mdt.addWeeks(1);
        assertEquals(11, mdt.getWeekOfWeekyear());

        mdt.setDayOfYear(100);
        assertEquals(100, mdt.getDayOfYear());

        mdt.setDayOfMonth(15);
        assertEquals(15, mdt.getDayOfMonth());

        mdt.setDayOfWeek(DateTimeConstants.MONDAY);
        assertEquals(DateTimeConstants.MONDAY, mdt.getDayOfWeek());

        mdt.addDays(1);
        assertEquals(DateTimeConstants.TUESDAY, mdt.getDayOfWeek());

        mdt.setHourOfDay(5);
        assertEquals(5, mdt.getHourOfDay());
        mdt.addHours(1);
        assertEquals(6, mdt.getHourOfDay());

        mdt.setMinuteOfDay(100);
        assertEquals(100, mdt.getMinuteOfDay());

        mdt.setMinuteOfHour(15);
        assertEquals(15, mdt.getMinuteOfHour());
        mdt.addMinutes(1);
        assertEquals(16, mdt.getMinuteOfHour());

        mdt.setSecondOfDay(100);
        assertEquals(100, mdt.getSecondOfDay());

        mdt.setSecondOfMinute(10);
        assertEquals(10, mdt.getSecondOfMinute());
        mdt.addSeconds(1);
        assertEquals(11, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(100);
        assertEquals(100, mdt.getMillisOfDay());

        mdt.setMillisOfSecond(10);
        assertEquals(10, mdt.getMillisOfSecond());
        mdt.addMillis(1);
        assertEquals(11, mdt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDayOfMonthInvalidThrows() {
        MutableDateTime mdt = new MutableDateTime(2004, 2, 1, 0, 0, 0, 0, UTC);
        mdt.setDayOfMonth(40); // out-of-range boundary
    }

    // ---------------------------------------------------------------
    // setDate(...)
    // ---------------------------------------------------------------

    @Test
    public void testSetDateLong() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        long newDateMillis = new MutableDateTime(2010, 5, 5, 0, 0, 0, 0, UTC).getMillis();
        mdt.setDate(newDateMillis);
        assertEquals(2010, mdt.getYear());
        assertEquals(10, mdt.getHourOfDay()); // time part unaffected
    }

    @Test
    public void testSetDateReadableInstantNotDateTime() {
        // org.joda.time.Instant does NOT implement ReadableDateTime -> false branch
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        Instant instant = new Instant(0L);
        mdt.setDate(instant);
        assertEquals(1970, mdt.getYear());
        assertEquals(10, mdt.getHourOfDay());
    }

    @Test
    public void testSetDateReadableInstantIsDateTime() {
        // DateTime IS ReadableDateTime -> true branch; its chronology zone != null branch
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        DateTime other = new DateTime(2012, 3, 3, 0, 0, 0, 0, DateTimeZone.forOffsetHours(5));
        mdt.setDate(other);
        assertEquals(10, mdt.getHourOfDay()); // time part unaffected
    }

    @Test
    public void testSetDateFields() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        mdt.setDate(2011, 7, 20);
        assertEquals(2011, mdt.getYear());
        assertEquals(7, mdt.getMonthOfYear());
        assertEquals(20, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
    }

    // ---------------------------------------------------------------
    // setTime(...)
    // ---------------------------------------------------------------

    @Test
    public void testSetTimeLong() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        long newTimeMillis = new MutableDateTime(1970, 1, 1, 5, 6, 7, 0, UTC).getMillis();
        mdt.setTime(newTimeMillis);
        assertEquals(2004, mdt.getYear()); // date part unaffected
        assertEquals(5, mdt.getHourOfDay());
    }

    @Test
    public void testSetTimeReadableInstant() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        DateTime other = new DateTime(1970, 1, 1, 8, 9, 10, 0, DateTimeZone.forOffsetHours(2));
        mdt.setTime(other);
        assertEquals(2004, mdt.getYear()); // date part unaffected
    }

    @Test
    public void testSetTimeFields() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 10, 20, 30, 0, UTC);
        mdt.setTime(5, 6, 7, 8);
        assertEquals(5, mdt.getHourOfDay());
        assertEquals(6, mdt.getMinuteOfHour());
        assertEquals(7, mdt.getSecondOfMinute());
        assertEquals(8, mdt.getMillisOfSecond());
        assertEquals(2004, mdt.getYear());
    }

    // ---------------------------------------------------------------
    // setDateTime(...)
    // ---------------------------------------------------------------

    @Test
    public void testSetDateTime() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setDateTime(2004, 6, 9, 10, 20, 30, 500);
        assertEquals(2004, mdt.getYear());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    // ---------------------------------------------------------------
    // property(DateTimeFieldType)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyNullTypeThrows() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.property(null);
    }

    @Test
    public void testPropertyValid() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        MutableDateTime.Property p = mdt.property(DateTimeFieldType.year());
        assertEquals(2004, p.get());
    }

    // ---------------------------------------------------------------
    // Field accessor properties (era..dayOfWeek, hourOfDay..millisOfSecond)
    // ---------------------------------------------------------------

    @Test
    public void testDateFieldProperties() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        assertNotNull(mdt.era());
        assertNotNull(mdt.centuryOfEra());
        assertNotNull(mdt.yearOfCentury());
        assertNotNull(mdt.yearOfEra());
        assertEquals(2004, mdt.year().get());
        assertNotNull(mdt.weekyear());
        assertEquals(6, mdt.monthOfYear().get());
        assertNotNull(mdt.weekOfWeekyear());
        assertNotNull(mdt.dayOfYear());
        assertEquals(9, mdt.dayOfMonth().get());
        assertNotNull(mdt.dayOfWeek());
    }

    @Test
    public void testTimeFieldProperties() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        assertEquals(10, mdt.hourOfDay().get());
        assertNotNull(mdt.minuteOfDay());
        assertEquals(20, mdt.minuteOfHour().get());
        assertNotNull(mdt.secondOfDay());
        assertEquals(30, mdt.secondOfMinute().get());
        assertNotNull(mdt.millisOfDay());
        assertEquals(500, mdt.millisOfSecond().get());
    }

    // ---------------------------------------------------------------
    // copy() / clone() / toString()
    // ---------------------------------------------------------------

    @Test
    public void testCopy() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        MutableDateTime copy = mdt.copy();
        assertEquals(mdt.getMillis(), copy.getMillis());
        assertNotSame(mdt, copy);
    }

    @Test
    public void testClone() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        Object clone = mdt.clone();
        assertTrue(clone instanceof MutableDateTime);
        assertEquals(mdt.getMillis(), ((MutableDateTime) clone).getMillis());
    }

    @Test
    public void testToString() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        String s = mdt.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("2004-06-09T10:20:30.500"));
    }

    // ---------------------------------------------------------------
    // Property inner class - add/set/round methods
    // ---------------------------------------------------------------

    @Test
    public void testPropertyGetFieldAndGetMutableDateTime() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        MutableDateTime.Property p = mdt.year();
        assertNotNull(p.getField());
        assertSame(mdt, p.getMutableDateTime());
    }

    @Test
    public void testPropertyAddInt() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        MutableDateTime result = mdt.year().add(1);
        assertSame(mdt, result);
        assertEquals(2005, mdt.getYear());
    }

    @Test
    public void testPropertyAddLong() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        MutableDateTime result = mdt.year().add(1L);
        assertSame(mdt, result);
        assertEquals(2005, mdt.getYear());
    }

    @Test
    public void testPropertyAddWrapField() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.monthOfYear().addWrapField(1); // wraps within month field (1..12)
        assertEquals(2, mdt.getMonthOfYear());
        assertEquals(2004, mdt.getYear());
    }

    @Test
    public void testPropertySetInt() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.monthOfYear().set(5);
        assertEquals(5, mdt.getMonthOfYear());
    }

    @Test
    public void testPropertySetTextWithLocale() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.monthOfYear().set("February", Locale.ENGLISH);
        assertEquals(2, mdt.getMonthOfYear());
    }

    @Test
    public void testPropertySetTextDefaultLocale() {
        // Covers set(String) -> delegates to set(text, null)
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.monthOfYear().set("March");
        assertEquals(3, mdt.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertySetTextInvalidThrows() {
        MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        mdt.monthOfYear().set("NotAMonth");
    }

    @Test
    public void testPropertyRoundFloor() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 700, UTC);
        mdt.secondOfMinute().roundFloor();
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertyRoundCeiling() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 700, UTC);
        mdt.secondOfMinute().roundCeiling();
        assertEquals(31, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertyRoundHalfFloorAtExactHalf() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        mdt.secondOfMinute().roundHalfFloor();
        assertEquals(30, mdt.getSecondOfMinute()); // favors floor at exact half
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertyRoundHalfCeilingAtExactHalf() {
        MutableDateTime mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 500, UTC);
        mdt.secondOfMinute().roundHalfCeiling();
        assertEquals(31, mdt.getSecondOfMinute()); // favors ceiling at exact half
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertyRoundHalfEvenFavorsEven() {
        // second=10 (even) with exact half millis -> stays floor (already even)
        MutableDateTime mdtEven = new MutableDateTime(2004, 6, 9, 10, 20, 10, 500, UTC);
        mdtEven.secondOfMinute().roundHalfEven();
        assertEquals(10, mdtEven.getSecondOfMinute());

        // second=11 (odd) with exact half millis -> rounds up to 12 (even)
        MutableDateTime mdtOdd = new MutableDateTime(2004, 6, 9, 10, 20, 11, 500, UTC);
        mdtOdd.secondOfMinute().roundHalfEven();
        assertEquals(12, mdtOdd.getSecondOfMinute());
    }
}
