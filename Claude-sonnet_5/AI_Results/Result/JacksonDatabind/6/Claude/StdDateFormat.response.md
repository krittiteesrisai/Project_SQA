# วิเคราะห์และออกแบบ Test Case

ผมวิเคราะห์ branch/condition ทั้งหมดในซอร์สโค้ด `StdDateFormat` แล้วออกแบบ test ให้ครอบคลุมทุก if/else ที่ตรวจสอบได้ โดยวางคลาสทดสอบไว้ใน package เดียวกับ target class (`com.fasterxml.jackson.databind.util`) เพื่อให้เข้าถึง `protected` method (`looksLikeISO8601`, `parseAsISO8601`, `parseAsRFC1123`) ได้โดยตรงสำหรับ white-box testing

**ข้อสังเกตสำคัญ (derived from source, ไม่ใช่การเดา):** ใน `parse(String,ParsePosition)` เมื่ออินพุตเป็น `"-"` ตัวเดียว loop จะจบด้วย `i == -1` (ถือว่า "all digits") แล้วเช็ค `dateStr.charAt(0)=='-'` เป็น `true` จึงเรียก `Long.parseLong("-")` ซึ่ง**ต้อง**โยน `NumberFormatException` แน่นอนตามลอจิก — เขียน test ไว้เพื่อ "ดักจับ" พฤติกรรมนี้

```java
package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

/**
 * Unit tests for {@link StdDateFormat}.
 *
 * Placed in the same package as the target class so protected helper
 * methods (looksLikeISO8601 / parseAsISO8601 / parseAsRFC1123) can be
 * exercised directly for finer-grained branch coverage.
 */
public class StdDateFormatTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testDefaultConstructor_localeUS_timezoneNull() {
        StdDateFormat fmt = new StdDateFormat();
        String s = fmt.toString();
        assertTrue(s.contains("locale: " + Locale.US));
        // _timezone starts null -> toString() must NOT contain "timezone:"
        assertFalse(s.contains("timezone:"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedTimeZoneConstructor() {
        TimeZone tz = TimeZone.getTimeZone("America/Chicago");
        StdDateFormat fmt = new StdDateFormat(tz);
        String s = fmt.toString();
        assertTrue(s.contains("timezone:"));
        assertTrue(s.contains("locale: " + Locale.US));
    }

    @Test
    public void testTimeZoneLocaleConstructor() {
        TimeZone tz = TimeZone.getTimeZone("America/Chicago");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.GERMANY);
        String s = fmt.toString();
        assertTrue(s.contains("timezone:"));
        assertTrue(s.contains("locale: " + Locale.GERMANY));
    }

    @Test
    public void testGetDefaultTimeZone() {
        assertEquals(TimeZone.getTimeZone("GMT"), StdDateFormat.getDefaultTimeZone());
    }

    // =====================================================================
    // withTimeZone(tz) : branches -> tz==null? / tz.equals(_timezone)?
    // =====================================================================

    @Test
    public void testWithTimeZone_null_createsNewInstanceWithDefaultTz() {
        StdDateFormat base = new StdDateFormat(); // _timezone == null
        StdDateFormat result = base.withTimeZone(null);
        // tz becomes DEFAULT_TIMEZONE; DEFAULT_TIMEZONE.equals(null) == false -> new instance
        assertNotSame(base, result);
        assertTrue(result.toString().contains("timezone:"));
    }

    @Test
    public void testWithTimeZone_sameTz_returnsThis() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        StdDateFormat base = new StdDateFormat(tz, Locale.US);
        StdDateFormat result = base.withTimeZone(tz);
        assertSame(base, result);
    }

    @Test
    public void testWithTimeZone_differentTz_returnsNewInstance() {
        StdDateFormat base = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.US);
        StdDateFormat result = base.withTimeZone(TimeZone.getTimeZone("America/Chicago"));
        assertNotSame(base, result);
    }

    // =====================================================================
    // withLocale(loc) : branch -> loc.equals(_locale)?
    // =====================================================================

    @Test
    public void testWithLocale_same_returnsThis() {
        StdDateFormat base = new StdDateFormat(null, Locale.US);
        StdDateFormat result = base.withLocale(Locale.US);
        assertSame(base, result);
    }

    @Test
    public void testWithLocale_different_returnsNewInstance() {
        StdDateFormat base = new StdDateFormat(null, Locale.US);
        StdDateFormat result = base.withLocale(Locale.GERMANY);
        assertNotSame(base, result);
        assertTrue(result.toString().contains("locale: " + Locale.GERMANY));
    }

    // =====================================================================
    // clone()
    // =====================================================================

    @Test
    public void testClone_returnsNewEquivalentInstance() {
        StdDateFormat base = new StdDateFormat(TimeZone.getTimeZone("America/Chicago"), Locale.GERMANY);
        StdDateFormat cloned = base.clone();
        assertNotSame(base, cloned);
        assertEquals(base.toString(), cloned.toString());
    }

    // =====================================================================
    // Static factory methods & private _cloneFormat branches:
    //   loc.equals(DEFAULT_LOCALE)? , tz == null?
    // =====================================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testGetBlueprintISO8601Format_notNull() {
        assertNotNull(StdDateFormat.getBlueprintISO8601Format());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetBlueprintRFC1123Format_notNull() {
        assertNotNull(StdDateFormat.getBlueprintRFC1123Format());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetISO8601Format_deprecatedTzOnly() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("GMT"));
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_nonDefaultLocale_nullTz() {
        // loc != DEFAULT_LOCALE -> "new SimpleDateFormat" branch; tz==null -> DEFAULT_TIMEZONE used
        DateFormat df = StdDateFormat.getISO8601Format(null, Locale.GERMANY);
        assertNotNull(df);
        assertEquals(GMT, df.getTimeZone());
    }

    @Test
    public void testGetISO8601Format_nonDefaultLocale_nonNullTz() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("America/Chicago"), Locale.GERMANY);
        assertNotNull(df);
        assertEquals(TimeZone.getTimeZone("America/Chicago"), df.getTimeZone());
    }

    @Test
    public void testGetISO8601Format_defaultLocale_nonNullTz() {
        // loc == DEFAULT_LOCALE -> clone branch; tz != null -> setTimeZone called
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("America/Chicago"), Locale.US);
        assertNotNull(df);
        assertEquals(TimeZone.getTimeZone("America/Chicago"), df.getTimeZone());
    }

    @Test
    public void testGetISO8601Format_defaultLocale_nullTz() {
        // clone branch; tz == null -> setTimeZone NOT called, keeps GMT from static blueprint
        DateFormat df = StdDateFormat.getISO8601Format(null, Locale.US);
        assertNotNull(df);
        assertEquals(GMT, df.getTimeZone());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetRFC1123Format_deprecatedTzOnly() {
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testGetRFC1123Format_tzAndLocale() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("America/Chicago"), Locale.US);
        assertNotNull(df);
        assertEquals(TimeZone.getTimeZone("America/Chicago"), df.getTimeZone());
    }

    // =====================================================================
    // setTimeZone(tz) : branch -> !tz.equals(_timezone)
    // =====================================================================

    @Test
    public void testSetTimeZone_differentTz_resetsAndAppliesNewZone() {
        StdDateFormat fmt = new StdDateFormat(); // _timezone == null
        fmt.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        String out = fmt.format(new Date(0L));
        assertNotNull(out);
        // Offset differs from GMT-based rendering
        assertFalse(out.startsWith("1970-01-01T00:00:00.000+0000"));
    }

    @Test
    public void testSetTimeZone_sameTz_noChange() {
        StdDateFormat fmt = new StdDateFormat(GMT, Locale.US);
        fmt.setTimeZone(GMT); // equals -> branch skipped, no reset
        String out = fmt.format(new Date(0L));
        assertTrue(out.startsWith("1970-01-01T00:00:00.000+0000"));
    }

    // =====================================================================
    // toString()
    // =====================================================================

    @Test
    public void testToString_nullTimezone_noTimezoneSegment() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.toString().contains("timezone:"));
    }

    @Test
    public void testToString_nonNullTimezone_hasTimezoneSegment() {
        StdDateFormat fmt = new StdDateFormat(GMT, Locale.US);
        assertTrue(fmt.toString().contains("timezone:"));
    }

    // =====================================================================
    // looksLikeISO8601(String) - protected, direct call
    // =====================================================================

    @Test
    public void testLooksLikeISO8601_true() {
        StdDateFormat fmt = new StdDateFormat();
        assertTrue(fmt.looksLikeISO8601("2020-01-01"));
    }

    @Test
    public void testLooksLikeISO8601_trueBoundaryLength5() {
        StdDateFormat fmt = new StdDateFormat();
        assertTrue(fmt.looksLikeISO8601("2020-")); // len == 5 exactly
    }

    @Test
    public void testLooksLikeISO8601_falseTooShort() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601("2020")); // len == 4 < 5
    }

    @Test
    public void testLooksLikeISO8601_falseNonDigitStart() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601("Tue, 01"));
    }

    @Test
    public void testLooksLikeISO8601_falseNoDashAtIndex4() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601("20200101"));
    }

    // =====================================================================
    // parse(String, ParsePosition) - main dispatch branches
    // =====================================================================

    private Date parseHelper(String input) {
        StdDateFormat fmt = new StdDateFormat();
        return fmt.parse(input, new ParsePosition(0));
    }

    private void assertUTC(Date d, int year, int month, int day,
                            int hour, int min, int sec, int millis) {
        Calendar cal = new GregorianCalendar(GMT);
        cal.setTime(d);
        assertEquals("year", year, cal.get(Calendar.YEAR));
        assertEquals("month", month, cal.get(Calendar.MONTH) + 1);
        assertEquals("day", day, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals("hour", hour, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals("min", min, cal.get(Calendar.MINUTE));
        assertEquals("sec", sec, cal.get(Calendar.SECOND));
        assertEquals("millis", millis, cal.get(Calendar.MILLISECOND));
    }

    // --- plain date (len<=10 && digit last char) ---
    @Test
    public void testParse_plainDate() {
        Date d = parseHelper("2020-01-01");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 0, 0, 0, 0);
    }

    // --- Zulu 'Z' branch, missing millis (charAt(len-4)==':') ---
    @Test
    public void testParse_iso8601Zulu_missingMillis() {
        Date d = parseHelper("2020-01-01T10:20:30Z");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 10, 20, 30, 0);
    }

    // --- Zulu 'Z' branch, already has millis ---
    @Test
    public void testParse_iso8601Zulu_withMillis() {
        Date d = parseHelper("2020-01-01T10:20:30.123Z");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 10, 20, 30, 123);
    }

    // --- hasTimeZone==true, colon offset -> remove colon ---
    @Test
    public void testParse_iso8601Offset_withColon() {
        Date d = parseHelper("2020-01-01T10:20:30+01:00");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 9, 20, 30, 0);
    }

    // --- hasTimeZone==true, sign only (missing minutes) -> append "00" ---
    @Test
    public void testParse_iso8601Offset_missingMinutes() {
        Date d = parseHelper("2020-01-01T10:20:30+01");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 9, 20, 30, 0);
    }

    // --- hasTimeZone==true, full 4-digit offset no colon, missing millis ---
    @Test
    public void testParse_iso8601OffsetNoColon_missingMillis() {
        Date d = parseHelper("2020-01-01T10:20:30+0100");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 9, 20, 30, 0);
    }

    // --- hasTimeZone==true, full offset no colon, already has millis ---
    @Test
    public void testParse_iso8601OffsetNoColon_hasMillis() {
        Date d = parseHelper("2020-01-01T10:20:30.500+0100");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 9, 20, 30, 500);
    }

    // --- hasTimeZone==false, missing millis (timeLen<=8) -> append ".000Z" ---
    @Test
    public void testParse_iso8601NoTimezone_missingMillis() {
        Date d = parseHelper("2020-01-01T10:20:30");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 10, 20, 30, 0);
    }

    // --- hasTimeZone==false, already has millis -> just append 'Z' ---
    @Test
    public void testParse_iso8601NoTimezone_hasMillis() {
        Date d = parseHelper("2020-01-01T10:20:30.250");
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 10, 20, 30, 250);
    }

    // --- numeric-string branch: positive, within long range ---
    @Test
    public void testParse_numericTimestamp_positive() {
        Date d = parseHelper("1000");
        assertNotNull(d);
        assertEquals(1000L, d.getTime());
    }

    // --- numeric-string branch: negative (dateStr.charAt(0)=='-') ---
    @Test
    public void testParse_numericTimestamp_negative() {
        Date d = parseHelper("-1000");
        assertNotNull(d);
        assertEquals(-1000L, d.getTime());
    }

    // --- all digits, NOT in long range, not starting with '-' -> falls back to RFC1123 (fails -> null) ---
    @Test
    public void testParse_numericTooLarge_fallsBackToRFC1123AndFails() {
        String huge = "123456789012345678901234567890"; // 30 digits
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse(huge, new ParsePosition(0));
        assertNull(d);
    }

    // --- non-ISO8601, non all-digit -> RFC1123 branch, valid string ---
    @Test
    public void testParse_rfc1123_valid() {
        Date d = parseHelper("Wed, 01 Jan 2020 10:20:30 GMT"); // 2020-01-01 is Wednesday
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 10, 20, 30, 0);
    }

    // --- non-ISO8601, non all-digit, not parseable by RFC1123 -> returns null (no exception thrown here) ---
    @Test
    public void testParse_invalidNonParseable_returnsNull() {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("not a date at all", new ParsePosition(0));
        assertNull(d);
    }

    /*
     * Edge case derived directly from source-code analysis (not a guess):
     * for input "-" the scanning loop ends with i == -1 (treated as
     * "all digits"), then dateStr.charAt(0)=='-' evaluates to true,
     * causing Long.parseLong("-") to be invoked, which throws
     * NumberFormatException. This test documents/asserts that exact
     * behavior of the given source.
     */
    @Test(expected = NumberFormatException.class)
    public void testParse_loneDash_throwsNumberFormatException() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.parse("-", new ParsePosition(0));
    }

    // =====================================================================
    // Caching branches inside parseAsISO8601 (df == null ? create : reuse)
    // =====================================================================

    @Test
    public void testParseAsISO8601_cachesPlainFormatter_onRepeatedCalls() {
        StdDateFormat fmt = new StdDateFormat();
        Date d1 = fmt.parse("2020-01-01", new ParsePosition(0));
        Date d2 = fmt.parse("2021-06-15", new ParsePosition(0));
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotEquals(d1.getTime(), d2.getTime());
    }

    @Test
    public void testParseAsISO8601_cachesZuluFormatter_onRepeatedCalls() {
        StdDateFormat fmt = new StdDateFormat();
        Date d1 = fmt.parse("2020-01-01T10:20:30Z", new ParsePosition(0));
        Date d2 = fmt.parse("2020-06-15T11:22:33Z", new ParsePosition(0));
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotEquals(d1.getTime(), d2.getTime());
    }

    @Test
    public void testParseAsISO8601_cachesOffsetFormatter_onRepeatedCalls() {
        StdDateFormat fmt = new StdDateFormat();
        Date d1 = fmt.parse("2020-01-01T10:20:30+01:00", new ParsePosition(0));
        Date d2 = fmt.parse("2020-06-15T11:22:33+02:00", new ParsePosition(0));
        assertNotNull(d1);
        assertNotNull(d2);
    }

    @Test
    public void testParseAsISO8601_cachesNoTimezoneFormatter_onRepeatedCalls() {
        StdDateFormat fmt = new StdDateFormat();
        Date d1 = fmt.parse("2020-01-01T10:20:30", new ParsePosition(0));
        Date d2 = fmt.parse("2020-06-15T11:22:33", new ParsePosition(0));
        assertNotNull(d1);
        assertNotNull(d2);
    }

    // =====================================================================
    // parse(String) - public throwing variant
    // =====================================================================

    @Test
    public void testParseString_validTrimmed() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("  2020-01-01  "); // leading/trailing whitespace
        assertNotNull(d);
        assertUTC(d, 2020, 1, 1, 0, 0, 0, 0);
    }

    @Test
    public void testParseString_invalid_throwsParseExceptionWithAllFormats() {
        StdDateFormat fmt = new StdDateFormat();
        try {
            fmt.parse("not-a-real-date-string-at-all-xyz");
            fail("Expected ParseException");
        } catch (ParseException e) {
            String msg = e.getMessage();
            assertTrue(msg.contains("Can not parse date"));
            assertTrue(msg.contains(StdDateFormat.DATE_FORMAT_STR_ISO8601));
            assertTrue(msg.contains(StdDateFormat.DATE_FORMAT_STR_ISO8601_Z));
            assertTrue(msg.contains(StdDateFormat.DATE_FORMAT_STR_RFC1123));
            assertTrue(msg.contains(StdDateFormat.DATE_FORMAT_STR_PLAIN));
        }
    }

    // =====================================================================
    // format(Date, StringBuffer, FieldPosition)
    // =====================================================================

    @Test
    public void testFormat_producesExpectedISOPattern() {
        StdDateFormat fmt = new StdDateFormat();
        String out = fmt.format(new Date(0L));
        assertEquals("1970-01-01T00:00:00.000+0000", out);
    }

    @Test
    public void testFormat_cachesISO8601Formatter_onRepeatedCalls() {
        // First call: _formatISO8601 == null -> created.
        // Second call: _formatISO8601 != null -> reused (branch skipped).
        StdDateFormat fmt = new StdDateFormat();
        String out1 = fmt.format(new Date(0L));
        String out2 = fmt.format(new Date(123456789L));
        assertNotNull(out1);
        assertNotNull(out2);
        assertNotEquals(out1, out2);
    }

    // =====================================================================
    // parseAsRFC1123(String, ParsePosition) - protected, direct call, caching
    // =====================================================================

    @Test
    public void testParseAsRFC1123_cachesFormatter_onRepeatedCalls() {
        StdDateFormat fmt = new StdDateFormat();
        Date d1 = fmt.parseAsRFC1123("Wed, 01 Jan 2020 10:20:30 GMT", new ParsePosition(0));
        Date d2 = fmt.parseAsRFC1123("Thu, 02 Jan 2020 11:21:31 GMT", new ParsePosition(0));
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotEquals(d1.getTime(), d2.getTime());
    }
}
```

# สรุปตาราง Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_* | Constructor เริ่มต้น: `_timezone=null`, `_locale=US` |
| testDeprecatedTimeZoneConstructor | Constructor `(TimeZone)` deprecated เรียก `this(tz, DEFAULT_LOCALE)` |
| testTimeZoneLocaleConstructor | Constructor `(TimeZone, Locale)` ตรง ๆ |
| testGetDefaultTimeZone | ค่า static `DEFAULT_TIMEZONE` |
| testWithTimeZone_null_* | `withTimeZone`: `tz==null` → true |
| testWithTimeZone_sameTz_* | `withTimeZone`: `tz.equals(_timezone)` → true (return this) |
| testWithTimeZone_differentTz_* | `withTimeZone`: `tz.equals(_timezone)` → false (new instance) |
| testWithLocale_same_* / different_* | `withLocale`: `loc.equals(_locale)` true/false |
| testClone_* | `clone()` สร้าง instance ใหม่ |
| testGetBlueprint*Format | Static blueprint accessor deprecated methods |
| testGetISO8601Format_* (4 tests) | `_cloneFormat`: `loc.equals(DEFAULT_LOCALE)` × `tz==null` ครบ 4 combination |
| testGetRFC1123Format_* | RFC1123 factory + `_cloneFormat` (clone branch, tz!=null) |
| testSetTimeZone_differentTz_* | `setTimeZone`: `!tz.equals(_timezone)` → true (reset) |
| testSetTimeZone_sameTz_* | `setTimeZone`: เงื่อนไข false (skip reset) |
| testToString_nullTimezone / nonNull | `toString()`: `tz!=null` true/false |
| testLooksLikeISO8601_* (5 tests) | ทุกเงื่อนไขย่อยของ `looksLikeISO8601` (length, digit(0), digit(3), dash@4) รวม boundary len=5 |
| testParse_plainDate | `parseAsISO8601`: `len<=10 && isDigit(last)` → true |
| testParse_iso8601Zulu_missingMillis / withMillis | `c=='Z'` branch + sub-condition `charAt(len-4)==':'` true/false |
| testParse_iso8601Offset_withColon | `hasTimeZone==true`, `c==':'` (ลบ colon) |
| testParse_iso8601Offset_missingMinutes | `hasTimeZone==true`, `c=='+'/'-' ` (append "00") |
| testParse_iso8601OffsetNoColon_missingMillis / hasMillis | offset เต็ม 4 หลัก (no-op branch) + sub-condition digit-check millis true/false |
| testParse_iso8601NoTimezone_missingMillis / hasMillis | `hasTimeZone==false`, `timeLen<=8` true/false |
| testParse_numericTimestamp_positive / negative | loop scan ตัวเลขทั้งหมด: `charAt(0)=='-'`  หรือ `inLongRange` true |
| testParse_numericTooLarge_fallsBackToRFC1123AndFails | all-digit แต่เกิน long range, ไม่ขึ้นต้นด้วย '-' → fallback RFC1123 (fail→null) |
| testParse_rfc1123_valid | loop break (มีตัวอักษรไม่ใช่เลข) → RFC1123 parse สำเร็จ |
| testParse_invalidNonParseable_returnsNull | RFC1123 parse ล้มเหลว → คืน null (ไม่ throw) |
| testParse_loneDash_throwsNumberFormatException | Edge case: loop จบที่ `i==-1` ด้วย `"-"` เดี่ยว → NumberFormatException (derived from code) |
| testParseAsISO8601_caches*_onRepeatedCalls (4 tests) | branch `df==null` false (ใช้ formatter ที่ cache ไว้) สำหรับ plain/zulu/offset/no-timezone |
| testParseString_validTrimmed | `parse(String)`: `dateStr.trim()` แล้ว parse สำเร็จ |
| testParseString_invalid_throws* | `parse(String)`: throw `ParseException` พร้อมข้อความรวมทุก `ALL_FORMATS` |
| testFormat_producesExpectedISOPattern | `format()`: `_formatISO8601==null` → true (สร้างใหม่) |
| testFormat_cachesISO8601Formatter_onRepeatedCalls | `format()`: branch false ครั้งที่ 2 (ใช้ cache) |
| testParseAsRFC1123_cachesFormatter_onRepeatedCalls | `parseAsRFC1123`: `_formatRFC1123==null` true ครั้งแรก, false ครั้งที่สอง |

**หมายเหตุ:** เมธอด `hasTimeZone(String)` เป็น `private static` จึงไม่สามารถเรียกตรงได้ในคลาสทดสอบ (แม้อยู่ package เดียวกัน) — ครอบคลุมแบบ black-box ผ่านอินพุตของ `parse()`/`parseAsISO8601()` ที่กระตุ้นทุกสาขาที่สำคัญของมันแทน