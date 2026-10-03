package org.apache.commons.lang.time;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class DateUtilsTest {

    private Date date1;
    private Date date2;
    private Calendar cal1;
    private Calendar cal2;
    private TimeZone defaultZone;

    @Before
    public void setUp() {
        defaultZone = TimeZone.getDefault();
        cal1 = Calendar.getInstance();
        cal1.set(2004, Calendar.JULY, 4, 12, 34, 56);
        cal1.set(Calendar.MILLISECOND, 789);
        date1 = cal1.getTime();

        cal2 = Calendar.getInstance();
        cal2.set(2004, Calendar.JULY, 4, 12, 34, 56);
        cal2.set(Calendar.MILLISECOND, 789);
        date2 = cal2.getTime();
    }

    // -----------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new DateUtils());
    }

    // -----------------------------------------------------------------------
    // isSameDay
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Date() {
        assertTrue(DateUtils.isSameDay(date1, date2));

        cal2.add(Calendar.HOUR_OF_DAY, 2);
        assertTrue(DateUtils.isSameDay(date1, cal2.getTime()));

        cal2.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameDay(date1, cal2.getTime()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullFirst() {
        DateUtils.isSameDay((Date) null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullSecond() {
        DateUtils.isSameDay(date1, (Date) null);
    }

    @Test
    public void testIsSameDay_Calendar() {
        assertTrue(DateUtils.isSameDay(cal1, cal2));

        cal2.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameDay(cal1, cal2));

        cal2.set(Calendar.ERA, GregorianCalendar.AD);
        cal2.add(Calendar.YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, cal2));

        cal2.add(Calendar.YEAR, -1);
        cal2.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullFirst() {
        DateUtils.isSameDay((Calendar) null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullSecond() {
        DateUtils.isSameDay(cal1, (Calendar) null);
    }

    // -----------------------------------------------------------------------
    // isSameInstant
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Date() {
        assertTrue(DateUtils.isSameInstant(date1, date2));
        cal2.add(Calendar.MILLISECOND, 1);
        assertFalse(DateUtils.isSameInstant(date1, cal2.getTime()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_NullFirst() {
        DateUtils.isSameInstant((Date) null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_NullSecond() {
        DateUtils.isSameInstant(date1, (Date) null);
    }

    @Test
    public void testIsSameInstant_Calendar() {
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
        cal2.add(Calendar.MILLISECOND, 1);
        assertFalse(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_NullFirst() {
        DateUtils.isSameInstant((Calendar) null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_NullSecond() {
        DateUtils.isSameInstant(cal1, (Calendar) null);
    }

    // -----------------------------------------------------------------------
    // isSameLocalTime
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameLocalTime_Calendar() {
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.MILLISECOND, 100);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.MILLISECOND, cal1.get(Calendar.MILLISECOND));
        cal2.set(Calendar.SECOND, 10);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.SECOND, cal1.get(Calendar.SECOND));
        cal2.set(Calendar.MINUTE, 10);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.MINUTE, cal1.get(Calendar.MINUTE));
        cal2.set(Calendar.HOUR, 1);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.HOUR, cal1.get(Calendar.HOUR));
        cal2.set(Calendar.DAY_OF_YEAR, 10);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.DAY_OF_YEAR, cal1.get(Calendar.DAY_OF_YEAR));
        cal2.set(Calendar.YEAR, 1999);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.YEAR, cal1.get(Calendar.YEAR));
        cal2.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));

        cal2.set(Calendar.ERA, cal1.get(Calendar.ERA));
        // Different sub-class / type
        Calendar customCal = new GregorianCalendar() {};
        customCal.setTime(cal1.getTime());
        assertFalse(DateUtils.isSameLocalTime(cal1, customCal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullFirst() {
        DateUtils.isSameLocalTime(null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullSecond() {
        DateUtils.isSameLocalTime(cal1, null);
    }

    // -----------------------------------------------------------------------
    // parseDate
    // -----------------------------------------------------------------------
    @Test
    public void testParseDate() throws Exception {
        String[] parsePatterns = new String[]{"yyyy-MM-dd", "yyyy/MM/dd HH:mm:ss", "yyyyMMdd"};
        
        Date d1 = DateUtils.parseDate("2004-07-04", parsePatterns);
        assertNotNull(d1);

        Date d2 = DateUtils.parseDate("2004/07/04 12:34:56", parsePatterns);
        assertNotNull(d2);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_Unmatched() throws Exception {
        String[] parsePatterns = new String[]{"yyyy-MM-dd"};
        DateUtils.parseDate("20040704", parsePatterns);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_Incomplete() throws Exception {
        String[] parsePatterns = new String[]{"yyyy-MM-dd"};
        DateUtils.parseDate("2004-07-04 EXTRA_TEXT", parsePatterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullString() throws Exception {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws Exception {
        DateUtils.parseDate("2004-07-04", null);
    }

    // -----------------------------------------------------------------------
    // add* Methods
    // -----------------------------------------------------------------------
    @Test
    public void testAddMethods() {
        assertEquals(2005, getCalendar(DateUtils.addYears(date1, 1)).get(Calendar.YEAR));
        assertEquals(2003, getCalendar(DateUtils.addYears(date1, -1)).get(Calendar.YEAR));

        assertEquals(Calendar.AUGUST, getCalendar(DateUtils.addMonths(date1, 1)).get(Calendar.MONTH));
        assertEquals(Calendar.JUNE, getCalendar(DateUtils.addMonths(date1, -1)).get(Calendar.MONTH));

        assertEquals(11, getCalendar(DateUtils.addWeeks(date1, 1)).get(Calendar.DAY_OF_MONTH));
        assertEquals(27, getCalendar(DateUtils.addWeeks(date1, -1)).get(Calendar.DAY_OF_MONTH));

        assertEquals(5, getCalendar(DateUtils.addDays(date1, 1)).get(Calendar.DAY_OF_MONTH));
        assertEquals(3, getCalendar(DateUtils.addDays(date1, -1)).get(Calendar.DAY_OF_MONTH));

        assertEquals(13, getCalendar(DateUtils.addHours(date1, 1)).get(Calendar.HOUR_OF_DAY));
        assertEquals(11, getCalendar(DateUtils.addHours(date1, -1)).get(Calendar.HOUR_OF_DAY));

        assertEquals(35, getCalendar(DateUtils.addMinutes(date1, 1)).get(Calendar.MINUTE));
        assertEquals(33, getCalendar(DateUtils.addMinutes(date1, -1)).get(Calendar.MINUTE));

        assertEquals(57, getCalendar(DateUtils.addSeconds(date1, 1)).get(Calendar.SECOND));
        assertEquals(55, getCalendar(DateUtils.addSeconds(date1, -1)).get(Calendar.SECOND));

        assertEquals(790, getCalendar(DateUtils.addMilliseconds(date1, 1)).get(Calendar.MILLISECOND));
        assertEquals(788, getCalendar(DateUtils.addMilliseconds(date1, -1)).get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.DATE, 1);
    }

    // -----------------------------------------------------------------------
    // round & truncate
    // -----------------------------------------------------------------------
    @Test
    public void testRound_Date_Calendar_Object() {
        cal1.set(2004, Calendar.JULY, 4, 12, 34, 56);
        cal1.set(Calendar.MILLISECOND, 789);

        // Rounding millisecond field returns unchanged
        Date roundedMilli = DateUtils.round(cal1.getTime(), Calendar.MILLISECOND);
        assertEquals(cal1.getTime(), roundedMilli);

        // Object overload
        Date objDate = DateUtils.round((Object) cal1.getTime(), Calendar.SECOND);
        assertNotNull(objDate);
        Date objCal = DateUtils.round((Object) cal1, Calendar.SECOND);
        assertNotNull(objCal);

        // Calendar overload
        Calendar calRound = DateUtils.round(cal1, Calendar.SECOND);
        assertEquals(57, calRound.get(Calendar.SECOND));
        assertEquals(0, calRound.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncate_Date_Calendar_Object() {
        cal1.set(2004, Calendar.JULY, 4, 12, 34, 56);
        cal1.set(Calendar.MILLISECOND, 789);

        Date truncDate = DateUtils.truncate(cal1.getTime(), Calendar.MINUTE);
        Calendar res = getCalendar(truncDate);
        assertEquals(0, res.get(Calendar.SECOND));
        assertEquals(0, res.get(Calendar.MILLISECOND));

        // Object overload
        Date objDate = DateUtils.truncate((Object) cal1.getTime(), Calendar.SECOND);
        assertNotNull(objDate);
        Date objCal = DateUtils.truncate((Object) cal1, Calendar.SECOND);
        assertNotNull(objCal);

        // Calendar overload
        Calendar calTrunc = DateUtils.truncate(cal1, Calendar.SECOND);
        assertEquals(56, calTrunc.get(Calendar.SECOND));
        assertEquals(0, calTrunc.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Null() {
        DateUtils.round((Date) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Calendar_Null() {
        DateUtils.round((Calendar) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Object_Null() {
        DateUtils.round((Object) null, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testRound_Object_InvalidType() {
        DateUtils.round("Not a date", Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Null() {
        DateUtils.truncate((Date) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Calendar_Null() {
        DateUtils.truncate((Calendar) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Object_Null() {
        DateUtils.truncate((Object) null, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_Object_InvalidType() {
        DateUtils.truncate(new Integer(123), Calendar.DATE);
    }

    @Test(expected = ArithmeticException.class)
    public void testRound_LargeYear() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.round(c, Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_UnsupportedField() {
        DateUtils.round(cal1, -9999);
    }

    @Test
    public void testRoundAndTruncate_VariousFields() {
        // Test YEAR, MONTH, DATE, HOUR_OF_DAY, MINUTE, SECOND rounding and truncation
        Calendar base = Calendar.getInstance();
        base.set(2004, Calendar.JUNE, 16, 18, 45, 45);
        base.set(Calendar.MILLISECOND, 600);

        // Round YEAR
        assertEquals(2004, DateUtils.round(base, Calendar.YEAR).get(Calendar.YEAR));
        base.set(Calendar.MONTH, Calendar.JULY);
        assertEquals(2005, DateUtils.round(base, Calendar.YEAR).get(Calendar.YEAR));

        // Truncate YEAR
        assertEquals(2004, DateUtils.truncate(base, Calendar.YEAR).get(Calendar.YEAR));

        // Round MONTH
        base.set(2004, Calendar.JULY, 20, 0, 0, 0);
        assertEquals(Calendar.AUGUST, DateUtils.round(base, Calendar.MONTH).get(Calendar.MONTH));
        base.set(2004, Calendar.JULY, 10, 0, 0, 0);
        assertEquals(Calendar.JULY, DateUtils.round(base, Calendar.MONTH).get(Calendar.MONTH));

        // Round HOUR
        base.set(2004, Calendar.JULY, 4, 12, 45, 0);
        assertEquals(13, DateUtils.round(base, Calendar.HOUR).get(Calendar.HOUR_OF_DAY));
        base.set(2004, Calendar.JULY, 4, 12, 15, 0);
        assertEquals(12, DateUtils.round(base, Calendar.HOUR).get(Calendar.HOUR_OF_DAY));

        // Round MINUTE
        base.set(2004, Calendar.JULY, 4, 12, 34, 45);
        assertEquals(35, DateUtils.round(base, Calendar.MINUTE).get(Calendar.MINUTE));
        base.set(2004, Calendar.JULY, 4, 12, 34, 15);
        assertEquals(34, DateUtils.round(base, Calendar.MINUTE).get(Calendar.MINUTE));
    }

    @Test
    public void testRound_LANG_53_MinuteAndSecond() {
        // LANG-53 Bug: rounding minutes when seconds >= 30, or seconds when millis >= 500
        Calendar c = Calendar.getInstance();
        c.set(2004, Calendar.JULY, 4, 12, 30, 45);
        c.set(Calendar.MILLISECOND, 0);

        Calendar r1 = DateUtils.round(c, Calendar.MINUTE);
        assertEquals(31, r1.get(Calendar.MINUTE));
        assertEquals(0, r1.get(Calendar.SECOND));

        c.set(2004, Calendar.JULY, 4, 12, 30, 15);
        c.set(Calendar.MILLISECOND, 600);
        Calendar r2 = DateUtils.round(c, Calendar.SECOND);
        assertEquals(16, r2.get(Calendar.SECOND));
        assertEquals(0, r2.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRoundAndTruncate_SemiMonth() {
        Calendar c = Calendar.getInstance();

        // 1st of month rounded with SEMI_MONTH -> day becomes 16
        c.set(2004, Calendar.JULY, 1, 0, 0, 0);
        c.set(Calendar.MILLISECOND, 0);
        Calendar r1 = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r1.get(Calendar.DAY_OF_MONTH));

        // 10th of month (top half, offset = 9 > 7 -> round up to 16)
        c.set(2004, Calendar.JULY, 10, 0, 0, 0);
        Calendar r2 = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(16, r2.get(Calendar.DAY_OF_MONTH));

        // 5th of month (top half, offset = 4 <= 7 -> round down to 1)
        c.set(2004, Calendar.JULY, 5, 0, 0, 0);
        Calendar r3 = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r3.get(Calendar.DAY_OF_MONTH));

        // 20th of month (bottom half, offset = 19 - 15 = 4 <= 7 -> round down to 16)
        c.set(2004, Calendar.JULY, 20, 0, 0, 0);
        Calendar r4 = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(16, r4.get(Calendar.DAY_OF_MONTH));

        // 25th of month (bottom half, offset = 24 - 15 = 9 > 7 -> round up to next month 1st)
        c.set(2004, Calendar.JULY, 25, 0, 0, 0);
        Calendar r5 = DateUtils.round(c, DateUtils.SEMI_MONTH);
        assertEquals(1, r5.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.AUGUST, r5.get(Calendar.MONTH));

        // Truncate SEMI_MONTH
        c.set(2004, Calendar.JULY, 25, 0, 0, 0);
        Calendar t1 = DateUtils.truncate(c, DateUtils.SEMI_MONTH);
        assertEquals(16, t1.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.JULY, t1.get(Calendar.MONTH));

        c.set(2004, Calendar.JULY, 10, 0, 0, 0);
        Calendar t2 = DateUtils.truncate(c, DateUtils.SEMI_MONTH);
        assertEquals(1, t2.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.JULY, t2.get(Calendar.MONTH));
    }

    @Test
    public void testRoundAndTruncate_AmPm() {
        Calendar c = Calendar.getInstance();

        // 04:00 -> AM, offset 4 <= 6 -> round down to 00:00
        c.set(2004, Calendar.JULY, 4, 4, 0, 0);
        c.set(Calendar.MILLISECOND, 0);
        Calendar r1 = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(0, r1.get(Calendar.HOUR_OF_DAY));

        // 08:00 -> AM, offset 8 > 6 -> round up to 12:00
        c.set(2004, Calendar.JULY, 4, 8, 0, 0);
        Calendar r2 = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(12, r2.get(Calendar.HOUR_OF_DAY));

        // 15:00 -> PM, offset 15 - 12 = 3 <= 6 -> round down to 12:00
        c.set(2004, Calendar.JULY, 4, 15, 0, 0);
        Calendar r3 = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(12, r3.get(Calendar.HOUR_OF_DAY));

        // 20:00 -> PM, offset 20 - 12 = 8 > 6 -> round up to 00:00 next day
        c.set(2004, Calendar.JULY, 4, 20, 0, 0);
        Calendar r4 = DateUtils.round(c, Calendar.AM_PM);
        assertEquals(0, r4.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, r4.get(Calendar.DAY_OF_MONTH));
    }

    // -----------------------------------------------------------------------
    // iterator & DateIterator
    // -----------------------------------------------------------------------
    @Test
    public void testIterator_Styles() {
        cal1.set(2004, Calendar.JULY, 4); // Sunday

        // RANGE_MONTH_SUNDAY
        Iterator it1 = DateUtils.iterator(cal1, DateUtils.RANGE_MONTH_SUNDAY);
        assertNotNull(it1);
        assertTrue(it1.hasNext());
        Calendar first1 = (Calendar) it1.next();
        assertEquals(Calendar.SUNDAY, first1.get(Calendar.DAY_OF_WEEK));

        // RANGE_MONTH_MONDAY
        Iterator it2 = DateUtils.iterator(cal1, DateUtils.RANGE_MONTH_MONDAY);
        Calendar first2 = (Calendar) it2.next();
        assertEquals(Calendar.MONDAY, first2.get(Calendar.DAY_OF_WEEK));

        // RANGE_WEEK_SUNDAY
        Iterator it3 = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_SUNDAY);
        Calendar first3 = (Calendar) it3.next();
        assertEquals(Calendar.SUNDAY, first3.get(Calendar.DAY_OF_WEEK));

        // RANGE_WEEK_MONDAY
        Iterator it4 = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_MONDAY);
        Calendar first4 = (Calendar) it4.next();
        assertEquals(Calendar.MONDAY, first4.get(Calendar.DAY_OF_WEEK));

        // RANGE_WEEK_RELATIVE
        Iterator it5 = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first5 = (Calendar) it5.next();
        assertEquals(cal1.get(Calendar.DAY_OF_WEEK), first5.get(Calendar.DAY_OF_WEEK));

        // RANGE_WEEK_CENTER
        Iterator it6 = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(it6);

        // Date and Object overloads
        assertNotNull(DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY));
        assertNotNull(DateUtils.iterator((Object) cal1, DateUtils.RANGE_WEEK_SUNDAY));
        assertNotNull(DateUtils.iterator((Object) date1, DateUtils.RANGE_WEEK_SUNDAY));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullDate() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullCalendar() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullObject() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_InvalidObject() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidStyle() {
        DateUtils.iterator(cal1, 9999);
    }

    @Test
    public void testDateIterator_ExhaustionAndRemove() {
        Iterator it = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            assertNotNull(it.next());
        }
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // Success
        }

        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    // -----------------------------------------------------------------------
    // Helper
    // -----------------------------------------------------------------------
    private Calendar getCalendar(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        return c;
    }
}