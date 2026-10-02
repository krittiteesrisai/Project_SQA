# FastDateFormatTest.java

หมายเหตุสำคัญก่อนเขียนโค้ด:
- วาง test class ไว้ใน package เดียวกับ class เป้าหมาย (`org.apache.commons.lang3.time`) เพื่อให้เข้าถึง protected constructor/methods ได้ตรงตามซอร์สที่ให้มา (เพื่อทดสอบ `equals()/hashCode()` แบบไม่ผ่าน cache, และทดสอบ `parsePattern()`/`parseToken()` โดยตรง)
- บาง branch เช่น `ClassCastException` ใน `getDateInstance/getTimeInstance/getDateTimeInstance` (เมื่อ `DateFormat.getXxxInstance()` ไม่ return `SimpleDateFormat`) **ไม่สามารถทดสอบได้จริงด้วย Locale มาตรฐานบน JDK** จึงไม่เขียนเทสสำหรับ branch นี้ (คอมเมนต์กำกับไว้ในโค้ด) เพราะไม่ต้องการเดา behavior

```java
package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.*;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    private Calendar gmtCal(int y, int m, int d, int h, int mi, int s, int ms) {
        Calendar cal = new GregorianCalendar(GMT, Locale.US);
        cal.clear();
        cal.set(y, m, d, h, mi, s);
        cal.set(Calendar.MILLISECOND, ms);
        return cal;
    }

    // ---------------------------------------------------------------
    // Factory methods: getInstance()
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_default() {
        FastDateFormat f = FastDateFormat.getInstance();
        assertNotNull(f);
        assertNotNull(f.getPattern());
    }

    @Test
    public void testGetInstance_pattern() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", f.getPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throws() {
        // Constructor: if (pattern == null) throw IllegalArgumentException
        FastDateFormat.getInstance(null);
    }

    @Test
    public void testGetInstance_patternTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        FastDateFormat f = FastDateFormat.getInstance("yyyy", tz);
        assertEquals(tz, f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternLocale() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.US);
        assertEquals(Locale.US, f.getLocale());
    }

    @Test
    public void testGetInstance_patternTimeZoneLocale_noOverride() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", null, null);
        assertFalse(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_cacheHit_sameReference() {
        // ครอบคลุม branch format==null -> false (cache hit)
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        assertSame(f1, f2);
    }

    // ---------------------------------------------------------------
    // getDateInstance / getTimeInstance / getDateTimeInstance
    // (ไม่ทดสอบ ClassCastException branch เพราะไม่สามารถ trigger ได้แน่นอนบน JDK มาตรฐาน)
    // ---------------------------------------------------------------

    @Test
    public void testGetDateInstance_style() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(f);
    }

    @Test
    public void testGetDateInstance_styleLocale() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.US);
        assertNotNull(f);
    }

    @Test
    public void testGetDateInstance_styleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale_cache() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f1 = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.US);
        FastDateFormat f2 = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.US);
        assertSame(f1, f2); // ครอบคลุม cDateInstanceCache hit branch
    }

    @Test
    public void testGetTimeInstance_style() {
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT));
    }

    @Test
    public void testGetTimeInstance_styleLocale() {
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetTimeInstance_styleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale_cache() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f1 = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.US);
        FastDateFormat f2 = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.US);
        assertSame(f1, f2);
    }

    @Test
    public void testGetDateTimeInstance_styles() {
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT));
    }

    @Test
    public void testGetDateTimeInstance_stylesLocale() {
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.MEDIUM, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale_cache() {
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        FastDateFormat f1 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        FastDateFormat f2 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        assertSame(f1, f2);
    }

    // ---------------------------------------------------------------
    // parsePattern() : ทุก case letter ใน switch
    // ---------------------------------------------------------------

    @Test
    public void testPattern_Era_G() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 13, 4, 5, 6);
        String expected = new DateFormatSymbols(Locale.US).getEras()[cal.get(Calendar.ERA)];
        FastDateFormat f = FastDateFormat.getInstance("G", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_Year_lessThan4_TwoDigitYearField() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0);
        FastDateFormat f = FastDateFormat.getInstance("yy", GMT, Locale.US);
        assertEquals("03", f.format(cal));

        Calendar cal2 = gmtCal(1999, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("99", f.format(cal2));
    }

    @Test
    public void testPattern_Year_4digits_PaddedNumberField_under1000() {
        // ใช้ DAY_OF_YEAR (tokenLen=3 -> PaddedNumberField) เพื่อครอบคลุม value<100 และ 100<=value<1000
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0);
        cal.set(Calendar.DAY_OF_YEAR, 5);
        FastDateFormat f = FastDateFormat.getInstance("DDD", GMT, Locale.US);
        assertEquals("005", f.format(cal)); // value<100 branch

        cal.set(Calendar.DAY_OF_YEAR, 200);
        assertEquals("200", f.format(cal)); // 100<=value<1000 branch
    }

    @Test
    public void testPattern_Year_4and5digits_PaddedNumberField_over1000() {
        Calendar cal = gmtCal(2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertEquals("2023", f4.format(cal)); // value>=1000, digits==mSize

        FastDateFormat f5 = FastDateFormat.getInstance("yyyyy", GMT, Locale.US);
        assertEquals("02023", f5.format(cal)); // value>=1000, digits<mSize -> pad 1 zero
    }

    @Test
    public void testPattern_Month_fullName_ge4() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0);
        String expected = new DateFormatSymbols(Locale.US).getMonths()[Calendar.JANUARY];
        FastDateFormat f = FastDateFormat.getInstance("MMMM", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_Month_shortName_eq3() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0);
        String expected = new DateFormatSymbols(Locale.US).getShortMonths()[Calendar.JANUARY];
        FastDateFormat f = FastDateFormat.getInstance("MMM", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_Month_twoDigit_eq2() {
        FastDateFormat f = FastDateFormat.getInstance("MM", GMT, Locale.US);
        assertEquals("01", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0)));
        assertEquals("12", f.format(gmtCal(2003, Calendar.DECEMBER, 1, 0, 0, 0, 0)));
    }

    @Test
    public void testPattern_Month_unpadded_else() {
        FastDateFormat f = FastDateFormat.getInstance("M", GMT, Locale.US);
        assertEquals("1", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0))); // value<10
        assertEquals("12", f.format(gmtCal(2003, Calendar.DECEMBER, 1, 0, 0, 0, 0))); // value>=10
    }

    @Test
    public void testPattern_DayOfMonth_d_UnpaddedAndTwoDigit() {
        FastDateFormat f1 = FastDateFormat.getInstance("d", GMT, Locale.US); // padding=1
        assertEquals("5", f1.format(gmtCal(2003, Calendar.JANUARY, 5, 0, 0, 0, 0)));
        assertEquals("25", f1.format(gmtCal(2003, Calendar.JANUARY, 25, 0, 0, 0, 0)));

        FastDateFormat f2 = FastDateFormat.getInstance("dd", GMT, Locale.US); // padding=2
        assertEquals("05", f2.format(gmtCal(2003, Calendar.JANUARY, 5, 0, 0, 0, 0)));
    }

    @Test
    public void testPattern_Hour12_h_normal() {
        FastDateFormat f = FastDateFormat.getInstance("h", GMT, Locale.US);
        assertEquals("1", f.format(gmtCal(2003, Calendar.JANUARY, 1, 13, 0, 0, 0))); // 13 -> HOUR=1
    }

    @Test
    public void testPattern_Hour12_h_midnightBoundary() {
        // TwelveHourField: value==0 -> getLeastMaximum(HOUR)+1 = 12
        FastDateFormat f = FastDateFormat.getInstance("h", GMT, Locale.US);
        assertEquals("12", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0)));
    }

    @Test
    public void testPattern_HourOfDay_H() {
        FastDateFormat f = FastDateFormat.getInstance("HH", GMT, Locale.US);
        assertEquals("13", f.format(gmtCal(2003, Calendar.JANUARY, 1, 13, 0, 0, 0)));
        assertEquals("00", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0)));
    }

    @Test
    public void testPattern_Minute_m() {
        FastDateFormat f = FastDateFormat.getInstance("mm", GMT, Locale.US);
        assertEquals("04", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 4, 0, 0)));
    }

    @Test
    public void testPattern_Second_s() {
        FastDateFormat f = FastDateFormat.getInstance("ss", GMT, Locale.US);
        assertEquals("05", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 5, 0)));
    }

    @Test
    public void testPattern_Millisecond_S() {
        FastDateFormat f = FastDateFormat.getInstance("SSS", GMT, Locale.US);
        assertEquals("006", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 6)));
    }

    @Test
    public void testPattern_Weekday_short_lt4() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 0, 0, 0, 0);
        String expected = new DateFormatSymbols(Locale.US).getShortWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
        FastDateFormat f = FastDateFormat.getInstance("EEE", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_Weekday_full_ge4() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 0, 0, 0, 0);
        String expected = new DateFormatSymbols(Locale.US).getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
        FastDateFormat f = FastDateFormat.getInstance("EEEE", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_DayOfYear_D() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0);
        cal.set(Calendar.DAY_OF_YEAR, 50);
        FastDateFormat f = FastDateFormat.getInstance("D", GMT, Locale.US); // unpadded
        assertEquals("50", f.format(cal));
    }

    @Test
    public void testPattern_DayOfWeekInMonth_F() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 0, 0, 0, 0);
        int expected = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        FastDateFormat f = FastDateFormat.getInstance("F", GMT, Locale.US);
        assertEquals(String.valueOf(expected), f.format(cal));
    }

    @Test
    public void testPattern_WeekOfYear_w() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 0, 0, 0, 0);
        int val = cal.get(Calendar.WEEK_OF_YEAR);
        String expected = val < 10 ? "0" + val : String.valueOf(val);
        FastDateFormat f = FastDateFormat.getInstance("ww", GMT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_WeekOfMonth_W() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 0, 0, 0, 0);
        int val = cal.get(Calendar.WEEK_OF_MONTH);
        FastDateFormat f = FastDateFormat.getInstance("W", GMT, Locale.US);
        assertEquals(String.valueOf(val), f.format(cal));
    }

    @Test
    public void testPattern_AmPm_a() {
        String expectedPM = new DateFormatSymbols(Locale.US).getAmPmStrings()[1];
        String expectedAM = new DateFormatSymbols(Locale.US).getAmPmStrings()[0];
        FastDateFormat f = FastDateFormat.getInstance("a", GMT, Locale.US);
        assertEquals(expectedPM, f.format(gmtCal(2003, Calendar.JANUARY, 1, 13, 0, 0, 0)));
        assertEquals(expectedAM, f.format(gmtCal(2003, Calendar.JANUARY, 1, 1, 0, 0, 0)));
    }

    @Test
    public void testPattern_HourOfDay24_k_normal() {
        FastDateFormat f = FastDateFormat.getInstance("k", GMT, Locale.US);
        assertEquals("13", f.format(gmtCal(2003, Calendar.JANUARY, 1, 13, 0, 0, 0)));
    }

    @Test
    public void testPattern_HourOfDay24_k_midnightBoundary() {
        // TwentyFourHourField: value==0 -> getMaximum(HOUR_OF_DAY)+1 = 24
        FastDateFormat f = FastDateFormat.getInstance("k", GMT, Locale.US);
        assertEquals("24", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0)));
    }

    @Test
    public void testPattern_HourInAmPm0to11_K() {
        FastDateFormat f = FastDateFormat.getInstance("K", GMT, Locale.US);
        assertEquals("1", f.format(gmtCal(2003, Calendar.JANUARY, 1, 13, 0, 0, 0))); // 13%12=1
        assertEquals("0", f.format(gmtCal(2003, Calendar.JANUARY, 1, 0, 0, 0, 0)));  // no special-case for K
    }

    @Test
    public void testPattern_TimeZoneNumber_Z_singleToken_noColon() {
        TimeZone tz = TimeZone.getTimeZone("GMT+03:30");
        FastDateFormat f = FastDateFormat.getInstance("Z", tz, Locale.US);
        assertEquals("+0330", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_TimeZoneNumber_ZZ_withColon() {
        TimeZone tz = TimeZone.getTimeZone("GMT+03:30");
        FastDateFormat f = FastDateFormat.getInstance("ZZ", tz, Locale.US);
        assertEquals("+03:30", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_TimeZoneNumber_negativeOffset() {
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        FastDateFormat f = FastDateFormat.getInstance("Z", tz, Locale.US);
        assertEquals("-0500", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_TimeZoneName_z_shortStyle_lt4() {
        FastDateFormat f = FastDateFormat.getInstance("z", null, Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"), Locale.US);
        cal.set(2015, Calendar.JANUARY, 15, 12, 0, 0);
        boolean dst = cal.get(Calendar.DST_OFFSET) != 0;
        String expected = FastDateFormat.getTimeZoneDisplay(cal.getTimeZone(), dst, TimeZone.SHORT, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_TimeZoneName_zzzz_longStyle_ge4_forced_daylight_vs_standard() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat f = FastDateFormat.getInstance("zzzz", tz, Locale.US);

        Date winter = gmtToEpoch(2015, Calendar.JANUARY, 15, 17, 0, 0); // ~12:00 EST
        Date summer = gmtToEpoch(2015, Calendar.JULY, 15, 16, 0, 0);    // ~12:00 EDT

        String expectedStandard = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.LONG, Locale.US);
        String expectedDaylight = FastDateFormat.getTimeZoneDisplay(tz, true, TimeZone.LONG, Locale.US);

        assertEquals(expectedStandard, f.format(winter));
        assertEquals(expectedDaylight, f.format(summer));
    }

    private Date gmtToEpoch(int y, int m, int d, int h, int mi, int s) {
        Calendar c = new GregorianCalendar(GMT, Locale.US);
        c.clear();
        c.set(y, m, d, h, mi, s);
        return c.getTime();
    }

    @Test
    public void testPattern_TimeZoneName_nonForced_usesCalendarsOwnZone() {
        // mTimeZoneForced == false -> ใช้ calendar.getTimeZone() แทน mTimeZone
        FastDateFormat f = FastDateFormat.getInstance("zzzz", null, Locale.US);
        TimeZone nyTz = TimeZone.getTimeZone("America/New_York");
        Calendar cal = new GregorianCalendar(nyTz, Locale.US);
        cal.set(2015, Calendar.JULY, 15, 12, 0, 0);
        boolean dst = cal.get(Calendar.DST_OFFSET) != 0;
        String expected = FastDateFormat.getTimeZoneDisplay(nyTz, dst, TimeZone.LONG, Locale.US);
        assertEquals(expected, f.format(cal));
    }

    @Test
    public void testPattern_LiteralSingleCharEscapedQuote() {
        // '' -> sub.length()==1 -> CharacterLiteral
        FastDateFormat f = FastDateFormat.getInstance("''", GMT, Locale.US);
        assertEquals("'", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_LiteralStringMultiChar() {
        // 'at' -> sub.length()>1 -> StringLiteral
        FastDateFormat f = FastDateFormat.getInstance("'at'", GMT, Locale.US);
        assertEquals("at", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_LiteralWithInnerEscapedQuote() {
        // parseToken: c=='\'' && peek=='\'' branch (escaped quote inside literal)
        FastDateFormat f = FastDateFormat.getInstance("'it''s'", GMT, Locale.US);
        assertEquals("it's", f.format(new Date(0L)));
    }

    @Test
    public void testPattern_IllegalPatternLetter_throws() {
        try {
            FastDateFormat.getInstance("Q", GMT, Locale.US);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal pattern component"));
        }
    }

    @Test
    public void testPattern_CombinedComplexPattern() {
        Calendar cal = gmtCal(2003, Calendar.JANUARY, 10, 13, 4, 5, 6);
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS", GMT, Locale.US);
        assertEquals("2003-01-10T13:04:05.006", f.format(cal));
    }

    // ---------------------------------------------------------------
    // format(Object, StringBuffer, FieldPosition)
    // ---------------------------------------------------------------

    @Test
    public void testFormatObject_Date() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        StringBuffer buf = new StringBuffer();
        f.format((Object) new Date(0L), buf, new FieldPosition(0));
        assertEquals("1970", buf.toString());
    }

    @Test
    public void testFormatObject_Calendar() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = gmtCal(2020, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer buf = new StringBuffer();
        f.format((Object) cal, buf, new FieldPosition(0));
        assertEquals("2020", buf.toString());
    }

    @Test
    public void testFormatObject_Long() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        StringBuffer buf = new StringBuffer();
        f.format((Object) Long.valueOf(0L), buf, new FieldPosition(0));
        assertEquals("1970", buf.toString());
    }

    @Test
    public void testFormatObject_UnknownType_throws() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        try {
            f.format((Object) "not a date", new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("String"));
        }
    }

    @Test
    public void testFormatObject_Null_throws() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        try {
            f.format((Object) null, new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("<null>"));
        }
    }

    // ---------------------------------------------------------------
    // format overloads: long / Date / Calendar (+ buffer variants)
    // ---------------------------------------------------------------

    @Test
    public void testFormat_long() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertEquals("1970", f.format(0L));
    }

    @Test
    public void testFormat_Date() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertEquals("1970", f.format(new Date(0L)));
    }

    @Test
    public void testFormat_longWithBuffer() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        StringBuffer buf = new StringBuffer("X");
        StringBuffer result = f.format(0L, buf);
        assertEquals("X1970", result.toString());
        assertSame(buf, result);
    }

    @Test
    public void testFormat_DateWithBuffer() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        StringBuffer buf = new StringBuffer("X");
        StringBuffer result = f.format(new Date(0L), buf);
        assertEquals("X1970", result.toString());
    }

    @Test
    public void testFormat_Calendar_timeZoneForced() {
        // mTimeZoneForced == true -> clone calendar & setTimeZone(mTimeZone)
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        FastDateFormat f = FastDateFormat.getInstance("HH", tz, Locale.US);
        Calendar cal = new GregorianCalendar(GMT, Locale.US);
        cal.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        String result = f.format(cal);
        assertEquals("15", result); // 10:00 GMT -> 15:00 GMT+5
        // original calendar's timezone ไม่ควรถูกแก้ไข (เพราะมี clone)
        assertEquals(GMT, cal.getTimeZone());
    }

    @Test
    public void testFormat_Calendar_timeZoneNotForced() {
        FastDateFormat f = FastDateFormat.getInstance("HH", null, Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+05:00"), Locale.US);
        cal.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        assertEquals("10", f.format(cal)); // ใช้ zone ของ calendar เอง ไม่ override
    }

    // ---------------------------------------------------------------
    // parseObject
    // ---------------------------------------------------------------

    @Test
    public void testParseObject_alwaysNullAndResetsPosition() {
        FastDateFormat f = FastDateFormat.getInstance();
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(9);
        Object result = f.parseObject("anything", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ---------------------------------------------------------------
    // Accessors
    // ---------------------------------------------------------------

    @Test
    public void testGetPattern() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", f.getPattern());
    }

    @Test
    public void testGetTimeZone_defaultWhenNull() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", (TimeZone) null, Locale.US);
        assertEquals(TimeZone.getDefault(), f.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_falseWhenNull() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", (TimeZone) null, Locale.US);
        assertFalse(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_trueWhenProvided() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale_defaultWhenNull() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, null);
        assertEquals(Locale.getDefault(), f.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate_simplePattern() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertEquals(4, f.getMaxLengthEstimate()); // PaddedNumberField.estimateLength() == 4
    }

    // ---------------------------------------------------------------
    // equals / hashCode / toString
    // ---------------------------------------------------------------

    @Test
    public void testEquals_differentClass_false() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertFalse(f.equals("not a FastDateFormat"));
    }

    @Test
    public void testEquals_sameReference_true() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_equalFieldsDifferentInstance_true() {
        // สร้างสอง instance โดยตรง (ข้าม cache) ด้วย protected constructor (same package)
        FastDateFormat f1 = new FastDateFormat("yyyy-MM-dd", GMT, Locale.US);
        FastDateFormat f2 = new FastDateFormat("yyyy-MM-dd", GMT, Locale.US);
        assertNotSame(f1, f2);
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testEquals_differentPattern_false() {
        FastDateFormat f1 = new FastDateFormat("yyyy", GMT, Locale.US);
        FastDateFormat f2 = new FastDateFormat("MM", GMT, Locale.US);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentTimeZone_false() {
        FastDateFormat f1 = new FastDateFormat("yyyy", GMT, Locale.US);
        FastDateFormat f2 = new FastDateFormat("yyyy", TimeZone.getTimeZone("GMT+01:00"), Locale.US);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentLocale_false() {
        FastDateFormat f1 = new FastDateFormat("yyyy", GMT, Locale.US);
        FastDateFormat f2 = new FastDateFormat("yyyy", GMT, Locale.GERMANY);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentTimeZoneForcedFlag_false() {
        FastDateFormat f1 = new FastDateFormat("yyyy", GMT, Locale.US);       // forced=true
        FastDateFormat f2 = new FastDateFormat("yyyy", null, Locale.US);      // forced=false
        // ถึงแม้ resolved timezone อาจเท่ากัน (ถ้า default==GMT) แต่ mTimeZoneForced ต่างกันเสมอ
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testToString() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", f.toString());
    }

    // ---------------------------------------------------------------
    // parsePattern() / parseToken() โดยตรง (protected, same package)
    // ---------------------------------------------------------------

    @Test
    public void testParsePattern_directCall_ruleCount() {
        FastDateFormat f = new FastDateFormat("yyyy-MM-dd", GMT, Locale.US);
        List<?> rules = f.parsePattern();
        // 'yyyy' , '-' , 'MM' , '-' , 'dd' => 5 rules
        assertEquals(5, rules.size());
    }

    @Test
    public void testParseToken_letterRun() {
        FastDateFormat f = new FastDateFormat("yyyy", GMT, Locale.US);
        int[] indexRef = new int[]{0};
        String token = f.parseToken("yyyyMM", indexRef);
        assertEquals("yyyy", token);
        assertEquals(3, indexRef[0]); // ตำแหน่งสุดท้ายของ run (index 3)
    }

    @Test
    public void testParseToken_literalText() {
        FastDateFormat f = new FastDateFormat("yyyy", GMT, Locale.US);
        int[] indexRef = new int[]{0};
        String token = f.parseToken("-MM", indexRef);
        assertEquals("'-", token); // literal เริ่มด้วย ' เสมอ
        assertEquals(-1, indexRef[0]); // i-- ก่อน break เมื่อพบตัวอักษรถัดไป
    }

    // ---------------------------------------------------------------
    // Serialization: readObject() ต้อง re-init() transient fields
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_reinitializesRulesAfterDeserialize() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        Date date = new Date(0L);
        assertEquals(original.format(date), deserialized.format(date));
        assertEquals(original.getMaxLengthEstimate(), deserialized.getMaxLengthEstimate());
    }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetInstance_*` | constructor null-pattern throw, overload ต่าง ๆ ของ `getInstance`, cache hit (`format==null` true/false) |
| `testGetDateInstance_*`, `testGetTimeInstance_*`, `testGetDateTimeInstance_*` | ทุก overload, การสร้าง key (`timeZone!=null`, `locale==null`), cache hit branch (ยกเว้น `ClassCastException` ซึ่งไม่สามารถ trigger ได้แน่นอน — ไม่ได้เทส) |
| `testPattern_Era_G` | case `'G'` |
| `testPattern_Year_lessThan4_*` | case `'y'`, `tokenLen<4` → `TwoDigitYearField` |
| `testPattern_Year_4digits_*`, `testPattern_Year_4and5digits_*` | `tokenLen>=4` → `selectNumberRule`, `PaddedNumberField` ทุก sub-branch (`value<100`, `100<=value<1000`, `value>=1000`, `digits<mSize`/`digits==mSize`) |
| `testPattern_Month_*` | case `'M'` ทั้ง 4 sub-branch (`>=4`,`==3`,`==2`,`else`) รวม `UnpaddedMonthField` ทั้งสอง branch ค่า |
| `testPattern_DayOfMonth_d_*` | case `'d'`, `selectNumberRule` padding=1,2 |
| `testPattern_Hour12_h_*` | case `'h'`, `TwelveHourField` ปกติ/boundary value==0 |
| `testPattern_HourOfDay_H` | case `'H'`, `TwoDigitNumberField` |
| `testPattern_Minute_m`,`Second_s`,`Millisecond_S` | case `'m'`,`'s'`,`'S'` |
| `testPattern_Weekday_*` | case `'E'`, `tokenLen<4`/`>=4` |
| `testPattern_DayOfYear_D` | case `'D'` |
| `testPattern_DayOfWeekInMonth_F`,`WeekOfYear_w`,`WeekOfMonth_W` | case `'F'`,`'w'`,`'W'` |
| `testPattern_AmPm_a` | case `'a'` |
| `testPattern_HourOfDay24_k_*` | case `'k'`, `TwentyFourHourField` ปกติ/boundary value==0 |
| `testPattern_HourInAmPm0to11_K` | case `'K'` |
| `testPattern_TimeZoneNumber_*` | case `'Z'`, `tokenLen==1`/`else`, offset `<0`/`>=0` |
| `testPattern_TimeZoneName_*` | case `'z'`, `tokenLen<4`/`>=4`, forced/non-forced, daylight/standard branch |
| `testPattern_Literal*` | case `'\''`, `sub.length()==1`/`else`, `parseToken` escaped-quote branch |
| `testPattern_IllegalPatternLetter_throws` | `default:` throw `IllegalArgumentException` |
| `testPattern_CombinedComplexPattern` | integration หลาย rule ร่วมกัน |
| `testFormatObject_*` | `format(Object,...)`: `instanceof Date/Calendar/Long`, else-throw, null-throw |
| `testFormat_long*`, `testFormat_Date*` | overload `format(long)`, `format(Date)`, buffer variants |
| `testFormat_Calendar_timeZoneForced/NotForced` | branch `mTimeZoneForced` true/false ใน `format(Calendar,buf)` |
| `testParseObject_*` | `parseObject` reset index/errorIndex, return null เสมอ |
| `testGetPattern/getTimeZone/getLocale/...` | accessor + default-value branch (`timeZone==null`,`locale==null`) |
| `testGetMaxLengthEstimate_*` | `init()` การรวม `estimateLength()` |
| `testEquals_*`, `testHashCode (ภายใน testEquals_equalFieldsDifferentInstance_true)` | ทุก condition ของ `equals()` (`instanceof`false, same-ref, pattern/timezone/locale/forced-flag ต่างกัน) |
| `testToString` | `toString()` |
| `testParsePattern_directCall_ruleCount`, `testParseToken_*` | ทดสอบ `parsePattern()`/`parseToken()` โดยตรง (letter-run, literal) |
| `testSerialization_reinitializesRulesAfterDeserialize` | `readObject()` เรียก `init()` ซ้ำหลัง deserialize |

**Fault-detection ที่คาดหวังได้**: boundary ของ `TwelveHourField`/`TwentyFourHourField` (value==0), การ pad ของ `PaddedNumberField` (3 sub-case), การ clone calendar ใน `format(Calendar,buf)` เมื่อ `mTimeZoneForced`, และ exception message ที่ถูกต้องใน `format(Object,...)`.