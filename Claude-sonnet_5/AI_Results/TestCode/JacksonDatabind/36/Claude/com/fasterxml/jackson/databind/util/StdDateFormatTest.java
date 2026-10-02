package com.fasterxml.jackson.databind.util.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class StdDateFormatTest {

    // ==========================================================
    // Group A: parse(String) - throwing variant
    // ==========================================================

    @Test(expected = NullPointerException.class)
    public void testParseNull_throwsNPE() throws ParseException {
        // dateStr.trim() ถูกเรียกทันทีโดยไม่เช็ค null -> NPE
        new StdDateFormat().parse(null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testParseEmptyString_throwsIndexOutOfBounds() throws ParseException {
        // looksLikeISO8601("") = false (len<5) -> ตกไป numeric scan -> i = -1
        // แล้ว dateStr.charAt(0) บน "" -> IndexOutOfBoundsException (พฤติกรรมปัจจุบันของซอร์ส)
        new StdDateFormat().parse("");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testParseWhitespaceOnly_throwsIndexOutOfBounds() throws ParseException {
        // trim() ทำให้กลายเป็น "" แล้วพบปัญหาเดียวกับด้านบน
        new StdDateFormat().parse("   ");
    }

    @Test
    public void testParsePlainDate() throws ParseException {
        // len<=10 และ char สุดท้ายเป็นเลข -> branch "plain date"
        Date d = new StdDateFormat().parse("1970-01-01");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601WithZNoMillis() throws ParseException {
        // c == 'Z' และ charAt(len-4)==':' -> insert ".000"
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00Z");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601WithZAndMillis() throws ParseException {
        // c == 'Z' แต่ charAt(len-4) != ':' -> ไม่ insert millis
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000Z");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601WithColonOffset() throws ParseException {
        // hasTimeZone true, charAt(len-3)==':' -> ลบ colon ออก, timeLen สุดท้าย = 12 (ไม่ padding)
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000+00:00");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601WithShortOffsetMissingMinutes() throws ParseException {
        // hasTimeZone true, charAt(len-3)=='+' -> เติม "00" (missing minutes)
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000+00");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601WithFullOffsetNoAdjustment() throws ParseException {
        // hasTimeZone true, charAt(len-3) เป็นเลข -> ไม่ต้อง adjust ใด ๆ, timeLen=12 -> skip padding
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000+0000");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601NoOffsetWithMillis() throws ParseException {
        // hasTimeZone false -> append 'Z' branch, timeLen=12 -> skip switch (else ของ if(len<12))
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseIso8601NoOffsetSecondsOnly() throws ParseException {
        // hasTimeZone false, timeLen=8 -> switch default: append ".000" แล้ว append 'Z'
        Date d = new StdDateFormat().parse("1970-01-01T00:00:30");
        assertEquals(30000L, d.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseIso8601MissingSeconds_throwsParseException() throws ParseException {
        // hasTimeZone false, timeLen=5 -> default case เติมแค่ ".000" (ไม่มี ":ss")
        // ผลคือรูปแบบไม่ตรง pattern "HH:mm:ss.SSS'Z'" -> parse ล้มเหลว -> ParseException
        new StdDateFormat().parse("1970-01-01T00:00");
    }

    @Test
    public void testParseNumericTimestampZero() throws ParseException {
        // i < 0 (ตัวเลขล้วน), NumberInput.inLongRange = true -> new Date(Long.parseLong)
        Date d = new StdDateFormat().parse("0");
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParseNumericTimestampPositive() throws ParseException {
        Date d = new StdDateFormat().parse("1234567");
        assertEquals(1234567L, d.getTime());
    }

    @Test
    public void testParseNumericTimestampNegative() throws ParseException {
        // charAt(0)=='-' -> เข้า branch numeric ทันทีโดยไม่ต้องเช็ค inLongRange
        Date d = new StdDateFormat().parse("-1000");
        assertEquals(-1000L, d.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseOverflowNumeric_throwsParseException() throws ParseException {
        // i<0 (ตัวเลขล้วน,ไม่มี '-') แต่ NumberInput.inLongRange=false เพราะยาวเกิน long
        // -> ตกไป parseAsRFC1123 ซึ่ง parse ไม่ผ่าน -> dt=null -> throw ParseException
        new StdDateFormat().parse("99999999999999999999999999");
    }

    @Test
    public void testParseRfc1123() throws ParseException {
        // looksLikeISO8601=false, ไม่ใช่ตัวเลขล้วน -> fallback RFC1123
        Date d = new StdDateFormat().parse("Thu, 01 Jan 1970 00:00:00 GMT");
        assertEquals(0L, d.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidGarbage_throwsParseException() throws ParseException {
        new StdDateFormat().parse("not-a-date-at-all");
    }

    @Test
    public void testParseTrimsWhitespace() throws ParseException {
        Date d = new StdDateFormat().parse("  1970-01-01  ");
        assertEquals(0L, d.getTime());
    }

    // ==========================================================
    // Group B: parse(String, ParsePosition) - non throwing variant
    // ==========================================================

    @Test
    public void testParsePos_ValidIso() {
        Date d = new StdDateFormat().parse("1970-01-01T00:00:00.000Z", new ParsePosition(0));
        assertNotNull(d);
        assertEquals(0L, d.getTime());
    }

    @Test
    public void testParsePos_InvalidReturnsNull() {
        Date d = new StdDateFormat().parse("not-a-date-at-all", new ParsePosition(0));
        assertNull(d);
    }

    @Test
    public void testParsePos_NumericTimestamp() {
        Date d = new StdDateFormat().parse("12345", new ParsePosition(0));
        assertNotNull(d);
        assertEquals(12345L, d.getTime());
    }

    @Test
    public void testParsePos_NegativeTimestamp() {
        Date d = new StdDateFormat().parse("-12345", new ParsePosition(0));
        assertNotNull(d);
        assertEquals(-12345L, d.getTime());
    }

    @Test
    public void testParsePos_OverflowNumeric_ReturnsNull() {
        Date d = new StdDateFormat().parse("99999999999999999999999999", new ParsePosition(0));
        assertNull(d);
    }

    @Test
    public void testParsePos_NoTrim_LeadingSpace_ReturnsNull() {
        // เมธอดนี้ *ไม่* trim ต่างจาก parse(String) เพียงตัวเดียว
        // -> looksLikeISO8601=false, ตัวแรกไม่ใช่เลข -> ไม่ใช่ numeric ล้วน -> fallback RFC1123 ล้มเหลว -> null
        Date d = new StdDateFormat().parse(" 1970-01-01", new ParsePosition(0));
        assertNull(d);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testParsePos_EmptyString_ThrowsIndexOutOfBounds() {
        new StdDateFormat().parse("", new ParsePosition(0));
    }

    // ==========================================================
    // Group C: format(...)
    // ==========================================================

    @Test
    public void testFormatDefaultInstanceUTC() {
        String s = new StdDateFormat().format(new Date(0));
        assertEquals("1970-01-01T00:00:00.000+0000", s);
    }

    @Test
    public void testFormatWithCustomTimeZone() {
        StdDateFormat fmt = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        String s = fmt.format(new Date(0));
        assertEquals("1970-01-01T02:00:00.000+0200", s);
    }

    @Test
    public void testFormatCalledTwiceConsistent() {
        // ครอบคลุมทั้ง branch สร้าง cache (df==null) และ branch ใช้ cache ซ้ำ
        StdDateFormat fmt = new StdDateFormat();
        String s1 = fmt.format(new Date(0));
        String s2 = fmt.format(new Date(0));
        assertEquals(s1, s2);
        assertEquals("1970-01-01T00:00:00.000+0000", s2);
    }

    // ==========================================================
    // Group D: static factory methods
    // ==========================================================

    @Test
    public void testGetISO8601Format() {
        String s = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.US)
                .format(new Date(0));
        assertEquals("1970-01-01T00:00:00.000+0000", s);
    }

    @Test
    public void testGetISO8601Format_DeprecatedOverload() {
        @SuppressWarnings("deprecation")
        String s = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC")).format(new Date(0));
        assertEquals("1970-01-01T00:00:00.000+0000", s);
    }

    @Test
    public void testGetISO8601Format_NonDefaultLocaleSameOutput() {
        // ครอบคลุม branch ของ _cloneFormat: loc.equals(DEFAULT_LOCALE)==false -> new SimpleDateFormat
        // pattern ISO8601 ไม่มี token ที่ขึ้นกับ locale จึงควรได้ผลลัพธ์เดียวกัน
        String s = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.GERMANY)
                .format(new Date(0));
        assertEquals("1970-01-01T00:00:00.000+0000", s);
    }

    @Test
    public void testGetRFC1123Format_RoundTrip() throws ParseException {
        java.text.DateFormat fmt = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"), Locale.US);
        Date original = new Date(1234567000L); // ตัดวินาทีที่ลงตัว เพราะ RFC1123 ไม่มี millis
        String s = fmt.format(original);
        Date parsedBack = fmt.parse(s);
        assertEquals(original.getTime(), parsedBack.getTime());
    }

    @Test
    public void testGetRFC1123Format_DeprecatedOverload() throws ParseException {
        @SuppressWarnings("deprecation")
        java.text.DateFormat fmt = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"));
        Date original = new Date(1234567000L);
        String s = fmt.format(original);
        assertEquals(original.getTime(), fmt.parse(s).getTime());
    }

    // ==========================================================
    // Group E: withTimeZone / withLocale / clone
    // ==========================================================

    @Test
    public void testWithTimeZoneNull_DefaultsToUTC_NewInstance() {
        StdDateFormat base = new StdDateFormat(); // _timezone == null
        StdDateFormat result = base.withTimeZone(null);
        assertNotSame(base, result);
        assertEquals(TimeZone.getTimeZone("UTC"), result.getTimeZone());
    }

    @Test
    public void testWithTimeZoneSameByEquals_ReturnsSameInstance() {
        StdDateFormat base = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat again = base.withTimeZone(TimeZone.getTimeZone("UTC"));
        assertSame(base, again);
    }

    @Test
    public void testWithTimeZoneSameReference_ReturnsSameInstance() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        @SuppressWarnings("deprecation")
        StdDateFormat inst = new StdDateFormat(tz, Locale.US);
        StdDateFormat result = inst.withTimeZone(tz); // (tz == _timezone) branch (ref เดียวกัน)
        assertSame(inst, result);
    }

    @Test
    public void testWithLocaleSame_ReturnsSameInstance() {
        StdDateFormat result = StdDateFormat.instance.withLocale(Locale.US);
        assertSame(StdDateFormat.instance, result);
    }

    @Test
    public void testWithLocaleDifferent_NewInstance() {
        StdDateFormat result = StdDateFormat.instance.withLocale(Locale.GERMANY);
        assertNotSame(StdDateFormat.instance, result);
    }

    @Test(expected = NullPointerException.class)
    public void testWithLocaleNull_ThrowsNPE() {
        // loc.equals(_locale) ถูกเรียกโดย loc เป็น null -> NPE
        StdDateFormat.instance.withLocale(null);
    }

    @Test
    public void testClone_NotSameReferenceButEquivalentState() {
        @SuppressWarnings("deprecation")
        StdDateFormat inst = new StdDateFormat(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        StdDateFormat cloned = inst.clone();
        assertNotSame(inst, cloned);
        assertEquals(inst.getTimeZone(), cloned.getTimeZone());
        assertEquals(inst.toString(), cloned.toString());
    }

    // ==========================================================
    // Group F: timezone getter/setter, isLenient, toString
    // ==========================================================

    @Test
    public void testDefaultTimeZoneIsNullInitially() {
        assertNull(new StdDateFormat().getTimeZone());
    }

    @Test
    public void testGetDefaultTimeZoneStatic() {
        assertEquals(TimeZone.getTimeZone("UTC"), StdDateFormat.getDefaultTimeZone());
    }

    @Test
    public void testSetTimeZoneUpdatesGetTimeZone() {
        StdDateFormat inst = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        inst.setTimeZone(tz);
        assertEquals(tz, inst.getTimeZone());
    }

    @Test
    public void testSetTimeZoneSameValue_SkipsReassignment() {
        StdDateFormat inst = new StdDateFormat();
        TimeZone tz1 = TimeZone.getTimeZone("UTC");
        inst.setTimeZone(tz1); // branch true: !tz.equals(_timezone) -> ตั้งค่า
        TimeZone tz2 = TimeZone.getTimeZone("UTC"); // คนละ object แต่ equals กัน
        inst.setTimeZone(tz2); // branch false: !tz.equals(_timezone) -> skip, ไม่เปลี่ยน reference
        assertSame(tz1, inst.getTimeZone());
    }

    @Test
    public void testIsLenientDefaultTrue() {
        assertTrue(new StdDateFormat().isLenient());
    }

    @Test
    public void testSetLenientDoesNotAffectIsLenient() {
        // setLenient() ที่ inherit จาก DateFormat ไม่ได้แก้ _lenient field ภายใน
        // ดังนั้น isLenient() ยังคง true เสมอตราบใดที่สร้างผ่าน public API
        // (พฤติกรรมปัจจุบันของซอร์ส ไม่ใช่การเดา)
        StdDateFormat inst = new StdDateFormat();
        inst.setLenient(false);
        assertTrue(inst.isLenient());
    }

    @Test
    public void testToStringWithoutTimeZone() {
        String s = new StdDateFormat().toString();
        assertFalse(s.contains("timezone:"));
        assertTrue(s.contains("(locale: " + Locale.US.toString() + ")"));
    }

    @Test
    public void testToStringWithTimeZone() {
        StdDateFormat inst = new StdDateFormat();
        inst.setTimeZone(TimeZone.getTimeZone("UTC"));
        String s = inst.toString();
        assertTrue(s.contains("(timezone:"));
    }
}
