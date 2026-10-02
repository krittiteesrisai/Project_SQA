package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import org.junit.Test;

import org.apache.commons.lang3.time.DateUtils;

/**
 * JUnit4 test suite for org.apache.commons.lang3.time.DateUtils (Defects4J Lang-21b).
 * หมายเหตุ: พฤติกรรมของ Calendar ขึ้นกับ default TimeZone ของ JVM
 * เทสนี้จึงพยายามเลือกวันที่/เวลาที่ปลอดภัยจาก DST และใช้ Calendar.getInstance()
 * แบบเดียวกับที่ source code ใช้เพื่อสร้างค่าคาดหวัง (expected) ให้สอดคล้องกัน
 */
public class DateUtilsTest {

    // ---------- Helpers ----------
    private Date dateOf(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    private Calendar calOf(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal;
    }

    // =====================================================================
    // isSameDay(Date, Date)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_Date_nullFirst_throws() {
        DateUtils.isSameDay(null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_Date_nullSecond_throws() {
        DateUtils.isSameDay(new Date(), null);
    }

    @Test
    public void isSameDay_Date_sameDayDifferentTime_true() {
        Date d1 = dateOf(2002, Calendar.MARCH, 28, 13, 45, 0, 0);
        Date d2 = dateOf(2002, Calendar.MARCH, 28, 6, 1, 0, 0);
        assertTrue(DateUtils.isSameDay(d1, d2));
    }

    @Test
    public void isSameDay_Date_differentDay_false() {
        Date d1 = dateOf(2002, Calendar.MARCH, 28, 13, 45, 0, 0);
        Date d2 = dateOf(2002, Calendar.MARCH, 12, 13, 45, 0, 0);
        assertFalse(DateUtils.isSameDay(d1, d2));
    }

    // =====================================================================
    // isSameDay(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_Cal_nullFirst_throws() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_Cal_nullSecond_throws() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void isSameDay_Cal_sameDay_true() {
        Calendar c1 = calOf(2002, Calendar.MARCH, 28, 13, 45, 0, 0);
        Calendar c2 = calOf(2002, Calendar.MARCH, 28, 6, 1, 0, 0);
        assertTrue(DateUtils.isSameDay(c1, c2));
    }

    @Test
    public void isSameDay_Cal_differentYearSameDayOfYear_false() {
        Calendar c1 = calOf(2002, Calendar.MARCH, 28, 0, 0, 0, 0);
        Calendar c2 = calOf(2003, Calendar.MARCH, 28, 0, 0, 0, 0);
        assertFalse(DateUtils.isSameDay(c1, c2));
    }

    // =====================================================================
    // isSameInstant(Date, Date)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_Date_null_throws() {
        DateUtils.isSameInstant(null, new Date());
    }

    @Test
    public void isSameInstant_Date_sameMillis_true() {
        Date d1 = new Date(123456789L);
        Date d2 = new Date(123456789L);
        assertTrue(DateUtils.isSameInstant(d1, d2));
    }

    @Test
    public void isSameInstant_Date_diffMillis_false() {
        Date d1 = new Date(123456789L);
        Date d2 = new Date(123456790L);
        assertFalse(DateUtils.isSameInstant(d1, d2));
    }

    // =====================================================================
    // isSameInstant(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_Cal_null_throws() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test
    public void isSameInstant_Cal_same_true() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(1000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));
    }

    @Test
    public void isSameInstant_Cal_diff_false() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(2000L);
        assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    // =====================================================================
    // isSameLocalTime(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void isSameLocalTime_null_throws() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test
    public void isSameLocalTime_sameFieldsSameClass_true() {
        Calendar c1 = calOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        Calendar c2 = calOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertTrue(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void isSameLocalTime_diffFields_false() {
        Calendar c1 = calOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        Calendar c2 = calOf(2008, Calendar.JANUARY, 1, 8, 15, 10, 538);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void isSameLocalTime_diffClass_false() {
        Calendar c1 = calOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        // anonymous subclass => different getClass() even with identical field values
        Calendar c2 = new GregorianCalendar() {
        };
        c2.clear();
        c2.set(2008, Calendar.JANUARY, 1, 7, 15, 10);
        c2.set(Calendar.MILLISECOND, 538);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    // =====================================================================
    // parseDate / parseDateStrictly  (parseDateWithLeniency)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void parseDate_nullStr_throws() throws ParseException {
        DateUtils.parseDate(null, "yyyy-MM-dd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDate_nullPatterns_throws() throws ParseException {
        DateUtils.parseDate("2009-10-16", (String[]) null);
    }

    @Test
    public void parseDate_matchesFirstPattern() throws ParseException {
        Date expected = dateOf(2009, Calendar.OCTOBER, 16, 0, 0, 0, 0);
        Date actual = DateUtils.parseDate("2009-10-16", "yyyy-MM-dd");
        assertEquals(expected, actual);
    }

    @Test
    public void parseDate_fallsBackToSecondPattern() throws ParseException {
        Date expected = dateOf(2009, Calendar.OCTOBER, 16, 0, 0, 0, 0);
        // first pattern cannot fully match, second pattern "dd/MM/yyyy" matches
        Date actual = DateUtils.parseDate("16/10/2009", "yyyy-MM-dd", "dd/MM/yyyy");
        assertEquals(expected, actual);
    }

    @Test(expected = ParseException.class)
    public void parseDate_noPatternMatches_throwsParseException() throws ParseException {
        DateUtils.parseDate("not-a-date", "yyyy-MM-dd");
    }

    @Test
    public void parseDate_lenient_rollsOverInvalidDate() throws ParseException {
        // Feb 30 2008 (2008 is leap, Feb has 29 days) -> lenient rolls to Mar 1
        Date actual = DateUtils.parseDate("2008-02-30", "yyyy-MM-dd");
        assertNotNull(actual);
    }

    @Test(expected = ParseException.class)
    public void parseDateStrictly_invalidDate_throws() throws ParseException {
        DateUtils.parseDateStrictly("2008-02-30", "yyyy-MM-dd");
    }

    @Test
    public void parseDate_ZZ_patternHandled() throws ParseException {
        // LANG-530 fix: pattern ending with ZZ, offset with colon in input
        Date actual = DateUtils.parseDate("2009-10-16T16:42:16-07:00", "yyyy-MM-dd'T'HH:mm:ssZZ");
        Calendar expectedCal = Calendar.getInstance(TimeZone.getTimeZone("GMT-07:00"));
        expectedCal.clear();
        expectedCal.set(2009, Calendar.OCTOBER, 16, 16, 42, 16);
        assertEquals(expectedCal.getTime().getTime(), actual.getTime());
    }

    // =====================================================================
    // add* methods (private add())
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void addYears_null_throws() {
        DateUtils.addYears(null, 1);
    }

    @Test
    public void addYears_correct() {
        Date d = dateOf(2000, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2001, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.addYears(d, 1));
    }

    @Test
    public void addMonths_crossesYearBoundary() {
        Date d = dateOf(2008, Calendar.DECEMBER, 31, 0, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 31, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.addMonths(d, 1));
    }

    @Test
    public void addWeeks_adds7Days() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 8, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.addWeeks(d, 1));
    }

    @Test
    public void addDays_adds1Day() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 2, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.addDays(d, 1));
    }

    @Test
    public void addHours_adds1Hour() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 1, 11, 0, 0, 0);
        assertEquals(expected, DateUtils.addHours(d, 1));
    }

    @Test
    public void addMinutes_adds1Minute() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 1, 10, 1, 0, 0);
        assertEquals(expected, DateUtils.addMinutes(d, 1));
    }

    @Test
    public void addSeconds_adds1Second() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 1, 0);
        assertEquals(expected, DateUtils.addSeconds(d, 1));
    }

    @Test
    public void addMilliseconds_adds1Millisecond() {
        Date d = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 0, 0);
        Date expected = dateOf(2009, Calendar.JANUARY, 1, 10, 0, 0, 1);
        assertEquals(expected, DateUtils.addMilliseconds(d, 1));
    }

    // =====================================================================
    // set* methods (private set())
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void setYears_null_throws() {
        DateUtils.setYears(null, 2000);
    }

    @Test
    public void setYears_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2000, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.setYears(d, 2000));
    }

    @Test
    public void setMonths_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JUNE, 1, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.setMonths(d, Calendar.JUNE));
    }

    @Test
    public void setDays_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JANUARY, 10, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.setDays(d, 10));
    }

    @Test
    public void setHours_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals(expected, DateUtils.setHours(d, 5));
    }

    @Test
    public void setMinutes_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JANUARY, 1, 0, 5, 0, 0);
        assertEquals(expected, DateUtils.setMinutes(d, 5));
    }

    @Test
    public void setSeconds_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 5, 0);
        assertEquals(expected, DateUtils.setSeconds(d, 5));
    }

    @Test
    public void setMilliseconds_correct() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 5);
        assertEquals(expected, DateUtils.setMilliseconds(d, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMonths_invalidValue_nonLenient_throws() {
        // month=13 invalid; Calendar is non-lenient inside set() -> IllegalArgumentException on getTime()
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        DateUtils.setMonths(d, 13);
    }

    // =====================================================================
    // toCalendar
    // =====================================================================
    @Test
    public void toCalendar_valid() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Calendar c = DateUtils.toCalendar(d);
        assertEquals(d, c.getTime());
    }

    @Test(expected = NullPointerException.class)
    public void toCalendar_null_throwsNPE() {
        // no explicit null check in source -> Calendar.setTime(null) throws NPE
        DateUtils.toCalendar(null);
    }

    // =====================================================================
    // round / truncate / ceiling  (Date, Calendar, Object overloads + modify())
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void round_Date_null_throws() {
        DateUtils.round((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void round_Calendar_null_throws() {
        DateUtils.round((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void round_Object_null_throws() {
        DateUtils.round((Object) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = ClassCastException.class)
    public void round_Object_invalidType_throws() {
        DateUtils.round((Object) "not a date", Calendar.HOUR_OF_DAY);
    }

    @Test
    public void round_HOUR_OF_DAY_roundUpBranch() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 14, 0, 0, 0);
        assertEquals(expected, DateUtils.round(d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void round_HOUR_OF_DAY_roundDownBranch() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 10, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 13, 0, 0, 0);
        assertEquals(expected, DateUtils.round(d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void round_Object_DateInstance_delegatesCorrectly() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 14, 0, 0, 0);
        assertEquals(expected, DateUtils.round((Object) d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void round_Object_CalendarInstance_delegatesCorrectly() {
        Calendar c = calOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 14, 0, 0, 0);
        assertEquals(expected, DateUtils.round((Object) c, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = IllegalArgumentException.class)
    public void truncate_Date_null_throws() {
        DateUtils.truncate((Date) null, Calendar.DATE);
    }

    @Test
    public void truncate_HOUR_OF_DAY_alwaysDrops() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 10, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 13, 0, 0, 0);
        assertEquals(expected, DateUtils.truncate(d, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void truncate_Object_invalidType_throws() {
        DateUtils.truncate((Object) Integer.valueOf(1), Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ceiling_Date_null_throws() {
        DateUtils.ceiling((Date) null, Calendar.DATE);
    }

    @Test
    public void ceiling_HOUR_OF_DAY_alwaysRoundsUp() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 10, 1, 231);
        Date expected = dateOf(2002, Calendar.JULY, 15, 14, 0, 0, 0);
        assertEquals(expected, DateUtils.ceiling(d, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void ceiling_Object_invalidType_throws() {
        DateUtils.ceiling((Object) new Object(), Calendar.DATE);
    }

    // ---- modify(): SEMI_MONTH special case (both branches) ----
    @Test
    public void ceiling_SEMI_MONTH_dateIsOne_addsFifteenDays() {
        Date d = dateOf(2002, Calendar.JANUARY, 1, 0, 0, 0, 0);
        Date expected = dateOf(2002, Calendar.JANUARY, 16, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.ceiling(d, DateUtils.SEMI_MONTH));
    }

    @Test
    public void ceiling_SEMI_MONTH_dateNotOne_subtractsAndAddsMonth() {
        Date d = dateOf(2002, Calendar.JANUARY, 20, 0, 0, 0, 0);
        Date expected = dateOf(2002, Calendar.FEBRUARY, 1, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.ceiling(d, DateUtils.SEMI_MONTH));
    }

    // ---- modify(): AM_PM special case (both branches) ----
    @Test
    public void ceiling_AM_PM_hourZeroBranch_addsTwelveHours() {
        Date d = dateOf(2002, Calendar.JANUARY, 1, 8, 0, 0, 0);
        Date expected = dateOf(2002, Calendar.JANUARY, 1, 12, 0, 0, 0);
        assertEquals(expected, DateUtils.ceiling(d, Calendar.AM_PM));
    }

    @Test
    public void ceiling_AM_PM_hourNonZeroBranch_subtractsAndAddsDay() {
        Date d = dateOf(2002, Calendar.JANUARY, 1, 18, 0, 0, 0);
        Date expected = dateOf(2002, Calendar.JANUARY, 2, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.ceiling(d, Calendar.AM_PM));
    }

    // ---- modify(): MILLISECOND short-circuit ----
    @Test
    public void truncate_MILLISECOND_field_returnsUnchanged() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        assertEquals(d, DateUtils.truncate(d, Calendar.MILLISECOND));
    }

    // ---- modify(): unsupported field -> IllegalArgumentException ----
    @Test(expected = IllegalArgumentException.class)
    public void truncate_unsupportedField_throws() {
        Date d = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        DateUtils.truncate(d, Calendar.DAY_OF_WEEK);
    }

    // ---- modify(): ArithmeticException year too large ----
    @Test(expected = ArithmeticException.class)
    public void truncate_yearTooLarge_throwsArithmeticException() {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(c, Calendar.YEAR);
    }

    // =====================================================================
    // iterator (Date, Calendar, Object overloads)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void iterator_Date_null_throws() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_Calendar_null_throws() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_Object_null_throws() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void iterator_Object_invalidType_throws() {
        DateUtils.iterator((Object) "not a date", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_invalidRangeStyle_throws() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        DateUtils.iterator(focus, 9999);
    }

    @Test
    public void iterator_RANGE_WEEK_SUNDAY_startSundayEndSaturday() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0); // Thursday
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        Calendar first = null, last = null;
        int count = 0;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = c;
            last = c;
            count++;
        }
        assertEquals(7, count);
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_RANGE_WEEK_MONDAY_startMondayEndSunday() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_MONDAY);
        Calendar first = null, last = null;
        int count = 0;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = c;
            last = c;
            count++;
        }
        assertEquals(7, count);
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_RANGE_WEEK_RELATIVE_startsAtFocusDay() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0); // Thursday
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first = null, last = null;
        int count = 0;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = c;
            last = c;
            count++;
        }
        assertEquals(7, count);
        assertEquals(Calendar.THURSDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.WEDNESDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_RANGE_WEEK_CENTER_centeredAroundFocus() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0); // Thursday
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_CENTER);
        int count = 0;
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = c;
            last = c;
            count++;
        }
        assertEquals(7, count);
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_RANGE_MONTH_SUNDAY_matchesJavadocExample() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = (Calendar) c.clone();
            last = (Calendar) c.clone();
        }
        assertEquals(Calendar.JUNE, first.get(Calendar.MONTH));
        assertEquals(30, first.get(Calendar.DATE));
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.AUGUST, last.get(Calendar.MONTH));
        assertEquals(3, last.get(Calendar.DATE));
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_RANGE_MONTH_MONDAY_startMondayEndSunday() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_MONDAY);
        Calendar first = null, last = null;
        while (it.hasNext()) {
            Calendar c = it.next();
            if (first == null) first = (Calendar) c.clone();
            last = (Calendar) c.clone();
        }
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_Object_DateAndCalendar_delegate() {
        Date focusDate = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Calendar focusCal = calOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        assertNotNull(DateUtils.iterator((Object) focusDate, DateUtils.RANGE_WEEK_SUNDAY));
        assertNotNull(DateUtils.iterator((Object) focusCal, DateUtils.RANGE_WEEK_SUNDAY));
    }

    // ---- DateIterator inner class behavior ----
    @Test(expected = NoSuchElementException.class)
    @SuppressWarnings("unchecked")
    public void dateIterator_next_afterExhaustion_throwsNoSuchElement() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next(); // should throw
    }

    @Test(expected = UnsupportedOperationException.class)
    public void dateIterator_remove_throwsUnsupported() {
        Date focus = dateOf(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }

    // =====================================================================
    // getFragmentInXxx (Date, Calendar) + getFragment()
    // =====================================================================
    @Test
    public void getFragmentInMilliseconds_Date_secondFragment() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertEquals(538L, DateUtils.getFragmentInMilliseconds(d, Calendar.SECOND));
    }

    @Test
    public void getFragmentInSeconds_Date_minuteFragment() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertEquals(10L, DateUtils.getFragmentInSeconds(d, Calendar.MINUTE));
    }

    @Test
    public void getFragmentInMinutes_Date_hourFragment() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertEquals(15L, DateUtils.getFragmentInMinutes(d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void getFragmentInHours_Date_dayOfYearFragment() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertEquals(7L, DateUtils.getFragmentInHours(d, Calendar.DAY_OF_YEAR));
    }

    @Test
    public void getFragmentInDays_Date_monthFragment() {
        Date d = dateOf(2008, Calendar.JANUARY, 28, 0, 0, 0, 0);
        assertEquals(28L, DateUtils.getFragmentInDays(d, Calendar.MONTH));
    }

    @Test
    public void getFragmentInDays_Date_yearFragment() {
        Date d = dateOf(2009, Calendar.FEBRUARY, 28, 0, 0, 0, 0); // 2009 non-leap
        assertEquals(59L, DateUtils.getFragmentInDays(d, Calendar.YEAR));
    }

    @Test
    public void getFragmentInMilliseconds_Date_millisecondFragment_returnsZero() {
        Date d = dateOf(2008, Calendar.JANUARY, 16, 7, 15, 10, 538);
        assertEquals(0L, DateUtils.getFragmentInMilliseconds(d, Calendar.MILLISECOND));
    }

    @Test
    public void getFragmentInHours_Calendar_matchesDateVersion() {
        Calendar c = calOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        assertEquals(7L, DateUtils.getFragmentInHours(c, Calendar.DAY_OF_YEAR));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_unsupportedFragment_throws() {
        Date d = dateOf(2008, Calendar.JANUARY, 1, 7, 15, 10, 538);
        DateUtils.getFragmentInMilliseconds(d, Calendar.DAY_OF_WEEK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_nullDate_throws() {
        DateUtils.getFragmentInMilliseconds((Date) null, Calendar.SECOND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_nullCalendar_throws() {
        DateUtils.getFragmentInMilliseconds((Calendar) null, Calendar.SECOND);
    }

    // =====================================================================
    // truncatedEquals / truncatedCompareTo
    // =====================================================================
    @Test
    public void truncatedEquals_Date_sameDay_true() {
        Date d1 = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date d2 = dateOf(2002, Calendar.JULY, 15, 9, 0, 0, 0);
        assertTrue(DateUtils.truncatedEquals(d1, d2, Calendar.DATE));
    }

    @Test
    public void truncatedEquals_Date_differentHour_false() {
        Date d1 = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date d2 = dateOf(2002, Calendar.JULY, 15, 9, 0, 0, 0);
        assertFalse(DateUtils.truncatedEquals(d1, d2, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void truncatedCompareTo_Date_positive() {
        Date d1 = dateOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Date d2 = dateOf(2002, Calendar.JULY, 15, 9, 0, 0, 0);
        assertTrue(DateUtils.truncatedCompareTo(d1, d2, Calendar.HOUR_OF_DAY) > 0);
    }

    @Test
    public void truncatedEquals_Calendar_sameDay_true() {
        Calendar c1 = calOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        Calendar c2 = calOf(2002, Calendar.JULY, 15, 9, 0, 0, 0);
        assertTrue(DateUtils.truncatedEquals(c1, c2, Calendar.DATE));
    }

    @Test
    public void truncatedCompareTo_Calendar_negative() {
        Calendar c1 = calOf(2002, Calendar.JULY, 15, 9, 0, 0, 0);
        Calendar c2 = calOf(2002, Calendar.JULY, 15, 13, 45, 1, 231);
        assertTrue(DateUtils.truncatedCompareTo(c1, c2, Calendar.HOUR_OF_DAY) < 0);
    }
}
