package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.Test;

public class DateTimeParserBucketTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone UTC = DateTimeZone.UTC;

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructorsAndDefaults() {
        // Constructor 1: 3 params (deprecated)
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, null, null);
        assertNotNull(bucket1.getChronology());
        assertEquals(Locale.getDefault(), bucket1.getLocale());
        assertNull(bucket1.getPivotYear());

        // Constructor 2: 4 params (deprecated)
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(1000L, ISOChronology.getInstance(PARIS), Locale.FRENCH, 2010);
        assertEquals(ISOChronology.getInstanceUTC(), bucket2.getChronology());
        assertEquals(Locale.FRENCH, bucket2.getLocale());
        assertEquals(Integer.valueOf(2010), bucket2.getPivotYear());
        assertEquals(PARIS, bucket2.getZone());

        // Constructor 3: 5 params
        DateTimeParserBucket bucket3 = new DateTimeParserBucket(2000L, BuddhistChronology.getInstanceUTC(), Locale.GERMAN, null, 1999);
        assertEquals(BuddhistChronology.getInstanceUTC(), bucket3.getChronology());
        assertEquals(Locale.GERMAN, bucket3.getLocale());
        assertNull(bucket3.getPivotYear());
    }

    @Test
    public void testSetAndGetPivotYear() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2000);
        assertNull(bucket.getPivotYear());
        bucket.setPivotYear(2025);
        assertEquals(Integer.valueOf(2025), bucket.getPivotYear());
        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSetZoneAndSetOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstance(PARIS), Locale.ENGLISH);
        assertEquals(PARIS, bucket.getZone());
        assertEquals(0, bucket.getOffset());

        // Setting UTC makes zone null
        bucket.setZone(UTC);
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());

        // Setting custom zone
        bucket.setZone(NEW_YORK);
        assertEquals(NEW_YORK, bucket.getZone());
        assertEquals(0, bucket.getOffset());

        // Setting offset clears zone
        bucket.setOffset(7200000);
        assertNull(bucket.getZone());
        assertEquals(7200000, bucket.getOffset());

        // Setting zone again resets offset
        bucket.setZone(PARIS);
        assertEquals(PARIS, bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSaveStateAndRestoreState() {
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket1.saveField(DateTimeFieldType.year(), 2021);
        Object state1 = bucket1.saveState();
        assertNotNull(state1);
        assertSame(state1, bucket1.saveState()); // cached state

        bucket1.saveField(DateTimeFieldType.monthOfYear(), 5);
        assertEquals(2, getSavedFieldsCount(bucket1));

        // Restore to state1 (count becomes 1, marks iSavedFieldsShared)
        boolean restored = bucket1.restoreState(state1);
        assertTrue(restored);
        assertEquals(1, getSavedFieldsCount(bucket1));

        // Save after restore to trigger array copy on shared state
        bucket1.saveField(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(2, getSavedFieldsCount(bucket1));

        // Invalid restores
        assertFalse(bucket1.restoreState(null));
        assertFalse(bucket1.restoreState("invalid_state"));

        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        assertFalse(bucket2.restoreState(state1)); // restoring state belonging to another bucket
    }

    @Test
    public void testArrayExpansionAndInsertionVsArraySort() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);

        // Save fields to trigger insertion sort (<= 10 fields)
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 10);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 20);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 12);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.year(), 2022);

        long computed = bucket.computeMillis(false);
        // Verify insertion sort correctly ordered fields from largest to smallest
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2022, 6, 15, 12, 20, 10, 0);
        assertEquals(expected, computed);

        // Exceed 8 fields (triggers array expansion) and exceed 10 fields (triggers Arrays.sort)
        bucket.saveField(DateTimeFieldType.millisOfSecond(), 500);
        bucket.saveField(DateTimeFieldType.centuryOfEra(), 20);
        bucket.saveField(DateTimeFieldType.era(), 1);
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 3);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 166); // 11th field
        bucket.saveField(DateTimeFieldType.weekOfWeekyear(), 24); // 12th field

        assertTrue(bucket.computeMillis(true) > 0);
    }

    @Test
    public void testDefaultYearInjectionForMonthAndDay() {
        // When largest field is month or day, base year (defaultYear = 2005) should be injected
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2005);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 10);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 25);

        long millis = bucket.computeMillis(true);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2005, 10, 25, 0, 0, 0, 0);
        assertEquals(expected, millis);
    }

    @Test
    public void testNoDefaultYearInjectionWhenYearOrHourPresent() {
        // Case 1: Year present -> Duration > months -> no default year injection
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2005);
        bucket1.saveField(DateTimeFieldType.year(), 2012);
        bucket1.saveField(DateTimeFieldType.monthOfYear(), 10);
        long millis1 = bucket1.computeMillis(true);
        assertEquals(ISOChronology.getInstanceUTC().getDateTimeMillis(2012, 10, 1, 0, 0, 0, 0), millis1);

        // Case 2: Only Hour present -> Duration < days -> no default year injection
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2005);
        bucket2.saveField(DateTimeFieldType.hourOfDay(), 14);
        long millis2 = bucket2.computeMillis(false);
        assertEquals(14 * 3600 * 1000L, millis2);
    }

    @Test
    public void testSaveTextFieldWithLocale() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, GJChronology.getInstanceUTC(), Locale.ENGLISH, null, 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "January", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);
        bucket.saveField(DateTimeFieldType.year(), 2020);

        long millis = bucket.computeMillis(false);
        long expected = GJChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 10, 0, 0, 0, 0);
        assertEquals(expected, millis);
    }

    @Test
    public void testComputeMillisWithOffsetAndZone() {
        // Using explicit offset
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket1.saveField(DateTimeFieldType.year(), 2020);
        bucket1.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket1.saveField(DateTimeFieldType.dayOfMonth(), 1);
        bucket1.setOffset(3600000); // UTC+1
        long millis1 = bucket1.computeMillis();
        long expected1 = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0, 0, 0, 0) - 3600000L;
        assertEquals(expected1, millis1);

        // Using Zone
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstance(PARIS), Locale.ENGLISH);
        bucket2.saveField(DateTimeFieldType.year(), 2020);
        bucket2.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket2.saveField(DateTimeFieldType.dayOfMonth(), 1);
        long millis2 = bucket2.computeMillis();
        long expected2 = ISOChronology.getInstance(PARIS).getDateTimeMillis(2020, 1, 1, 0, 0, 0, 0);
        assertEquals(expected2, millis2);
    }

    @Test
    public void testIllegalFieldValueExceptionHandling() {
        // With text
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket1.saveField(DateTimeFieldType.dayOfMonth(), 32);
        try {
            bucket1.computeMillis(false, "2020-01-32");
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            assertTrue(e.getMessage().contains("Cannot parse \"2020-01-32\""));
        }

        // Without text
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket2.saveField(DateTimeFieldType.dayOfMonth(), 32);
        try {
            bucket2.computeMillis(false, null);
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            assertFalse(e.getMessage().contains("Cannot parse"));
        }
    }

    @Test
    public void testDSTTransitionGapException() {
        // In America/New_York, 2021-03-14 02:30:00 does not exist due to DST spring forward (02:00 -> 03:00)
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstance(NEW_YORK), Locale.ENGLISH);
        bucket1.saveField(DateTimeFieldType.year(), 2021);
        bucket1.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket1.saveField(DateTimeFieldType.dayOfMonth(), 14);
        bucket1.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket1.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket1.computeMillis(false, "2021-03-14 02:30");
            fail("Expected IllegalArgumentException for DST gap");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot parse \"2021-03-14 02:30\""));
            assertTrue(e.getMessage().contains("Illegal instant due to time zone offset transition"));
        }

        // Without text
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstance(NEW_YORK), Locale.ENGLISH);
        bucket2.saveField(DateTimeFieldType.year(), 2021);
        bucket2.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket2.saveField(DateTimeFieldType.dayOfMonth(), 14);
        bucket2.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket2.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket2.computeMillis(false, null);
            fail("Expected IllegalArgumentException for DST gap");
        } catch (IllegalArgumentException e) {
            assertFalse(e.getMessage().contains("Cannot parse"));
            assertTrue(e.getMessage().contains("Illegal instant due to time zone offset transition"));
        }
    }

    @Test
    public void testCompareReverseBranches() {
        DurationField months = DurationFieldType.months().getField(ISOChronology.getInstanceUTC());
        DurationField days = DurationFieldType.days().getField(ISOChronology.getInstanceUTC());
        DurationField unsupported = UnsupportedDurationField.getInstance(DurationFieldType.months());

        // Both null or unsupported
        assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
        assertEquals(0, DateTimeParserBucket.compareReverse(unsupported, unsupported));
        assertEquals(0, DateTimeParserBucket.compareReverse(null, unsupported));
        assertEquals(0, DateTimeParserBucket.compareReverse(unsupported, null));

        // 'a' null/unsupported, 'b' supported -> -1
        assertEquals(-1, DateTimeParserBucket.compareReverse(null, months));
        assertEquals(-1, DateTimeParserBucket.compareReverse(unsupported, months));

        // 'a' supported, 'b' null/unsupported -> 1
        assertEquals(1, DateTimeParserBucket.compareReverse(months, null));
        assertEquals(1, DateTimeParserBucket.compareReverse(months, unsupported));

        // Both supported: months > days => compareReverse(months, days) should be negative
        assertTrue(DateTimeParserBucket.compareReverse(months, days) < 0);
        assertTrue(DateTimeParserBucket.compareReverse(days, months) > 0);
        assertEquals(0, DateTimeParserBucket.compareReverse(months, months));
    }

    @Test
    public void testSaveDirectDateTimeField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH);
        bucket.saveField(dayField, 18);
        bucket.saveField(chrono.monthOfYear(), 4);
        bucket.saveField(chrono.year(), 2023);

        long millis = bucket.computeMillis(false);
        assertEquals(chrono.getDateTimeMillis(2023, 4, 18, 0, 0, 0, 0), millis);
    }

    // Helper method to retrieve private field count for verification
    private int getSavedFieldsCount(DateTimeParserBucket bucket) {
        try {
            java.lang.reflect.Field field = DateTimeParserBucket.class.getDeclaredField("iSavedFieldsCount");
            field.setAccessible(true);
            return field.getInt(bucket);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}