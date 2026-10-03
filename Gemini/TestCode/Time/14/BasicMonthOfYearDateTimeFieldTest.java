package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.YearMonth;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BasicMonthOfYearDateTimeFieldTest {

    private Chronology chrono;
    private DateTimeField field;
    private DateTimeZone originalZone;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        chrono = ISOChronology.getInstanceUTC();
        field = chrono.monthOfYear();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
    }

    @Test
    public void testGetAndBasics() {
        long instant = new YearMonth(2023, 5, chrono).toInterval().getStartMillis();
        assertEquals(5, field.get(instant));
        assertFalse(field.isLenient());
        assertEquals(1, field.getMinimumValue());
        assertEquals(12, field.getMaximumValue());
        assertEquals(DurationFieldType.years(), field.getRangeDurationField().getType());
        assertEquals(DurationFieldType.days(), field.getLeapDurationField().getType());
    }

    @Test
    public void testAddIntZero() {
        long instant = new YearMonth(2023, 5, chrono).toInterval().getStartMillis();
        assertEquals(instant, field.add(instant, 0));
    }

    @Test
    public void testAddIntPositive() {
        long start = new YearMonth(2020, 1, chrono).toInterval().getStartMillis(); // 2020-01-01
        long result = field.add(start, 14); // 2021-03-01
        assertEquals(3, field.get(result));
        assertEquals(2021, chrono.year().get(result));
    }

    @Test
    public void testAddIntNegativeBranches() {
        // Test remMonthToUse == 0 and monthToUse == 1 boundary cases
        long start = new YearMonth(2021, 1, chrono).toInterval().getStartMillis();
        
        // Subtract 1 month -> 2020-12
        long res1 = field.add(start, -1);
        assertEquals(12, field.get(res1));
        assertEquals(2020, chrono.year().get(res1));

        // Subtract 12 months -> 2020-01 (remMonthToUse == 0 trigger)
        long res12 = field.add(start, -12);
        assertEquals(1, field.get(res12));
        assertEquals(2020, chrono.year().get(res12));

        // Subtract 11 months -> 2020-02
        long res11 = field.add(start, -11);
        assertEquals(2, field.get(res11));
        assertEquals(2020, chrono.year().get(res11));
    }

    @Test
    public void testAddIntDayOfMonthCoercion() {
        // 2020-03-31 (leap year) - 1 month -> 2020-02-29
        long march31Leap = chrono.getDateTimeMillis(2020, 3, 31, 0);
        long feb29 = field.add(march31Leap, -1);
        assertEquals(2020, chrono.year().get(feb29));
        assertEquals(2, chrono.monthOfYear().get(feb29));
        assertEquals(29, chrono.dayOfMonth().get(feb29));

        // 2021-03-31 (non-leap year) - 1 month -> 2021-02-28
        long march31NonLeap = chrono.getDateTimeMillis(2021, 3, 31, 0);
        long feb28 = field.add(march31NonLeap, -1);
        assertEquals(2021, chrono.year().get(feb28));
        assertEquals(2, chrono.monthOfYear().get(feb28));
        assertEquals(28, chrono.dayOfMonth().get(feb28));

        // 2021-07-31 - 1 month -> 2021-06-30
        long july31 = chrono.getDateTimeMillis(2021, 7, 31, 0);
        long june30 = field.add(july31, -1);
        assertEquals(6, chrono.monthOfYear().get(june30));
        assertEquals(30, chrono.dayOfMonth().get(june30));
    }

    @Test
    public void testAddLongWithinIntRange() {
        long start = chrono.getDateTimeMillis(2021, 5, 15, 0);
        long result = field.add(start, 5L);
        assertEquals(10, field.get(result));
    }

    @Test
    public void testAddLongLargeAmountsPositiveAndNegative() {
        long start = chrono.getDateTimeMillis(2000, 1, 15, 0);
        
        // Large positive amount that exceeds int range
        long largeMonths = 3000000000L;
        try {
            field.add(start, largeMonths);
            fail("Expected IllegalArgumentException on out-of-range year calculation");
        } catch (IllegalArgumentException e) {
            // Expected due to max year limit
        }

        // Large negative amount that exceeds int range
        try {
            field.add(start, -largeMonths);
            fail("Expected IllegalArgumentException on out-of-range min year calculation");
        } catch (IllegalArgumentException e) {
            // Expected due to min year limit
        }

        // Valid long addition that covers day truncation logic
        long startMarch31 = chrono.getDateTimeMillis(2000, 3, 31, 0);
        long validLargeMonths = 2400L; // 200 years forward -> 2200-03-31
        long res = field.add(startMarch31, validLargeMonths - 1); // 2200-02-28 (2200 is not leap)
        assertEquals(2200, chrono.year().get(res));
        assertEquals(2, chrono.monthOfYear().get(res));
        assertEquals(28, chrono.dayOfMonth().get(res));
    }

    @Test
    public void testAddPartialContiguous() {
        MonthDay md = new MonthDay(2, 29, chrono);
        int[] result = field.add(md, 0, new int[]{2, 29}, 0);
        assertArrayEquals(new int[]{2, 29}, result);

        // Add 1 month to Feb 29 -> March 29
        int[] resAdd1 = field.add(md, 0, new int[]{2, 29}, 1);
        assertEquals(3, resAdd1[0]);
        assertEquals(29, resAdd1[1]);

        // Add 12 months to Feb 29 -> Feb 28 (next year is non-leap in standard relative progression)
        int[] resAdd12 = field.add(md, 0, new int[]{2, 29}, 12);
        assertEquals(2, resAdd12[0]);
        assertEquals(28, resAdd12[1]);
    }

    @Test
    public void testAddPartialNonContiguous() {
        Partial p = new Partial(
            new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.secondOfMinute() },
            new int[] { 3, 45 },
            chrono
        );
        assertFalse(DateTimeUtils.isContiguous(p));

        int[] result = field.add(p, 0, new int[]{ 3, 45 }, 2);
        assertEquals(5, result[0]);
        assertEquals(45, result[1]);
    }

    @Test
    public void testAddWrapField() {
        long instant = chrono.getDateTimeMillis(2023, 10, 15, 0);
        long wrapped = field.addWrapField(instant, 5); // 10 + 5 = 15 -> wraps to 3
        assertEquals(3, field.get(wrapped));
        assertEquals(2023, chrono.year().get(wrapped)); // Year should remain unchanged
    }

    @Test
    public void testSetBoundaryAndInvalidValues() {
        long instant = chrono.getDateTimeMillis(2023, 3, 31, 0);

        // Set to February -> Coerced to 28
        long setFeb = field.set(instant, 2);
        assertEquals(2, field.get(setFeb));
        assertEquals(28, chrono.dayOfMonth().get(setFeb));

        // Set to Leap Feb (2020) -> Coerced to 29
        long leapInstant = chrono.getDateTimeMillis(2020, 3, 31, 0);
        long setLeapFeb = field.set(leapInstant, 2);
        assertEquals(2, field.get(setLeapFeb));
        assertEquals(29, chrono.dayOfMonth().get(setLeapFeb));

        // Invalid lower bound
        try {
            field.set(instant, 0);
            fail("Expected IllegalFieldValueException for month 0");
        } catch (IllegalFieldValueException e) {
            // Expected
        }

        // Invalid upper bound
        try {
            field.set(instant, 13);
            fail("Expected IllegalFieldValueException for month 13");
        } catch (IllegalFieldValueException e) {
            // Expected
        }
    }

    @Test
    public void testGetDifferenceAsLong() {
        // Minuend < Subtrahend -> negative difference branch
        long t1 = chrono.getDateTimeMillis(2023, 1, 15, 12, 0, 0, 0);
        long t2 = chrono.getDateTimeMillis(2023, 4, 15, 12, 0, 0, 0);
        assertEquals(-3L, field.getDifferenceAsLong(t1, t2));
        assertEquals(3L, field.getDifferenceAsLong(t2, t1));

        // Subtrahend DOM adjustment branch (minuend is end-of-month, subtrahend DOM > minuend DOM)
        long endFeb = chrono.getDateTimeMillis(2021, 2, 28, 0);
        long endMarch = chrono.getDateTimeMillis(2021, 3, 31, 0);
        assertEquals(-1L, field.getDifferenceAsLong(endFeb, endMarch));
        assertEquals(1L, field.getDifferenceAsLong(endMarch, endFeb));

        // Remainder adjustment branch (minuendRem < subtrahendRem)
        long t3 = chrono.getDateTimeMillis(2023, 5, 10, 10, 0, 0, 0);
        long t4 = chrono.getDateTimeMillis(2023, 3, 10, 12, 0, 0, 0);
        // t3 is 2 months minus 2 hours ahead of t4 -> difference should be 1 full month
        assertEquals(1L, field.getDifferenceAsLong(t3, t4));
    }

    @Test
    public void testIsLeapAndLeapAmount() {
        long leapFeb = chrono.getDateTimeMillis(2020, 2, 15, 0);
        long leapMarch = chrono.getDateTimeMillis(2020, 3, 15, 0);
        long nonLeapFeb = chrono.getDateTimeMillis(2021, 2, 15, 0);

        assertTrue(field.isLeap(leapFeb));
        assertEquals(1, field.getLeapAmount(leapFeb));

        assertFalse(field.isLeap(leapMarch));
        assertEquals(0, field.getLeapAmount(leapMarch));

        assertFalse(field.isLeap(nonLeapFeb));
        assertEquals(0, field.getLeapAmount(nonLeapFeb));
    }

    @Test
    public void testRoundFloorAndRemainder() {
        long instant = chrono.getDateTimeMillis(2023, 5, 15, 10, 30, 0, 0);
        long expectedFloor = chrono.getDateTimeMillis(2023, 5, 1, 0, 0, 0, 0);
        
        long floor = field.roundFloor(instant);
        assertEquals(expectedFloor, floor);

        long remainder = field.remainder(instant);
        assertEquals(instant - expectedFloor, remainder);
    }
}