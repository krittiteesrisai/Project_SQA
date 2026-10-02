# DateUtilsTest.java

```java
package org.apache.commons.lang.time;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.lang.time.DateUtils (Defects4J Lang-65b)
 * เน้น branch/condition coverage ให้ได้มากที่สุดจากซอร์สที่ให้มา
 */
public class DateUtilsTest {

    // ---------- helpers ----------
    private static Calendar calOf(int y, int m, int d, int h, int mi, int s, int ms) {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(y, m, d, h, mi, s);
        c.set(Calendar.MILLISECOND, ms);
        return c;
    }

    private static Date dateOf(int y, int m, int d, int h, int mi, int s, int ms) {
        return calOf(y, m, d, h, mi, s, ms).getTime();
    }

    private static Calendar fieldsOf(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;
    }

    // Subclass used only to trigger "different class" branch in isSameLocalTime
    private static class SubCalendar extends GregorianCalendar { }

    // =====================================================================
    // isSameDay(Date,Date)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate1() {
        DateUtils.isSameDay(null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate2() {
        DateUtils.isSameDay(new Date(), null);
    }

    @Test
    public void testIsSameDay_Date_SameDayDifferentTime() {
        Date d1 = dateOf(2023, 0, 15, 1, 0, 0, 0);
        Date d2 = dateOf(2023, 0, 15, 23, 59, 59, 999);
        assertTrue(DateUtils.isSameDay(d1, d2));
    }

    @Test
    public void testIsSameDay_Date_DifferentDay() {
        Date d1 = dateOf(2023, 0, 15, 0, 0, 0, 0);
        Date d2 = dateOf(2023, 0, 16, 0, 0, 0, 0);
        assertFalse(DateUtils.isSameDay(d1, d2));
    }

    // =====================================================================
    // isSameDay(Calendar,Calendar)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Cal_NullCal1() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Cal_NullCal2() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameDay_Cal_DifferentYear() {
        // ปี/ERA ต่างกัน -> false (ครอบคลุมเงื่อนไข YEAR ใน && chain)
        Calendar c1 = calOf(2023, 0, 15, 0, 0, 0, 0);
        Calendar c2 = calOf(2022, 0, 15, 0, 0, 0, 0);
        assertFalse(DateUtils.isSameDay(c1, c2));
        // หมายเหตุ: เงื่อนไข ERA ไม่สามารถทดสอบแยกได้ง่ายด้วย GregorianCalendar ปกติ (ไม่เดา behavior เพิ่ม)
    }

    // =====================================================================
    // isSameInstant(Date,Date)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null1() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null2() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_Date_Equal() {
        Date d = new Date(123456789L);
        assertTrue(DateUtils.isSameInstant(d, new Date(123456789L)));
    }

    @Test
    public void testIsSameInstant_Date_NotEqual() {
        assertFalse(DateUtils.isSameInstant(new Date(1L), new Date(2L)));
    }

    // =====================================================================
    // isSameInstant(Calendar,Calendar)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Cal_Null1() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Cal_Null2() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameInstant_Cal_EqualAndNotEqual() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(1000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));
        c2.setTimeInMillis(2000L);
        assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    // =====================================================================
    // isSameLocalTime(Calendar,Calendar)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null1() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null2() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    @Test
    public void testIsSameLocalTime_EqualFieldsSameClass() {
        Calendar c1 = calOf(2023, 0, 15, 10, 20, 30, 400);
        Calendar c2 = calOf(2023, 0, 15, 10, 20, 30, 400);
        assertTrue(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTime_DifferentMinute() {
        Calendar c1 = calOf(2023, 0, 15, 10, 20, 30, 400);
        Calendar c2 = calOf(2023, 0, 15, 10, 21, 30, 400);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTime_DifferentClass() {
        // ค่าฟิลด์เหมือนกันทุกตัว แต่ class ต่างกัน -> ต้อง false (ทดสอบ bug-finding ที่ cal1.getClass()==cal2.getClass())
        Calendar c1 = calOf(2023, 0, 15, 10, 20, 30, 400);
        SubCalendar c2 = new SubCalendar();
        c2.setTimeInMillis(c1.getTimeInMillis());
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    // =====================================================================
    // parseDate
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullStr() throws ParseException {
        DateUtils.parseDate(null, new String[] { "yyyy-MM-dd" });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws ParseException {
        DateUtils.parseDate("2023-01-01", null);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_EmptyPatternsArray() throws ParseException {
        // loop ไม่ execute เลย -> ตกไป throw ParseException ทันที
        DateUtils.parseDate("2023-01-01", new String[] {});
    }

    @Test
    public void testParseDate_FirstPatternMatches() throws ParseException {
        Date d = DateUtils.parseDate("2023-01-15", new String[] { "yyyy-MM-dd" });
        Calendar c = fieldsOf(d);
        assertEquals(2023, c.get(Calendar.YEAR));
        assertEquals(0, c.get(Calendar.MONTH));
        assertEquals(15, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseDate_SecondPatternMatchesAfterFirstFails() throws ParseException {
        // pattern แรก literal '/' ไม่ตรงกับ '-' ใน str -> fail ทันที (date==null)
        // pattern สอง match เต็ม string -> success (ครอบคลุม else: parser.applyPattern)
        Date d = DateUtils.parseDate("2023-01-15",
                new String[] { "yyyy/MM/dd", "yyyy-MM-dd" });
        Calendar c = fieldsOf(d);
        assertEquals(2023, c.get(Calendar.YEAR));
        assertEquals(15, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseDate_PartialMatchContinuesToNextPattern() throws ParseException {
        // pattern แรก parse ได้ไม่ครบ string (เหลือ 'X') -> pos.getIndex()!=length() -> ไป pattern ถัดไป
        Date d = DateUtils.parseDate("2023-01-15X",
                new String[] { "yyyy-MM-dd", "yyyy-MM-dd'X'" });
        Calendar c = fieldsOf(d);
        assertEquals(2023, c.get(Calendar.YEAR));
        assertEquals(15, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParseDate_AllPatternsFail() throws ParseException {
        DateUtils.parseDate("not-a-date", new String[] { "yyyy-MM-dd" });
    }

    // =====================================================================
    // add(Date,int,int) และ add* wrapper methods
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testAddYears() {
        Date d = dateOf(2020, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.addYears(d, 3);
        assertEquals(2023, fieldsOf(r).get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths() {
        Date d = dateOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.addMonths(d, 2);
        assertEquals(2, fieldsOf(r).get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks() {
        Date d = dateOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.addWeeks(d, 1);
        assertEquals(8, fieldsOf(r).get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddDays() {
        Date d = dateOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.addDays(d, 5);
        assertEquals(6, fieldsOf(r).get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours() {
        Date d = dateOf(2023, 0, 1, 10, 0, 0, 0);
        Date r = DateUtils.addHours(d, 5);
        assertEquals(15, fieldsOf(r).get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Date d = dateOf(2023, 0, 1, 10, 10, 0, 0);
        Date r = DateUtils.addMinutes(d, 5);
        assertEquals(15, fieldsOf(r).get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds() {
        Date d = dateOf(2023, 0, 1, 10, 10, 10, 0);
        Date r = DateUtils.addSeconds(d, 5);
        assertEquals(15, fieldsOf(r).get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds() {
        Date d = dateOf(2023, 0, 1, 10, 10, 10, 100);
        Date r = DateUtils.addMilliseconds(d, 50);
        assertEquals(150, fieldsOf(r).get(Calendar.MILLISECOND));
    }

    // =====================================================================
    // round(Date/Calendar/Object)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDate_Null() {
        DateUtils.round((Date) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundCalendar_Null() {
        DateUtils.round((Calendar) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundObject_Null() {
        DateUtils.round((Object) null, Calendar.YEAR);
    }

    @Test
    public void testRoundObject_Date() {
        Date d = dateOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.round((Object) d, Calendar.MILLISECOND);
        assertEquals(d.getTime(), r.getTime());
    }

    @Test
    public void testRoundObject_Calendar() {
        Calendar c = calOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.round((Object) c, Calendar.MILLISECOND);
        assertEquals(c.getTime().getTime(), r.getTime());
    }

    @Test(expected = ClassCastException.class)
    public void testRoundObject_InvalidType() {
        DateUtils.round((Object) "not a date", Calendar.YEAR);
    }

    // =====================================================================
    // truncate(Date/Calendar/Object)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateDate_Null() {
        DateUtils.truncate((Date) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateCalendar_Null() {
        DateUtils.truncate((Calendar) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateObject_Null() {
        DateUtils.truncate((Object) null, Calendar.YEAR);
    }

    @Test
    public void testTruncateObject_Date() {
        Date d = dateOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.truncate((Object) d, Calendar.MILLISECOND);
        assertEquals(d.getTime(), r.getTime());
    }

    @Test
    public void testTruncateObject_Calendar() {
        Calendar c = calOf(2023, 0, 1, 0, 0, 0, 0);
        Date r = DateUtils.truncate((Object) c, Calendar.MILLISECOND);
        assertEquals(c.getTime().getTime(), r.getTime());
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateObject_InvalidType() {
        DateUtils.truncate((Object) new Object(), Calendar.YEAR);
    }

    // =====================================================================
    // modify() ผ่าน round()/truncate() - unsupported field / year too large
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testModify_UnsupportedField() {
        // DAY_OF_WEEK ไม่อยู่ใน fields[][] -> loop จบโดยไม่ return -> throw IllegalArgumentException
        DateUtils.round(new Date(), Calendar.DAY_OF_WEEK);
    }

    @Test(expected = ArithmeticException.class)
    public void testModify_YearTooLarge() {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.round(c, Calendar.YEAR);
    }

    // ---------- MILLISECOND (smallest field, no-op) ----------
    @Test
    public void testRound_Milliseconds_NoOp() {
        Calendar c = calOf(2020, 5, 15, 10, 20, 30, 777);
        long before = c.getTimeInMillis();
        Calendar r = DateUtils.round(c, Calendar.MILLISECOND);
        assertEquals(before, r.getTimeInMillis());
    }

    @Test
    public void testTruncate_Milliseconds_NoOp() {
        Calendar c = calOf(2020, 5, 15, 10, 20, 30, 777);
        long before = c.getTimeInMillis();
        Calendar r = DateUtils.truncate(c, Calendar.MILLISECOND);
        assertEquals(before, r.getTimeInMillis());
    }

    // ---------- HOUR_OF_DAY ----------
    @Test
    public void testTruncate_HourOfDay() {
        Calendar c = calOf(2020, 5, 15, 23, 59, 59, 999);
        Calendar r = DateUtils.truncate(c, Calendar.HOUR_OF_DAY);
        assertEquals(23, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, r.get(Calendar.MINUTE));
        assertEquals(0, r.get(Calendar.SECOND));
        assertEquals(0, r.get(Calendar.MILLISECOND));
        assertEquals(15, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_HourOfDay_RoundUp() {
        // minute=45 -> roundUp true ตอน set MINUTE -> ส่งผลให้ HOUR_OF_DAY +1
        Calendar c = calOf(2020, 5, 15, 10, 45, 30, 500);
        Calendar r = DateUtils.round(c, Calendar.HOUR_OF_DAY);
        assertEquals(11, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, r.get(Calendar.MINUTE));
        assertEquals(15, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_HourOfDay_RoundDown() {
        Calendar c = calOf(2020, 5, 15, 10, 10, 10, 100);
        Calendar r = DateUtils.round(c, Calendar.HOUR_OF_DAY);
        assertEquals(10, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, r.get(Calendar.MINUTE));
    }

    // ---------- YEAR ----------
    @Test
    public void testTruncate_Year() {
        Calendar c = calOf(2020, 5, 15, 10, 20, 30, 777);
        Calendar r = DateUtils.truncate(c, Calendar.YEAR);
        assertEquals(2020, r.get(Calendar.YEAR));
        assertEquals(0, r.get(Calendar.MONTH));
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, r.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testRound_Year_RoundUp() {
        // เดือนธันวาคม -> roundUp true ที่ MONTH step -> YEAR +1
        Calendar c = calOf(2020, 11, 15, 10, 20, 30, 777);
        Calendar r = DateUtils.round(c, Calendar.YEAR);
        assertEquals(2021, r.get(Calendar.YEAR));
        assertEquals(0, r.get(Calendar.MONTH));
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_Year_RoundDown() {
        Calendar c = calOf(2020, 0, 15, 10, 20, 30, 777);
        Calendar r = DateUtils.round(c, Calendar.YEAR);
        assertEquals(2020, r.get(Calendar.YEAR));
        assertEquals(0, r.get(Calendar.MONTH));
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
    }

    // ---------- SEMI_MONTH ----------
    @Test
    public void testTruncate_SemiMonth_FirstHalf() {
        Calendar c = calOf(2020, 5, 5, 10, 20, 30, 777);
        Calendar r = DateUtils.truncate(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, r.get(Calendar.MONTH));
        assertEquals(0, r.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testTruncate_SemiMonth_SecondHalf() {
        Calendar c = calOf(2020, 5, 20, 10, 20, 30, 777);
        Calendar r = DateUtils.truncate(c, DateUtils.SEMI_MONTH);
        assertEquals(16, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, r.get(Calendar.MONTH));
    }

    @Test
    public void testRound_SemiMonth_NoRoundFirstHalf() {
        // day=5 -> offset=4, roundUp=false -> ผลเหมือน truncate (อยู่ที่วันที่ 1)
        Calendar c = calOf(2020, 5, 5, 10, 20, 30, 777);
        Calendar r = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, r.get(Calendar.MONTH));
    }

    @Test
    public void testRound_SemiMonth_RoundUpToSixteenth() {
        // day=10 -> offset=9 roundUp=true, DATE ถูก set เป็น 1 ก่อน แล้วพบว่า DATE==1 -> add 15
        Calendar c = calOf(2020, 5, 10, 10, 20, 30, 777);
        Calendar r = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(16, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, r.get(Calendar.MONTH));
    }

    @Test
    public void testRound_SemiMonth_RoundUpToNextMonth() {
        // day=25 -> offset=9(after -15) roundUp=true, DATE set to16 (!=1) -> -15 days +1 month
        Calendar c = calOf(2020, 5, 25, 10, 20, 30, 777);
        Calendar r = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r.get(Calendar.DAY_OF_MONTH));
        assertEquals(6, r.get(Calendar.MONTH)); // July (0-indexed=6)
    }

    // ---------- AM_PM ----------
    @Test
    public void testTruncate_AmPm_AM() {
        Calendar c = calOf(2020, 5, 15, 5, 20, 30, 777);
        Calendar r = DateUtils.truncate(c, Calendar.AM_PM);
        assertEquals(0, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(15, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testTruncate_AmPm_PM() {
        Calendar c = calOf(2020, 5, 15, 20, 20, 30, 777);
        Calendar r = DateUtils.truncate(c, Calendar.AM_PM);
        assertEquals(12, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(15, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_AmPm_RoundDown() {
        // hour=14 -> offset=2 (<=6) roundUp=false -> ไม่ขยับวัน
        Calendar c = calOf(2020, 5, 15, 14, 20, 30, 777);
        Calendar r = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(12, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(15, r.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_AmPm_RoundUp() {
        // hour=20 -> offset=8(>6) roundUp=true -> เพิ่มวันถัดไป, hour=12
        Calendar c = calOf(2020, 5, 15, 20, 20, 30, 777);
        Calendar r = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(12, r.get(Calendar.HOUR_OF_DAY));
        assertEquals(16, r.get(Calendar.DAY_OF_MONTH));
    }

    // =====================================================================
    // iterator()
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullDate() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullCalendar() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidRangeStyle() {
        DateUtils.iterator(calOf(2023, 0, 4, 0, 0, 0, 0), 9999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorObject_Null() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorObject_InvalidType() {
        DateUtils.iterator((Object) "bad", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test
    public void testIteratorObject_Date() {
        Iterator it = DateUtils.iterator((Object) dateOf(2023, 0, 4, 0, 0, 0, 0),
                DateUtils.RANGE_WEEK_SUNDAY);
        assertTrue(it.hasNext());
    }

    @Test
    public void testIteratorObject_Calendar() {
        Iterator it = DateUtils.iterator((Object) calOf(2023, 0, 4, 0, 0, 0, 0),
                DateUtils.RANGE_WEEK_SUNDAY);
        assertTrue(it.hasNext());
    }

    @Test
    public void testIterator_RangeMonthSunday() {
        Calendar focus = calOf(2023, 0, 15, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertNotNull(first);
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeMonthMonday() {
        Calendar focus = calOf(2023, 0, 15, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_MONDAY);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekSunday() {
        Calendar focus = calOf(2023, 0, 4, 0, 0, 0, 0); // Wednesday
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
            count++;
        }
        assertEquals(7, count);
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekMonday() {
        Calendar focus = calOf(2023, 0, 4, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_MONDAY);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekRelative_SundayFocus() {
        // focus เป็นวันอาทิตย์ -> endCutoff=0 < SUNDAY -> +=7 (SATURDAY)
        Calendar focus = calOf(2023, 0, 1, 0, 0, 0, 0); // Sunday
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekRelative_NormalFocus() {
        Calendar focus = calOf(2023, 0, 4, 0, 0, 0, 0); // Wednesday
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.WEDNESDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.TUESDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekCenter_SundayFocus() {
        // startCutoff = 1-3=-2 <SUNDAY -> +7 =5(THURSDAY); endCutoff=1+3=4(WEDNESDAY)
        Calendar focus = calOf(2023, 0, 1, 0, 0, 0, 0); // Sunday
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_CENTER);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.THURSDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.WEDNESDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekCenter_SaturdayFocus() {
        // startCutoff=7-3=4(WED); endCutoff=7+3=10>SATURDAY -> -7=3(TUESDAY)
        Calendar focus = calOf(2023, 0, 7, 0, 0, 0, 0); // Saturday
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_CENTER);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar cur = (Calendar) it.next();
            if (first == null) first = cur;
            last = cur;
        }
        assertEquals(Calendar.WEDNESDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.TUESDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    // =====================================================================
    // DateIterator (inner class) - ผ่าน public iterator() เท่านั้น
    // =====================================================================

    @Test
    public void testDateIterator_NextThrowsAfterExhaustion() {
        Calendar focus = calOf(2023, 0, 4, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        try {
            it.next();
            fail("ควร throw NoSuchElementException เมื่อเรียก next() หลัง exhausted");
        } catch (NoSuchElementException expected) {
            // ok
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIterator_RemoveThrowsUnsupported() {
        Calendar focus = calOf(2023, 0, 4, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }

    // =====================================================================
    // ค่าคงที่ / constructor (trivial แต่ช่วย coverage รวม)
    // =====================================================================

    @Test
    public void testConstantsAndDefaultConstructor() {
        assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
        assertEquals(TimeZone.getTimeZone("GMT"), DateUtils.UTC_TIME_ZONE);
        assertNotNull(new DateUtils()); // public constructor
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testIsSameDay_Date_Null* | `date1==null \|\| date2==null` ทั้ง 2 ฝั่ง |
| testIsSameDay_Date_SameDayDifferentTime/DifferentDay | ผลลัพธ์ true/false ของ `isSameDay(Calendar,Calendar)` |
| testIsSameDay_Cal_Null* | null check ของ overload Calendar |
| testIsSameDay_Cal_DifferentYear | เงื่อนไข YEAR ใน `&&` chain (ERA ไม่สามารถทดสอบแยกได้ – คอมเมนต์กำกับ) |
| testIsSameInstant_* (Date/Calendar) | null check + equal/not-equal ของ millis |
| testIsSameLocalTime_* | null check, equal fields, ต่าง minute, ต่าง class (`getClass()` mismatch) |
| testParseDate_NullStr/NullPatterns | `str==null \|\| parsePatterns==null` |
| testParseDate_EmptyPatternsArray | loop ไม่ execute (`i<0`) → ParseException |
| testParseDate_FirstPatternMatches | `i==0` branch, success ทันที |
| testParseDate_SecondPatternMatchesAfterFirstFails | `else parser.applyPattern`, loop หลาย iteration |
| testParseDate_PartialMatchContinuesToNextPattern | `date!=null && pos.getIndex()!=length()` → continue loop |
| testParseDate_AllPatternsFail | throw ParseException ท้ายเมธอด |
| testAdd_NullDate | null check ใน `add()` |
| testAddYears...testAddMilliseconds | ตรวจสอบ delegate ไปยัง field ที่ถูกต้องของ `add()` |
| testRound/TruncateDate/Calendar/Object_Null | null check ของทุก overload |
| testRoundObject_Date/Calendar, testTruncateObject_Date/Calendar | `instanceof Date` / `instanceof Calendar` |
| testRoundObject_InvalidType, testTruncateObject_InvalidType | `else` → ClassCastException |
| testModify_UnsupportedField | loop จบโดยไม่ match → throw IllegalArgumentException ท้าย `modify()` |
| testModify_YearTooLarge | `val.get(YEAR) > 280000000` → ArithmeticException |
| testRound/Truncate_Milliseconds_NoOp | field match ทันที (i=0,j=0), `round&&roundUp` false เริ่มต้น |
| testTruncate/Round_HourOfDay_* | generic offsetSet=false branch, `round&&roundUp` true/false ที่ field match (non-SEMI_MONTH else branch) |
| testTruncate/Round_Year_* | loop ครบทุก field ก่อนถึง YEAR, `round&&roundUp` true/false |
| testTruncate/Round_SemiMonth_* | case `SEMI_MONTH`: `fields[i][0]==DATE`, `offset>=15`, `roundUp`, `val.get(DATE)==1` ทั้ง true/false, else-branch เดือนถัดไป |
| testTruncate/Round_AmPm_* | case `AM_PM`: `fields[i][0]==HOUR_OF_DAY`, `offset>=12`, `roundUp` true/false, else-branch เพิ่มวัน |
| testIterator_NullDate/NullCalendar/InvalidRangeStyle | null check + `default` throw ของ switch(rangeStyle) |
| testIteratorObject_Null/InvalidType/Date/Calendar | null check, instanceof Date/Calendar, else ClassCastException |
| testIterator_RangeMonthSunday/Monday | case `RANGE_MONTH_SUNDAY/MONDAY`, `startCutoff/endCutoff` reassignment |
| testIterator_RangeWeekSunday/Monday | case `RANGE_WEEK_SUNDAY/MONDAY` ภายใน switch ซ้อน |
| testIterator_RangeWeekRelative_SundayFocus | `endCutoff < SUNDAY` → `+=7` |
| testIterator_RangeWeekRelative_NormalFocus | ไม่ต้อง adjust cutoff |
| testIterator_RangeWeekCenter_SundayFocus | `startCutoff < SUNDAY` → `+=7` |
| testIterator_RangeWeekCenter_SaturdayFocus | `endCutoff > SATURDAY` → `-=7` |
| testDateIterator_NextThrowsAfterExhaustion | `spot.equals(endFinal)` → NoSuchElementException ใน `next()` |
| testDateIterator_RemoveThrowsUnsupported | `remove()` → UnsupportedOperationException เสมอ |
| testConstantsAndDefaultConstructor | ตรวจค่าคงที่ public และ default constructor |

**หมายเหตุ/ข้อจำกัดที่ไม่เดา behavior เพิ่ม:**
- เงื่อนไข `ERA` ใน `isSameDay`/`isSameLocalTime` ไม่สามารถทดสอบแยกสาขาได้ด้วย `GregorianCalendar` ปกติ (ต้องใช้ era ต่างกันซึ่งไม่ practical ในขอบเขตนี้)
- branch `startCutoff > Calendar.SATURDAY` ใน `iterator()` ไม่สามารถเข้าถึงได้จาก public range-style ที่มีอยู่ (คำนวณแล้วค่าสูงสุดของ startCutoff ไม่เกิน SATURDAY ในทุก case ที่มี) จึงไม่ได้เขียนเทสสำหรับ branch นี้