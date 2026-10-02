package com.google.gson.internal.bind.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;

public class ISO8601UtilsTest {

    /** Helper: สร้าง Date จากค่า wall-clock ใน timezone UTC */
    private Date utcDate(int year, int month, int day, int hour, int min, int sec, int ms) {
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        c.clear();
        c.set(year, month - 1, day, hour, min, sec);
        c.set(Calendar.MILLISECOND, ms);
        return c.getTime();
    }

    // =========================================================
    // format() - ครอบคลุม millis true/false, offset==0 / !=0,
    // offset positive/negative, padding
    // =========================================================

    @Test
    public void testFormat_default_NoMillis_UTC_offsetZero() {
        Date date = utcDate(2018, 6, 25, 10, 15, 30, 0);
        String result = ISO8601Utils.format(date); // millis=false, tz=UTC
        assertEquals("2018-06-25T10:15:30Z", result);
    }

    @Test
    public void testFormat_withMillisTrue_UTC() {
        Date date = utcDate(2018, 6, 25, 10, 15, 30, 123);
        String result = ISO8601Utils.format(date, true);
        assertEquals("2018-06-25T10:15:30.123Z", result);
    }

    @Test
    public void testFormat_customTimeZone_positiveOffset() {
        Date date = utcDate(2018, 6, 25, 10, 15, 30, 0);
        TimeZone tz = TimeZone.getTimeZone("GMT+05:30");
        String result = ISO8601Utils.format(date, false, tz);
        // 10:15 UTC + 5:30 => 15:45 local
        assertEquals("2018-06-25T15:45:30+05:30", result);
    }

    @Test
    public void testFormat_customTimeZone_negativeOffset() {
        Date date = utcDate(2018, 6, 25, 10, 15, 30, 0);
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        String result = ISO8601Utils.format(date, false, tz);
        // 10:15 UTC - 5:00 => 05:15 local
        assertEquals("2018-06-25T05:15:30-05:00", result);
    }

    @Test
    public void testFormat_paddingOfSmallValues() {
        // ปีที่มีค่าน้อย/หลักเดียว เพื่อทดสอบ padInt zero-padding
        Date date = utcDate(1, 1, 1, 1, 1, 1, 1);
        String result = ISO8601Utils.format(date, true);
        assertTrue("รูปแบบต้องถูก pad ให้ครบหลัก",
                result.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z"));
    }

    // =========================================================
    // parse() - success cases: ครอบคลุมทุกสาขาหลักของ if/else
    // =========================================================

    @Test
    public void testParse_dateOnly_withDashes() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25", pos);
        Calendar expected = new GregorianCalendar(2018, Calendar.JUNE, 25);
        assertEquals(expected.getTime(), date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParse_dateOnly_withoutDashes() throws ParseException {
        // ครอบคลุม checkOffset('-') == false (ทั้ง 2 ครั้ง)
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("20180625", pos);
        Calendar expected = new GregorianCalendar(2018, Calendar.JUNE, 25);
        assertEquals(expected.getTime(), date);
        assertEquals(8, pos.getIndex());
    }

    @Test
    public void testParse_dateTime_noSeconds_withZuluTZ() throws ParseException {
        // hasT == true, ไม่มี seconds, timezoneIndicator == 'Z'
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 0);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_dateTime_withSeconds_withZuluTZ() throws ParseException {
        // date.length() > offset == true, c เป็น digit (ไม่ใช่ Z/+/-)
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_leapSecondTruncation() throws ParseException {
        // seconds > 59 && seconds < 63 -> truncate to 59
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:61Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 59);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_millis_threeDigits() throws ParseException {
        // switch-case default (3 digits parsed)
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30.123Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        expected.set(Calendar.MILLISECOND, 123);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_millis_twoDigits() throws ParseException {
        // switch-case 2: milliseconds = fraction * 10
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30.12Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        expected.set(Calendar.MILLISECOND, 120);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_millis_oneDigit() throws ParseException {
        // switch-case 1: milliseconds = fraction * 100
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30.1Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        expected.set(Calendar.MILLISECOND, 100);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timeWithoutColonSeparators() throws ParseException {
        // checkOffset(':') == false ระหว่าง hour:minute และ minute:second
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T1015Z", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 0);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_noSeconds_thenPlusOffsetTimezone() throws ParseException {
        // c == '+' -> ข้าม seconds parsing (แยกจากกรณี c=='Z')
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15+02:00", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 0);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timezone_plus0000() throws ParseException {
        // "+0000".equals(timezoneOffset) == true
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30+0000", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timezone_plus00colon00() throws ParseException {
        // "+00:00".equals(timezoneOffset) == true
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30+00:00", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timezone_customOffset_withColon() throws ParseException {
        // act.equals(timezoneId) == true (มี colon ตรงกันทันที)
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30+02:00", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timezone_customOffset_withoutColon() throws ParseException {
        // act.equals(timezoneId) == false, แต่ cleaned.equals(timezoneId) == true
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30+0200", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    @Test
    public void testParse_timezone_negativeOffset() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2018-06-25T10:15:30-05:00", pos);
        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT-05:00"));
        expected.clear();
        expected.set(2018, Calendar.JUNE, 25, 10, 15, 30);
        assertEquals(expected.getTime(), date);
    }

    // =========================================================
    // parse() - error / exception paths
    // =========================================================

    @Test(expected = ParseException.class)
    public void testParse_noTimeZoneIndicator() throws ParseException {
        // date.length() <= offset -> IllegalArgumentException("No time zone indicator")
        ISO8601Utils.parse("2018-06-25T10:15:30", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_noSecondsNoTimezone() throws ParseException {
        // date.length() > offset == false (ไม่มี seconds เลย) แล้วตามด้วยไม่มี timezone
        ISO8601Utils.parse("2018-06-25T10:15", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidTimeZoneIndicator() throws ParseException {
        // else -> IndexOutOfBoundsException("Invalid time zone indicator ...")
        ISO8601Utils.parse("2018-06-25T10:15:30X", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_mismatchingTimeZone() throws ParseException {
        // cleaned.equals(timezoneId) == false -> IndexOutOfBoundsException("Mismatching...")
        // NOTE: พึ่งพา behavior ของ TimeZone.getTimeZone คืนค่า fallback "GMT" เมื่อ offset ไม่ valid (25:99)
        ISO8601Utils.parse("2018-06-25T10:15:30+25:99", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_malformed_afterT_missingTimeDigits() throws ParseException {
        // hasT == true แต่ไม่มีตัวเลขตามมา -> NumberFormatException จาก parseInt (bounds check)
        ISO8601Utils.parse("2018-06-25T", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidNumberFormat_nonDigitYear() throws ParseException {
        // digit(...) < 0 -> NumberFormatException("Invalid number: ...")
        ISO8601Utils.parse("abcd-06-25", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_emptyString_triggersEmptyMessageBranch() throws ParseException {
        // parseInt เกิด NumberFormatException(value) ด้วย value="" (message ว่าง)
        // -> เข้าเงื่อนไข msg==null||msg.isEmpty() ในการสร้าง ParseException
        ISO8601Utils.parse("", new ParsePosition(0));
    }

    @Test(expected = NullPointerException.class)
    public void testParse_nullDate_propagatesNPE() throws ParseException {
        // หมายเหตุ: NullPointerException ไม่ถูก catch โดย parse()
        // (เฉพาะ IndexOutOfBoundsException/NumberFormatException/IllegalArgumentException เท่านั้น)
        // จึงหลุดออกไปโดยตรง ไม่ถูกแปลงเป็น ParseException - นี่คือ behavior จริงของซอร์สที่ให้มา
        ISO8601Utils.parse(null, new ParsePosition(0));
    }

    @Test
    public void testParse_exceptionMessage_containsOriginalInput() {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("2018-06-25T10:15:30X", pos);
            fail("คาดหวังว่าจะเกิด ParseException");
        } catch (ParseException e) {
            // ตรวจสอบว่า message มีข้อความ input เดิมปรากฏอยู่
            assertTrue(e.getMessage().contains("2018-06-25T10:15:30X"));
        }
    }
}
