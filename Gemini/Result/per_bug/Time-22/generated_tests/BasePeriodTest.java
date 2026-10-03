package org.joda.time.base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasePeriodTest {

    // Concrete mock classes for testing protected constructors & methods
    private static class TestBasePeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;

        public TestBasePeriod(int y, int m, int w, int d, int h, int min, int sec, int mil, PeriodType type) {
            super(y, m, w, d, h, min, sec, mil, type);
        }

        public TestBasePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
            super(startInstant, endInstant, type, chrono);
        }

        public TestBasePeriod(ReadableInstant start, ReadableInstant end, PeriodType type) {
            super(start, end, type);
        }

        public TestBasePeriod(ReadablePartial start, ReadablePartial end, PeriodType type) {
            super(start, end, type);
        }

        public TestBasePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
            super(startInstant, duration, type);
        }

        public TestBasePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
            super(duration, endInstant, type);
        }

        public TestBasePeriod(long duration) {
            super(duration);
        }

        public TestBasePeriod(long duration, PeriodType type, Chronology chrono) {
            super(duration, type, chrono);
        }

        public TestBasePeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public TestBasePeriod(int[] values, PeriodType type) {
            super(values, type);
        }

        @Override
        public void setPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        @Override
        public void setPeriod(int y, int m, int w, int d, int h, int min, int sec, int mil) {
            super.setPeriod(y, m, w, d, h, min, sec, mil);
        }

        @Override
        public void setField(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        @Override
        public void addField(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        @Override
        public void mergePeriod(ReadablePeriod period) {
            super.mergePeriod(period);
        }

        @Override
        public void addPeriod(ReadablePeriod period) {
            super.addPeriod(period);
        }

        @Override
        public void setValue(int index, int value) {
            super.setValue(index, value);
        }

        @Override
        public void setValues(int[] values) {
            super.setValues(values);
        }
    }

    private static class TestReadWritableBasePeriod extends BasePeriod implements ReadWritablePeriod {
        private static final long serialVersionUID = 1L;

        public TestReadWritableBasePeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public void clear() {}
        public void setValue(int index, int value) { super.setValue(index, value); }
        public void set(DurationFieldType field, int value) { super.setField(field, value); }
        public void setPeriod(ReadablePeriod period) { super.setPeriod(period); }
        public void setPeriod(int y, int m, int w, int d, int h, int min, int sec, int mil) {
            super.setPeriod(y, m, w, d, h, min, sec, mil);
        }
        public void setYears(int years) {}
        public void setMonths(int months) {}
        public void setWeeks(int weeks) {}
        public void setDays(int days) {}
        public void setHours(int hours) {}
        public void setMinutes(int minutes) {}
        public void setSeconds(int seconds) {}
        public void setMillis(int millis) {}
        public void setPeriod(ReadableInterval interval) {}
        public void setPeriod(ReadableDuration duration) {}
        public void setPeriod(ReadableDuration duration, Chronology chrono) {}
        public void setPeriod(long duration) {}
        public void setPeriod(long duration, Chronology chrono) {}
        public void add(DurationFieldType field, int value) { super.addField(field, value); }
        public void add(ReadablePeriod period) { super.addPeriod(period); }
        public void add(int y, int m, int w, int d, int h, int min, int sec, int mil) {}
        public void add(ReadableInterval interval) {}
        public void add(ReadableDuration duration) {}
        public void add(ReadableDuration duration, Chronology chrono) {}
        public void add(long duration) {}
        public void add(long duration, Chronology chrono) {}
        public void addYears(int years) {}
        public void addMonths(int months) {}
        public void addWeeks(int weeks) {}
        public void addDays(int days) {}
        public void addHours(int hours) {}
        public void addMinutes(int minutes) {}
        public void addSeconds(int seconds) {}
        public void addMillis(int millis) {}
    }

    private static final long FIXED_TIME = 1000000000000L;

    @Before
    public void setUp() {
        DateTimeUtils.setCurrentMillisFixed(FIXED_TIME);
    }

    @After
    public void tearDown() {
        DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void testConstructor_8Ints_Standard() {
        TestBasePeriod p = new TestBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(8, p.size());
        assertEquals(1, p.getValue(0)); // years
        assertEquals(2, p.getValue(1)); // months
        assertEquals(3, p.getValue(2)); // weeks
        assertEquals(4, p.getValue(3)); // days
        assertEquals(5, p.getValue(4)); // hours
        assertEquals(6, p.getValue(5)); // minutes
        assertEquals(7, p.getValue(6)); // seconds
        assertEquals(8, p.getValue(7)); // millis
    }

    @Test
    public void testConstructor_8Ints_TypeWithZeroUnsupported() {
        // TimeOnly type: years, months, weeks, days must be 0
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.time());
        assertEquals(4, p.size());
        assertEquals(1, p.getValue(0));
        assertEquals(2, p.getValue(1));
        assertEquals(3, p.getValue(2));
        assertEquals(4, p.getValue(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_8Ints_UnsupportedFieldNonZero() {
        // hoursOnly period but years is 1 -> Exception
        new TestBasePeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
    }

    @Test
    public void testConstructor_LongLong_PeriodType_Chronology() {
        TestBasePeriod p = new TestBasePeriod(0L, 3600000L, PeriodType.hours(), ISOChronology.getInstanceUTC());
        assertEquals(1, p.size());
        assertEquals(1, p.getValue(0));
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableInstant_BothNull() {
        TestBasePeriod p = new TestBasePeriod((ReadableInstant) null, (ReadableInstant) null, PeriodType.standard());
        for (int i = 0; i < p.size(); i++) {
            assertEquals(0, p.getValue(i));
        }
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableInstant_NonNull() {
        Instant start = new Instant(0L);
        Instant end = new Instant(3661001L);
        TestBasePeriod p = new TestBasePeriod(start, end, PeriodType.standard());
        assertEquals(1, p.getPeriodType().getIndexedField(p, PeriodType.HOUR_INDEX));
        assertEquals(1, p.getPeriodType().getIndexedField(p, PeriodType.MINUTE_INDEX));
        assertEquals(1, p.getPeriodType().getIndexedField(p, PeriodType.SECOND_INDEX));
        assertEquals(1, p.getPeriodType().getIndexedField(p, PeriodType.MILLI_INDEX));
    }

    @Test
    public void testConstructor_ReadablePartial_BaseLocalSameClass() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalDate end = new LocalDate(2021, 3, 10);
        TestBasePeriod p = new TestBasePeriod(start, end, PeriodType.yearMonthDay());
        assertEquals(1, p.getValue(0)); // 1 year
        assertEquals(2, p.getValue(1)); // 2 months
        assertEquals(9, p.getValue(2)); // 9 days
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_Null() {
        new TestBasePeriod((ReadablePartial) null, new LocalDate(), PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_DifferentSize() {
        Partial p1 = new Partial(DateTimeFieldType.hourOfDay(), 1);
        Partial p2 = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {1, 2});
        new TestBasePeriod(p1, p2, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_DifferentFieldTypes() {
        Partial p1 = new Partial(DateTimeFieldType.hourOfDay(), 1);
        Partial p2 = new Partial(DateTimeFieldType.minuteOfHour(), 1);
        new TestBasePeriod(p1, p2, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_NonContiguous() {
        Partial p1 = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()}, new int[] {2020, 1});
        Partial p2 = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()}, new int[] {2020, 2});
        new TestBasePeriod(p1, p2, PeriodType.standard());
    }

    @Test
    public void testConstructor_ReadablePartial_NonBaseLocal_ValidContiguous() {
        YearMonth start = new YearMonth(2020, 1);
        YearMonth end = new YearMonth(2021, 4);
        TestBasePeriod p = new TestBasePeriod(start, end, PeriodType.yearMonthDay());
        assertEquals(1, p.getValue(0)); // 1 year
        assertEquals(3, p.getValue(1)); // 3 months
    }

    @Test
    public void testConstructor_Instant_Duration() {
        Instant start = new Instant(0L);
        Duration duration = new Duration(5000L);
        TestBasePeriod p = new TestBasePeriod(start, duration, PeriodType.standard());
        assertEquals(5, p.getValue(6)); // seconds index
    }

    @Test
    public void testConstructor_Duration_Instant() {
        Duration duration = new Duration(5000L);
        Instant end = new Instant(10000L);
        TestBasePeriod p = new TestBasePeriod(duration, end, PeriodType.standard());
        assertEquals(5, p.getValue(6)); // seconds index
    }

    @Test
    public void testConstructor_LongDuration() {
        TestBasePeriod p = new TestBasePeriod(3600000L);
        assertEquals(1, p.getValue(4)); // 1 hour in standard
    }

    @Test
    public void testConstructor_Object_NonReadWritable_And_ReadWritable() {
        Period base = Period.hours(2);
        TestBasePeriod p1 = new TestBasePeriod(base, PeriodType.standard(), null);
        assertEquals(2, p1.getValue(4));

        TestReadWritableBasePeriod p2 = new TestReadWritableBasePeriod(base, null, null);
        assertEquals(2, p2.getValue(4));
    }

    @Test
    public void testConstructor_IntArray_Direct() {
        int[] values = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        TestBasePeriod p = new TestBasePeriod(values, PeriodType.standard());
        assertArrayEquals(values, p.getValues());
        assertEquals(DurationFieldType.years(), p.getFieldType(0));
    }

    @Test
    public void testToDurationFromAndTo() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard());
        DateTime start = new DateTime(0L, ISOChronology.getInstanceUTC());
        Duration dFrom = p.toDurationFrom(start);
        assertEquals(7200000L, dFrom.getMillis());

        DateTime end = new DateTime(7200000L, ISOChronology.getInstanceUTC());
        Duration dTo = p.toDurationTo(end);
        assertEquals(7200000L, dTo.getMillis());
    }

    @Test
    public void testSetPeriod_NullAndNonNull() {
        TestBasePeriod p = new TestBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.setPeriod((ReadablePeriod) null);
        for (int val : p.getValues()) {
            assertEquals(0, val);
        }

        Period newP = new Period(2, 3, 0, 0, 0, 0, 0, 0);
        p.setPeriod(newP);
        assertEquals(2, p.getValue(0));
        assertEquals(3, p.getValue(1));

        p.setPeriod(1, 1, 1, 1, 1, 1, 1, 1);
        for (int val : p.getValues()) {
            assertEquals(1, val);
        }
    }

    @Test
    public void testSetField_And_AddField() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        p.setField(DurationFieldType.hours(), 5);
        assertEquals(5, p.getValue(0));

        p.addField(DurationFieldType.hours(), 3);
        assertEquals(8, p.getValue(0));

        // Unsupported field with value 0 should be no-op
        p.setField(DurationFieldType.years(), 0);
        p.addField(DurationFieldType.years(), 0);

        p.setValue(0, 10);
        assertEquals(10, p.getValue(0));

        p.setValues(new int[] {20});
        assertEquals(20, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_UnsupportedNonZero() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        p.setField(DurationFieldType.years(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_NullField() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        p.setField(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_UnsupportedNonZero() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        p.addField(DurationFieldType.years(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_NullField() {
        TestBasePeriod p = new TestBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        p.addField(null, 0);
    }

    @Test
    public void testMergePeriod() {
        TestBasePeriod p = new TestBasePeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.mergePeriod(null); // null does nothing
        assertEquals(1, p.getValue(0));

        Period other = new Period(0, 5, 0, 0, 0, 0, 0, 0);
        p.mergePeriod(other);
        assertEquals(1, p.getValue(0));
        assertEquals(5, p.getValue(1));
    }

    @Test
    public void testAddPeriod() {
        TestBasePeriod p = new TestBasePeriod(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.addPeriod(null); // null does nothing
        assertEquals(1, p.getValue(0));

        Period other = new Period(2, 3, 0, 0, 0, 0, 0, 0);
        p.addPeriod(other);
        assertEquals(3, p.getValue(0));
        assertEquals(5, p.getValue(1));

        // Add with 0 unsupported field should pass
        TestBasePeriod pTime = new TestBasePeriod(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.hours());
        Period zeroYears = new Period(0, 0, 0, 0, 2, 0, 0, 0);
        pTime.addPeriod(zeroYears);
        assertEquals(3, pTime.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriod_UnsupportedNonZero() {
        TestBasePeriod pTime = new TestBasePeriod(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.hours());
        Period nonZeroYears = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        pTime.addPeriod(nonZeroYears);
    }

    @Test
    public void testSerialization() throws Exception {
        TestBasePeriod p = new TestBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TestBasePeriod deserialized = (TestBasePeriod) ois.readObject();
        ois.close();

        assertEquals(p.getPeriodType(), deserialized.getPeriodType());
        assertArrayEquals(p.getValues(), deserialized.getValues());
    }
}