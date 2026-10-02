# FastDatePrinterTest.java

**หมายเหตุสำคัญก่อนโค้ด:**
- `FastDatePrinter` มี constructor เป็น `protected` และมี inner class ที่เป็น `private` ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`org.apache.commons.lang3.time`) เพื่อเข้าถึง constructor ได้โดยตรงตามที่ JLS อนุญาต (protected เข้าถึงได้จาก same package)
- มีบางบรานช์ที่ **ไม่สามารถทดสอบผ่าน public API ได้จริง** เนื่องจากข้อจำกัดของ field values เช่น `TwoDigitNumberField` branch `value>=100` (field ที่ใช้ TwoDigitNumberField เช่น `dd`,`HH`,`mm`,`ss` มีค่าสูงสุด < 100 เสมอ) และ `if (tokenLen == 0) break;` ใน `parsePattern()` (ไม่สามารถเกิดขึ้นได้จาก `parseToken()` ตามที่วิเคราะห์) — จะใส่คอมเมนต์กำกับไว้ ไม่เดา behavior

```java
package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDatePrinterTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Locale US = Locale.US;

    // ---------- helpers ----------

    private FastDatePrinter newPrinter(String pattern) {
        return new FastDatePrinter(pattern, GMT, US);
    }

    private FastDatePrinter newPrinter(String pattern, TimeZone tz) {
        return new FastDatePrinter(pattern, tz, US);
    }

    private FastDatePrinter newPrinter(String pattern, TimeZone tz, Locale locale) {
        return new FastDatePrinter(pattern, tz, locale);
    }

    /** base calendar: 2021-01-01 00:00:00.000 GMT */
    private Calendar baseCalendar() {
        Calendar cal = new GregorianCalendar(GMT, US);
        cal.clear();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal;
    }

    // =========================================================
    // Constructor / null handling (boundary & null inputs)
    // =========================================================

    @Test(expected = NullPointerException.class)
    public void testNullPatternThrowsNPE() {
        new FastDatePrinter(null, GMT, US);
    }

    @Test(expected = NullPointerException.class)
    public void testNullLocaleThrowsNPE() {
        // DateFormatSymbols(null) is invoked inside parsePattern() during construction
        new FastDatePrinter("yyyy", GMT, null);
    }

    @Test(expected = NullPointerException.class)
    public void testNullTimeZoneWithZPatternThrowsNPEAtConstruction() {
        // 'z' pattern builds TimeZoneNameRule which calls timeZone.getDisplayName() immediately
        new FastDatePrinter("z", null, US);
    }

    @Test(expected = NullPointerException.class)
    public void testNullTimeZoneWithoutZPatternThrowsNPEAtFormat() {
        FastDatePrinter fdp = new FastDatePrinter("yyyy", null, US);
        fdp.format(new Date()); // GregorianCalendar(null, locale) -> NPE
    }

    @Test
    public void testEmptyPatternProducesEmptyOutput() {
        FastDatePrinter fdp = newPrinter("");
        assertEquals("", fdp.format(new Date()));
        assertEquals(0, fdp.getMaxLengthEstimate());
    }

    // =========================================================
    // parseToken() direct tests (letter-run & literal scanning)
    // =========================================================

    @Test
    public void testParseTokenLetterRunDifferentChars() {
        FastDatePrinter fdp = newPrinter("yyyy");
        int[] idx = {0};
        String token = fdp.parseToken("abc", idx);
        assertEquals("a", token);
        assertEquals(0, idx[0]); // stops immediately, no run match
    }

    @Test
    public void testParseTokenLetterRunSameChars() {
        FastDatePrinter fdp = newPrinter("yyyy");
        int[] idx = {0};
        String token = fdp.parseToken("aaaa", idx);
        assertEquals("aaaa", token);
        assertEquals(3, idx[0]);
    }

    @Test
    public void testParseTokenDoubleQuoteEscaped() {
        FastDatePrinter fdp = newPrinter("yyyy");
        int[] idx = {0};
        String token = fdp.parseToken("''", idx);
        assertEquals("''", token); // sub = "'" -> CharacterLiteral
        assertEquals(1, idx[0]);
    }

    @Test
    public void testParseTokenUnterminatedLiteral() {
        FastDatePrinter fdp = newPrinter("yyyy");
        int[] idx = {0};
        String token = fdp.parseToken("'abc", idx);
        assertEquals("'abc", token); // no closing quote, still consumes to end
        assertEquals(3, idx[0]);
    }

    // =========================================================
    // parsePattern(): literal branches
    // =========================================================

    @Test
    public void testLiteralDoubleQuoteProducesSingleQuoteChar() {
        FastDatePrinter fdp = newPrinter("''");
        assertEquals("'", fdp.format(new Date()));
    }

    @Test
    public void testLiteralSingleCharacterLiteral() {
        FastDatePrinter fdp = newPrinter("'T'");
        assertEquals("T", fdp.format(new Date()));
    }

    @Test
    public void testLiteralMultiCharStringLiteral() {
        FastDatePrinter fdp = newPrinter("'ab'");
        assertEquals("ab", fdp.format(new Date()));
    }

    @Test
    public void testLiteralEscapedQuoteInsideStringLiteral() {
        FastDatePrinter fdp = newPrinter("'a''b'");
        assertEquals("a'b", fdp.format(new Date()));
    }

    @Test
    public void testLiteralUnterminatedQuoteStillFormats() {
        // Behavior per source: no validation of matching quotes (not necessarily "correct", documented as-is)
        FastDatePrinter fdp = newPrinter("'abc");
        assertEquals("abc", fdp.format(new Date()));
    }

    @Test
    public void testSeparatorCharacterBreaksLetterRun() {
        // '-' triggers literal branch, then letter 'y' breaks it out correctly
        FastDatePrinter fdp = newPrinter("yyyy-MM-dd");
        Calendar cal = baseCalendar();
        assertEquals("2021-01-01", fdp.format(cal.getTime()));
    }

    @Test
    public void testIllegalPatternCharacterThrowsIllegalArgumentException() {
        try {
            newPrinter("qqqq");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Illegal pattern component"));
        }
    }

    // =========================================================
    // 'G' era
    // =========================================================

    @Test
    public void testEraField() {
        FastDatePrinter fdp = newPrinter("G");
        assertEquals("AD", fdp.format(baseCalendar().getTime()));
    }

    // =========================================================
    // 'y' year branches: tokenLen==2, tokenLen<4, tokenLen>=4
    // =========================================================

    @Test
    public void testYearTwoDigit_normal() {
        FastDatePrinter fdp = newPrinter("yy");
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 2021);
        assertEquals("21", fdp.format(cal.getTime()));
    }

    @Test
    public void testYearTwoDigit_leadingZeroBoundary() {
        FastDatePrinter fdp = newPrinter("yy");
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 2005);
        assertEquals("05", fdp.format(cal.getTime()));
    }

    @Test
    public void testYearTokenLenOne_paddedToFour_smallValue() {
        // tokenLen=1 -> padding forced to 4; value<100 branch of PaddedNumberField
        FastDatePrinter fdp = newPrinter("y");
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 7);
        assertEquals("0007", fdp.format(cal.getTime()));
    }

    @Test
    public void testYearFourDigits_exactMatch_noLeadingZero() {
        FastDatePrinter fdp = newPrinter("yyyy");
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 2021);
        assertEquals("2021", fdp.format(cal.getTime())); // PaddedNumberField value>=1000 branch, digits==size
    }

    @Test
    public void testYearFourDigits_midRangeValue_digitsEqualsThree() {
        FastDatePrinter fdp = newPrinter("yyyy");
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 500);
        assertEquals("0500", fdp.format(cal.getTime())); // value<1000 branch, digits=3
    }

    @Test
    public void testYearFiveDigits_extraPaddingBeyondDigitsLength() {
        FastDatePrinter fdp = newPrinter("yyyyy"); // tokenLen>=4 => padding = tokenLen (5)
        Calendar cal = baseCalendar();
        cal.set(Calendar.YEAR, 2021);
        assertEquals("02021", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'M' month branches: >=4 text, ==3 short text, ==2 two-digit, else unpadded
    // =========================================================

    @Test
    public void testMonthFullText() {
        FastDatePrinter fdp = newPrinter("MMMM");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("January", fdp.format(cal.getTime()));
    }

    @Test
    public void testMonthShortText() {
        FastDatePrinter fdp = newPrinter("MMM");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("Jan", fdp.format(cal.getTime()));
    }

    @Test
    public void testMonthTwoDigit_singleDigitValue() {
        FastDatePrinter fdp = newPrinter("MM");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.JANUARY); // 1
        assertEquals("01", fdp.format(cal.getTime()));
    }

    @Test
    public void testMonthTwoDigit_doubleDigitValue() {
        FastDatePrinter fdp = newPrinter("MM");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.DECEMBER); // 12
        assertEquals("12", fdp.format(cal.getTime()));
    }

    @Test
    public void testMonthUnpadded_singleDigit() {
        FastDatePrinter fdp = newPrinter("M");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("1", fdp.format(cal.getTime()));
    }

    @Test
    public void testMonthUnpadded_doubleDigit() {
        FastDatePrinter fdp = newPrinter("M");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        assertEquals("12", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'd' day of month - selectNumberRule default path
    // =========================================================

    @Test
    public void testDayOfMonthTwoDigit() {
        FastDatePrinter fdp = newPrinter("dd");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_MONTH, 5);
        assertEquals("05", fdp.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, 25);
        assertEquals("25", fdp.format(cal.getTime()));
        // NOTE: TwoDigitNumberField's value>=100 branch is unreachable via DAY_OF_MONTH
        // (max value 31) -- cannot be tested through public API without reflection.
    }

    // =========================================================
    // UnpaddedNumberField branches via 'D' (DAY_OF_YEAR, padding=1)
    // =========================================================

    @Test
    public void testDayOfYearUnpadded_lessThan10() {
        FastDatePrinter fdp = newPrinter("D");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_YEAR, 5);
        assertEquals("5", fdp.format(cal.getTime()));
    }

    @Test
    public void testDayOfYearUnpadded_lessThan100() {
        FastDatePrinter fdp = newPrinter("D");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_YEAR, 50);
        assertEquals("50", fdp.format(cal.getTime()));
    }

    @Test
    public void testDayOfYearUnpadded_greaterOrEqual100() {
        FastDatePrinter fdp = newPrinter("D");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_YEAR, 200);
        assertEquals("200", fdp.format(cal.getTime()));
    }

    // =========================================================
    // PaddedNumberField branches via 'DDD' (padding=3)
    // =========================================================

    @Test
    public void testDayOfYearPadded_lessThan100() {
        FastDatePrinter fdp = newPrinter("DDD");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_YEAR, 5);
        assertEquals("005", fdp.format(cal.getTime()));
    }

    @Test
    public void testDayOfYearPadded_between100And999() {
        FastDatePrinter fdp = newPrinter("DDD");
        Calendar cal = baseCalendar();
        cal.set(Calendar.DAY_OF_YEAR, 150);
        assertEquals("150", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'h' TwelveHourField (value==0 -> replaced branch)
    // =========================================================

    @Test
    public void testTwelveHour_midnightBecomesTwelve() {
        FastDatePrinter fdp = newPrinter("h");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("12", fdp.format(cal.getTime()));
    }

    @Test
    public void testTwelveHour_nonZeroValue() {
        FastDatePrinter fdp = newPrinter("h");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 13); // HOUR = 1
        assertEquals("1", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'H' hour of day
    // =========================================================

    @Test
    public void testHourOfDay_boundaries() {
        FastDatePrinter fdp = newPrinter("H");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("0", fdp.format(cal.getTime()));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        assertEquals("23", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'm','s' minute/second
    // =========================================================

    @Test
    public void testMinuteAndSecond() {
        FastDatePrinter fdp = newPrinter("m-s");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MINUTE, 5);
        cal.set(Calendar.SECOND, 45);
        assertEquals("5-45", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'S' millisecond - padded 3
    // =========================================================

    @Test
    public void testMillisecondPadded() {
        FastDatePrinter fdp = newPrinter("SSS");
        Calendar cal = baseCalendar();
        cal.set(Calendar.MILLISECOND, 7);
        assertEquals("007", fdp.format(cal.getTime()));
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'E' weekday: tokenLen<4 short, else full
    // =========================================================

    @Test
    public void testWeekdayShortAndFull() {
        // 2021-01-01 is a Friday
        Calendar cal = baseCalendar();
        Date friday = cal.getTime();

        FastDatePrinter shortFdp = newPrinter("E");
        assertEquals("Fri", shortFdp.format(friday));

        FastDatePrinter fullFdp = newPrinter("EEEE");
        assertEquals("Friday", fullFdp.format(friday));
    }

    // =========================================================
    // 'a' am/pm
    // =========================================================

    @Test
    public void testAmPmMarker() {
        FastDatePrinter fdp = newPrinter("a");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("AM", fdp.format(cal.getTime()));
        cal.set(Calendar.HOUR_OF_DAY, 13);
        assertEquals("PM", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'k' TwentyFourHourField (value==0 -> replaced with 24)
    // =========================================================

    @Test
    public void testTwentyFourHour_midnightBecomes24() {
        FastDatePrinter fdp = newPrinter("k");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("24", fdp.format(cal.getTime()));
    }

    @Test
    public void testTwentyFourHour_nonZeroValue() {
        FastDatePrinter fdp = newPrinter("k");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 10);
        assertEquals("10", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'K' hour in am/pm (0..11) - plain selectNumberRule, no substitution
    // =========================================================

    @Test
    public void testHourInAmPm_K() {
        FastDatePrinter fdp = newPrinter("K");
        Calendar cal = baseCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("0", fdp.format(cal.getTime())); // no replacement unlike 'h'
        cal.set(Calendar.HOUR_OF_DAY, 11);
        assertEquals("11", fdp.format(cal.getTime()));
    }

    // =========================================================
    // 'w','W','F' - cross-checked against Calendar.get() values
    // (ไม่ set field เหล่านี้ตรง ๆ เพราะอาจเกิด ambiguous resolution ใน Calendar)
    // =========================================================

    @Test
    public void testWeekOfYear_WeekOfMonth_DayOfWeekInMonth() {
        Calendar cal = new GregorianCalendar(GMT, US);
        cal.clear();
        cal.set(2021, Calendar.JUNE, 15, 10, 30, 45);
        Date sample = cal.getTime();

        int expectedWeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        int expectedWeekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        int expectedDowInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);

        assertEquals(String.valueOf(expectedWeekOfYear), newPrinter("w").format(sample));
        assertEquals(String.valueOf(expectedWeekOfMonth), newPrinter("W").format(sample));
        assertEquals(String.valueOf(expectedDowInMonth), newPrinter("F").format(sample));
    }

    // =========================================================
    // 'z' time zone text - tokenLen>=4 long, else short + daylight/standard branch
    // =========================================================

    @Test
    public void testTimeZoneName_longVsShort_standardTime() {
        TimeZone ny = TimeZone.getTimeZone("America/New_York");
        Calendar cal = new GregorianCalendar(ny, US);
        cal.clear();
        cal.set(2021, Calendar.JANUARY, 1, 12, 0, 0); // winter -> standard time
        Date winter = cal.getTime();

        FastDatePrinter longFdp = newPrinter("zzzz", ny);
        FastDatePrinter shortFdp = newPrinter("z", ny);

        String longName = longFdp.format(winter);
        String shortName = shortFdp.format(winter);
        assertTrue(longName.toLowerCase().contains("standard"));
        assertNotEquals(longName, shortName);
    }

    @Test
    public void testTimeZoneName_daylightBranch() {
        TimeZone ny = TimeZone.getTimeZone("America/New_York");
        Calendar cal = new GregorianCalendar(ny, US);
        cal.clear();
        cal.set(2021, Calendar.JULY, 1, 12, 0, 0); // summer -> daylight time
        Date summer = cal.getTime();

        FastDatePrinter longFdp = newPrinter("zzzz", ny);
        String longName = longFdp.format(summer);
        assertTrue(longName.toLowerCase().contains("daylight"));
    }

    // =========================================================
    // 'Z' time zone number - tokenLen==1 no colon, else colon; offset sign branch
    // =========================================================

    @Test
    public void testTimeZoneNumber_positiveOffset_noColon() {
        TimeZone plus5 = TimeZone.getTimeZone("GMT+05:00");
        FastDatePrinter fdp = newPrinter("Z", plus5);
        assertEquals("+0500", fdp.format(new Date(0)));
    }

    @Test
    public void testTimeZoneNumber_positiveOffset_withColon() {
        TimeZone plus5 = TimeZone.getTimeZone("GMT+05:00");
        FastDatePrinter fdp = newPrinter("ZZ", plus5);
        assertEquals("+05:00", fdp.format(new Date(0)));
    }

    @Test
    public void testTimeZoneNumber_negativeOffset_noColon() {
        TimeZone minus5 = TimeZone.getTimeZone("GMT-05:00");
        FastDatePrinter fdp = newPrinter("Z", minus5);
        assertEquals("-0500", fdp.format(new Date(0)));
    }

    // =========================================================
    // format(Object, StringBuffer, FieldPosition) branches
    // =========================================================

    @Test
    public void testFormatObject_Date() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        fdp.format((Object) baseCalendar().getTime(), sb, new FieldPosition(0));
        assertEquals("2021", sb.toString());
    }

    @Test
    public void testFormatObject_Calendar() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        fdp.format((Object) baseCalendar(), sb, new FieldPosition(0));
        assertEquals("2021", sb.toString());
    }

    @Test
    public void testFormatObject_Long() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        Long millis = baseCalendar().getTimeInMillis();
        fdp.format((Object) millis, sb, new FieldPosition(0));
        assertEquals("2021", sb.toString());
    }

    @Test
    public void testFormatObject_UnsupportedType_throws() {
        FastDatePrinter fdp = newPrinter("yyyy");
        try {
            fdp.format((Object) "not-a-date", new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("String"));
        }
    }

    @Test
    public void testFormatObject_Null_throws() {
        FastDatePrinter fdp = newPrinter("yyyy");
        try {
            fdp.format((Object) null, new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("<null>"));
        }
    }

    // =========================================================
    // Other format(...) overloads
    // =========================================================

    @Test
    public void testFormatLong() {
        FastDatePrinter fdp = newPrinter("yyyy");
        long millis = baseCalendar().getTimeInMillis();
        assertEquals("2021", fdp.format(millis));
    }

    @Test
    public void testFormatDateWithBuffer() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fdp.format(baseCalendar().getTime(), sb);
        assertSame(sb, result);
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatLongWithBuffer() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        long millis = baseCalendar().getTimeInMillis();
        StringBuffer result = fdp.format(millis, sb);
        assertSame(sb, result);
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatCalendarWithBuffer() {
        FastDatePrinter fdp = newPrinter("yyyy");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fdp.format(baseCalendar(), sb);
        assertSame(sb, result);
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatCalendar_noBuffer() {
        FastDatePrinter fdp = newPrinter("yyyy");
        assertEquals("2021", fdp.format(baseCalendar()));
    }

    // =========================================================
    // Cross-check against SimpleDateFormat for a composite pattern
    // =========================================================

    @Test
    public void testCompositePatternMatchesSimpleDateFormat() {
        FastDatePrinter fdp = newPrinter("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", US);
        sdf.setTimeZone(GMT);

        Calendar cal = new GregorianCalendar(GMT, US);
        cal.clear();
        cal.set(2021, Calendar.JUNE, 15, 10, 30, 45);
        Date d = cal.getTime();

        assertEquals(sdf.format(d), fdp.format(d));
    }

    // =========================================================
    // Accessors
    // =========================================================

    @Test
    public void testGetters() {
        FastDatePrinter fdp = newPrinter("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", fdp.getPattern());
        assertEquals(GMT, fdp.getTimeZone());
        assertEquals(US, fdp.getLocale());
        assertTrue(fdp.getMaxLengthEstimate() > 0);
    }

    // =========================================================
    // equals() / hashCode()
    // =========================================================

    @Test
    public void testEquals_sameValues_true() {
        FastDatePrinter a = newPrinter("yyyy");
        FastDatePrinter b = newPrinter("yyyy");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEquals_differentPattern_false() {
        FastDatePrinter a = newPrinter("yyyy");
        FastDatePrinter b = newPrinter("MM");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentTimeZone_false() {
        FastDatePrinter a = newPrinter("yyyy", GMT);
        FastDatePrinter b = newPrinter("yyyy", TimeZone.getTimeZone("GMT+1:00"));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentLocale_false() {
        FastDatePrinter a = newPrinter("yyyy", GMT, US);
        FastDatePrinter b = newPrinter("yyyy", GMT, Locale.FRANCE);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_notInstanceOfFastDatePrinter_false() {
        FastDatePrinter a = newPrinter("yyyy");
        assertFalse(a.equals("not a printer"));
        assertFalse(a.equals(null));
    }

    // =========================================================
    // toString()
    // =========================================================

    @Test
    public void testToString() {
        FastDatePrinter fdp = newPrinter("yyyy");
        assertEquals("FastDatePrinter[yyyy,en_US,GMT]", fdp.toString());
    }

    // =========================================================
    // Serialization round-trip (readObject re-inits transient rules)
    // =========================================================

    @Test
    public void testSerializationRoundTrip() throws Exception {
        FastDatePrinter original = newPrinter("yyyy-MM-dd");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDatePrinter restored = (FastDatePrinter) ois.readObject();
        ois.close();

        assertEquals(original.getPattern(), restored.getPattern());
        assertEquals("2021-01-01", restored.format(baseCalendar().getTime()));
    }
}
```

---

## สรุปตารางความครอบคลุม Branch/Condition

| กลุ่มเทส (เมธอด) | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testNullPatternThrowsNPE` | Constructor → `mPattern.length()` NPE เมื่อ pattern null |
| `testNullLocaleThrowsNPE` | `new DateFormatSymbols(mLocale)` NPE เมื่อ locale null |
| `testNullTimeZoneWithZPatternThrowsNPEAtConstruction` | `TimeZoneNameRule` constructor เรียก `tz.getDisplayName()` กับ tz null |
| `testNullTimeZoneWithoutZPatternThrowsNPEAtFormat` | `new GregorianCalendar(null, locale)` ตอน `format()` |
| `testEmptyPatternProducesEmptyOutput` | boundary: `mPattern=""`, mRules ว่าง |
| `testParseToken*` (4 เมธอด) | `parseToken()`: letter-run match/mismatch, escaped quote `''`, unterminated literal |
| `testLiteral*` (5 เมธอด) | `parsePattern()` case `'\''`: `sub.length()==1` vs `>1`, escaped quote ซ้อน, unterminated quote |
| `testSeparatorCharacterBreaksLetterRun` | literal-branch `else if(!inLiteral && letter) {i--; break;}` |
| `testIllegalPatternCharacterThrowsIllegalArgumentException` | `default:` case ของ switch ใน `parsePattern()` |
| `testEraField` | case `'G'` |
| `testYear*` (6 เมธอด) | case `'y'`: tokenLen==2, tokenLen<4→4, tokenLen>=4; `PaddedNumberField` ทุกบรานช์ (<100, <1000, >=1000, digits<size) |
| `testMonth*` (6 เมธอด) | case `'M'`: tokenLen>=4, ==3, ==2, else; `UnpaddedMonthField` <10/>=10 |
| `testDayOfMonthTwoDigit` | case `'d'`, `TwoDigitNumberField` value<100 (>=100 unreachable - คอมเมนต์ไว้) |
| `testDayOfYearUnpadded*` (3 เมธอด) | `UnpaddedNumberField`: value<10, <100, >=100 |
| `testDayOfYearPadded*` (2 เมธอด) | `PaddedNumberField`: value<100, 100≤value<1000 |
| `testTwelveHour*` (2 เมธอด) | `TwelveHourField`: value==0 (replace) vs !=0 |
| `testHourOfDay_boundaries` | case `'H'` ขอบเขต 0/23 |
| `testMinuteAndSecond` | case `'m'`,`'s'` |
| `testMillisecondPadded` | case `'S'` padded 3 หลัก |
| `testWeekdayShortAndFull` | case `'E'`: tokenLen<4 vs >=4 |
| `testAmPmMarker` | case `'a'` |
| `testTwentyFourHour*` (2 เมธอด) | `TwentyFourHourField`: value==0 (replace) vs !=0 |
| `testHourInAmPm_K` | case `'K'` ไม่มีการแทนค่า |
| `testWeekOfYear_WeekOfMonth_DayOfWeekInMonth` | case `'w'`,`'W'`,`'F'` |
| `testTimeZoneName_*` (2 เมธอด) | case `'z'`: tokenLen>=4 vs <4; `TimeZoneNameRule.appendTo` daylight vs standard |
| `testTimeZoneNumber_*` (3 เมธอด) | case `'Z'`: tokenLen==1 vs >1; offset<0 vs >=0 |
| `testFormatObject_*` (5 เมธอด) | `format(Object,...)`: instanceof Date/Calendar/Long/else(null & unsupported) |
| `testFormat*WithBuffer`, `testFormatLong`, `testFormatCalendar_noBuffer` | overload ทั้งหมดของ `format()` |
| `testCompositePatternMatchesSimpleDateFormat` | integration cross-check end-to-end |
| `testGetters` | accessor methods |
| `testEquals_*` (5 เมธอด) | `equals()`: not instanceof, pattern/timezone/locale mismatch, equal case |
| `testToString` | `toString()` format string |
| `testSerializationRoundTrip` | `readObject()` → `init()` re-build transient `mRules` |

**บรานช์ที่ไม่สามารถทดสอบได้ผ่าน public API (ระบุคอมเมนต์ในโค้ดแล้ว):**
- `TwoDigitNumberField.appendTo` branch `value>=100` (ฟิลด์ที่ใช้ TwoDigitNumberField มีค่าสูงสุด < 100 เสมอ)
- `if (tokenLen == 0) break;` ใน `parsePattern()` (ไม่สามารถเกิดได้จาก `parseToken()` ตามการวิเคราะห์โค้ด)