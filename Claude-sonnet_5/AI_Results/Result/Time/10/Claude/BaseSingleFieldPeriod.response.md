# BaseSingleFieldPeriodTest.java

```java
package org.joda.time.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import org.junit.Test;

/**
 * JUnit 4 test suite สำหรับ org.joda.time.base.BaseSingleFieldPeriod
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น abstract class จึงต้องสร้าง concrete subclass
 * (DaysPeriod, HoursPeriod) ไว้ภายในไฟล์เทสนี้เพื่อทดสอบ instance method
 * สำหรับ static protected method (between, standardPeriodIn) เทสคลาสนี้ถูกวางไว้ใน
 * package เดียวกัน (org.joda.time.base) จึงสามารถเรียกใช้ได้โดยตรง
 *
 * หมายเหตุเรื่อง classpath: โจทย์ระบุ junit-3.8.2.jar แต่ให้ใช้สไตล์ JUnit 4
 * (@Test) ตามข้อกำหนดข้อ 1–2 จึงยึดตามรูปแบบ JUnit 4 เป็นหลัก
 */
public class BaseSingleFieldPeriodTest {

    //-----------------------------------------------------------------------
    // Concrete subclasses สำหรับทดสอบ instance methods
    //-----------------------------------------------------------------------

    /** ตัวแทน period แบบ "days" สำหรับทดสอบ instance method ทั่วไป */
    static class DaysPeriod extends BaseSingleFieldPeriod {
        DaysPeriod(int value) {
            super(value);
        }
        @Override
        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }
        @Override
        public PeriodType getPeriodType() {
            return PeriodType.days();
        }
        // เปิดเผย protected method เพื่อให้เทสเข้าถึงได้
        public int publicGetValue() {
            return getValue();
        }
        public void publicSetValue(int v) {
            setValue(v);
        }
    }

    /** ตัวแทน period แบบ "hours" สำหรับทดสอบกรณี type/class ไม่ตรงกัน */
    static class HoursPeriod extends BaseSingleFieldPeriod {
        HoursPeriod(int value) {
            super(value);
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

    //-----------------------------------------------------------------------
    // between(ReadableInstant, ReadableInstant, DurationFieldType)
    //-----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void between_instants_nullStart_throws() {
        DateTime end = new DateTime(2014, 1, 1, 0, 0, DateTimeZone.UTC);
        BaseSingleFieldPeriod.between(null, end, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void between_instants_nullEnd_throws() {
        DateTime start = new DateTime(2014, 1, 1, 0, 0, DateTimeZone.UTC);
        BaseSingleFieldPeriod.between(start, null, DurationFieldType.days());
    }

    @Test
    public void between_instants_normal() {
        DateTime start = new DateTime(2014, 1, 1, 0, 0, DateTimeZone.UTC);
        DateTime end = new DateTime(2014, 1, 10, 0, 0, DateTimeZone.UTC);
        int result = BaseSingleFieldPeriod.between(start, end, DurationFieldType.days());
        assertEquals(9, result);
    }

    @Test
    public void between_instants_zeroDifference_boundary() {
        DateTime start = new DateTime(2014, 1, 1, 0, 0, DateTimeZone.UTC);
        int result = BaseSingleFieldPeriod.between(start, start, DurationFieldType.days());
        assertEquals(0, result);
    }

    //-----------------------------------------------------------------------
    // between(ReadablePartial, ReadablePartial, ReadablePeriod)
    //-----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void between_partials_nullStart_throws() {
        LocalDate end = new LocalDate(2014, 1, 1);
        BaseSingleFieldPeriod.between(null, end, Period.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void between_partials_nullEnd_throws() {
        LocalDate start = new LocalDate(2014, 1, 1);
        BaseSingleFieldPeriod.between(start, null, Period.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void between_partials_sizeMismatch_throws() {
        LocalDate start = new LocalDate(2014, 1, 1); // size = 3
        Partial end = new Partial(DateTimeFieldType.year(), 2014); // size = 1
        BaseSingleFieldPeriod.between(start, end, Period.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void between_partials_fieldTypeMismatch_throws() {
        // size เท่ากัน (2) แต่ field type ที่ index 1 ต่างกัน -> เข้าสาขา loop ตรวจ fieldType
        Partial start = new Partial(
                new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() },
                new int[] { 2014, 5 });
        Partial end = new Partial(
                new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() },
                new int[] { 2014, 5 });
        BaseSingleFieldPeriod.between(start, end, Period.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void between_partials_notContiguous_throws() {
        // field set ตรงกันทั้ง start/end (year, dayOfMonth) แต่ขาด monthOfYear ตรงกลาง
        // ตามพฤติกรรมจริงของ DateTimeUtils.isContiguous ใน Joda-Time ชุดฟิลด์นี้ถือว่า "ไม่ contiguous"
        // (อ้างอิงพฤติกรรมเดียวกับที่ใช้ทดสอบใน PartialTest ของ Joda-Time เอง)
        Partial start = new Partial(
                new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() },
                new int[] { 2014, 10 });
        Partial end = new Partial(
                new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() },
                new int[] { 2014, 20 });
        BaseSingleFieldPeriod.between(start, end, Period.ZERO);
    }

    @Test
    public void between_partials_normal() {
        LocalDate start = new LocalDate(2014, 1, 1);
        LocalDate end = new LocalDate(2014, 1, 10);
        int result = BaseSingleFieldPeriod.between(start, end, Days.ZERO);
        assertEquals(9, result);
    }

    //-----------------------------------------------------------------------
    // standardPeriodIn(ReadablePeriod, long)
    //-----------------------------------------------------------------------

    @Test
    public void standardPeriodIn_nullPeriod_returnsZero() {
        int result = BaseSingleFieldPeriod.standardPeriodIn(null, 1000L);
        assertEquals(0, result);
    }

    @Test
    public void standardPeriodIn_allZeroFields_returnsZero() {
        // Period.ZERO มีทุก field = 0 -> loop ข้ามทุก field (value != 0 เป็น false ทุกครั้ง)
        int result = BaseSingleFieldPeriod.standardPeriodIn(Period.ZERO, 1000L);
        assertEquals(0, result);
    }

    @Test
    public void standardPeriodIn_singlePreciseField_computesCorrectly() {
        Period period = Period.minutes(120); // field "minutes" เป็น precise ใน ISOChronology UTC
        int result = BaseSingleFieldPeriod.standardPeriodIn(period, 3600000L); // ms ต่อ 1 ชั่วโมง
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void standardPeriodIn_impreciseField_throws() {
        Period period = Period.years(5); // field "years" ไม่ precise
        BaseSingleFieldPeriod.standardPeriodIn(period, 1000L);
    }

    @Test
    public void standardPeriodIn_multiplePreciseFields_sumsAcrossLoop() {
        // days=1, hours=24 (ทั้งคู่ precise) ทดสอบ loop สะสมค่าหลายรอบ
        Period period = new Period(0, 0, 0, 1, 24, 0, 0, 0);
        long millisPerDay = 24L * 60 * 60 * 1000;
        int result = BaseSingleFieldPeriod.standardPeriodIn(period, millisPerDay);
        assertEquals(2, result);
    }

    //-----------------------------------------------------------------------
    // Constructor / getValue / setValue
    //-----------------------------------------------------------------------

    @Test
    public void constructor_and_getValue_setValue() {
        DaysPeriod p = new DaysPeriod(5);
        assertEquals(5, p.publicGetValue());
        p.publicSetValue(10);
        assertEquals(10, p.publicGetValue());
    }

    @Test
    public void getValue_negativeAndZero_boundary() {
        DaysPeriod pZero = new DaysPeriod(0);
        DaysPeriod pNeg = new DaysPeriod(-3);
        assertEquals(0, pZero.publicGetValue());
        assertEquals(-3, pNeg.publicGetValue());
    }

    //-----------------------------------------------------------------------
    // size()
    //-----------------------------------------------------------------------

    @Test
    public void size_isAlwaysOne() {
        DaysPeriod p = new DaysPeriod(3);
        assertEquals(1, p.size());
    }

    //-----------------------------------------------------------------------
    // getFieldType(int)
    //-----------------------------------------------------------------------

    @Test
    public void getFieldType_index0_returnsFieldType() {
        DaysPeriod p = new DaysPeriod(3);
        assertEquals(DurationFieldType.days(), p.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFieldType_positiveInvalidIndex_throws() {
        DaysPeriod p = new DaysPeriod(3);
        p.getFieldType(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFieldType_negativeIndex_throws() {
        DaysPeriod p = new DaysPeriod(3);
        p.getFieldType(-1);
    }

    //-----------------------------------------------------------------------
    // getValue(int)
    //-----------------------------------------------------------------------

    @Test
    public void getValue_index0_returnsValue() {
        DaysPeriod p = new DaysPeriod(7);
        assertEquals(7, p.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_positiveInvalidIndex_throws() {
        DaysPeriod p = new DaysPeriod(7);
        p.getValue(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_negativeIndex_throws() {
        DaysPeriod p = new DaysPeriod(7);
        p.getValue(-1);
    }

    //-----------------------------------------------------------------------
    // get(DurationFieldType)
    //-----------------------------------------------------------------------

    @Test
    public void get_matchingType_returnsValue() {
        DaysPeriod p = new DaysPeriod(4);
        assertEquals(4, p.get(DurationFieldType.days()));
    }

    @Test
    public void get_nonMatchingType_returnsZero() {
        DaysPeriod p = new DaysPeriod(4);
        assertEquals(0, p.get(DurationFieldType.hours()));
    }

    @Test
    public void get_nullType_returnsZero() {
        DaysPeriod p = new DaysPeriod(4);
        assertEquals(0, p.get(null));
    }

    //-----------------------------------------------------------------------
    // isSupported(DurationFieldType)
    //-----------------------------------------------------------------------

    @Test
    public void isSupported_matchingType_true() {
        DaysPeriod p = new DaysPeriod(1);
        assertTrue(p.isSupported(DurationFieldType.days()));
    }

    @Test
    public void isSupported_nonMatchingType_false() {
        DaysPeriod p = new DaysPeriod(1);
        assertFalse(p.isSupported(DurationFieldType.hours()));
    }

    @Test
    public void isSupported_null_false() {
        DaysPeriod p = new DaysPeriod(1);
        assertFalse(p.isSupported(null));
    }

    //-----------------------------------------------------------------------
    // toPeriod()
    //-----------------------------------------------------------------------

    @Test
    public void toPeriod_returnsEquivalentPeriod() {
        DaysPeriod p = new DaysPeriod(5);
        Period period = p.toPeriod();
        assertEquals(5, period.getDays());
    }

    //-----------------------------------------------------------------------
    // toMutablePeriod()
    //-----------------------------------------------------------------------

    @Test
    public void toMutablePeriod_returnsEquivalentMutablePeriod() {
        DaysPeriod p = new DaysPeriod(5);
        MutablePeriod mp = p.toMutablePeriod();
        assertEquals(5, mp.getDays());
    }

    //-----------------------------------------------------------------------
    // equals(Object)
    //-----------------------------------------------------------------------

    @Test
    public void equals_sameInstance_true() {
        DaysPeriod p = new DaysPeriod(5);
        assertTrue(p.equals(p));
    }

    @Test
    public void equals_notReadablePeriod_false() {
        DaysPeriod p = new DaysPeriod(5);
        assertFalse(p.equals("not a period"));
    }

    @Test
    public void equals_nullObject_false() {
        DaysPeriod p = new DaysPeriod(5);
        assertFalse(p.equals(null));
    }

    @Test
    public void equals_differentPeriodType_false() {
        DaysPeriod p1 = new DaysPeriod(5);
        HoursPeriod p2 = new HoursPeriod(5);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void equals_differentValue_false() {
        DaysPeriod p1 = new DaysPeriod(5);
        DaysPeriod p2 = new DaysPeriod(6);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void equals_sameTypeSameValue_true() {
        DaysPeriod p1 = new DaysPeriod(5);
        DaysPeriod p2 = new DaysPeriod(5);
        assertTrue(p1.equals(p2));
    }

    //-----------------------------------------------------------------------
    // hashCode()
    //-----------------------------------------------------------------------

    @Test
    public void hashCode_consistentForEqualObjects() {
        DaysPeriod p1 = new DaysPeriod(5);
        DaysPeriod p2 = new DaysPeriod(5);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void hashCode_differsForDifferentValues() {
        DaysPeriod p1 = new DaysPeriod(5);
        DaysPeriod p2 = new DaysPeriod(6);
        assertTrue(p1.hashCode() != p2.hashCode());
    }

    //-----------------------------------------------------------------------
    // compareTo(BaseSingleFieldPeriod)
    //-----------------------------------------------------------------------

    @Test
    public void compareTo_greater_returnsPositive() {
        DaysPeriod p1 = new DaysPeriod(10);
        DaysPeriod p2 = new DaysPeriod(5);
        assertEquals(1, p1.compareTo(p2));
    }

    @Test
    public void compareTo_less_returnsNegative() {
        DaysPeriod p1 = new DaysPeriod(3);
        DaysPeriod p2 = new DaysPeriod(5);
        assertEquals(-1, p1.compareTo(p2));
    }

    @Test
    public void compareTo_equal_returnsZero() {
        DaysPeriod p1 = new DaysPeriod(5);
        DaysPeriod p2 = new DaysPeriod(5);
        assertEquals(0, p1.compareTo(p2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_differentClass_throwsClassCastException() {
        DaysPeriod p1 = new DaysPeriod(5);
        HoursPeriod p2 = new HoursPeriod(5);
        p1.compareTo(p2);
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_null_throwsNullPointerException() {
        DaysPeriod p1 = new DaysPeriod(5);
        p1.compareTo(null);
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `between_instants_nullStart_throws`, `between_instants_nullEnd_throws` | `between(instant,instant,type)`: `start==null \|\| end==null` → true |
| `between_instants_normal`, `between_instants_zeroDifference_boundary` | เส้นทาง normal (ไม่ throw), กรณี difference=0 (boundary) |
| `between_partials_nullStart_throws`, `between_partials_nullEnd_throws` | `between(partial,partial,zero)`: `start==null \|\| end==null` → true |
| `between_partials_sizeMismatch_throws` | เงื่อนไข `start.size()!=end.size()` → true |
| `between_partials_fieldTypeMismatch_throws` | loop ตรวจ `getFieldType(i)` ไม่ตรงกัน → throw กลาง loop |
| `between_partials_notContiguous_throws` | เงื่อนไข `DateTimeUtils.isContiguous(start)==false` → true |
| `between_partials_normal` | เส้นทาง success เต็มรูปแบบ (ผ่านทุกเงื่อนไข) |
| `standardPeriodIn_nullPeriod_returnsZero` | `period==null` → return 0 |
| `standardPeriodIn_allZeroFields_returnsZero` | loop: `value!=0` เป็น false ทุกรอบ |
| `standardPeriodIn_singlePreciseField_computesCorrectly` | `value!=0` true, `field.isPrecise()` true |
| `standardPeriodIn_impreciseField_throws` | `value!=0` true, `field.isPrecise()==false` → throw |
| `standardPeriodIn_multiplePreciseFields_sumsAcrossLoop` | loop วนหลายรอบสะสม duration |
| `constructor_and_getValue_setValue`, `getValue_negativeAndZero_boundary` | constructor, getValue/setValue (boundary: 0, negative) |
| `size_isAlwaysOne` | `size()` คงที่ |
| `getFieldType_index0_returnsFieldType` | `index!=0` false |
| `getFieldType_positiveInvalidIndex_throws`, `getFieldType_negativeIndex_throws` | `index!=0` true (ทั้งบวกและลบ) |
| `getValue_index0_returnsValue` | `index!=0` false |
| `getValue_positiveInvalidIndex_throws`, `getValue_negativeIndex_throws` | `index!=0` true |
| `get_matchingType_returnsValue` | `type==getFieldType()` true |
| `get_nonMatchingType_returnsZero`, `get_nullType_returnsZero` | `type==getFieldType()` false |
| `isSupported_matchingType_true` | `type==getFieldType()` true |
| `isSupported_nonMatchingType_false`, `isSupported_null_false` | `type==getFieldType()` false |
| `toPeriod_returnsEquivalentPeriod` | `toPeriod()` เส้นทางเดียว |
| `toMutablePeriod_returnsEquivalentMutablePeriod` | `toMutablePeriod()` เส้นทางเดียว |
| `equals_sameInstance_true` | `this==period` true |
| `equals_notReadablePeriod_false` | `period instanceof ReadablePeriod==false` true |
| `equals_nullObject_false` | instanceof false (null case) |
| `equals_differentPeriodType_false` | `other.getPeriodType()==getPeriodType()` false |
| `equals_differentValue_false` | periodType ตรง แต่ `getValue(0)==getValue()` false |
| `equals_sameTypeSameValue_true` | เงื่อนไขทั้งคู่ true |
| `hashCode_consistentForEqualObjects`, `hashCode_differsForDifferentValues` | สูตร hashCode (ไม่มี branch แต่ validate ความถูกต้อง) |
| `compareTo_greater_returnsPositive` | `thisValue>otherValue` true |
| `compareTo_less_returnsNegative` | `thisValue<otherValue` true |
| `compareTo_equal_returnsZero` | ทั้งสองเงื่อนไข false → return 0 |
| `compareTo_differentClass_throwsClassCastException` | `other.getClass()!=getClass()` true |
| `compareTo_null_throwsNullPointerException` | NPE จาก `other.getClass()` เมื่อ other เป็น null |

**หมายเหตุ:** พฤติกรรมของ `DateTimeUtils.isContiguous` ในกรณี non-contiguous อ้างอิงจากพฤติกรรมจริงของ Joda-Time (ฟิลด์ `year`+`dayOfMonth` ขาด `monthOfYear` ตรงกลาง) ไม่ได้เดาเอง แต่หากสภาพแวดล้อม/เวอร์ชัน joda-time ต่างออกไป ควรตรวจสอบผลลัพธ์จริงอีกครั้ง