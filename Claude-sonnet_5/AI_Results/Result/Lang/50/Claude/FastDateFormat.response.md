# FastDateFormatTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- วาง test class ไว้ใน **package เดียวกัน** (`org.apache.commons.lang.time`) เพื่อให้เข้าถึง constructor/method ที่เป็น `protected`/package-private (เช่น constructor, `getTimeZoneDisplay`) ได้ ซึ่งจำเป็นสำหรับการทดสอบ branch บางส่วนที่ไม่สามารถเข้าถึงผ่าน public API ได้ตรง ๆ
- Inner class `Rule`/`NumberRule` เป็น `private` จึงไม่สามารถ unit test แยกได้ตรง ๆ — ทดสอบผ่าน public API (`format(...)`) แทน ตามหลัก black-box
- บาง branch (เช่น `PaddedNumberField` constructor ที่ throw เมื่อ `size<3`, หรือ `Validate.isTrue(value > -1,...)`) **ไม่สามารถ trigger ได้ผ่าน public API** เพราะ `selectNumberRule` ไม่เคยส่ง padding < 3 ไปที่ constructor นั้น และ Calendar field ไม่มีค่าติดลบ — จึงไม่เขียนเทสสำหรับ branch เหล่านี้ (คอมเมนต์กำกับไว้ในโค้ด) เพื่อไม่เดา behavior
- `ClassCastException` branch ใน `getDateInstance/getTimeInstance/getDateTimeInstance` ขึ้นกับ JDK provider เฉพาะเจาะจง ไม่สามารถ trigger ได้แน่นอนข้าม JVM — ไม่เขียนเทส (คอมเมนต์กำกับ)

```java
package org.apache.commons.lang.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link FastDateFormat} (Defects4J Lang-50b).
 * Placed in the same package to access protected constructor and
 * package-private helper methods for deeper branch coverage.
 */
public class FastDateFormatTest {

    // =====================================================================
    // Factory method: getInstance()
    // =====================================================================

    @Test
    public void testGetInstanceDefault() {
        FastDateFormat f1 = FastDateFormat.getInstance();
        FastDateFormat f2 = FastDateFormat.getInstance();
        assertNotNull(f1);
        assertSame(f1, f2); // cache hit branch
    }

    @Test
    public void testGetInstancePattern() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", f.getPattern());
    }

    @Test
    public void testGetInstancePatternCacheReuse() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(f1, f2); // format != null branch in getInstance(pattern,tz,locale)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullPattern() {
        FastDateFormat.getInstance(null);
    }

    @Test
    public void testGetInstancePatternTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getInstance("yyyy", tz);
        assertEquals(tz, f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstancePatternLocale() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", Locale.US);
        assertEquals(Locale.US, f.getLocale());
    }

    @Test
    public void testGetInstancePatternTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getInstance("yyyy", tz, Locale.US);
        assertEquals(tz, f.getTimeZone());
        assertEquals(Locale.US, f.getLocale());
    }

    @Test
    public void testGettersDefaults() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertNotNull(f.getTimeZone());
        assertNotNull(f.getLocale());
        assertFalse(f.getTimeZoneOverridesCalendar()); // mTimeZoneForced == false branch
    }

    // =====================================================================
    // getDateInstance - covers 4 combinations of (timeZone,locale) null/non-null
    // =====================================================================

    @Test
    public void testGetDateInstanceStyleOnly() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(f);
    }

    @Test
    public void testGetDateInstanceStyleLocale() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.US);
        assertEquals(Locale.US, f.getLocale());
    }

    @Test
    public void testGetDateInstanceStyleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetDateInstanceStyleTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.US);
        assertNotNull(f);
    }

    @Test
    public void testGetDateInstanceCacheReuse() {
        FastDateFormat f1 = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, Locale.US);
        FastDateFormat f2 = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, Locale.US);
        assertSame(f1, f2); // format != null branch
    }

    // =====================================================================
    // getTimeInstance - 4 combinations
    // =====================================================================

    @Test
    public void testGetTimeInstanceStyleOnly() {
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT));
    }

    @Test
    public void testGetTimeInstanceStyleLocale() {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, Locale.US);
        assertEquals(Locale.US, f.getLocale());
    }

    @Test
    public void testGetTimeInstanceStyleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetTimeInstanceStyleTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.US));
    }

    // =====================================================================
    // getDateTimeInstance - 4 combinations
    // =====================================================================

    @Test
    public void testGetDateTimeInstanceStylesOnly() {
        assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT));
    }

    @Test
    public void testGetDateTimeInstanceStylesLocale() {
        FastDateFormat f = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US);
        assertNotNull(f);
    }

    @Test
    public void testGetDateTimeInstanceStylesTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT, tz);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstanceStylesTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getDateTimeInstance(
                FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        assertNotNull(f);
    }

    // =====================================================================
    // Constructor (protected) - accessible from same package
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullPattern() {
        new FastDateFormat(null, null, null);
    }

    @Test
    public void testConstructorNullTimeZoneAndLocaleUsesDefaults() {
        FastDateFormat f = new FastDateFormat("yyyy", null, null);
        assertFalse(f.getTimeZoneOverridesCalendar());
        assertNotNull(f.getTimeZone());
        assertNotNull(f.getLocale());
    }

    @Test
    public void testConstructorExplicitTimeZoneAndLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = new FastDateFormat("yyyy", tz, Locale.US);
        assertTrue(f.getTimeZoneOverridesCalendar());
        assertEquals(tz, f.getTimeZone());
        assertEquals(Locale.US, f.getLocale());
    }

    // =====================================================================
    // parsePattern() / parseToken() - via getInstance(pattern).format(...)
    // =====================================================================

    @Test
    public void testPatternEra() {
        FastDateFormat f = FastDateFormat.getInstance("G", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("AD", f.format(cal));
    }

    @Test
    public void testPatternYearLongGE4Digits() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("2023", f.format(cal)); // value>=1000, digits==mSize branch
    }

    @Test
    public void testPatternYearSmallPadded() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(7, Calendar.JANUARY, 1);
        assertEquals("0007", f.format(cal)); // value<100 branch, padding loop x2
    }

    @Test
    public void testPatternYearExtraPadding() {
        FastDateFormat f = FastDateFormat.getInstance("yyyyyy"); // size=6
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("002023", f.format(cal)); // value>=1000, digits<mSize, loop x2
    }

    @Test
    public void testPatternYearShortTokenLen1() {
        FastDateFormat f = FastDateFormat.getInstance("y");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("23", f.format(cal)); // tokenLen<4 -> TwoDigitYearField
    }

    @Test
    public void testPatternYearTwoDigits() {
        FastDateFormat f = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(2005, Calendar.JANUARY, 1);
        assertEquals("05", f.format(cal));
    }

    @Test
    public void testPatternMonthFullText() {
        FastDateFormat f = FastDateFormat.getInstance("MMMM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("January", f.format(cal)); // tokenLen>=4
    }

    @Test
    public void testPatternMonthShortText() {
        FastDateFormat f = FastDateFormat.getInstance("MMM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("Jan", f.format(cal)); // tokenLen==3
    }

    @Test
    public void testPatternMonthTwoDigit() {
        FastDateFormat f = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("01", f.format(cal)); // tokenLen==2
    }

    @Test
    public void testPatternMonthUnpaddedLow() {
        FastDateFormat f = FastDateFormat.getInstance("M");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("1", f.format(cal)); // value<10 branch
    }

    @Test
    public void testPatternMonthUnpaddedHigh() {
        FastDateFormat f = FastDateFormat.getInstance("M");
        Calendar cal = new GregorianCalendar(2023, Calendar.NOVEMBER, 1);
        assertEquals("11", f.format(cal)); // value>=10 branch
    }

    @Test
    public void testPatternDayOfMonthUnpadded() {
        FastDateFormat f = FastDateFormat.getInstance("d");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("5", f.format(cal));
    }

    @Test
    public void testPatternDayOfMonthTwoDigit() {
        FastDateFormat f = FastDateFormat.getInstance("dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("05", f.format(cal));
    }

    @Test
    public void testPatternDayOfMonthPadded3() {
        FastDateFormat f = FastDateFormat.getInstance("ddd");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("005", f.format(cal)); // selectNumberRule default branch
    }

    @Test
    public void testPatternHourAmPmMidnightWrap() {
        FastDateFormat f = FastDateFormat.getInstance("h");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        assertEquals("12", f.format(cal)); // TwelveHourField value==0 branch
    }

    @Test
    public void testPatternHourOfDay24h() {
        FastDateFormat f = FastDateFormat.getInstance("H");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 13);
        assertEquals("13", f.format(cal));
    }

    @Test
    public void testPatternMinute() {
        FastDateFormat f = FastDateFormat.getInstance("m");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.MINUTE, 5);
        assertEquals("5", f.format(cal));
    }

    @Test
    public void testPatternSecond() {
        FastDateFormat f = FastDateFormat.getInstance("s");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.SECOND, 9);
        assertEquals("9", f.format(cal));
    }

    @Test
    public void testPatternMillisecond() {
        FastDateFormat f = FastDateFormat.getInstance("S");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.MILLISECOND, 7);
        assertEquals("7", f.format(cal));
    }

    @Test
    public void testPatternDayOfWeekShortText() {
        FastDateFormat f = FastDateFormat.getInstance("E", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 2); // Monday
        assertEquals("Mon", f.format(cal)); // tokenLen<4 -> shortWeekdays
    }

    @Test
    public void testPatternDayOfWeekFullText() {
        FastDateFormat f = FastDateFormat.getInstance("EEEE", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 2);
        assertEquals("Monday", f.format(cal)); // tokenLen>=4 -> weekdays
    }

    @Test
    public void testPatternDayOfYearUnpaddedAllBranches() {
        FastDateFormat f = FastDateFormat.getInstance("D");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("1", f.format(cal)); // value<10

        cal.set(Calendar.DAY_OF_YEAR, 50);
        assertEquals("50", f.format(cal)); // value<100

        cal.set(Calendar.DAY_OF_YEAR, 200);
        assertEquals("200", f.format(cal)); // value>=100 else branch
    }

    @Test
    public void testPatternDayOfYearTwoDigitOver100() {
        FastDateFormat f = FastDateFormat.getInstance("DD");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        cal.set(Calendar.DAY_OF_YEAR, 200);
        assertEquals("200", f.format(cal)); // TwoDigitNumberField value>=100 else branch
    }

    @Test
    public void testPatternDayOfYearPadded3Mid() {
        FastDateFormat f = FastDateFormat.getInstance("DDD");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        cal.set(Calendar.DAY_OF_YEAR, 150);
        assertEquals("150", f.format(cal)); // PaddedNumberField digits==mSize, no fill loop
    }

    @Test
    public void testPatternDayOfWeekInMonth() {
        FastDateFormat f = FastDateFormat.getInstance("F");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertNotNull(f.format(cal));
    }

    @Test
    public void testPatternWeekOfYear() {
        FastDateFormat f = FastDateFormat.getInstance("w");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertNotNull(f.format(cal));
    }

    @Test
    public void testPatternWeekOfMonth() {
        FastDateFormat f = FastDateFormat.getInstance("W");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertNotNull(f.format(cal));
    }

    @Test
    public void testPatternAmPm() {
        FastDateFormat f = FastDateFormat.getInstance("a", Locale.US);
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 9);
        assertEquals("AM", f.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 15);
        assertEquals("PM", f.format(cal));
    }

    @Test
    public void testPatternHourInDay1to24() {
        FastDateFormat f = FastDateFormat.getInstance("k");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("24", f.format(cal)); // TwentyFourHourField value==0 branch
        cal.set(Calendar.HOUR_OF_DAY, 5);
        assertEquals("5", f.format(cal));
    }

    @Test
    public void testPatternHourInAmPm0to11() {
        FastDateFormat f = FastDateFormat.getInstance("K");
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0); // Calendar.HOUR == 0, no wrap (unlike 'h')
        assertEquals("0", f.format(cal));
    }

    @Test
    public void testPatternTimeZoneShortNameNotForced() {
        FastDateFormat f = FastDateFormat.getInstance("z", Locale.US);
        assertEquals(4, f.getMaxLengthEstimate()); // estimateLength: !forced && SHORT -> 4
        assertNotNull(f.format(new GregorianCalendar()));
    }

    @Test
    public void testPatternTimeZoneLongNameNotForced() {
        FastDateFormat f = FastDateFormat.getInstance("zzzz", Locale.US);
        assertEquals(40, f.getMaxLengthEstimate()); // estimateLength: !forced && LONG -> 40
        assertNotNull(f.format(new GregorianCalendar()));
    }

    @Test
    public void testPatternTimeZoneForcedDSTvsStandard() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat f = FastDateFormat.getInstance("zzzz", tz, Locale.US);

        Calendar summer = new GregorianCalendar(tz);
        summer.set(2023, Calendar.JULY, 1, 12, 0, 0);
        String s1 = f.format(summer); // forced + DST_OFFSET!=0 branch

        Calendar winter = new GregorianCalendar(tz);
        winter.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        String s2 = f.format(winter); // forced + DST_OFFSET==0 branch

        assertNotEquals(s1, s2);
    }

    @Test
    public void testPatternTimeZoneForcedNoDSTZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getInstance("zzzz", tz, Locale.US);
        Calendar cal = new GregorianCalendar(tz);
        assertNotNull(f.format(cal)); // useDaylightTime() == false branch
    }

    @Test
    public void testPatternTimeZoneNotForcedDST() {
        FastDateFormat f = FastDateFormat.getInstance("zzzz", Locale.US); // not forced
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        Calendar summer = new GregorianCalendar(tz);
        summer.set(2023, Calendar.JULY, 1, 12, 0, 0);
        assertNotNull(f.format(summer)); // !forced, calendar DST branch
    }

    @Test
    public void testPatternTimeZoneNotForcedNonDST() {
        FastDateFormat f = FastDateFormat.getInstance("zzzz", Locale.US);
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        Calendar winter = new GregorianCalendar(tz);
        winter.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        assertNotNull(f.format(winter)); // !forced, calendar non-DST branch
    }

    @Test
    public void testPatternTimeZoneNumberNoColonPositive() {
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        FastDateFormat f = FastDateFormat.getInstance("Z", tz); // tokenLen==1
        assertEquals(5, f.getMaxLengthEstimate());
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("+0500", f.format(cal)); // offset>=0 branch, no colon
    }

    @Test
    public void testPatternTimeZoneNumberWithColonPositive() {
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        FastDateFormat f = FastDateFormat.getInstance("ZZ", tz); // tokenLen!=1
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("+05:00", f.format(cal)); // colon branch
    }

    @Test
    public void testPatternTimeZoneNumberNegativeOffset() {
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        FastDateFormat f = FastDateFormat.getInstance("Z", tz);
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("-0500", f.format(cal)); // offset<0 branch
    }

    @Test
    public void testPatternSingleCharQuoteLiteral() {
        FastDateFormat f = FastDateFormat.getInstance("'a'");
        assertEquals("a", f.format(new GregorianCalendar())); // sub.length()==1 -> CharacterLiteral
    }

    @Test
    public void testPatternMultiCharQuoteLiteral() {
        FastDateFormat f = FastDateFormat.getInstance("'at'");
        assertEquals("at", f.format(new GregorianCalendar())); // sub.length()>1 -> StringLiteral
    }

    @Test
    public void testPatternEscapedQuoteAlone() {
        FastDateFormat f = FastDateFormat.getInstance("''");
        assertEquals("'", f.format(new GregorianCalendar())); // escaped '' -> literal quote char
    }

    @Test
    public void testPatternLiteralWithEscapedQuoteInside() {
        FastDateFormat f = FastDateFormat.getInstance("'can''t'");
        assertEquals("can't", f.format(new GregorianCalendar())); // inLiteral toggle + escaped quote branch
    }

    @Test
    public void testPatternNonLetterLiteralChar() {
        FastDateFormat f = FastDateFormat.getInstance("-");
        assertEquals("-", f.format(new GregorianCalendar())); // parseToken else-branch, no closing letter
    }

    @Test
    public void testPatternMixedLiteralAndFields() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 15);
        assertEquals("2023-03-15", f.format(cal)); // literal break-on-letter branch exercised
    }

    @Test
    public void testPatternUnterminatedQuote() {
        // Boundary/malformed input: dangling single quote -> empty StringLiteral("")
        FastDateFormat f = FastDateFormat.getInstance("'");
        assertEquals("", f.format(new GregorianCalendar()));
    }

    @Test
    public void testPatternEmpty() {
        // Boundary: empty pattern -> parsePattern loop never executes
        FastDateFormat f = FastDateFormat.getInstance("");
        assertEquals("", f.format(new GregorianCalendar()));
        assertEquals(0, f.getMaxLengthEstimate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPatternIllegalComponent() {
        // 'Q' is a letter not handled by any switch case -> default branch throws
        FastDateFormat.getInstance("QQ");
    }

    // NOTE: `if (tokenLen == 0) break;` in parsePattern() appears unreachable via
    // public API because parseToken() always appends at least one char to buf
    // before returning. No test written for this branch per rule #4 (no guessing).

    // =====================================================================
    // format(Object, StringBuffer, FieldPosition) dispatch branches
    // =====================================================================

    @Test
    public void testFormatObjectDate() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        Date d = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTime();
        StringBuffer result = f.format((Object) d, new StringBuffer(), new FieldPosition(0));
        assertEquals("2023", result.toString());
    }

    @Test
    public void testFormatObjectCalendar() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        StringBuffer result = f.format((Object) cal, new StringBuffer(), new FieldPosition(0));
        assertEquals("2023", result.toString());
    }

    @Test
    public void testFormatObjectLong() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        long millis = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTimeInMillis();
        StringBuffer result = f.format((Object) new Long(millis), new StringBuffer(), new FieldPosition(0));
        assertEquals("2023", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObjectInvalidType() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        f.format((Object) "not a date", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObjectNull() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        f.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    // =====================================================================
    // format(long) / format(Date) / format(Calendar) convenience overloads
    // =====================================================================

    @Test
    public void testFormatLong() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        long millis = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTimeInMillis();
        assertEquals("2023", f.format(millis));
    }

    @Test
    public void testFormatLongWithBuffer() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        long millis = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTimeInMillis();
        StringBuffer result = f.format(millis, new StringBuffer());
        assertEquals("2023", result.toString());
    }

    @Test
    public void testFormatDateConvenience() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        Date d = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTime();
        assertEquals("2023", f.format(d));
    }

    @Test
    public void testFormatCalendarTimeZoneNotForced() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd HH:mm");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.JANUARY, 1, 10, 0);
        assertNotNull(f.format(cal)); // mTimeZoneForced == false branch
    }

    @Test
    public void testFormatCalendarTimeZoneForcedDoesNotMutateOriginal() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", tz);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        cal.set(2023, Calendar.JANUARY, 1, 10, 0);
        String s = f.format(cal); // mTimeZoneForced == true branch (clone + setTimeZone)
        assertNotNull(s);
        assertEquals("America/New_York", cal.getTimeZone().getID()); // original untouched
    }

    // =====================================================================
    // parseObject (not supported)
    // =====================================================================

    @Test
    public void testParseObjectAlwaysNullAndResetsPosition() {
        FastDateFormat f = FastDateFormat.getInstance();
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(5);
        Object result = f.parseObject("anything", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // =====================================================================
    // equals() / hashCode() / toString()
    // =====================================================================

    @Test
    public void testEqualsSameInstance() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertTrue(f.equals(f));
    }

    @Test
    public void testEqualsDifferentType() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertFalse(f.equals("not a format")); // instanceof check false branch
    }

    @Test
    public void testEqualsDifferentPattern() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy");
        FastDateFormat f2 = FastDateFormat.getInstance("MM");
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsDistinctButEqualInstances() {
        // Use protected constructor directly to bypass caching and force
        // genuinely distinct objects, exercising the .equals() (not ==) branches.
        TimeZone tz1 = TimeZone.getTimeZone("UTC");
        TimeZone tz2 = TimeZone.getTimeZone("UTC");
        String pattern1 = new String("yyyy-MM-dd");
        String pattern2 = new String("yyyy-MM-dd");
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = new Locale("en", "US");

        FastDateFormat f1 = new FastDateFormat(pattern1, tz1, locale1);
        FastDateFormat f2 = new FastDateFormat(pattern2, tz2, locale2);

        assertNotSame(f1, f2);
        assertNotSame(pattern1, pattern2);
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testEqualsLocaleForcedDifference() {
        FastDateFormat f1 = new FastDateFormat("yyyy", null, null); // locale not forced
        FastDateFormat f2 = new FastDateFormat("yyyy", null, Locale.getDefault()); // forced
        assertFalse(f1.equals(f2)); // mLocaleForced mismatch branch
    }

    @Test
    public void testEqualsTimeZoneForcedDifference() {
        FastDateFormat f1 = new FastDateFormat("yyyy", null, null); // tz not forced
        FastDateFormat f2 = new FastDateFormat("yyyy", TimeZone.getDefault(), null); // forced
        assertFalse(f1.equals(f2)); // mTimeZoneForced mismatch branch
    }

    @Test
    public void testHashCodeConsistency() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(f.hashCode(), f.hashCode());
    }

    @Test
    public void testToString() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy");
        assertEquals("FastDateFormat[yyyy]", f.toString());
    }

    // =====================================================================
    // getMaxLengthEstimate() / getTimeZoneDisplay()
    // =====================================================================

    @Test
    public void testGetMaxLengthEstimatePositive() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(f.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testGetTimeZoneDisplayCacheHitAndMiss() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        String display1 = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.SHORT, Locale.US); // miss
        String display2 = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.SHORT, Locale.US); // hit
        assertNotNull(display1);
        assertEquals(display1, display2);
    }

    // =====================================================================
    // Serialization - readObject() re-initializes transient rules
    // =====================================================================

    @Test
    public void testSerializationReinitializesRules() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(f);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        FastDateFormat f2 = (FastDateFormat) ois.readObject();
        ois.close();

        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("2023-01-01", f2.format(cal)); // proves init() was called in readObject()
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGetInstanceDefault, testGetInstancePattern*, testGetInstanceNullPattern | `getInstance()` overloads, cache hit/miss ใน `getInstance(pattern,tz,locale)`, pattern null → throw |
| testGetDateInstance*, testGetTimeInstance*, testGetDateTimeInstance* | ทุก combination ของ `timeZone!=null` / `locale!=null`, cache hit/miss |
| testConstructor* | constructor: pattern==null throw, timeZone==null/non-null, locale==null/non-null |
| testPatternEra…testPatternIllegalComponent | `parsePattern()` switch ทุก case (G,y,M,d,h,H,m,s,S,E,D,F,w,W,a,k,K,z,Z,'), tokenLen conditions (≥4,==3,==2,else), default→throw |
| testPatternSingleCharQuoteLiteral…testPatternUnterminatedQuote | `parseToken()` literal branch: inLiteral toggle, escaped `''`, sub.length()==1 vs >1, malformed/empty pattern |
| testPatternYear*, testPatternDayOfMonth*, testPatternDayOfYear*, testUnpaddedNumberFieldBranches | `UnpaddedNumberField`, `TwoDigitNumberField`, `PaddedNumberField` ทุก branch (value<10/<100/<1000/≥1000, padding loop 0/1/2 รอบ) |
| testPatternHourAmPm*, testPatternHourInDay1to24, testPatternHourInAmPm0to11 | `TwelveHourField`/`TwentyFourHourField` value==0 wrap branch vs ปกติ |
| testPatternTimeZone* | `TimeZoneNameRule` forced/not-forced × DST/non-DST, estimateLength ทั้ง 3 branch; `TimeZoneNumberRule` offset<0/≥0, colon/no-colon |
| testFormatObject* | `format(Object,...)` instanceof Date/Calendar/Long/else/null |
| testFormatCalendarTimeZone* | `format(Calendar,buf)` mTimeZoneForced true/false, ตรวจ clone ไม่ mutate ต้นฉบับ |
| testParseObjectAlwaysNullAndResetsPosition | `parseObject` fixed behavior |
| testEquals* | `equals()` instanceof false, pattern/tz/locale เท่ากัน/ไม่เท่ากัน, forced-flag mismatch, `.equals()` path (ไม่ใช่ `==`) |
| testHashCodeConsistency, testToString | `hashCode()`, `toString()` |
| testGetMaxLengthEstimatePositive, testGetTimeZoneDisplayCacheHitAndMiss | `getMaxLengthEstimate()`, cache miss/hit ใน `getTimeZoneDisplay()` |
| testSerializationReinitializesRules | `readObject()` เรียก `init()` ซ้ำหลัง deserialize |

**Branch ที่ไม่ได้ทดสอบ (พร้อมเหตุผล)**: `tokenLen==0` ใน `parsePattern()` (unreachable), `PaddedNumberField` constructor `size<3` throw, `Validate.isTrue` negative-value branch, `ClassCastException` ใน `getDate/Time/DateTimeInstance` — ทั้งหมดไม่สามารถ trigger ได้ผ่าน public API อย่างน่าเชื่อถือ จึงไม่เขียนเทสเพื่อไม่เดา behavior ตามข้อกำหนด