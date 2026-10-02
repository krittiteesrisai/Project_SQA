package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateParserTest {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;

    private Calendar toCalendar(Date date, TimeZone tz, Locale locale) {
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.setTime(date);
        return cal;
    }

    private FastDateParser newParser(String pattern) {
        return new FastDateParser(pattern, UTC, US);
    }

    // ---------------------------------------------------------------
    // Accessors
    // ---------------------------------------------------------------

    @Test
    public void testGetPatternTimeZoneLocale() {
        FastDateParser p = newParser("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", p.getPattern());
        assertEquals(UTC, p.getTimeZone());
        assertEquals(US, p.getLocale());
    }

    @Test
    public void testGetParsePatternNotNull() {
        FastDateParser p = newParser("yyyy-MM-dd");
        assertNotNull(p.getParsePattern());
    }

    // ---------------------------------------------------------------
    // equals() / hashCode() / toString()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_DifferentType() {
        FastDateParser p = newParser("yyyy");
        assertFalse(p.equals("not a parser"));
    }

    @Test
    public void testEquals_Null() {
        FastDateParser p = newParser("yyyy");
        assertFalse(p.equals(null));
    }

    @Test
    public void testEquals_DifferentPattern() {
        FastDateParser p1 = newParser("yyyy");
        FastDateParser p2 = newParser("MM");
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentTimeZone() {
        FastDateParser p1 = new FastDateParser("yyyy", UTC, US);
        FastDateParser p2 = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT+1"), US);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentLocale() {
        FastDateParser p1 = new FastDateParser("yyyy", UTC, Locale.US);
        FastDateParser p2 = new FastDateParser("yyyy", UTC, Locale.GERMANY);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_Equal() {
        FastDateParser p1 = newParser("yyyy-MM-dd");
        FastDateParser p2 = newParser("yyyy-MM-dd");
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void testHashCode_EqualObjectsSameHash() {
        FastDateParser p1 = newParser("yyyy-MM-dd");
        FastDateParser p2 = newParser("yyyy-MM-dd");
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testToString_ContainsFields() {
        FastDateParser p = newParser("yyyy-MM-dd");
        String s = p.toString();
        assertTrue(s.contains("yyyy-MM-dd"));
        assertTrue(s.contains(US.toString()));
        assertTrue(s.contains(UTC.getID()));
    }

    // ---------------------------------------------------------------
    // Constructor / init() invalid pattern branches
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_EmptyPattern_Throws() {
        newParser("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_UnmatchedQuote_Throws() {
        // single unmatched quote does not satisfy any alternative of formatPattern
        newParser("'");
    }

    // ---------------------------------------------------------------
    // parse(String) / ParseException branches
    // ---------------------------------------------------------------

    @Test
    public void testParse_Success_FullDate() throws ParseException {
        FastDateParser p = newParser("yyyy-MM-dd");
        Date d = p.parse("2020-07-04");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(6, cal.get(Calendar.MONTH)); // July -> index 6
        assertEquals(4, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParse_Failure_ThrowsParseException() {
        FastDateParser p = newParser("yyyy-MM-dd");
        try {
            p.parse("not-a-date");
            fail("expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unparseable date"));
            assertTrue(e.getMessage().contains("not-a-date"));
        }
    }

    @Test
    public void testParse_Failure_JapaneseImperialMessage() {
        FastDateParser p = new FastDateParser("yyyy", UTC, FastDateParser.JAPANESE_IMPERIAL);
        try {
            p.parse("bad-input");
            fail("expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("1868 AD"));
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    // ---------------------------------------------------------------
    // parse(String, ParsePosition) branches
    // ---------------------------------------------------------------

    @Test
    public void testParseWithPosition_PartialMatchAdvancesIndex() {
        FastDateParser p = newParser("yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date d = p.parse("2020extra", pos);
        assertNotNull(d);
        assertEquals(4, pos.getIndex());
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2020, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseWithPosition_NoMatchReturnsNullAndKeepsIndex() {
        FastDateParser p = newParser("yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date d = p.parse("abcd", pos);
        assertNull(d);
        assertEquals(0, pos.getIndex()); // unchanged since setIndex not reached
    }

    @Test
    public void testParseWithPosition_NonZeroOffset() {
        FastDateParser p = newParser("yyyy");
        ParsePosition pos = new ParsePosition(5);
        Date d = p.parse("XXXXX2020", pos);
        assertNotNull(d);
        assertEquals(9, pos.getIndex());
    }

    // ---------------------------------------------------------------
    // parseObject() delegation branches
    // ---------------------------------------------------------------

    @Test
    public void testParseObject_String() throws ParseException {
        FastDateParser p = newParser("yyyy");
        Object o = p.parseObject("2021");
        assertTrue(o instanceof Date);
    }

    @Test
    public void testParseObject_StringParsePosition() {
        FastDateParser p = newParser("yyyy");
        ParsePosition pos = new ParsePosition(0);
        Object o = p.parseObject("abcd", pos);
        assertNull(o);
    }

    // ---------------------------------------------------------------
    // Strategy branch coverage via getStrategy() / field parsing
    // ---------------------------------------------------------------

    @Test
    public void testField_D_DayOfYear() throws ParseException {
        // Safe resolution combo: YEAR + DAY_OF_YEAR
        FastDateParser p = newParser("yyyy D");
        Date d = p.parse("2020 100");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(100, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testField_F_DayOfWeekInMonth_Smoke() throws ParseException {
        // F ambiguous resolution combo in Calendar -> smoke test only
        FastDateParser p = newParser("F");
        Date d = p.parse("2");
        assertNotNull(d);
    }

    @Test
    public void testField_G_Era() throws ParseException {
        FastDateParser p = newParser("G yyyy-MM-dd");
        Date d = p.parse("AD 2020-01-15");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(GregorianCalendar.AD, cal.get(Calendar.ERA));
        assertEquals(2020, cal.get(Calendar.YEAR));
    }

    @Test
    public void testField_E_DayOfWeek() throws ParseException {
        // Jan 9, 2024 is verified Tuesday
        FastDateParser p = newParser("yyyy-MM-dd EEEE");
        Date d = p.parse("2024-01-09 Tuesday");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(Calendar.TUESDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testField_H_ModuloHourOfDay() throws ParseException {
        FastDateParser p = newParser("H");
        Calendar c1 = toCalendar(p.parse("23"), UTC, US);
        assertEquals(23, c1.get(Calendar.HOUR_OF_DAY));
        Calendar c2 = toCalendar(p.parse("24"), UTC, US); // 24 % 24 = 0
        assertEquals(0, c2.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testField_K_Hour() throws ParseException {
        FastDateParser p = newParser("K");
        Calendar cal = toCalendar(p.parse("11"), UTC, US);
        assertEquals(11, cal.get(Calendar.HOUR));
    }

    @Test
    public void testField_M_NumericLen1And2() throws ParseException {
        FastDateParser p1 = newParser("yyyy-M-dd");
        Calendar c1 = toCalendar(p1.parse("2020-5-15"), UTC, US);
        assertEquals(4, c1.get(Calendar.MONTH));

        FastDateParser p2 = newParser("yyyy-MM-dd");
        Calendar c2 = toCalendar(p2.parse("2020-01-15"), UTC, US);
        assertEquals(0, c2.get(Calendar.MONTH));
        Calendar c3 = toCalendar(p2.parse("2020-12-15"), UTC, US);
        assertEquals(11, c3.get(Calendar.MONTH));
    }

    @Test
    public void testField_M_TextLen3And4() throws ParseException {
        FastDateParser p1 = newParser("yyyy-MMM-dd");
        Calendar c1 = toCalendar(p1.parse("2020-Feb-15"), UTC, US);
        assertEquals(1, c1.get(Calendar.MONTH));

        FastDateParser p2 = newParser("yyyy-MMMM-dd");
        Calendar c2 = toCalendar(p2.parse("2020-February-15"), UTC, US);
        assertEquals(1, c2.get(Calendar.MONTH));
    }

    @Test
    public void testField_S_Millisecond() throws ParseException {
        FastDateParser p = newParser("S");
        Calendar cal = toCalendar(p.parse("123"), UTC, US);
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testField_W_WeekOfMonth_Smoke() throws ParseException {
        FastDateParser p = newParser("W");
        Date d = p.parse("2");
        assertNotNull(d);
    }

    @Test
    public void testField_Z_TimezoneOffsetPlusZero() throws ParseException {
        FastDateParser p = newParser("yyyy-MM-dd HH:mm Z");
        Date d = p.parse("2020-01-01 00:00 +0000");
        assertEquals(1577836800000L, d.getTime());
    }

    @Test
    public void testField_Z_TimezoneOffsetMinus() throws ParseException {
        FastDateParser p = newParser("yyyy-MM-dd HH:mm Z");
        Date d = p.parse("2020-01-01 00:00 -0500");
        assertEquals(1577854800000L, d.getTime());
    }

    @Test
    public void testField_Z_TimezoneGMTPrefix() throws ParseException {
        FastDateParser p = newParser("yyyy-MM-dd HH:mm Z");
        // matcher.lookingAt() only needs prefix match; trailing ":00" is ignored
        Date d = p.parse("2020-01-01 00:00 GMT+05:00");
        assertEquals(1577818800000L, d.getTime());
    }

    @Test
    public void testField_a_AmPm() throws ParseException {
        FastDateParser p = newParser("a");
        Calendar c1 = toCalendar(p.parse("AM"), UTC, US);
        assertEquals(Calendar.AM, c1.get(Calendar.AM_PM));
        Calendar c2 = toCalendar(p.parse("PM"), UTC, US);
        assertEquals(Calendar.PM, c2.get(Calendar.AM_PM));
    }

    @Test
    public void testField_d_DayOfMonth() throws ParseException {
        FastDateParser p = newParser("d");
        Calendar cal = toCalendar(p.parse("15"), UTC, US);
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testField_h_ModuloHour() throws ParseException {
        FastDateParser p = newParser("h");
        Calendar c1 = toCalendar(p.parse("12"), UTC, US); // 12 % 12 = 0
        assertEquals(0, c1.get(Calendar.HOUR));
        Calendar c2 = toCalendar(p.parse("5"), UTC, US);
        assertEquals(5, c2.get(Calendar.HOUR));
    }

    @Test
    public void testField_k_HourOfDay() throws ParseException {
        // Source maps 'k' to plain HOUR_OF_DAY_STRATEGY (no modulo, per code read).
        // ไม่ทดสอบค่า 24 (boundary) เพราะ Calendar leniency อาจ normalize ค่าได้ (ไม่ต้องการเดา JDK)
        FastDateParser p = newParser("k");
        Calendar cal = toCalendar(p.parse("10"), UTC, US);
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testField_m_Minute() throws ParseException {
        FastDateParser p = newParser("m");
        Calendar cal = toCalendar(p.parse("45"), UTC, US);
        assertEquals(45, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testField_s_Second() throws ParseException {
        FastDateParser p = newParser("s");
        Calendar cal = toCalendar(p.parse("30"), UTC, US);
        assertEquals(30, cal.get(Calendar.SECOND));
    }

    @Test
    public void testField_y_AbbreviatedVsLiteral() throws ParseException {
        // y length<=2 -> ABBREVIATED_YEAR_STRATEGY
        FastDateParser pAbbrev = newParser("y");

        // branch: iValue >= 100 -> direct set, bypass adjustYear
        Calendar c1 = toCalendar(pAbbrev.parse("1999"), UTC, US);
        assertEquals(1999, c1.get(Calendar.YEAR));

        // branch: iValue < 100 -> adjustYear applied
        Calendar c2 = toCalendar(pAbbrev.parse("05"), UTC, US);
        assertEquals(pAbbrev.adjustYear(5), c2.get(Calendar.YEAR));

        // y length>2 -> LITERAL_YEAR_STRATEGY (no special modify)
        FastDateParser pLiteral = newParser("yyyy");
        Calendar c3 = toCalendar(pLiteral.parse("2023"), UTC, US);
        assertEquals(2023, c3.get(Calendar.YEAR));

        // yyy (len3 > 2) also literal, boundary check of ">2"
        FastDateParser pLiteral3 = newParser("yyy");
        Calendar c4 = toCalendar(pLiteral3.parse("2024"), UTC, US);
        assertEquals(2024, c4.get(Calendar.YEAR));
    }

    // ---------------------------------------------------------------
    // adjustYear() boundary (dynamic, based on actual "thisYear")
    // ---------------------------------------------------------------

    @Test
    public void testAdjustYear_BoundaryFormula() {
        FastDateParser p = newParser("y");
        int thisYear = Calendar.getInstance(UTC, US).get(Calendar.YEAR);
        for (int twoDigitYear = 0; twoDigitYear < 100; twoDigitYear++) {
            int trial = twoDigitYear + thisYear - thisYear % 100;
            int expected = (trial < thisYear + 20) ? trial : trial - 100;
            assertEquals("twoDigitYear=" + twoDigitYear, expected, p.adjustYear(twoDigitYear));
        }
    }

    // ---------------------------------------------------------------
    // Quote / literal / escapeRegex branches
    // ---------------------------------------------------------------

    @Test
    public void testQuote_LiteralText() throws ParseException {
        FastDateParser p = newParser("'T'HH:mm");
        Date d = p.parse("T10:30");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testQuote_EmptyQuoteLiteralSingleQuoteChar() throws ParseException {
        // pattern "''" -> escapeRegex unquote path produces a single literal quote char
        FastDateParser p = newParser("''");
        Date d = p.parse("'");
        assertNotNull(d);
    }

    @Test
    public void testQuote_EmbeddedEscapedQuote() throws ParseException {
        // pattern "'it''s'" represents literal text "it's"
        FastDateParser p = newParser("'it''s'");
        Date d = p.parse("it's");
        assertNotNull(d);
    }

    @Test
    public void testEscapeRegex_SpecialCharsEscapedProperly() throws ParseException {
        FastDateParser p = newParser("'a.b+c'");
        // ต้อง match ตัวอักษรตรงตัวเท่านั้น
        Date d = p.parse("a.b+c");
        assertNotNull(d);

        // ถ้า '.' หรือ '+' ไม่ได้ escape อย่างถูกต้อง สตริงนี้อาจ match ผิดพลาด
        try {
            p.parse("aXbXc");
            fail("expected ParseException because '.' and '+' must be literal, not regex metachars");
        } catch (ParseException expected) {
            // ok
        }
    }

    @Test
    public void testDefaultLiteral_NonLetterChars() throws ParseException {
        FastDateParser p = newParser("yyyy-MM-dd");
        Calendar cal = toCalendar(p.parse("2023-07-04"), UTC, US);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(6, cal.get(Calendar.MONTH));
        assertEquals(4, cal.get(Calendar.DAY_OF_MONTH));
    }

    // ---------------------------------------------------------------
    // isNextNumber() / getFieldWidth() post-construction behavior
    // ---------------------------------------------------------------

    @Test
    public void testIsNextNumber_AlwaysFalseAfterConstruction() {
        // nextStrategy ถูกตั้งเป็น null เสมอก่อนออกจาก init() loop
        FastDateParser p = newParser("HHmm");
        assertFalse(p.isNextNumber());
    }

    @Test(expected = NullPointerException.class)
    public void testGetFieldWidth_ThrowsNPEAfterConstruction() {
        // currentFormatField ถูกตั้งเป็น null เสมอหลัง init() เสร็จสิ้น
        FastDateParser p = newParser("yyyy");
        p.getFieldWidth();
    }

    // ---------------------------------------------------------------
    // Regex shape: isNextNumber()/getFieldWidth() ตอนสร้าง (ผ่าน getParsePattern())
    // ---------------------------------------------------------------

    @Test
    public void testRegexShape_NextFieldNumberAffectsWidth() {
        // ตัวเลขถัดไปเป็น digit literal "0" -> isNextNumber()=true ระหว่างสร้าง -> fixed width {4}
        FastDateParser p = newParser("yyyy0");
        String regex = p.getParsePattern().pattern();
        assertTrue(regex.contains("{4}+"));
    }

    @Test
    public void testRegexShape_NextFieldNonNumberUnboundedWidth() {
        // ตัวถัดไปเป็น '-' (ไม่ใช่ digit) -> isNextNumber()=false -> unbounded width
        FastDateParser p = newParser("yyyy-");
        String regex = p.getParsePattern().pattern();
        assertFalse(regex.contains("{4}+"));
    }

    @Test
    public void testRegexShape_HHmm_FixedWidthForModuloHour() {
        FastDateParser p = newParser("HHmm");
        String regex = p.getParsePattern().pattern();
        assertTrue(regex.contains("{2}+"));
    }

    @Test
    public void testRegexShape_HHColonMm_UnboundedWidth() {
        FastDateParser p = newParser("HH:mm");
        String regex = p.getParsePattern().pattern();
        assertFalse(regex.contains("{2}+"));
    }

    // ---------------------------------------------------------------
    // getDisplayNames() branches
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetDisplayNames_InvalidField_Throws() {
        FastDateParser p = newParser("yyyy");
        // Calendar.YEAR ไม่ใช่ ERA/DAY_OF_WEEK/AM_PM/MONTH -> default case
        p.getDisplayNames(Calendar.YEAR);
    }

    @Test
    public void testGetDisplayNames_CachingReturnsSameArray() {
        FastDateParser p = newParser("yyyy");
        Object first = p.getDisplayNames(Calendar.MONTH);
        Object second = p.getDisplayNames(Calendar.MONTH);
        assertSame(first, second);
    }

    // ---------------------------------------------------------------
    // Serialization (readObject -> init() re-run)
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_RoundTrip() throws Exception {
        FastDateParser original = newParser("yyyy-MM-dd");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        assertEquals(original.getPattern(), deserialized.getPattern());
        assertEquals(original.getTimeZone(), deserialized.getTimeZone());
        assertEquals(original.getLocale(), deserialized.getLocale());

        // ต้องใช้งาน parse ได้ปกติ แสดงว่า readObject() เรียก init() สำเร็จ
        Date d = deserialized.parse("2020-05-10");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(4, cal.get(Calendar.MONTH));
        assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
    }
}
