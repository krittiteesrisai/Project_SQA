package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 Test Suite for GJChronology.
 * Focuses on Branch/Condition Coverage and Edge Cases (Defects4J Time-18).
 */
public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
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

    // =========================================================================
    // 1. Factory & Instance Resolution Tests
    // =========================================================================

    @Test
    public void testFactory_getInstanceUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(UTC, chrono.getZone());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertSame(chrono, GJChronology.getInstanceUTC()); // Cache verification
    }

    @Test
    public void testFactory_getInstanceDefault() {
        GJChronology chrono = GJChronology.getInstance();
        assertEquals(LONDON, chrono.getZone());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testFactory_getInstanceWithNullZone() {
        GJChronology chrono = GJChronology.getInstance(null);
        assertEquals(LONDON, chrono.getZone());
    }

    @Test
    public void testFactory_getInstanceWithZoneAndCutover() {
        Instant customCutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(PARIS, customCutover);
        assertEquals(PARIS, chrono.getZone());
        assertEquals(customCutover, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());

        // Null cutover uses DEFAULT_CUTOVER
        GJChronology chronoDef = GJChronology.getInstance(PARIS, (Instant) null);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chronoDef.getGregorianCutover());
    }

    @Test
    public void testFactory_getInstanceWithLongCutover() {
        long defaultMillis = GJChronology.DEFAULT_CUTOVER.getMillis();
        GJChronology chronoDefault = GJChronology.getInstance(UTC, defaultMillis, 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chronoDefault.getGregorianCutover());

        long customMillis = 10000000000L;
        GJChronology chronoCustom = GJChronology.getInstance(UTC, customMillis, 4);
        assertEquals(new Instant(customMillis), chronoCustom.getGregorianCutover());
    }

    @Test
    public void testFactory_cacheHitAndMiss() {
        Instant cutover1 = new Instant(1000L);
        GJChronology c1 = GJChronology.getInstance(PARIS, cutover1, 3);
        GJChronology c2 = GJChronology.getInstance(PARIS, cutover1, 3);
        assertSame(c1, c2); // Cache hit

        GJChronology c3 = GJChronology.getInstance(PARIS, cutover1, 4);
        assertNotSame(c1, c3); // Different min days
    }

    // =========================================================================
    // 2. Zone Conversion and Properties Tests
    // =========================================================================

    @Test
    public void testWithZoneAndWithUTC() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology utcChrono = chrono.withUTC();
        assertEquals(UTC, utcChrono.getZone());

        Chronology sameChrono = chrono.withZone(PARIS);
        assertSame(chrono, sameChrono);

        Chronology defaultChrono = chrono.withZone(null);
        assertEquals(LONDON, defaultChrono.getZone());
    }

    @Test
    public void testToStringFormatting() {
        GJChronology defaultChrono = GJChronology.getInstanceUTC();
        assertEquals("GJChronology[UTC]", defaultChrono.toString());

        // Custom cutover (exact date midnight)
        Instant cutoverDate = new Instant(0L); // 1970-01-01
        GJChronology customDateChrono = GJChronology.getInstance(UTC, cutoverDate, 4);
        assertTrue(customDateChrono.toString().contains("cutover=1970-01-01"));

        // Custom cutover with time-of-day
        Instant cutoverDateTime = new Instant(3600000L); // 1970-01-01T01:00:00.000Z
        GJChronology customDateTimeChrono = GJChronology.getInstance(UTC, cutoverDateTime, 5);
        assertTrue(customDateTimeChrono.toString().contains("mdfw=5"));
        assertTrue(customDateTimeChrono.toString().contains("cutover="));
    }

    @Test
    public void testEqualsAndHashCode() {
        GJChronology c1 = GJChronology.getInstance(PARIS, new Instant(100L), 4);
        GJChronology c2 = GJChronology.getInstance(PARIS, new Instant(100L), 4);
        GJChronology c3 = GJChronology.getInstance(LONDON, new Instant(100L), 4);

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
        assertFalse(c1.equals(c3));
        assertFalse(c1.equals("NotAChronology"));
        assertFalse(c1.equals(null));
    }

    // =========================================================================
    // 3. getDateTimeMillis & Cutover Boundary / Leap Year Tests (Defects4J Time-18)
    // =========================================================================

    @Test
    public void testGetDateTimeMillis_ValidGregorianAndJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        // 1. Post-Cutover Gregorian Date
        long postCutover = chrono.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(GJChronology.DEFAULT_CUTOVER.getMillis(), postCutover);

        // 2. Pre-Cutover Julian Date (1582-10-04 is 1 day before cutover)
        long preCutover = chrono.getDateTimeMillis(1582, 10, 4, 0);
        assertEquals(GJChronology.DEFAULT_CUTOVER.getMillis() - DateTimeConstants.MILLIS_PER_DAY, preCutover);

        // 3. With 7 parameters
        long fullParams = chrono.getDateTimeMillis(1582, 10, 15, 12, 30, 45, 500);
        assertEquals(postCutover + (12 * 3600 + 30 * 60 + 45) * 1000L + 500L, fullParams);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_CutoverGapDate_ThrowsException_4Params() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // Dates between 1582-10-05 and 1582-10-14 do not exist in default cutover
        chrono.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_CutoverGapDate_ThrowsException_7Params() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 14, 23, 59, 59, 999);
    }

    @Test
    public void testGetDateTimeMillis_JulianLeapYearBeforeCutover_Time18() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Year 1500 is a leap year in Julian calendar (divisible by 4),
        // but NOT in Gregorian (divisible by 100 and not 400).
        // GJChronology must correctly accept Feb 29, 1500 as Julian!
        long millis1500 = chrono.getDateTimeMillis(1500, 2, 29, 0);
        assertEquals(1500, chrono.year().get(millis1500));
        assertEquals(2, chrono.monthOfYear().get(millis1500));
        assertEquals(29, chrono.dayOfMonth().get(millis1500));

        // Year 900 is also a Julian leap year
        long millis900 = chrono.getDateTimeMillis(900, 2, 29, 10, 0, 0, 0);
        assertEquals(900, chrono.year().get(millis900));
        assertEquals(2, chrono.monthOfYear().get(millis900));
        assertEquals(29, chrono.dayOfMonth().get(millis900));
    }

    @Test
    public void testGetDateTimeMillis_ZonedChronologyDelegation() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        long millis = chrono.getDateTimeMillis(2020, 1, 1, 0);
        assertTrue(millis > 0L);

        long millis7 = chrono.getDateTimeMillis(2020, 1, 1, 1, 2, 3, 4);
        assertTrue(millis7 > 0L);
    }

    // =========================================================================
    // 4. Cutover Field Add, Set, and Difference Operations
    // =========================================================================

    @Test
    public void testCutoverField_AddAndCrossCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        // 1. Add days starting before cutover and crossing to Gregorian
        long julianDate = chrono.getDateTimeMillis(1582, 10, 4, 0);
        long crossed = chrono.dayOfMonth().add(julianDate, 1);
        assertEquals(chrono.getDateTimeMillis(1582, 10, 15, 0), crossed);

        // 2. Subtract days starting after cutover and crossing to Julian
        long gregorianDate = chrono.getDateTimeMillis(1582, 10, 15, 0);
        long crossedBack = chrono.dayOfMonth().add(gregorianDate, -1);
        assertEquals(julianDate, crossedBack);
    }

    @Test
    public void testImpreciseCutoverField_AddYearsAndMonths() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Start in 1581 (Julian) and add 2 years -> 1583 (Gregorian)
        long start = chrono.getDateTimeMillis(1581, 1, 1, 0);
        long resultYears = chrono.years().add(start, 2);
        assertEquals(1583, chrono.year().get(resultYears));

        // Start in 1583 (Gregorian) and subtract 2 years -> 1581 (Julian)
        long resultYearsBack = chrono.years().add(resultYears, -2L);
        assertEquals(1581, chrono.year().get(resultYearsBack));

        // Add months crossing cutover
        long startMonth = chrono.getDateTimeMillis(1582, 9, 1, 0);
        long resultMonths = chrono.months().add(startMonth, 2);
        assertEquals(11, chrono.monthOfYear().get(resultMonths));
        assertEquals(1582, chrono.year().get(resultMonths));
    }

    @Test
    public void testCutoverField_GetDifferenceAcrossCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        long beforeCutover = chrono.getDateTimeMillis(1582, 10, 4, 0);
        long afterCutover = chrono.getDateTimeMillis(1582, 10, 15, 0);

        // 1582-10-15 is the very next day after 1582-10-04 in GJ
        int diffDays = chrono.days().getDifference(afterCutover, beforeCutover);
        assertEquals(1, diffDays);

        int diffDaysNeg = chrono.days().getDifference(beforeCutover, afterCutover);
        assertEquals(-1, diffDaysNeg);

        // Difference in years crossing cutover
        long julian1500 = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long greg2000 = chrono.getDateTimeMillis(2000, 1, 1, 0);

        assertEquals(500, chrono.years().getDifference(greg2000, julian1500));
        assertEquals(500L, chrono.years().getDifferenceAsLong(greg2000, julian1500));
        assertEquals(-500, chrono.years().getDifference(julian1500, greg2000));
        assertEquals(-500L, chrono.years().getDifferenceAsLong(julian1500, greg2000));
    }

    @Test
    public void testCutoverField_SetValidAndInvalid() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        long instant = chrono.getDateTimeMillis(1582, 1, 1, 0);
        long modified = chrono.year().set(instant, 1583);
        assertEquals(1583, chrono.year().get(modified));

        // Set with text and locale
        long modifiedText = chrono.monthOfYear().set(instant, "February", Locale.UK);
        assertEquals(2, chrono.monthOfYear().get(modifiedText));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testCutoverField_SetDayInCutoverGap_ThrowsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.getDateTimeMillis(1582, 10, 15, 0);
        // Setting day to 5 in October 1582 must fail as it's within the cutover gap
        chrono.dayOfMonth().set(instant, 5);
    }

    // =========================================================================
    // 5. Boundary Values, Rounding, Partial, and Leap Calculations
    // =========================================================================

    @Test
    public void testMinMaxValuesAroundCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        long cutoverInstant = chrono.getGregorianCutover().getMillis();
        long justBeforeCutover = cutoverInstant - 1000L;

        assertTrue(chrono.dayOfMonth().getMinimumValue() >= 1);
        assertTrue(chrono.dayOfMonth().getMaximumValue() <= 31);

        int minDayCutover = chrono.dayOfMonth().getMinimumValue(cutoverInstant);
        int maxDayBefore = chrono.dayOfMonth().getMaximumValue(justBeforeCutover);
        assertTrue(minDayCutover >= 1);
        assertTrue(maxDayBefore >= 1);

        // Maximum value with Partial
        YearMonthDay ymd = new YearMonthDay(1582, 10, 4, chrono);
        int maxPartial = chrono.dayOfMonth().getMaximumValue(ymd);
        assertTrue(maxPartial >= 4);

        int[] values = new int[] {1582, 10, 4};
        int maxPartialVals = chrono.dayOfMonth().getMaximumValue(ymd, values);
        assertTrue(maxPartialVals >= 4);
    }

    @Test
    public void testRoundFloorAndCeiling() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        long cutoverInstant = chrono.getGregorianCutover().getMillis();
        long beforeCutover = cutoverInstant - 100000L;
        long afterCutover = cutoverInstant + 100000L;

        long floorBefore = chrono.dayOfYear().roundFloor(beforeCutover);
        long ceilingBefore = chrono.dayOfYear().roundCeiling(beforeCutover);
        assertTrue(floorBefore <= beforeCutover);
        assertTrue(ceilingBefore >= beforeCutover);

        long floorAfter = chrono.dayOfYear().roundFloor(afterCutover);
        long ceilingAfter = chrono.dayOfYear().roundCeiling(afterCutover);
        assertTrue(floorAfter <= afterCutover);
        assertTrue(ceilingAfter >= afterCutover);
    }

    @Test
    public void testLeapFields() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        // 1500 was Julian leap year
        long julian1500Leap = chrono.getDateTimeMillis(1500, 2, 28, 0);
        assertTrue(chrono.year().isLeap(julian1500Leap));
        assertEquals(1, chrono.year().getLeapAmount(julian1500Leap));
        assertNotNull(chrono.year().getLeapDurationField());

        // 1900 was NOT Gregorian leap year
        long greg1900 = chrono.getDateTimeMillis(1900, 2, 28, 0);
        assertFalse(chrono.year().isLeap(greg1900));
        assertEquals(0, chrono.year().getLeapAmount(greg1900));

        // 2000 WAS Gregorian leap year
        long greg2000 = chrono.getDateTimeMillis(2000, 2, 28, 0);
        assertTrue(chrono.year().isLeap(greg2000));
    }

    @Test
    public void testPartialAddWithCutoverField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        LocalDate date = new LocalDate(1582, 10, 4, chrono);

        // Add 0
        LocalDate same = date.plusDays(0);
        assertSame(date, same);

        // Add across cutover in Partial
        LocalDate nextDay = date.plusDays(1);
        assertEquals(1582, nextDay.getYear());
        assertEquals(10, nextDay.getMonthOfYear());
        assertEquals(15, nextDay.getDayOfMonth());
    }

    @Test
    public void testTextLengths() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfWeek = chrono.dayOfWeek();

        assertTrue(dayOfWeek.getMaximumTextLength(Locale.UK) > 0);
        assertTrue(dayOfWeek.getMaximumShortTextLength(Locale.UK) > 0);
        assertNotNull(dayOfWeek.getAsText(1, Locale.UK));
        assertNotNull(dayOfWeek.getAsShortText(1, Locale.UK));
        assertNotNull(dayOfWeek.getAsText(0L, Locale.UK));
        assertNotNull(dayOfWeek.getAsShortText(0L, Locale.UK));
    }

    @Test
    public void testNonMidnightCutoverChronology() {
        // Cutover at 12:00:00 (mid-day)
        Instant nonMidnightCutover = new Instant(GJChronology.DEFAULT_CUTOVER.getMillis() + 12 * 3600 * 1000L);
        GJChronology chrono = GJChronology.getInstance(UTC, nonMidnightCutover, 4);

        assertNotNull(chrono.millisOfDay());
        assertNotNull(chrono.hourOfDay());
        assertNotNull(chrono.secondOfMinute());
        assertNotNull(chrono.minuteOfHour());

        long instant = chrono.getDateTimeMillis(1582, 10, 15, 13, 0, 0, 0);
        assertTrue(instant >= nonMidnightCutover.getMillis());
    }
}