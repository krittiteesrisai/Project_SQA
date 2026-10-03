package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.ISOChronology;

import org.junit.Test;
import static org.junit.Assert.*;

public class BaseSingleFieldPeriodTest {

    // Concrete mock subclass to test instance/protected methods
    private static class MockSingleFieldPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;

        MockSingleFieldPeriod(int period) {
            super(period);
        }

        @Override
        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }

        @Override
        public PeriodType getPeriodType() {
            return PeriodType.days();
        }

        public void setValuePublic(int value) {
            super.setValue(value);
        }

        public int getValuePublic() {
            return super.getValue();
        }
    }

    private static class AnotherSingleFieldPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;

        AnotherSingleFieldPeriod(int period) {
            super(period);
        }

        @Override
        public DurationFieldType getFieldType() {
            return DurationFieldType.hours();
        }

        @Override
        public PeriodType getPeriodType() {
            return PeriodType.hours();
        }
    }

    // =========================================================================
    // 1. Tests for between(ReadableInstant, ReadableInstant, DurationFieldType)
    // =========================================================================

    @Test
    public void testBetween_Instant_Normal() {
        ReadableInstant start = new Instant(0L);
        ReadableInstant end = new Instant(86400000L * 3); // 3 days
        int result = BaseSingleFieldPeriod.between(start, end, DurationFieldType.days());
        assertEquals(3, result);

        int resultNeg = BaseSingleFieldPeriod.between(end, start, DurationFieldType.days());
        assertEquals(-3, resultNeg);

        int resultZero = BaseSingleFieldPeriod.between(start, start, DurationFieldType.days());
        assertEquals(0, resultZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Instant_NullStart() {
        BaseSingleFieldPeriod.between(null, new Instant(0L), DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Instant_NullEnd() {
        BaseSingleFieldPeriod.between(new Instant(0L), null, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Instant_BothNull() {
        BaseSingleFieldPeriod.between(null, null, DurationFieldType.days());
    }

    // =========================================================================
    // 2. Tests for between(ReadablePartial, ReadablePartial, ReadablePeriod)
    // =========================================================================

    @Test
    public void testBetween_Partial_Normal() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalDate end = new LocalDate(2020, 1, 10);
        int result = BaseSingleFieldPeriod.between(start, end, Days.ZERO);
        assertEquals(9, result);

        int resultZero = BaseSingleFieldPeriod.between(start, start, Days.ZERO);
        assertEquals(0, resultZero);

        LocalTime time1 = new LocalTime(10, 0);
        LocalTime time2 = new LocalTime(14, 30);
        int hourDiff = BaseSingleFieldPeriod.between(time1, time2, Hours.ZERO);
        assertEquals(4, hourDiff);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Partial_NullStart() {
        BaseSingleFieldPeriod.between(null, new LocalDate(2020, 1, 1), Days.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Partial_NullEnd() {
        BaseSingleFieldPeriod.between(new LocalDate(2020, 1, 1), null, Days.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Partial_DifferentSizes() {
        YearMonth ym = new YearMonth(2020, 1); // size 2
        LocalDate ld = new LocalDate(2020, 1, 1); // size 3
        BaseSingleFieldPeriod.between(ym, ld, Days.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Partial_DifferentFieldTypes() {
        Partial p1 = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Partial p2 = new Partial(DateTimeFieldType.minuteOfHour(), 10);
        BaseSingleFieldPeriod.between(p1, p2, Hours.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_Partial_NonContiguous() {
        // Non-contiguous partial: Year and Minute without Month/Day/Hour
        Partial nonContiguous = new Partial()
                .with(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.minuteOfHour(), 30);
        BaseSingleFieldPeriod.between(nonContiguous, nonContiguous, Days.ZERO);
    }

    // =========================================================================
    // 3. Tests for standardPeriodIn(ReadablePeriod, long)
    // =========================================================================

    @Test
    public void testStandardPeriodIn_NullPeriod() {
        int result = BaseSingleFieldPeriod.standardPeriodIn(null, 1000L);
        assertEquals(0, result);
    }

    @Test
    public void testStandardPeriodIn_ValidPrecisePeriods() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); // 1y, 2m, 3w, 4d, 5h, 6m, 7s, 8ms
        // Only precise fields should work: weeks(3), days(4), hours(5), minutes(6), seconds(7), millis(8)
        Period preciseOnly = new Period(0, 0, 1, 2, 3, 4, 5, 0); // 1w, 2d, 3h, 4m, 5s
        long millis = (1L * 7 * 24 * 3600 + 2L * 24 * 3600 + 3L * 3600 + 4L * 60 + 5L) * 1000L;
        
        int hoursResult = BaseSingleFieldPeriod.standardPeriodIn(preciseOnly, 3600000L);
        assertEquals((int) (millis / 3600000L), hoursResult);

        // Period with zero values everywhere
        Period zeroPeriod = Period.ZERO;
        assertEquals(0, BaseSingleFieldPeriod.standardPeriodIn(zeroPeriod, 1000L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStandardPeriodIn_ImpreciseField_Months() {
        Period p = Months.months(2).toPeriod();
        BaseSingleFieldPeriod.standardPeriodIn(p, 1000L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStandardPeriodIn_ImpreciseField_Years() {
        Period p = Period.years(1);
        BaseSingleFieldPeriod.standardPeriodIn(p, 1000L);
    }

    // =========================================================================
    // 4. Tests for Constructor, getValue, setValue, size, getFieldType, getValue(int)
    // =========================================================================

    @Test
    public void testGettersAndSetters() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        assertEquals(5, period.getValue());
        assertEquals(5, period.getValuePublic());
        
        period.setValuePublic(15);
        assertEquals(15, period.getValue());
        assertEquals(15, period.getValuePublic());

        assertEquals(1, period.size());
        assertEquals(DurationFieldType.days(), period.getFieldType(0));
        assertEquals(15, period.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_InvalidIndexPositive() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getFieldType(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_InvalidIndexNegative() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getFieldType(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_InvalidIndexPositive() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getValue(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_InvalidIndexNegative() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getValue(-1);
    }

    // =========================================================================
    // 5. Tests for get(DurationFieldType) & isSupported(DurationFieldType)
    // =========================================================================

    @Test
    public void testGetAndIsSupported() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(10);

        assertTrue(period.isSupported(DurationFieldType.days()));
        assertFalse(period.isSupported(DurationFieldType.hours()));
        assertFalse(period.isSupported(null));

        assertEquals(10, period.get(DurationFieldType.days()));
        assertEquals(0, period.get(DurationFieldType.hours()));
        assertEquals(0, period.get(null));
    }

    // =========================================================================
    // 6. Tests for toPeriod() and toMutablePeriod()
    // =========================================================================

    @Test
    public void testToPeriodAndToMutablePeriod() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        
        Period p = period.toPeriod();
        assertNotNull(p);
        assertEquals(7, p.getDays());
        assertEquals(0, p.getHours());

        MutablePeriod mp = period.toMutablePeriod();
        assertNotNull(mp);
        assertEquals(7, mp.getDays());
        assertEquals(0, mp.getHours());
    }

    // =========================================================================
    // 7. Tests for equals(Object) and hashCode()
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod period3 = new MockSingleFieldPeriod(20);
        AnotherSingleFieldPeriod differentType = new AnotherSingleFieldPeriod(10);

        // Same instance
        assertTrue(period1.equals(period1));

        // Equal content and type
        assertTrue(period1.equals(period2));
        assertEquals(period1.hashCode(), period2.hashCode());

        // Different values
        assertFalse(period1.equals(period3));
        assertFalse(period1.hashCode() == period3.hashCode());

        // Different PeriodType
        assertFalse(period1.equals(differentType));

        // Not an instance of ReadablePeriod
        assertFalse(period1.equals(null));
        assertFalse(period1.equals("Not a Period"));
    }

    // =========================================================================
    // 8. Tests for compareTo(BaseSingleFieldPeriod)
    // =========================================================================

    @Test
    public void testCompareTo_Normal() {
        MockSingleFieldPeriod p1 = new MockSingleFieldPeriod(5);
        MockSingleFieldPeriod p2 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod p3 = new MockSingleFieldPeriod(5);

        assertEquals(0, p1.compareTo(p3));
        assertEquals(-1, p1.compareTo(p2));
        assertEquals(1, p2.compareTo(p1));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_Null() {
        MockSingleFieldPeriod p1 = new MockSingleFieldPeriod(5);
        p1.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_DifferentClass() {
        MockSingleFieldPeriod p1 = new MockSingleFieldPeriod(5);
        AnotherSingleFieldPeriod p2 = new AnotherSingleFieldPeriod(5);
        p1.compareTo(p2);
    }
}