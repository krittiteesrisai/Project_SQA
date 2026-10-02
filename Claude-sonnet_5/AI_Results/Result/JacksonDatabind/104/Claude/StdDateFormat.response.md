# StdDateFormatTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- วางคลาสทดสอบไว้ใน **package เดียวกับคลาสเป้าหมาย** (`com.fasterxml.jackson.databind.util`) เพื่อให้เข้าถึง protected methods (เช่น `looksLikeISO8601`, `_getCalendar`, `_equals`) ได้โดยตรงสำหรับ white-box test บางเคส
- บางพฤติกรรมเป็น "ข้อบกพร่อง/edge-case ที่มีอยู่จริงในซอร์ส" (เช่น `parse("")` โยน `StringIndexOutOfBoundsException`, `withLocale(null)` โยน `NullPointerException`) — มีคอมเมนต์กำกับไว้ชัดเจน ไม่ได้เดาเอง แต่ไล่จาก logic ในซอร์สตรง ๆ

```java
package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.Test;

public class StdDateFormatTest {

    // ------------- Helpers -------------

    private Date utc(int y, int mo1to12, int d, int h, int mi, int s, int ms) {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.clear();
        cal.set(y, mo1to12 - 1, d, h, mi, s);
        cal.set(Calendar.MILLISECOND, ms);
        return cal.getTime();
    }

    private Date local(TimeZone tz, int y, int mo1to12, int d, int h, int mi, int s, int ms) {
        Calendar cal = new GregorianCalendar(tz, Locale.US);
        cal.clear();
        cal.set(y, mo1to12 - 1, d, h, mi, s);
        cal.set(Calendar.MILLISECOND, ms);
        return cal.getTime();
    }

    // =====================================================================
    // A. Construction & factory methods
    // =====================================================================

    @Test
    public void defaultConstructor_SetsDefaults() {
        StdDateFormat sdf = new StdDateFormat();
        assertNull(sdf.getTimeZone());
        assertTrue(sdf.isLenient()); // _lenient == null -> true
        assertFalse(sdf.isColonIncludedInTimeZone());
    }

    @Test
    public void deprecatedConstructor_SetsFields() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        @SuppressWarnings("deprecation")
        StdDateFormat sdf = new StdDateFormat(tz, Locale.FRANCE);
        assertEquals(tz, sdf.getTimeZone());
        assertTrue(sdf.toString().contains(Locale.FRANCE.toString()));
    }

    @Test
    public void withTimeZone_NullUsesDefaultTimeZone() {
        StdDateFormat base = new StdDateFormat();
        StdDateFormat result = base.withTimeZone(null);
        assertNotSame(base, result); // _timezone was null, DEFAULT != null -> new instance
        assertEquals(StdDateFormat.getDefaultTimeZone(), result.getTimeZone());
    }

    @Test
    public void withTimeZone_SameInstanceReturnedWhenUnchanged() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        StdDateFormat withTz = new StdDateFormat().withTimeZone(tz); // creates new instance (tz differs from null)
        StdDateFormat again = withTz.withTimeZone(tz); // tz == _timezone (same ref) -> branch true
        assertSame(withTz, again);
    }

    @Test
    public void withTimeZone_NewInstanceWhenChanged() {
        TimeZone tz1 = TimeZone.getTimeZone("UTC");
        TimeZone tz2 = TimeZone.getTimeZone("America/New_York");
        StdDateFormat withTz1 = new StdDateFormat().withTimeZone(tz1);
        StdDateFormat withTz2 = withTz1.withTimeZone(tz2);
        assertNotSame(withTz1, withTz2);
        assertEquals(tz2, withTz2.getTimeZone());
    }

    // ตามซอร์ส: withLocale ไม่มีการเช็ค null ("loc.equals(_locale)") -> NPE เมื่อ loc == null
    @Test(expected = NullPointerException.class)
    public void withLocale_NullThrowsNPE() {
        new StdDateFormat().withLocale(null);
    }

    @Test
    public void withLocale_SameInstanceReturnedWhenUnchanged() {
        StdDateFormat base = new StdDateFormat(); // _locale == DEFAULT_LOCALE (US)
        StdDateFormat result = base.withLocale(Locale.US);
        assertSame(base, result);
    }

    @Test
    public void withLocale_NewInstanceWhenChanged() {
        StdDateFormat base = new StdDateFormat();
        StdDateFormat result = base.withLocale(Locale.FRANCE);
        assertNotSame(base, result);
        assertTrue(result.toString().contains(Locale.FRANCE.toString()));
    }

    @Test
    public void withLenient_NullKeepsSameInstance() {
        StdDateFormat base = new StdDateFormat(); // _lenient == null
        StdDateFormat result = base.withLenient(null); // _equals(null,null) == true
        assertSame(base, result);
    }

    @Test
    public void withLenient_NewInstanceWhenChanged() {
        StdDateFormat base = new StdDateFormat();
        StdDateFormat trueInst = base.withLenient(Boolean.TRUE);
        assertNotSame(base, trueInst);
        assertTrue(trueInst.isLenient());

        StdDateFormat falseInst = trueInst.withLenient(Boolean.FALSE);
        assertNotSame(trueInst, falseInst);
        assertFalse(falseInst.isLenient());
    }

    @Test
    public void withColonInTimeZone_SameInstanceWhenUnchanged() {
        StdDateFormat base = new StdDateFormat(); // colon == false by default
        StdDateFormat result = base.withColonInTimeZone(false);
        assertSame(base, result);
    }

    @Test
    public void withColonInTimeZone_NewInstanceWhenChanged() {
        StdDateFormat base = new StdDateFormat();
        StdDateFormat result = base.withColonInTimeZone(true);
        assertNotSame(base, result);
        assertTrue(result.isColonIncludedInTimeZone());
    }

    @Test
    public void clone_CreatesEquivalentButDistinctInstance() {
        StdDateFormat orig = new StdDateFormat()
                .withTimeZone(TimeZone.getTimeZone("UTC"))
                .withLenient(Boolean.FALSE)
                .withColonInTimeZone(true);
        StdDateFormat cloned = orig.clone();

        assertNotSame(orig, cloned);
        assertFalse(orig.equals(cloned)); // equals() เป็น identity-based
        assertEquals(orig.getTimeZone(), cloned.getTimeZone());
        assertEquals(orig.isLenient(), cloned.isLenient());
        assertEquals(orig.isColonIncludedInTimeZone(), cloned.isColonIncludedInTimeZone());
    }

    @Test
    public void staticEqualsHelper_AllBranches() {
        assertTrue(StdDateFormat._equals(null, null));       // both null
        assertFalse(StdDateFormat._equals("a", null));       // value1 != null, value2 null
        assertFalse(StdDateFormat._equals(null, "a"));       // value1 null
        String s1 = new String("x");
        String s2 = new String("x");
        assertNotSame(s1, s2);
        assertTrue(StdDateFormat._equals(s1, s2));            // value1.equals(value2) branch
        assertFalse(StdDateFormat._equals("x", "y"));         // not equal
    }

    @Test
    public void getDefaultTimeZone_ReturnsUTC() {
        assertEquals(TimeZone.getTimeZone("UTC"), StdDateFormat.getDefaultTimeZone());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void getISO8601Format_DefaultLocaleBranch() {
        java.text.DateFormat fmt = StdDateFormat.getISO8601Format(
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(fmt);
        String out = fmt.format(utc(2020, 1, 1, 0, 0, 0, 0));
        assertTrue(out.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[+-]\\d{4}"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void getISO8601Format_NonDefaultLocaleBranch() {
        java.text.DateFormat fmt = StdDateFormat.getISO8601Format(
                TimeZone.getTimeZone("UTC"), Locale.FRANCE); // triggers !loc.equals(DEFAULT_LOCALE) branch
        assertNotNull(fmt);
        String out = fmt.format(utc(2020, 1, 1, 0, 0, 0, 0));
        assertTrue(out.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[+-]\\d{4}"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void getRFC1123Format_DefaultLocaleBranch() {
        java.text.DateFormat fmt = StdDateFormat.getRFC1123Format(
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(fmt);
        String out = fmt.format(utc(2020, 1, 1, 0, 0, 0, 0));
        assertTrue(out.matches("[A-Za-z]{3}, \\d{2} [A-Za-z]{3} \\d{4} \\d{2}:\\d{2}:\\d{2} .+"));
    }

    // =====================================================================
    // B. Configuration accessors
    // =====================================================================

    @Test(expected = NullPointerException.class)
    public void setTimeZone_NullThrowsNPE() {
        new StdDateFormat().setTimeZone(null); // tz.equals(...) on null -> NPE
    }

    @Test
    public void setTimeZone_ChangesTimezone() {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(tz);
        assertEquals(tz, sdf.getTimeZone());
    }

    @Test
    public void setTimeZone_SameValueNoOp() {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(tz);
        sdf.setTimeZone(tz); // !tz.equals(_timezone) == false -> skip branch, no exception
        assertEquals(tz, sdf.getTimeZone());
    }

    @Test
    public void setLenient_DefaultIsLenientTrue() {
        StdDateFormat sdf = new StdDateFormat();
        assertTrue(sdf.isLenient());
    }

    @Test
    public void setLenient_ToggleFalseThenTrue() {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false);
        assertFalse(sdf.isLenient());
        sdf.setLenient(false); // _equals(FALSE, FALSE) == true -> skip clear branch
        assertFalse(sdf.isLenient());
        sdf.setLenient(true);
        assertTrue(sdf.isLenient());
    }

    @Test
    public void isColonIncludedInTimeZone_DefaultFalseAndAfterChange() {
        StdDateFormat sdf = new StdDateFormat();
        assertFalse(sdf.isColonIncludedInTimeZone());
        StdDateFormat withColon = sdf.withColonInTimeZone(true);
        assertTrue(withColon.isColonIncludedInTimeZone());
    }

    @Test
    public void getCalendarInternal_CreateAndReuseAndRetimezone() {
        StdDateFormat sdf = new StdDateFormat();
        Calendar c1 = sdf._getCalendar(TimeZone.getTimeZone("UTC")); // cal == null -> create
        assertNotNull(c1);
        Calendar c2 = sdf._getCalendar(TimeZone.getTimeZone("UTC")); // same tz -> skip setTimeZone branch
        assertSame(c1, c2);
        Calendar c3 = sdf._getCalendar(TimeZone.getTimeZone("America/New_York")); // different tz -> setTimeZone branch
        assertSame(c1, c3); // cached instance reused
        assertEquals(TimeZone.getTimeZone("America/New_York"), c3.getTimeZone());
    }

    // =====================================================================
    // C. parse(String)
    // =====================================================================

    @Test(expected = NullPointerException.class)
    public void parse_NullThrowsNPE() throws ParseException {
        new StdDateFormat().parse((String) null); // dateStr.trim() on null
    }

    // หมายเหตุ: นี่คือ edge-case ที่ไล่ตรงจาก logic ของ _parseDate: เมื่อ dateStr=="" (หลัง trim)
    // ลูป while(--i>=0) จะจบทันทีด้วย i=-1 แล้วเข้า if ที่เรียก dateStr.charAt(0) บน string ว่าง
    // ทำให้เกิด StringIndexOutOfBoundsException (ไม่ใช่ ParseException) - เป็น fault ที่ตรวจพบได้จริง
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void parse_EmptyStringThrowsSIOOBE() throws ParseException {
        new StdDateFormat().parse("");
    }

    @Test
    public void parse_PlainISODate() throws ParseException {
        Date result = new StdDateFormat().parse("2020-01-15");
        assertEquals(utc(2020, 1, 15, 0, 0, 0, 0), result);
    }

    @Test
    public void parse_PlainISOMalformedThrowsParseException() {
        try {
            new StdDateFormat().parse("1234-01-0X"); // looksLikeISO8601==true, totalLen<=10, PATTERN_PLAIN mismatch
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("while it seems to fit format"));
        }
    }

    @Test
    public void parse_FullISO8601_WithMillisAndColonOffset() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-06-15T08:09:10.123+05:30");
        Date expected = local(new SimpleTimeZone(19800000, "IST"), 2020, 6, 15, 8, 9, 10, 123);
        assertEquals(expected, actual);
    }

    @Test
    public void parse_FullISO8601_NoSeconds() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-15T10:20Z");
        assertEquals(utc(2020, 1, 15, 10, 20, 0, 0), actual);
    }

    @Test
    public void parse_FullISO8601_ZoneZForcesUTCRegardlessOfInstanceTZ() throws ParseException {
        StdDateFormat sdf = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("America/New_York"));
        Date actual = sdf.parse("2020-01-15T10:20:30.123Z");
        assertEquals(utc(2020, 1, 15, 10, 20, 30, 123), actual);
    }

    @Test
    public void parse_FullISO8601_NoZoneUsesInstanceTimeZoneIfSet() throws ParseException {
        TimeZone ny = TimeZone.getTimeZone("America/New_York");
        StdDateFormat sdf = new StdDateFormat().withTimeZone(ny);
        Date actual = sdf.parse("2020-01-15T10:20:30.123"); // no trailing 'Z' -> uses _timezone
        Date expected = local(ny, 2020, 1, 15, 10, 20, 30, 123);
        assertEquals(expected, actual);
    }

    @Test
    public void parse_FullISO8601_OffsetWithoutMinutes() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-01T00:00:00.000+05");
        Date expected = local(new SimpleTimeZone(18000000, "P5"), 2020, 1, 1, 0, 0, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void parse_FullISO8601_FractionOneDigit() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-01T00:00:00.5Z");
        assertEquals(utc(2020, 1, 1, 0, 0, 0, 500), actual);
    }

    @Test
    public void parse_FullISO8601_FractionTwoDigits() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-01T00:00:00.12Z");
        assertEquals(utc(2020, 1, 1, 0, 0, 0, 120), actual);
    }

    @Test
    public void parse_FullISO8601_FractionThreeDigits() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-01T00:00:00.123Z");
        assertEquals(utc(2020, 1, 1, 0, 0, 0, 123), actual);
    }

    // ตามซอร์ส: switch fall-through ทำให้ fractLen 4..9 ใช้เฉพาะ 3 หลักแรกเท่านั้น
    @Test
    public void parse_FullISO8601_FractionMoreThanThreeDigitsUsesFirstThreeOnly() throws ParseException {
        Date actual = new StdDateFormat().parse("2020-01-01T00:00:00.12345Z");
        assertEquals(utc(2020, 1, 1, 0, 0, 0, 123), actual);
    }

    @Test
    public void parse_FullISO8601_FractionTooLongThrowsParseException() {
        try {
            new StdDateFormat().parse("2020-01-15T10:20:30.1234567890Z"); // 10 digits > 9
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("invalid fractional seconds"));
        }
    }

    @Test
    public void parse_FullISO8601MalformedThrowsParseException() {
        try {
            // 'X' แทน 'T' ที่ตำแหน่งบังคับ -> looksLikeISO8601==true แต่ PATTERN_ISO8601 ไม่ match
            new StdDateFormat().parse("2020-01-15X13:45:30.123Z");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("while it seems to fit format"));
        }
    }

    @Test
    public void parse_NegativeNumericTimestamp() throws ParseException {
        Date actual = new StdDateFormat().parse("-1500000000000");
        assertEquals(new Date(-1500000000000L), actual);
    }

    @Test
    public void parse_PositiveNumericTimestampInLongRange() throws ParseException {
        Date actual = new StdDateFormat().parse("1500000000000");
        assertEquals(new Date(1500000000000L), actual);
    }

    @Test
    public void parse_RFC1123ValidDate() throws ParseException {
        Date actual = new StdDateFormat().parse("Mon, 01 Jan 2001 00:00:00 GMT");
        assertEquals(utc(2001, 1, 1, 0, 0, 0, 0), actual);
    }

    @Test
    public void parse_UnrecognizedStringThrowsParseException() {
        try {
            new StdDateFormat().parse("not-a-date");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Cannot parse date"));
            assertTrue(e.getMessage().contains("not compatible with any of standard forms"));
        }
    }

    // ตัวเลขยาวมาก (เกิน long range) -> ข้าม branch _parseDateFromLong แล้วตกไป RFC1123 (fail) -> generic ParseException
    @Test
    public void parse_NumberOutOfLongRangeFallsBackToGenericException() {
        String hugeNumber = "99999999999999999999999999"; // 27 digits
        try {
            new StdDateFormat().parse(hugeNumber);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Cannot parse date"));
        }
    }

    // =====================================================================
    // D. parse(String, ParsePosition)
    // =====================================================================

    @Test
    public void parsePosition_ValidReturnsDate_NoException() {
        ParsePosition pos = new ParsePosition(0);
        Date result = new StdDateFormat().parse("2020-01-15", pos);
        assertNotNull(result);
        assertEquals(utc(2020, 1, 15, 0, 0, 0, 0), result);
    }

    @Test
    public void parsePosition_InvalidReturnsNull_NoExceptionThrown() {
        ParsePosition pos = new ParsePosition(0);
        // สตริงที่ทำให้ _parseDate โยน ParseException ภายใน (malformed full ISO)
        Date result = new StdDateFormat().parse("2020-01-15X13:45:30.123Z", pos);
        assertNull(result); // ParseException ถูก catch ภายใน parse(String,ParsePosition)
    }

    // =====================================================================
    // E. Formatting
    // =====================================================================

    @Test
    public void format_DefaultTimezoneSmallValuesPadBranches() {
        Date d = utc(2005, 3, 4, 5, 6, 7, 8);
        StringBuffer sb = new StdDateFormat().format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2005-03-04T05:06:07.008+0000", sb.toString());
    }

    @Test
    public void format_DefaultTimezoneLargeValuesPadBranches() {
        Date d = utc(2020, 12, 25, 23, 59, 58, 999);
        StringBuffer sb = new StdDateFormat().format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2020-12-25T23:59:58.999+0000", sb.toString());
    }

    @Test
    public void format_YearBelow100_Pad4ZeroBranch() {
        Date d = utc(45, 1, 1, 0, 0, 0, 0);
        StringBuffer sb = new StdDateFormat().format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("0045-01-01T00:00:00.000+0000", sb.toString());
    }

    @Test
    public void format_ColonInTimeZone_ZeroOffset() {
        Date d = utc(2005, 3, 4, 5, 6, 7, 8);
        StdDateFormat sdf = new StdDateFormat().withColonInTimeZone(true);
        StringBuffer sb = sdf.format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2005-03-04T05:06:07.008+00:00", sb.toString());
    }

    @Test
    public void format_PositiveOffsetNoColonVsColon() {
        TimeZone tz = new SimpleTimeZone(19800000, "IST"); // +05:30
        Date d = local(tz, 2021, 6, 15, 10, 20, 30, 250);

        StdDateFormat noColon = new StdDateFormat().withTimeZone(tz);
        StringBuffer sbNoColon = noColon.format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2021-06-15T10:20:30.250+0530", sbNoColon.toString());

        StdDateFormat withColon = noColon.withColonInTimeZone(true);
        StringBuffer sbColon = withColon.format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2021-06-15T10:20:30.250+05:30", sbColon.toString());
    }

    @Test
    public void format_NegativeOffset() {
        TimeZone tz = new SimpleTimeZone(-23400000, "NEG0630"); // -06:30
        Date d = local(tz, 2021, 3, 10, 1, 2, 3, 4);

        StdDateFormat sdf = new StdDateFormat().withTimeZone(tz);
        StringBuffer sb = sdf.format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2021-03-10T01:02:03.004-0630", sb.toString());

        StdDateFormat sdfColon = sdf.withColonInTimeZone(true);
        StringBuffer sbColon = sdfColon.format(d, new StringBuffer(), new java.text.FieldPosition(0));
        assertEquals("2021-03-10T01:02:03.004-06:30", sbColon.toString());
    }

    @Test(expected = NullPointerException.class)
    public void format_NullDateThrowsNPE() {
        new StdDateFormat().format((Date) null, new StringBuffer(), new java.text.FieldPosition(0));
    }

    // =====================================================================
    // F. Object overrides
    // =====================================================================

    @Test
    public void toString_ContainsExpectedFields() {
        StdDateFormat sdf = new StdDateFormat();
        String s = sdf.toString();
        assertTrue(s.startsWith("DateFormat " + StdDateFormat.class.getName() + ":"));
        assertTrue(s.contains("lenient: null"));

        sdf.setLenient(true);
        assertTrue(sdf.toString().contains("lenient: true"));
    }

    @Test
    public void toPattern_LenientBranch() {
        StdDateFormat sdf = new StdDateFormat(); // _lenient == null -> not FALSE.equals(null)
        assertTrue(sdf.toPattern().contains("(lenient)"));
    }

    @Test
    public void toPattern_StrictBranch() {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false); // _lenient == FALSE
        assertTrue(sdf.toPattern().contains("(strict)"));
    }

    @Test
    public void equals_IdentityOnly() {
        StdDateFormat a = new StdDateFormat();
        StdDateFormat b = new StdDateFormat();
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a date format"));
    }

    @Test
    public void hashCode_MatchesIdentityHash() {
        StdDateFormat a = new StdDateFormat();
        assertEquals(System.identityHashCode(a), a.hashCode());
    }

    // =====================================================================
    // G. looksLikeISO8601 boundary (white-box, protected method - same package)
    // =====================================================================

    @Test
    public void looksLikeISO8601_BoundaryConditions() {
        StdDateFormat sdf = new StdDateFormat();
        assertFalse(sdf.looksLikeISO8601("123456"));    // length < 7
        assertTrue(sdf.looksLikeISO8601("1234-56"));    // length == 7, pattern ok
        assertFalse(sdf.looksLikeISO8601("a234-56"));   // index0 not digit
        assertFalse(sdf.looksLikeISO8601("123a-56"));   // index3 not digit
        assertFalse(sdf.looksLikeISO8601("1234x56"));   // index4 != '-'
        assertFalse(sdf.looksLikeISO8601("1234-a6"));   // index5 not digit
    }
}
```

## ตารางสรุปการครอบคลุม (Branch/Condition Coverage)

| กลุ่ม | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructors | `defaultConstructor_*`, `deprecatedConstructor_*` | ค่า default fields, constructor ที่ set tz/loc ตรง ๆ |
| withTimeZone | `withTimeZone_NullUsesDefaultTimeZone`, `_SameInstanceReturnedWhenUnchanged`, `_NewInstanceWhenChanged` | if(tz==null); if(tz==_timezone \|\| tz.equals(_timezone)) ทั้ง true/false |
| withLocale | `withLocale_NullThrowsNPE`, `_SameInstanceReturnedWhenUnchanged`, `_NewInstanceWhenChanged` | loc==null (NPE edge-case), if(loc.equals(_locale)) true/false |
| withLenient | `withLenient_NullKeepsSameInstance`, `_NewInstanceWhenChanged` | _equals(b,_lenient) true/false, ทั้งสองทิศทาง true→false |
| withColonInTimeZone | `withColonInTimeZone_Same*`, `_NewInstanceWhenChanged` | if(_tzSerializedWithColon==b) true/false |
| clone/_equals/static | `clone_*`, `staticEqualsHelper_AllBranches`, `getDefaultTimeZone_*`, `getISO8601Format_*`, `getRFC1123Format_*` | clone() state, _equals ทุก branch, _cloneFormat locale==DEFAULT vs != DEFAULT |
| setTimeZone/isLenient | `setTimeZone_NullThrowsNPE`, `_ChangesTimezone`, `_SameValueNoOp`, `setLenient_*` | if(!tz.equals(_timezone)) true/false/NPE, _equals(newValue,_lenient) true/false |
| _getCalendar | `getCalendarInternal_*` | cal==null branch, cal.getTimeZone().equals(tz) true/false |
| parse(String) - ISO plain | `parse_PlainISODate`, `_PlainISOMalformedThrowsParseException` | totalLen<=10 matches/ไม่matches PATTERN_PLAIN |
| parse(String) - ISO full | `parse_FullISO8601_*` (Millis/Colon, NoSeconds, ZoneZ, NoZoneUsesTZ, OffsetWithoutMinutes, Fraction 1/2/3/>3/too-long, Malformed) | totalLen>10; Z-shortcut branch; len>1,len>=5 ของ zone group; seconds optional (`charAt(16)==':'`); switch fractLen 0/1/2/3/default(≤9,>9) |
| parse(String) - numeric | `parse_NegativeNumericTimestamp`, `_PositiveNumericTimestampInLongRange`, `_NumberOutOfLongRangeFallsBack*` | loop break conditions (`i>0 \|\| ch!='-'`), charAt(0)=='-' OR inLongRange |
| parse(String) - RFC1123/ไม่รู้จัก | `parse_RFC1123ValidDate`, `_UnrecognizedStringThrowsParseException` | fallback to RFC1123, dt==null → generic ParseException |
| parse(String) - null/empty | `parse_NullThrowsNPE`, `_EmptyStringThrowsSIOOBE` | edge-case: null → NPE, "" → SIOOBE (ตามซอร์สจริง) |
| parse(String,ParsePosition) | `parsePosition_ValidReturnsDate_*`, `_InvalidReturnsNull_*` | try/catch ภายใน ไม่โยน ParseException ออกไป |
| format() | `format_*SmallValues`, `_LargeValues`, `_YearBelow100`, `_ColonInTimeZone_ZeroOffset`, `_PositiveOffset*`, `_NegativeOffset`, `_NullDateThrowsNPE` | pad2/pad3/pad4 ทุก branch (tens==0/h==0 vs else), offset!=0 vs ==0, `_tzSerializedWithColon` true/false, sign +/- |
| toString/toPattern/equals/hashCode | `toString_*`, `toPattern_LenientBranch`, `_StrictBranch`, `equals_IdentityOnly`, `hashCode_*` | Boolean.FALSE.equals(_lenient) true/false, identity equals/hashCode |
| looksLikeISO8601 | `looksLikeISO8601_BoundaryConditions` | length<7, และทุกเงื่อนไขย่อย index 0/3/4/5 แยก true/false |

**คอมเมนต์กำกับพฤติกรรมที่ไม่แน่ใจ/เป็น edge-case จากซอร์สจริง (ไม่ได้เดา):**
- `parse("")` → `StringIndexOutOfBoundsException` (ไม่ใช่ `ParseException`) เพราะ loop จบด้วย `i=-1` แล้วเรียก `dateStr.charAt(0)` บนสตริงว่าง
- `withLocale(null)` → `NullPointerException` เพราะไม่มีการเช็ค null ก่อนเรียก `loc.equals(_locale)`
- fraction ที่มีความยาว 4–9 หลัก ใช้เพียง 3 หลักแรกเท่านั้น (switch fall-through ใน `_parseAsISO8601`)