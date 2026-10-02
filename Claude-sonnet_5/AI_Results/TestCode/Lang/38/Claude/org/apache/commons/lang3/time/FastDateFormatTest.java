package org.apache.commons.lang3.time;

import org.apache.commons.lang3.time.FastDateFormat;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link FastDateFormat} (Defects4J Lang-38b).
 *
 * หมายเหตุทั่วไป:
 * - ค่าที่เกี่ยวกับชื่อ TimeZone แบบเต็ม (long display name) อาจแตกต่างกันตามเวอร์ชัน JDK/OS
 *   จึงใช้การตรวจสอบแบบไม่เข้มงวด (non-empty / ไม่เท่ากับกรณีอื่น) แทนการเทียบ string ตรง ๆ
 *   และกำกับคอมเมนต์ไว้ทุกจุดที่มีความไม่แน่นอนเชิง environment
 * - Branch ภายใน PaddedNumberField ที่ throw IllegalArgumentException เมื่อ size<3
 *   ไม่สามารถเข้าถึงได้ผ่าน public API (selectNumberRule การันตีว่า size>=3 เสมอในกรณี default)
 *   จึงไม่ได้เขียนเทสสำหรับ branch นี้ (unreachable from outside)
 */
public class FastDateFormatTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone LA  = TimeZone.getTimeZone("America/Los_Angeles");
    private static final TimeZone NY  = TimeZone.getTimeZone("America/New_York");

    private static Calendar buildCal(TimeZone tz, int year, int month, int day,
                                      int hour, int min, int sec, int millis) {
        Calendar c = new GregorianCalendar(tz, Locale.US);
        c.clear();
        c.set(year, month, day, hour, min, sec);
        c.set(Calendar.MILLISECOND, millis);
        return c;
    }

    // ------------------------------------------------------------
    // Constructor / getInstance - null & invalid pattern
    // ------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_NullPattern_Throws() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_IllegalPatternChar_Throws() {
        // 'U' ไม่ตรง case ใดใน switch -> default branch -> IllegalArgumentException
        FastDateFormat.getInstance("yyyy-U-dd");
    }

    @Test
    public void testGetInstance_Default_UsesSystemDefaultPattern() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        String expectedPattern = new SimpleDateFormat().toPattern();
        assertEquals(expectedPattern, fdf.getPattern());
        // ต้อง format ได้โดยไม่ throw
        assertNotNull(fdf.format(new Date()));
    }

    @Test
    public void testGetInstance_PatternOnly() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        assertEquals("yyyy", fdf.getPattern());
        assertFalse(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_PatternAndTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT);
        assertTrue(fdf.getTimeZoneOverridesCalendar());
        assertEquals(GMT, fdf.getTimeZone());
    }

    @Test
    public void testGetInstance_PatternAndLocale() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", Locale.US);
        assertEquals(Locale.US, fdf.getLocale());
    }

    @Test
    public void testGetInstance_CachingReturnsEqualInstance() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        // cache เก็บ format แรกไว้และคืนตัวเดิม
        assertSame(a, b);
    }

    // ------------------------------------------------------------
    // getDateInstance / getTimeInstance / getDateTimeInstance overloads
    // (ครอบคลุมสาขาการสร้าง key / การ cache; ClassCastException branch
    //  ขึ้นกับ environment ของ java.text spi จึงไม่ทดสอบโดยตรง)
    // ------------------------------------------------------------

    @Test
    public void testGetDateInstance_StyleOnly() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(fdf);
        assertNotNull(fdf.format(new Date()));
    }

    @Test
    public void testGetDateInstance_StyleAndLocale() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, Locale.US);
        assertEquals(Locale.US, fdf.getLocale());
    }

    @Test
    public void testGetDateInstance_StyleAndTimeZone() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, GMT);
        assertEquals(GMT, fdf.getTimeZone());
    }

    @Test
    public void testGetDateInstance_StyleTimeZoneLocale() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.LONG, GMT, Locale.US);
        assertEquals(GMT, fdf.getTimeZone());
        assertEquals(Locale.US, fdf.getLocale());
    }

    @Test
    public void testGetTimeInstance_AllOverloads() {
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT));
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT, Locale.US));
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT, GMT));
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT, GMT, Locale.US));
    }

    @Test
    public void testGetDateTimeInstance_AllOverloads() {
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT));
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US));
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, GMT));
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, GMT, Locale.US));
    }

    // ------------------------------------------------------------
    // Pattern parsing - รวมหลาย field ใน pattern เดียว (ISO8601-like)
    // ครอบคลุม: y>=4, M==2, d==2, H==2, m==2, s==2, S==3(padded<100 branch),
    //           Z==1(no colon, offset>=0 branch), literal '-' ':' '.' 'T'
    // ------------------------------------------------------------

    @Test
    public void testFormat_CombinedIsoPattern_GmtPositiveOffset() {
        FastDateFormat fdf = FastDateFormat.getInstance(
                "yyyy-MM-dd'T'HH:mm:ss.SSSZ", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 5, 6, 7, 8);
        String result = fdf.format(cal);
        assertEquals("2023-01-09T05:06:07.008+0000", result);
    }

    @Test
    public void testFormat_TimeZoneNumberRule_Colon_NegativeOffset() {
        // ทดสอบ offset<0 branch และ ZZ(colon) branch
        FastDateFormat fdf = FastDateFormat.getInstance("ZZ", LA, Locale.US);
        Calendar cal = buildCal(LA, 2023, Calendar.JANUARY, 9, 5, 6, 7, 8); // PST, ไม่มี DST
        assertEquals("-08:00", fdf.format(cal));
    }

    @Test
    public void testFormat_TimeZoneNumberRule_NoColon_NegativeOffset() {
        FastDateFormat fdf = FastDateFormat.getInstance("Z", LA, Locale.US);
        Calendar cal = buildCal(LA, 2023, Calendar.JANUARY, 9, 5, 6, 7, 8);
        assertEquals("-0800", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'y' : tokenLen<4 -> TwoDigitYearField, tokenLen>=4 -> Padded
    // ------------------------------------------------------------

    @Test
    public void testYear_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("yy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("23", fdf.format(cal));
    }

    @Test
    public void testYear_FourDigit_ValueOver1000_DigitsEqualSize() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("2023", fdf.format(cal));
    }

    @Test
    public void testYear_FourDigit_SmallValue_PadBranch() {
        // ทดสอบ PaddedNumberField: value<100 branch กับ mSize>2 (เติมศูนย์หลายตัว)
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 5, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("0005", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'M' : tokenLen>=4 full text, ==3 short text, ==2 two-digit, else unpadded
    // + UnpaddedMonthField boundary (<10 / >=10)
    // ------------------------------------------------------------

    @Test
    public void testMonth_FullText() {
        FastDateFormat fdf = FastDateFormat.getInstance("MMMM", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("January", fdf.format(cal));
    }

    @Test
    public void testMonth_ShortText() {
        FastDateFormat fdf = FastDateFormat.getInstance("MMM", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("Jan", fdf.format(cal));
    }

    @Test
    public void testMonth_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("MM", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("01", fdf.format(cal));
    }

    @Test
    public void testMonth_Unpadded_LessThan10() {
        FastDateFormat fdf = FastDateFormat.getInstance("M", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("1", fdf.format(cal));
    }

    @Test
    public void testMonth_Unpadded_GreaterOrEqual10() {
        FastDateFormat fdf = FastDateFormat.getInstance("M", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.NOVEMBER, 1, 0, 0, 0, 0);
        assertEquals("11", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'd' day of month - selectNumberRule(1/2/3)
    // ------------------------------------------------------------

    @Test
    public void testDay_Unpadded() {
        FastDateFormat fdf = FastDateFormat.getInstance("d", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        assertEquals("9", fdf.format(cal));
    }

    @Test
    public void testDay_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("dd", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        assertEquals("09", fdf.format(cal));
    }

    @Test
    public void testDay_PaddedThreeDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("ddd", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        assertEquals("009", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'h' TwelveHourField : wrap at 0 -> 12 ; normal value
    // ------------------------------------------------------------

    @Test
    public void testTwelveHour_WrapsZeroToTwelve() {
        FastDateFormat fdf = FastDateFormat.getInstance("h", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0); // midnight
        assertEquals("12", fdf.format(cal));
    }

    @Test
    public void testTwelveHour_NormalValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("h", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals("5", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'H' hour of day - selectNumberRule ตรง ๆ
    // ------------------------------------------------------------

    @Test
    public void testHourOfDay_Unpadded() {
        FastDateFormat fdf = FastDateFormat.getInstance("H", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals("5", fdf.format(cal));
    }

    @Test
    public void testHourOfDay_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("HH", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals("05", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'm','s' minute/second - two-digit (ครอบคลุม selectNumberRule case2 ซ้ำผ่าน field ต่างกัน)
    // ------------------------------------------------------------

    @Test
    public void testMinute_Unpadded_Between10And99() {
        FastDateFormat fdf = FastDateFormat.getInstance("m", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 45, 0, 0);
        assertEquals("45", fdf.format(cal));
    }

    @Test
    public void testSecond_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("ss", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 7, 0);
        assertEquals("07", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'S' millisecond - unpadded <10 branch
    // ------------------------------------------------------------

    @Test
    public void testMillisecond_Unpadded_LessThan10() {
        FastDateFormat fdf = FastDateFormat.getInstance("S", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 8);
        assertEquals("8", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'E' day of week - tokenLen<4 short / >=4 full
    // ------------------------------------------------------------

    @Test
    public void testWeekday_Short() {
        FastDateFormat fdf = FastDateFormat.getInstance("E", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0); // Sunday
        assertEquals("Sun", fdf.format(cal));
    }

    @Test
    public void testWeekday_Full() {
        FastDateFormat fdf = FastDateFormat.getInstance("EEEE", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("Sunday", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'D' day in year - unpadded boundaries (<10, 10-99, >=100) + padded<100 branch
    // ------------------------------------------------------------

    @Test
    public void testDayOfYear_Unpadded_LessThan10() {
        FastDateFormat fdf = FastDateFormat.getInstance("D", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 5, 0, 0, 0, 0);
        assertEquals("5", fdf.format(cal));
    }

    @Test
    public void testDayOfYear_Unpadded_GreaterOrEqual100() {
        FastDateFormat fdf = FastDateFormat.getInstance("D", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.SEPTEMBER, 7, 0, 0, 0, 0); // day-of-year=250
        assertEquals("250", fdf.format(cal));
    }

    @Test
    public void testDayOfYear_PaddedThreeDigit_SmallValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("DDD", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 5, 0, 0, 0, 0);
        assertEquals("005", fdf.format(cal));
    }

    @Test
    public void testDayOfYear_PaddedThreeDigit_MidValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("DDD", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.SEPTEMBER, 7, 0, 0, 0, 0); // 250
        assertEquals("250", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'F' day of week in month
    // ------------------------------------------------------------

    @Test
    public void testDayOfWeekInMonth() {
        FastDateFormat fdf = FastDateFormat.getInstance("F", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0); // Monday ที่ 2 ของเดือน
        assertEquals("2", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'w','W' week of year / week of month (ค่าขึ้นกับ locale calendar rule
    // จึงตรวจแบบ loose - เป็นตัวเลขไม่ว่าง)
    // ------------------------------------------------------------

    @Test
    public void testWeekOfYear_NotEmptyAndNumeric() {
        FastDateFormat fdf = FastDateFormat.getInstance("w", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertTrue(result.matches("\\d+"));
    }

    @Test
    public void testWeekOfMonth_NotEmptyAndNumeric() {
        FastDateFormat fdf = FastDateFormat.getInstance("W", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertTrue(result.matches("\\d+"));
    }

    // ------------------------------------------------------------
    // 'a' am/pm marker
    // ------------------------------------------------------------

    @Test
    public void testAmPm_AM() {
        FastDateFormat fdf = FastDateFormat.getInstance("a", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals("AM", fdf.format(cal));
    }

    @Test
    public void testAmPm_PM() {
        FastDateFormat fdf = FastDateFormat.getInstance("a", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 13, 0, 0, 0);
        assertEquals("PM", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'k' TwentyFourHourField : wrap at 0 -> 24 ; normal value
    // ------------------------------------------------------------

    @Test
    public void testTwentyFourHour_WrapsZeroToTwentyFour() {
        FastDateFormat fdf = FastDateFormat.getInstance("k", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("24", fdf.format(cal));
    }

    @Test
    public void testTwentyFourHour_NormalValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("k", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 5, 0, 0, 0);
        assertEquals("5", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'K' hour in am/pm (0..11) - selectNumberRule ตรง ๆ ไม่มี wrapper
    // ------------------------------------------------------------

    @Test
    public void testHourInAmPm_ZeroAtNoon() {
        FastDateFormat fdf = FastDateFormat.getInstance("K", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 12, 0, 0, 0); // noon -> HOUR=0
        assertEquals("0", fdf.format(cal));
    }

    @Test
    public void testHourInAmPm_NormalValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("K", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 15, 0, 0, 0); // 3PM -> HOUR=3
        assertEquals("3", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'G' era
    // ------------------------------------------------------------

    @Test
    public void testEra_AD() {
        FastDateFormat fdf = FastDateFormat.getInstance("G", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("AD", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // 'z' TimeZoneNameRule : forced (short/long), ไม่ forced, DST/ไม่ DST
    // (ชื่อแบบ long อาจแตกต่างตาม JDK - ตรวจแบบไม่เข้มงวด)
    // ------------------------------------------------------------

    @Test
    public void testZoneName_Forced_Short_NoDst() {
        FastDateFormat fdf = FastDateFormat.getInstance("z", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertTrue(result.contains("GMT")); // ค่อนข้างแน่นอนสำหรับ GMT zone
    }

    @Test
    public void testZoneName_Forced_Long_NoDst() {
        FastDateFormat fdf = FastDateFormat.getInstance("zzzz", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0); // ชื่อเต็มขึ้นกับ JDK, ตรวจแบบ loose
    }

    @Test
    public void testZoneName_Forced_Dst_UsesDaylightName() {
        // New York เดือนกรกฎาคม = DST active
        FastDateFormat fdf = FastDateFormat.getInstance("z", NY, Locale.US);
        Calendar cal = buildCal(NY, 2023, Calendar.JULY, 4, 0, 0, 0, 0);
        String daylightResult = fdf.format(cal);

        Calendar calWinter = buildCal(NY, 2023, Calendar.JANUARY, 4, 0, 0, 0, 0);
        String standardResult = fdf.format(calWinter);

        assertNotNull(daylightResult);
        assertNotNull(standardResult);
        // ชื่อฤดูร้อน/หนาวควรต่างกัน (ยืนยันว่า branch DST ถูกเรียกจริง)
        assertNotEquals(standardResult, daylightResult);
    }

    @Test
    public void testZoneName_NotForced_UsesCalendarTimeZone() {
        // ไม่ระบุ timeZone -> mTimeZoneForced=false -> ใช้ calendar.getTimeZone()
        FastDateFormat fdf = FastDateFormat.getInstance("z", Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertTrue(result.contains("GMT"));
    }

    @Test
    public void testZoneName_NotForced_Dst() {
        FastDateFormat fdf = FastDateFormat.getInstance("z", Locale.US);
        Calendar cal = buildCal(NY, 2023, Calendar.JULY, 4, 0, 0, 0, 0);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    // ------------------------------------------------------------
    // Literal: single-char, multi-char, escaped '' quote
    // ------------------------------------------------------------

    @Test
    public void testLiteral_SingleCharacter() {
        FastDateFormat fdf = FastDateFormat.getInstance("'T'", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("T", fdf.format(cal));
    }

    @Test
    public void testLiteral_MultiCharacterString() {
        FastDateFormat fdf = FastDateFormat.getInstance("'abc'", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("abc", fdf.format(cal));
    }

    @Test
    public void testLiteral_EscapedQuoteInsideLiteral() {
        // "'it''s'" -> literal ที่มีเครื่องหมาย ' ฝังอยู่ -> "it's"
        FastDateFormat fdf = FastDateFormat.getInstance("'it''s'", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("it's", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // format(Object, StringBuffer, FieldPosition) - สาขา instanceof
    // ------------------------------------------------------------

    @Test
    public void testFormatObject_Date() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer sb = new StringBuffer();
        fdf.format(cal.getTime(), sb, new FieldPosition(0));
        assertEquals("2023", sb.toString());
    }

    @Test
    public void testFormatObject_Calendar() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer sb = new StringBuffer();
        fdf.format((Object) cal, sb, new FieldPosition(0));
        assertEquals("2023", sb.toString());
    }

    @Test
    public void testFormatObject_Long() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer sb = new StringBuffer();
        fdf.format((Object) Long.valueOf(cal.getTimeInMillis()), sb, new FieldPosition(0));
        assertEquals("2023", sb.toString());
    }

    @Test
    public void testFormatObject_UnsupportedType_Throws() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        try {
            fdf.format((Object) "not-a-date", new StringBuffer(), new FieldPosition(0));
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("String"));
        }
    }

    @Test
    public void testFormatObject_Null_Throws() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        try {
            fdf.format((Object) null, new StringBuffer(), new FieldPosition(0));
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("<null>"));
        }
    }

    // ------------------------------------------------------------
    // format(long) / format(long, buf) / format(Date, buf) / format(Calendar, buf)
    // ------------------------------------------------------------

    @Test
    public void testFormatLong() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("2023", fdf.format(cal.getTimeInMillis()));
    }

    @Test
    public void testFormatLongIntoBuffer() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer buf = new StringBuffer("PRE-");
        fdf.format(cal.getTimeInMillis(), buf);
        assertEquals("PRE-2023", buf.toString());
    }

    @Test
    public void testFormatDateIntoBuffer() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        StringBuffer buf = new StringBuffer();
        fdf.format(cal.getTime(), buf);
        assertEquals("2023", buf.toString());
    }

    @Test
    public void testFormatCalendar_NotForced_DoesNotCloneTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", Locale.US); // timeZone=null -> not forced
        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        assertEquals("2023", fdf.format(cal));
    }

    // ------------------------------------------------------------
    // Getters
    // ------------------------------------------------------------

    @Test
    public void testGetters() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        assertEquals("yyyy-MM-dd", fdf.getPattern());
        assertEquals(GMT, fdf.getTimeZone());
        assertTrue(fdf.getTimeZoneOverridesCalendar());
        assertEquals(Locale.US, fdf.getLocale());
        assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    // ------------------------------------------------------------
    // equals() / hashCode() / toString()
    // ------------------------------------------------------------

    @Test
    public void testEquals_SameReference() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertTrue(fdf.equals(fdf));
    }

    @Test
    public void testEquals_NotInstanceOfFastDateFormat() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertFalse(fdf.equals("some string"));
        assertFalse(fdf.equals(null));
    }

    @Test
    public void testEquals_DifferentPattern() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("MM", GMT, Locale.US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentTimeZoneForcedFlag() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", (TimeZone) null, Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("yyyy", TimeZone.getDefault(), Locale.US);
        // pattern/locale เหมือนกัน แต่ mTimeZoneForced ต่างกัน (false vs true)
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentLocaleForcedFlag() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", GMT, (Locale) null);
        FastDateFormat b = FastDateFormat.getInstance("yyyy", GMT, Locale.getDefault());
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_SamePropertiesViaCache_AreEqual() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        assertEquals("FastDateFormat[yyyy]", fdf.toString());
    }

    // ------------------------------------------------------------
    // parseObject - ไม่รองรับการ parse, ต้อง reset position และคืน null
    // ------------------------------------------------------------

    @Test
    public void testParseObject_ReturnsNullAndResetsPosition() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", GMT, Locale.US);
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(3);
        Object result = fdf.parseObject("2023", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ------------------------------------------------------------
    // Serialization - readObject ต้อง re-init() transient fields
    // ------------------------------------------------------------

    @Test
    public void testSerialization_RoundTrip_StillFormatsCorrectly() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        Calendar cal = buildCal(GMT, 2023, Calendar.JANUARY, 9, 0, 0, 0, 0);
        assertEquals("2023-01-09", deserialized.format(cal));
        assertEquals(original.getPattern(), deserialized.getPattern());
    }
}
