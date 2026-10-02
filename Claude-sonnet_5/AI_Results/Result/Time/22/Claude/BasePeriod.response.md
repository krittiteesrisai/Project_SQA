# วิเคราะห์โค้ดเป้าหมาย

`BasePeriod` เป็น abstract class จึงต้องสร้าง subclass ช่วยทดสอบ (`TestPeriod`) ที่ expose protected method ผ่าน wrapper method เพื่อให้เข้าถึง constructor และ protected method ทั้งหมดได้ โดยวาง class นี้เป็น `static nested class` ใน `BasePeriodTest` (package เดียวกับ target class คือ `org.joda.time.base`)

```java
package org.joda.time.base;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;

/**
 * Unit tests for {@link BasePeriod}.
 * ทดสอบผ่าน subclass ช่วย (TestPeriod) ที่ expose protected API
 */
public class BasePeriodTest {

    /** Concrete helper subclass exposing protected members of BasePeriod */
    static class TestPeriod extends BasePeriod {

        TestPeriod(int years, int months, int weeks, int days,
                   int hours, int minutes, int seconds, int millis, PeriodType type) {
            super(years, months, weeks, days, hours, minutes, seconds, millis, type);
        }

        TestPeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
            super(startInstant, endInstant, type, chrono);
        }

        TestPeriod(ReadableInstant start, ReadableInstant end, PeriodType type) {
            super(start, end, type);
        }

        TestPeriod(ReadablePartial start, ReadablePartial end, PeriodType type) {
            super(start, end, type);
        }

        TestPeriod(ReadableInstant start, ReadableDuration duration, PeriodType type) {
            super(start, duration, type);
        }

        TestPeriod(ReadableDuration duration, ReadableInstant end, PeriodType type) {
            super(duration, end, type);
        }

        TestPeriod(long duration) {
            super(duration);
        }

        TestPeriod(long duration, PeriodType type, Chronology chrono) {
            super(duration, type, chrono);
        }

        TestPeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        TestPeriod(int[] values, PeriodType type) {
            super(values, type);
        }

        // ---- wrappers for protected methods ----
        void callSetPeriod(ReadablePeriod period) { setPeriod(period); }

        void callSetPeriod8(int y, int m, int w, int d, int h, int mi, int s, int ms) {
            setPeriod(y, m, w, d, h, mi, s, ms);
        }

        void callSetField(DurationFieldType field, int value) { setField(field, value); }

        void callSetFieldInto(int[] values, DurationFieldType field, int value) {
            setFieldInto(values, field, value);
        }

        void callAddField(DurationFieldType field, int value) { addField(field, value); }

        void callAddFieldInto(int[] values, DurationFieldType field, int value) {
            addFieldInto(values, field, value);
        }

        void callMergePeriod(ReadablePeriod period) { mergePeriod(period); }

        int[] callMergePeriodInto(int[] values, ReadablePeriod period) {
            return mergePeriodInto(values, period);
        }

        void callAddPeriod(ReadablePeriod period) { addPeriod(period); }

        int[] callAddPeriodInto(int[] values, ReadablePeriod period) {
            return addPeriodInto(values, period);
        }

        void callSetValue(int index, int value) { setValue(index, value); }

        void callSetValues(int[] values) { setValues(values); }

        PeriodType callCheckPeriodType(PeriodType type) { return checkPeriodType(type); }
    }

    //-----------------------------------------------------------------------
    // Constructor: 8 ints + PeriodType
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor8Ints_normal() {
        TestPeriod tp = new TestPeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(PeriodType.standard(), tp.getPeriodType());
        assertEquals(1, tp.getValue(0));
        assertEquals(2, tp.getValue(1));
        assertEquals(3, tp.getValue(2));
        assertEquals(4, tp.getValue(3));
        assertEquals(5, tp.getValue(4));
        assertEquals(6, tp.getValue(5));
        assertEquals(7, tp.getValue(6));
        assertEquals(8, tp.getValue(7));
    }

    @Test
    public void testConstructor8Ints_unsupportedFieldZero_ok() {
        // yearMonthDay ไม่รองรับ weeks/hours/minutes/seconds/millis
        // แต่ถ้าเป็นศูนย์ ต้องไม่ throw
        TestPeriod tp = new TestPeriod(1, 2, 0, 3, 0, 0, 0, 0, PeriodType.yearMonthDay());
        assertEquals(3, tp.size());
        assertEquals(1, tp.getValue(0));
        assertEquals(2, tp.getValue(1));
        assertEquals(3, tp.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor8Ints_unsupportedFieldNonZero_throws() {
        // weeks=5 แต่ yearMonthDay ไม่รองรับ weeks -> ต้อง throw
        new TestPeriod(1, 2, 5, 3, 0, 0, 0, 0, PeriodType.yearMonthDay());
    }

    @Test
    public void testConstructor8Ints_negativeValues_noValidation() {
        // โค้ดไม่ validate เครื่องหมาย ดังนั้นค่าลบต้องผ่านได้ปกติ
        TestPeriod tp = new TestPeriod(-1, -2, 0, -3, 0, 0, 0, 0, PeriodType.yearMonthDay());
        assertEquals(-1, tp.getValue(0));
        assertEquals(-2, tp.getValue(1));
        assertEquals(-3, tp.getValue(2));
    }

    //-----------------------------------------------------------------------
    // Constructor: long start, long end, PeriodType, Chronology
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorLongLong_withExplicitTypeAndChrono() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long start = 0L;
        long end = 86400000L; // +1 day
        TestPeriod tp = new TestPeriod(start, end, PeriodType.standard(), chrono);
        assertEquals(PeriodType.standard(), tp.getPeriodType());
        // index: years(0) months(1) weeks(2) days(3) hours(4)...
        assertEquals(0, tp.getValue(2)); // weeks
        assertEquals(1, tp.getValue(3)); // days
    }

    @Test
    public void testConstructorLongLong_nullTypeAndChrono_useDefaults() {
        TestPeriod tp = new TestPeriod(0L, 1000L, null, null);
        assertNotNull(tp.getPeriodType());
        assertNotNull(tp.getValues());
    }

    //-----------------------------------------------------------------------
    // Constructor: ReadableInstant start, ReadableInstant end, PeriodType
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorInstants_bothNull_allZero() {
        TestPeriod tp = new TestPeriod((ReadableInstant) null, (ReadableInstant) null, PeriodType.standard());
        assertEquals(PeriodType.standard(), tp.getPeriodType());
        for (int i = 0; i < tp.size(); i++) {
            assertEquals(0, tp.getValue(i));
        }
    }

    @Test
    public void testConstructorInstants_actualInstants() {
        DateTime start = new DateTime(0L, ISOChronology.getInstanceUTC());
        DateTime end = start.plusDays(1);
        TestPeriod tp = new TestPeriod(start, end, PeriodType.standard());
        assertEquals(1, tp.getValue(3)); // days index
    }

    //-----------------------------------------------------------------------
    // Constructor: ReadablePartial start, end, PeriodType
    //-----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPartials_nullStart_throws() {
        new TestPeriod((ReadablePartial) null, new LocalDate(2000, 1, 1), PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPartials_nullEnd_throws() {
        new TestPeriod(new LocalDate(2000, 1, 1), (ReadablePartial) null, PeriodType.standard());
    }

    @Test
    public void testConstructorPartials_sameClassBaseLocal_fastPath() {
        LocalDate start = new LocalDate(2000, 1, 1);
        LocalDate end = new LocalDate(2000, 1, 2);
        TestPeriod tp = new TestPeriod(start, end, PeriodType.standard());
        assertEquals(1, tp.getValue(3)); // days
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPartials_differentSize_throws() {
        LocalDate start = new LocalDate(2000, 1, 1);     // size 3
        LocalTime end = new LocalTime(10, 0, 0);          // size 4
        new TestPeriod(start, end, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPartials_differentFieldTypes_throws() {
        Partial p1 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2000, 1});
        Partial p2 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()},
                new int[]{2000, 1});
        new TestPeriod(p1, p2, PeriodType.standard());
    }

    // หมายเหตุ: กรณี "ReadablePartial objects must be contiguous" (isContiguous==false)
    // ไม่ได้เขียนเทสเนื่องจากไม่สามารถยืนยัน behavior ที่แท้จริงของ
    // DateTimeUtils.isContiguous จากซอร์สที่ให้มาได้อย่างชัดเจน (ป้องกันการเดา behavior)

    //-----------------------------------------------------------------------
    // Constructor: ReadableInstant + ReadableDuration
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorInstantDuration_normal() {
        DateTime start = new DateTime(0L, ISOChronology.getInstanceUTC());
        Duration dur = new Duration(86400000L);
        TestPeriod tp = new TestPeriod(start, dur, PeriodType.standard());
        assertEquals(1, tp.getValue(3)); // days
    }

    @Test
    public void testConstructorInstantDuration_nullInstantAndDuration_noException() {
        TestPeriod tp = new TestPeriod((ReadableInstant) null, (ReadableDuration) null, PeriodType.standard());
        assertNotNull(tp.getValues());
    }

    //-----------------------------------------------------------------------
    // Constructor: ReadableDuration + ReadableInstant
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorDurationInstant_normal() {
        DateTime end = new DateTime(86400000L, ISOChronology.getInstanceUTC());
        Duration dur = new Duration(86400000L);
        TestPeriod tp = new TestPeriod(dur, end, PeriodType.standard());
        assertEquals(1, tp.getValue(3)); // days
    }

    @Test
    public void testConstructorDurationInstant_nullDurationAndInstant_noException() {
        TestPeriod tp = new TestPeriod((ReadableDuration) null, (ReadableInstant) null, PeriodType.standard());
        assertNotNull(tp.getValues());
    }

    //-----------------------------------------------------------------------
    // Constructor: long duration (delegates to (duration,null,null))
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorSingleLongDuration_noException() {
        TestPeriod tp = new TestPeriod(3600000L); // 1 hour
        assertNotNull(tp.getPeriodType());
        assertEquals(1, tp.getValue(tp.getPeriodType().indexOf(DurationFieldType.hours())));
    }

    //-----------------------------------------------------------------------
    // Constructor: long duration, PeriodType, Chronology
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorLongDuration_withTypeAndChrono() {
        TestPeriod tp = new TestPeriod(3600000L, PeriodType.standard(), null);
        int hoursIdx = tp.getPeriodType().indexOf(DurationFieldType.hours());
        assertEquals(1, tp.getValue(hoursIdx));
    }

    @Test
    public void testConstructorLongDuration_withUTCChrono_dayPrecise() {
        Chronology utc = ISOChronology.getInstanceUTC();
        // 25 hours = 1 day 1 hour, dayTime type ไม่มี weeks
        TestPeriod tp = new TestPeriod(90000000L, PeriodType.dayTime(), utc);
        int daysIdx = tp.getPeriodType().indexOf(DurationFieldType.days());
        int hoursIdx = tp.getPeriodType().indexOf(DurationFieldType.hours());
        assertEquals(1, tp.getValue(daysIdx));
        assertEquals(1, tp.getValue(hoursIdx));
    }

    //-----------------------------------------------------------------------
    // Constructor: Object period, PeriodType, Chronology (via converter)
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorObject_nullType_usesConverterType() {
        Period source = new Period(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.standard());
        TestPeriod tp = new TestPeriod(source, null, null);
        assertEquals(source.getPeriodType(), tp.getPeriodType());
        assertEquals(1, tp.getValue(0));
        assertEquals(8, tp.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorObject_explicitType_unsupportedFieldNonZero_throws() {
        // source มี weeks=3 แต่ type yearMonthDay ไม่รองรับ weeks
        Period source = new Period(1, 2, 3, 4, 0, 0, 0, 0, PeriodType.standard());
        new TestPeriod(source, PeriodType.yearMonthDay(), null);
    }

    // หมายเหตุ: กรณี (this instanceof ReadWritablePeriod) == true ไม่ได้ทดสอบ
    // เนื่องจาก TestPeriod ไม่ได้ implement ReadWritablePeriod และการสร้าง
    // ReadWritablePeriod เต็มรูปแบบอยู่นอกเหนือขอบเขตคลาสเป้าหมายนี้

    //-----------------------------------------------------------------------
    // Constructor: int[] values, PeriodType (trust constructor)
    //-----------------------------------------------------------------------

    @Test
    public void testConstructorIntArray_direct() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        assertArrayEquals(values, tp.getValues());
        assertSame(PeriodType.standard(), tp.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // checkPeriodType
    //-----------------------------------------------------------------------

    @Test
    public void testCheckPeriodType_null_returnsStandard() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        assertEquals(PeriodType.standard(), tp.callCheckPeriodType(null));
    }

    @Test
    public void testCheckPeriodType_explicit_returnsSame() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        assertEquals(PeriodType.yearMonthDay(), tp.callCheckPeriodType(PeriodType.yearMonthDay()));
    }

    //-----------------------------------------------------------------------
    // size / getFieldType / getValue (boundary + invalid index)
    //-----------------------------------------------------------------------

    @Test
    public void testSize() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        assertEquals(8, tp.size());
    }

    @Test
    public void testGetFieldType_boundaryIndices() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        assertEquals(DurationFieldType.years(), tp.getFieldType(0));
        assertEquals(DurationFieldType.millis(), tp.getFieldType(7));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throws() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.getFieldType(8);
    }

    @Test
    public void testGetValue_boundaryIndices() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        assertEquals(1, tp.getValue(0));
        assertEquals(8, tp.getValue(7));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throws() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.getValue(-1);
    }

    //-----------------------------------------------------------------------
    // toDurationFrom / toDurationTo
    //-----------------------------------------------------------------------

    @Test
    public void testToDurationFrom_explicitInstant() {
        int[] values = {0, 0, 0, 1, 0, 0, 0, 0}; // 1 day
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        DateTime start = new DateTime(0L, ISOChronology.getInstanceUTC());
        Duration d = tp.toDurationFrom(start);
        assertEquals(86400000L, d.getMillis());
    }

    @Test
    public void testToDurationFrom_nullInstant_noException() {
        int[] values = {0, 0, 0, 1, 0, 0, 0, 0};
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        Duration d = tp.toDurationFrom(null);
        assertNotNull(d);
    }

    @Test
    public void testToDurationTo_explicitInstant() {
        int[] values = {0, 0, 0, 1, 0, 0, 0, 0}; // 1 day
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        DateTime end = new DateTime(86400000L, ISOChronology.getInstanceUTC());
        Duration d = tp.toDurationTo(end);
        assertEquals(86400000L, d.getMillis());
    }

    @Test
    public void testToDurationTo_nullInstant_noException() {
        int[] values = {0, 0, 0, 1, 0, 0, 0, 0};
        TestPeriod tp = new TestPeriod(values, PeriodType.standard());
        Duration d = tp.toDurationTo(null);
        assertNotNull(d);
    }

    //-----------------------------------------------------------------------
    // setPeriod(ReadablePeriod) / setPeriod(8 ints) -> checkAndUpdate branches
    //-----------------------------------------------------------------------

    @Test
    public void testSetPeriod_null_setsAllZero() {
        TestPeriod tp = new TestPeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        tp.callSetPeriod((ReadablePeriod) null);
        for (int i = 0; i < tp.size(); i++) {
            assertEquals(0, tp.getValue(i));
        }
    }

    @Test
    public void testSetPeriod_fromAnotherPeriod() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        Period source = new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.years());
        tp.callSetPeriod(source);
        assertEquals(1, tp.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod_unsupportedFieldNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        Period source = new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.weeks()); // weeks unsupported
        tp.callSetPeriod(source);
    }

    @Test
    public void testSetPeriod8Ints_direct() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.callSetPeriod8(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, tp.getValue(0));
        assertEquals(8, tp.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod8Ints_unsupportedFieldNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        tp.callSetPeriod8(0, 0, 1, 0, 0, 0, 0, 0); // weeks unsupported, nonzero
    }

    //-----------------------------------------------------------------------
    // setField / setFieldInto
    //-----------------------------------------------------------------------

    @Test
    public void testSetField_supported() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.callSetField(DurationFieldType.hours(), 5);
        int idx = tp.getPeriodType().indexOf(DurationFieldType.hours());
        assertEquals(5, tp.getValue(idx));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_unsupportedNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        tp.callSetField(DurationFieldType.hours(), 1);
    }

    @Test
    public void testSetField_unsupportedZero_noException() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        tp.callSetField(DurationFieldType.hours(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_nullField_throws() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.callSetField(null, 0);
    }

    @Test
    public void testSetFieldInto_directArray() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        int[] arr = new int[8];
        tp.callSetFieldInto(arr, DurationFieldType.minutes(), 30);
        int idx = tp.getPeriodType().indexOf(DurationFieldType.minutes());
        assertEquals(30, arr[idx]);
    }

    //-----------------------------------------------------------------------
    // addField / addFieldInto
    //-----------------------------------------------------------------------

    @Test
    public void testAddField_supported() {
        TestPeriod tp = new TestPeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        tp.callAddField(DurationFieldType.years(), 4);
        assertEquals(5, tp.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_unsupportedNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        tp.callAddField(DurationFieldType.hours(), 1);
    }

    @Test
    public void testAddField_unsupportedZero_noException() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        tp.callAddField(DurationFieldType.hours(), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddFieldInto_overflow_throws() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        int[] arr = new int[8];
        int idx = tp.getPeriodType().indexOf(DurationFieldType.years());
        arr[idx] = Integer.MAX_VALUE;
        tp.callAddFieldInto(arr, DurationFieldType.years(), 1);
    }

    //-----------------------------------------------------------------------
    // mergePeriod / mergePeriodInto
    //-----------------------------------------------------------------------

    @Test
    public void testMergePeriod_null_noChange() {
        TestPeriod tp = new TestPeriod(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        tp.callMergePeriod(null);
        assertEquals(1, tp.getValue(0));
        assertEquals(2, tp.getValue(1));
    }

    @Test
    public void testMergePeriod_overwritesMatchingFields() {
        TestPeriod tp = new TestPeriod(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        Period source = new Period(9, 0, 0, 0, 0, 0, 0, 0, PeriodType.years());
        tp.callMergePeriod(source);
        assertEquals(9, tp.getValue(0));
        assertEquals(2, tp.getValue(1)); // months untouched
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMergePeriodInto_unsupportedFieldNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        int[] values = new int[3];
        Period source = new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.weeks());
        tp.callMergePeriodInto(values, source);
    }

    //-----------------------------------------------------------------------
    // addPeriod / addPeriodInto
    //-----------------------------------------------------------------------

    @Test
    public void testAddPeriod_null_noChange() {
        TestPeriod tp = new TestPeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        tp.callAddPeriod(null);
        assertEquals(1, tp.getValue(0));
    }

    @Test
    public void testAddPeriod_sumsMatchingFields() {
        TestPeriod tp = new TestPeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        Period source = new Period(4, 0, 0, 0, 0, 0, 0, 0, PeriodType.years());
        tp.callAddPeriod(source);
        assertEquals(5, tp.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriodInto_unsupportedFieldNonZero_throws() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        int[] values = new int[3];
        Period source = new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.weeks());
        tp.callAddPeriodInto(values, source);
    }

    @Test
    public void testAddPeriodInto_unsupportedFieldZero_noException() {
        TestPeriod tp = new TestPeriod(new int[3], PeriodType.yearMonthDay());
        int[] values = new int[3];
        Period source = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.weeks()); // value=0 -> skip check
        int[] result = tp.callAddPeriodInto(values, source);
        assertNotNull(result);
    }

    //-----------------------------------------------------------------------
    // setValue / setValues
    //-----------------------------------------------------------------------

    @Test
    public void testSetValue_boundaryIndex() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.callSetValue(0, 10);
        tp.callSetValue(7, 20);
        assertEquals(10, tp.getValue(0));
        assertEquals(20, tp.getValue(7));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSetValue_invalidIndex_throws() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        tp.callSetValue(8, 1);
    }

    @Test
    public void testSetValues_replacesArray() {
        TestPeriod tp = new TestPeriod(new int[8], PeriodType.standard());
        int[] newValues = {1, 1, 1, 1, 1, 1, 1, 1};
        tp.callSetValues(newValues);
        assertArrayEquals(newValues, tp.getValues());
    }
}
```

# สรุปตารางความครอบคลุม (Branch/Condition)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor8Ints_normal | constructor(8 ints) path ปกติ, checkAndUpdate index≠-1 ทุก field |
| testConstructor8Ints_unsupportedFieldZero_ok | checkAndUpdate: index==-1 && value==0 (ไม่ throw) |
| testConstructor8Ints_unsupportedFieldNonZero_throws | checkAndUpdate: index==-1 && value!=0 (throw) |
| testConstructor8Ints_negativeValues_noValidation | ยืนยันไม่มี sign validation |
| testConstructorLongLong_* | constructor(long,long,type,chrono) ทั้ง null และไม่ null |
| testConstructorInstants_bothNull_allZero | if (start==null&&end==null) branch |
| testConstructorInstants_actualInstants | else branch ของ constructor(ReadableInstant,ReadableInstant) |
| testConstructorPartials_nullStart/End_throws | null check throw |
| testConstructorPartials_sameClassBaseLocal_fastPath | if (BaseLocal && sameClass) fast path |
| testConstructorPartials_differentSize_throws | start.size()!=end.size() throw |
| testConstructorPartials_differentFieldTypes_throws | for-loop field type mismatch throw |
| testConstructorInstantDuration_* / DurationInstant_* | constructor with duration, null/non-null |
| testConstructorSingleLongDuration_noException | this(duration,null,null) delegate |
| testConstructorLongDuration_* | constructor(long,type,chrono) ค่า chrono null/UTC |
| testConstructorObject_nullType_usesConverterType | type==null → converter.getPeriodType |
| testConstructorObject_explicitType_unsupported_throws | else-branch (ไม่ใช่ ReadWritablePeriod) + MutablePeriod throw |
| testConstructorIntArray_direct | constructor(int[],type) ตรง ๆ |
| testCheckPeriodType_* | null vs non-null |
| testGetFieldType_*/testGetValue_* | boundary index + IndexOutOfBounds |
| testToDurationFrom_*/testToDurationTo_* | explicit/null instant |
| testSetPeriod_null/fromPeriod/unsupportedThrows | setPeriod(ReadablePeriod) ทุก branch |
| testSetPeriod8Ints_* | setPeriod(8 ints) ปกติ/throw |
| testSetField_*/testSetFieldInto_* | index!=-1, ==-1&&value!=0, ==-1&&value==0, field==null |
| testAddField_*/testAddFieldInto_overflow | ปกติ, unsupported throw/no-throw, ArithmeticException (safeAdd) |
| testMergePeriod_*/testMergePeriodInto_* | null-skip, overwrite, unsupported throw |
| testAddPeriod_*/testAddPeriodInto_* | null-skip, sum, unsupported value!=0 throw, value==0 skip |
| testSetValue_*/testSetValues_* | boundary index, invalid index throw, replace array |

**หมายเหตุ:** กรณี `isContiguous==false` และกรณี `this instanceof ReadWritablePeriod==true` ไม่ได้ครอบคลุมเนื่องจากต้องใช้ความรู้เชิงลึกเกินกว่าซอร์สที่ให้มา (ป้องกันการเดา behavior ตามข้อกำหนด)