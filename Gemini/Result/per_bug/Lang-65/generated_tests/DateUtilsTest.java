package org.apache.commons.lang.time;

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

public class DateUtilsTest {

    private DateFormat dateParser;
    private Calendar baseCal;
    private Date baseDate;

    @Before
    public void setUp() throws Exception {
        dateParser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        baseDate = dateParser.parse("2023-06-15 13:45:30.500");
        baseCal = Calendar.getInstance();
        baseCal.setTime(baseDate);
    }

    // -----------------------------------------------------------------------
    // Constructor & Constants
    // -----------------------------------------------------------------------

    @Test
    public void testConstructorAndConstants() {
        assertNotNull(new DateUtils());
        assertEquals(TimeZone.getTimeZone("GMT"), DateUtils.UTC_TIME_ZONE);
        assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);

        assertEquals(1000, DateUtils.MILLIS_IN_SECOND);
        assertEquals(60000, DateUtils.MILLIS_IN_MINUTE);
        assertEquals(3600000, DateUtils.MILLIS_IN_HOUR);
        assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
    }

    // -----------------------------------------------------------------------
    // isSameDay
    // -----------------------------------------------------------------------

    @Test
    public void testIsSameDay_Date_Success() throws Exception {
        Date d1 = dateParser.parse("2023-06-15 06:00:00.000");
        Date d2 = dateParser.parse("2023-06-15 23:59:59.999");
        Date d3 = dateParser.parse("2023-06-16 00:00:00.000");

        assertTrue(DateUtils.isSameDay(d1, d2));
        assertFalse(DateUtils.isSameDay(d1, d3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate1() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate2() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    @Test
    public void testIsSameDay_Calendar_Success() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2023, Calendar.JUNE, 15, 10, 0, 0);
        Calendar c2 = Calendar.getInstance();
        c2.set(2023, Calendar.JUNE, 15, 18, 30, 0);
        Calendar c3 = Calendar.getInstance();
        c3.set(2023, Calendar.JUNE, 16, 10, 0, 0);

        assertTrue(DateUtils.isSameDay(c1, c2));
        assertFalse(DateUtils.isSameDay(c1, c3));

        // Different ERA / Year
        Calendar cEra = (Calendar) c1.clone();
        cEra.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameDay(c1, cEra));

        Calendar cYear = (Calendar) c1.clone();
        cYear.set(Calendar.YEAR, 2024);
        assertFalse(DateUtils.isSameDay(c1, cYear));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal1() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal2() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    // -----------------------------------------------------------------------
    // isSameInstant
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
    public void testIsSameInstant_Date_Null1() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null2() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_Calendar() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(5000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(5000L);
        Calendar c3 = Calendar.getInstance();
        c3.setTimeInMillis(6000L);

        assertTrue(DateUtils.isSameInstant(c1, c2));
        assertFalse(DateUtils.isSameInstant(c1, c3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null1() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null2() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    // -----------------------------------------------------------------------
    // isSameLocalTime
    // -----------------------------------------------------------------------

    @Test
    public void testIsSameLocalTime_SuccessAndFailures() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = (Calendar) c1.clone();
        assertTrue(DateUtils.isSameLocalTime(c1, c2));

        // Mismatch millisecond
        Calendar c3 = (Calendar) c1.clone();
        c3.add(Calendar.MILLISECOND, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch second
        c3 = (Calendar) c1.clone();
        c3.add(Calendar.SECOND, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch minute
        c3 = (Calendar) c1.clone();
        c3.add(Calendar.MINUTE, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch hour
        c3 = (Calendar) c1.clone();
        c3.add(Calendar.HOUR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch day of year
        c3 = (Calendar) c1.clone();
        c3.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch year
        c3 = (Calendar) c1.clone();
        c3.add(Calendar.YEAR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch era
        c3 = (Calendar) c1.clone();
        c3.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameLocalTime(c1, c3));

        // Mismatch class
        Calendar customCal = new GregorianCalendar() {};
        customCal.setTimeInMillis(c1.getTimeInMillis());
        assertFalse(DateUtils.isSameLocalTime(c1, customCal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullCal1() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullCal2() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    // -----------------------------------------------------------------------
    // parseDate
    // -----------------------------------------------------------------------

    @Test
    public void testParseDate_ValidFormats() throws Exception {
        String[] patterns = new String[]{"yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"};
        
        Date d1 = DateUtils.parseDate("2023/05/10", patterns);
        assertNotNull(d1);

        Date d2 = DateUtils.parseDate("2023-05-10 12:00:00", patterns);
        assertNotNull(d2);

        Date d3 = DateUtils.parseDate("2023-05-10", patterns);
        assertNotNull(d3);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_Unparseable() throws Exception {
        String[] patterns = new String[]{"yyyy-MM-dd"};
        DateUtils.parseDate("invalid-date", patterns);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_IncompleteMatch() throws Exception {
        String[] patterns = new String[]{"yyyy-MM-dd"};
        DateUtils.parseDate("2023-05-10 extra", patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullDateStr() throws Exception {
        DateUtils.parseDate(null, new String[]{"yyyy"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws Exception {
        DateUtils.parseDate("2023-01-01", null);
    }

    // -----------------------------------------------------------------------
    // addXXX methods
    // -----------------------------------------------------------------------

    @Test
    public void testAddMethods() {
        Date result = DateUtils.addYears(baseDate, 1);
        assertEquals(baseCal.get(Calendar.YEAR) + 1, getCalendar(result).get(Calendar.YEAR));

        result = DateUtils.addYears(baseDate, -1);
        assertEquals(baseCal.get(Calendar.YEAR) - 1, getCalendar(result).get(Calendar.YEAR));

        result = DateUtils.addMonths(baseDate, 2);
        assertEquals(Calendar.AUGUST, getCalendar(result).get(Calendar.MONTH));

        result = DateUtils.addWeeks(baseDate, 1);
        assertEquals(baseCal.get(Calendar.DAY_OF_MONTH) + 7, getCalendar(result).get(Calendar.DAY_OF_MONTH));

        result = DateUtils.addDays(baseDate, 3);
        assertEquals(18, getCalendar(result).get(Calendar.DAY_OF_MONTH));

        result = DateUtils.addHours(baseDate, 2);
        assertEquals(15, getCalendar(result).get(Calendar.HOUR_OF_DAY));

        result = DateUtils.addMinutes(baseDate, 10);
        assertEquals(55, getCalendar(result).get(Calendar.MINUTE));

        result = DateUtils.addSeconds(baseDate, 15);
        assertEquals(45, getCalendar(result).get(Calendar.SECOND));

        result = DateUtils.addMilliseconds(baseDate, 200);
        assertEquals(700, getCalendar(result).get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    // -----------------------------------------------------------------------
    // round & truncate
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Date_Null() {
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
    public void testTruncate_Date_Null() {
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
        DateUtils.truncate(new Integer(100), Calendar.DATE);
    }

    @Test
    public void testRoundAndTruncate_ObjectSignature() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();

        assertNotNull(DateUtils.round((Object) d, Calendar.DATE));
        assertNotNull(DateUtils.round((Object) c, Calendar.DATE));

        assertNotNull(DateUtils.truncate((Object) d, Calendar.DATE));
        assertNotNull(DateUtils.truncate((Object) c, Calendar.DATE));
    }

    @Test(expected = ArithmeticException.class)
    public void testModify_YearTooLarge() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.round(cal, Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModify_UnsupportedField() {
        Calendar cal = Calendar.getInstance();
        DateUtils.round(cal, -9999);
    }

    @Test
    public void testRound_StandardFields() throws Exception {
        // Round Millisecond
        Date d = dateParser.parse("2023-06-15 13:45:30.500");
        assertEquals(d, DateUtils.round(d, Calendar.MILLISECOND));

        // Round Second (up & down)
        Date dSecUp = dateParser.parse("2023-06-15 13:45:30.600");
        Date dSecDown = dateParser.parse("2023-06-15 13:45:30.400");
        assertEquals(dateParser.parse("2023-06-15 13:45:31.000"), DateUtils.round(dSecUp, Calendar.SECOND));
        assertEquals(dateParser.parse("2023-06-15 13:45:30.000"), DateUtils.round(dSecDown, Calendar.SECOND));

        // Round Minute (up & down)
        Date dMinUp = dateParser.parse("2023-06-15 13:45:35.000");
        Date dMinDown = dateParser.parse("2023-06-15 13:45:25.000");
        assertEquals(dateParser.parse("2023-06-15 13:46:00.000"), DateUtils.round(dMinUp, Calendar.MINUTE));
        assertEquals(dateParser.parse("2023-06-15 13:45:00.000"), DateUtils.round(dMinDown, Calendar.MINUTE));

        // Round Hour (up & down)
        Date dHourUp = dateParser.parse("2023-06-15 13:35:00.000");
        Date dHourDown = dateParser.parse("2023-06-15 13:20:00.000");
        assertEquals(dateParser.parse("2023-06-15 14:00:00.000"), DateUtils.round(dHourUp, Calendar.HOUR));
        assertEquals(dateParser.parse("2023-06-15 13:00:00.000"), DateUtils.round(dHourDown, Calendar.HOUR));

        // Round Date (up & down)
        Date dDateUp = dateParser.parse("2023-06-15 13:00:00.000");
        Date dDateDown = dateParser.parse("2023-06-15 11:00:00.000");
        assertEquals(dateParser.parse("2023-06-16 00:00:00.000"), DateUtils.round(dDateUp, Calendar.DATE));
        assertEquals(dateParser.parse("2023-06-15 00:00:00.000"), DateUtils.round(dDateDown, Calendar.DATE));

        // Round Month (up & down)
        Date dMonthUp = dateParser.parse("2023-06-20 00:00:00.000");
        Date dMonthDown = dateParser.parse("2023-06-10 00:00:00.000");
        assertEquals(dateParser.parse("2023-07-01 00:00:00.000"), DateUtils.round(dMonthUp, Calendar.MONTH));
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), DateUtils.round(dMonthDown, Calendar.MONTH));

        // Round Year (up & down)
        Date dYearUp = dateParser.parse("2023-08-01 00:00:00.000");
        Date dYearDown = dateParser.parse("2023-03-01 00:00:00.000");
        assertEquals(dateParser.parse("2024-01-01 00:00:00.000"), DateUtils.round(dYearUp, Calendar.YEAR));
        assertEquals(dateParser.parse("2023-01-01 00:00:00.000"), DateUtils.round(dYearDown, Calendar.YEAR));
    }

    @Test
    public void testRound_AM_PM() throws Exception {
        // AM_PM: offset >= 12 and offset < 12, offset > 6 and offset <= 6
        Date amUp = dateParser.parse("2023-06-15 08:00:00.000");
        Date amDown = dateParser.parse("2023-06-15 04:00:00.000");
        Date pmUp = dateParser.parse("2023-06-15 20:00:00.000");
        Date pmDown = dateParser.parse("2023-06-15 15:00:00.000");

        assertEquals(dateParser.parse("2023-06-15 12:00:00.000"), DateUtils.round(amUp, Calendar.AM_PM));
        assertEquals(dateParser.parse("2023-06-15 00:00:00.000"), DateUtils.round(amDown, Calendar.AM_PM));
        assertEquals(dateParser.parse("2023-06-16 00:00:00.000"), DateUtils.round(pmUp, Calendar.AM_PM));
        assertEquals(dateParser.parse("2023-06-15 12:00:00.000"), DateUtils.round(pmDown, Calendar.AM_PM));
    }

    @Test
    public void testRound_SemiMonth() throws Exception {
        // SEMI_MONTH: date 1 round up vs not round up
        Date d1 = dateParser.parse("2023-06-01 00:00:00.000");
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), DateUtils.round(d1, DateUtils.SEMI_MONTH));

        // offset >= 15 vs < 15, roundUp (> 7) vs no roundUp (<= 7)
        Date dFirstHalfUp = dateParser.parse("2023-06-10 00:00:00.000"); // offset = 9 (> 7)
        Date dFirstHalfDown = dateParser.parse("2023-06-05 00:00:00.000"); // offset = 4 (<= 7)
        Date dSecondHalfUp = dateParser.parse("2023-06-25 00:00:00.000"); // offset = 24 - 15 = 9 (> 7)
        Date dSecondHalfDown = dateParser.parse("2023-06-18 00:00:00.000"); // offset = 17 - 15 = 2 (<= 7)

        assertEquals(dateParser.parse("2023-06-16 00:00:00.000"), DateUtils.round(dFirstHalfUp, DateUtils.SEMI_MONTH));
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), DateUtils.round(dFirstHalfDown, DateUtils.SEMI_MONTH));
        assertEquals(dateParser.parse("2023-07-01 00:00:00.000"), DateUtils.round(dSecondHalfUp, DateUtils.SEMI_MONTH));
        assertEquals(dateParser.parse("2023-06-16 00:00:00.000"), DateUtils.round(dSecondHalfDown, DateUtils.SEMI_MONTH));

        // When date is 1 and roundUp is triggered by time fields (e.g. 1st at 20:00:00)
        Date d1WithLateTime = dateParser.parse("2023-06-01 20:00:00.000");
        Date roundedD1 = DateUtils.round(d1WithLateTime, DateUtils.SEMI_MONTH);
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), roundedD1);
    }

    @Test
    public void testTruncate_Fields() throws Exception {
        Date d = dateParser.parse("2023-06-15 13:45:30.500");

        assertEquals(dateParser.parse("2023-06-15 13:45:30.500"), DateUtils.truncate(d, Calendar.MILLISECOND));
        assertEquals(dateParser.parse("2023-06-15 13:45:30.000"), DateUtils.truncate(d, Calendar.SECOND));
        assertEquals(dateParser.parse("2023-06-15 13:45:00.000"), DateUtils.truncate(d, Calendar.MINUTE));
        assertEquals(dateParser.parse("2023-06-15 13:00:00.000"), DateUtils.truncate(d, Calendar.HOUR_OF_DAY));
        assertEquals(dateParser.parse("2023-06-15 00:00:00.000"), DateUtils.truncate(d, Calendar.DATE));
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), DateUtils.truncate(d, Calendar.MONTH));
        assertEquals(dateParser.parse("2023-01-01 00:00:00.000"), DateUtils.truncate(d, Calendar.YEAR));

        // Truncate SEMI_MONTH
        Date dSemi1 = dateParser.parse("2023-06-10 13:45:30.500");
        Date dSemi2 = dateParser.parse("2023-06-25 13:45:30.500");
        assertEquals(dateParser.parse("2023-06-01 00:00:00.000"), DateUtils.truncate(dSemi1, DateUtils.SEMI_MONTH));
        assertEquals(dateParser.parse("2023-06-16 00:00:00.000"), DateUtils.truncate(dSemi2, DateUtils.SEMI_MONTH));

        // Truncate AM_PM
        Date dAm = dateParser.parse("2023-06-15 08:30:00.000");
        Date dPm = dateParser.parse("2023-06-15 18:30:00.000");
        assertEquals(dateParser.parse("2023-06-15 00:00:00.000"), DateUtils.truncate(dAm, Calendar.AM_PM));
        assertEquals(dateParser.parse("2023-06-15 12:00:00.000"), DateUtils.truncate(dPm, Calendar.AM_PM));
    }

    // -----------------------------------------------------------------------
    // Iterator & DateIterator
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_Null() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Calendar_Null() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Object_Null() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_Object_InvalidType() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidRangeStyle() {
        DateUtils.iterator(baseDate, -999);
    }

    @Test
    public void testIterator_ObjectSignature() {
        assertNotNull(DateUtils.iterator((Object) baseDate, DateUtils.RANGE_WEEK_SUNDAY));
        assertNotNull(DateUtils.iterator((Object) baseCal, DateUtils.RANGE_WEEK_SUNDAY));
    }

    @Test
    public void testIterator_RangeMonthSunday() throws Exception {
        Date focus = dateParser.parse("2023-07-04 12:00:00.000");
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));

        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeMonthMonday() throws Exception {
        Date focus = dateParser.parse("2023-07-04 12:00:00.000");
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_MONDAY);

        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));

        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIterator_RangeWeekStyles() throws Exception {
        Date focus = dateParser.parse("2023-06-15 12:00:00.000"); // Thursday

        // RANGE_WEEK_SUNDAY
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);

        // RANGE_WEEK_MONDAY
        it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_MONDAY);
        Calendar firstMon = (Calendar) it.next();
        assertEquals(Calendar.MONDAY, firstMon.get(Calendar.DAY_OF_WEEK));
        count = 1;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);

        // RANGE_WEEK_RELATIVE
        it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_RELATIVE);
        Calendar firstRel = (Calendar) it.next();
        assertEquals(Calendar.THURSDAY, firstRel.get(Calendar.DAY_OF_WEEK));
        count = 1;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);

        // RANGE_WEEK_CENTER
        it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_CENTER);
        Calendar firstCenter = (Calendar) it.next();
        assertEquals(Calendar.MONDAY, firstCenter.get(Calendar.DAY_OF_WEEK)); // Thursday - 3 = Monday
        count = 1;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIterator_CutoffAdjustments() {
        // Trigger startCutoff / endCutoff < SUNDAY or > SATURDAY boundary
        Calendar sundayCal = Calendar.getInstance();
        sundayCal.set(2023, Calendar.JUNE, 11); // Sunday

        Iterator itCenter = DateUtils.iterator(sundayCal, DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(itCenter);

        Calendar satCal = Calendar.getInstance();
        satCal.set(2023, Calendar.JUNE, 17); // Saturday
        Iterator itCenterSat = DateUtils.iterator(satCal, DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(itCenterSat);
    }

    @Test(expected = NoSuchElementException.class)
    public void testDateIterator_NoSuchElementException() {
        Iterator it = DateUtils.iterator(baseDate, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next(); // Should throw NoSuchElementException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIterator_RemoveUnsupported() {
        Iterator it = DateUtils.iterator(baseDate, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }

    // -----------------------------------------------------------------------
    // Helper
    // -----------------------------------------------------------------------

    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
}