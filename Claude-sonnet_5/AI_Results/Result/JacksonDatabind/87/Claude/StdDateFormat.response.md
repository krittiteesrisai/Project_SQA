# StdDateFormatTest.java

**หมายเหตุสำคัญ:** เพื่อให้สามารถเทสต์ `protected` methods (`looksLikeISO8601`, `parseAsISO8601`, `parseAsRFC1123`, `_clearFormats`) ได้โดยตรง — ซึ่งช่วยให้ควบคุม branch ได้แม่นยำกว่าการยิงผ่าน `parse(String)` เพียงอย่างเดียว — ผมจึงวางคลาสทดสอบไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.util`) ซึ่งเป็นวิธีมาตรฐานสำหรับ white-box unit testing และไม่ได้เปลี่ยน behavior ของคลาสเป้าหมายแต่อย่างใด

```java
package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class StdDateFormatTest {

    // ---------- helpers ----------

    private static void assertDateEqualsUTC(Date actual, int year, int month,
            int day, int hour, int min, int sec, int ms) {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(actual);
        assertEquals("year",  year,  cal.get(Calendar.YEAR));
        assertEquals("month", month, cal.get(Calendar.MONTH) + 1);
        assertEquals("day",   day,   cal.get(Calendar.DAY_OF_MONTH));
        assertEquals("hour",  hour,  cal.get(Calendar.HOUR_OF_DAY));
        assertEquals("min",   min,   cal.get(Calendar.MINUTE));
        assertEquals("sec",   sec,   cal.get(Calendar.SECOND));
        assertEquals("ms",    ms,    cal.get(Calendar.MILLISECOND));
    }

    // =========================================================
    // Constructors / factory methods / configuration
    // =========================================================

    @Test
    public void testDefaultConstructorTimeZoneIsNullUntilSet() {
        StdDateFormat f = new StdDateFormat();
        assertNull(f.getTimeZone()); // _timezone field starts as null
    }

    @Test
    public void testGetDefaultTimeZoneIsUTC() {
        assertEquals(TimeZone.getTimeZone("UTC"), StdDateFormat.getDefaultTimeZone());
    }

    @Test
    public void testWithTimeZoneNullUsesDefaultUTC() {
        StdDateFormat f = new StdDateFormat().withTimeZone(null); // tz==null branch
        assertEquals(TimeZone.getTimeZone("UTC"), f.getTimeZone());
    }

    @Test
    public void testWithTimeZoneSameReturnsSameInstance() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        StdDateFormat f1 = new StdDateFormat().withTimeZone(tz);
        StdDateFormat f2 = f1.withTimeZone(tz); // tz==_timezone branch -> return this
        assertSame(f1, f2);
    }

    @Test
    public void testWithTimeZoneDifferentReturnsNewInstance() {
        StdDateFormat f1 = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        StdDateFormat f2 = f1.withTimeZone(TimeZone.getTimeZone("GMT+03:00"));
        assertNotSame(f1, f2);
        assertEquals(TimeZone.getTimeZone("GMT+03:00"), f2.getTimeZone());
    }

    @Test
    public void testWithLocaleSameReturnsSameInstance() {
        StdDateFormat f1 = new StdDateFormat();
        StdDateFormat f2 = f1.withLocale(Locale.US); // default locale is US
        assertSame(f1, f2);
    }

    @Test
    public void testWithLocaleDifferentReturnsNewInstance() {
        StdDateFormat f1 = new StdDateFormat();
        StdDateFormat f2 = f1.withLocale(Locale.GERMANY);
        assertNotSame(f1, f2);
    }

    @Test
    public void testCloneProducesDistinctButFieldEquivalentInstance() {
        StdDateFormat f1 = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+01:00"));
        StdDateFormat f2 = f1.clone();
        assertNotSame(f1, f2);
        assertEquals(f1.getTimeZone(), f2.getTimeZone());
        assertFalse(f1.equals(f2)); // equals() is identity-based
    }

    @Test
    public void testGetISO8601FormatVariants() {
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"))); // deprecated overload
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.US));
        // tz==null && locale != DEFAULT_LOCALE -> exercises _cloneFormat's alternate branches
        assertNotNull(StdDateFormat.getISO8601Format(null, Locale.GERMANY));
    }

    @Test
    public void testGetRFC1123FormatVariants() {
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"))); // deprecated overload
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"), Locale.US));
        assertNotNull(StdDateFormat.getRFC1123Format(null, Locale.GERMANY));
    }

    @Test
    public void testSetTimeZoneChangesValueWhenDifferent() {
        StdDateFormat f = new StdDateFormat();
        f.setTimeZone(TimeZone.getTimeZone("GMT+05:00"));
        assertEquals(TimeZone.getTimeZone("GMT+05:00"), f.getTimeZone());
    }

    @Test(expected = NullPointerException.class)
    public void testSetTimeZoneNullThrowsNPE() {
        // FAULT-PRONE: tz.equals(_timezone) called with tz==null -> NPE
        new StdDateFormat().setTimeZone(null);
    }

    @Test
    public void testSetLenientAndIsLenientBranches() {
        StdDateFormat f = new StdDateFormat();
        assertTrue(f.isLenient());        // _lenient == null -> default true
        f.setLenient(false);               // _lenient != newValue -> change
        assertFalse(f.isLenient());
        f.setLenient(false);               // _lenient == newValue -> no change branch
        assertFalse(f.isLenient());
        f.setLenient(true);
        assertTrue(f.isLenient());
    }

    // =========================================================
    // looksLikeISO8601 (protected) - direct branch testing
    // =========================================================

    @Test
    public void testLooksLikeISO8601Branches() {
        StdDateFormat f = new StdDateFormat();
        assertFalse(f.looksLikeISO8601(""));         // length < 5
        assertFalse(f.looksLikeISO8601("1234"));      // length < 5
        assertFalse(f.looksLikeISO8601("12345"));     // length ok & digits ok but charAt(4) != '-'
        assertFalse(f.looksLikeISO8601("abcd-"));     // charAt(0) not digit
        assertTrue(f.looksLikeISO8601("1234-"));       // all AND-conditions satisfied
        assertTrue(f.looksLikeISO8601("2020-01-01"));  // realistic case
    }

    // =========================================================
    // parseAsISO8601 (protected) - direct branch testing
    // =========================================================

    @Test
    public void testParseAsISO8601PlainDateBranch() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2020, 1, 1, 0, 0, 0, 0);
    }

    @Test
    public void testParseAsISO8601ZBranch_MillisAlreadyPresent() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T10:20:30.123Z", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2020, 1, 1, 10, 20, 30, 123);
    }

    @Test
    public void testParseAsISO8601ZBranch_MillisInserted() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T10:20:30Z", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2020, 1, 1, 10, 20, 30, 0);
    }

    @Test
    public void testParseAsISO8601TimeZoneBranch_ColonOffsetRemoved() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T00:00:00.000+01:00", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2019, 12, 31, 23, 0, 0, 0); // +01:00 -> -1h UTC
    }

    @Test
    public void testParseAsISO8601TimeZoneBranch_MissingMinutesAppended() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        // offset "+01" -> code appends "00" -> becomes "+0100"
        Date d = f.parseAsISO8601("2020-01-01T00:00:00.000+01", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2019, 12, 31, 23, 0, 0, 0);
    }

    @Test
    public void testParseAsISO8601TimeZoneBranch_FullOffsetNoModificationNeeded() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T00:00:00.000+0100", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2019, 12, 31, 23, 0, 0, 0);
    }

    @Test
    public void testParseAsISO8601NoTimeZoneBranch_ZAppended() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T10:20:30", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2020, 1, 1, 10, 20, 30, 0);
    }

    @Test
    public void testParseAsISO8601NoTimeZoneBranch_PartialMillisSwitchCase10() throws ParseException {
        // time portion "10:20:30.1" -> timeLen==10 -> switch case 10 falls through to case 9
        // NOTE: cases 11 / 7 / 6 / 5 of this switch are NOT exercised here due to the
        // combinatorial complexity of constructing exact-length input strings; this is
        // explicitly called out per requirement #4 (no guessing of un-verified behavior).
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsISO8601("2020-01-01T10:20:30.1", new ParsePosition(0), true);
        assertDateEqualsUTC(d, 2020, 1, 1, 10, 20, 30, 100);
    }

    @Test(expected = ParseException.class)
    public void testParseAsISO8601InvalidThrowsParseException() throws ParseException {
        StdDateFormat f = new StdDateFormat();
        // "looks like" ISO8601 due to pattern digit,digit,digit,'-' but not a real date
        f.parseAsISO8601("1234-", new ParsePosition(0), true);
    }

    // =========================================================
    // parseAsRFC1123 (protected) - direct branch testing
    // =========================================================

    @Test
    public void testParseAsRFC1123Valid() {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsRFC1123("Sun, 06 Nov 1994 08:49:37 GMT", new ParsePosition(0));
        assertNotNull(d);
        assertDateEqualsUTC(d, 1994, 11, 6, 8, 49, 37, 0);
    }

    @Test
    public void testParseAsRFC1123InvalidReturnsNull() {
        StdDateFormat f = new StdDateFormat();
        Date d = f.parseAsRFC1123("not a date", new ParsePosition(0));
        assertNull(d);
    }

    // =========================================================
    // parse(String) - public dispatcher, full branch coverage
    // =========================================================

    @Test(expected = NullPointerException.class)
    public void testParseNullThrowsNPE() throws ParseException {
        new StdDateFormat().parse(null); // dateStr.trim() on null
    }

    // FAULT: dateStr.charAt(0) evaluated on empty string inside numeric-check condition
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseEmptyStringThrowsIndexException() throws ParseException {
        new StdDateFormat().parse("");
    }

    // FAULT: Long.parseLong("-") fails because '-' alone is treated as "all digits, negative"
    @Test(expected = NumberFormatException.class)
    public void testParseSingleMinusThrowsNumberFormatException() throws ParseException {
        new StdDateFormat().parse("-");
    }

    @Test
    public void testParseSimpleTimestamp() throws ParseException {
        Date d = new StdDateFormat().parse("1234567890123");
        assertEquals(1234567890123L, d.getTime());
    }

    @Test
    public void testParseNegativeTimestamp() throws ParseException {
        Date d = new StdDateFormat().parse("-123456");
        assertEquals(-123456L, d.getTime());
    }

    @Test
    public void testParseShortPureDigits() throws ParseException {
        Date d = new StdDateFormat().parse("1234");
        assertEquals(1234L, d.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseNonNumericNonISOThrowsParseException() throws ParseException {
        new StdDateFormat().parse("hello");
    }

    @Test(expected = ParseException.class)
    public void testParseOverLongNumberFallsBackToRfcAndFails() throws ParseException {
        // Too large for long-range check, not starting with '-', falls back to RFC1123
        // which also fails to parse -> ParseException
        new StdDateFormat().parse("99999999999999999999");
    }

    @Test
    public void testParseRFC1123ThroughPublicApi() throws ParseException {
        Date d = new StdDateFormat().parse("Sun, 06 Nov 1994 08:49:37 GMT");
        assertDateEqualsUTC(d, 1994, 11, 6, 8, 49, 37, 0);
    }

    @Test
    public void testParseISO8601ThroughPublicApi() throws ParseException {
        Date d = new StdDateFormat().parse("2020-01-01T10:20:30.123Z");
        assertDateEqualsUTC(d, 2020, 1, 1, 10, 20, 30, 123);
    }

    @Test
    public void testParseTrimsWhitespace() throws ParseException {
        Date d = new StdDateFormat().parse("  1234567890123  ");
        assertEquals(1234567890123L, d.getTime());
    }

    // =========================================================
    // parse(String, ParsePosition)
    // =========================================================

    @Test
    public void testParseWithParsePositionISO8601() {
        Date d = new StdDateFormat().parse("2020-01-01T10:20:30.123Z", new ParsePosition(0));
        assertNotNull(d);
    }

    @Test
    public void testParseWithParsePositionTimestamp() {
        Date d = new StdDateFormat().parse("1234567890123", new ParsePosition(0));
        assertNotNull(d);
        assertEquals(1234567890123L, d.getTime());
    }

    @Test
    public void testParseWithParsePositionRFC1123() {
        Date d = new StdDateFormat().parse("Sun, 06 Nov 1994 08:49:37 GMT", new ParsePosition(0));
        assertNotNull(d);
    }

    @Test
    public void testParseWithParsePositionInvalidReturnsNull() {
        Date d = new StdDateFormat().parse("not a date", new ParsePosition(0));
        assertNull(d);
    }

    // =========================================================
    // format()
    // =========================================================

    @Test
    public void testFormatEpochUTC_firstCallCreatesFormatter() {
        StdDateFormat f = new StdDateFormat();
        StringBuffer sb = f.format(new Date(0), new StringBuffer(), new FieldPosition(0));
        assertEquals("1970-01-01T00:00:00.000+0000", sb.toString());
    }

    @Test
    public void testFormatCalledTwiceReusesCachedFormatter() {
        StdDateFormat f = new StdDateFormat();
        String first  = f.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString();
        String second = f.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString();
        assertEquals(first, second);
    }

    @Test
    public void testFormatWithFixedOffsetTimeZone() {
        StdDateFormat f = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        String out = f.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString();
        assertEquals("1970-01-01T02:00:00.000+0200", out);
    }

    // =========================================================
    // toString / equals / hashCode
    // =========================================================

    @Test
    public void testToStringWithoutTimeZone() {
        StdDateFormat f = new StdDateFormat();
        String s = f.toString();
        assertTrue(s.contains("locale:"));
        assertFalse(s.contains("timezone:"));
    }

    @Test
    public void testToStringWithTimeZone() {
        StdDateFormat f = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
        String s = f.toString();
        assertTrue(s.contains("timezone:"));
        assertTrue(s.contains("locale:"));
    }

    @Test
    public void testEqualsIdentityOnlyBranches() {
        StdDateFormat f1 = new StdDateFormat();
        StdDateFormat f2 = new StdDateFormat();
        assertTrue(f1.equals(f1));
        assertFalse(f1.equals(f2));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("not a date format"));
    }

    @Test
    public void testHashCodeIsIdentityHash() {
        StdDateFormat f = new StdDateFormat();
        assertEquals(System.identityHashCode(f), f.hashCode());
    }

    // =========================================================
    // _clearFormats (protected)
    // =========================================================

    @Test
    public void testClearFormatsDoesNotBreakSubsequentFormat() {
        StdDateFormat f = new StdDateFormat();
        f.format(new Date(0), new StringBuffer(), new FieldPosition(0));
        f._clearFormats(); // force cached formatters to null
        String out = f.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString();
        assertEquals("1970-01-01T00:00:00.000+0000", out);
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorTimeZoneIsNullUntilSet` | default constructor, `_timezone` เริ่มต้นเป็น null |
| `testGetDefaultTimeZoneIsUTC` | static field `DEFAULT_TIMEZONE` |
| `testWithTimeZoneNullUsesDefaultUTC` | `withTimeZone`: `tz==null` branch |
| `testWithTimeZoneSameReturnsSameInstance` | `withTimeZone`: `tz==_timezone` → return `this` |
| `testWithTimeZoneDifferentReturnsNewInstance` | `withTimeZone`: สร้าง instance ใหม่ |
| `testWithLocaleSameReturnsSameInstance` | `withLocale`: `loc.equals(_locale)` true |
| `testWithLocaleDifferentReturnsNewInstance` | `withLocale`: false branch |
| `testCloneProducesDistinctButFieldEquivalentInstance` | `clone()` + `equals()` identity |
| `testGetISO8601FormatVariants` | `getISO8601Format` deprecated/overload, `_cloneFormat` (locale≠default, tz==null) |
| `testGetRFC1123FormatVariants` | `getRFC1123Format` deprecated/overload |
| `testSetTimeZoneChangesValueWhenDifferent` | `setTimeZone`: `!tz.equals(_timezone)` true → `_clearFormats()` |
| `testSetTimeZoneNullThrowsNPE` | **fault**: `tz==null` → NPE |
| `testSetLenientAndIsLenientBranches` | `setLenient` เปลี่ยน/ไม่เปลี่ยนค่า, `isLenient` null/non-null |
| `testLooksLikeISO8601Branches` | ทุก sub-condition ของ `looksLikeISO8601` |
| `testParseAsISO8601PlainDateBranch` | `len<=10 && isDigit` → plain date |
| `testParseAsISO8601ZBranch_MillisAlreadyPresent` | `c=='Z'`, `charAt(len-4)!=':'` |
| `testParseAsISO8601ZBranch_MillisInserted` | `c=='Z'`, `charAt(len-4)==':'` → insert ms |
| `testParseAsISO8601TimeZoneBranch_ColonOffsetRemoved` | `hasTimeZone` true, `c==':'` |
| `testParseAsISO8601TimeZoneBranch_MissingMinutesAppended` | `hasTimeZone` true, `c=='+'` → append "00" |
| `testParseAsISO8601TimeZoneBranch_FullOffsetNoModificationNeeded` | `hasTimeZone` true, timeLen==12 (no switch insert) |
| `testParseAsISO8601NoTimeZoneBranch_ZAppended` | `hasTimeZone` false, default switch-case |
| `testParseAsISO8601NoTimeZoneBranch_PartialMillisSwitchCase10` | switch case 10→9 fallthrough |
| `testParseAsISO8601InvalidThrowsParseException` | `df.parse()==null` → throw ParseException |
| `testParseAsRFC1123Valid` / `Invalid` | `parseAsRFC1123` success/fail (null) |
| `testParseNullThrowsNPE` | `parse(String)`: null input |
| `testParseEmptyStringThrowsIndexException` | **fault**: empty string edge case |
| `testParseSingleMinusThrowsNumberFormatException` | **fault**: `"-"` edge case |
| `testParseSimpleTimestamp` / `Negative` / `ShortPureDigits` | ตัวเลขล้วน, ลบ, บวก |
| `testParseNonNumericNonISOThrowsParseException` | ไม่ใช่ ISO ไม่ใช่ตัวเลข → RFC1123 fail |
| `testParseOverLongNumberFallsBackToRfcAndFails` | `NumberInput.inLongRange` false |
| `testParseRFC1123ThroughPublicApi` / `ISO8601ThroughPublicApi` | full dispatch via `parse(String)` |
| `testParseTrimsWhitespace` | `dateStr.trim()` |
| `testParseWithParsePosition*` | `parse(String,ParsePosition)` ทุก branch หลัก |
| `testFormatEpochUTC_firstCallCreatesFormatter` | `_formatISO8601==null` branch |
| `testFormatCalledTwiceReusesCachedFormatter` | `_formatISO8601!=null` branch |
| `testFormatWithFixedOffsetTimeZone` | `_cloneFormat` tz≠null, locale=default |
| `testToStringWithoutTimeZone` / `WithTimeZone` | `tz!=null` if/else ใน `toString` |
| `testEqualsIdentityOnlyBranches` | `equals`: self / other / null / อื่น type |
| `testHashCodeIsIdentityHash` | `hashCode()` |
| `testClearFormatsDoesNotBreakSubsequentFormat` | `_clearFormats()` |

**ข้อจำกัดที่ระบุไว้ (ตามข้อ 4):** switch-case บางกรณีใน `parseAsISO8601` (timeLen = 11, 7, 6, 5) ไม่ได้ทดสอบครบทุกกรณี เนื่องจากต้องคำนวณความยาว string อย่างละเอียดมาก และมีความเสี่ยงสูงต่อการ "เดา" behavior — จึงระบุไว้เป็นคอมเมนต์ในโค้ดแทนการสมมติผลลัพธ์