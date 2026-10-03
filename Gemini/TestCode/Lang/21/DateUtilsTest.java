package org.apache.commons.lang3.time;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import static org.junit.Assert.*;

/**
 * High-coverage unit test suite for DateUtils (Defects4J Lang-21).
 */
public class DateUtilsTest {

    private DateFormat parser;
    private Date baseDate;
    private Calendar baseCal;

    @Before
    public void setUp() throws Exception {
        parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        parser.setTimeZone(TimeZone.getTimeZone("GMT"));
        baseDate = parser.parse("2020-06-15 13:45:30.500");
        baseCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        baseCal.setTime(baseDate);
    }

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new DateUtils());
    }

    // -----------------------------------------------------------------------
    // isSameDay Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Date_Success() throws Exception {
        Date d1 = parser.parse("2020-06-15 00:00:00.000");
        Date d2 = parser.parse("2020-06-15 23:59:59.999");
        Date d3 = parser.parse("2020-06-16 00:00:00.000");

        assertTrue(DateUtils.isSameDay(d1, d2));
        assertFalse(DateUtils.isSameDay(d1, d3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullFirst() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullSecond() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    @Test
    public void testIsSameDay_Calendar_Branches() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        cal2.set(2020, Calendar.JANUARY, 1, 15, 0, 0);
        assertTrue(DateUtils.isSameDay(cal1, cal2));

        // Different day of year
        cal2.set(2020, Calendar.JANUARY, 2, 10, 0, 0);
        assertFalse(DateUtils.isSameDay(cal1, cal2));

        // Different year
        cal2.set(2021, Calendar.JANUARY, 1, 10, 0, 0);
        assertFalse(DateUtils.isSameDay(cal1, cal2));

        // Different Era
        cal2.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_Null() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    // -----------------------------------------------------------------------
    // isSameInstant Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Date() {
        Date d1 = new Date(1000L);
        Date d2 = new Date(1000L);
        Date d3 = new Date(2000L);

        assertTrue(DateUtils.isSameInstant(d1, d2));
        assertFalse(DateUtils.isSameInstant(d1, d3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null2() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_Calendar() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTimeInMillis(5000L);
        c2.setTimeInMillis(5000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));

        c2.setTimeInMillis(5001L);
        assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    // -----------------------------------------------------------------------
    // isSameLocalTime Tests (Defects4J Lang-21 Target)
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameLocalTime_Equal() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2020, Calendar.APRIL, 10, 14, 30, 20);
        c1.set(Calendar.MILLISECOND, 123);

        Calendar c2 = (Calendar) c1.clone();
        assertTrue(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTime_DifferentFields() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2020, Calendar.APRIL, 10, 14, 30, 20);
        c1.set(Calendar.MILLISECOND, 100);

        Calendar c2 = (Calendar) c1.clone();
        c2.set(Calendar.MILLISECOND, 200);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.SECOND, 21);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.MINUTE, 31);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR) + 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.YEAR, 2021);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTime_Lang21_AmPmHourBug() {
        // AM vs PM with identical 12-hour clock (e.g. 02:00 AM vs 02:00 PM / 14:00)
        Calendar calAm = Calendar.getInstance();
        calAm.set(2020, Calendar.JANUARY, 1, 2, 0, 0);
        calAm.set(Calendar.MILLISECOND, 0);

        Calendar calPm = Calendar.getInstance();
        calPm.set(2020, Calendar.JANUARY, 1, 14, 0, 0);
        calPm.set(Calendar.MILLISECOND, 0);

        // Calendar.HOUR is 2 for both, but HOUR_OF_DAY differs (2 vs 14)
        assertFalse("AM and PM must not be considered same local time", DateUtils.isSameLocalTime(calAm, calPm));
    }

    @Test
    public void testIsSameLocalTime_DifferentClass() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar() {
            private static final long serialVersionUID = 1L;
        };
        c2.setTime(c1.getTime());
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    // -----------------------------------------------------------------------
    // Parsing Tests
    // -----------------------------------------------------------------------
    @Test
    public void testParseDate_SuccessAndZZ() throws ParseException {
        String[] patterns = new String[] { "yyyy-MM-dd'T'HH:mm:ssZZ", "yyyy/MM/dd" };
        Date d1 = DateUtils.parseDate("2020-05-01T12:00:00+00:00", patterns);
        assertNotNull(d1);

        Date d2 = DateUtils.parseDate("2020/05/01", patterns);
        assertNotNull(d2);
    }

    @Test
    public void testParseDate_LenientVsStrict() throws Exception {
        String[] patterns = new String[] { "yyyy-MM-dd" };
        // Lenient accepts overflow days
        Date lenientDate = DateUtils.parseDate("2020-02-31", patterns);
        assertNotNull(lenientDate);

        // Strict rejects overflow days
        try {
            DateUtils.parseDateStrictly("2020-02-31", patterns);
            fail("Expected ParseException on strict parsing");
        } catch (ParseException expected) {
            // Success
        }
    }

    @Test(expected = ParseException.class)
    public void testParseDate_NoMatchThrowsParseException() throws ParseException {
        DateUtils.parseDate("invalid-date", "yyyy-MM-dd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullString() throws ParseException {
        DateUtils.parseDate(null, "yyyy-MM-dd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws ParseException {
        DateUtils.parseDate("2020-01-01", (String[]) null);
    }

    // -----------------------------------------------------------------------
    // Add / Set Methods Tests
    // -----------------------------------------------------------------------
    @Test
    public void testAddMethods() {
        Date d = new Date(1000000000000L);
        assertNotNull(DateUtils.addYears(d, 1));
        assertNotNull(DateUtils.addMonths(d, -2));
        assertNotNull(DateUtils.addWeeks(d, 3));
        assertNotNull(DateUtils.addDays(d, 4));
        assertNotNull(DateUtils.addHours(d, -5));
        assertNotNull(DateUtils.addMinutes(d, 6));
        assertNotNull(DateUtils.addSeconds(d, -7));
        assertNotNull(DateUtils.addMilliseconds(d, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.addDays(null, 1);
    }

    @Test
    public void testSetMethods() {
        Date d = new Date(1000000000000L);
        assertEquals(2015, DateUtils.toCalendar(DateUtils.setYears(d, 2015)).get(Calendar.YEAR));
        assertEquals(Calendar.DECEMBER, DateUtils.toCalendar(DateUtils.setMonths(d, Calendar.DECEMBER)).get(Calendar.MONTH));
        assertEquals(15, DateUtils.toCalendar(DateUtils.setDays(d, 15)).get(Calendar.DAY_OF_MONTH));
        assertEquals(10, DateUtils.toCalendar(DateUtils.setHours(d, 10)).get(Calendar.HOUR_OF_DAY));
        assertEquals(45, DateUtils.toCalendar(DateUtils.setMinutes(d, 45)).get(Calendar.MINUTE));
        assertEquals(30, DateUtils.toCalendar(DateUtils.setSeconds(d, 30)).get(Calendar.SECOND));
        assertEquals(500, DateUtils.toCalendar(DateUtils.setMilliseconds(d, 500)).get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_NullDate() {
        DateUtils.setHours(null, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_InvalidValueStrict() {
        // non-lenient Calendar in set() should throw IllegalArgumentException
        DateUtils.setHours(new Date(), 99);
    }

    @Test(expected = NullPointerException.class)
    public void testToCalendar_Null() {
        DateUtils.toCalendar(null);
    }

    // -----------------------------------------------------------------------
    // Truncate / Round / Ceiling Tests (Modify Engine)
    // -----------------------------------------------------------------------
    @Test
    public void testTruncate_CalendarAndDate() throws Exception {
        Date target = parser.parse("2020-06-15 13:45:30.500");
        Date expectedHour = parser.parse("2020-06-15 13:00:00.000");
        Date expectedDay = parser.parse("2020-06-15 00:00:00.000");
        Date expectedMonth = parser.parse("2020-06-01 00:00:00.000");
        Date expectedYear = parser.parse("2020-01-01 00:00:00.000");

        assertEquals(expectedHour, DateUtils.truncate(target, Calendar.HOUR_OF_DAY));
        assertEquals(expectedDay, DateUtils.truncate(target, Calendar.DATE));
        assertEquals(expectedMonth, DateUtils.truncate(target, Calendar.MONTH));
        assertEquals(expectedYear, DateUtils.truncate(target, Calendar.YEAR));

        // Truncate Millisecond (fast return branch)
        assertEquals(target, DateUtils.truncate(target, Calendar.MILLISECOND));

        // Truncate Object
        assertEquals(expectedHour, DateUtils.truncate((Object) target, Calendar.HOUR_OF_DAY));
        assertEquals(expectedHour, DateUtils.truncate((Object) baseCal, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testRound_CalendarAndDate() throws Exception {
        Date low = parser.parse("2020-06-15 13:10:10.200");
        Date high = parser.parse("2020-06-15 13:50:50.800");

        assertEquals(parser.parse("2020-06-15 13:00:00.000"), DateUtils.round(low, Calendar.HOUR_OF_DAY));
        assertEquals(parser.parse("2020-06-15 14:00:00.000"), DateUtils.round(high, Calendar.HOUR_OF_DAY));

        // Round Object
        assertEquals(parser.parse("2020-06-15 13:00:00.000"), DateUtils.round((Object) low, Calendar.HOUR_OF_DAY));
        assertEquals(parser.parse("2020-06-15 14:00:00.000"), DateUtils.round((Object) DateUtils.toCalendar(high), Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testCeiling_CalendarAndDate() throws Exception {
        Date date = parser.parse("2020-06-15 13:10:10.200");
        assertEquals(parser.parse("2020-06-15 14:00:00.000"), DateUtils.ceiling(date, Calendar.HOUR_OF_DAY));
        assertEquals(parser.parse("2020-06-15 13:11:00.000"), DateUtils.ceiling(date, Calendar.MINUTE));
        assertEquals(parser.parse("2020-06-15 13:10:11.000"), DateUtils.ceiling(date, Calendar.SECOND));

        // Ceiling Object
        assertEquals(parser.parse("2020-06-15 14:00:00.000"), DateUtils.ceiling((Object) date, Calendar.HOUR_OF_DAY));
        assertEquals(parser.parse("2020-06-15 14:00:00.000"), DateUtils.ceiling((Object) DateUtils.toCalendar(date), Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testModify_SemiMonthBranches() throws Exception {
        // Date = 1 (top half) -> Round/Ceil to 16
        Date d1 = parser.parse("2020-06-01 00:00:00.000");
        assertEquals(parser.parse("2020-06-16 00:00:00.000"), DateUtils.ceiling(d1, DateUtils.SEMI_MONTH));

        // Date > 1 (bottom half) -> Round/Ceil to 1st of next month
        Date d2 = parser.parse("2020-06-20 00:00:00.000");
        assertEquals(parser.parse("2020-07-01 00:00:00.000"), DateUtils.ceiling(d2, DateUtils.SEMI_MONTH));

        // Date in first half rounding down
        Date d3 = parser.parse("2020-06-05 00:00:00.000");
        assertEquals(parser.parse("2020-06-01 00:00:00.000"), DateUtils.round(d3, DateUtils.SEMI_MONTH));

        // Date in first half rounding up
        Date d4 = parser.parse("2020-06-10 00:00:00.000");
        assertEquals(parser.parse("2020-06-16 00:00:00.000"), DateUtils.round(d4, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testModify_AmPmBranches() throws Exception {
        // HOUR_OF_DAY == 0
        Date d1 = parser.parse("2020-06-15 00:00:00.000");
        assertEquals(parser.parse("2020-06-15 12:00:00.000"), DateUtils.ceiling(d1, Calendar.AM_PM));

        // HOUR_OF_DAY != 0 (e.g. 13:00 -> Ceil to next day 00:00)
        Date d2 = parser.parse("2020-06-15 13:00:00.000");
        assertEquals(parser.parse("2020-06-16 00:00:00.000"), DateUtils.ceiling(d2, Calendar.AM_PM));

        // HOUR_OF_DAY < 6 -> Round to 00:00
        Date d3 = parser.parse("2020-06-15 05:00:00.000");
        assertEquals(parser.parse("2020-06-15 00:00:00.000"), DateUtils.round(d3, Calendar.AM_PM));

        // HOUR_OF_DAY >= 6 and < 12 -> Round to 12:00
        Date d4 = parser.parse("2020-06-15 06:00:00.000");
        assertEquals(parser.parse("2020-06-15 12:00:00.000"), DateUtils.round(d4, Calendar.AM_PM));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModify_UnsupportedField() {
        DateUtils.truncate(new Date(), Calendar.ZONE_OFFSET);
    }

    @Test(expected = ArithmeticException.class)
    public void testModify_YearTooLarge() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(cal, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testRound_UnsupportedObject() {
        DateUtils.round("Not a date", Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_UnsupportedObject() {
        DateUtils.truncate(12345, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testCeiling_UnsupportedObject() {
        DateUtils.ceiling(new Object(), Calendar.DATE);
    }

    // -----------------------------------------------------------------------
    // Iterator Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIterator_AllStyles() {
        int[] styles = new int[] {
                DateUtils.RANGE_MONTH_SUNDAY,
                DateUtils.RANGE_MONTH_MONDAY,
                DateUtils.RANGE_WEEK_SUNDAY,
                DateUtils.RANGE_WEEK_MONDAY,
                DateUtils.RANGE_WEEK_RELATIVE,
                DateUtils.RANGE_WEEK_CENTER
        };

        for (int style : styles) {
            Iterator<Calendar> it = DateUtils.iterator(baseDate, style);
            assertNotNull(it);
            assertTrue(it.hasNext());
            Calendar first = it.next();
            assertNotNull(first);
        }

        // Test Object iterator
        Iterator<?> itObj = DateUtils.iterator((Object) baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        assertTrue(itObj.hasNext());
    }

    @Test
    public void testDateIterator_ExhaustAndExceptions() {
        Iterator<Calendar> it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }

        // Exhausted iterator next() throws NoSuchElementException
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // Success
        }

        // remove() throws UnsupportedOperationException
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidRangeStyle() {
        DateUtils.iterator(baseDate, 999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_NullDate() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_UnsupportedObject() {
        DateUtils.iterator("Not a date", DateUtils.RANGE_WEEK_SUNDAY);
    }

    // -----------------------------------------------------------------------
    // Fragment Tests
    // -----------------------------------------------------------------------
    @Test
    public void testGetFragments_DateAndCalendar() throws Exception {
        Date d = parser.parse("2020-01-02 03:04:05.006");
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.setTime(d);

        // Milliseconds
        assertTrue(DateUtils.getFragmentInMilliseconds(d, Calendar.SECOND) == 6);
        assertTrue(DateUtils.getFragmentInMilliseconds(c, Calendar.MINUTE) == (4 * 1000 + 6));
        assertTrue(DateUtils.getFragmentInMilliseconds(c, Calendar.MILLISECOND) == 0);

        // Seconds
        assertTrue(DateUtils.getFragmentInSeconds(d, Calendar.MINUTE) == 4);
        assertTrue(DateUtils.getFragmentInSeconds(c, Calendar.HOUR_OF_DAY) == (4 * 60 + 5));

        // Minutes
        assertTrue(DateUtils.getFragmentInMinutes(d, Calendar.HOUR_OF_DAY) == 4);
        assertTrue(DateUtils.getFragmentInMinutes(c, Calendar.DATE) == (3 * 60 + 4));

        // Hours
        assertTrue(DateUtils.getFragmentInHours(d, Calendar.DATE) == 3);
        assertTrue(DateUtils.getFragmentInHours(c, Calendar.MONTH) == (1 * 24 + 3));

        // Days
        assertTrue(DateUtils.getFragmentInDays(d, Calendar.MONTH) == 2);
        assertTrue(DateUtils.getFragmentInDays(c, Calendar.YEAR) == 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragment_UnsupportedFragment() {
        DateUtils.getFragmentInDays(new Date(), Calendar.ERA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragment_NullDate() {
        DateUtils.getFragmentInDays((Date) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragment_NullCalendar() {
        DateUtils.getFragmentInDays((Calendar) null, Calendar.YEAR);
    }

    // -----------------------------------------------------------------------
    // Truncated Equals & CompareTo Tests
    // -----------------------------------------------------------------------
    @Test
    public void testTruncatedEqualsAndCompareTo() throws Exception {
        Date d1 = parser.parse("2020-06-15 13:00:00.000");
        Date d2 = parser.parse("2020-06-15 13:45:00.000");
        Date d3 = parser.parse("2020-06-15 14:00:00.000");

        // Equals
        assertTrue(DateUtils.truncatedEquals(d1, d2, Calendar.HOUR_OF_DAY));
        assertFalse(DateUtils.truncatedEquals(d1, d3, Calendar.HOUR_OF_DAY));

        Calendar c1 = DateUtils.toCalendar(d1);
        Calendar c2 = DateUtils.toCalendar(d2);
        Calendar c3 = DateUtils.toCalendar(d3);

        assertTrue(DateUtils.truncatedEquals(c1, c2, Calendar.HOUR_OF_DAY));
        assertFalse(DateUtils.truncatedEquals(c1, c3, Calendar.HOUR_OF_DAY));

        // CompareTo
        assertEquals(0, DateUtils.truncatedCompareTo(d1, d2, Calendar.HOUR_OF_DAY));
        assertTrue(DateUtils.truncatedCompareTo(d1, d3, Calendar.HOUR_OF_DAY) < 0);
        assertTrue(DateUtils.truncatedCompareTo(d3, d1, Calendar.HOUR_OF_DAY) > 0);

        assertEquals(0, DateUtils.truncatedCompareTo(c1, c2, Calendar.HOUR_OF_DAY));
        assertTrue(DateUtils.truncatedCompareTo(c1, c3, Calendar.HOUR_OF_DAY) < 0);
        assertTrue(DateUtils.truncatedCompareTo(c3, c1, Calendar.HOUR_OF_DAY) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedEquals_NullDate() {
        DateUtils.truncatedEquals((Date) null, new Date(), Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedCompareTo_NullCalendar() {
        DateUtils.truncatedCompareTo((Calendar) null, Calendar.getInstance(), Calendar.DATE);
    }
}