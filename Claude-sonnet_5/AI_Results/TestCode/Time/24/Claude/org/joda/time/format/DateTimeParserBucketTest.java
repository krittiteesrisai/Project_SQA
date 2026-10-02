package org.joda.time.format;

import static org.junit.Assert.*;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;

import org.junit.Test;

// import คลาสเป้าหมายให้ถูกต้อง (อยู่ package เดียวกัน แต่ import ไว้ตามข้อกำหนด)
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.format.DateTimeParserBucket.SavedField;

/**
 * JUnit4 test สำหรับ DateTimeParserBucket (Time-24b)
 * หมายเหตุ: วาง test class ไว้ package เดียวกับ target class (org.joda.time.format)
 * เพื่อให้เข้าถึง package-private method/class (compareReverse, SavedField, SavedState)
 * สำหรับ white-box testing ซึ่งช่วยให้ครอบคลุม branch ที่ไม่สามารถ trigger ได้จาก public API เพียงอย่างเดียว
 */
@SuppressWarnings("deprecation")
public class DateTimeParserBucketTest {

    private DateTimeParserBucket newBucket() {
        return new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US, null, 2000);
    }

    // =====================================================================
    // Group A: Constructors
    // =====================================================================

    @Test
    public void testDeprecatedConstructor3Args() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        assertEquals(Locale.US, bucket.getLocale());
        assertNull(bucket.getPivotYear()); // delegate ด้วย pivotYear=null
        assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
    }

    @Test
    public void testDeprecatedConstructor4Args() {
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US, 1950);
        assertEquals(Integer.valueOf(1950), bucket.getPivotYear());
    }

    @Test
    public void testFullConstructorNullLocaleUsesSystemDefault() {
        Locale original = Locale.getDefault();
        try {
            Locale.setDefault(Locale.GERMANY);
            DateTimeParserBucket bucket =
                    new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), null, null, 2000);
            assertEquals(Locale.GERMANY, bucket.getLocale()); // branch: locale==null
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testFullConstructorNonNullLocaleAndPivotYear() {
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.FRANCE, 1980, 1999);
        assertEquals(Locale.FRANCE, bucket.getLocale()); // branch: locale!=null
        assertEquals(Integer.valueOf(1980), bucket.getPivotYear());
    }

    @Test
    public void testConstructorNullChronologyUsesISOUTCAndNullZone() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, Locale.US, null, 2000);
        assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        assertNull(bucket.getZone()); // chrono default zone มักเป็น UTC -> setZone(UTC) -> null
    }

    @Test
    public void testConstructorInitialZoneNonUTCChronology() {
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(0L, ISOChronology.getInstance(tokyo), Locale.US, null, 2000);
        assertEquals(tokyo, bucket.getZone()); // branch: zone != UTC
    }

    @Test
    public void testGetChronologyReturnsUTCVariant() {
        DateTimeParserBucket bucket = newBucket();
        assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
    }

    // =====================================================================
    // Group B: getter/setter ของ zone, offset, pivotYear
    // =====================================================================

    @Test
    public void testSetZoneUTCBranchReturnsNullZone() {
        DateTimeParserBucket bucket = newBucket();
        bucket.setZone(DateTimeZone.UTC);
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSetZoneNonUTCBranchReturnsSameZone() {
        DateTimeParserBucket bucket = newBucket();
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        bucket.setZone(paris);
        assertEquals(paris, bucket.getZone());
    }

    @Test
    public void testSetZoneNullArgumentBranch() {
        DateTimeParserBucket bucket = newBucket();
        bucket.setZone(null); // null != DateTimeZone.UTC -> else branch, ผลลัพธ์ null เช่นกัน
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetZoneResetsOffsetToZero() {
        DateTimeParserBucket bucket = newBucket();
        bucket.setOffset(5000);
        assertEquals(5000, bucket.getOffset());
        bucket.setZone(DateTimeZone.forID("Europe/London"));
        assertEquals(0, bucket.getOffset()); // setZone ต้อง reset offset
    }

    @Test
    public void testSetOffsetAndZoneNulledOut() {
        DateTimeParserBucket bucket = newBucket();
        bucket.setZone(DateTimeZone.forID("Europe/Paris"));
        bucket.setOffset(3600000);
        assertEquals(3600000, bucket.getOffset());
        assertNull(bucket.getZone()); // setOffset ต้อง reset zone เป็น null
    }

    @Test
    public void testGetOffsetDefaultIsZero() {
        DateTimeParserBucket bucket = newBucket();
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testPivotYearGetterSetterIncludingNull() {
        DateTimeParserBucket bucket = newBucket();
        assertNull(bucket.getPivotYear());
        bucket.setPivotYear(1975);
        assertEquals(Integer.valueOf(1975), bucket.getPivotYear());
        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    // =====================================================================
    // Group C: saveField (3 overloads) + array growth / shared flag
    // =====================================================================

    @Test
    public void testSaveFieldByDateTimeFieldAndValue() {
        DateTimeParserBucket bucket = newBucket();
        DateTimeField field = DateTimeFieldType.hourOfDay().getField(bucket.getChronology());
        bucket.saveField(field, 10);
        long millis = bucket.computeMillis();
        assertEquals(10 * 3600000L, millis);
    }

    @Test
    public void testSaveFieldByFieldTypeAndValue() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);
        long millis = bucket.computeMillis();
        assertEquals(30 * 60000L, millis);
    }

    @Test
    public void testSaveFieldByFieldTypeTextLocaleTriggersDefaultYear() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.monthOfYear(), "February", Locale.US);
        long millis = bucket.computeMillis();
        // monthOfYear เป็น field แรกและมี durationField=months -> trigger การเติม year=default(2000)
        long expected = new DateTime(2000, 2, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test
    public void testSaveFieldArrayGrowsBeyondInitialCapacityOfEight() {
        DateTimeParserBucket bucket = newBucket();
        // บันทึก field ชนิดเดียวกัน 9 ครั้ง (เกิน initial capacity=8) -> trigger expand branch
        for (int i = 1; i <= 9; i++) {
            bucket.saveField(DateTimeFieldType.secondOfMinute(), i);
        }
        long millis = bucket.computeMillis();
        // priority เท่ากันทั้งหมด -> stable sort -> ค่าสุดท้ายที่บันทึกชนะ
        assertEquals(9 * 1000L, millis);
    }

    // =====================================================================
    // Group D: saveState / restoreState
    // =====================================================================

    @Test
    public void testSaveStateCreatesNewInstanceAfterModificationResetsState() {
        DateTimeParserBucket bucket = newBucket();
        Object state1 = bucket.saveState();             // iSavedState null -> สร้างใหม่
        bucket.saveField(DateTimeFieldType.hourOfDay(), 1); // reset iSavedState = null
        Object state2 = bucket.saveState();              // null อีกครั้ง -> สร้างใหม่
        assertNotSame(state1, state2);
    }

    @Test
    public void testSaveStateReturnsSameInstanceWhenCalledTwiceWithoutModification() {
        DateTimeParserBucket bucket = newBucket();
        Object state1 = bucket.saveState();
        Object state2 = bucket.saveState(); // iSavedState != null -> คืน instance เดิม
        assertSame(state1, state2);
    }

    @Test
    public void testRestoreStateWithForeignObjectReturnsFalse() {
        DateTimeParserBucket bucket = newBucket();
        assertFalse(bucket.restoreState("not a SavedState")); // instanceof false
    }

    @Test
    public void testRestoreStateWithNullReturnsFalse() {
        DateTimeParserBucket bucket = newBucket();
        assertFalse(bucket.restoreState(null));
    }

    @Test
    public void testRestoreStateMismatchedEnclosingInstanceReturnsFalse() {
        DateTimeParserBucket bucketA = newBucket();
        DateTimeParserBucket bucketB = newBucket();
        Object stateFromA = bucketA.saveState();
        // state ของ bucketA ไปใช้กับ bucketB -> instanceof true แต่ enclosing != this -> false
        assertFalse(bucketB.restoreState(stateFromA));
    }

    @Test
    public void testRestoreStateWithoutCountDecreaseDoesNotSetSharedFlag() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.hourOfDay(), 5);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 10);
        Object state = bucket.saveState(); // count=2
        boolean restored = bucket.restoreState(state); // count คงที่ 2 -> ไม่ set shared flag
        assertTrue(restored);
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 20);
        long millis = bucket.computeMillis();
        long expected = new DateTime(1970, 1, 1, 5, 10, 20, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test
    public void testRestoreStateSetsSharedFlagWhenCountDecreases_andSaveFieldClonesArray() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.hourOfDay(), 1);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 1);
        Object state = bucket.saveState();                        // count=2
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 59);  // count=3
        boolean restored = bucket.restoreState(state);             // 2<3 -> shared flag = true
        assertTrue(restored);
        // saveField ครั้งถัดไปต้อง clone array เพราะ shared flag (count(2)!=length(8) แต่ shared=true)
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 30);
        long millis = bucket.computeMillis();
        long expected = new DateTime(1970, 1, 1, 1, 1, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test
    public void testRestoreStateSuccessfullyRestoresZoneOffsetAndFields() {
        DateTimeParserBucket bucket = newBucket();
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        bucket.setZone(paris);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 5);
        Object state = bucket.saveState();

        bucket.setZone(DateTimeZone.forID("Asia/Tokyo"));
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        boolean restored = bucket.restoreState(state);
        assertTrue(restored);
        assertEquals(paris, bucket.getZone());

        long millis = bucket.computeMillis();
        long localAfterHour = new DateTime(1970, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long expected = localAfterHour - paris.getOffsetFromLocal(localAfterHour);
        assertEquals(expected, millis);
    }

    // =====================================================================
    // Group E: computeMillis - core branches
    // =====================================================================

    @Test
    public void testComputeMillisNoSavedFieldsReturnsBaseMillisAdjustedByOffset() {
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(123456L, ISOChronology.getInstanceUTC(), Locale.US, null, 2000);
        bucket.setOffset(1000);
        long millis = bucket.computeMillis(); // count==0 -> skip special block
        assertEquals(123456L - 1000, millis);
    }

    @Test
    public void testComputeMillisFirstFieldNotMonthOrDayDoesNotAddDefaultYear() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.hourOfDay(), 5);
        long millis = bucket.computeMillis();
        long expected = new DateTime(1970, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis); // ยังอยู่ปี 1970 แสดงว่าไม่ถูกเติม year=2000
    }

    @Test
    public void testComputeMillisFirstFieldDayOfMonthTriggersDefaultYear() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        long millis = bucket.computeMillis();
        long expected = new DateTime(2000, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test
    public void testComputeMillisFieldOrderingFollowsRangeAndDurationPriority() {
        DateTimeParserBucket bucket = newBucket();
        // ตาม javadoc: บันทึก dayOfWeek, monthOfYear, dayOfMonth, dayOfYear
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 3);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 100);
        long millis = bucket.computeMillis();
        Chronology chrono = bucket.getChronology();
        // dayOfWeek ถูก apply ท้ายสุดตามลำดับ priority -> ค่าต้อง "ติด" อยู่
        assertEquals(3, chrono.dayOfWeek().get(millis));
    }

    @Test
    public void testComputeMillisResetFieldsTrueVsFalse() {
        long base = 10 * 3600000L + 25 * 60000L + 15000L; // 10:25:15
        DateTimeParserBucket bucketNoReset =
                new DateTimeParserBucket(base, ISOChronology.getInstanceUTC(), Locale.US, null, 2000);
        bucketNoReset.saveField(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(base, bucketNoReset.computeMillis(false));

        DateTimeParserBucket bucketReset =
                new DateTimeParserBucket(base, ISOChronology.getInstanceUTC(), Locale.US, null, 2000);
        bucketReset.saveField(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(10 * 3600000L, bucketReset.computeMillis(true)); // roundFloor ตัดนาที/วินาที
    }

    @Test
    public void testComputeMillisIllegalFieldValueWithTextPrependsMessage() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13); // ค่าผิดช่วง (1-12)
        try {
            bucket.computeMillis(false, "invalid-text");
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            // หมายเหตุ: รูปแบบ message ขึ้นกับ IllegalFieldValueException.prependMessage()
            // ซึ่งเป็น behavior ของคลาสอื่น ไม่ใช่ target class โดยตรง จึงตรวจแบบ soft (contains)
            assertTrue(e.getMessage().contains("Cannot parse \"invalid-text\""));
        }
    }

    @Test
    public void testComputeMillisIllegalFieldValueWithoutTextDoesNotPrepend() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);
        try {
            bucket.computeMillis(); // text == null -> ไม่ prepend
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            assertFalse(e.getMessage().contains("Cannot parse"));
        }
    }

    @Test
    public void testComputeMillisWithNonNullZoneAppliesOffsetNormally() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        long localMillis = new DateTime(2020, 6, 15, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(localMillis, ISOChronology.getInstance(paris), Locale.US, null, 2000);
        long millis = bucket.computeMillis();
        int offset = paris.getOffsetFromLocal(localMillis);
        assertEquals(localMillis - offset, millis);
    }

    @Test
    public void testComputeMillisZoneOffsetTransitionThrowsIllegalArgumentException() {
        // หมายเหตุ: อ้างอิง tzdata จริงของ America/New_York (DST gap 2011-03-13 02:00-03:00)
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        long localMillis = new DateTime(2011, 3, 13, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(localMillis, ISOChronology.getInstance(newYork), Locale.US, null, 2000);
        try {
            bucket.computeMillis();
            fail("Expected IllegalArgumentException due to DST gap");
        } catch (IllegalArgumentException e) {
            // message นี้สร้างโดยตรงใน source ที่ให้มา จึงตรวจแบบ exact ได้
            assertEquals("Illegal instant due to time zone offset transition (" + newYork + ")",
                    e.getMessage());
        }
    }

    @Test
    public void testComputeMillisZoneOffsetTransitionWithTextPrependsMessage() {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        long localMillis = new DateTime(2011, 3, 13, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        DateTimeParserBucket bucket =
                new DateTimeParserBucket(localMillis, ISOChronology.getInstance(newYork), Locale.US, null, 2000);
        try {
            bucket.computeMillis(false, "2011-03-13T02:30:00");
            fail("Expected IllegalArgumentException due to DST gap");
        } catch (IllegalArgumentException e) {
            assertEquals(
                "Cannot parse \"2011-03-13T02:30:00\": Illegal instant due to time zone offset transition (" + newYork + ")",
                e.getMessage());
        }
    }

    // =====================================================================
    // Group F: sort() (ทางอ้อมผ่าน computeMillis) - insertion sort vs Arrays.sort
    // =====================================================================

    @Test
    public void testComputeMillisInsertionSortReordersFieldsWithSwap() {
        DateTimeParserBucket bucket = newBucket();
        // บันทึกผิดลำดับ priority (minute ก่อน hour) เพื่อ trigger swap ใน insertion sort
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 45);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10);
        long millis = bucket.computeMillis();
        long expected = new DateTime(1970, 1, 1, 10, 45, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test
    public void testComputeMillisSingleFieldNoSortSwapNeeded() {
        DateTimeParserBucket bucket = newBucket();
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 42);
        long millis = bucket.computeMillis();
        assertEquals(42000L, millis);
    }

    @Test
    public void testComputeMillisWithMoreThanTenSavedFieldsUsesMergeSortPath() {
        DateTimeParserBucket bucket = newBucket();
        for (int i = 0; i < 11; i++) { // high > 10 -> ใช้ Arrays.sort
            bucket.saveField(DateTimeFieldType.secondOfMinute(), i);
        }
        long millis = bucket.computeMillis();
        assertEquals(10 * 1000L, millis); // stable sort -> ค่าสุดท้ายชนะ
    }

    // =====================================================================
    // Group G: compareReverse (white-box, package-private)
    // =====================================================================

    @Test
    public void testCompareReverseBothNull() {
        assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
    }

    @Test
    public void testCompareReverseBothUnsupported() {
        DurationField a = UnsupportedDurationField.getInstance(DurationFieldType.months());
        DurationField b = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(0, DateTimeParserBucket.compareReverse(a, b));
    }

    @Test
    public void testCompareReverseANullBSupported() {
        DurationField b = ISOChronology.getInstanceUTC().hours();
        assertEquals(-1, DateTimeParserBucket.compareReverse(null, b));
    }

    @Test
    public void testCompareReverseAUnsupportedBSupported() {
        DurationField a = UnsupportedDurationField.getInstance(DurationFieldType.months());
        DurationField b = ISOChronology.getInstanceUTC().hours();
        assertEquals(-1, DateTimeParserBucket.compareReverse(a, b));
    }

    @Test
    public void testCompareReverseASupportedBNull() {
        DurationField a = ISOChronology.getInstanceUTC().hours();
        assertEquals(1, DateTimeParserBucket.compareReverse(a, null));
    }

    @Test
    public void testCompareReverseASupportedBUnsupported() {
        DurationField a = ISOChronology.getInstanceUTC().hours();
        DurationField b = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertEquals(1, DateTimeParserBucket.compareReverse(a, b));
    }

    @Test
    public void testCompareReverseBothSupportedEqual() {
        DurationField a = ISOChronology.getInstanceUTC().hours();
        DurationField b = ISOChronology.getInstanceUTC().hours();
        assertEquals(0, DateTimeParserBucket.compareReverse(a, b));
    }

    @Test
    public void testCompareReverseBothSupportedAGreaterRange() {
        DurationField a = ISOChronology.getInstanceUTC().days();  // ยาวกว่า hours
        DurationField b = ISOChronology.getInstanceUTC().hours();
        assertTrue(DateTimeParserBucket.compareReverse(a, b) < 0);
    }

    @Test
    public void testCompareReverseBothSupportedALessRange() {
        DurationField a = ISOChronology.getInstanceUTC().hours();
        DurationField b = ISOChronology.getInstanceUTC().days();
        assertTrue(DateTimeParserBucket.compareReverse(a, b) > 0);
    }

    // =====================================================================
    // Group H: SavedField.compareTo / set (white-box, package-private nested class)
    // =====================================================================

    @Test
    public void testSavedFieldCompareToRangeDifferent() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField monthField = DateTimeFieldType.monthOfYear().getField(chrono); // range=years
        DateTimeField hourField = DateTimeFieldType.hourOfDay().getField(chrono);    // range=days
        SavedField monthSaved = new SavedField(monthField, 5);
        SavedField hourSaved = new SavedField(hourField, 5);
        assertTrue(monthSaved.compareTo(hourSaved) < 0); // years ยาวกว่า days -> month มาก่อน
        assertTrue(hourSaved.compareTo(monthSaved) > 0);
    }

    @Test
    public void testSavedFieldCompareToRangeEqualDurationDifferent() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField hourOfDayField = DateTimeFieldType.hourOfDay().getField(chrono);   // range=days,duration=hours
        DateTimeField minuteOfDayField = DateTimeFieldType.minuteOfDay().getField(chrono); // range=days,duration=minutes
        SavedField hourSaved = new SavedField(hourOfDayField, 1);
        SavedField minuteSaved = new SavedField(minuteOfDayField, 1);
        assertTrue(hourSaved.compareTo(minuteSaved) < 0);  // range เท่ากัน -> duration ยาวกว่าชนะ
        assertTrue(minuteSaved.compareTo(hourSaved) > 0);
    }

    @Test
    public void testSavedFieldCompareToFullyEqualPriority() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField f = DateTimeFieldType.secondOfMinute().getField(chrono);
        SavedField s1 = new SavedField(f, 1);
        SavedField s2 = new SavedField(f, 2);
        assertEquals(0, s1.compareTo(s2));
    }

    @Test
    public void testSavedFieldSetValueNoReset() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField hourField = DateTimeFieldType.hourOfDay().getField(chrono);
        SavedField sf = new SavedField(hourField, 5);
        long result = sf.set(0L, false);
        assertEquals(5 * 3600000L, result);
    }

    @Test
    public void testSavedFieldSetValueWithReset() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField hourField = DateTimeFieldType.hourOfDay().getField(chrono);
        SavedField sf = new SavedField(hourField, 5);
        long start = 5 * 3600000L + 30 * 60000L; // 05:30:00
        long result = sf.set(start, true); // reset=true -> roundFloor ตัดนาทีทิ้ง
        assertEquals(5 * 3600000L, result);
    }

    @Test
    public void testSavedFieldSetTextLocale() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField monthField = DateTimeFieldType.monthOfYear().getField(chrono);
        SavedField sf = new SavedField(monthField, "February", Locale.US);
        long result = sf.set(0L, false);
        long expected = new DateTime(1970, 2, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }
}
