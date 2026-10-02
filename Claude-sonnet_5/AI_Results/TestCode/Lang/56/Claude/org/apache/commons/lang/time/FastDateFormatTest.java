package org.apache.commons.lang.time;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.lang.time.FastDateFormat (Lang-56b)
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดเท่าที่ทำได้จากซอร์สที่ให้มา
 */
public class FastDateFormatTest {

    // ---------- Helper ----------
    private Calendar buildCalendar(String tzId, int year, int month, int day,
                                    int hour, int minute, int second) {
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone(tzId), Locale.US);
        c.set(year, month, day, hour, minute, second);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }

    // ================= getInstance() variants =================

    @Test
    public void testGetInstanceDefault() {
        FastDateFormat f = FastDateFormat.getInstance();
        assertNotNull(f);
        assertNotNull(f.getPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullPatternThrows() {
        // constructor: if (pattern == null) throw new IllegalArgumentException(...)
        FastDateFormat.getInstance((String) null);
    }

    @Test
    public void testGetInstanceCachingReturnsSameInstance() {
        // branch: format == null -> false (cache hit) ของ getInstance(pattern,timeZone,locale)
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        assertSame(f1, f2);
    }

    @Test
    public void testGetInstanceWithTimeZoneOnly() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"));
        assertEquals(TimeZone.getTimeZone("UTC"), f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstanceWithLocaleOnly() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.GERMANY);
        assertEquals(Locale.GERMANY, f.getLocale());
    }

    // ================= getDateInstance / getTimeInstance / getDateTimeInstance =================

    @Test
    public void testGetDateInstanceAllStylesAndCacheHit() {
        int[] styles = { FastDateFormat.FULL, FastDateFormat.LONG, FastDateFormat.MEDIUM, FastDateFormat.SHORT };
        for (int style : styles) {
            FastDateFormat f1 = FastDateFormat.getDateInstance(style, Locale.US);
            FastDateFormat f2 = FastDateFormat.getDateInstance(style, Locale.US); // cache-hit branch
            assertNotNull(f1);
            assertSame(f1, f2);
        }
    }

    @Test
    public void testGetDateInstanceWithTimeZone() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT,
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(f);
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeInstanceAllStylesAndCacheHit() {
        int[] styles = { FastDateFormat.FULL, FastDateFormat.LONG, FastDateFormat.MEDIUM, FastDateFormat.SHORT };
        for (int style : styles) {
            FastDateFormat f1 = FastDateFormat.getTimeInstance(style, Locale.US);
            FastDateFormat f2 = FastDateFormat.getTimeInstance(style, Locale.US);
            assertNotNull(f1);
            assertSame(f1, f2);
        }
    }

    @Test
    public void testGetTimeInstanceWithTimeZone() {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.LONG,
                TimeZone.getTimeZone("UTC"));
        assertNotNull(f);
    }

    @Test
    public void testGetDateTimeInstanceAllStylesAndCacheHit() {
        FastDateFormat f1 = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US);
        FastDateFormat f2 = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US);
        assertSame(f1, f2);
    }

    @Test
    public void testGetDateTimeInstanceWithTimeZone() {
        FastDateFormat f = FastDateFormat.getDateTimeInstance(
                FastDateFormat.FULL, FastDateFormat.FULL, TimeZone.getTimeZone("UTC"));
        assertNotNull(f);
    }

    // NOTE: ClassCastException branch (DateFormat.getXxxInstance ไม่คืน SimpleDateFormat)
    // ไม่สามารถ trigger ได้อย่างน่าเชื่อถือผ่าน JDK มาตรฐาน -> ข้ามตามข้อกำหนด "ห้ามเดา behavior"

    // ================= equals / hashCode / toString =================

    @Test
    public void testEqualsFalseForNonFastDateFormat() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertFalse(f.equals("not a FastDateFormat"));
        assertFalse(f.equals(null));
    }

    @Test
    public void testEqualsReflexiveViaCache() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEqualsFalseDifferentPattern() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy");
        FastDateFormat f2 = FastDateFormat.getInstance("MM");
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsFalseDifferentForcedFlags() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy"); // timeZoneForced=false
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy", TimeZone.getDefault()); // forced=true
        assertFalse(f1.equals(f2));
    }

    /**
     * ทดสอบสาขา mPattern.equals()/mTimeZone.equals()/mLocale.equals() (ไม่ใช่ ==)
     * โดยสร้าง instance ผ่าน protected constructor+init() ด้วย reflection เพื่อให้ field
     * เป็น "เท่ากันแต่ reference ต่างกัน" (bypass cache ของ getInstance)
     */
    @Test
    public void testEqualsUsesEqualsNotReferenceEquality() throws Exception {
        Constructor<FastDateFormat> ctor = FastDateFormat.class.getDeclaredConstructor(
                String.class, TimeZone.class, Locale.class);
        ctor.setAccessible(true);
        Method init = FastDateFormat.class.getDeclaredMethod("init");
        init.setAccessible(true);

        String pattern1 = new String("yyyy"); // force distinct String reference
        String pattern2 = new String("yyyy");
        TimeZone tz1 = TimeZone.getTimeZone("UTC");
        TimeZone tz2 = TimeZone.getTimeZone("UTC"); // อาจเป็น reference ต่างกัน แต่ equals() true
        Locale loc1 = new Locale("en", "US");
        Locale loc2 = new Locale("en", "US"); // distinct reference, equals() true

        FastDateFormat f1 = ctor.newInstance(pattern1, tz1, loc1);
        FastDateFormat f2 = ctor.newInstance(pattern2, tz2, loc2);
        init.invoke(f1);
        init.invoke(f2);

        assertNotSame(pattern1, pattern2);
        assertTrue(f1.equals(f2)); // ต้องผ่านสาขา .equals() ของทุก field
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testHashCodeConsistency() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        int h1 = f.hashCode();
        int h2 = f.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testToString() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertEquals("FastDateFormat[yyyy]", f.toString());
    }

    // ================= Accessors =================

    @Test
    public void testAccessors() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getInstance("yyyy", tz, Locale.US);
        assertEquals("yyyy", f.getPattern());
        assertEquals(tz, f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
        assertEquals(Locale.US, f.getLocale());
        assertTrue(f.getMaxLengthEstimate() > 0);
    }

    // ================= format(Object, StringBuffer, FieldPosition) =================

    @Test
    public void testFormatObjectDateInstance() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        StringBuffer sb = new StringBuffer();
        f.format(new Date(0L), sb, new FieldPosition(0));
        assertEquals("1970", sb.toString());
    }

    @Test
    public void testFormatObjectCalendarInstance() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        StringBuffer sb = new StringBuffer();
        f.format(c, sb, new FieldPosition(0));
        assertEquals("2000", sb.toString());
    }

    @Test
    public void testFormatObjectLongInstance() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        StringBuffer sb = new StringBuffer();
        f.format(new Long(0L), sb, new FieldPosition(0));
        assertEquals("1970", sb.toString());
    }

    @Test
    public void testFormatObjectUnknownTypeThrows() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        try {
            f.format("not a date", new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unknown class"));
        }
    }

    @Test
    public void testFormatObjectNullThrows() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        try {
            f.format(null, new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("<null>"));
        }
    }

    // ================= format(long) / format(Date) / format(Calendar) overloads =================

    @Test
    public void testFormatLong() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("1970", f.format(0L));
    }

    @Test
    public void testFormatLongWithBuffer() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        StringBuffer sb = new StringBuffer();
        f.format(0L, sb);
        assertEquals("1970", sb.toString());
    }

    @Test
    public void testFormatCalendarNotForced() {
        // mTimeZoneForced == false -> ไม่ clone/ไม่ override timezone ของ calendar
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.US); // no timezone => not forced
        Calendar c = buildCalendar("UTC", 1999, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("1999", f.format(c));
    }

    @Test
    public void testFormatCalendarForced() {
        // mTimeZoneForced == true -> clone + setTimeZone(mTimeZone)
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd'T'HH",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar c = buildCalendar("America/Los_Angeles", 2000, Calendar.JANUARY, 1, 23, 0, 0);
        String result = f.format(c);
        // ชั่วโมง 23:00 PST (UTC-8, winter no DST) == 07:00 UTC วันถัดไป
        assertEquals("2000-01-02T07", result);
    }

    // ================= parseObject =================

    @Test
    public void testParseObjectAlwaysNullAndResetsPosition() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(5);
        Object result = f.parseObject("2020", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ================= parsePattern switch-case branches (ผ่าน format ผลลัพธ์) =================

    @Test
    public void testPatternEraDesignator() {
        FastDateFormat f = FastDateFormat.getInstance("G", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("AD", f.format(c));
    }

    @Test
    public void testPatternYearFourDigitPadded() {
        // tokenLen >= 4 -> selectNumberRule -> PaddedNumberField (padding=4)
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.US);
        Calendar c = buildCalendar("UTC", 2005, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("2005", f.format(c));
    }

    @Test
    public void testPatternYearTwoDigit() {
        // tokenLen < 4 -> TwoDigitYearField.INSTANCE
        FastDateFormat f = FastDateFormat.getInstance("yy", Locale.US);
        Calendar c = buildCalendar("UTC", 2005, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("05", f.format(c));
    }

    @Test
    public void testPatternYearSingleDigitStillTwoDigitRule() {
        // tokenLen==1 (<4) -> TwoDigitYearField ด้วยเช่นกัน
        FastDateFormat f = FastDateFormat.getInstance("y", Locale.US);
        Calendar c = buildCalendar("UTC", 1999, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("99", f.format(c));
    }

    @Test
    public void testPatternMonthFourLettersFullName() {
        FastDateFormat f = FastDateFormat.getInstance("MMMM", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("January", f.format(c));
    }

    @Test
    public void testPatternMonthThreeLettersShortName() {
        FastDateFormat f = FastDateFormat.getInstance("MMM", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Jan", f.format(c));
    }

    @Test
    public void testPatternMonthTwoDigit() {
        FastDateFormat f = FastDateFormat.getInstance("MM", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("01", f.format(c));
    }

    @Test
    public void testPatternMonthUnpadded() {
        FastDateFormat f = FastDateFormat.getInstance("M", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("1", f.format(c));
    }

    @Test
    public void testPatternDayOfMonthSelectNumberRuleBranches() {
        // padding=1 -> UnpaddedNumberField, 2 -> TwoDigitNumberField, >=3 -> PaddedNumberField
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 5, 0, 0, 0);
        assertEquals("5", FastDateFormat.getInstance("d", Locale.US).format(c));
        assertEquals("05", FastDateFormat.getInstance("dd", Locale.US).format(c));
        assertEquals("005", FastDateFormat.getInstance("ddd", Locale.US).format(c));
    }

    @Test
    public void testPatternHourAmPmZeroBoundary_TwelveHourField() {
        // TwelveHourField: value==0 -> value = getLeastMaximum(HOUR)+1 == 12
        FastDateFormat f = FastDateFormat.getInstance("h", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0); // midnight -> HOUR=0
        assertEquals("12", f.format(c));
    }

    @Test
    public void testPatternHourAmPmNonZero() {
        FastDateFormat f = FastDateFormat.getInstance("h", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 5, 0, 0); // HOUR=5
        assertEquals("5", f.format(c));
    }

    @Test
    public void testPatternHourOfDayTwoDigit() {
        FastDateFormat f = FastDateFormat.getInstance("HH", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 23, 0, 0);
        assertEquals("23", f.format(c));
    }

    @Test
    public void testPatternMinuteSecondMillis() {
        FastDateFormat f = FastDateFormat.getInstance("mm:ss.SSS", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 7, 8);
        c.set(Calendar.MILLISECOND, 9);
        assertEquals("07:08.009", f.format(c));
    }

    @Test
    public void testPatternWeekdayShortAndFull() {
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0); // Saturday
        assertEquals("Sat", FastDateFormat.getInstance("E", Locale.US).format(c));
        assertEquals("Sat", FastDateFormat.getInstance("EE", Locale.US).format(c)); // <4 -> short
        assertEquals("Saturday", FastDateFormat.getInstance("EEEE", Locale.US).format(c)); // >=4 -> full
    }

    @Test
    public void testPatternDayOfYearWeekOfYearWeekOfMonthDayOfWeekInMonth() {
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        // เพียงตรวจว่าไม่มี exception และผลลัพธ์ตรงกับค่า Calendar field จริง
        assertEquals(String.valueOf(c.get(Calendar.DAY_OF_YEAR)),
                FastDateFormat.getInstance("D", Locale.US).format(c));
        assertEquals(String.valueOf(c.get(Calendar.WEEK_OF_YEAR)),
                FastDateFormat.getInstance("w", Locale.US).format(c));
        assertEquals(String.valueOf(c.get(Calendar.WEEK_OF_MONTH)),
                FastDateFormat.getInstance("W", Locale.US).format(c));
        assertEquals(String.valueOf(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)),
                FastDateFormat.getInstance("F", Locale.US).format(c));
    }

    @Test
    public void testPatternAmPmMarker() {
        Calendar am = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 3, 0, 0);
        Calendar pm = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 15, 0, 0);
        FastDateFormat f = FastDateFormat.getInstance("a", Locale.US);
        assertEquals("AM", f.format(am));
        assertEquals("PM", f.format(pm));
    }

    @Test
    public void testPatternHourInDay1to24_TwentyFourHourField_ZeroBoundary() {
        // TwentyFourHourField: value==0 -> getMaximum(HOUR_OF_DAY)+1 == 24
        FastDateFormat f = FastDateFormat.getInstance("k", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("24", f.format(c));
    }

    @Test
    public void testPatternHourInDay1to24_NonZero() {
        FastDateFormat f = FastDateFormat.getInstance("k", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 5, 0, 0);
        assertEquals("5", f.format(c));
    }

    @Test
    public void testPatternHourInAmPm0to11() {
        // 'K' ใช้ selectNumberRule ตรง ไม่มีการปรับ 0->12 เหมือน 'h'
        FastDateFormat f = FastDateFormat.getInstance("K", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("0", f.format(c));
    }

    @Test
    public void testPatternTimeZoneNameShortVsLong() {
        FastDateFormat shortF = FastDateFormat.getInstance("z", Locale.US); // tokenLen<4 -> SHORT
        FastDateFormat longF = FastDateFormat.getInstance("zzzz", Locale.US); // tokenLen>=4 -> LONG
        Calendar c = buildCalendar("America/New_York", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        String s = shortF.format(c);
        String l = longF.format(c);
        assertNotNull(s);
        assertNotNull(l);
        assertTrue(l.length() >= s.length());
    }

    @Test
    public void testPatternTimeZoneNameNotForced_DstVsStandardDifferByCalendarTz() {
        // mTimeZoneForced == false -> ใช้ calendar.getTimeZone() เป็นตัวตัดสิน DST
        FastDateFormat f = FastDateFormat.getInstance("z", Locale.US); // ไม่ส่ง timeZone -> not forced
        Calendar summer = buildCalendar("America/New_York", 2023, Calendar.JULY, 1, 12, 0, 0);
        Calendar winter = buildCalendar("America/New_York", 2023, Calendar.JANUARY, 1, 12, 0, 0);
        String s1 = f.format(summer);
        String s2 = f.format(winter);
        assertNotEquals(s1, s2); // ต้องต่างกันเพราะ DST_OFFSET ต่างกัน -> คนละสาขา if
    }

    @Test
    public void testPatternTimeZoneNameForced_DstVsStandard() {
        // mTimeZoneForced == true -> precompute mStandard/mDaylight, เลือกจาก DST_OFFSET ของ calendar ที่ build ด้วย mTimeZone
        FastDateFormat f = FastDateFormat.getInstance("z",
                TimeZone.getTimeZone("America/New_York"), Locale.US);
        Date summer = buildCalendar("America/New_York", 2023, Calendar.JULY, 1, 12, 0, 0).getTime();
        Date winter = buildCalendar("America/New_York", 2023, Calendar.JANUARY, 1, 12, 0, 0).getTime();
        String s1 = f.format(summer);
        String s2 = f.format(winter);
        assertNotEquals(s1, s2);
    }

    @Test
    public void testPatternTimeZoneNumberNoColonPositiveOffset() {
        // Asia/Kolkata ไม่มี DST, offset คงที่ +05:30 -> ทดสอบสาขา offset >= 0 ('+')
        FastDateFormat f = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("Asia/Kolkata"), Locale.US);
        Date d = buildCalendar("Asia/Kolkata", 2000, Calendar.JUNE, 1, 0, 0, 0).getTime();
        assertEquals("+0530", f.format(d));
    }

    @Test
    public void testPatternTimeZoneNumberColonPositiveOffset() {
        FastDateFormat f = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("Asia/Kolkata"), Locale.US);
        Date d = buildCalendar("Asia/Kolkata", 2000, Calendar.JUNE, 1, 0, 0, 0).getTime();
        assertEquals("+05:30", f.format(d));
    }

    @Test
    public void testPatternTimeZoneNumberNegativeOffsetNoColon() {
        // America/Los_Angeles ช่วงเดือนมกรา (winter, ไม่มี DST) = PST -08:00 -> ทดสอบสาขา offset < 0 ('-')
        FastDateFormat f = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        Date d = buildCalendar("America/Los_Angeles", 2000, Calendar.JANUARY, 15, 0, 0, 0).getTime();
        assertEquals("-0800", f.format(d));
    }

    @Test
    public void testPatternTimeZoneNumberNegativeOffsetWithColon() {
        FastDateFormat f = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        Date d = buildCalendar("America/Los_Angeles", 2000, Calendar.JANUARY, 15, 0, 0, 0).getTime();
        assertEquals("-08:00", f.format(d));
    }

    // ================= literal parsing (parseToken) =================

    @Test
    public void testPatternLiteralSingleCharacter() {
        // sub.length()==1 -> CharacterLiteral
        FastDateFormat f = FastDateFormat.getInstance("'T'", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("T", f.format(c));
    }

    @Test
    public void testPatternLiteralMultiCharacter() {
        // sub.length()>1 -> StringLiteral
        FastDateFormat f = FastDateFormat.getInstance("'Hello'", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Hello", f.format(c));
    }

    @Test
    public void testPatternEscapedQuote() {
        // '' -> literal เครื่องหมาย ' เดี่ยว
        FastDateFormat f = FastDateFormat.getInstance("''", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("'", f.format(c));
    }

    @Test
    public void testPatternMixedLiteralAndField() {
        FastDateFormat f = FastDateFormat.getInstance("'Year:'yyyy", Locale.US);
        Calendar c = buildCalendar("UTC", 2010, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Year:2010", f.format(c));
    }

    @Test
    public void testPatternEmptyProducesEmptyOutput() {
        // length==0 -> for loop ไม่ execute -> mRules ว่าง
        FastDateFormat f = FastDateFormat.getInstance("", Locale.US);
        Calendar c = buildCalendar("UTC", 2000, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("", f.format(c));
        assertEquals(0, f.getMaxLengthEstimate());
    }

    // ================= invalid pattern letter -> default case throws =================

    @Test
    public void testInvalidPatternLetterThrowsIllegalArgumentException() {
        try {
            FastDateFormat.getInstance("Q", Locale.US); // 'Q' ไม่อยู่ใน switch -> default
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal pattern component"));
        }
    }

    // ================= getTimeZoneDisplay caching (ผ่าน static method แบบ package-private) =================

    @Test
    public void testGetTimeZoneDisplayCachingBranch() {
        // เรียกซ้ำเพื่อให้ผ่านทั้งสาขา value==null (คำนวณ) และ value!=null (cache hit)
        String v1 = FastDateFormat.getTimeZoneDisplay(TimeZone.getTimeZone("UTC"), false,
                TimeZone.SHORT, Locale.US);
        String v2 = FastDateFormat.getTimeZoneDisplay(TimeZone.getTimeZone("UTC"), false,
                TimeZone.SHORT, Locale.US);
        assertEquals(v1, v2);
    }

    // ================= Advanced: private PaddedNumberField constructor branch (size<3) =================

    /**
     * โค้ดสาขา "if (size < 3) throw new IllegalArgumentException();" ใน PaddedNumberField
     * ไม่สามารถ trigger ได้ผ่าน public API เพราะ selectNumberRule() จะเรียก PaddedNumberField
     * เมื่อ padding>=3 เท่านั้น (padding 1,2 ถูกจัดการแยกไว้ก่อนแล้ว)
     * จึงใช้ reflection เข้าถึง private static inner class โดยตรงเพื่อปิดช่องว่างของ branch coverage
     */
    @Test
    public void testPaddedNumberFieldConstructorRejectsSizeLessThanThree() throws Exception {
        Class<?> paddedClass = Class.forName(
                "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField");
        Constructor<?> ctor = paddedClass.getDeclaredConstructor(int.class, int.class);
        ctor.setAccessible(true);
        try {
            ctor.newInstance(Calendar.YEAR, 2); // size=2 < 3 -> ต้อง throw
            fail("expected IllegalArgumentException wrapped in InvocationTargetException");
        } catch (InvocationTargetException ite) {
            assertTrue(ite.getCause() instanceof IllegalArgumentException);
        }
    }
}
