package org.joda.time.chrono;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.TimeOfDay;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZonedChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone OFFSET_PLUS_2 = DateTimeZone.forOffsetHours(2);

    private DateTimeZone originalDefaultZone;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
    }

    // =========================================================================
    // Factory & Validation Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_NullBase_ThrowsException() {
        ZonedChronology.getInstance(null, PARIS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_NullZone_ThrowsException() {
        ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_NullUtcBase_ThrowsException() {
        Chronology nullUtcChrono = new BaseChronology() {
            private static final long serialVersionUID = 1L;
            @Override
            public DateTimeZone getZone() { return DateTimeZone.UTC; }
            @Override
            public Chronology withUTC() { return null; }
            @Override
            public Chronology withZone(DateTimeZone zone) { return this; }
            @Override
            public String toString() { return "NullUTC"; }
        };
        ZonedChronology.getInstance(nullUtcChrono, PARIS);
    }

    @Test
    public void testGetInstance_Valid() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        assertEquals(PARIS, chrono.getZone());
        assertEquals(ISOChronology.getInstanceUTC(), chrono.withUTC());
    }

    // =========================================================================
    // withZone & withUTC Tests
    // =========================================================================

    @Test
    public void testWithZone_Null_DefaultsToCurrentZone() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        Chronology result = chrono.withZone(null);
        assertEquals(LONDON, result.getZone());
    }

    @Test
    public void testWithZone_SameZone_ReturnsSameInstance() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        assertSame(chrono, chrono.withZone(PARIS));
    }

    @Test
    public void testWithZone_UtcZone_ReturnsBase() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        assertSame(ISOChronology.getInstanceUTC(), chrono.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testWithZone_DifferentZone_ReturnsNewZonedChronology() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        Chronology result = chrono.withZone(NEW_YORK);
        assertEquals(NEW_YORK, result.getZone());
        assertFalse(chrono.equals(result));
    }

    // =========================================================================
    // getDateTimeMillis Tests
    // =========================================================================

    @Test
    public void testGetDateTimeMillis_4Args() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        // 2020-01-01 02:00:00.000 in +02:00 = 2020-01-01 00:00:00.000 UTC
        int millisOfDay = 2 * 3600 * 1000;
        long millis = chrono.getDateTimeMillis(2020, 1, 1, millisOfDay);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0);
        assertEquals(expected, millis);
    }

    @Test
    public void testGetDateTimeMillis_7Args() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        long millis = chrono.getDateTimeMillis(2020, 1, 1, 2, 30, 15, 500);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0, 30, 15, 500);
        assertEquals(expected, millis);
    }

    @Test
    public void testGetDateTimeMillis_InstantAnd4Args() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        long baseInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0);
        long millis = chrono.getDateTimeMillis(baseInstant, 3, 10, 20, 100);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 1, 10, 20, 100);
        assertEquals(expected, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_DstGapTransition_ThrowsException() {
        // Paris DST gap on 2021-03-28: clocks spring forward from 02:00 to 03:00 (02:30 does not exist)
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        chrono.getDateTimeMillis(2021, 3, 28, 2, 30, 0, 0);
    }

    // =========================================================================
    // equals, hashCode, toString Tests
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        ZonedChronology c1 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        ZonedChronology c2 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        ZonedChronology c3 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), LONDON);
        ZonedChronology c4 = ZonedChronology.getInstance(GJChronology.getInstanceUTC(), PARIS);

        assertTrue(c1.equals(c1));
        assertTrue(c1.equals(c2));
        assertEquals(c1.hashCode(), c2.hashCode());

        assertFalse(c1.equals(null));
        assertFalse(c1.equals("NotAChronology"));
        assertFalse(c1.equals(c3));
        assertFalse(c1.equals(c4));

        assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", c1.toString());
    }

    // =========================================================================
    // useTimeArithmetic Boundary & Assemble Cache Tests
    // =========================================================================

    @Test
    public void testUseTimeArithmetic() {
        assertFalse(ZonedChronology.useTimeArithmetic(null));
        assertFalse(ZonedChronology.useTimeArithmetic(ISOChronology.getInstanceUTC().days()));
        assertTrue(ZonedChronology.useTimeArithmetic(ISOChronology.getInstanceUTC().hours()));
        assertTrue(ZonedChronology.useTimeArithmetic(ISOChronology.getInstanceUTC().minutes()));
        assertTrue(ZonedChronology.useTimeArithmetic(ISOChronology.getInstanceUTC().millis()));
    }

    @Test
    public void testAssemble_HandlesUnsupportedFields() {
        // Chronology with unsupported fields to hit `field == null || !field.isSupported()`
        Chronology sparseChrono = new AssembledChronology(ISOChronology.getInstanceUTC(), null) {
            private static final long serialVersionUID = 1L;
            @Override
            protected void assemble(Fields fields) {
                fields.dayOfMonth = UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), UnsupportedDurationField.getInstance(DurationFieldType.days()));
                fields.days = UnsupportedDurationField.getInstance(DurationFieldType.days());
            }
            @Override
            public Chronology withUTC() { return this; }
            @Override
            public Chronology withZone(DateTimeZone zone) { return this; }
            @Override
            public String toString() { return "SparseChrono"; }
        };

        ZonedChronology zoned = ZonedChronology.getInstance(sparseChrono, PARIS);
        assertFalse(zoned.dayOfMonth().isSupported());
        assertFalse(zoned.days().isSupported());
    }

    // =========================================================================
    // ZonedDurationField Operations
    // =========================================================================

    @Test
    public void testZonedDurationField_Operations() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DurationField hours = chrono.hours();
        DurationField days = chrono.days();

        assertTrue(hours.isPrecise());
        assertFalse(days.isPrecise()); // Non-fixed zone makes imprecise

        ZonedChronology fixedChrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        assertTrue(fixedChrono.days().isPrecise());

        long instant = chrono.getDateTimeMillis(2020, 1, 1, 12, 0, 0, 0);

        assertEquals(2, hours.getValue(2 * 3600 * 1000L, instant));
        assertEquals(2L, hours.getValueAsLong(2 * 3600 * 1000L, instant));
        assertEquals(2 * 3600 * 1000L, hours.getMillis(2, instant));
        assertEquals(2 * 3600 * 1000L, hours.getMillis(2L, instant));

        // add int & long
        long addedHours = hours.add(instant, 5);
        assertEquals(chrono.getDateTimeMillis(2020, 1, 1, 17, 0, 0, 0), addedHours);
        long addedHoursLong = hours.add(instant, 5L);
        assertEquals(chrono.getDateTimeMillis(2020, 1, 1, 17, 0, 0, 0), addedHoursLong);

        long addedDays = days.add(instant, 2);
        assertEquals(chrono.getDateTimeMillis(2020, 1, 3, 12, 0, 0, 0), addedDays);
        long addedDaysLong = days.add(instant, 2L);
        assertEquals(chrono.getDateTimeMillis(2020, 1, 3, 12, 0, 0, 0), addedDaysLong);

        // difference
        long laterInstant = chrono.getDateTimeMillis(2020, 1, 1, 15, 0, 0, 0);
        assertEquals(3, hours.getDifference(laterInstant, instant));
        assertEquals(3L, hours.getDifferenceAsLong(laterInstant, instant));
        assertEquals(0, days.getDifference(laterInstant, instant));
        assertEquals(0L, days.getDifferenceAsLong(laterInstant, instant));
    }

    @Test(expected = ArithmeticException.class)
    public void testZonedDurationField_AddOffsetOverflow_ThrowsException() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        chrono.hours().add(Long.MAX_VALUE - 10, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testZonedDurationField_SubtractOffsetOverflow_ThrowsException() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), OFFSET_PLUS_2);
        chrono.days().add(Long.MIN_VALUE + 10, -1);
    }

    // =========================================================================
    // ZonedDateTimeField Operations & Boundaries
    // =========================================================================

    @Test
    public void testZonedDateTimeField_GetAndText() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField monthField = chrono.monthOfYear();
        DateTimeField hourField = chrono.hourOfDay();

        long instant = chrono.getDateTimeMillis(2020, 6, 15, 14, 30, 0, 0);

        assertEquals(6, monthField.get(instant));
        assertEquals("June", monthField.getAsText(instant, Locale.ENGLISH));
        assertEquals("Jun", monthField.getAsShortText(instant, Locale.ENGLISH));
        assertEquals("June", monthField.getAsText(6, Locale.ENGLISH));
        assertEquals("Jun", monthField.getAsShortText(6, Locale.ENGLISH));

        assertFalse(monthField.isLenient());
        assertNotNull(monthField.getDurationField());
        assertNotNull(monthField.getRangeDurationField());
        assertNotNull(monthField.getLeapDurationField());

        assertEquals(14, hourField.get(instant));
    }

    @Test
    public void testZonedDateTimeField_AddAndWrap() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField hourField = chrono.hourOfDay();
        DateTimeField dayField = chrono.dayOfMonth();

        long instant = chrono.getDateTimeMillis(2020, 1, 1, 22, 0, 0, 0);

        // Time field add & addWrapField
        long addedHour = hourField.add(instant, 3);
        assertEquals(1, hourField.get(addedHour));
        long wrappedHour = hourField.addWrapField(instant, 3);
        assertEquals(1, hourField.get(wrappedHour));
        long addedHourLong = hourField.add(instant, 3L);
        assertEquals(1, hourField.get(addedHourLong));

        // Date field add & addWrapField
        long addedDay = dayField.add(instant, 5);
        assertEquals(6, dayField.get(addedDay));
        long addedDayLong = dayField.add(instant, 5L);
        assertEquals(6, dayField.get(addedDayLong));
        long wrappedDay = dayField.addWrapField(instant, 31);
        assertEquals(1, dayField.get(wrappedDay));
    }

    @Test
    public void testZonedDateTimeField_SetOperations() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField dayField = chrono.dayOfMonth();
        long instant = chrono.getDateTimeMillis(2020, 1, 1, 12, 0, 0, 0);

        long result = dayField.set(instant, 15);
        assertEquals(15, dayField.get(result));

        long textResult = dayField.set(instant, "20", Locale.ENGLISH);
        assertEquals(20, dayField.get(textResult));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testZonedDateTimeField_SetIntoDstGap_ThrowsException() {
        // Paris jumps from 02:00 to 03:00 on 2021-03-28
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        long instant = chrono.getDateTimeMillis(2021, 3, 28, 1, 30, 0, 0);
        chrono.hourOfDay().set(instant, 2);
    }

    @Test
    public void testZonedDateTimeField_Leap_Rounding_Remainders() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField yearField = chrono.year();
        DateTimeField hourField = chrono.hourOfDay();
        DateTimeField dayField = chrono.dayOfMonth();

        long leapInstant = chrono.getDateTimeMillis(2020, 2, 1, 0, 0, 0, 0);
        long nonLeapInstant = chrono.getDateTimeMillis(2019, 2, 1, 0, 0, 0, 0);

        assertTrue(yearField.isLeap(leapInstant));
        assertFalse(yearField.isLeap(nonLeapInstant));
        assertEquals(1, yearField.getLeapAmount(leapInstant));
        assertEquals(0, yearField.getLeapAmount(nonLeapInstant));

        long instant = chrono.getDateTimeMillis(2020, 5, 10, 14, 45, 30, 500);

        // Time field rounding
        long floorHour = hourField.roundFloor(instant);
        assertEquals(chrono.getDateTimeMillis(2020, 5, 10, 14, 0, 0, 0), floorHour);
        long ceilHour = hourField.roundCeiling(instant);
        assertEquals(chrono.getDateTimeMillis(2020, 5, 10, 15, 0, 0, 0), ceilHour);

        // Date field rounding
        long floorDay = dayField.roundFloor(instant);
        assertEquals(chrono.getDateTimeMillis(2020, 5, 10, 0, 0, 0, 0), floorDay);
        long ceilDay = dayField.roundCeiling(instant);
        assertEquals(chrono.getDateTimeMillis(2020, 5, 11, 0, 0, 0, 0), ceilDay);

        // Remainder
        long rem = hourField.remainder(instant);
        assertEquals(45 * 60 * 1000 + 30 * 1000 + 500, rem);
    }

    @Test
    public void testZonedDateTimeField_MinMaxValues() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField dayField = chrono.dayOfMonth();
        long instant = chrono.getDateTimeMillis(2020, 2, 1, 0, 0, 0, 0);

        assertEquals(1, dayField.getMinimumValue());
        assertEquals(1, dayField.getMinimumValue(instant));
        assertEquals(1, dayField.getMinimumValue(new TimeOfDay(12, 0)));
        assertEquals(1, dayField.getMinimumValue(new TimeOfDay(12, 0), new int[]{12, 0}));

        assertEquals(31, dayField.getMaximumValue());
        assertEquals(29, dayField.getMaximumValue(instant)); // Leap year February
        assertEquals(31, dayField.getMaximumValue(new TimeOfDay(12, 0)));
        assertEquals(31, dayField.getMaximumValue(new TimeOfDay(12, 0), new int[]{12, 0}));

        assertTrue(dayField.getMaximumTextLength(Locale.ENGLISH) > 0);
        assertTrue(dayField.getMaximumShortTextLength(Locale.ENGLISH) > 0);
    }

    @Test
    public void testZonedDateTimeField_Differences() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField hourField = chrono.hourOfDay();
        DateTimeField dayField = chrono.dayOfMonth();

        long instant1 = chrono.getDateTimeMillis(2020, 1, 1, 10, 0, 0, 0);
        long instant2 = chrono.getDateTimeMillis(2020, 1, 2, 14, 0, 0, 0);

        assertEquals(28, hourField.getDifference(instant2, instant1));
        assertEquals(28L, hourField.getDifferenceAsLong(instant2, instant1));
        assertEquals(1, dayField.getDifference(instant2, instant1));
        assertEquals(1L, dayField.getDifferenceAsLong(instant2, instant1));
    }
}