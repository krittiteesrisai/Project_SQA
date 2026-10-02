# คำอธิบาย

ผมได้วิเคราะห์ซอร์สของ `LocalDateTime` (Defects4J Time-12b) และสร้าง JUnit 4 test suite ที่ครอบคลุม:
- Factory methods (`now`, `parse`, `fromCalendarFields`, `fromDateFields`)
- Constructors ทุก overload (null-check / non-null)
- Field accessors, `getValue`, `get`, `isSupported`
- `equals`/`compareTo` (บางเคสที่พึ่งพาเมธอดใน superclass ที่ไม่มีซอร์สให้ จะมีคอมเมนต์กำกับความไม่แน่ใจ)
- `with*`, `plus*`, `minus*` (branch 0/non-zero, null)
- `toDate()` (รวมเคส negative-modulo ที่เกี่ยวข้องกับบั๊ก Time-12)
- `property()` และ inner class `Property` (add/set/round ต่าง ๆ)
- `toString` overloads

**หมายเหตุสำคัญ:** โค้ดบางจุด (เช่น `super.equals(...)`, `super.compareTo(...)`) เรียกใช้เมธอดจาก `BaseLocal`/`AbstractPartial` ซึ่งไม่ได้แสดงซอร์สมาด้วย ผมจึงเขียนคอมเมนต์กำกับความไม่แน่ใจไว้ในจุดนั้น ๆ ตามข้อกำหนด

```java
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import org.junit.Test;

/**
 * JUnit 4 test suite สำหรับ org.joda.time.LocalDateTime (Defects4J Time-12b)
 * มุ่งเน้น branch/condition coverage สูงสุดที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
@SuppressWarnings("deprecation")
public class LocalDateTimeTest {

    // Fixture วันที่คงที่ ใช้ทดสอบ getters/setters ส่วนใหญ่
    private static final LocalDateTime TEST_DT =
            new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);

    // =====================================================================
    // Factory: now()
    // =====================================================================
    @Test
    public void testNow() {
        assertNotNull(LocalDateTime.now());
    }

    @Test
    public void testNow_Zone() {
        assertNotNull(LocalDateTime.now(DateTimeZone.UTC));
    }

    @Test(expected = NullPointerException.class)
    public void testNow_Zone_null() {
        LocalDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNow_Chronology() {
        assertNotNull(LocalDateTime.now(ISOChronology.getInstanceUTC()));
    }

    @Test(expected = NullPointerException.class)
    public void testNow_Chronology_null() {
        LocalDateTime.now((Chronology) null);
    }

    // =====================================================================
    // Factory: parse
    // =====================================================================
    @Test
    public void testParse_String() {
        LocalDateTime parsed = LocalDateTime.parse("2004-06-09T10:20:30.040");
        assertEquals(TEST_DT, parsed);
    }

    @Test
    public void testParse_String_Formatter() {
        DateTimeFormatter f = ISODateTimeFormat.dateTimeParser();
        LocalDateTime parsed = LocalDateTime.parse("2004-06-09T10:20:30.040", f);
        assertEquals(TEST_DT, parsed);
    }

    // =====================================================================
    // Factory: fromCalendarFields / fromDateFields
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_null() {
        LocalDateTime.fromCalendarFields(null);
    }

    @Test
    public void testFromCalendarFields_valid() {
        GregorianCalendar cal = new GregorianCalendar(2004, Calendar.JUNE, 9, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 40);
        LocalDateTime result = LocalDateTime.fromCalendarFields(cal);
        assertEquals(2004, result.getYear());
        assertEquals(6, result.getMonthOfYear());
        assertEquals(9, result.getDayOfMonth());
        assertEquals(10, result.getHourOfDay());
        assertEquals(20, result.getMinuteOfHour());
        assertEquals(30, result.getSecondOfMinute());
        assertEquals(40, result.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_null() {
        LocalDateTime.fromDateFields(null);
    }

    @Test
    public void testFromDateFields_valid() {
        Date date = new Date(2004 - 1900, 5, 9, 10, 20, 30);
        LocalDateTime result = LocalDateTime.fromDateFields(date);
        assertEquals(2004, result.getYear());
        assertEquals(6, result.getMonthOfYear());
        assertEquals(9, result.getDayOfMonth());
    }

    @Test
    public void testFromDateFields_negativeMillisBranch() {
        // Date ก่อน epoch เพื่อกระตุ้น branch การแก้ modulo ติดลบ
        // (((int)(date.getTime()%1000))+1000)%1000
        Date date = new Date(-500L);
        LocalDateTime result = LocalDateTime.fromDateFields(date);
        assertTrue(result.getMillisOfSecond() >= 0 && result.getMillisOfSecond() < 1000);
    }

    // =====================================================================
    // Constructors
    // =====================================================================
    @Test
    public void testConstructor_Default() {
        assertNotNull(new LocalDateTime());
    }

    @Test
    public void testConstructor_Zone() {
        assertNotNull(new LocalDateTime(DateTimeZone.UTC));
    }

    @Test
    public void testConstructor_Zone_null() {
        assertNotNull(new LocalDateTime((DateTimeZone) null));
    }

    @Test
    public void testConstructor_Chronology() {
        assertNotNull(new LocalDateTime(ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testConstructor_Chronology_null() {
        assertNotNull(new LocalDateTime((Chronology) null));
    }

    @Test
    public void testConstructor_long() {
        assertEquals(1970, new LocalDateTime(0L).getYear());
    }

    @Test
    public void testConstructor_long_Zone() {
        assertEquals(1970, new LocalDateTime(0L, DateTimeZone.UTC).getYear());
    }

    @Test
    public void testConstructor_long_Chronology() {
        assertEquals(1970, new LocalDateTime(0L, ISOChronology.getInstanceUTC()).getYear());
    }

    @Test
    public void testConstructor_long_Chronology_null() {
        assertEquals(1970, new LocalDateTime(0L, (Chronology) null).getYear());
    }

    @Test
    public void testConstructor_Object_String() {
        LocalDateTime dt = new LocalDateTime((Object) "2004-06-09T10:20:30.040");
        assertEquals(TEST_DT, dt);
    }

    @Test
    public void testConstructor_Object_Zone() {
        // String converter จะข้าม zone ตาม Javadoc
        LocalDateTime dt = new LocalDateTime((Object) "2004-06-09T10:20:30.040", DateTimeZone.UTC);
        assertEquals(TEST_DT, dt);
    }

    @Test
    public void testConstructor_Object_Chronology() {
        LocalDateTime dt = new LocalDateTime((Object) "2004-06-09T10:20:30.040", ISOChronology.getInstanceUTC());
        assertEquals(TEST_DT, dt);
    }

    @Test
    public void testConstructor_ymdHm() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 20);
        assertEquals(0, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
    }

    @Test
    public void testConstructor_ymdHms() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 20, 30);
        assertEquals(30, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
    }

    @Test
    public void testConstructor_ymdHmsM() {
        assertEquals(40, new LocalDateTime(2004, 6, 9, 10, 20, 30, 40).getMillisOfSecond());
    }

    @Test
    public void testConstructor_ymdHmsM_chronology() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40, ISOChronology.getInstanceUTC());
        assertEquals(2004, dt.getYear());
    }

    @Test
    public void testConstructor_ymdHmsM_chronology_null() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40, (Chronology) null);
        assertEquals(2004, dt.getYear());
    }

    // =====================================================================
    // size / getValue
    // =====================================================================
    @Test
    public void testSize() {
        assertEquals(4, TEST_DT.size());
    }

    @Test
    public void testGetValue_valid() {
        assertEquals(2004, TEST_DT.getValue(0));
        assertEquals(6, TEST_DT.getValue(1));
        assertEquals(9, TEST_DT.getValue(2));
        assertTrue(TEST_DT.getValue(3) >= 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalid_negative() {
        TEST_DT.getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalid_tooLarge() {
        TEST_DT.getValue(4);
    }

    // =====================================================================
    // get / isSupported
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullType() {
        TEST_DT.get((DateTimeFieldType) null);
    }

    @Test
    public void testGet_validType() {
        assertEquals(2004, TEST_DT.get(DateTimeFieldType.year()));
    }

    @Test
    public void testIsSupported_DateTimeFieldType_null() {
        assertFalse(TEST_DT.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupported_DateTimeFieldType_valid() {
        assertTrue(TEST_DT.isSupported(DateTimeFieldType.year()));
    }

    @Test
    public void testIsSupported_DurationFieldType_null() {
        assertFalse(TEST_DT.isSupported((DurationFieldType) null));
    }

    @Test
    public void testIsSupported_DurationFieldType_valid() {
        assertTrue(TEST_DT.isSupported(DurationFieldType.years()));
    }

    @Test
    public void testGetChronology() {
        assertEquals(ISOChronology.getInstanceUTC(), TEST_DT.getChronology());
    }

    // =====================================================================
    // equals / compareTo
    // =====================================================================
    @Test
    public void testEquals_sameInstance() {
        assertTrue(TEST_DT.equals(TEST_DT));
    }

    @Test
    public void testEquals_equalValue() {
        LocalDateTime other = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        assertTrue(TEST_DT.equals(other));
    }

    @Test
    public void testEquals_differentValue() {
        LocalDateTime other = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        assertFalse(TEST_DT.equals(other));
    }

    @Test
    public void testEquals_differentType() {
        // NOTE: อาศัย behavior ของ super.equals() ใน BaseLocal/AbstractPartial
        // ที่ไม่ได้แสดงซอร์สมาด้วย — คาดว่าตาม equals contract ทั่วไปจะ false
        assertFalse(TEST_DT.equals("not a date"));
    }

    @Test
    public void testCompareTo_sameInstance() {
        assertEquals(0, TEST_DT.compareTo(TEST_DT));
    }

    @Test
    public void testCompareTo_less() {
        LocalDateTime earlier = new LocalDateTime(2003, 6, 9, 10, 20, 30, 40);
        assertTrue(earlier.compareTo(TEST_DT) < 0);
    }

    @Test
    public void testCompareTo_greater() {
        LocalDateTime later = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        assertTrue(later.compareTo(TEST_DT) > 0);
    }

    @Test
    public void testCompareTo_equalValue() {
        LocalDateTime other = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        assertEquals(0, TEST_DT.compareTo(other));
    }
    // NOTE: compareTo(null) และ chronology ต่างกัน จะตก branch super.compareTo()
    // ซึ่งไม่มีซอร์สให้ จึงไม่เขียนเทสยืนยัน exception type ที่แน่ชัด

    // =====================================================================
    // toDateTime / toLocalDate / toLocalTime
    // =====================================================================
    @Test
    public void testToDateTime() {
        assertEquals(2004, TEST_DT.toDateTime().getYear());
    }

    @Test
    public void testToDateTime_zone() {
        assertEquals(2004, TEST_DT.toDateTime(DateTimeZone.UTC).getYear());
    }

    @Test
    public void testToLocalDate() {
        LocalDate ld = TEST_DT.toLocalDate();
        assertEquals(2004, ld.getYear());
        assertEquals(9, ld.getDayOfMonth());
    }

    @Test
    public void testToLocalTime() {
        assertEquals(10, TEST_DT.toLocalTime().getHourOfDay());
    }

    // =====================================================================
    // toDate() — เมธอดที่เกี่ยวข้องกับบั๊ก Time-12 (DST gap/overlap handling)
    // =====================================================================
    @Test
    public void testToDate_roundTrip() {
        Date date = TEST_DT.toDate();
        assertNotNull(date);
        LocalDateTime check = LocalDateTime.fromDateFields(date);
        assertEquals(TEST_DT, check);
    }
    // NOTE: branch DST-gap (while loop) ขึ้นกับ default timezone ของเครื่องทดสอบ
    // ที่ต้องมี DST transition ตรงกับ 2004-06-09T10:20:30 พอดี ซึ่งไม่สามารถบังคับ
    // ให้เกิดขึ้นแน่นอนได้โดยไม่เปลี่ยน default TimeZone — จึงไม่ทดสอบ branch นี้ตรง ๆ

    // =====================================================================
    // withDate / withTime / withFields / withField / withFieldAdded
    // =====================================================================
    @Test
    public void testWithDate() {
        LocalDateTime dt = TEST_DT.withDate(2005, 1, 2);
        assertEquals(2005, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(2, dt.getDayOfMonth());
        assertEquals(10, dt.getHourOfDay());
    }

    @Test
    public void testWithTime() {
        LocalDateTime dt = TEST_DT.withTime(1, 2, 3, 4);
        assertEquals(1, dt.getHourOfDay());
        assertEquals(2, dt.getMinuteOfHour());
        assertEquals(3, dt.getSecondOfMinute());
        assertEquals(4, dt.getMillisOfSecond());
        assertEquals(2004, dt.getYear());
    }

    @Test
    public void testWithFields_null() {
        assertSame(TEST_DT, TEST_DT.withFields(null));
    }

    @Test
    public void testWithFields_nonNull() {
        LocalDate partial = new LocalDate(1999, 1, 1);
        LocalDateTime dt = TEST_DT.withFields(partial);
        assertEquals(1999, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(1, dt.getDayOfMonth());
        assertEquals(10, dt.getHourOfDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_null() {
        TEST_DT.withField(null, 6);
    }

    @Test
    public void testWithField_valid() {
        assertEquals(2010, TEST_DT.withField(DateTimeFieldType.year(), 2010).getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_null() {
        TEST_DT.withFieldAdded(null, 6);
    }

    @Test
    public void testWithFieldAdded_zero() {
        assertSame(TEST_DT, TEST_DT.withFieldAdded(DurationFieldType.years(), 0));
    }

    @Test
    public void testWithFieldAdded_nonZero() {
        assertEquals(2005, TEST_DT.withFieldAdded(DurationFieldType.years(), 1).getYear());
    }

    // =====================================================================
    // withDurationAdded / withPeriodAdded / plus(Duration|Period) / minus(..)
    // =====================================================================
    @Test
    public void testWithDurationAdded_null() {
        assertSame(TEST_DT, TEST_DT.withDurationAdded(null, 1));
    }

    @Test
    public void testWithDurationAdded_zeroScalar() {
        assertSame(TEST_DT, TEST_DT.withDurationAdded(new Duration(1000L), 0));
    }

    @Test
    public void testWithDurationAdded_nonZero() {
        LocalDateTime dt = TEST_DT.withDurationAdded(Duration.standardDays(1), 1);
        assertEquals(10, dt.getDayOfMonth());
    }

    @Test
    public void testWithPeriodAdded_null() {
        assertSame(TEST_DT, TEST_DT.withPeriodAdded(null, 1));
    }

    @Test
    public void testWithPeriodAdded_zeroScalar() {
        assertSame(TEST_DT, TEST_DT.withPeriodAdded(Period.days(1), 0));
    }

    @Test
    public void testWithPeriodAdded_nonZero() {
        assertEquals(10, TEST_DT.withPeriodAdded(Period.days(1), 1).getDayOfMonth());
    }

    @Test
    public void testPlus_Duration() {
        assertEquals(10, TEST_DT.plus(Duration.standardDays(1)).getDayOfMonth());
    }

    @Test
    public void testPlus_Period() {
        assertEquals(10, TEST_DT.plus(Period.days(1)).getDayOfMonth());
    }

    @Test
    public void testMinus_Duration() {
        assertEquals(8, TEST_DT.minus(Duration.standardDays(1)).getDayOfMonth());
    }

    @Test
    public void testMinus_Period() {
        assertEquals(8, TEST_DT.minus(Period.days(1)).getDayOfMonth());
    }

    // =====================================================================
    // plusX / minusX — ครอบคลุม branch (x == 0) และ (x != 0) ของทุกเมธอด
    // =====================================================================
    @Test public void testPlusYears_zero()    { assertSame(TEST_DT, TEST_DT.plusYears(0)); }
    @Test public void testPlusYears_nonZero() { assertEquals(2005, TEST_DT.plusYears(1).getYear()); }

    @Test public void testPlusMonths_zero()    { assertSame(TEST_DT, TEST_DT.plusMonths(0)); }
    @Test public void testPlusMonths_nonZero() { assertEquals(7, TEST_DT.plusMonths(1).getMonthOfYear()); }

    @Test public void testPlusWeeks_zero()    { assertSame(TEST_DT, TEST_DT.plusWeeks(0)); }
    @Test public void testPlusWeeks_nonZero() { assertEquals(16, TEST_DT.plusWeeks(1).getDayOfMonth()); }

    @Test public void testPlusDays_zero()    { assertSame(TEST_DT, TEST_DT.plusDays(0)); }
    @Test public void testPlusDays_nonZero() { assertEquals(10, TEST_DT.plusDays(1).getDayOfMonth()); }

    @Test public void testPlusHours_zero()    { assertSame(TEST_DT, TEST_DT.plusHours(0)); }
    @Test public void testPlusHours_nonZero() { assertEquals(11, TEST_DT.plusHours(1).getHourOfDay()); }

    @Test public void testPlusMinutes_zero()    { assertSame(TEST_DT, TEST_DT.plusMinutes(0)); }
    @Test public void testPlusMinutes_nonZero() { assertEquals(21, TEST_DT.plusMinutes(1).getMinuteOfHour()); }

    @Test public void testPlusSeconds_zero()    { assertSame(TEST_DT, TEST_DT.plusSeconds(0)); }
    @Test public void testPlusSeconds_nonZero() { assertEquals(31, TEST_DT.plusSeconds(1).getSecondOfMinute()); }

    @Test public void testPlusMillis_zero()    { assertSame(TEST_DT, TEST_DT.plusMillis(0)); }
    @Test public void testPlusMillis_nonZero() { assertEquals(41, TEST_DT.plusMillis(1).getMillisOfSecond()); }

    @Test public void testMinusYears_zero()    { assertSame(TEST_DT, TEST_DT.minusYears(0)); }
    @Test public void testMinusYears_nonZero() { assertEquals(2003, TEST_DT.minusYears(1).getYear()); }

    @Test public void testMinusMonths_zero()    { assertSame(TEST_DT, TEST_DT.minusMonths(0)); }
    @Test public void testMinusMonths_nonZero() { assertEquals(5, TEST_DT.minusMonths(1).getMonthOfYear()); }

    @Test public void testMinusWeeks_zero()    { assertSame(TEST_DT, TEST_DT.minusWeeks(0)); }
    @Test public void testMinusWeeks_nonZero() { assertEquals(2, TEST_DT.minusWeeks(1).getDayOfMonth()); }

    @Test public void testMinusDays_zero()    { assertSame(TEST_DT, TEST_DT.minusDays(0)); }
    @Test public void testMinusDays_nonZero() { assertEquals(8, TEST_DT.minusDays(1).getDayOfMonth()); }

    @Test public void testMinusHours_zero()    { assertSame(TEST_DT, TEST_DT.minusHours(0)); }
    @Test public void testMinusHours_nonZero() { assertEquals(9, TEST_DT.minusHours(1).getHourOfDay()); }

    @Test public void testMinusMinutes_zero()    { assertSame(TEST_DT, TEST_DT.minusMinutes(0)); }
    @Test public void testMinusMinutes_nonZero() { assertEquals(19, TEST_DT.minusMinutes(1).getMinuteOfHour()); }

    @Test public void testMinusSeconds_zero()    { assertSame(TEST_DT, TEST_DT.minusSeconds(0)); }
    @Test public void testMinusSeconds_nonZero() { assertEquals(29, TEST_DT.minusSeconds(1).getSecondOfMinute()); }

    @Test public void testMinusMillis_zero()    { assertSame(TEST_DT, TEST_DT.minusMillis(0)); }
    @Test public void testMinusMillis_nonZero() { assertEquals(39, TEST_DT.minusMillis(1).getMillisOfSecond()); }

    // =====================================================================
    // property(DateTimeFieldType)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testProperty_null() {
        TEST_DT.property(null);
    }

    @Test
    public void testProperty_valid() {
        LocalDateTime.Property p = TEST_DT.property(DateTimeFieldType.year());
        assertEquals(2004, p.get());
    }
    // NOTE: ไม่ได้ทดสอบ branch "isSupported==false" เพราะ ISOChronology รองรับ
    // DateTimeFieldType มาตรฐานทั้งหมด จึงไม่สามารถหา field ที่ unsupported ได้
    // โดยไม่เดา behavior เพิ่มเติม

    // =====================================================================
    // getters พื้นฐาน
    // =====================================================================
    @Test
    public void testGetters() {
        assertEquals(1, TEST_DT.getEra());
        assertEquals(20, TEST_DT.getCenturyOfEra());
        assertEquals(2004, TEST_DT.getYearOfEra());
        assertEquals(4, TEST_DT.getYearOfCentury());
        assertEquals(2004, TEST_DT.getYear());
        assertEquals(2004, TEST_DT.getWeekyear());
        assertEquals(6, TEST_DT.getMonthOfYear());
        assertTrue(TEST_DT.getWeekOfWeekyear() > 0);
        assertTrue(TEST_DT.getDayOfYear() > 0);
        assertEquals(9, TEST_DT.getDayOfMonth());
        assertTrue(TEST_DT.getDayOfWeek() >= 1 && TEST_DT.getDayOfWeek() <= 7);
        assertEquals(10, TEST_DT.getHourOfDay());
        assertEquals(20, TEST_DT.getMinuteOfHour());
        assertEquals(30, TEST_DT.getSecondOfMinute());
        assertEquals(40, TEST_DT.getMillisOfSecond());
        assertTrue(TEST_DT.getMillisOfDay() > 0);
    }

    // =====================================================================
    // with* setters
    // =====================================================================
    @Test public void testWithEra()           { assertEquals(1, TEST_DT.withEra(1).getEra()); }
    @Test public void testWithCenturyOfEra()  { assertEquals(21, TEST_DT.withCenturyOfEra(21).getCenturyOfEra()); }
    @Test public void testWithYearOfEra()     { assertEquals(2010, TEST_DT.withYearOfEra(2010).getYearOfEra()); }
    @Test public void testWithYearOfCentury() { assertEquals(50, TEST_DT.withYearOfCentury(50).getYearOfCentury()); }
    @Test public void testWithYear()          { assertEquals(1999, TEST_DT.withYear(1999).getYear()); }
    @Test public void testWithWeekyear()      { assertEquals(2010, TEST_DT.withWeekyear(2010).getWeekyear()); }
    @Test public void testWithMonthOfYear()   { assertEquals(12, TEST_DT.withMonthOfYear(12).getMonthOfYear()); }
    @Test public void testWithWeekOfWeekyear(){ assertEquals(10, TEST_DT.withWeekOfWeekyear(10).getWeekOfWeekyear()); }
    @Test public void testWithDayOfYear()     { assertEquals(100, TEST_DT.withDayOfYear(100).getDayOfYear()); }
    @Test public void testWithDayOfMonth()    { assertEquals(15, TEST_DT.withDayOfMonth(15).getDayOfMonth()); }
    @Test public void testWithDayOfWeek()     { assertEquals(3, TEST_DT.withDayOfWeek(3).getDayOfWeek()); }
    @Test public void testWithHourOfDay()     { assertEquals(5, TEST_DT.withHourOfDay(5).getHourOfDay()); }
    @Test public void testWithMinuteOfHour()  { assertEquals(5, TEST_DT.withMinuteOfHour(5).getMinuteOfHour()); }
    @Test public void testWithSecondOfMinute(){ assertEquals(5, TEST_DT.withSecondOfMinute(5).getSecondOfMinute()); }
    @Test public void testWithMillisOfSecond(){ assertEquals(5, TEST_DT.withMillisOfSecond(5).getMillisOfSecond()); }
    @Test public void testWithMillisOfDay()   { assertEquals(5, TEST_DT.withMillisOfDay(5).getMillisOfDay()); }

    // =====================================================================
    // property getters (เทียบค่ากับ getter ปกติ)
    // =====================================================================
    @Test public void testEraProperty()           { assertEquals(TEST_DT.getEra(), TEST_DT.era().get()); }
    @Test public void testCenturyOfEraProperty()  { assertEquals(TEST_DT.getCenturyOfEra(), TEST_DT.centuryOfEra().get()); }
    @Test public void testYearOfCenturyProperty() { assertEquals(TEST_DT.getYearOfCentury(), TEST_DT.yearOfCentury().get()); }
    @Test public void testYearOfEraProperty()     { assertEquals(TEST_DT.getYearOfEra(), TEST_DT.yearOfEra().get()); }
    @Test public void testYearProperty()          { assertEquals(TEST_DT.getYear(), TEST_DT.year().get()); }
    @Test public void testWeekyearProperty()      { assertEquals(TEST_DT.getWeekyear(), TEST_DT.weekyear().get()); }
    @Test public void testMonthOfYearProperty()   { assertEquals(TEST_DT.getMonthOfYear(), TEST_DT.monthOfYear().get()); }
    @Test public void testWeekOfWeekyearProperty(){ assertEquals(TEST_DT.getWeekOfWeekyear(), TEST_DT.weekOfWeekyear().get()); }
    @Test public void testDayOfYearProperty()     { assertEquals(TEST_DT.getDayOfYear(), TEST_DT.dayOfYear().get()); }
    @Test public void testDayOfMonthProperty()    { assertEquals(TEST_DT.getDayOfMonth(), TEST_DT.dayOfMonth().get()); }
    @Test public void testDayOfWeekProperty()     { assertEquals(TEST_DT.getDayOfWeek(), TEST_DT.dayOfWeek().get()); }
    @Test public void testHourOfDayProperty()     { assertEquals(TEST_DT.getHourOfDay(), TEST_DT.hourOfDay().get()); }
    @Test public void testMinuteOfHourProperty()  { assertEquals(TEST_DT.getMinuteOfHour(), TEST_DT.minuteOfHour().get()); }
    @Test public void testSecondOfMinuteProperty(){ assertEquals(TEST_DT.getSecondOfMinute(), TEST_DT.secondOfMinute().get()); }
    @Test public void testMillisOfSecondProperty(){ assertEquals(TEST_DT.getMillisOfSecond(), TEST_DT.millisOfSecond().get()); }
    @Test public void testMillisOfDayProperty()   { assertEquals(TEST_DT.getMillisOfDay(), TEST_DT.millisOfDay().get()); }

    // =====================================================================
    // toString overloads
    // =====================================================================
    @Test
    public void testToString() {
        assertEquals("2004-06-09T10:20:30.040", TEST_DT.toString());
    }

    @Test
    public void testToString_pattern_null() {
        assertEquals(TEST_DT.toString(), TEST_DT.toString((String) null));
    }

    @Test
    public void testToString_pattern() {
        assertEquals("2004 06", TEST_DT.toString("yyyy MM"));
    }

    @Test
    public void testToString_pattern_locale_nullPattern() {
        assertEquals(TEST_DT.toString(), TEST_DT.toString(null, Locale.ENGLISH));
    }

    @Test
    public void testToString_pattern_locale() {
        assertEquals("2004 06", TEST_DT.toString("yyyy MM", Locale.ENGLISH));
    }

    // =====================================================================
    // Inner class LocalDateTime.Property
    // =====================================================================
    @Test
    public void testPropertyAddToCopy_int() {
        assertEquals(10, TEST_DT.dayOfMonth().addToCopy(1).getDayOfMonth());
    }

    @Test
    public void testPropertyAddToCopy_long() {
        assertEquals(10, TEST_DT.dayOfMonth().addToCopy(1L).getDayOfMonth());
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        LocalDateTime lastDay = TEST_DT.dayOfMonth().withMaximumValue(); // 30 มิ.ย.
        LocalDateTime dt = lastDay.dayOfMonth().addWrapFieldToCopy(1);
        assertEquals(1, dt.getDayOfMonth()); // wrap กลับไป 1 โดยไม่เปลี่ยนเดือน
    }

    @Test
    public void testPropertySetCopy_int() {
        assertEquals(15, TEST_DT.dayOfMonth().setCopy(15).getDayOfMonth());
    }

    @Test
    public void testPropertySetCopy_text_withLocale() {
        assertEquals(12, TEST_DT.monthOfYear().setCopy("December", Locale.ENGLISH).getMonthOfYear());
    }

    @Test
    public void testPropertySetCopy_text_defaultLocale() {
        // บังคับ default locale เป็น ENGLISH ชั่วคราว เพื่อให้ผลลัพธ์แน่นอน
        // เมื่อเรียก setCopy(text) ซึ่งภายในเรียก setCopy(text, null)
        Locale original = Locale.getDefault();
        try {
            Locale.setDefault(Locale.ENGLISH);
            assertEquals(12, TEST_DT.monthOfYear().setCopy("December").getMonthOfYear());
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testPropertyWithMaximumValue() {
        assertEquals(30, TEST_DT.dayOfMonth().withMaximumValue().getDayOfMonth()); // มิ.ย.มี 30 วัน
    }

    @Test
    public void testPropertyWithMinimumValue() {
        assertEquals(1, TEST_DT.dayOfMonth().withMinimumValue().getDayOfMonth());
    }

    @Test
    public void testPropertyRoundFloorCopy() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 30, 0, 0);
        assertEquals(10, dt.hourOfDay().roundFloorCopy().getHourOfDay());
    }

    @Test
    public void testPropertyRoundCeilingCopy() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 30, 0, 0);
        assertEquals(11, dt.hourOfDay().roundCeilingCopy().getHourOfDay());
    }

    @Test
    public void testPropertyRoundHalfFloorCopy() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 30, 0, 0);
        assertEquals(10, dt.hourOfDay().roundHalfFloorCopy().getHourOfDay());
    }

    @Test
    public void testPropertyRoundHalfCeilingCopy() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 30, 0, 0);
        assertEquals(11, dt.hourOfDay().roundHalfCeilingCopy().getHourOfDay());
    }

    @Test
    public void testPropertyRoundHalfEvenCopy() {
        LocalDateTime dt = new LocalDateTime(2004, 6, 9, 10, 30, 0, 0);
        // halfway ระหว่าง 10 (คู่) กับ 11 (คี่) -> เลือก 10
        assertEquals(10, dt.hourOfDay().roundHalfEvenCopy().getHourOfDay());
    }

    @Test
    public void testPropertyGetField() {
        assertNotNull(TEST_DT.year().getField());
    }

    @Test
    public void testPropertyGetLocalDateTime() {
        assertSame(TEST_DT, TEST_DT.year().getLocalDateTime());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testNow*` | `now()/now(zone)/now(chrono)` — null-check throw NPE (true/false branch) |
| `testParse_*` | `parse(String)` และ `parse(String, formatter)` — เส้นทางปกติ |
| `testFromCalendarFields_*` | null → `IllegalArgumentException`; valid → field mapping ปกติ |
| `testFromDateFields_*` / `testFromDateFields_negativeMillisBranch` | null → exception; ms modulo บวก/ลบ (`(((int)(...%1000))+1000)%1000`) |
| `testConstructor_*` | ทุก overload constructor, null-chronology/zone fallback ภายใน `DateTimeUtils.getChronology/getZone` |
| `testSize`, `testGetValue_*` | `getValue(index)` switch ทุก case + `default` → `IndexOutOfBoundsException` |
| `testGet_*`, `testIsSupported_*` | null-check (`IllegalArgumentException`/`return false`) vs valid type |
| `testEquals_*`, `testCompareTo_*` | `this==partial`, `instanceof` true/false, chronology equal/ไม่เท่ากัน (ส่วน super.* มีคอมเมนต์กำกับ) |
| `testToDateTime*`, `testToLocalDate/Time` | สาขาปกติของเมธอดแปลงประเภท |
| `testToDate_roundTrip` | เมธอดหลักที่เกี่ยวข้องกับบั๊ก Time-12 (เส้นทางไม่ DST) |
| `testWithDate/withTime/withFields_*` | null-partial branch, non-null branch |
| `testWithField_*`, `testWithFieldAdded_*` | null → exception, amount==0 → return this, amount!=0 → คำนวณใหม่ |
| `testWithDurationAdded_*`, `testWithPeriodAdded_*` | null/scalar==0 → return this, อื่น ๆ → คำนวณ |
| `testPlus*/testMinus*` (ทุกหน่วย) | branch `(x==0)` return this / `(x!=0)` คำนวณจริง ของทุกเมธอด plus/minus |
| `testProperty_null/valid` | null → exception, valid → สร้าง Property สำเร็จ |
| `testGetters` | getters พื้นฐานทั้งหมด (era, century, year, week, day, time fields) |
| `testWith*` (setter กลุ่มที่สอง) | setter ทุกฟิลด์หลัก |
| `test*Property` (getter property กลุ่มที่สอง) | property accessor ทุกฟิลด์ เทียบค่ากับ getter |
| `testToString*` | pattern==null → fallback, pattern!=null → format ปกติ, locale ปกติ |
| `testProperty*Copy` (inner class `Property`) | addToCopy(int/long), addWrapFieldToCopy, setCopy(int/text/text+locale), withMax/MinValue, roundFloor/Ceiling/HalfFloor/HalfCeiling/HalfEven, getField, getLocalDateTime |

**จุดที่ไม่ได้ทดสอบ (พร้อมเหตุผลในคอมเมนต์โค้ด):**
- `toDate()` branch DST-gap/overlap (while loops) — ขึ้นกับ default TimeZone ของเครื่องที่รัน ไม่สามารถบังคับให้เกิดได้แน่นอน
- `property()` branch `isSupported==false` — ISOChronology รองรับทุก field มาตรฐาน หา field ที่ unsupported ไม่ได้โดยไม่เดา
- `compareTo(null)` และ `equals`/`compareTo` กรณี chronology ต่างกัน — พึ่งพา `super.equals/compareTo` ที่ไม่มีซอร์สให้