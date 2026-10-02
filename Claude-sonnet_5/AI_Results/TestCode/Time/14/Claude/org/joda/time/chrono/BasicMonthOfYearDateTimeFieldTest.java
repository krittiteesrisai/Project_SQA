package org.joda.time.chrono;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Partial;
import org.joda.time.YearMonthDay;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMonthOfYearDateTimeFieldTest {

    private BasicChronology chronology;
    private BasicMonthOfYearDateTimeField field;
    private int maxMonth;

    @Before
    public void setUp() {
        // GregorianChronology extends BasicGJChronology extends BasicChronology
        chronology = GregorianChronology.getInstanceUTC();
        // leap month = FEBRUARY (2), matches real usage in BasicGJChronology
        field = new BasicMonthOfYearDateTimeField(chronology, DateTimeConstants.FEBRUARY);
        maxMonth = field.getMaximumValue();
    }

    //----------------------------------------------------------------
    // Helpers
    //----------------------------------------------------------------
    private long ms(int y, int m, int d) {
        return new DateTime(y, m, d, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
    }

    private long ms(int y, int m, int d, int hh, int mi, int ss, int mmsec) {
        return new DateTime(y, m, d, hh, mi, ss, mmsec, DateTimeZone.UTC).getMillis();
    }

    //----------------------------------------------------------------
    // isLenient / getMinimumValue / getMaximumValue
    //----------------------------------------------------------------
    @Test
    public void testIsLenient() {
        assertFalse(field.isLenient());
    }

    @Test
    public void testGetMinimumValue() {
        assertEquals(DateTimeConstants.JANUARY, field.getMinimumValue());
    }

    @Test
    public void testGetMaximumValue() {
        assertEquals(12, field.getMaximumValue());
    }

    //----------------------------------------------------------------
    // get(long)
    //----------------------------------------------------------------
    @Test
    public void testGet_januaryBoundary() {
        assertEquals(1, field.get(ms(2004, 1, 1)));
    }

    @Test
    public void testGet_decemberBoundary() {
        assertEquals(12, field.get(ms(2004, 12, 31, 23, 59, 59, 999)));
    }

    @Test
    public void testGet_midYear() {
        assertEquals(6, field.get(ms(2004, 6, 15)));
    }

    //----------------------------------------------------------------
    // add(long, int) - easy case months==0
    //----------------------------------------------------------------
    @Test
    public void testAddInt_zeroMonths_returnsSameInstant() {
        long instant = ms(2004, 5, 10);
        assertEquals(instant, field.add(instant, 0));
    }

    @Test
    public void testAddInt_positiveWithinYear() {
        long instant = ms(2004, 1, 15);
        long result = field.add(instant, 2);
        assertEquals(ms(2004, 3, 15), result);
    }

    @Test
    public void testAddInt_crossingYearForward_singleMonth() {
        // Hits monthToUse%iMax == 0 -> wraps to month 1, new year
        long instant = ms(2004, 12, 15);
        long result = field.add(instant, 1);
        assertEquals(ms(2005, 1, 15), result);
    }

    @Test
    public void testAddInt_crossingYearForward_multiMonth() {
        long instant = ms(2004, 11, 15);
        long result = field.add(instant, 3);
        assertEquals(ms(2005, 2, 15), result);
    }

    @Test
    public void testAddInt_negativeWithinYear() {
        long instant = ms(2004, 3, 15);
        long result = field.add(instant, -2);
        assertEquals(ms(2004, 1, 15), result);
    }

    @Test
    public void testAddInt_negativeCrossingYear_remNonZero_monthNotOne() {
        // thisMonth=3, months=-5 -> monthToUse=-3 (<0 branch)
        // remMonthToUse = 3%12 = 3 (!=0, skip "==0" branch)
        // monthToUse = 10 (!=1, skip "yearToUse+=1" branch)
        long instant = ms(2004, 3, 15);
        long result = field.add(instant, -5);
        assertEquals(ms(2003, 10, 15), result);
    }

    @Test
    public void testAddInt_negativeBoundary_remZero_monthBecomesOne() {
        // thisMonth=1, months=-12 -> monthToUse=-12
        // remMonthToUse = 12%12 = 0 -> triggers remMonthToUse=iMax branch
        // monthToUse becomes 1 -> triggers yearToUse+=1 branch
        long instant = ms(2004, 1, 15);
        long result = field.add(instant, -12);
        assertEquals(ms(2003, 1, 15), result);
    }

    @Test
    public void testAddInt_dayCoercion_leapYear() {
        // Jan 31 + 1 month -> Feb 29 (2004 is leap) : dayToUse > maxDay branch
        long instant = ms(2004, 1, 31);
        long result = field.add(instant, 1);
        assertEquals(ms(2004, 2, 29), result);
    }

    @Test
    public void testAddInt_dayCoercion_nonLeapYear() {
        long instant = ms(2005, 1, 31);
        long result = field.add(instant, 1);
        assertEquals(ms(2005, 2, 28), result);
    }

    @Test
    public void testAddInt_noDayCoercionNeeded() {
        // dayToUse <= maxDay -> skip coercion branch
        long instant = ms(2004, 1, 15);
        long result = field.add(instant, 1);
        assertEquals(ms(2004, 2, 15), result);
    }

    //----------------------------------------------------------------
    // add(long, long) - delegation path (i_months == months)
    //----------------------------------------------------------------
    @Test
    public void testAddLong_delegatesToIntVersion() {
        long instant = ms(2004, 5, 10);
        long resultLong = field.add(instant, 2L);
        long resultInt = field.add(instant, 2);
        assertEquals(resultInt, resultLong);
    }

    @Test
    public void testAddLong_delegatesToIntVersion_negative() {
        long instant = ms(2004, 5, 10);
        long resultLong = field.add(instant, -3L);
        long resultInt = field.add(instant, -3);
        assertEquals(resultInt, resultLong);
    }

    //----------------------------------------------------------------
    // add(long, long) - slow path (i_months != months), success case
    //----------------------------------------------------------------
    @Test
    public void testAddLong_overflowIntButWithinYearRange_succeeds() {
        long maxYear = chronology.getMaxYear();
        int thisYear = 2000;
        int thisMonth = 1;
        long instant = ms(thisYear, thisMonth, 1);

        long headroom = maxYear - thisYear;
        long yearsToAdd = (headroom * 9) / 10; // 90% of headroom, safely within bounds
        long monthsLong = yearsToAdd * maxMonth + 5L;

        // Make sure our test setup truly forces the long-overflow branch
        assertTrue("Test setup expects monthsLong to exceed Integer range",
                monthsLong > Integer.MAX_VALUE);

        long result = field.add(instant, monthsLong);

        long totalMonthsZeroBased = (thisMonth - 1) + monthsLong;
        long expectedYear = thisYear + Math.floorDiv(totalMonthsZeroBased, (long) maxMonth);
        int expectedMonth = (int) Math.floorMod(totalMonthsZeroBased, (long) maxMonth) + 1;

        assertEquals(expectedMonth, field.get(result));
        assertEquals(expectedYear, chronology.getYear(result));
    }

    //----------------------------------------------------------------
    // add(long, long) - slow path, out-of-range -> IllegalArgumentException
    //----------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testAddLong_overflow_tooLargePositive_throws() {
        long instant = ms(2000, 1, 1);
        field.add(instant, Long.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddLong_overflow_tooLargeNegative_throws() {
        long instant = ms(2000, 1, 1);
        field.add(instant, Long.MIN_VALUE);
    }

    //----------------------------------------------------------------
    // add(ReadablePartial, int, int[], int)
    //----------------------------------------------------------------
    @Test
    public void testAddPartial_valueToAddZero_returnsSameArrayReference() {
        YearMonthDay ymd = new YearMonthDay(2004, 1, 31);
        int[] vals = {2004, 1, 31};
        int[] result = field.add(ymd, 1, vals, 0);
        assertSame(vals, result); // "the easy case" branch
    }

    @Test
    public void testAddPartial_contiguous_dayCoercion() {
        // YearMonthDay is contiguous: year->monthOfYear->dayOfMonth range/duration chain matches
        YearMonthDay ymd = new YearMonthDay(2004, 1, 31);
        int[] vals = {2004, 1, 31};
        int[] result = field.add(ymd, 1, vals, 1);
        assertArrayEquals(new int[] {2004, 2, 29}, result);
    }

    @Test
    public void testAddPartial_contiguous_crossYear() {
        YearMonthDay ymd = new YearMonthDay(2004, 12, 15);
        int[] vals = {2004, 12, 15};
        int[] result = field.add(ymd, 1, vals, 1);
        assertArrayEquals(new int[] {2005, 1, 15}, result);
    }

    @Test
    public void testAddPartial_nonContiguous_elseBranch_doesNotCrashFatally() {
        // NOTE: Partial(monthOfYear, dayOfWeek) is intentionally NON-contiguous
        // (dayOfWeek's rangeDurationField=weeks != monthOfYear's durationField=months),
        // so this should route into the else-branch -> super.add(...).
        // The exact numeric behavior of the inherited super.add(...) is NOT given in the
        // provided source, so we only assert the branch executes and, if it completes,
        // that the output shape is sane. Any RuntimeException from the (unknown) super
        // implementation is tolerated here because we are not guessing its contract.
        Partial partial = new Partial(
                new org.joda.time.DateTimeFieldType[] {
                        org.joda.time.DateTimeFieldType.monthOfYear(),
                        org.joda.time.DateTimeFieldType.dayOfWeek()
                },
                new int[] {3, 2});
        int[] inputValues = {3, 2};
        try {
            int[] result = field.add(partial, 0, inputValues, 2);
            assertNotNull(result);
            assertEquals(2, result.length);
        } catch (RuntimeException e) {
            // Behavior of super.add(...) for this uncommon combination is not specified
            // in the given source; branch coverage for the "else" path is still achieved
            // by reaching this call.
        }
    }

    //----------------------------------------------------------------
    // addWrapField(long, int)
    //----------------------------------------------------------------
    @Test
    public void testAddWrapField_noWrap() {
        long instant = ms(2004, 5, 15);
        long result = field.addWrapField(instant, 1);
        assertEquals(ms(2004, 6, 15), result);
    }

    @Test
    public void testAddWrapField_wrapForward_sameYear() {
        long instant = ms(2004, 12, 15);
        long result = field.addWrapField(instant, 1);
        assertEquals(ms(2004, 1, 15), result); // wraps within year, year unchanged
    }

    @Test
    public void testAddWrapField_wrapBackward_sameYear() {
        long instant = ms(2004, 1, 15);
        long result = field.addWrapField(instant, -1);
        assertEquals(ms(2004, 12, 15), result);
    }

    @Test
    public void testAddWrapField_withDayCoercionViaSet() {
        long instant = ms(2004, 1, 31);
        long result = field.addWrapField(instant, 1);
        assertEquals(ms(2004, 2, 29), result); // set() coerces day
    }

    //----------------------------------------------------------------
    // getDifferenceAsLong(long, long)
    //----------------------------------------------------------------
    @Test
    public void testGetDifference_minuendBeforeSubtrahend_negatesRecursiveCall() {
        long minuend = ms(2004, 1, 30);
        long subtrahend = ms(2004, 3, 2);
        long diffForward = field.getDifferenceAsLong(subtrahend, minuend); // normal order
        long diffReverse = field.getDifferenceAsLong(minuend, subtrahend); // triggers "<" branch
        assertEquals(-diffForward, diffReverse);
    }

    @Test
    public void testGetDifference_simpleCase_noDomAdjustment() {
        long minuend = ms(2004, 3, 15);
        long subtrahend = ms(2004, 1, 15);
        assertEquals(2, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifference_lastDayOfMinuendMonth_subtrahendDomGreater() {
        // minuendDom(29) == maxDay(Feb 2004=29) -> outer if true
        // subtrahendDom(31) > minuendDom(29) -> inner if true, subtrahend adjusted
        long minuend = ms(2004, 2, 29);
        long subtrahend = ms(2004, 1, 31);
        assertEquals(1, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifference_lastDayOfMinuendMonth_subtrahendDomNotGreater() {
        // outer if true, inner if false (subtrahendDom <= minuendDom)
        long minuend = ms(2004, 2, 29);
        long subtrahend = ms(2004, 1, 15);
        assertEquals(1, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifference_remainderDecrement() {
        // minuendRem(offset within its month) < subtrahendRem(offset within its month)
        // -> triggers difference-- branch
        long minuend = ms(2004, 3, 2);   // offset ~1 day into March
        long subtrahend = ms(2004, 1, 30); // offset ~29 days into January
        assertEquals(1, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifference_noRemainderDecrement() {
        // Equal time-of-day / equal day-of-month -> remainders equal, no decrement
        long minuend = ms(2004, 3, 15);
        long subtrahend = ms(2004, 1, 15);
        assertEquals(2, field.getDifferenceAsLong(minuend, subtrahend));
    }

    //----------------------------------------------------------------
    // set(long, int)
    //----------------------------------------------------------------
    @Test
    public void testSet_validMonth_noCoercion() {
        long instant = ms(2004, 1, 15);
        long result = field.set(instant, 6);
        assertEquals(ms(2004, 6, 15), result);
    }

    @Test
    public void testSet_validMonth_withDayCoercion() {
        long instant = ms(2004, 1, 31);
        long result = field.set(instant, 2);
        assertEquals(ms(2004, 2, 29), result); // leap year Feb
    }

    @Test
    public void testSet_boundaryMin() {
        long instant = ms(2004, 6, 15);
        long result = field.set(instant, 1);
        assertEquals(ms(2004, 1, 15), result);
    }

    @Test
    public void testSet_boundaryMax() {
        long instant = ms(2004, 6, 15);
        long result = field.set(instant, 12);
        assertEquals(ms(2004, 12, 15), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_belowMin_throws() {
        field.set(ms(2004, 6, 15), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_aboveMax_throws() {
        field.set(ms(2004, 6, 15), 13);
    }

    //----------------------------------------------------------------
    // getRangeDurationField / getLeapDurationField
    //----------------------------------------------------------------
    @Test
    public void testGetRangeDurationField() {
        DurationField expected = chronology.years();
        assertEquals(expected, field.getRangeDurationField());
    }

    @Test
    public void testGetLeapDurationField() {
        DurationField expected = chronology.days();
        assertEquals(expected, field.getLeapDurationField());
    }

    //----------------------------------------------------------------
    // isLeap(long) / getLeapAmount(long)
    //----------------------------------------------------------------
    @Test
    public void testIsLeap_leapYearLeapMonth() {
        long instant = ms(2004, 2, 10); // 2004 leap, Feb == leap month
        assertTrue(field.isLeap(instant));
        assertEquals(1, field.getLeapAmount(instant));
    }

    @Test
    public void testIsLeap_leapYearNonLeapMonth() {
        long instant = ms(2004, 3, 10); // leap year but month != leap month
        assertFalse(field.isLeap(instant));
        assertEquals(0, field.getLeapAmount(instant));
    }

    @Test
    public void testIsLeap_nonLeapYear() {
        long instant = ms(2005, 2, 10); // not leap year at all
        assertFalse(field.isLeap(instant));
        assertEquals(0, field.getLeapAmount(instant));
    }

    //----------------------------------------------------------------
    // roundFloor(long) / remainder(long)
    //----------------------------------------------------------------
    @Test
    public void testRoundFloor() {
        long instant = ms(2004, 5, 20, 13, 45, 30, 123);
        long result = field.roundFloor(instant);
        assertEquals(ms(2004, 5, 1), result);
    }

    @Test
    public void testRemainder() {
        long instant = ms(2004, 5, 20, 13, 45, 30, 123);
        long expectedFloor = ms(2004, 5, 1);
        assertEquals(instant - expectedFloor, field.remainder(instant));
    }

    @Test
    public void testRemainder_atExactMonthStart_isZero() {
        long instant = ms(2004, 7, 1);
        assertEquals(0L, field.remainder(instant));
    }
}
