package org.joda.time.chrono;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.YearMonthDay;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for GJChronology.
 */
public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone UTC = DateTimeZone.UTC;

    // -----------------------------------------------------------------------
    // Factory & Caching Tests
    // -----------------------------------------------------------------------
    @Test
    public void testFactory_getInstanceVariants() {
        GJChronology defaultGj = GJChronology.getInstance();
        assertNotNull(defaultGj);
        assertEquals(DateTimeZone.getDefault(), defaultGj.getZone());
        assertEquals(4, defaultGj.getMinimumDaysInFirstWeek());
        assertEquals(GJChronology.DEFAULT_CUTOVER, defaultGj.getGregorianCutover());

        GJChronology utcGj = GJChronology.getInstanceUTC();
        assertNotNull(utcGj);
        assertEquals(UTC, utcGj.getZone());

        GJChronology zoneGj = GJChronology.getInstance(PARIS);
        assertEquals(PARIS, zoneGj.getZone());

        GJChronology nullZoneGj = GJChronology.getInstance(null);
        assertEquals(DateTimeZone.getDefault(), nullZoneGj.getZone());

        // Test caching mechanism
        assertSame(utcGj, GJChronology.getInstance(UTC));
        assertSame(utcGj, GJChronology.getInstance(UTC, GJChronology.DEFAULT_CUTOVER, 4));
        assertSame(utcGj, GJChronology.getInstance(UTC, (ReadableInstant) null, 4));
        assertSame(utcGj, GJChronology.getInstance(UTC, GJChronology.DEFAULT_CUTOVER.getMillis(), 4));

        GJChronology customCutover = GJChronology.getInstance(UTC, new Instant(0L), 3);
        assertEquals(new Instant(0L), customCutover.getGregorianCutover());
        assertEquals(3, customCutover.getMinimumDaysInFirstWeek());
        assertSame(customCutover, GJChronology.getInstance(UTC, new Instant(0L), 3));
    }

    @Test
    public void testFactory_NonUtcZonedInstance() {
        Instant cutover = new Instant(0L);
        GJChronology zonedGj = GJChronology.getInstance(PARIS, cutover, 5);
        assertEquals(PARIS, zonedGj.getZone());
        assertEquals(5, zonedGj.getMinimumDaysInFirstWeek());
        assertEquals(cutover, zonedGj.getGregorianCutover());
        assertNotNull(zonedGj.getBase());
    }

    @Test
    public void testWithZone_and_WithUTC() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology withUtc = chrono.withUTC();
        assertEquals(UTC, withUtc.getZone());

        Chronology withParis = withUtc.withZone(PARIS);
        assertEquals(PARIS, withParis.getZone());

        // Same zone should return same instance
        assertSame(chrono, chrono.withZone(PARIS));
        assertSame(chrono, chrono.withZone(null)); // null triggers default zone
    }

    // -----------------------------------------------------------------------
    // getDateTimeMillis & Gap Handling Tests
    // -----------------------------------------------------------------------
    @Test
    public void testGetDateTimeMillis_GregorianAndJulianPeriods() {
        GJChronology gj = GJChronology.getInstanceUTC();

        // Gregorian era: 2000-01-01
        long millis2000 = gj.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(new DateTime(2000, 1, 1, 0, 0, UTC).getMillis(), millis2000);

        long millis2000_7args = gj.getDateTimeMillis(2000, 1, 1, 12, 30, 45, 500);
        assertEquals(new DateTime(2000, 1, 1, 12, 30, 45, 500, UTC).getMillis(), millis2000_7args);

        // Julian era: 1500-01-01
        long millis1500 = gj.getDateTimeMillis(1500, 1, 1, 0);
        assertTrue(millis1500 < GJChronology.DEFAULT_CUTOVER.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_CutoverGap4Args() {
        GJChronology gj = GJChronology.getInstanceUTC();
        // 1582-10-05 does not exist under default cutover
        gj.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_CutoverGap7Args() {
        GJChronology gj = GJChronology.getInstanceUTC();
        // 1582-10-14 does not exist under default cutover
        gj.getDateTimeMillis(1582, 10, 14, 10, 0, 0, 0);
    }

    @Test
    public void testGetDateTimeMillis_LeapYearCutoverEdgeCases() {
        GJChronology gj = GJChronology.getInstanceUTC();
        // Year 1500 is a leap year in Julian, but NOT in Gregorian.
        // It must succeed under Julian rules.
        long feb29_1500 = gj.getDateTimeMillis(1500, 2, 29, 0, 0, 0, 0);
        assertTrue(feb29_1500 < GJChronology.DEFAULT_CUTOVER.getMillis());

        // Verify invalid Gregorian leap date throws exception
        try {
            gj.getDateTimeMillis(1700, 2, 29, 0, 0, 0, 0);
            fail("Expected IllegalFieldValueException for 1700-02-29 in Gregorian");
        } catch (IllegalFieldValueException e) {
            // Expected
        }
    }

    @Test
    public void testGetDateTimeMillis_WithBaseZoned() {
        GJChronology gj = GJChronology.getInstance(PARIS);
        long millis = gj.getDateTimeMillis(2010, 5, 10, 10, 20, 30, 40);
        DateTime dt = new DateTime(2010, 5, 10, 10, 20, 30, 40, PARIS);
        assertEquals(dt.getMillis(), millis);

        long millis4 = gj.getDateTimeMillis(2010, 5, 10, 1000);
        assertEquals(new DateTime(2010, 5, 10, 0, 0, 1, 0, PARIS).getMillis(), millis4);
    }

    // -----------------------------------------------------------------------
    // Field Manipulation: CutoverField & ImpreciseCutoverField
    // -----------------------------------------------------------------------
    @Test
    public void testCutoverField_Get_Text_And_ShortText() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField eraField = gj.era();
        DateTimeField dayOfWeek = gj.dayOfWeek();

        long postCutover = new DateTime(1582, 10, 15, 0, 0, UTC).getMillis();
        long preCutover = new DateTime(1582, 10, 4, 0, 0, UTC).getMillis();

        assertEquals("AD", eraField.getAsText(postCutover, Locale.ENGLISH));
        assertEquals("AD", eraField.getAsText(preCutover, Locale.ENGLISH));
        assertEquals("AD", eraField.getAsShortText(postCutover, Locale.ENGLISH));
        assertEquals("AD", eraField.getAsShortText(preCutover, Locale.ENGLISH));
        assertEquals("AD", eraField.getAsText(1, Locale.ENGLISH));
        assertEquals("AD", eraField.getAsShortText(1, Locale.ENGLISH));

        assertEquals("Friday", dayOfWeek.getAsText(postCutover, Locale.ENGLISH));
        assertEquals("Thursday", dayOfWeek.getAsText(preCutover, Locale.ENGLISH));
    }

    @Test
    public void testCutoverField_Set_AcrossCutover() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = gj.dayOfMonth();

        // 1582-10-15 (Gregorian) set to 4 -> 1582-10-04 (Julian)
        long postCutover = gj.getDateTimeMillis(1582, 10, 15, 0);
        long result = dayOfMonth.set(postCutover, 4);
        assertEquals(gj.getDateTimeMillis(1582, 10, 4, 0), result);

        // 1582-10-04 (Julian) set to 15 -> 1582-10-15 (Gregorian)
        long preCutover = gj.getDateTimeMillis(1582, 10, 4, 0);
        long result2 = dayOfMonth.set(preCutover, 15);
        assertEquals(gj.getDateTimeMillis(1582, 10, 15, 0), result2);

        // String overload
        long resultStr = dayOfMonth.set(postCutover, "4", Locale.ENGLISH);
        assertEquals(gj.getDateTimeMillis(1582, 10, 4, 0), resultStr);

        long resultStr2 = dayOfMonth.set(preCutover, "15", Locale.ENGLISH);
        assertEquals(gj.getDateTimeMillis(1582, 10, 15, 0), resultStr2);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testCutoverField_SetInvalidStuckCheck() {
        GJChronology gj = GJChronology.getInstanceUTC();
        // Trying to set 1582-10-15 dayOfMonth to an illegal cutover day like 5
        long postCutover = gj.getDateTimeMillis(1582, 10, 15, 0);
        gj.dayOfMonth().set(postCutover, 5);
    }

    @Test
    public void testCutoverField_MinMaxAndRounding() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = gj.dayOfMonth();

        long postCutover = gj.getDateTimeMillis(1582, 10, 15, 0);
        long preCutover = gj.getDateTimeMillis(1582, 10, 4, 0);

        assertEquals(1, dayOfMonth.getMinimumValue());
        assertEquals(31, dayOfMonth.getMaximumValue());
        assertEquals(1, dayOfMonth.getMinimumValue(postCutover));
        assertEquals(1, dayOfMonth.getMinimumValue(preCutover));
        assertEquals(31, dayOfMonth.getMaximumValue(postCutover));
        assertEquals(31, dayOfMonth.getMaximumValue(preCutover));

        // Partials
        Partial partial = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[] {1582, 10});
        assertTrue(dayOfMonth.getMinimumValue(partial) >= 1);
        assertTrue(dayOfMonth.getMaximumValue(partial) >= 28);
        assertTrue(dayOfMonth.getMaximumValue(partial, new int[] {1582, 10}) >= 28);

        // Rounding
        assertEquals(postCutover, dayOfMonth.roundFloor(postCutover + 5000));
        assertEquals(postCutover, dayOfMonth.roundCeiling(postCutover - 5000));
        assertEquals(preCutover, dayOfMonth.roundFloor(preCutover + 5000));
        assertEquals(preCutover, dayOfMonth.roundCeiling(preCutover - 5000));

        // Text Lengths
        assertTrue(dayOfMonth.getMaximumTextLength(Locale.ENGLISH) > 0);
        assertTrue(dayOfMonth.getMaximumShortTextLength(Locale.ENGLISH) > 0);
        assertFalse(dayOfMonth.isLenient());
    }

    @Test
    public void testCutoverField_AddPartial() {
        GJChronology gj = GJChronology.getInstanceUTC();
        YearMonthDay ymd = new YearMonthDay(1582, 10, 4, gj);
        YearMonthDay nextDay = ymd.plusDays(1);
        assertEquals(1582, nextDay.getYear());
        assertEquals(10, nextDay.getMonthOfYear());
        assertEquals(15, nextDay.getDayOfMonth());

        // Zero addition
        assertEquals(ymd, ymd.plusDays(0));
    }

    // -----------------------------------------------------------------------
    // ImpreciseCutoverField: Add / Difference / Leap
    // -----------------------------------------------------------------------
    @Test
    public void testImpreciseCutoverField_AddYearsMonths() {
        GJChronology gj = GJChronology.getInstanceUTC();

        // 1581-10-15 (Julian) + 1 year -> 1582-10-15 (Gregorian)
        long dt1581 = gj.getDateTimeMillis(1581, 10, 15, 0);
        long dt1582 = gj.year().add(dt1581, 1);
        assertEquals(gj.getDateTimeMillis(1582, 10, 15, 0), dt1582);

        // 1582-10-15 (Gregorian) - 1 year -> 1581-10-15 (Julian)
        long backTo1581 = gj.year().add(dt1582, -1);
        assertEquals(dt1581, backTo1581);

        // Long add overload
        long dt1582_long = gj.year().add(dt1581, 1L);
        assertEquals(dt1582, dt1582_long);

        // Month additions across cutover
        long dt1582_Sep = gj.getDateTimeMillis(1582, 9, 15, 0);
        long dt1582_Oct = gj.monthOfYear().add(dt1582_Sep, 1);
        assertEquals(gj.getDateTimeMillis(1582, 10, 15, 0), dt1582_Oct);
    }

    @Test
    public void testImpreciseCutoverField_Differences4Quadrants() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField yearField = gj.year();

        long post1 = gj.getDateTimeMillis(2000, 1, 1, 0);
        long post2 = gj.getDateTimeMillis(2010, 1, 1, 0);
        long pre1 = gj.getDateTimeMillis(1500, 1, 1, 0);
        long pre2 = gj.getDateTimeMillis(1510, 1, 1, 0);

        // Quadrant 1: post - post
        assertEquals(10, yearField.getDifference(post2, post1));
        assertEquals(10L, yearField.getDifferenceAsLong(post2, post1));

        // Quadrant 2: post - pre
        assertEquals(510, yearField.getDifference(post2, pre1));
        assertEquals(510L, yearField.getDifferenceAsLong(post2, pre1));

        // Quadrant 3: pre - post
        assertEquals(-510, yearField.getDifference(pre1, post2));
        assertEquals(-510L, yearField.getDifferenceAsLong(pre1, post2));

        // Quadrant 4: pre - pre
        assertEquals(10, yearField.getDifference(pre2, pre1));
        assertEquals(10L, yearField.getDifferenceAsLong(pre2, pre1));
    }

    @Test
    public void testImpreciseCutoverField_LeapAndMinMax() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField monthField = gj.monthOfYear();
        DateTimeField yearField = gj.year();

        long preLeap = gj.getDateTimeMillis(1500, 2, 1, 0); // Julian Leap year
        long postNonLeap = gj.getDateTimeMillis(1700, 2, 1, 0); // Gregorian non-leap

        assertTrue(yearField.isLeap(preLeap));
        assertFalse(yearField.isLeap(postNonLeap));

        assertEquals(1, yearField.getLeapAmount(preLeap));
        assertEquals(0, yearField.getLeapAmount(postNonLeap));
        assertNotNull(yearField.getLeapDurationField());

        assertEquals(1, monthField.getMinimumValue(preLeap));
        assertEquals(12, monthField.getMaximumValue(preLeap));
        assertEquals(1, monthField.getMinimumValue(postNonLeap));
        assertEquals(12, monthField.getMaximumValue(postNonLeap));
    }

    // -----------------------------------------------------------------------
    // Weekyear & Non-midnight Cutover Assembly
    // -----------------------------------------------------------------------
    @Test
    public void testWeekyearCalculationsAndCutover() {
        GJChronology gj = GJChronology.getInstanceUTC();
        DateTimeField weekyear = gj.weekyear();
        DateTimeField weekOfWeekyear = gj.weekOfWeekyear();

        long dt = gj.getDateTimeMillis(1582, 10, 18, 0); // Week after cutover
        assertEquals(1582, weekyear.get(dt));
        assertTrue(weekOfWeekyear.get(dt) > 0);

        long added = weekyear.add(dt, 1);
        assertEquals(1583, weekyear.get(added));
    }

    @Test
    public void testAssemble_NonMidnightCutoverCreatesTimeOfDayCutoverFields() {
        // Cutover at 08:30:00 UTC on 1970-01-01
        long cutoverInstantMillis = (8 * 3600 + 30 * 60) * 1000L;
        GJChronology gj = GJChronology.getInstance(UTC, new Instant(cutoverInstantMillis), 4);

        long testInstant = cutoverInstantMillis + 1000L;
        assertEquals(8, gj.hourOfDay().get(testInstant));
        assertEquals(30, gj.minuteOfHour().get(testInstant));
        assertEquals(1, gj.secondOfMinute().get(testInstant));
    }

    // -----------------------------------------------------------------------
    // Boundary Limits, Year Zero & BCE Calculations
    // -----------------------------------------------------------------------
    @Test
    public void testYearZero_And_BCE_Transitions() {
        GJChronology gj = GJChronology.getInstanceUTC();

        // 1 BCE is represented as year -1 in GJChronology Julian chronology
        long dt1Bce = gj.getDateTimeMillis(-1, 12, 31, 0);
        assertEquals(-1, gj.year().get(dt1Bce));

        // Adding 2 years to 1 BCE should yield 2 CE (since year 0 doesn't exist in Julian)
        long dt2Ce = gj.year().add(dt1Bce, 2);
        assertEquals(2, gj.year().get(dt2Ce));

        LocalDate bceDate = new LocalDate(-10, 5, 20, gj);
        assertEquals(-10, bceDate.getYear());
        LocalDate addedYears = bceDate.plusYears(20);
        assertTrue(addedYears.getYear() > 0);
    }

    // -----------------------------------------------------------------------
    // Object Contract: equals, hashCode, toString, Serialization
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        GJChronology gj1 = GJChronology.getInstance(UTC, new Instant(0L), 4);
        GJChronology gj2 = GJChronology.getInstance(UTC, new Instant(0L), 4);
        GJChronology gj3 = GJChronology.getInstance(PARIS, new Instant(0L), 4);
        GJChronology gj4 = GJChronology.getInstance(UTC, new Instant(1000L), 4);
        GJChronology gj5 = GJChronology.getInstance(UTC, new Instant(0L), 3);

        assertEquals(gj1, gj1);
        assertEquals(gj1, gj2);
        assertEquals(gj1.hashCode(), gj2.hashCode());

        assertFalse(gj1.equals(gj3));
        assertFalse(gj1.equals(gj4));
        assertFalse(gj1.equals(gj5));
        assertFalse(gj1.equals(null));
        assertFalse(gj1.equals("Not a chronology"));
    }

    @Test
    public void testToString() {
        GJChronology defaultGj = GJChronology.getInstance(UTC);
        assertEquals("GJChronology[UTC]", defaultGj.toString());

        GJChronology customCutover = GJChronology.getInstance(UTC, new Instant(0L), 4);
        assertEquals("GJChronology[UTC,cutover=1970-01-01]", customCutover.toString());

        GJChronology customCutoverWithTime = GJChronology.getInstance(UTC, new Instant(3600000L), 3);
        assertEquals("GJChronology[UTC,cutover=1970-01-01T01:00:00.000Z,mdfw=3]", customCutoverWithTime.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        GJChronology original = GJChronology.getInstance(PARIS, new Instant(1000000L), 3);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        GJChronology deserialized = (GJChronology) ois.readObject();
        ois.close();

        assertSame(original, deserialized);
    }
}